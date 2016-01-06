import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
        int[]data=new int[5];
        for(int i=0;i<data.length;i++){
            data[i]=(int)(Math.random()*100-50);
        }
        int[]copy=new int[5];
        for(int i=0;i<data.length;i++){
            copy[i]=data[i];
        }
        System.out.println(Arrays.toString(data));
        Sorts.bubbleSort(data);
        System.out.println(Arrays.toString(data));
        Sorts.selectionSort(copy);
        System.out.println(Arrays.toString(data));
    }

}