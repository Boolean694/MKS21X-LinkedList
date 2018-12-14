public class MyLinkedList {
	private int size;
	private Node start;
	private Node end;
	public MyLinkedList(int s, Node i, Node e) {
	    size = s;
	    start = i;
	    end = e;
	}
	public MyLinkedList() {
	    size = 0;
	    start = null;
	    end = null;
    }
	public int size() {
		int g = 2;
		Node c = start.next();
		while(c.next() != null) {
			g++;
			c = c.next();
		}
		return g;
	}
	public boolean add(Integer v) {
		Node nn = new Node(v, null, end);
		end = nn;
	}
	public Integer get(int i) {
	    if(i < 0 || i >= size) {throw new IndexOutOfBoundsException();}
	    if(i == 0) {return start.getData();}
	    Node c = start.next();
	    int q = 1;
	    while(q < i) {
	        c = c.next();
	        q++;
	    }
	    return c.getData();
	}
	public Integer set(int i, Integer v) {
	    if(i < 0 || i >= size) {throw new IndexOutOfBoundsException();}
	    Node c = start.next();
	    int q = 1;
	    while(q < i) {
	        c = c.next();
	        q++;
	    }
		int f = c.getData();
		c.setData(v);
		return f;
	}
	public String toString() {
		String s = "[" + start.getData() + ",";
		Node c = start.next();
		while(c.next() != null) {
			s += c.getData();
			s += ",";
		}
		s += end.getData();
		s += "]"
		return s;
	}
	public boolean contains(Integer v) {
		boolean b = false;
		if(start.getData() == v || end.getData() == v) {b = true;}
		Node c = start.next();
		for(int q = 1; q < size - 1; q++) {
			if(c.getData() == v) {b = true;}
			else {q += 0;}
		}
		return b;
	}
	public int indexOf(Integer v) {
		if(start.getData() == v) {return 0;}
		if(end.getData() == v) {return size - 1;}
		Node c = start.next();
		for(int q = 1; q < size - 1; q++) {
			if(c.getData() == v) {return q;}
		}
		return -1;
	}
}