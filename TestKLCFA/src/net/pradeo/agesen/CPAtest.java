package net.pradeo.agesen;

public class CPAtest {
  
  static boolean test = true;
  
  public static class Animal{}
  public static class Horse extends Animal{}
  public static class Donkey extends Animal{}
  public static class Tiger extends Animal{}
  public static class Jaguar extends Animal{}
  
  

  public static Animal Condition(Animal a1, Animal a2){
    Animal ret = null;
    if(test)
      ret = a1;
    else 
      ret = a2;
    return ret; 
  }
  
  
  public static void foo(Animal a1, Animal a2) {
    Condition(a1,a2);
  }
  
  
  


}
