public class Node {
	private int data;
	private Node next;
	private Node prev;
	public Node(int d, Node n, Node p) {
		data = d;
		next = n;
		prev = p;
	}
	public int gd() {
		return data;
	}
	public Node gn() {
		return next;
	}
	public Node gp() {
		return prev;
	}
}