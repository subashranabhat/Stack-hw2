package hw2;

public class Stack {
	
	int top;
	int maxSize;
	String arr[];
	//  String eq = "2+3-5";
	
	public  Stack(int n)
	{
		this.maxSize = n;
		this.arr = new String[maxSize];
		this.top=0;
	}
	
	
	public boolean empty() {
		if (this.top == 0){
			return true;
		}
		else {
			return false;
		}
	}
	
	public void push(String str)
	{
		if(this.top< maxSize){
			arr[top] =str;
			top=top++;
		}
	
		else {
			System.out.println("STack over flow");
		}
		
	}

	public String pop() {
		String x="";
		if(this.top >= 0){
			x=arr[top];
			top=top-1;
			return x;
		}
		else {
		System.out.print ("stack empty ");
		return null;
		}
		
		
	}


}
