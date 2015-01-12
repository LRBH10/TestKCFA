package net.pradeo.agesen;

public class CPAtest {
  
  static boolean test = true;
  
  public static abstract class Animal{ 
    public abstract void print();
  }
  public static class Horse extends Animal{
    @Override
    public void print() {
       System.out.println("Horse");
    }}
  public static class Donkey extends Animal{

    @Override
    public void print() {
      System.out.println("Donkey");
      
    }}
  public static class Tiger extends Animal{

    @Override
    public void print() {
      System.out.println("Tiger");      
    }}
  public static class Jaguar extends Animal{

    @Override
    public void print() {
      System.out.println("Jaguar");
    }}
  
  

  public static Animal Condition(Animal a1, Animal a2){
    Animal ret = null;
    if(a1 instanceof Jaguar)
      ret = a1;
    else 
      ret = a2;
    return ret; 
  }
  
  
  public static Animal foo(Animal a1, Animal a2) {
    return Condition(a1,a2);
  }
  
  
  


}
