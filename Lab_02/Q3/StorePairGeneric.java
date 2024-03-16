/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Q3;

/**
 *
 * @author LIEW
 * @param <T>
 */
public class StorePairGeneric <T extends Comparable <T>> implements Comparable<StorePairGeneric<T>>{
    private T first;
    private T second;
    
    //no-arg constructor
    public StorePairGeneric(){
        
    }
    
    //constructor with parameter
    public StorePairGeneric(T first, T second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(T second) {
        this.second = second;
    }
    
    public String toString(){
        return "first = " + first + " second = " + second;
    }
    
    @Override
    public boolean equals(Object obj){
        if (this == obj) {
            return true;
        }
        
        //check object if it is null
        if (obj == null || this.getClass() != obj.getClass()) {
            System.out.println("The value is null");
            return false;
        }
        
        //cast the object to StorePairGeneric and compare their first values
        StorePairGeneric s = (StorePairGeneric) obj;
        return this.first == s.first;
    }

    @Override
    public int compareTo(StorePairGeneric<T> o) {
        return this.first.compareTo(o.first);
    }
    
    public static void main(String[] args) {
        
        //create objects
        StorePairGeneric <Integer> a = new StorePairGeneric<>(6, 4);
        StorePairGeneric <Integer> b = new StorePairGeneric<>(2,2);
        StorePairGeneric <Integer> c = new StorePairGeneric<>(6,3);
        
        //print objects
        System.out.println("Object a: " + a);
        System.out.println("Object b: " + b);
        System.out.println("Object c: " + c);
        System.out.println();
        
        //compare equal value
        System.out.println("Equality of a and b: " + a.equals(b));
        System.out.println("Equality of a and c: " + a.equals(c));
        System.out.println("Equality of b and c: " + b.equals(c));
        System.out.println();
        
        //compare objects
        System.out.println("Comparison of a and b: " + a.compareTo(b));
        System.out.println("Comparison of a and c: " + a.compareTo(c));
        System.out.println("Comparison of b and c: " + b.compareTo(c));
    }
}
