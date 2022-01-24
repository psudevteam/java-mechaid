package src.switches.java;

public abstract class Switches {
  private String switchName, switchType;
  private int switchPrice;

  public Switches(String val1, String val2, int val3){
      setSwitchName(val1);
      setSwitchType(val2);
      setSwitchPrice(val3);
  }

  public Switches(){}

  public void setSwitchName(String val){
    this.switchName = val;
  }

  public void setSwitchType(String val){
    this.switchType = val;
  }

  public void setSwitchPrice(int val){
    this.switchPrice = val;
  }

  public String getSwitchName(){
    return this.switchName;
  }

  public String getSwitchType(){
    return this.switchType;
  }

  public int getSwitchPrice(){
    return this.switchPrice;
  }

}
