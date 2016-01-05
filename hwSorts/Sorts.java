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

    public static void print(int[]data){
	System.out.print("[");
	for(int i=0;i<data.length-1;i++){
	    System.out.print(data[i]+", ");
	}
	System.out.print(data[data.length-1]+"]\n");
    }
    public static void main(String[]args){
	int[]data={2,1,8,0,22,7};
	insertion(data);
	print(data);
    }
}