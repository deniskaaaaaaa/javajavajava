import org.junit.jupiter.api.Test;
import org.assertj.core.api.Assertions;

public class AtbashTest {

    @Test
    public void testAtbashCipher() {
        Assertions.assertThat(Atbash.atbashcipher("Hello, World!")).isEqualTo("Svool, Dliow!");
        Assertions.assertThat(Atbash.atbashcipher("1234")).isEqualTo("1234"); // Не изменяет цифры
        Assertions.assertThat(Atbash.atbashcipher("")).isEqualTo(""); // Пустая строка
        Assertions.assertThat(Atbash.atbashcipher("AbCdEfG")).isEqualTo("AyXwVuT"); // Смешанный регистр
        Assertions.assertThat(Atbash.atbashcipher("atbash")).isEqualTo("zgyzhs"); // Входная строка "atbash" должна быть перевернутой
    }

    @Test
    public void testAtbashCipherWithEmptyString() {
        Assertions.assertThat(Atbash.atbashcipher("")).isEmpty();
    }

    @Test
    public void testAtbashCipherWithNullInput() {
        // Если входная строка равна null, метод должен вернуть пустую строку
        Assertions.assertThat(Atbash.atbashcipher(null)).isEmpty();
    }
}
