package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.TestInfo;

/**
 * Created by Rishabh on 21,Jan,2020
 */
@Tag("model")
public interface ModelTests {

    @BeforeEach
    default void beforeEachConsoleOutputer(TestInfo testInfo) {
        System.out.println("Running Test - " + testInfo.getDisplayName());
    }
}
