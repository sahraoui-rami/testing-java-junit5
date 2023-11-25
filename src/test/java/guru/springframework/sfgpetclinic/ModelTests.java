package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * Created by Rami SAHRAOUI on 24/11/2023
 */
@Tag("model")
public interface ModelTests {
    @BeforeEach
    default void setUp(TestInfo testInfo) {
        System.out.println( "Running Test Name: " + testInfo.getDisplayName());
    }
}
