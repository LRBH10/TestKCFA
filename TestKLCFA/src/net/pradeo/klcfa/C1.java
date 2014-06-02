package net.pradeo.klcfa;

public class C1  extends A1{
  public C1() {
   
  }
  
  public C1(A1 a) {
    super(a);
  }

  @Override
  public void foo() {
    this.bar();
  }
}
