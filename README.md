# TO-DO LIST - Spring Project

## Technology Stack
- Java 15
- Spring Boot - Ver 2.5.4
- MongoDB
- Gradle

## Documentation

## Rest Endpoint:
`http://localhost:8080/api/v1`

## Todo API endpoints

**Get All Todos**
----
Returns json data with all todos.

| URL | Method | Params | Data Params | Success response | Error response|
|--|--|--|--|--|--|
|`/todos`|GET|None|None|Status 200||


**Get Todo**
----
Returns json data about a single todo.

| URL | Method | Params | Data Params | Success response | Error response|
|--|--|--|--|--|--|
|`/todos/:id`|GET|`id=[ObjectId]`|None|Status 200|Status 404|

**Create Todo**
----
Returns json data about the created todo.

| URL | Method | Params | Data Params | Success response | Error response|
|--|--|--|--|--|--|
|`/todos`|POST|None|`title=[String]`|Status 200|Status 400 |

**Update Todo**
----
Returns json data about the updated todo.

| URL | Method | Params | Data Params | Success response | Error response|
|--|--|--|--|--|--|
|`/todos/:id`|PUT|`id=[ObjectId]`|`title=[String]`|Status 200|Status 400 |


**Delete Todo**
----
Returns json data about the deleted todo.

| URL | Method | Params | Data Params | Success response | Error response|
|--|--|--|--|--|--|
|`/todos/:id`|DELETE|`id=[ObjectId]`|none|Status 200|Status 400 |
