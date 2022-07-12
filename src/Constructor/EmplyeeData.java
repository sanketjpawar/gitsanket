package Constructor;

public class EmplyeeData {

	public static void main(String[] args) {
		
		Employee Sanket = new Employee();    // Value assigned to global variables declared in Employee class. 
		Sanket.id_no = 1155;
		Sanket.Employee_Name = "Sanket Pawar";
		Sanket.Gender = 'M';
		Sanket.Contact_no = 9834455269l;
		Sanket.Dept = "BPme";
		Sanket.Date = "04/01/2021";
		
		Employee Akshay = new Employee();
		Akshay.id_no = 1157;
		Akshay.Employee_Name = "Akshay Shintre";
		Akshay.Gender = 'M';
		Akshay.Contact_no = 9563416392l;
		Akshay.Dept = "BPme";
		Akshay.Date ="15/02/2021";
		
		Employee Abhi = new Employee();
		Abhi.id_no = 1158;
		Abhi.Employee_Name = "Abhijit Deshmukh";
		Abhi.Gender = 'M';
		Abhi.Contact_no = 7798323494l;
		Abhi.Dept = "CCS";
		Abhi.Date = "19/12/2020";
		
		Employee Mansi = new Employee();
		Mansi.id_no = 1158;
		Mansi.Employee_Name = "Mansi Chaudhari";
		Mansi.Gender = 'F';
		Mansi.Contact_no = 9481234323l;
		Mansi.Dept = "CCS";
		Mansi.Date = "13/03/2021";
		
		Sanket.Employee_Info();        // called non static method from another class
		Akshay.Employee_Info();
		Abhi.Employee_Info();
		Mansi.Employee_Info();

	}

}
