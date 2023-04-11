# Crud_Lover_JAVA
  <div align='center'>
    <img height="240px" src="https://em-content.zobj.net/source/microsoft-teams/337/automobile_1f697.png">
  </div>
  
<p align = "center">
   <img src="https://img.shields.io/badge/author-NinaS23-4dae71?style=flat-square" />
</p>
  
<div align="center">
  <h3>Build With</h3>
  <img src="https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=java&logoColor=white" height="30px"/>
  <img src="https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white" height="30px"/>
</div>

#  features developed 
- [x] use Validation I/O at car model
- [X] GET all the cars
- [X] POST a car 
- [X] DELETE a car by id
- [X] GET a car by id
- [X] UPDATE a car by id

# about the project
a project based on another project on my github, which is: [cars_api_java](https://github.com/NinaS23/Cars_Api_Java) and [ModelaAí](https://github.com/NinaS23/ModelaAi_JAVA), I chose to make it it separately for educational purposes.
The goal of this part of the project was to create the services folder and use controllers to send http status and communicate with services and services to communicate with the repository.
In this part of the project I used the Validation I/O to validate the Car model.

# Getting Started
To clone the project, run the following command:

```git
git clone https://github.com/NinaS23/Crud_Lover_JAVA.git
```
Then navigate to the project file in ApiApplication.java and:

```git
run the project
```

<!-- REQUESTS -->
### &nbsp; ☰ &nbsp; Request

the url used is 
```git
 http://localhost:8080/api/cars
 ```

###### Body _`POST`_

```json
{
  "modelo": "Fiat Argo 1.3",
  "fabricante": "Fiat",
  "dataFabricacao": "2006-10-02",
  "valor": 10.000,
  "anoModelo": 2023
}
```

###### request _`GET`_
just need to use this url after a POST 
```git
 http://localhost:8080/api/cars
 ```

###### request _`GET by id`_
replace the id in this url with the id of the car you want to get
```git
 http://localhost:8080/api/cars/{id}
 ```


###### request _`DELETE`_
replace the id in this url with the id of the car you want to delete
```git
 http://localhost:8080/api/cars/{id}
 ```
###### request _`UPDATE`_
replace the id in this url with the id of the car you want to update
```git
 http://localhost:8080/api/cars/{id}
 ```
