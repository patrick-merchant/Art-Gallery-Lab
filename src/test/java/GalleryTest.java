import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class GalleryTest {

        Gallery gallery;
        Artwork mona;
        Customer tom;

        @BeforeEach
        public void setUp(){
            gallery = new Gallery("Wallace Collection");
            mona = new Artwork("Mona Lisa", "Leonardo da Vinci", 900, "NFT");
            tom = new Customer("Tom");
        }

        @Test
        public void hasGalleryName() {
            assertThat(gallery.getGalleryName()).isEqualTo("Wallace Collection");
        }

        @Test
        public void canAddArtwork(){
            gallery.addArtwork(mona);
            assertThat(gallery.getArtwork().size()).isEqualTo(1);
            }

        @Test
        public void canSellArtwork(){
            gallery.addArtwork(mona);
            gallery.removeArtwork(mona);
            assertThat(gallery.getArtwork().size()).isEqualTo(0);
            gallery.increaseTill(mona);
            assertThat(gallery.getTill()).isEqualTo(900);
        }

        @Test
        public void canSellArtwork1(){
            gallery.sellArtwork(mona, tom);
            assertThat(gallery.getArtwork().size()).isEqualTo(0);
            assertThat(gallery.getTill()).isEqualTo(900);
        }


    }

