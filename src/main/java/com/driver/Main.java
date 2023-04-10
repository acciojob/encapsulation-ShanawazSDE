package com.driver;

public class Main
{
  public static void main (String[]args)
  {
    RWOnly obj = new RWOnly();
    //obj.var = 1; error: var has private access in RWOnly
    obj.setVar(1);
    System.out.println(obj.getVar());
  }
}
