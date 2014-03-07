package cz.muni.fi.hotel;

import org.junit.Test;

import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.hamcrest.core.IsEqual.equalTo;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.fail;

/**
 * Created by Adam on 05.03.14.
 */
public class GuestManagerImplTest {
    @Test
    public void testCreateGuestWithNegativeId() throws Exception {
        Calendar cal = new GregorianCalendar(1990, 11, 15);
        try {
            Guest guest = new Guest(-1, "Adam", "Tomek", cal, "604670694", "Záměstí 151, Choceň");
            fail("Nevyhozeno IllegalArgumentException pro zaporne ID.");
        } catch (IllegalArgumentException ex) { }
    }

    @Test
    public void testGetGuestById() throws Exception {
        Calendar cal = new GregorianCalendar(1990, 11, 15);
        Guest guest = new Guest(23, "Adam", "Tomek", cal, "604670694", "Záměstí 151, Choceň");

        GuestManagerImpl guestManager = new GuestManagerImpl();
        guestManager.createGuest(guest);

        assertEquals(guest, guestManager.getGuestById(23));
    }

    @Test
    public void testDeleteGuestWithNull() throws Exception {
        GuestManagerImpl guestManager = new GuestManagerImpl();
        try {
            guestManager.deleteGuest(null);
            fail("Nevyhozeno NullPointerException pro Null parametr.");
        } catch (Exception ex) { }
    }
}
