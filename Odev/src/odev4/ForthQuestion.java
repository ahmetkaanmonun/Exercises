package odev4;

public class ForthQuestion {

    public static void main(String[] args){

       boolean a = isUnique("Keeaann");
        System.out.println(a);

    }
    public static boolean isUnique(String word){


        for(int i=0;i< word.length();i++){

            for (int j = i+1;j<word.length();j++){

                if(word.charAt(i) == word.charAt(j)){

                    return false;

                }


            }

        }
        return true;
    }


}
