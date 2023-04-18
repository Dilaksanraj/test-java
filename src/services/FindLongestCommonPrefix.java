package services;

public class FindLongestCommonPrefix {

    public static String find(String[] str){

        String prefix = str[0];

        for (int i = 1; i<str.length; i++){
            while(str[i].indexOf(prefix) != 0){
                prefix = prefix.substring(0,prefix.length()-1);

                if(prefix.isEmpty()){
                    return "No common prefix found 🤨";
                }
            }
        }

        return prefix;
    }
}
