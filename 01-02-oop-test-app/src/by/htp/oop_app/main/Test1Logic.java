package by.htp.oop_app.main;

public class Test1Logic {
	
	public int sum(Test1 t1) {
		int sum = t1.getVariableX() + t1.getVariableY();
 		return sum;
 	}
	
	public int max(Test1 t1) {
		int max = Math.max(t1.getVariableX(), t1.getVariableY());
 		return max;
 	}
}
