package services;

public class ShortService {
    public static int[] sort(int[] str){


        for (int i=0; i< str.length; i++){
            for (int j=0; j<str.length - i - 1; j++){

                if(str[j]>str[j+1]){
                    int temp = str[j];
                    str[j] = str[j+1];
                    str[j+1] = temp;
                }
            }
        }
        return str;
    }
}
