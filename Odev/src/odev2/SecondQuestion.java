package odev2;

public class SecondQuestion {

    public static void main(String[] args){


        int a = 2;
        int b = 3;
        int n = 10;

        //5,11,23,47,95

        int total = a;
        for(int i = 0;i<n;i++){

            a = (int) (a + b * Math.pow(2,i));
            System.out.print(a + " ");

        }

    }


}
