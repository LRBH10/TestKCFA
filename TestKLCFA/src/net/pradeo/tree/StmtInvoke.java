package net.pradeo.tree;

import java.util.ArrayList;
import java.util.List;



public class StmtInvoke  extends Stmt {
  List<ExpVar> args = new ArrayList<ExpVar>();

   
  
  @Override
  public String prettyPrint() {
    String iInvoke = " invoke (";
    for(ExpVar arg: args){
      iInvoke += arg +" ";
    }
    iInvoke += ")";
    return iInvoke;
  }
  
  
  public void AddArg(ExpVar arg){
    args.add(arg);
  }
  
}
