package net.pradeo.simple;


public class X implements I {

  public A x() {
    System.out.println("X x");
    return new C();
  }

  @Override
  public X inter(A a) {
    System.out.println("X inter");
    return new Z();
  }

  
}

