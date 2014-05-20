package net.pradeo.simple;


public class Z extends Y {

  
  public Z() {
   
  }
  
  @Override
  public A x() {
    System.out.println("Z x");
    return new C();
  }
  
  @Override
  public X inter(A a) {
    System.out.println("Z inter");
    a.a();
    return new X();
  }
}
