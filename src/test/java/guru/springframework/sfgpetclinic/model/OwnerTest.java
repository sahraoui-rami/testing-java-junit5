package guru.springframework.sfgpetclinic.model;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by Rami SAHRAOUI on 18/11/2023
 */
@Tag("model")
class OwnerTest {
    @Test
    void dependentAssertions() {
        // given
        Owner owner = new Owner(1L, "Joe", "Buck");
        owner.setCity("Key West");
        owner.setTelephone("1231231234");

        // then
        assertAll("Properties Test",
                () -> assertAll("Person Properties",
                        () -> assertEquals("Joe", owner.getFirstName(), "First Name Did Not Match"),
                        () -> assertEquals("Buck", owner.getLastName(), "Last Name Did Not Match")
                ),
                () -> assertAll("Owner Properties",
                        () -> assertEquals("Key West", owner.getCity(), "City Did Not Match"),
                        () -> assertEquals("1231231234", owner.getTelephone(), "Telephone Did Not Match")
                )
        );

        assertThat("City Did Not Match",owner.getCity(), is("Key West"));
    }
}
