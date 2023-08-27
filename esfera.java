import java.util.Scanner;
import java.lang.Math;
public class esfera 
{
    public static void main(String []args){

        double r, areaTotal, volumen;
  
        Scanner lector = new Scanner (System.in);

        System.out.println("Ingrese el radio: ");
        r = lector.nextDouble();

        areaTotal = 4 * (Math.PI * (r * r));
        volumen = 4 * (double)(Math.PI *  Math.pow(r, 3)) / 3 ;

        System.out.println("Su area total es: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();

    }

    
}
