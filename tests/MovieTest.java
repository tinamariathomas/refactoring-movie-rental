import com.tw.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    Movie movie;
    @Before
    public void setUp(){
        movie = new Movie("Dumb and Dumber", Movie.CHILDRENS);
    }

    @Test
    public void testGetPriceCode() throws Exception {
        assertEquals(movie.getPriceCode(),Movie.CHILDRENS);
    }

    @Test
    public void testSetPriceCode() throws Exception {
        movie.setPriceCode(Movie.NEW_RELEASE);
        assertEquals(movie.getPriceCode(), Movie.NEW_RELEASE);
    }

    @Test
    public void testGetTitle() throws Exception {
        assertEquals(movie.getTitle(),"Dumb and Dumber");
    }
}