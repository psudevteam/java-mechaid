
package src.keycaps.java;

public abstract class Keycaps {
  private String KeycapsName, KeycapsType;
  private int KeycapsPrice;

  public Keycaps(String val1, String val2, int val3){
      setKeycapsName(val1);
      setKeycapsType(val2);
      setKeycapsPrice(val3);
  }

  public Keycaps(){}

  public void setKeycapsName(String val){
    this.KeycapsName = val;
  }

  public void setKeycapsType(String val){
    this.KeycapsType = val;
  }

  public void setKeycapsPrice(int val){
    this.KeycapsPrice = val;
  }

  public String getKeycapsName(){
    return this.KeycapsName;
  }

  public String getKeycapsType(){
    return this.KeycapsType;
  }

  public int getKeycapsPrice(){
    return this.KeycapsPrice;
  }

}
