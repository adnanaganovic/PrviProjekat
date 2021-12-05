package two;

public class UnaryDemo {
    public static void main(String[] args) {
        int broj1 = 23;
        System.out.println("Broj 1 ="+broj1);
        broj1 = -broj1;
        System.out.println("Broj1 sa minus =" +broj1);
        broj1++;
        System.out.println("Post increment ="+broj1);

        broj1 = 32;
        broj1++;
        System.out.println("Post increment ="+broj1);
        broj1 = 32;
        ++broj1;
        System.out.println("Pre increment =" +broj1);

        broj1 = 23;
        System.out.println(broj1++);
        System.out.println(broj1);
        broj1=23;
        System.out.println(++broj1);
        System.out.println(broj1);

        //POST DEKREMENT
        broj1 = 23;
        System.out.println(broj1--);
        System.out.println(broj1);

        //PREDEKREMENT
        broj1 = 23;
        System.out.println(--broj1);
        System.out.println(broj1);

        //operator NEGACIJA (! + varijabla)

        boolean jesiLav = false;
        System.out.println(!jesiLav);

    }
}
