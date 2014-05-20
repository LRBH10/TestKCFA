package net.pradeo.tree;

public class ExpNew  extends Exp{

  String type = "Object";
  
  public void setType(String type) {
    this.type = type;
  }
  
  @Override
  public String prettyPrint() {
    return "new "+ type;
  }

}

