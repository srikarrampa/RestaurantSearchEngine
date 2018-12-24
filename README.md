# RestaurantSearchEngine

## Tools and Technologies Used

1) Amazon RDS
2) SpringBoot
3) Spring Tool Suite
4) Postman

# Tables:

User table: Id , name, user type id\
User types: user ,admin\
User Type Link table\
Cusine: user table id , id name , when was it updated, description, cuisine created date\
Cusine user Link Table\
Restaurant: location, id ,name, update, cusine id, created by, created time\
Restaurant and cusine Link Table\
Restauarnt user Link Table\
Reviews table: review id, reviews description\
Reviews user Link Table\
Ratings table: rating id, ratings description, rating created by, rating created date \
Restaurant Rating Link Table\
Range: range id, range level, range description, range created by, range created date\
Restaurant Range Link Table\
Dish: dish id, dish description\
Dish Cusine Link Table\
Dish Restaurant Link Table


### Each package consists of 4 classes

1) Attributes Class - consists of the columns in the database
2) Controller Class -  controlling the flow based on the requests
3) Service Class - Performing the required function (get, post, put , delete)
4) Repository Class - user-defined functions or pre-defined classes


## Requests can made using by connecting to the port 8083(can be changed in applications.properties file under resources). Postman can be used for testing the API.