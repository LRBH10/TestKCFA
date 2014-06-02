package net.pradeo.klcfa;


public class B1 extends A1 {
  
  public B1() {
  }
  
  public B1(A1 a) {
   super(a);
  }
  
  @Override
  public void foo() {
    this.bar();
  }
  
  
 

}
