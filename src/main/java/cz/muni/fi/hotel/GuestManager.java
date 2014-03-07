package cz.muni.fi.hotel;

import java.util.List;

/**
 *
 */
public interface GuestManager {
    /**
     * Creates new guest.
     * @param guest new guest
     */
    public void createGuest(Guest guest);

    /**
     * Returns guest by his/her id.
     * @param id his/her id
     * @return guest
     */
    public Guest getGuestById(int id);

    /**
     * Returns all guests by their id.
     * @return guests
     */
    public List<Guest> getAllGuests();

    /**
     * Updates information about the guest.
     * @param guest guest
     */
    public void updateGuest(Guest guest);

    /**
     * Deletes guest.
     * @param guest guest
     */
    public void deleteGuest(Guest guest);
}
