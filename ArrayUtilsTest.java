
//import com.sun.tools.javac.util.Assert;
import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.api.Assertions;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class ArrayUtilsTest {
    @ParameterizedTest
    @MethodSource("actualAndExpectedResultsProvider")
    void shouldReturnArrayAfterSearch(int [] parameters, int[] expected){
        assertArrayEquals(expected,ArrayUtils.findElementsAfterDigit(parameters, 4));
    }

    private static Stream<Arguments> actualAndExpectedResultsProvider(){
        return Stream.of(
                Arguments.arguments(new int[] {1,2,3,4,5},new int[] {5}),
                Arguments.arguments(new int[] {1,2,3,4,4,5,8,5,1},new int[] {5,8,5,1}),
                Arguments.arguments(new int[] {1,2,3,4,4},new int[] {})
                );
    }

    @ParameterizedTest
    @NullAndEmptySource
    @MethodSource("wrongParametersProvider")
    void shouldThrowRuntimeExceptionWhenValueNotFound(final int[] parameters){
        Assertions.assertNotNull(
                Assertions.assertThrows(
                        RuntimeException.class,
                        ()-> ArrayUtils.findElementsAfterDigit(parameters,4)
                )
        );
    }

    private static Stream<int[]> wrongParametersProvider(){
        return Stream.of(new int[]{1,2,3,5});
    }

    @ParameterizedTest
    @MethodSource("actualAndExpectedResults")
    void shouldReturnFalseIfArrayNotContains_1or4(int [] parameters){

        assertFalse(ArrayUtils.Only1And4(parameters));

    }

    private static Stream<Arguments> actualAndExpectedResults(){
        return Stream.of(
                Arguments.arguments(new int[]{1, 1, 4, 4, 4, 1, 4, 1}, true),
                Arguments.arguments(new int[]{8, 8, 7, 7, 7, 3, 5, 1}, false),
                Arguments.arguments(new int[]{1, 4, 8, 7}, false)
        );
    }




}
