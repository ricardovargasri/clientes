# Proyecto Spring Boot - CRUD de Clientes

Este proyecto es una **prueba académica** desarrollada con Spring Boot, JPA y MySQL. Permite realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) sobre una entidad `Cliente` a través de una API REST.

## Descripción

- **Tecnologías:** Java 17, Spring Boot, Spring Data JPA, MySQL
- **Propósito:** Demostrar el funcionamiento básico de la persistencia de datos y la exposición de endpoints REST para una entidad simple.
- **Entidad principal:** `Cliente` (con campos: id, name, surname, email)

## Endpoints principales

- `GET    /api/cliente` → Listar todos los clientes
- `GET    /api/cliente/{id}` → Obtener un cliente por ID
- `POST   /api/cliente` → Crear un cliente
- `POST   /api/cliente/batch` → Crear varios clientes a la vez (enviar un array JSON)
- `PUT    /api/cliente/{id}` → Actualizar un cliente existente
- `DELETE /api/cliente/{id}` → Eliminar un cliente

## Ejemplo de uso con Postman

### Crear un cliente

- **POST** `http://localhost:8080/api/cliente`
- **Body (JSON):**

```json
{
  "name": "Juan",
  "surname": "Pérez",
  "email": "juan@email.com"
}
```

### Crear varios clientes

- **POST** `http://localhost:8080/api/cliente/batch`
- **Body (JSON):**

```json
[
  { "name": "Ana", "surname": "García", "email": "ana@email.com" },
  { "name": "Luis", "surname": "Martínez", "email": "luis@email.com" }
]
```

## Notas

- Este proyecto es solo para fines educativos y de práctica.
- La configuración de la base de datos se encuentra en `src/main/resources/application.properties`.
- Puedes modificar la entidad `Cliente` o los endpoints según tus necesidades académicas.

---

**Autor:** ricardo vargas
**Fecha:** [Año actual]
