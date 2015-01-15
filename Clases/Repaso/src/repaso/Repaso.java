

package repaso;


public class Repaso {

   
    public static void main(String[] args) {
      
        /*
        if(args.length==0){
        
            System.out.println("Ningún argumento fue introducido.");
            System.exit(0);
        }
        
         String valor= args[0];
         System.out.println("El valor es: "+ valor);
        
        /*/
        
        Operaciones op=new Operaciones();
        OperacionString opS = new OperacionString();
        
        System.out.println(op.sumar(2));
        System.out.println(op.sumar(2));
        
        System.out.println(op.restar(2));
        
        System.out.println(op.multiplicar(2));
        
        System.out.println(op.dividir(2));
        
        System.out.println(opS.Invertir("hola"));
        opS.polindromo("oso");
        
        System.out.println(opS.remplazar("Hola","a", "o"));
        
        System.out.println(opS.Contiene("hola ", "o"));
        
        
    }
    
}
