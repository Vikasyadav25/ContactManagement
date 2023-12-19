# Contact Management
I am going to design an API for the Contact Management. 
## How to Use

1. Clone or download this repository to your local machine.
2. git clone https://github.com/Vikasyadav25/ContactManagement
3. change the id , password and database name in application.property file as your mysql credential.
   
#### spring.datasource.url=jdbc:mysql://localhost:3306/project1

#### spring.datasource.username=root

#### spring.datasource.password=Vikasyadav6@

4. Now run the server. 

# Task
####  Theme:
Develop the REST API endpoints for a simple Contact Management System. The 
following are the functionalities of the system: 
##### -  1 As a user, I should be able to create a contact with the following data 
- Name (mandatory) 
- Phone Number (mandatory, unique) 
- Address 
- Email 
##### - 2 As a user I should be able to see all contacts created
##### -  3 As a user I should be able to delete a specific contact 

## - Required Routes
- http://localhost:8089/contact → to get the list
- http://localhost:8089/addContact→ to add contact
- http://localhost:8089/updateContact/1-> to update the record
- http://localhost:8089/deleteContact/1-> to delete the record


Image -: 
1) http://localhost:8089/contact
<img width="784" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/a814a749-7e52-4b65-843a-997d4ec41b54">


2) http://localhost:8089/addContact
<img width="839" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/95e29efb-46d5-4304-a8fb-0180dad991d4">

##### -----getting the added record

<img width="800" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/d0e0c900-bc32-410e-8f76-b0c584b54f3c">


3) http://localhost:8089/updateContact/1
<img width="836" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/68defb8d-09a6-4b65-bfc5-e3dccea9e4d5">

   
4) http://localhost:8089/delectContact/3
<img width="850" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/9e6c07be-1fc0-444d-87c9-406377ec5e21">

##### ---deleted added records

<img width="784" alt="image" src="https://github.com/Vikasyadav25/ContactManagement/assets/91658308/a814a749-7e52-4b65-843a-997d4ec41b54">

## Author
Vikas Yadav
