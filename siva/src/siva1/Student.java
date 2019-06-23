package siva1;

public class Student {
    String name,address;
    int m1,m2,m3,m4,m5,total;

    
    public Student(String name, String address, int m1, int m2, int m3, int m4, int m5) {
		// TODO Auto-generated constructor stub
    	this.name = name;
    	this.address = address;
    	this.m1 = m1;
    	this.m2=m2;
    	this.m3=m3;
    	this.m4=m4;
    	this.m5=m5;
    	total = m1+m2+m3+m4+m5;
    	
    	
	}


	public Student() {
		// TODO Auto-generated constructor stub
	}


	public static void main(String[] s) {
    	Student student1 = new Student("karthi","dgl",50,51,52,53,54);
    	Student student2 = new Student("siva","mdu",25,26,27,28,29);
    	Student Student3 = new Student();
    	student1.display();
    	student2.display();
		Student3.display();
    	
    	
    	
    }
	void display()
	{
		System.out.println("the name"+name);
		System.out.println("the address"+address);
		System.out.println("the m1"+m1);
		System.out.println("the m2"+m2);
		System.out.println("the m3"+m3);
		System.out.println("the m4"+m4);
		System.out.println("the m5"+m5);
		System.out.println("the total"+total);
		
	}
}
