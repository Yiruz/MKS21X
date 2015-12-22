public class BarCode implements Comparable{
    private String zip;
    private int checkDigit;
    private static String[]digits={"||:::",//0
			    ":::||",//1
			    "::|:|",//2
			    "::||:",//3
			    ":|::|",//4
			    ":|:|:",//5
			    ":||::",//6
			    "|:::|",//7
			    "|::|:",//8
			    "|:|::",};//9

    public BarCode(){
	if(!check()){
	    throw new RuntimeException();
	}
    }

    private boolean check(){
	if (zip.length()!=5){
	    return false;
	}
	try{
	    Integer.parseInt(zip);
	    return true;
	}catch(NumberFormatException e){
	    return false;
	}
    }

    public BarCode(String zip){
	this.zip = zip;
	checkDigit = checkSum();
    }
    public BarCode(BarCode x){

    }

    private String bar(){
	String end = "|";
	for(int i=0; i<zip.length()-1;i++){
	    int ind=Integer.parseInt(zip.substring(i,i+1));
	    end+=digits[ind];
	}
	return end+"|";
    }
    private int checkSum(){
	int sum = 0;
	for(int i=0; i<zip.length()-1;i++){
	    sum+=Integer.parseInt(zip.substring(i,i+1)); 
	}
	return sum;
    }
    public String toString(){
	return zip+checkSum()+bar();
    }
    public boolean equals(Object other){
	return other instanceof BarCode && zip.equals(((BarCode)other).zip);
    }
    public int compareTo(Comparable other){
	return (Integer.parseInt(zip)+checkDigit).compareTo
	    ((BarCode)other).(Integer.parseInt(zip)+checkDigit);
    }
}