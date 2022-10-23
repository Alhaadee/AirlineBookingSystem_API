# Airline API

An API created to manage fictional flights and passengers in a booking system. 

## Setup

* Create a postgresql database called: `airline_lab`
* Add your Postgres Username and Password to the `application Properties` file
* Run the Application and send requests through Postman


## Endpoints

| Type  | Request Path                                                  | Description                       |
|-------|---------------------------------------------------------------|-----------------------------------|
| POST  | localhost:8080/flights                                        | create new flight                 |
| GET   | localhost:8080/flights                                        | Display all flights               |
| GET   | localhost:8080/flights/{flight}                               | Display Specified flight by ID    |
| PATCH | localhost:8080/flights/{Flight Id}?passengerId={Passenger ID} | Book Passenger on to flight       |
| POST  | localhost:8080/passengers                                     | Create new Passenger              |
| GET   | localhost:8080/passengers                                     | Display all passengers            |
| GET   | localhost:8080/passengers                                     | Display specified Passenger by ID |



**Passenger Request Body:**
```
{
    "name":"jake",
    "phoneNumber":"01923325"
}
```

**Flight Request Body:**
```
{
    "destination":"Istanbul",
    "capacity":100,
    "departureDate":"23/09/22",
    "departureTime":"12:00"
}
```
