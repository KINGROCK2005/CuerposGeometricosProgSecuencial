import java.util.Scanner;

public class Ortoedro{

    public static void main(String []args){
        
        double  diagonal, arista, vertice;
        double  a, b, c, anguloTotal;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el lado mayor: ");
        a = lector.nextDouble();
        System.out.println("Ingrese el lado menor: ");
        b =  lector.nextDouble();
        System.out.println("Ingresela altura de la cara");
        c = lector.nextDouble();

        anguloTotal = 2 * ((a * b) + (a * c) + (b * c));
        diagonal = (Math.sqrt((a * a) + (b * b) + (c * c)));
        vertice =  a * b *c;

        System.out.println("El angulo total es de: " + anguloTotal);
        System.out.println("La diagonal tiene un valor de: " + diagonal);
        System.out.println("El vertice es de: " + vertice);
        lector.close();

        System.out.println("Muchas gracias x utilizar este programa");
 

    }
}