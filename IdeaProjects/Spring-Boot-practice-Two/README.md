# Spring Boot Practice - Pet

A simple Spring Boot practice project for managing pets.

## 🐾 Pet

The project contains one main entity:

* `id`
* `name`
* `type`
* `age`
* `ownerName`

## Features

* Create a Pet
* Get all Pets
* Get Pet by ID
* Update a Pet
* Delete a Pet

## Technologies

* Java
* Spring Boot
* Maven
* Lombok

## Project Structure

```text
src/main/java/com/cl/demo

├── controllers
├── entities
├── requestobjects
├── responseobjects
├── services
└── utils
```

## API Endpoints

| Method | Endpoint     | Description   |
| ------ | ------------ | ------------- |
| POST   | `/pets`      | Create a pet  |
| GET    | `/pets`      | Get all pets  |
| GET    | `/pets/{id}` | Get pet by ID |
| PUT    | `/pets/{id}` | Update a pet  |
| DELETE | `/pets/{id}` | Delete a pet  |

## Purpose

This project is created to practice Spring Boot CRUD operations and the Controller → Service → Entity structure.
