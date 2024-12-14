public class Person {
	String name;
	int age;
	String gender;
	
	public Person(String name ,int age,	String gender){
		this.name=name;
		this.age=age;
		this.gender;
		
	}
	public void showInfo(){
		system.out.print("NAme="+name);
		system.out.print("Age="+age);
		system.out.print("Gender="+gender);
	}
	
	public class Employe extends Person{
		int id;
		float salary;
		String companyName;
		
		public Employe(String name,int age,String gender,int id,float salary,String companyName){
			super(name,age,gender);
			this.id=id;
			this.salary=salary;
			this.companyName=companyName;
		}
		public void showInfo2(){
			super();
		system.out.print("Id="+id);
		system.out.print("salary="+salary);
		system.out.print("CompanyName="+CompanyName);
		}
			
			
		
		
		public class Teat(){
			public void main(String[]args){
				Person e1=new Parson("Emran",23,"gender");
				
				Employe e1=new Employe("Rakib",25,"male",2376,34000,"Eastindia");
				e1.showInfo1();
				e1.showInfo();
				
			}
		}