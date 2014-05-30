package net.pradeo.KCFATest;

import net.pradeo.agesen.CPAtest;
import net.pradeo.agesen.CPAtest.Donkey;
import net.pradeo.agesen.CPAtest.Horse;
import net.pradeo.agesen.CPAtest.Jaguar;
import net.pradeo.agesen.CPAtest.Tiger;


public class Main{
	public static void main(String[] args) {
	    CPAtest.foo(new Horse(), new Donkey()).print();
	    CPAtest.foo(new Tiger(), new Jaguar());

	  //new B().foo();
	  //new C().foo();
	}
	
	
	/*

  A a = new C();
      a.a2();
      
      X x = a.a();
      x.inter(null);
      
	 */

}
