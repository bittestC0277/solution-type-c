package problem03;

public class MyStack {
	
	private String[] buffer;
	private int index=0;
	private int size;

	public MyStack( int size ) {
		this.size = 30;
		this.buffer = new String[this.size];
	}
	
	public void push(String item) {
		if(index == size) {
			return;
		}
		this.buffer[index]= item;
		index++;
	}

	public String pop() {
		String result;
		if(index == 0) {	
			return "null";
		}
		result = this.buffer[index-1];
		this.buffer[index--] = null;
		return result;		
	}

	public boolean isEmpty() {
		if(index==0) {
			return true;
		}else {
			return false;
		}
	}
	
	public int size() {
		
		return 0;
	}
}