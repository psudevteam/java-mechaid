package src.keyboard.java;

import src.helper.java.Helper;

public class Keyboard extends Helper {
  private String keebName, keebBrand, keebKeycaps, keebSwitch;
  private float keebPrice;

  public Keyboard(String val1, String val2, String val3, String val4, float val5 ){
    setKeebName(val1);
    setKeebBrand(val2);
    setKeebKeycaps(val3);
    setKeebSwitch(val4);
    setKeebPrice(val5);
  }

  public Keyboard(){}

  public void setKeebName(String val){
    this.keebName = val;
  }

  public void setKeebBrand(String val){
    this.keebBrand = val;
  }

  public void setKeebKeycaps(String val){
    this.keebKeycaps = val;
  }

  public void setKeebSwitch(String val){
    this.keebSwitch = val;
  }

  public void setKeebPrice(float val){
    this.keebPrice = val;
  }

  public String getKeebName(){
    return this.keebName;
  }

  public String getKeebBrand(){
    return this.keebBrand;
  }

  public String getKeebKeycaps(){
    return this.keebKeycaps;
  }

  public String getKeebSwitch(){
    return this.keebSwitch;
  }

  public float getKeebPrice(){
    return this.keebPrice;
  }

  public void keebInfo() {
    out("Nama Keyboard : " + this.getKeebName(), 1);
    out("Merek Keyboard : " + this.getKeebBrand(), 1);
    out("Keycaps Keyboard : " + this.getKeebKeycaps(), 1);
    out("Switch Keyboard : " + this.getKeebSwitch(), 1);
    out("Harga Keyboard : " + this.getKeebPrice(), 1);
  }

}
