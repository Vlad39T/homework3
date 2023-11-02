package Homework14;

public class Range {
    int x;
    int y;
    int count;

    public Range(int a, int b) {
        this.x = a;
        this.y = b;
    }

    @Override
    public String toString() {
        return "Діапазон " +
                "x=" + x +
                ", y=" + y
                ;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean Examination(Range pvp) {
        if (this.x<pvp.getX()&&this.y<pvp.getX()||this.x>pvp.getY()){
            return false;
        }else {
            return true;
        }
    }
}



