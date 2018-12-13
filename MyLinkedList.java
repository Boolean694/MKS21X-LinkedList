public class MyLinkedList {
	private int size;
	private Node start;
	private Node end;
	public int size() {
		int g = 2;
		Node c = start.gn();
		while(c.gn() != null) {
			g++;
			c = c.gn();
		}
		return g;
	}
	public boolean add(int v) {
		Node nn = new Node(v, null, end);
		end = nn;
	}
	public String toString() {
		String s = "[" + start.gd() + ",";
		Node c = start.gn();
		while(c.gn() != null) {
			s += c.gd();
			s += ",";
		}
		s += end.gd();
		s += "]"
		return s;
	}
}
