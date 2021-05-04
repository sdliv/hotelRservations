JFLAGS = -g
JC = javac
.SUFFIXES: .java .class
.java.class:
	$(JC) $(JFLAGS) $*.java

CLASSES = \
	client/customer/CustomerClient.java \
	common/users/Administrator.java \
	common/users/Customer.java \
	common/users/Employee.java \
	common/users/Person.java \
	common/interfaces/IReservation.java \
	common/interfaces/ILogin.java \
	common/roles/Admin.java \
	common/roles/CUser.java \
	common/roles/PowerUser.java \
	common/roles/Role.java \
	common/Hotel.java \
	common/Room.java \
	common/views/AdminView.java \
	common/views/CustomerView.java \
	common/views/EmployeeView.java \
	common/views/ErrorView.java \
	common/views/UserView.java \
	common/controllers/CustomerController.java \
	common/controllers/AdminController.java \
	common/controllers/Controller.java \
	common/controllers/EmployerController.java \
	common/factories/IReturnView.java \
	common/factories/ReturnViewFactory.java \
	common/operations/CancelReservationOperation.java \
	common/operations/HotelOperation.java \
	common/operations/HotelOperationExecutor.java \
	common/operations/LoginOperation.java \
	common/operations/ReserveOperation.java \
	common/reservation/CustomerReservation.java \
	common/reservation/CustomerReservationBuilder.java \
	common/reservation/Reservation.java \
	common/reservation/ReservationBuilder.java \
	hotel/RemoteOperation.java \
	hotel/LoginImpl.java \
	hotel/ReservationImpl.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class