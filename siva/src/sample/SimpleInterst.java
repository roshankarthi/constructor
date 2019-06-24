package sample;

public class SimpleInterst {

	  int priniciple;
	  int no_of_year;
	  int rate;
	  
	public SimpleInterst(int priniciple, int no_of_year, int rate) {
		// TODO Auto-generated constructor stub
		this.priniciple = priniciple;
		this.no_of_year = no_of_year;
		this.rate = rate;
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterst s1 = new SimpleInterst(5000,5,2);
		s1.simpleinterst();

	}
	void simpleinterst() {
		float simpleinterst = priniciple*no_of_year*rate/100;
		System.out.println("the simple interst"+simpleinterst);
	}

}
