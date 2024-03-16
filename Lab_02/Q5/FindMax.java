/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q5;

/**
 *
 * @author LIEW
 */
public class FindMax {
    public static void main(String[] args) {
       //create 3 diff obj of type array
       Integer [] i = {1, 2, 3};
       String [] s = {"red", "green", "blue"};
       Circle[] c = {new Circle(3), new Circle(2.9), new Circle(5.9)};
       //Double [] d = {3.0, 2.9, 5.9};
       
       //invoke the mmaximum method for each array
        System.out.println("Max Integer: "  + max(i));
        System.out.println("Max String: "  + max(s));
        System.out.println("Max Double: "  + max(c));
    }
    
    public static <E extends Comparable <E>> E max (E [] list){
        if (list == null || list.length == 0){
            return null;
        }
        
        E maxValue = list[0];
        for (E result : list) {
            if (result.compareTo(maxValue) > 0) {
                maxValue = result;
            }
        }
        return maxValue;
    }
}

class Circle implements Comparable <Circle>{
    private double radius;
    
    public Circle(){
        
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
    
     @Override
    public int compareTo(Circle o) {
        return Double.compare(this.radius, o.getRadius());
    }
    
    public String toString(){
        return "Radiuc Circle " + radius;
    }

   
}