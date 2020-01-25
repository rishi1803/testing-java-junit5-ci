package guru.springframework.sfgpetclinic;

import org.junit.jupiter.api.extension.ExtensionContext;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.ArgumentsProvider;

import java.util.stream.Stream;

/**
 * Created by Rishabh on 25,Jan,2020
 */
public class CustomArgsProvider implements ArgumentsProvider {
    @Override
    public Stream<? extends Arguments> provideArguments(ExtensionContext extensionContext) throws Exception {
        return Stream.of(
                Arguments.of("UK",1,5),
                Arguments.of("RJ",2,9),
                Arguments.of("GA",3,3)
        );
    }
}
