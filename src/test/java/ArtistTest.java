import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ArtistTest {
    Artist artist;
    Artwork mona;
    Artwork sunflowers;

    @BeforeEach
    public void setUp(){
        artist = new Artist("Leonardo da Vinci");
        mona = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "NFT");
        sunflowers = new Artwork("Sunflowers", "Leonardo da Vinci", 300, "NFT");
    }

    @Test
    public void artistHasWork(){
        artist.addWork(mona);
        artist.addWork(sunflowers);
        assertThat(artist.getWork().size()).isEqualTo(2);
    }
}
