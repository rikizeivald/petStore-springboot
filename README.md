# petStore-springboot
server side of project - pet srote for company playtike

Introduction:
Implement a CRUD rest api. 

Project's technologies:
• Java 11
• Maven 3.6.0
• Spring Boot, Spring web, Spring Data Jpa
• H2database

how to run the application?
Step 1: Clone or download the code
Step 2: Open the project using your favourite IDE. I am using IntelliJ IDEA.
Step 3: Build application jar file
Step 4: Start the application: Run as Spring Boot application or Java application
Step 5: Run the SpringBootJpaH2Application

Pet rest controller implements api :

Create Pet
Post: http://localhost:8080/api/pets/createPet
Body:
{
    "age":15,
    "price":500,
    "status":"health",
    "species":"male"
}
Response :
{
    "id": 1,
    "age": 15,
    "price": 500,
    "species": "male",
    "status": "health"
}

GetPetById
Get: http://localhost:8080/api/pets/getPetById/1
Response:
{
    "id": 1,
    "age": 15,
    "price": 500,
    "species": "male",
    "status": "health"
}

GetAllPets
Get:  http://localhost:8080/api/pets/getAllPets

deleteById
Delete:http://localhost:8080/api/pets/deletePet/1

UpdatePet:
Put:http://localhost:8080/api/pets/updatePet/1
Boody:
{
    "id": 1,
    "age": 20,
    "price": 500,
    "species": "male",
    "status": "strong"
}
Response:
{
    "id": 1,
    "age": 15,
    "price": 500,
    "species": "male",
    "status": "strong"
}



