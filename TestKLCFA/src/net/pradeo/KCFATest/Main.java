package net.pradeo.KCFATest;

import net.pradeo.agesen.Animal;
import net.pradeo.agesen.Donkey;
import net.pradeo.agesen.Horse;
import net.pradeo.agesen.Jaguar;
import net.pradeo.agesen.Tiger;
public class Main {


  public static void main(String[] args) {
    Animal x1 = Animal.foo(new Horse(), new Donkey());
    Animal x2 = Animal.foo(new Tiger(), new Jaguar());

    x1.print();
  }

}
