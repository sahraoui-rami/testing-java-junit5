package guru.springframework.sfgpetclinic.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

/**
 * Created by Rami SAHRAOUI on 17/11/2023
 */
class IndexControllerTest {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View Name is Returned for Index Page")
    @Test
    void index() {
        assertEquals("index", controller.index());
        assertEquals("index", controller.index(), "Wrong View Returned");
        assertEquals("index", controller.index(), () -> "Another Expensive Message - " +
                "Make me only if you have to");

        assertThat(controller.index()).isEqualTo("index");
        assertThat(controller.index()).as("Test View Name").withFailMessage("Wrong View Returned").isEqualTo("indexes");
    }

    @Test
    @DisplayName("Test Exception")
    void oopsHandler() {
        assertThrows(ValueNotFoundException.class, () -> controller.oopsHandler());
    }

    @Disabled("Demo of timout")
    @Test
    void testTimout() {
        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I got here");
        });
    }

    @Disabled("Demo of timout")
    @Test
    void testTimoutPreemptively() {
        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);
            System.out.println("I couldn't be here!!!");
        });
    }

    @Test
    void testAssumption() {
        assumeTrue("SAHRAOUI".equalsIgnoreCase(System.getenv("SAHRAOUI_RUNTIME")));
    }
    @Test
    void testAssumptionTrue() {
        assumeTrue("SAHRAOUI".equalsIgnoreCase("SAHRAOUI"));
    }

    @EnabledOnOs(OS.MAC)
    @Test
    void testMeOnMacOS() {
    }

    @EnabledOnOs(OS.WINDOWS)
    @Test
    void testMeOnWindows() {
    }

    @EnabledOnJre(JRE.JAVA_8)
    @Test
    void testMeOnJava8() {
    }
    @EnabledOnJre(JRE.JAVA_11)
    @Test
    void testMeOnJava11() {
    }

    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "Rami Sahraoui")
    @Test
    void testMeOnRamiSahraoui() {
    }
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "user")
    @Test
    void testMeOnUser() {
    }
    @EnabledIfEnvironmentVariable(named = "USERNAME", matches = "JT")
    @Test
    void testMeOnJT() {
    }
}
