package net.pradeo.mains;

import net.pradeo.agesen.Animal;
import net.pradeo.agesen.Container;
import net.pradeo.agesen.Donkey;
import net.pradeo.agesen.Horse;
import net.pradeo.agesen.Jaguar;
import net.pradeo.agesen.Tiger;

public class MainAgesen {

  // kcfa
  public static void main(String[] args) {
    kcfa();
    klcfa();
  }

  public static void kcfa() {
    Animal x1 = Animal.foo(new Horse(), new Donkey());
    Animal x2 = Animal.foo(new Tiger(), new Jaguar());

    x1.print();
  }

  public static void klcfa() {
    Container c1 = new Container(new Horse(), new Donkey());
    Container c2 = new Container(new Tiger(), new Jaguar());

    Animal x1 = Animal.fooklcfa(c1);
    Animal x2 = Animal.fooklcfa(c2);
    
    x2.print();
  }

}
