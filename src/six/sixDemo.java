package six;

   // MODIFIKATORI VIDLJIVOSTI
    //PUBLIC, PAKETNO PRIVATNI, PRIVATNI, PROTECTED

public class sixDemo {
    public static void main(String[] args) {
        System.out.println(Movie.counter);


        Movie movie1 = new Movie();
        movie1.setDirector ("Tarantion");
        movie1.setTitle ("Django");
        movie1.setReview (9);


        Movie movie2 = new Movie();
        movie2.setDirector("Spielberg");
        movie2.setTitle("Jurasic park");
        movie2.setReview(8);

        Movie movie3 = new Movie();
        movie3.setDirector ("Tanovic");
        movie3.setTitle ("Nicija zemlja");
        movie3.setReview (7);


    }
}

//        Movie movie = new Movie();
//        movie.director = "Tarantion";
//        movie.title = "Django";
//        movie.setReview(9);
//
//
//        Movie movie1 = new Movie();
//        movie.director = "Spielberg";
//        movie.title = "Jurasic park";
//        movie.setReview(8);
//
//        Movie movie2 = new Movie();
//        movie.director = "Tanovic";
//        movie.title = "Nicija zemlja";
//        movie.setReview(7);