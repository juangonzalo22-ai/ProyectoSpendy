#  Proyecto Backend Spendy - Momento 1

###  Integrantes del Equipo
* Luisa Fernanda Echeverri Restrepo
* Juan Gonzalo Alvarez Quinchia
* Sofia Escobar
* Paula Carrión Gómez

---

###  Desarrollo
Este repositorio se basa en el **Modelo de Dominio** de la aplicación de gastos hormiga **Spendy**. El sistema está desarrollado con estándares actuales, utilizando como motores principales el framework **Spring Boot** y **Jakarta Persistence (JPA)**.

Para garantizar un crecimiento ordenado y facilitar el mantenimiento, el proyecto implementa una **arquitectura por capas**:

* **Capa de Modelos (`.modelos`):** Contiene las entidades JPA que definen la estructura de datos y las reglas de negocio esenciales. Cada clase mapea directamente a las tablas de la base de datos.
* **Capa de Repositorios (`.repositorios`):** Actúa como el puente de persistencia. Utiliza interfaces que heredan de `JpaRepository`, permitiendo operaciones de base de datos eficientes y seguras de forma abstracta.



---

### Modelo de Dominio (Entidades Principales)
A continuación se detallan las 5 entidades que conforman el **"Contrato de Datos"** de la aplicación:

| Entidad | Descripción Técnica | Atributos Clave |
| :--- | :--- | :--- |
| **Usuario** | Datos de perfil y contacto del cliente. | `id`, `nombres`, `nroDocumento`, `edad`. |
| **Gasto** | Registro detallado de cada transacción económica. | `valor`, `fecha`, `categoria`, `comercio`. |
| **Categoria** | Clasificación de gastos y gestión de presupuestos. | `nombre`, `topeMensual`, `tipoGasto`. |
| **Comercio** | Información de los establecimientos donde se gasta. | `nit`, `nombre`, `actividad`, `esFrecuente`. |
| **MedioPago** | Fuente de dinero para realizar los pagos. | `nombre`, `franquicia`, `cuentaEncriptada`. 

###   Configuración del Entorno

* **Java:** 21
* **Framework:** Spring Boot 4.0.3
* **Base de Datos:** H2 (En memoria para desarrollo)
* **Puerto de ejecución:** 8080