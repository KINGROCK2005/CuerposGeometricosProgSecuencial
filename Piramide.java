import java.util.Scanner;

public class Piramide{
    public static void main(String []args)
    {
        double areaLatera, areaTotal, volumen, longlad;
        double perBase, areaBase, h, r, apo, apPir, canLad;
        Scanner lector = new Scanner (System.in);

        System.out.println("Ingrese el radio: ");
        r = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        h = lector.nextDouble();
        System.out.println("Ingrese la longitud de los lados: ");
        longlad = lector.nextDouble();
        System.out.print("Cantidad de lados: ");
        canLad = lector.nextInt();

        double alfa = (Math.PI/180) * (360/canLad);
        perBase = ((2 * Math.PI) * r); 
        areaBase = (Math.PI * (r * r));
        apo = (longlad / (2 * Math.tan(alfa)));
        apPir = (h * h + (apo * apo));
        areaLatera = perBase * apPir / 2;
        areaTotal = areaLatera + areaBase;
        volumen = areaBase * h / 3;

        System.out.println("Su area lateral es: "  + areaLatera);
        System.out.println("Su area Total es: " + areaTotal);
        System.out.println("Su volumen es:" + volumen);
        lector.close();

    }


} 