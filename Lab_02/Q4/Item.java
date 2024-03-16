/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q4;

/**
 *
 * @author LIEW
 */
public class Item {
    public static <T extends Comparable<T> > String minmax(T[] array){ //return type (String) of the method (minmax)
        if (array==null || array.length == 0) {
                return "The array is empty";
        }
        
        T min = array[0];
        T max = array[0];
        
        for (T result : array) {
            if (result.compareTo(min) < 0) {
                min = result;
            }
            if (result.compareTo(max) > 0) {
                max = result;
            }
        }
        return "\nMin: " + min + "\nMax: " + max;
    }
    
    public static void main(String[] args) {
        Integer [] intArray = {5,3,7,1,4,9,8,2};
        String[] strArray = {"red", "blue", "orange", "tan"};
        
        System.out.println("Integer Max and Min Value: " + minmax(intArray));
        System.out.println("\nString Max and Min Value: "  + minmax(strArray));
    }
}
