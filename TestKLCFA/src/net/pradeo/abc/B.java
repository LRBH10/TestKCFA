package net.pradeo.abc;

import net.pradeo.i.I;
import net.pradeo.xyz.X;
import net.pradeo.xyz.Y;

public class B  extends A implements I{
 
  
  

  @Override
  public X a() {
    System.out.println("B a");
    return new Y();
  }

  @Override
  public X inter(A a) {
    return new Y();
  }


}
