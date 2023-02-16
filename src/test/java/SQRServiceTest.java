package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.netology.sqr.SQRService;
import static org.junit.jupiter.api.Assertions.*;
public class SQRServiceTest {
    @Test
    void findAllValidSquares() {
        SQRService service = new SQRService();
        int actual = service.howManySquares(200, 300);
        int expected = 3;
        Assertions.assertEquals(expected, actual);
    }
}