package six;

public class Movie {
       public static int counter = 0;

        private String director;
        private String title;
        private int review;


    public Movie() {
        System.out.println("Kontruktor se pozvao");
        counter++;
    }

    public Movie (String title) {
        this.title = title;
        System.out.println("Konstruktor sa jednim parametrom se pozvao");
        counter++;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getReview() {
        return review;
    }

    public void setReview(int review) {
        this.review = review;
    }

}




//        public String getDirector(String director) {
//            return director;
//    }
//    public void setDirector(String director) {
//        this.director = director;
//    }
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//    public int getReview() {
//        return review;
//    }
//    public void setReview ( int review) {
//        if (review>=1 && review<=10){
//        this.review = review;
//    }}



