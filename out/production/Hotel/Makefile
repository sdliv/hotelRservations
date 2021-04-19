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
	common/interfaces/IReturnView.java \
	common/interfaces/IView.java \
	common/roles/Admin.java \
	common/roles/CUser.java \
	common/roles/PowerUser.java \
	common/roles/Role.java \
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
	hotel/RemoteOperation.java \
	hotel/LoginImpl.java \
	hotel/ReservationImpl.java

default: classes

classes: $(CLASSES:.java=.class)

clean:
	$(RM) *.class