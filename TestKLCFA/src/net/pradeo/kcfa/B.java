package net.pradeo.kcfa;

import java.util.ArrayList;

public class B extends A {
  
  @Override
  public void foo() {
    super.foo();
  }
  
  
  @Override
  public ArrayList<? extends Object> bar() {
    super.bar();
    return null;
  }
 
  

  @Override
  public void zeta() {
    super.zeta();
  }
}
