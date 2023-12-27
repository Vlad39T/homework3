package homework31_50.homework33;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void maxPositiv() {
        int give =calculator.max(20,30);
        int waiting = 30;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void maxNegativ() {
        int give =calculator.max(-20,-60);
        int waiting = -20;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void maxPosAndNeg() {
        int give =calculator.max(30,-25);
        int waiting = 30;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void maxNegAndPos() {
        int give =calculator.max(-20,15);
        int waiting = 15;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void minPositiv() {
        int give =calculator.min(20,30);
        int waiting = 20;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void minNegativ() {
        int give =calculator.min(-140,-123);
        int waiting = -140;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void minPosAndNeg() {
        int give =calculator.min(2,-23);
        int waiting = -23;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void minNegAndPos() {
        int give =calculator.min(-2,3);
        int waiting = -2;
        Assertions.assertEquals(waiting,give);
    }

    @Test
    void procentPos() {
        double give =calculator.procent(75,20);
        double waiting = 15;
        Assertions.assertEquals(waiting, give);
    }

    @Test
    void procentNeg() {
        double give =calculator.procent(-125,20);
        double waiting = -25;
        Assertions.assertEquals(waiting, give);
    }

    @Test
    void degreePos() {
        float give =calculator.degree(3F,4F);
        float waiting = 81F;
        Assertions.assertEquals(waiting, give);
    }

    @Test
    void degreeNeg() {
        float give =calculator.degree(-6F,5F);
        float waiting = -7776;
        Assertions.assertEquals(waiting, give);
    }

    @Test
    void degreeFractionalNumberPos() {
        float give =calculator.degree(0.7F,3F);
        float waiting = 0.343F;
        Assertions.assertEquals(waiting, give);
    }

    @Test
    void degreeFractionalNumberNeg() {
        float give =calculator.degree(-0.2F,3F);
        float waiting = (float) -0.008;
        Assertions.assertEquals(waiting, give);
    }


}