/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q2;

/**
 *
 * @author LIEW
 */
public class CompareMax {
    public static <T extends Comparable<T>> T maximum (T a, T b, T c){
        T max = a;
        if (b.compareTo(max) > 0) {
            max = b;
        }
        if (c.compareTo(max) > 0) {
            max = c;
        }
        return max;
    }
    
    public static void main(String[] args) {
        
        String maxString = maximum("apple", "strawberry", "cherry");
        System.out.println("Maximum String: " + maxString);
        
        Integer maxInteger = maximum(2, 4, 6);
        System.out.println("Maximum Integer: " + maxInteger);
        
        Double maxDouble = maximum(2.1, 6.1, 1.3);
        System.out.println("Maximum Double: " + maxDouble);
    }
}
