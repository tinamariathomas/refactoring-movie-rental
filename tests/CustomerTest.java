import com.tw.Customer;
import com.tw.Movie;
import com.tw.Rental;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CustomerTest {
    Customer customer;
    Movie movie;
    Rental rental;

    @Before
    public void setUp() {
        customer = new Customer("Tina");
        movie = Movie.createChildrensMovie("Dumb and Dumber");
        rental = new Rental(movie, 50);
    }

    @Test
    public void testStatement() throws Exception {
        customer.addRental(rental);
        assertEquals(customer.statement(), "Rental Record for Tina\n" +
                "\tDumb and Dumber\t72.0\n" +
                "Amount owed is 72.0\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void testAddRental() throws Exception {

    }
}