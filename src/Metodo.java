public class Metodo {
    private Funcion fun;
    double x;
    int contador;
    
    public Metodo(){}
    
    public Metodo(String expresion){
        fun = new Funcion(expresion);
    }
    
    public void setFuncion(String expresion){
        fun = new Funcion(expresion);
    }
    
    public double biseccion(double a, double b, double t){
        this.x = Double.NaN;
        this.contador = 0;
        
        double evaA = this.fun.Evaluar(a);
        
        if (!Double.isNaN(evaA)) {
            double evaB = this.fun.Evaluar(b);
            
            if(evaA * evaB < 0){
                
                do {    
                    this.x = (a+b) / 2;
                    this.contador++;
                    evaA = this.fun.Evaluar(a);
                    evaB = this.fun.Evaluar(b);
                    
                    if(evaA * this.fun.Evaluar(x) < 0){
                        b = this.x;
                    }else{
                        a = this.x;
                    }
                    
                } while (Math.abs(this.fun.Evaluar(x)) > t);
                
                
            }
            
            if(!Double.isNaN(this.x)){
                return this.x;
            }
                        
        }
        
            return Double.NaN;
    }
}
