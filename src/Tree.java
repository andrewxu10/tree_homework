
public class Tree {
	Object[] array;
	
	public Tree () { //initialization
		array = new Object [128];
	}
	
	public boolean empty () { //empty?
		return (array[0] == null);
	}
	
	//calculate indices for..
	public int left (int i ) { return (2*i) + 1; };
	public int right (int i ) { return (2*i) + 2; };
	public int parent (int i ) { return (i - 1) / 2; };
}
