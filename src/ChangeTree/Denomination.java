package ChangeTree;

public class Denomination {

	private int size;
	private int[] d;

	public int[] getD() {
		return d;
	}

	public void setD(int[] d) {
		this.d = d;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Denomination(int size) {
		this.size = size;
		this.d = new int[size];
	}

	public int[] InsertD(int position, int element) {

		this.d[position] = element;
		return this.d;

	}

}
