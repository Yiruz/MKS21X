public class Sorts{
    public static void insertion(int[]data){
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
    public static void selection(int[]data){
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
	}
    }
    public static void print(int[]data){
	System.out.print("[");
	for(int i=0;i<data.length-1;i++){
	    System.out.print(data[i]+", ");
	}
	System.out.print(data[data.length-1]+"]\n");
    }
    public static void main(String[]args){
	int[]data=new int[10];
	for(int i=0;i<data.length;i++){
	    data[i]=(int)(Math.random()*20-5);
	}
	int[]copy=new int[10];
	for(int i=0;i<data.length;i++){
	    copy[i]=data[i];
	}
	print(data);
	insertion(data);
	print(data);
	selection(copy);
	print(copy);
    }
}