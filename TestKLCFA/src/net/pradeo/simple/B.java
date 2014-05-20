package net.pradeo.simple;


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
