public class Program {
    public static void main(String[] args) {

        byte firstNumber = 127;
        short secondNumber = 23_222;
        int thirdNumber = 55000;
        long fouthNumber = 55000L;

        int intNumber = 32000;
        long longNumber = intNumber;

        long longNumber2 = 32000;
        int intNumber2 = (int) longNumber2;

        short shortNumber2 = 128;
        byte byteNUmber2 = (byte) shortNumber2;

        int specijalniBroj1 = 26;  //dekadni brojevni sistem
        System.out.println(specijalniBroj1);
//        int specijalniBroj2 = 0xla; //hexadecimalni sistem
//        System.out.println(specijalniBroj2);
        int specijalniBroj3 = 0b11010;
        System.out.println(specijalniBroj3);

        char charVar = 87; //ASCII tabela
        System.out.println(charVar); //ispis W
        char charVariable = 'a';
        int intNumber3 = charVariable;
        System.out.println(intNumber3);





//        System.out.println("Vozdra raja..dobro nam došli..");
    }
}
