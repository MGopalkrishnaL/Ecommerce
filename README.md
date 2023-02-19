# Project : Ecommerces Project

## Frameworks and languages used
* SpringBoot
* Java

## Data flow in the project
1. Controller (getbyId(),getall(),getorderbyusingId(),placeOrder(),addProduct(),getBasedOnQuary(),deleteProduct()).
2. Services   (getall(),addAddress(),getById(),getByOrderId(),addOrder(),deletebyId(),getByUsingQuary(),addproduct()).
3. Repository ( We extend the JPA repository to get the predefined function).
4. DataBase Design (In this we have Used H2-DB (which is a in memory database)).


## Data Structure Used in Project
* ArrayList
## Project Summary
Ecommerces is project where We used to store the data of User,Product,Address,Order in a H2 Database.
In this project we had used MVC(Model View Controller) Design.
* When ever we click on the link the action takes place in the Contoller.
* Then it goes to Service layer to perform some business operation and according to the request we had given it will perform.
* Then it goes to the dao layer which is known as Repository layer to store and manipulate the date of user.

## API's
### User
#### Get : fetch data
* Get All Users 
```
http://localhost:8080/api/Ecommerces/User/getAll
```
* Get User by their Id :- required Id in integer format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/Ecommerces/User/getuser/{userId}
```
#### Post : add data
* Add User
```
http://localhost:8080/api/Ecommerces/User/addUser
```
#### Delete : delete data
* Delete User by their Id :- required Id in integer format.
```http
http://localhost:8080/api/Ecommerces/User/deleteUser/{userId}
```
#### Put : Update data
* Update Student by their Id :- required Id in integer format.
* we need to provide the param of UserId 
```http
http://localhost:8080/api/Ecommerces/User/updateUser/{userId}
```
#### The above Links are used to perform operation on the User.

### Address
#### Get : fetch data
* Get Address by their Id :- required Id in integer format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/Ecommerces/address/getaddresbyId/{AddressId}
```
#### Post : add data
* Add Address
```
http://localhost:8080/api/Ecommerces/address/addAddress
```
#### The above Links are used to perform operation on the Address.

### Order
#### Get : fetch data
* Get All Orders 
```
http://localhost:8080/api/Ecommerces/order/getAll
```
* Get Order by their Id :- required Id in integer format.
* it is Path variable so we just provide the value in the path. 
```
http://localhost:8080/api/Ecommerces/order/getOrderbyId/{orderId}
```
#### Post : add data
* Placing a Order
* In this we need to pass userId,ProductId and AddressId.
```
http://localhost:8080/api/Ecommerces/order/PlaceOrder
```
#### The above Links are used to perform operation on the Order.

### Product
#### Get : fetch data
* Get All Products
```
http://localhost:8080/api/Ecommerces/product/getAll
```
* Get Order by their price :- required Id in integer format.
* Get Order by their Brand Name:- requires name in String formate.
* it is a quary parem so we need to give in params method 
```
http://localhost:8080/api/Ecommerces/product/getListOfProductsByParams
```
#### Post : add data
* Add Product
```
http://localhost:8080/api/Ecommerces/product/addProduct
```
#### Delete : delete data
* Delete User by their Id :- required Id in integer format.
```http
http://localhost:8080/api/Ecommerces/product/deleteProduct/{id}
```
#### The above Links are used to perform CRUD operation on the User.
