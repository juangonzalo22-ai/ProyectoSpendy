import { useState, useEffect } from 'react'
import './App.css'

function App() {
  // 1. Estado para el formulario con TODOS los atributos de tu clase Gasto.java
  const [gasto, setGasto] = useState({
    descripcion: '',
    fecha: '',
    valor: '',
    categoria: '',
    metodoPago: '', 
    comercio: '',   
    ubicacion: '',  
    esNecesario: false 
  });

  // 2. Estado para la lista que viene de la Base de Datos
  const [listaGastos, setListaGastos] = useState([]);

  // --- PASO A: Cargar los gastos desde Java al abrir la app ---
  useEffect(() => {
    fetch('http://localhost:8080/api/gastos')
      .then(res => res.json())
      .then(data => {
        setListaGastos(data);
      })
      .catch(err => console.error("Error cargando gastos:", err));
  }, []);

  // --- Función para capturar lo que escribes en los inputs ---
  const manejarCambio = (e) => {
    const { name, value } = e.target;
    
    // Si el cambio viene del select de "esNecesario", convertimos el texto a booleano
    const valorFinal = name === 'esNecesario' ? (value === 'true') : value;

    setGasto({
      ...gasto,
      [name]: valorFinal
    });
  };

  // --- PASO B: Guardar en la Base de Datos (POST a Java) ---
  const guardarGasto = async (e) => {
    e.preventDefault();

    try {
      const respuesta = await fetch('http://localhost:8080/api/gastos', {
        method: 'POST',
        headers: {
          'Content-Type': 'application/json'
        },
        body: JSON.stringify(gasto)
      });

      if (respuesta.ok) {
        const nuevoGastoGuardado = await respuesta.json();
        
        // Actualizamos la tabla visualmente
        setListaGastos([...listaGastos, nuevoGastoGuardado]);
        
        // LIMPIEZA: Dejamos el formulario en blanco para el siguiente registro
        setGasto({
          descripcion: '', 
          fecha: '', 
          valor: '', 
          categoria: '',
          metodoPago: '', 
          comercio: '', 
          ubicacion: '', 
          esNecesario: false
        });
        
        alert("¡Gasto guardado en la base de datos, patrón!");
      }
    } catch (error) {
      console.error("Error de conexión:", error);
      alert("Error de conexión. Revisa que el puerto 8080 esté activo en VS Code.");
    }
  };

  return (
    <div className="container">
      <header style={{ backgroundColor: '#0056b3', color: 'white', padding: '20px', borderRadius: '8px' }}>
        <h1>Spendy</h1>
        <p>Control de Gastos Hormiga - Gestión Full Stack</p>
      </header>

      {/* SECCIÓN 1: EL FORMULARIO DE REGISTRO */}
      <section className="card">
        <h2>📝 Registrar Nuevo Gasto</h2>
        <form onSubmit={guardarGasto}>
          <div className="grid">
            {/* Primera fila: Info básica */}
            <input 
              type="text" name="descripcion" placeholder="¿En qué gastaste?" 
              value={gasto.descripcion} onChange={manejarCambio} required 
            />
            <input 
              type="number" name="valor" placeholder="Valor $" 
              value={gasto.valor} onChange={manejarCambio} required 
            />
            <input 
              type="date" name="fecha" 
              value={gasto.fecha} onChange={manejarCambio} required 
            />
            
            {/* Segunda fila: Clasificación */}
            <select name="categoria" value={gasto.categoria} onChange={manejarCambio} required>
              <option value="">Categoría...</option>
              <option value="Alimentación">Alimentación</option>
              <option value="Transporte">Transporte</option>
              <option value="Antojos">Antojos</option>
              <option value="Otros">Otros</option>
            </select>

            <select name="metodoPago" value={gasto.metodoPago} onChange={manejarCambio} required>
              <option value="">Método de Pago...</option>
              <option value="Efectivo">Efectivo</option>
              <option value="Tarjeta">Tarjeta</option>
              <option value="Transferencia">Transferencia</option>
            </select>

            {/* Tercera fila: Detalles del lugar */}
            <input 
              type="text" name="comercio" placeholder="Nombre del comercio" 
              value={gasto.comercio} onChange={manejarCambio} required 
            />
            <input 
              type="text" name="ubicacion" placeholder="Ubicación (Ciudad/Lugar)" 
              value={gasto.ubicacion} onChange={manejarCambio} required 
            />

            {/* Cuarta fila: El nuevo selector de Sí/No */}
            <div style={{ display: 'flex', alignItems: 'center', gap: '10px' }}>
                <span style={{fontWeight: 'bold'}}>¿Es necesario?</span>
                <select 
                    name="esNecesario" 
                    value={gasto.esNecesario.toString()} 
                    onChange={manejarCambio} 
                    required
                >
                    <option value="true">✅ Sí, es obligatorio</option>
                    <option value="false">❌ No, es un antojo</option>
                </select>
            </div>
          </div>

          <button type="submit" style={{ marginTop: '20px', width: '100%' }}>
            Añadir a la lista y guardar
          </button>
        </form>
      </section>

      {/* SECCIÓN 2: LA TABLA DE HISTORIAL */}
      <section className="card">
        <h2>📊 Historial de Gastos</h2>
        {listaGastos.length === 0 ? (
          <p>No hay gastos registrados aún. ¡Empieza a ahorrar!</p>
        ) : (
          <div style={{ overflowX: 'auto' }}>
            <table style={{ width: '100%', borderCollapse: 'collapse' }}>
              <thead>
                <tr style={{ borderBottom: '2px solid #ddd', textAlign: 'left' }}>
                  <th>Fecha</th>
                  <th>Descripción</th>
                  <th>Comercio</th>
                  <th>Categoría</th>
                  <th>Pago</th>
                  <th>Valor</th>
                  <th>¿Necesario?</th>
                </tr>
              </thead>
              <tbody>
                {listaGastos.map((item) => (
                  <tr key={item.id} style={{ borderBottom: '1px solid #eee' }}>
                    <td>{item.fecha}</td>
                    <td>{item.descripcion}</td>
                    <td>{item.comercio}</td>
                    <td><span className="badge">{item.categoria}</span></td>
                    <td>{item.metodoPago}</td>
                    <td>${Number(item.valor).toLocaleString()}</td>
                    <td>{item.esNecesario ? '✅ Sí' : '❌ No'}</td>
                  </tr>
                ))}
              </tbody>
            </table>

            {/* Totalizador al final de la tabla */}
            <div style={{ marginTop: '20px', padding: '15px', backgroundColor: '#f8f9fa', borderRadius: '8px', textAlign: 'right' }}>
              <h3>Total Gastado: 
                <span style={{ color: '#0056b3', marginLeft: '10px' }}>
                  ${listaGastos.reduce((total, item) => total + Number(item.valor), 0).toLocaleString()}
                </span>
              </h3>
            </div>
          </div>
        )}
      </section>
    </div>
  )
}

export default App