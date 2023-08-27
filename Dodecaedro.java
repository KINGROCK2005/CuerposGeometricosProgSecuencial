import java.util.Scanner;
public class Dodecaedro{

    public static void main(String []args){

        double areaTotal, volumen, arista;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la arista: ");
        arista = lector.nextDouble();

        areaTotal = (double)3 * (arista * arista) * (Math.sqrt(25 + 10) * Math.sqrt(5));
        volumen = (double)(15 +  (7 *Math.sqrt(5))) * Math.pow(arista,3)/4;

        System.out.println("El area Total es de: " + areaTotal);
        System.out.println("Su volumen es: " + volumen);
        lector.close();

    }
}