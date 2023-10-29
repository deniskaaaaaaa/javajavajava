import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class RomanTest {

    @Test
    public void testConvertToRoman() {
        // Тестируем нижний предел
        Assertions.assertThat(Roman.convertToRoman(1)).isEqualTo("I");
        Assertions.assertThat(Roman.convertToRoman(4)).isEqualTo("IV");
        Assertions.assertThat(Roman.convertToRoman(9)).isEqualTo("IX");
        Assertions.assertThat(Roman.convertToRoman(10)).isEqualTo("X");
        Assertions.assertThat(Roman.convertToRoman(40)).isEqualTo("XL");
        Assertions.assertThat(Roman.convertToRoman(50)).isEqualTo("L");
        Assertions.assertThat(Roman.convertToRoman(90)).isEqualTo("XC");
        Assertions.assertThat(Roman.convertToRoman(100)).isEqualTo("C");
        Assertions.assertThat(Roman.convertToRoman(400)).isEqualTo("CD");
        Assertions.assertThat(Roman.convertToRoman(500)).isEqualTo("D");
        Assertions.assertThat(Roman.convertToRoman(900)).isEqualTo("CM");
        Assertions.assertThat(Roman.convertToRoman(1000)).isEqualTo("M");

        // Тестируем случайные числа
        Assertions.assertThat(Roman.convertToRoman(3999)).isEqualTo("MMCMXCIX");
        Assertions.assertThat(Roman.convertToRoman(1987)).isEqualTo("MCMLXXXVII");
        Assertions.assertThat(Roman.convertToRoman(123)).isEqualTo("CXXIII");
    }

    @Test
    public void testConvertToRomanWithInvalidInput() {
        // Тестируем недопустимые числа
        Assertions.assertThat(Roman.convertToRoman(0)).isEqualTo("Недопустимое число");
        Assertions.assertThat(Roman.convertToRoman(4000)).isEqualTo("Недопустимое число");
        Assertions.assertThat(Roman.convertToRoman(-1)).isEqualTo("Недопустимое число");
    }
}
