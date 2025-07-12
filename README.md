# 📚 Library Catalog REST API – Spring Boot Project

A simple Java-based RESTful API using **Spring Boot** to manage a library’s book catalog.

---

## 🚀 Features

- Add a new book
- View all books
- Get book by ID
- Delete a book
- Update availability status of a book
- Input validation (title, author, ISBN)

---

## 🛠️ Tech Stack

- Java 17
- Spring Boot
- RESTful APIs
- In-memory data store (`HashMap`)
- Postman for testing

---

## ▶️ How to Run the Project

### 1. Clone the repository:
```bash
git clone https://github.com/your-username/library-catalog.git
cd library-catalog


Build and Run the Spring Boot App:
./mvnw spring-boot:run

Or run from your IDE (IntelliJ / Eclipse) using CatalogApplication.java.

The app will run on:
📍 http://localhost:8088
```

### API Endpoints

* Add a Book
POST
{
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "1234567890"
}
{
  "title": "Clean Code",
  "author": "Robert C. Martin",
  "isbn": "9876543210"
}

* Get All Books
GET 
  {
    "id": 1,
    "title": "The Alchemist",
    "author": "Paulo Coelho",
    "isbn": "1234567890",
    "available": true
  },

* Get Book by ID
GET
{
  "id": 1,
  "title": "The Alchemist",
  "author": "Paulo Coelho",
  "isbn": "1234567890",
  "available": true
}

* Delete a Book
DELETE
Deleted

* Update Book Availability
PUT 
Updated

