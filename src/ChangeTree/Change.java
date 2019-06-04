package ChangeTree;

public class Change {

	private ChangeNode root;

	public ChangeNode getRoot() {
		return root;
	}

	public void setRoot(ChangeNode root) {
		this.root = root;
	}

	public void InsertD(Denomination myd, int x, int i) {
		ChangeNode newNode = new ChangeNode(myd.getD()[i]);
		if (this.root == null) {
			this.root = newNode;
			x = x - myd.getD()[i];
			InsertLeft(this.root, myd, x, i);
		}

	}

	public void InsertLeft(ChangeNode actualroot, Denomination myd, int x, int i) {
		ChangeNode newNode = new ChangeNode(myd.getD()[i]);
		if (x >= 0 && x >= myd.getD()[i]) {
			actualroot.setLeft(newNode);
			x = x - myd.getD()[i];
			InsertLeft(actualroot.getLeft(), myd, x, i);
		} else {
			i = i + 1;
			
			InsertRight(actualroot, myd, x, i);
		}
	}

	public void InsertRight(ChangeNode actualroot, Denomination myd, int x, int i) {
		
	}

}
