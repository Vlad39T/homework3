package homework3_30.homework29;

public class Sum extends  Thread {
    int[] arr ;

    public Sum(int[] arr) {
        this.arr = arr;
    }

    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i<arr.length;i++){
            sum+=arr[i];
        }
        System.out.println("Сума всіх елементів масиву = " + sum );
    }
}
