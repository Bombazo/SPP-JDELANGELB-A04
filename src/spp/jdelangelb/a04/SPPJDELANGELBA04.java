//JORGE DANIEL DEL ANGEL BOMBARDIER A01410409
//FUTURO PROGRAMADOR
//IMT

package spp.jdelangelb.a04;
import java.util.Scanner;

public class SPPJDELANGELBA04 {


    public static void main(String[] args) {
        
         System.out.println("PROGRMAMA PARA CLACULAR SENO, COSENO Y TANGENTE");
        
        //declaracion de variables
        int hola;
        double seno, coseno, tangente, angulo;
        
        Scanner kb = new Scanner(System.in);
        System.out.println("Elija la opcion a trabajar");
        System.out.println("1.-Seno");
        System.out.println("2.-Coseno");
        System.out.println("3.-Tangente");
        System.out.println("4.-Salir");
        
        hola= kb.nextInt();
        switch(hola){
            
            case 1:
                System.out.println("Ingresa el angulo de 0° a 360° para sacar Seno");
                angulo= kb.nextDouble();
                seno= Math.sin(angulo);
                System.out.println("TU SENO ES IGUAL A   " + seno);
                break;
            
            case 2:
                System.out.println("Ingresa el angulo de 0° a 360° para sacar Coseno");
                angulo = kb.nextDouble();
                coseno=Math.cos(angulo);
                System.out.println("TU COSENO ES IGUAL A   "  + coseno);
                break;
                
            case 3: 
                System.out.println("Ingresa el angulo de 0° a 360° para sacar Tangente");
                angulo= kb.nextDouble();
                tangente= Math.tan(angulo);
                System.out.println("TU TANGENTE ES IGUAL A   "  + tangente);
                break;
                
            case 4:
                break;
        
        
        
    }
    
}
