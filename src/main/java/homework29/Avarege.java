package homework29;

public class Avarege extends Thread {
    int[] arr ;

    public Avarege(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum=0;
        for (int i = 0; i<arr.length;i++){
             sum += arr[i];
        }
        int avarage=sum/arr.length;

        System.out.println("Среднє арифметичне масиву = " + avarage );
    }
}
