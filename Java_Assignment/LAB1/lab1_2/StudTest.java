package lab1_2;

public class StudTest {
	public static void main(String[] args) {
		Student e = new Student();
		Student f = new Student();
		Student g = new Student();
		Student h = new Student();
		
		e.id = 111;
		e.name = "Ramesh";
		e.percentage = 38.5f;
		
		f.id = 222;
		f.name = "Suresh";
		f.percentage = 55.9f;
		
		g.id = 222;
		g.name = "Suresh";
		g.percentage = 65.8f;
		
		h.id = 222;
		h.name = "Suresh";
		h.percentage = 82.9f;
		
		e.grade_calc(e.percentage);
		f.grade_calc(f.percentage);
		g.grade_calc(g.percentage);
		h.grade_calc(h.percentage);
		
		e.print();
		f.print();
		g.print();
		h.print();
		
	}


}
