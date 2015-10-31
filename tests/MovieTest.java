import com.tw.Movie;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MovieTest {

    Movie movie;
    @Before
    public void setUp(){
        movie = new Movie("Dumb and Dumber", Movie.CHILDRENS,1.5);
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

    @Test
    public void testGetBaseAmount() throws Exception {
        assertEquals(movie.getBaseAmount(),1.5,0);
    }

    @Test
    public void shouldCheckMoviePriceCode(){
        assertTrue(movie.isMovieOfPriceCode(Movie.CHILDRENS));
    }
}