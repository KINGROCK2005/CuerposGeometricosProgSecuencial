import java.util.Scanner;
public class Tetraedro {

    public static void main(String []args){

        double arista, areaTotal, h, vertice;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese la arista del tetraedo: ");
        arista = lector.nextDouble();

        areaTotal = Math.pow(arista, 2) * (Math.sqrt (3));
        vertice = (Math.sqrt(2) * (Math.pow(arista, 3)) /12);
        h = arista * (Math.sqrt(6))/3;

        System.out.println("El area total es: " + areaTotal);
        System.out.println("El vertice es: " + vertice);
        System.out.println("La altura es: " + h);
        lector.close();

    }

}