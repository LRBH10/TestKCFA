package net.pradeo.tree;


public class StmtIf extends Stmt{

  Exp exp;
  Stmt bt,bf;
  public void setExp(Exp exp) {
    this.exp = exp;
  }
  
  @Override
  public String prettyPrint() {
    return "if "+exp.prettyPrint() + " ? " + bt.prettyPrint() + " : " + bf.prettyPrint() ;
  }
}
