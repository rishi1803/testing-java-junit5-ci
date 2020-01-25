package guru.springframework.sfgpetclinic.controllers;

import guru.springframework.sfgpetclinic.ControllerTests;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.*;

import java.time.Duration;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assumptions.*;


/**
 * Created by Rishabh on 14,Jan,2020
 */
class IndexControllerTest implements ControllerTests {

    IndexController controller;

    @BeforeEach
    void setUp() {
        controller = new IndexController();
    }

    @DisplayName("Test Proper View name is returned for index page")
    @Test
    void index() {
        assertEquals("index",controller.index());
        assertEquals("index",controller.index(),"Wrong view returned");

        assertThat(controller.index()).isEqualTo("index");
    }

    @Test
    @DisplayName("Test exception")
    void oupsHandler() {
        assertThrows(ValueNotFoundException.class, () -> {
            controller.oopsHandler();
        });
    }

    @Disabled("Demo of Timeout")
    @Test
    void testTimeout() {

        assertTimeout(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);

            System.out.println("I got here");
        });
    }

    @Disabled("Demo of Timeout")
    @Test
    void testTimeoutPremt() {

        assertTimeoutPreemptively(Duration.ofMillis(100), () -> {
            Thread.sleep(5000);

            System.out.println("I got here 23243554363");
        });
    }

    @Test
    void testAssumptionTrue() {

        assumeFalse("GURU".equalsIgnoreCase(System.getenv("GURU_RUNTIME")));
    }

    @Test
    void testAssumptionTrueAssumptionIsTrue() {

        assumeTrue("GURU".equalsIgnoreCase("GURU"));
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

    @EnabledIfEnvironmentVariable(named = "USER", matches = "jt")
    @Test
    void testIfUserJT() {
    }

    @EnabledIfEnvironmentVariable(named = "USER", matches = "fred")
    @Test
    void testIfUserFred() {
    }
}