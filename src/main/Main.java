package main;

import Models.*;
import services.FindLongestCommonPrefix;
import services.ShortService;

public class Main {
    public static void main(String[] args) {
        System.out.println("Dilaksanraj");
//        Car benz = new Car();
//        benz.engine();
//
//        Bike honda = new Bike();
//        honda.engine();
//
//        Vehicle vehicle = new Vehicle();
//        vehicle.engine();
//
//        Vehicle car = new Car();
//        car.engine();
//
//        int num = 12;
//        String name = "10";
//
//        System.out.println(num+name);
//
//        Dog dog = new Dog();
//        dog.makeSound();
//        dog.printInfo();

//        int[] numbers;
//        numbers = new int[10];
//        for(int i = 0; i<10; i++){
//            numbers[i] = 10+i;
//        }
//
//        for (int j = 0; j<numbers.length; j++){
//            if(numbers[j]%2 == 0){
//                System.out.println("this is event: " + numbers[j]);
//            }
//            else{
//                System.out.println("this is odd: " + numbers[j]);
//            }
//        }
        int [] array1 = {1, 2, 3, 4, 5}; //array1
        int[] array2 = {6, 7, 8, 9, 10}; // array2
        int[] mergeArray = mergeArrays(array1,array2); // access merge array fn

        System.out.println("Merge Array");
        for(int i = 0; i< mergeArray.length; i++){
            System.out.println(mergeArray[i]);
        }

        int[] newArray = push(array1,123);

        for (int newnum: newArray) {
            System.out.println(newnum);
        }


        Student[] students = new Student[3];
        students[0] = new Student("Dilaksanraj", "test@mail", 23);
        students[1] = new Student("pavi", "test@mail", 23);
        students[2] = new Student("visalan", "test@mail", 23);

        for (Student student:students
             ) {
            System.out.println(student.toString());
            System.out.println("End Student1");
        }


        String[] strs1 = {"dilaksan", "dilaksanraj", "Dilaksanra"};
        String prefix = FindLongestCommonPrefix.find(strs1);

        System.out.println(FindLongestCommonPrefix.find(strs1));

        int[] sortArray = {8,1,4,6,0,10};
         int[] sortedArr = ShortService.sort(sortArray);

        for (int i = 0; i<sortedArr.length; i++){
            System.out.println(sortedArr[i]);
        }

        Days days = Days.FRI;

        switch (days){
            case MON: System.out.println("Monday");
                break;
            case TUE:
                System.out.println("TuesDay");
                break;
            case WED:
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("date not found");
                break;
        }


    }

    public static int[] mergeArrays(int[] array1, int[] array2){
        int[] mergeArray = new int[array1.length+array2.length]; // create new array with length of arra1+arr2
        System.arraycopy(array1,0,mergeArray,0,array1.length); // copy arr1 into mergeArray
        System.arraycopy(array2,0,mergeArray,array1.length,array2.length); // copy arr2 into copy array after arr1
        return mergeArray;
    }

    public static int[] push(int[] arr, int newElement){

        int[] newArr = new int[arr.length + 1];

        System.arraycopy(arr,0,newArr,0,arr.length);

        newArr[arr.length] = newElement;

        return newArr;
    }

    public enum Days{
        MON,
        TUE,
        WED,
        THU,
        FRI,
        SAT,
        SUN

    }
}
