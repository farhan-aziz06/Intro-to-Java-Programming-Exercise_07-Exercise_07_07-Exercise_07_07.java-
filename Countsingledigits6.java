public class Countsingledigits6{
    public static void main(String[]args) {
        int [] count = new int [10];

        for(int i =0; i<100;i++){
            count[(int)(Math.random()*10)]++;
        }

        for(int i =0; i<count.length;i++){
            System.out.println(i+" "+"s"+ " "+ count[i]);

        }
    }
}