import java.util.Scanner;

public class Icosaedro{

    public static void main(String []args){

        double areaTotal, volumen, aristota;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la aristota: ");
        aristota = lector.nextDouble();

        areaTotal = 5 * (Math.pow(aristota,2))*(Math.sqrt(3));
        volumen = 5 * (3 + Math.sqrt(5) *Math.pow(aristota, 3)/12) ;

        System.out.println("El area total es de: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();
        
    }
}