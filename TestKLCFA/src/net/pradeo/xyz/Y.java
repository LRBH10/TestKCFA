package net.pradeo.xyz;

import net.pradeo.abc.A;
import net.pradeo.abc.B;

public class Y extends X {

  public A x() {
    System.out.println("Y x");
    return new B();
  }

 
}
