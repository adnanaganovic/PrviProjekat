package two;

public class AritmeticDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        int broj2 = 13;
//Addition sabiranje
        int result = broj1 + broj2;
        System.out.println("Suma = " + result);
//Subtraction oduzimanje
        result = result - 3;
        System.out.println("Oduzeto od sume: "+result);
        //Multiplication
        result = result*2;
        System.out.println("Umnoženo ="+ result);
        //Division
        result = result/3;
        System.out.println("Dijeljenje =" +result);
        //MODULO
        result = result % 6;
        System.out.println("Modulo je ostatak od dijeljenja sa 6, tj. ="+result);


    }
}
