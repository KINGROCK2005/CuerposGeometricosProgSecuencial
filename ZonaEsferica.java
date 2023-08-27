import java.util.Scanner;
public class ZonaEsferica 
{
    public static void main(String []args){

        double  volZonaEsf, areazonaEsf, rm, h;
        double volCasEsf, areaCasEsf, rM;
        Scanner lector = new Scanner(System.in);

        System.out.println("Ingrese el radio menor: ");
        rm = lector.nextDouble();
        System.out.println("Ingrese el radio mayor: ");
        rM = lector.nextDouble();
        System.out.println("Ingrese la altura: ");
        h = lector.nextDouble();

        areazonaEsf = 2 * (Math.PI * (rM * h));
        volZonaEsf = (Math.PI * h * ((h * h) + (3 * (rm * rm) + (3 * (rm * rm))))) / 6;
        areaCasEsf = 2 * (Math.PI * (rM * h));
        volCasEsf = (Math.PI * (h * h) * (3 * rM) - h)/3; 

        System.out.println("El area de la zona esferica es: " + areazonaEsf);
        System.out.println("El volumen de la zona esferica es: " + volZonaEsf);
        System.out.println("El area del Casquete esferico es: " + areaCasEsf);
        System.out.println("El volumen del Casquete esferico es: " + volCasEsf);
        lector.close();

    }
    
}
