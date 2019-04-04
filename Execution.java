package newpackage;

import newpackage.Computer;
import newpackage.Method;

public class Execution {

	public static void main(String[] args) {
	
		
		//object creation of a class
		Computer refVar = new Computer();
		//class name + ref veriable = new construction 
		
		Computer refvar1 = new Computer();
		System.out.println(refvar1.disp);		
		System.out.println(refVar.year);
		Computer refVar2 = new Computer(2000);
				System.out.println(refVar2.year);
				System.out.println(Computer.keys);
		
		
		
		//Method
		
		Method method = new Method();
		
		method.getAddress();
		
		Method.getTime();
		 
		Method math = new Method();
		
		int newValue = math.calculator1(2, 5);
		System.out.println(newValue);
		
		int newDif= Method.calc(5,2);
		
		System.out.println(newDif);
		
		
		
		
		
	}

}
