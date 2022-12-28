package encapsulation;

public class EmpData {

	private String name;
	private int age;
	private int rollno;
	private int sal;
	
	
public static void main(String[] args) {
		
		EmpData emp=new EmpData();
		
		emp.setName("Rahul");
		emp.setAge(30);
		emp.setRollno(1242);
		emp.setSal(10000);
		
		System.out.println("employee name:"+emp.getName());
		System.out.println("employee Rollno:"+emp.getRollno());
		System.out.println("employee Sal:"+emp.getSal());
		System.out.println("employee Age:"+emp.getAge());
		
		
		
		
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}

}
