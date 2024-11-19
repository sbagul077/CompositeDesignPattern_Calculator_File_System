package ProblemStatement;

public class Main {

    public static void main(String args[]){
        Directory movieDirectory = new Directory("Movie");

        File ForestGump = new File("Forest Gump");
        movieDirectory.add(ForestGump);


        Directory comedyMovieDirectory = new Directory("ComedyMovie");
        File PulpFiction = new File("Pulp Fiction");
        comedyMovieDirectory.add(PulpFiction);
        movieDirectory.add(comedyMovieDirectory);
    }
}
