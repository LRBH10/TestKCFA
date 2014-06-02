package net.pradeo.klcfa;



public class A1 {
  
  A1 a;
  
  public A1(A1 a) {
   this.a = a;
  }
  
  public A1() {
  }

  public void foo() {}
  public void bar() {
    this.a.foo();
  }

  

}
