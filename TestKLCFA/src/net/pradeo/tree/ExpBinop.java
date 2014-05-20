package net.pradeo.tree;

public class ExpBinop extends Exp{
  Exp exp1, exp2;
  
  public void setExp1(Exp exp1) {
    this.exp1 = exp1;
  }
  
  public void setExp2(Exp exp2) {
    this.exp2 = exp2;
  }

  @Override
  public String prettyPrint() {
    return "binop "+ exp1.prettyPrint() +" "+ exp2.prettyPrint();
  }
  
}
