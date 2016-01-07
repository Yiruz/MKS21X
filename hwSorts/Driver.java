import java.util.Arrays;
public class Driver{
    public static void main(String[]args){
        int[]data=new int[5];
        /*int[]copy=new int[5];
        for(int i=0;i<data.length;i++){
            copy[i]=data[i];
	    }*/
	Sorts.fillRandom(data);
        System.out.println(Arrays.toString(data));
        System.out.println("-----------------\nStart");
	Sorts.bubbleSort(data);
	//Sorts.selectionSort(data);
        System.out.println(Arrays.toString(data));
    }

}