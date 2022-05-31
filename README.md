# ProductMicroservice
This is Category-Product REST API in which users or customers can get product by name, category name, price range, etc.

One-to-Many and Many-to-One mapping in between Category, Product and Product Type.

For every Category have some Product Type and every Product Type also have some Products.

For example, Electronics is category where Laptop and TV are Product type of electronics category and Lenovo, HP, Dell are product of given Product type. 
## Technoloogies
* Java 8
* Spring Boot
* JPA
* Hibernate
* MySQL database
* Swagger

## How to Start

Open main class ProductApplication.java with SpringBootApplication annotation and start Spring Boot by run that java class.

After starting of Spring Boot oper browser or Postman and hit url which is mapping for different operation as  requirements.

If you want to get product by product name then you should use url localhost:8080/api/product/{product name}.
