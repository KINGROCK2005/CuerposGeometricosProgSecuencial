import java.util.Scanner;
public class Octaedro{

    public static void main(String []args){
        double areaTotal, arista, volumen;
        Scanner lector =new Scanner(System.in);

        System.out.println("Inrese la arista: ");
        arista = lector.nextDouble();

        areaTotal = 2 * (Math.pow(arista,2)* (Math.sqrt(3)));
        volumen = (Math.sqrt(2) * Math.pow(arista,3))/3;

        System.out.println("El area total es: " + areaTotal);
        System.out.println("El volumen es de: " + volumen);
        lector.close();

    }
}