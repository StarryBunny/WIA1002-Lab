/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q6;

/**
 *
 * @author LIEW
 */
public class MinMaxTwoArray {
    public static void main(String[] args) {
        Integer [][] numbers1 = {{4, 5, 6},{1, 2, 3}};
        
        System.out.println("Minimum: " + min(numbers1));
        System.out.println("Maxium: " + max(numbers1));
    }
    
    //first method returns minimum element
    public static <E extends Comparable<E>> E min(E [][] list){
        E min = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(min) < 0) {
                    min = list[i][j];
                }
            }
        }
        return min;
    }
    
    //second method returns maximum element
    public static <E extends Comparable<E>> E max (E [][] list){
        E max = list[0][0];
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].length; j++) {
                if (list[i][j].compareTo(max) > 0) {
                    max = list[i][j];
                }
            }
        }
        return max;
    }
}
