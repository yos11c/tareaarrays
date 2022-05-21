public class Calespecial  {
    private String[] vectorTransacciones;  
    private int indiceVector;
    
    public Calespecial(){
      vectorTransacciones= new String[10000000];
        this.indiceVector=0;  
        
    }
    
    
    public double raizCuadrada(double raizcuadra){
        
     double num = Math.sqrt(raizcuadra);
     double resultado = num;
     this.registrarTranEspecial("raiz ", raizcuadra, raizcuadra, resultado);
     return resultado;
    }

   public double area(int vase, int altura){
         double area = Math.multiplyExact(vase, altura/2);
         this.registrarTranEspecial("area ", vase, altura, area);
         return area;
      }
      
    
    public double potenciaDeUnNumero (double numero, double potencia){
          double resultad= Math.pow(numero,  potencia);
        this.registrarTranEspecial("potencia ", numero, potencia, resultad);
        return resultad;
      }
    
    
    
    public void registrarTranEspecial(String tipo, double primerParametro, double segundoParametro, double resultado){
        indiceVector= indiceVector+1;
        vectorTransacciones[indiceVector]= " "+ tipo + ""+ primerParametro+" "+segundoParametro+" resultado: "+resultado;
        
    }
    public void mostrarTransaccionEspecial(){
        try{       
            for (int i=1; i<vectorTransacciones.length;i++){
                if(vectorTransacciones[i] != null){
                    System.out.println(vectorTransacciones[i]);
                }
            }
            System.out.println("");
            for(String transaccion : vectorTransacciones){
                if(transaccion != null){
                   
                }   
            } 
        }catch(Exception e){
            System.out.println(e.getMessage());       
        }
    }
}
    

   