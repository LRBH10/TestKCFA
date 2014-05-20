package net.pradeo.simple;


public class C  extends B{
	
  
  @Override
  public X a() {
    System.out.println("C a");
    return new X();
  }
  
  
  @Override
  public void a1() {
    System.out.println("C a1");
  }
  
  @Override
  public void a2() {
    System.out.println("C a2");
    X  x = new Z();
    x.inter(this);
  }
 
}
