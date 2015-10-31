import com.tw.Movie;
import com.tw.Rental;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RentalTest {

    Rental rental;
    Movie movie;

    @Before
    public void setUp(){
        movie = Movie.createChildrensMovie("Dumb and Dumber");
        rental = new Rental(movie, 50);
    }

    @Test
    public void testGetDaysRented() throws Exception {

        assertEquals(rental.getDaysRented(),50);
    }

    @Test
    public void testGetMovie() throws Exception {
        assertEquals(rental.getMovie(), movie);
    }

    @Test
    public void testGetRentalAmount(){
        assertEquals(rental.getRentalAmount(), 72, 0.0);
    }

    @Test
    public void testGetFrequentRentalPoints(){
        assertEquals(rental.getFrequentRentalPoints(), 1);
    }
}