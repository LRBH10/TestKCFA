package net.pradeo.agesen;

public abstract class Animal {

  static boolean test = true;

  abstract public void print();

  public static Animal Condition(Animal a1, Animal a2) {
    Animal ret = null;
    if (a1 instanceof Jaguar)
      ret = a1;
    else
      ret = a2;
    return ret;
  }


  public static Animal foo(Animal a1, Animal a2) {
    return Condition(a1, a2);
  }



}
