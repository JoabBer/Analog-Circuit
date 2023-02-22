/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Jberhane
 */
public class UserMain {
    public static void main (String[] args) {
        
        ArrayList<Object> components = new ArrayList<>(); //Stores components
        Scanner user = new Scanner(System.in); //user input
        String input = ""; //input storage
        
        while(!"exit".equalsIgnoreCase(input)){ //loop will exit 
            input = user.nextLine().trim();//strings will be removed and replaced 
            if(input.equalsIgnoreCase("spice")){ //spice: prints out circuit
                for(Object o : components){
                    System.out.println(o);
                }
            } else {
                String[] value = input.split(" ");
                if(value.length != 4 && !"exit".equalsIgnoreCase(input)){// doesnt print try again for exit
                    System.out.println("Try again.");//type, node1, node2, number
                } else {
                    if(input.startsWith("v")) { //for case of voltage source
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nID = Integer.parseInt(value[1]);//parse of value 1 would be node 1, or number after space
                        n2.nID = Integer.parseInt(value[2]); //so on for the next values
                        temp = Double.parseDouble(value[3]);
                        VoltageSource v = new VoltageSource(temp, n1, n2);
                        components.add(v);
                    } else if (input.startsWith("r")) { //for case of resistor
                        double temp;
                        Node n1 = new Node();
                        Node n2 = new Node();
                        n1.nID = Integer.parseInt(value[1]);
                        n2.nID = Integer.parseInt(value[2]);
                        temp = Double.parseDouble(value[3]);
                        Resistor r = new Resistor(temp, n1, n2);
                        components.add(r);                              
                    }
                }
            }   
        }
        System.out.println("All Done");
    }
}
