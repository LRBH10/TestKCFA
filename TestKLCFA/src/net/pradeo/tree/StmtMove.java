package net.pradeo.tree;


public class StmtMove extends Stmt{
  ExpVar dst;
  Exp src;

  @Override
  public String prettyPrint() {
    return dst + " = "+ src.prettyPrint();
  }
  
  
}
 