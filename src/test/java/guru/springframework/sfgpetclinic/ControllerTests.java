package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInstance;

/**
 * Created by Rami SAHRAOUI on 24/11/2023
 */
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
@Tag("controller")
public interface ControllerTests {
    @BeforeAll
    default void beforeAll() {
        System.out.println("\n\n############################################");
        System.out.println("Let's do something here\n\n");
    }
}
