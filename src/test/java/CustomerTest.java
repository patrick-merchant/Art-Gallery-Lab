import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork mona;
    Artwork sunflowers;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Tom");
        gallery = new Gallery("Wallace Collection");
        mona = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "NFT");
        sunflowers = new Artwork("Sunflowers", "Leonardo da Vinci", 300, "NFT");
        gallery.addArtwork(mona);
        gallery.addArtwork(sunflowers);
    }

    @Test
    public void customerHasName(){
        assertThat(customer.getCustomerName()).isEqualTo("Tom");
    }

    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void canAddToCollection(){
        customer.addToCollection(mona);
        assertThat(customer.getCollection().size()).isEqualTo(1);
    }

//    @Test
//    public void hasWalletChanged(){
//        assertThat(customer.getWallet()).isEqualTo(100);
//    }


    @Test
    public void cannotBuyArtwork(){
        customer.decreaseWallet(sunflowers);
        assertThat(customer.buyArtwork(mona)).isEqualTo("Sorry, not enough");
    }

    @Test
    public void canBuyArtwork(){
        customer.addToCollection(mona);
        assertThat(customer.getCollection().size()).isEqualTo(1);
        customer.decreaseWallet(mona);
        assertThat(customer.getWallet()).isEqualTo(100);

    }
}
