package net.pradeo.tree;

import java.util.Random;

public class ExpVar extends Exp {
  long id;
  public ExpVar() {
   id = new Random().nextLong()%400;
  }
  
  @Override
  public String prettyPrint() {
      return "V"+id;
  }
}
