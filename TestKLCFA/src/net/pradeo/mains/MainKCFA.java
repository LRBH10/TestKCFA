package net.pradeo.mains;

import net.pradeo.kcfa.A;
import net.pradeo.kcfa.B;
import net.pradeo.kcfa.C;

public class MainKCFA {
  
  public static void main(String[] args) {
     A c = new C();
     A b = new B();
     c.bar(b, 5);
  }
  
   

}
