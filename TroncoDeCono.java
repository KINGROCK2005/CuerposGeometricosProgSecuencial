import java.util.Scanner;
import java.lang.Math;
public class TroncoDeCono{

    public static void main(String []args){
        
        double areaTotal, areaLateral, areaBM;
        double rM, rm, h, areaBm, volumen, g;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la altura:" );
        h = lector.nextDouble();
        System.out.println("Ingrese el radio menor: ");
        rm = lector.nextDouble();
        System.out.println("Ingrese el radio mayor: ");
        rM= lector.nextDouble();

        areaBM = Math.PI * (rM * rM);
        areaBm = Math.PI * (rm * rm);
        g = (Math.sqrt(h * h + ( rM * rM)));
        areaLateral = (double) (Math.PI * g * (rM * rm));
        areaTotal = areaLateral +  areaBM + areaBm; 
        volumen = 1 * Math.PI * h *(rM * rM + (rm * rm) + rM + rm )/3;

        System.out.println("Su area lateral es: " + areaLateral);
        System.out.println("Su area Total es: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();

    }
}