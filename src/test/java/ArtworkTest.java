import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtworkTest {

    Artwork artwork;

    @BeforeEach

    public void setUp(){
        artwork = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "NFT");
    }

    @Test
    public void hasArtworkName(){
        assertThat(artwork.getArtworkName()).isEqualTo("Mona Lisa");
    }

    @Test
    public void hasArtistName(){
        assertThat(artwork.getArtistName()).isEqualTo("Leonardo da Vinci");
    }

    @Test
    public void hasArtworkPrice(){
        assertThat(artwork.getArtworkPrice()).isEqualTo(900);
    }

    @Test
    public void hasNFT(){
        assertThat(artwork.getNft()).isEqualTo("NFT");
    }

}
