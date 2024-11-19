package Solution1WithCompositeDesign;

public class Main {

    public static void main(String args[]){
        Directory movieDirectory = new Directory("Movies");

        FileSystem forestgump = new File("Forest Gump");
        movieDirectory.add(forestgump);

        FileSystem terminal = new File("Terminal");
        movieDirectory.add(terminal);

        FileSystem big = new File("Big");
        movieDirectory.add(big);

        Directory comedyMovieDirectory = new Directory("Comedy Movie");
        File pulpFiction = new File("Pulp Fiction");
        File heraPheri = new File("Hera Pheri");
        File stree = new File("Stree");
        File stree2 = new File("Stree 2");

        comedyMovieDirectory.add(pulpFiction);
        comedyMovieDirectory.add(heraPheri);
        comedyMovieDirectory.add(stree2);
        comedyMovieDirectory.add(stree);

        movieDirectory.add(comedyMovieDirectory);

        movieDirectory.ls();
    }
}
