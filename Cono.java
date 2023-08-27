import java.util.Scanner;

public class Cono{

    public static void main(String []args){

        double areaLateral, areaTotal, volumen;
        double r, h, g, pBase, aBase;

        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la altura: ");
        h = lector.nextDouble();
        System.out.println("Ingrese el radio: ");
        r = lector.nextDouble();

        pBase = (2 * (Math.PI * r));
        aBase = (Math.PI * (r * r));
        g = (Math.sqrt(h * h + ( r * r)));
        areaLateral = pBase * g /2;
        areaTotal = areaLateral + aBase;
        volumen = aBase * h /3;

        System.out.println("Su generatriz es: " + g);
        System.out.println("Su area lateral es: " + areaLateral);
        System.out.println("Su area total es: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();
    }
}