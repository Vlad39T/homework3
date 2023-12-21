package homework3_30.Homework19;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Arr.MyArray<Double> myArray = new Arr.MyArray<>();
        myArray.fillKeyBoardArr(Double.class);
        System.out.println(Arrays.toString(myArray.arr));

//     fillRandomArr2(myArray);

        //Random для Integer
//        Task01.MyArray<Integer> myArray1 = new Task01.MyArray<>();
//        myArray1.fillRandomArr(Integer.class, 3);
//        System.out.println("Random Integer.class");
//        System.out.println(Arrays.toString(myArray1.arr));

        //Random для Double
//        myArray1.fillRandomArr(Double.class, 3);
//        System.out.println("Random Double.class");
//        System.out.println(Arrays.toString(myArray1.arr));

        myArray.displayArray();
        System.out.println("Max = " + myArray.maxValue());
        System.out.println("Min = " + myArray.minValue());
        System.out.println("Середнє арифметичне = " + myArray.average());
    }
}

