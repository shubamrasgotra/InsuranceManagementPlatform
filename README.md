# InsuranceManagementPlatform1
An insurance management platform that allows users to manage insurance policies, clients, and claims using Spring Boot and Java
Insurance API with Spring
This is a RESTful API built with Spring Boot that allows you to manage insurance policies, clients, and claims. It includes basic CRUD operations and uses an embedded database (H2) for data persistence.

Getting Started
To get started, clone the repository and import it into your favorite IDE. Then, run the application and test the APIs using a tool like Postman or cURL.

git clone https://github.com/shubamrasgotra/insurance-api.git
cd insurance-api
mvn spring-boot:run

API Endpoints
Clients
GET /api/clients: Fetch all clients.
GET /api/clients/{id}: Fetch a specific client by ID.
POST /api/clients: Create a new client.
PUT /api/clients/{id}: Update a client's information.

DELETE /api/clients/{id}: Delete a client.
Insurance Policies
GET /api/policies: Fetch all insurance policies.
GET /api/policies/{id}: Fetch a specific insurance policy by ID.
POST /api/policies: Create a new insurance policy.
PUT /api/policies/{id}: Update an insurance policy's information.
DELETE /api/policies/{id}: Delete an insurance policy.

Claims
GET /api/claims: Fetch all claims.
GET /api/claims/{id}: Fetch a specific claim by ID.
POST /api/claims: Create a new claim.
PUT /api/claims/{id}: Update a claim's information.
DELETE /api/claims/{id}: Delete a claim

Built With
Spring Boot
Spring Data JPA
H2 Database

This application can be run with the help of POSTMAN application locallaly , the URL is https://localhost8080 and th eabove given API requests can be used.
