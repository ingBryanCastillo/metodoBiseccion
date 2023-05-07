
import org.nfunk.jep.JEP;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alex
 */
public class Funcion {
    
    private String Expresion;

    public Funcion(String Expresion) {
        this.Expresion = Expresion;
    }
    
    public double Evaluar(double x){
        JEP j = new JEP(); 
        j.addStandardFunctions();
        j.addStandardConstants();
        j.addVariable("x", x);
        j.parseExpression(this.Expresion);
        
        if (!j.hasError()) {
            return j.getValue();
        }else {
          return Double.NaN;  
        }        
    }
}
