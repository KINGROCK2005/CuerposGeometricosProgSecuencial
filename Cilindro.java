import java.util.Scanner;
public class Cilindro {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
            //COMENTARIO COMENTARIO...
        double areaLateral, areaTotal, volumen;
        double perBase, areaBase, h, r;
        
        System.out.println("Ingrese la altura: ");
        h = lector.nextDouble();
        System.out.println("Ingrese el radio: ");
        r = lector.nextDouble();
        areaBase = (  Math.PI * (r * r) );
        perBase = ((2 * Math.PI) * r);
        areaLateral = perBase * h;
        areaTotal = (areaLateral * (2 * areaBase));
        volumen = areaBase * h;

        System.out.println("Su area lateral es: " + areaLateral);
        System.out.println("Su area Total es: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();
    }
}
