public class Vectorherencia {
    
    static  Scanner scanner=new Scanner (System.in);
      
    public static void main(String[] args) {
         Calespecial calculador=new Calespecial();
         int opcion = 0;
       
         do{
        System.out.print("\n Bienvenidos a las calculadoras:");
           System.out.println();
          
           System.out.println("1" +" Raiz Cuadrada");
           System.out.println("2" +" Potencia");
           System.out.println("3" +" Area");
           System.out.println("4" +" historial de operaciones ");
           System.out.print("\n Ingrese una opcion" );
             opcion = scanner.nextInt();
       switch(opcion){
               
         
          case 1 -> {
            System.out.println( "ingrese el  numero para la raiz ");
             double operar=scanner.nextDouble();
             System.out.print(calculador.raizCuadrada(operar));
             calculador.mostrarTransaccionEspecial();
             
                   
                   }
                   case 2 -> {
            System.out.println( "ingrese el   primer numero para la potencia  ");
             double operar=scanner.nextDouble();
             System.out.println( "ingrese el  segundo numero para la potencia  ");
             double operarer=scanner.nextDouble();
             System.out.print(calculador.potenciaDeUnNumero(operar, operarer));
             calculador.mostrarTransaccionEspecial();
                   
                   }
                case 3 -> {
            System.out.println( "ingrese la altura  ");
             int operar=scanner.nextInt();
             System.out.println( "ingrese la base  ");
             int numero=scanner.nextInt();
             System.out.print(calculador.area(operar, numero));
             calculador.mostrarTransaccionEspecial();
                   
                   }
           
                 case 4 -> {
            calculador.mostrarTransaccionEspecial();
            calculador.mostrarTransacciones();
    
            break;
                 }
            
                  

      }
       
       
       }  while (opcion !=4); 
          
        }
        

}
