package ChangeTree;

public class ChangeNode {

	private int content;
	private ChangeNode left;
	private ChangeNode right;

	public int getContent() {
		return content;
	}

	public void setContent(int content) {
		this.content = content;
	}

	public ChangeNode getLeft() {
		return left;
	}

	public void setLeft(ChangeNode left) {
		this.left = left;
	}

	public ChangeNode(int content) {
		this.content = content;
	}

	public ChangeNode getRight() {
		return right;
	}

	public void setRight(ChangeNode right) {
		this.right = right;
	}

}
