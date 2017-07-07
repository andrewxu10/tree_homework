
public class Tree {
	Object[] array;
	
	public Tree () { //initialization
		array = new Object [128];
	}
	
	public boolean empty () { //empty?
		return (array[1] == null);
	}
	
	public int size () { //size even if empty
		return array.length;
	}
	
	//calculate indices for..
	public int left (int i ) { return (2*i); };
	public int right (int i ) { return (2*i) + 1; };
	public int parent (int i ) { return i / 2; };
	
	public Object getData (int i) { //getter & setter
		if (i < 0 || i >= array.length) return null;
		return array[i];
	}
	public void setData (int i, Object obj) {
		if (i < 0 || i >= array.length) return;
		array[i] = obj;
	}
	
	public void printPreorder (int i) { 
        if (getData (i) == null) return; 
        System.out.println (getData (i)); 
        printPreorder (left (i)); 
        printPreorder (right (i)); 
    } 
}
