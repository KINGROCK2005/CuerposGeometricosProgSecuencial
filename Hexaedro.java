import java.util.Scanner;
public class Hexaedro{

    public static void main(String []args){

        double areaTotal, arista, volumen, diametro;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        areaTotal = 6 * (Math.pow(arista,2));
        volumen = Math.pow(arista, 3);
        diametro =arista * (Math.sqrt(3));

        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen d=total es: " + volumen);
        System.out.println("El diametro es de: " + diametro);
        lector.close();

    }
}