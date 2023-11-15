package Homework17;

public interface Flash {
    void on();
    void off();
    boolean isLight() throws InterruptedException;
}
