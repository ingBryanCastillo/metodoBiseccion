import org.nfunk.jep.JEP;

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
