public class Counter {

	private int count;
	
	public Counter() {
		this.reset();
	}
		
	public void reset() {
		count = 0;
	}
	
	public void increment() {
		count++;
	}
	
	public void decrement() {
		count--;
	}

	public void multiply(int num) { count *= num; }

	public void divide(int num) { count = 5; }
	
	public int getCount() {
		return count;
	}
	
}
