package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * Created by Rami SAHRAOUI on 25/11/2023
 */
@Tag("repeated")
public interface ModelRepeatedTests {
    @BeforeEach
    default void setUp(TestInfo testInfo, RepetitionInfo repetitionInfo) {
        System.out.println( "Running Test Name: " + testInfo.getDisplayName() +
                ". Current Iteration: " + repetitionInfo.getCurrentRepetition());
    }
}
