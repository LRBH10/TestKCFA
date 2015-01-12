package net.pradeo.KCFATest;

import net.pradeo.agesen.CPAtest;
import net.pradeo.agesen.CPAtest.Animal;
import net.pradeo.agesen.CPAtest.Donkey;
import net.pradeo.agesen.CPAtest.Horse;
import net.pradeo.agesen.CPAtest.Jaguar;
import net.pradeo.agesen.CPAtest.Tiger;
import net.pradeo.agesen.Container;

public class Main {

	static void x(Integer x) {
		if (x != null && x == 100) {
			System.err.println(x);
		} else {
			System.err.println(x);
		}
	}

	public static void main(String[] args) {
		Animal x1 = CPAtest.foo(new Horse(), new Donkey());
		Animal x2 = CPAtest.foo(new Tiger(), new Jaguar());

		x1.print();
	}

	public static Animal Condition(Container c) {
		Animal ret = null;
		if (c.a1 instanceof Jaguar)
			ret = c.a1;
		else
			ret = c.a2;
		return ret;
	}

	static boolean foo() {
		return true;
	}

	// A b = new B();
	// A c = new C();

	// b.foo(c, 10);
	// c.foo(b, 10);

	// new B1(new C1()).foo();
	// new C1(new B1()).foo();
	
	
//	Container c1 = new Container(new Horse(), new Donkey());
//	Container c2 = new Container(new Tiger(), new Jaguar());
//	
//	Animal a1 = Condition(c1);
//	Animal a2 = Condition(c2);
//	 
//	a1.print();


}
