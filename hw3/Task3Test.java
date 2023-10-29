import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class Task3Test {

    @Test
    public void testFreqDict() {
        List<String> inputList = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "cherry", "cherry");
        Map<String, Integer> freqMap = Task3.freqDict(inputList);

        Assertions.assertThat(freqMap).containsOnly(
            entry("apple", 2),
            entry("banana", 2),
            entry("cherry", 3)
        );

        List<Integer> inputList2 = Arrays.asList(1, 2, 3, 2, 1, 2, 3, 4, 5);
        Map<Integer, Integer> freqMap2 = Task3.freqDict(inputList2);

        Assertions.assertThat(freqMap2).containsOnly(
            entry(1, 2),
            entry(2, 3),
            entry(3, 2),
            entry(4, 1),
            entry(5, 1)
        );
    }

    @Test
    public void testFreqDictWithEmptyList() {
        List<String> inputList = new ArrayList<>();
        Map<String, Integer> freqMap = Task3.freqDict(inputList);
        Assertions.assertThat(freqMap).isEmpty();
    }

    @Test
    public void testFreqDictWithNullList() {
        Map<String, Integer> freqMap = Task3.freqDict(null);
        Assertions.assertThat(freqMap).isEmpty();
    }
}
