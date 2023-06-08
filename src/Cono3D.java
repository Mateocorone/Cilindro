import java.util.Scanner;

public class Cono3D{
   public Cono3D(){}

    public void imprimir()
    {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Ingrese las coordenadas del p1 (...,...,...):");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();
        double z1 = scanner.nextDouble();


        System.out.println("Ingrese las coordenadas del p2 (...,...,...):");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();
        double z2 = scanner.nextDouble();


        System.out.println("Ingrese las coordenadas del p3 (...,...,...):");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();
        double z3 = scanner.nextDouble();


        double radio = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2) + Math.pow(z2 - z1, 2));
        double altura = Math.sqrt(Math.pow(x3 - x2, 2) + Math.pow(y3 - y2, 2) + Math.pow(z3 - z2, 2));


        double volumen = (1.0/3.0) * Math.PI * Math.pow(radio, 2) * altura;


        double areaSuperficial = Math.PI * radio * (radio + Math.sqrt(Math.pow(radio, 2) + Math.pow(altura, 2)));

        System.out.println("Volumen: " + volumen);
        System.out.println("Ãrea Superficial: " + areaSuperficial);
    }
}
