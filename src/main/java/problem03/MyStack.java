package problem03;

public class MyStack {
	
	private String[] buffer;
	private int index=0;
	private int size;

	public MyStack( int size ) {
		this.size = size;
		this.buffer = new String[this.size];
	}
	
	public void push(String item) {
		if(index == size) {
			size();
		}
		this.buffer[index]= item;
		index++;
	}

	public String pop() {
		String result;
		if(index == 0) {	
			return "null";
		}
		result = this.buffer[--index];
		this.buffer[index] = null;
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
		String[] nBuffer = new String[++this.size];
		System.arraycopy(this.buffer, 0, nBuffer, 0, this.buffer.length);
		this.buffer = nBuffer;
		return 0;
	}
}