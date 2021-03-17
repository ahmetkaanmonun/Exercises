package odev3;

public class ThirdQuestion {

    public static void main(String[] args){

        char[] array ={'h','e','l','l','o',' ','w','o','r','l','d'};


        String strX =String.valueOf(array);
        String world = strX.substring(6,11);
        StringBuilder str = new StringBuilder(world);
        System.out.println(str.reverse());



    }

}
