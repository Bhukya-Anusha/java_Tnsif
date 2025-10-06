package testing;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.params.provider.ValueSource;
import org.junit.platform.commons.annotation.Testable;

@Testable
public class ParameterTest {

	@ParameterizedTest
	@ValueSource(strings = {"cali", "bali"})
	void endswith(String str) {
		assertTrue(str.endsWith("i"));
	}
}

