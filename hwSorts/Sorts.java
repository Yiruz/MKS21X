import java.util.*;
public class Sorts{
    public static void insertionSort(int[]data){
	for(int i=1;i<data.length;i++){
	    int current = data[i];
	    int j=i;
	    while(j>0 && current<data[j-1]){
		data[j]=data[j-1];
		data[j-1]=current;
		j--;
	    }
	}
    }
    public static void selectionSort(int[]data){
	System.out.println("Start");
	for(int i=0;i<data.length;i++){
	    int first = i;
	    for(int j=i;j<data.length;j++){
		if(data[first]>data[j]){
		    first=j;
		}
	    }
	    int temp = data[first];
	    data[first]=data[i];
	    data[i]=temp;
	    System.out.println(Arrays.toString(data));
	}
	System.out.println("End");
    }
    public static void bubbleSort(int[]data){
	System.out.println("Start");
	int end = data.length;
	for(int i=0;i<end;i++){
	    for(int j=0;j<end-1;j++){
		if(data[j]>data[j+1]){
		    int temp = data[j];
		    data[j]=data[j+1];
		    data[j+1]=temp;
		    
		}
	    }
	    System.out.println(Arrays.toString(data));
	    end--;
	}
    }
  
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
	bubbleSort(data);
	System.out.println(Arrays.toString(data));
	selectionSort(copy);
	System.out.println(Arrays.toString(data));
    }
}