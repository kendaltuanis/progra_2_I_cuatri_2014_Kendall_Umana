
package repaso;


public class OperacionString {
    
    
    
    
    public String Invertir(String valor){
        
        String temp="";
    
        for (int i = valor.length()-1; i >= 0; i--) {
            
          temp+=valor.charAt(i);
            
        }
       
        return temp;
    
    }
    
    public void polindromo(String valor){
    
    String igualar= Invertir(valor);
    if(igualar.equals(valor)){
    
        System.out.println("La palabra es palíndromo");
    }
    else{
    
        System.out.println("La palabra no es palíndromo");
    
    }
        
        
    }
    
    public String remplazar(String original,String viejo, String nuevo){
            
            return original.replaceAll(viejo,nuevo);
      
            
        }
    
    public boolean Contiene(String valor, String caracter){
        
        return valor.contains(caracter);
    
    
    }
    
    
               
                
    
    
    
}
