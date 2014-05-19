package net.pradeo.xyz;

import net.pradeo.abc.A;
import net.pradeo.abc.C;
import net.pradeo.i.I;

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

