package net.pradeo.KCFATest;

import net.pradeo.klcfa.B1;
import net.pradeo.klcfa.C1;


public class Main{
	public static void main(String[] args) {
	  //  CPAtest.foo(new Horse(), new Donkey()).print();
	  //  CPAtest.foo(new Tiger(), new Jaguar());

	  //new B().foo();
	  //new C().foo(); 
	  
	  new B1(new C1()).foo();
      new C1(new B1()).foo();

	}
	

}
