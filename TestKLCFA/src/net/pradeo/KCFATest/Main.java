package net.pradeo.KCFATest;

import net.pradeo.agesen.CPAtest;
import net.pradeo.agesen.CPAtest.Donkey;
import net.pradeo.agesen.CPAtest.Horse;
import net.pradeo.agesen.CPAtest.Jaguar;
import net.pradeo.agesen.CPAtest.Tiger;
import net.pradeo.simple.A;
import net.pradeo.simple.C;
import net.pradeo.simple.X;


public class Main{
	public static void main(String[] args) {
	    CPAtest.foo(new Horse(), new Donkey());
	    CPAtest.foo(new Tiger(), new Jaguar());
	}
	
	
	/*

  A a = new C();
      a.a2();
      
      X x = a.a();
      x.inter(null);
      
	 */

}
