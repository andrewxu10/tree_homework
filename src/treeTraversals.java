import java.util.Arrays;

public class treeTraversals {
	public static void main(String[] args) {
		
		Tree tree = new Tree();
		int root = 1;

		//set data to level
		for (int i = 1; i <= tree.size(); i++) {
			tree.setData(i, log2(i));
			//System.out.println("set index " + i + " : to " + log2(i));
		}
		
		tree.printPreorder (root);
	}
	
	public static void printInOrder(Tree tree) {
		if (tree.getData(1) == null) {
			System.out.println("empty");
		}
		if (tree.getData(left(root)) != null) {
			
		}
	}
	
	public static int log2(int n)
	{
	    return (int) (Math.log(n) / Math.log(2));
	}

}
