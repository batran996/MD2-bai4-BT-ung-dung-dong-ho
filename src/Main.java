import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        System.out.println("Stop Watch");
        int[] array=new int[10000];
        for(int i=0;i<10000;i++){
            array[i]=(int) (Math.random()*100)+1;
        }

        System.out.println(Arrays.toString(array));
        for (int i=0;i<10000;i++){
            for(int j=i+1;j<10000;j++){
                if(array[i]>array[j]){
                    int temp=array[i];
                    array[i]=array[j];
                    array[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        long end = System.currentTimeMillis();
        System.out.println("thời gian trôi qua " + (end - start));


    }
}