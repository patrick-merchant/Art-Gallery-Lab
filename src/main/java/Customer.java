import java.util.ArrayList;

public class Customer {

    private String name;
    private float wallet;
    private ArrayList<Artwork> collection;

    public Customer(String name) {
        this.name = name;
        this.wallet = 1000;
        this.collection = new ArrayList<Artwork>();

    }

    public String getCustomerName(){
        return this.name;
    }

    public float getWallet(){
        return this.wallet;
    }

    public void addToCollection(Artwork artwork){
        this.collection.add(artwork);
    }

    public ArrayList<Artwork> getCollection(){
        return this.collection;
    }

    public void decreaseWallet(Artwork artwork) {
        this.wallet -= artwork.getArtworkPrice();
    }

    public String buyArtwork(Artwork artwork){
        if(this.getWallet() >= artwork.getArtworkPrice()) {
            addToCollection(artwork);
            decreaseWallet(artwork);
            return "Enjoy your purchase";
        } else {
            return "Sorry, not enough";
        }

    }

    // sell art fires:
    // CUSTOMER "buyArt" fucntion. Call addtoCollection. Also call wallet.
    // GALLERY addToGalleryCollection, AddToTill.

}
