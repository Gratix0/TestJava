import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import static org.junit.jupiter.api.Assertions.assertThrows;


import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

class FirstWordLetterTest {


    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        System.out.println("Я BeforeEach юзаюсь каждый раз когда запускается тест");
    }
    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        System.out.println("Я AfterEach юзаюсь каждый раз после выполнения теста");
    }

    @org.junit.jupiter.api.Test
    void sum() {
        FirstWordLetter firstWordLetter = new FirstWordLetter();
        assertEquals("хачапури", firstWordLetter.findWordWithMostI("Хачу два хачапури"));
        System.out.println(firstWordLetter.findWordWithMostI("Хачу два хачапури"));
    }

    @Disabled
    void ignoreLutiy(){
        System.out.println("Меня заигнорили(((");
    }

    @org.junit.jupiter.api.Test
    @Disabled
    void sum2() {
        FirstWordLetter firstWordLetter = new FirstWordLetter();
        assertEquals("ПТИН", firstWordLetter.findWordWithMostI("Первый тест. Или нет"));
        System.out.println("Test");
    }
    @org.junit.jupiter.api.Test
    @Timeout(value = 5, unit = TimeUnit.SECONDS)
    void sum3() {
        FirstWordLetter firstWordLetter = new FirstWordLetter();
        assertEquals("", firstWordLetter.findWordWithMostI("ПускайбудетОднаП"));
        System.out.println(firstWordLetter.findWordWithMostI("ПускайбудетОднаП"));
        assertThrows(IllegalArgumentException.class, () -> firstWordLetter.findWordWithMostI("ПускайбудетОднаП"),
                "Ожидалось слово содержащее букву И");
    }


}