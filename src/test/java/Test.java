package src.test.java;
import src.helper.java.Helper;
import src.keyboard.java.Keyboard;  
import java.lang.Thread;
import java.io.*;

public class Test extends Helper {
  private Keyboard object = new Keyboard();

  public static boolean checkOutputOfKeyboard() {
    try {
      Keyboard object = new Keyboard("Rover 84", "PressPlay", "Rover Keycaps PBT DYE SUB", "Gateron Brown", 1200000);
      Object actual = object.getKeebName() + " " + object.getKeebBrand() + " " + object.getKeebKeycaps() + " " + object.getKeebSwitch() + " " + object.getKeebPrice();
      Object expected = "Rover 84 PressPlay Rover Keycaps PBT DYE SUB Gateron Brown 1200000.0";
      boolean res = isEqual(actual, expected, 2);
      return res;
    } catch(Exception e) {
      return false;
    }
  }

  public static boolean checkKeyboardName(){
    try {
     Keyboard object = new Keyboard();
     object.setKeebName("Rover 84");
     Object expected = "Rover 84";
     Object actual = object.getKeebName();
     boolean res = isEqual(actual, expected, 2);
     return res;
    } catch(Exception e){
      return false;
    }
  }

  public static boolean checkKeyboardBrand(){
    try {
     Keyboard object = new Keyboard();
     object.setKeebBrand("PressPlay");
     Object expected = "PressPlay";
     Object actual = object.getKeebBrand();
     boolean res = isEqual(actual, expected, 2);
     return res;
    } catch(Exception e){
      return false;
    }
  }

  public static boolean checkKeyboardKeycaps(){
    try {
     Keyboard object = new Keyboard();
     object.setKeebKeycaps("GMK Red Samurai");
     Object expected = "GMK Red Samurai";
     Object actual = object.getKeebKeycaps();
     boolean res = isEqual(actual, expected, 2);
     return res;
    } catch(Exception e){
      return false;
    }
  }

  public static boolean checkKeyboardSwitch(){
    try {
     Keyboard object = new Keyboard();
     object.setKeebSwitch("Gateron Brown");
     Object expected = "Gateron Brown";
     Object actual = object.getKeebSwitch();
     boolean res = isEqual(actual, expected, 2);
     return res;
    } catch(Exception e){
      return false;
    }
  }

  public static boolean checkKeyboardPrice(){
    try {
     Keyboard object = new Keyboard();
     object.setKeebPrice(1200000);
     Object expected = 1200000;
     Object actual = object.getKeebPrice();
     boolean res = isEqual(actual, expected, 1);
     return res;
    } catch(Exception e){
      return false;
    }
  }

  public static void main(String[] args){

    boolean test1 = checkOutputOfKeyboard();
    boolean test2 = checkKeyboardName();
    boolean test3 = checkKeyboardBrand();
    boolean test4 = checkKeyboardKeycaps();
    boolean test5 = checkKeyboardSwitch();
    boolean test6 = checkKeyboardPrice();

    if (test1 == true) {
      out("( Check Class Standard Output ) ✔  Test 1 Passed", 1);
    } else {
      out("( Check Class Standard Output ) ✖  Test 1 Not Passed", 1);
    }

    if (test2 == true){
      out("( Check Keyboard Name Output )  ✔  Test 2 Passed", 1);
    } else {
      out("( Check Keyboard Name Output )  ✖  Test 2 Not Passed", 1);
    }

    if (test3 == true){
      out("( Check Keyboard Brand Output ) ✔  Test 3 Passed", 1);
    } else {
      out("( Check Keyboard Brand Output ) ✖  Test 3 Not Passed", 1);
    }

    if (test4 == true){
      out("( Check Keyboard Keycaps Output ) ✔  Test 4 Passed", 1);
    } else {
      out("( Check Keyboard Keycaps Output ) ✖  Test 4 Not Passed", 1);
    }

    if (test5 == true){
      out("( Check Keyboard Switch Output ) ✔  Test 5 Passed", 1);
    } else {
      out("( Check Keyboard Switch Output ) ✖  Test 5 Not Passed", 1);
    }

    if (test6 == true){
      out("( Check Keyboard Price Output ) ✔  Test 6 Passed", 1);
    } else {
      out("( Check Keyboard Price Output ) ✖  Test 6 Not Passed", 1);
    }

  }
    
}
