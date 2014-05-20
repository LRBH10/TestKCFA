package net.pradeo.kcfa;

import java.util.List;

 

public class A {
  public void foo(){
     this.bar();
  }
  
  
  

  public List<? extends Object> bar() {
    this.zeta();
    return null;
  }

  public void zeta() {
    this .foo();
  }
}
