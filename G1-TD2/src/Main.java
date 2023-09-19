import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        exercise2();

    }

    static void exercise1(){
        Scanner s =  new Scanner(System.in);
        float x, y;

        System.out.println("Write the first float : ");
        x = s.nextFloat();

        System.out.println("Write the second float : ");
        y = s.nextFloat();

        /* First way to write the multiple if-else-if
        if (x < y) {
            System.out.println(x + " is smaller than " + y);
        } else {
            if (x == y){
                System.out.println(x + " is equal to " + y);
            } else {
                System.out.println(x + " is greater than " + y);
            }
        }
        */

        // Second way to write multiple if-else-if
        if (x < y) {
            System.out.println(x + " is smaller than " + y);
        } else if (x == y){
            System.out.println(x + " is equal to " + y);
        } else {
            System.out.println(x + " is greater than " + y);
        }

        s.close();
    }

    static void exercise2(){
        Scanner s =  new Scanner(System.in);
        float x, y, z;

        System.out.print("What is the value of a ? ");
        x = s.nextFloat();

        System.out.println("What is the value of b ? ");
        y = s.nextFloat();

        System.out.println("What is the value of c ? ");
        z = s.nextFloat();

        // First way : write all the conditions
        /*
        if( x > y && y > z){

            System.out.println( x + " > " + y + " > " + z);
        }
        if( x > z && z > y){
            System.out.println( x + " > " + z + " > " + y);
        }
        if( y > x && x > z){
            System.out.println( y + " > " + x + " > " + z);
        }
        if( y > z && z > x){
            System.out.println( y + " > " + z + " > " + x);
        }
        if( z > x && x > y){
            System.out.println( z + " > " + x + " > " + y);
        }
        if( z > y && y > x){
            System.out.println( z + " > " + y + " > " + x);
        }
        */

        // Second way : we're going to use if-else-if
        if( x < y ){
            if( z < x){                     // Case Z < X < Y
                System.out.println( z + " < " + x + " < " + y);
            }  else if ( z < y ){         // Case X < Z < Y
                System.out.println( x + " < " + z + " < " + y);
            } else {                    // Case X < Y < Z
                System.out.println( x + " < " + y + " < " + z);
            }
        } else {
            if( z < y ){                     // Case Z < Y < X
                System.out.println( z + " < " + y + " < " + x);
            }  else if ( z < x ){           // Case Y < Z < X
                System.out.println( y + " < " + z + " < " + x);
            } else {                        // Case Y < X < Z
                System.out.println( y + " < " + z + " < " + x);
            }
        }
        s.close();
    }
}