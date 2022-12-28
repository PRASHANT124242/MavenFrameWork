package encapsulation;

public class Differentclass {

	public static void main(String[] args) {

       EmpData emp=new EmpData();
		
		emp.setName("Ketan");
		emp.setAge(34);
		emp.setRollno(1235);
		emp.setSal(100000);
		
		System.out.println("employee name:"+emp.getName());
		System.out.println("employee Rollno:"+emp.getRollno());
		System.out.println("employee Sal:"+emp.getSal());
		System.out.println("employee Age:"+emp.getAge());

	}

}
