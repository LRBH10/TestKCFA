package net.pradeo.abc;

import net.pradeo.xyz.X;
import net.pradeo.xyz.Y;

public class A {
  
  public A() {
    this.a1();
  }
  
  public void a1() {
    System.out.println("A a1");
  }

  public X a() {
    System.out.println("A a");
    return new X();
  }

  
  public void a2(){
    System.out.println("A a2");
  }

  

}
