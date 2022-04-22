import java.util.ArrayList;

public class Artist {
    private String name;
    private ArrayList<Artwork> work;

    public Artist(String name) {
        this.name = name;
        this.work = new ArrayList<Artwork>();
    }

    public ArrayList<Artwork> getWork() {
        return this.work;
    }

    public void addWork(Artwork artwork){
        this.work.add(artwork);
    }



}
