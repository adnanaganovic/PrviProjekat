package two;

public class BitOperatorDemo {
    public static void main(String[] args) {
        int x = 2;
        x = x<<1; // x = x * 2 na prvu
        System.out.println("Pomjeraj za jedan (šiftaj za jedan) ="+x);

        x = 2;
        x = x<<2; // x = x * 2 na drugu
        System.out.println("Pomjeraj za dva (šiftaj za dva) ="+x);

        x = 2;
        x = x<<3; // x = x * 2 na treću
        System.out.println("Pomjeraj za tri u lijevo (šiftaj za tri) ="+x);

        x = 2;
        x = x>>1; // x = x / 2 na prvu
        System.out.println("Pomjeraj za 1 u desno (šiftaj za 1) ="+x);

        x = 16;
        x = x>>2; // x = x / 2 na prvu
        System.out.println("Pomjeraj za 2 u desno (šiftaj za 2) ="+x);
    }
}
