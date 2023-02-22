/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package coe318.lab7;
import java.util.ArrayList;

/**
 *
 * @author Jberhane
 */

/**
     * Returns a new Circuit that is
     * created using Resistors and Voltage 
     * Sources between respective nodes
     */
public class Circuit {
   private static Circuit instance = null; 
  private ArrayList<Resistor> r;
  private ArrayList<VoltageSource> v;
  
   public static Circuit getInstance() {
    if (instance == null){ 
        instance = new Circuit();
    }
     return instance;
    }
    private Circuit() {
       this.r = new ArrayList<Resistor>();
       this.v = new ArrayList<VoltageSource>();
    } //Yes, the constructor is PRIVATE!'

    public void add(Resistor r){
       this.r.add(r);
    }

    public void add(VoltageSource v){
       this.v.add(v);
    }

    /**
     * Returns a String representation of
     * the resistors and voltage sources
     * @return the String representation.
     */
    @Override
    public String toString() {
        String s = "";
        for (Resistor re:r){        
            s += re + "\n";                      
            }  
        for (VoltageSource vo : v){
            s += vo + "\n";
        }
        return s;
    }

    }