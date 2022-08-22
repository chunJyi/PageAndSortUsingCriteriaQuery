<h1 align="center">Hi , I'm Toe Chun</h1>
<h3 align="center"> Java developer from Myanmar</h3>

-  **PageAndSortUsingCriteriaQuery**

-  How to reach me **moethuchun@gmail.com**


# PageAndSortUsingCriteriaQuery

# Steps to Setup

 ### 1. Clone the Application
 
     git clone https://github.com/coma123/Spring-Boot-Blog-REST-API.git

 ### 2. Create PostgreSQL database
 
     create database jpa_testdb;
     
  .run `src/main/resources/employee.sql`
  
 ### 3. Change mysql username and password as per your installation

   open `src/main/resources/application.yml`
   
   change `spring.datasource.username and spring.datasource.password as per your PostgreSQL installation`

 ### 4.  Run the app using maven
       
     mvn spring-boot:run 
     
  The app will start running at http://localhost:8080/swagger-ui/index.html
  
  
 # Explore Rest APIs
 
 1.http://localhost:8080/swagger-ui/index.html
 
 ![](https://github.com/chunJyi/PageAndSortUsingCriteriaQuery/blob/main/src/main/resources/static/images/1.png)
 
 2.Click employee controller
 
 ![](https://github.com/chunJyi/PageAndSortUsingCriteriaQuery/blob/main/src/main/resources/static/images/employee_controller.png)
 3.Try It Out
 
 ![](https://github.com/chunJyi/PageAndSortUsingCriteriaQuery/blob/main/src/main/resources/static/images/tryItOut.png)
 4.Result
 
 ![](https://github.com/chunJyi/PageAndSortUsingCriteriaQuery/blob/main/src/main/resources/static/images/response.png)
 
