
---

# Spring Data JPA Projesi

---

## English

### About

This project is a Spring Data JPA application using PostgreSQL as the database. It implements a layered architecture with DTOs for entities such as Home, Student, Employee, Address, and Customer. The project demonstrates basic CRUD operations, custom queries with @Query, validation with global exception handling, and scheduled tasks. Configuration is managed via application.properties and custom config classes.

### Features

- **Layered Architecture:** Separation of concerns with Controller, Service, Repository layers.
- **DTO Usage:** Data Transfer Objects for Home, Student, Employee, Address, and Customer entities.
- **Exception Handling:** Global exception handler with detailed error responses for validation and custom exceptions.
- **Scheduled Tasks:** Using Spring's @Scheduled for background jobs.
- **CRUD Operations:** POST, GET, PUT, DELETE operations with Spring Data JPA.
- **Validation:** Spring Validation with detailed error messages for invalid inputs.
- **Custom Queries:** Use of @Query annotation for custom JPQL/native queries.
- **Configuration:** Managed via application.properties and custom configuration classes for data source and global properties.

### Technologies

- **Language:** Java
- **Framework:** Spring Boot, Spring Data JPA
- **Database:** PostgreSQL
- **Build Tool:** Maven
- **Other:** Lombok, Spring Validation, Spring Scheduling

### Usage

Clone the project.
Configure application.properties for your PostgreSQL database.
Run the Spring Boot application.
Use REST clients like Postman to test API endpoints.
Errors and validation failures will return standardized JSON responses with detailed info.

### License

This project is licensed under the MIT License.

---

## Türkçe

### Hakkında

Bu proje, PostgreSQL veritabanı kullanan Spring Data JPA tabanlı bir uygulamadır. Home, Student, Employee, Address ve Customer gibi varlıklar için DTO yapıları ile katmanlı mimari uygulanmıştır. Projede temel CRUD işlemleri, @Query ile özel sorgular, validasyon ve global exception yönetimi, ayrıca zamanlanmış görevler (@Scheduled) bulunmaktadır. Konfigürasyonlar application.properties ve özel konfigürasyon sınıflarıyla yönetilmektedir.

### Özellikler

- **Katmanlı Mimari:** Controller, Service ve Repository katmanları ile sorumluluk ayrımı.
- **DTO Kullanımı:** Home, Student, Employee, Address ve Customer için veri transfer objeleri.
- **Hata Yönetimi:** Global exception handler ile validasyon ve özel hata mesajlarının detaylı dönülmesi.
- **Zamanlanmış Görevler:** Spring @Scheduled kullanımı ile arka plan görevleri.
- **CRUD İşlemleri:** POST, GET, PUT, DELETE işlemleri Spring Data JPA ile.
- **Validasyon:** Spring Validation ile giriş kontrolleri ve detaylı hata mesajları.
- **Özel Sorgular:** @Query anotasyonu ile JPQL veya native sorgular.
- **Konfigürasyon:** application.properties ve özel config sınıfları ile yapılandırma.

### Teknolojiler

- **Dil:** Java
- **Framework:** Spring Boot, Spring Data JPA
- **Veritabanı:** PostgreSQL
- **Proje Yönetimi:** Maven
- **Diğer:** Lombok, Spring Validation, Spring Scheduling

### Kullanım

Projeyi klonlayın.
application.properties dosyasını PostgreSQL bağlantınıza göre düzenleyin.
Spring Boot uygulamasını başlatın.
Postman gibi REST istemcileriyle API endpoint’lerini test edin.
Hata ve validasyon durumlarında detaylı ve standart JSON hata cevapları alacaksınız.

### Lisans

Bu proje MIT Lisansı ile lisanslanmıştır.

---