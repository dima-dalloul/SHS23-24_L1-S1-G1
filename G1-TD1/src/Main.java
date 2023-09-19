import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello Group 1 !");

        exercise2();
    }

    static void exercise1(){
        int a ;
        System.out.println("Entrez un entier :");
        Scanner s = new Scanner(System.in);
        a = s.nextInt();
        System.out.println("Le carré de " + a + " est " + a*a );
    }

     static void exercise2(){
        float width, height, paintQuantity, totalArea;
        double totalNumberContainers;
         Scanner s = new Scanner(System.in);

         System.out.println("Width of the wall:");
         width = s.nextFloat();

         System.out.println("Height of the wall:");
         height = s.nextFloat();

         System.out.println("Paint quantity per container:");
         paintQuantity = s.nextFloat();

         totalArea = width * height;

        totalNumberContainers =  Math.ceil(totalArea / paintQuantity);

         System.out.println("Your wall are is : " + totalArea + " and you will need " + totalNumberContainers
         + " containers");
     }
}