/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class flyable {
    interface Flyable {
    void fly();
}

// Class implementing the interface
class Bird implements Flyable {
    @Override
    public void fly() {
        System.out.println("Bird is flying");
    }
}

// Usage
Flyable flyable = new Bird();
 // Output: Bird is flying

    
}
