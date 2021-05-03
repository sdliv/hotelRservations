# General Description

All the files contained in this project are skeletal versions.  Both source code and compiled versions are present.  

UPDATE APRIL 19, 2021: Numerous Interfaces and Classes have been added to extend functionality.  New packages have been created for better organization. The Makefile has been modified to support linux only.  
  
UPDATE MAY 3, 2021: Command, Template, and Factory design Patterns have been implemented with necessary classes. See below for their implementations.  

OUTLINE OF HOW AUTHORIZATION FLOW WORKS:  
UPDATE:   
- Login now uses the *Command* Pattern in conjunction with the Front Controller  
- Reservation is built using the *Template* Pattern to create a reservation.  
- Returning the Correct User View now uses the Factory method to determine which view to return.

1. CustomerClient creates an instance of a subclass of Person, such as Administrator, Customer, or Employee, which requires a role to be assigned to the instance upon instantiation.  One of each type of subclass has been created.  
2. Each attempts to login(Person user); the LoginImpl acts as a FrontController by calling user.getRole() to check the user's Role Type;  
3. Based on the user's role type, the login controller creates the appropriate Controller class, and then calls the Controllers' returnView() function.  
4. If a user has no role, the ErrorView is returned by default.
5. LoginImpl, which runs on the server, then returns to the CustomerClient the appropriate view based on the user's role Type.  
6. Customer can now select a room and create a Reservation

# Folders: Classes and Interface files related to the codebase
client.customer: *CustomerClient*  
common.controllers: *AdminController*, *Controller*, *CustomerController*, *EmployeeController*  
common.factories: *IReturnView*, *ReturnViewFactory*  
common.interfaces: *ILogin*, *IReservation*  
common.operations: *CancelReservationOperation*, *HotelOperation*, *HotelOperationExecutor*, *LoginOperation*, *ReserveOperation*  
common.roles: *Admin*, *CUser*, *PowerUser*, *Role*  
common.reservation: *CustomerReservation*, *CustomerReservationBuilder*, *Reservation*, *ReservationBuilder*  
common.users: *Administrator*, *Customer*, *Employee*, *Person*  
common.views: *AdminView*, *CustomerView*, *EmployeeView*, *ErrorView*, *UserView*  
common: *Room*, *Hotel*  
hotel: *LoginImpl*, *RemoteOperation*, *ReservationImpl*

# Additional Files:
*Hotel.jar*, *HotelUMLDiagram.png*, *Makefile*, *RMI-Demonstration.png*

# About RMI-Demonstration.png:
Shows RMI demonstration of .jar file from two separate locations.

# About Makefile:
Makefile can be used to compile the entire project.  Simply run 'make' while in the same directory as Makefile:
```bash
make
```
or ```make LinuxMakeFile``` for linux.

UPDATE: use the 'src' folder in order to run ```make```to compile on tesla.

# Execute Hotel.jar
UPDATED NOTE: Hotel.jar will not work on Tesla because my computer is running an updated version of java.  Tesla's version of java needs to be updated. Therefore, use the ```make``` method to compile and run on tesla.

Note: Default main() in jar file contains a static variable of type Registry that has LocateRegistry.createRegistry(4590) as its value.  
Note: running the Hotel.jar should start the RMI Registry by default.  
To perform example of RMI execution do the following:  

Start the server:
```bash
java -jar Hotel.java
```

Then open up another terminal and type the command to send communication via RMI:  
```bash
java -cp Hotel.jar client.customer.CustomerClient
```

