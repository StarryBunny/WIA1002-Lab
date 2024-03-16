/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q1;

/**
 *
 * @author LIEW
 */
public class MyGeneric <T> {
    private T e;
    
    //no-arg constructor
    public MyGeneric(){
        
    }

    //constructor accepts one generic parameter
    public MyGeneric(T e) {
        this.e = e;
    }

    public T getE() {
        return e;
    }

    public void setE(T e) {
        this.e = e;
    }
    
    public static void main(String[] args) {
        MyGeneric <String> strObj = new MyGeneric<>("helloooooo");
        MyGeneric <Integer> intObj = new MyGeneric<>(27);
        
        System.out.println("String Object: " + strObj.getE());
        System.out.println("Integer Object: " + intObj.getE());
    }
}
