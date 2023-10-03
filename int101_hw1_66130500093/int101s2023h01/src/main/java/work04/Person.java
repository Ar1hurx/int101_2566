/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package work04;

/**
 *
 * @author J
 */
public class Person {
    private int id;
    public Person(int id){this.id = id;}
    public int getid(){return id;}
    public void setid(int id){this.id = id;}
    
    @Override
    public String toString(){return "Person("+"id = "+ id +')';}
}
