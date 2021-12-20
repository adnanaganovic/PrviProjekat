package four.Loop;

public class EnhancedForLoop {
    public static void main(String[] args) {
        //Enhanced = poboljšan
        int [] numbers = {23, 13, 123, 1234, 45, 67, 78};
//        System.out.println("Element na indeksu 0: " + numbers[0]);
//        System.out.println("Element na indeksu 1: " + numbers[1]);
//        System.out.println("Element na indeksu 2: " + numbers[2]);
//        System.out.println("Element na indeksu 3: " + numbers[3]);
//        System.out.println("Element na indeksu 4: " + numbers[4]);
//        System.out.println("Element na indeksu 5: " + numbers[5]);
//        System.out.println("Element na indeksu 6: " + numbers[6]);

//        for (int i = 0; i<numbers.length; i++){
//            System.out.println("Element na indeksu: " + i + ": " + numbers[i]);
//        }

//        System.out.println();
//        System.out.println("Samo parni brojevi");
//        for(int i = 0, i;<numbers.length, i++;) {
//            if(numbers[i]%2!=0) {
//                System.out.println("Neparan broj na index " + i + " je " + numbers[i]);
//            }

        System.out.println();
        System.out.println("Enhanced for loop");
        for(int number : numbers) {
        System.out.println(number);
        }
    }}

