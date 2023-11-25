package guru.springframework.sfgpetclinic.model;

import guru.springframework.sfgpetclinic.ModelRepeatedTests;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.TestInfo;

/**
 * Created by Rami SAHRAOUI on 25/11/2023
 */
public class PersonRepeatedTest implements ModelRepeatedTests {
        @RepeatedTest(value = 10, name = "{displayName} : {currentRepetition} - {totalRepetitions}")
        @DisplayName("My Repeated Test")
        void myRepeatedTest() {
            // todo - impl
        }

        @RepeatedTest(5)
        @DisplayName("My Repeated Test With Dependency Injection")
        void myRepeatedTestWithDI(TestInfo testInfo, RepetitionInfo repetitionInfo) {
            System.out.println(testInfo.getDisplayName() + ": " + repetitionInfo.getCurrentRepetition() + " - "
                    + repetitionInfo.getTotalRepetitions());
        }

        @RepeatedTest(value = 5, name = "{displayName} -> {currentRepetition}|{totalRepetitions}")
        @DisplayName("Repeated Test")
        void assignmentRepeatedTest() {
            // todo - impl
        }
}
