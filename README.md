# TaskManagementSystem-
Simple Spring Boot CRUD application for managing books
# Book Management System (Spring Boot CRUD)

A simple Spring Boot application that provides CRUD APIs for managing books.

## Features
- Add a book
- Get book by ID
- Get all available books
- Mark a book as unavailable

## Tech Stack
- Java
- Spring Boot
- Spring Data JPA
- H2 / MySQL

## API Endpoints

| Method | Endpoint | Description |
|------|---------|------------|
| POST | /books | Add a new book |
| GET | /books/{id} | Get book by ID |
| GET | /books/available | Get all available books |
| PUT | /books/{id}/unavailable | Mark book as unavailable |

## How to Run
1. Clone the repository
2. Open in IntelliJ / Eclipse
3. Run `BookManagementApplication`
4. Test APIs using Postman
