public class IntList {
	public int first;
	public IntList rest;

	public IntList(int f, IntList r) {
		first = f;
		rest = r;
	}

	/** Return the size of the list using... recursion! */
	public int size() {
		if (rest == null) {
			return 1;
		}
		return 1 + this.rest.size();
	}

	/** Return the size of the list using no recursion! */
	public int iterativeSize() {
		IntList p = this;
		int totalSize = 0;
		while (p != null) {
			totalSize += 1;
			p = p.rest;
		}
		return totalSize;
	}

	/** Returns the ith item of this IntList. */
	public int get(int i) {
		if (i == 0) {
			return first;
		}
		return rest.get(i - 1);
	}

	/** Add an item to the first. */
	public void addFirst(int x){
		IntList newFirst = new IntList(this.first, this.rest);
		this.first = x;
		this.rest = newFirst;
	}

	public void addAdjacent(){
		IntList ptr = this;
		int last = ptr.first, curr;
		while (ptr.rest != null ) {
			curr = ptr.rest.first;
			if(last == curr){
				last = last + curr;
				ptr.first = last;
				ptr.rest = ptr.rest.rest;
				continue;
			}
			ptr = ptr.rest;
		}
	}

	public void addLast(int x){
		IntList ptr = this;
		while (ptr.rest != null){
			ptr = ptr.rest;
		}
		ptr.rest = new IntList(x, null);
	}
	public void addLastWithSquare(int x){
		IntList ptr = this;
		while (ptr.rest != null){
			ptr.rest.addFirst(ptr.first*ptr.first);
			ptr = ptr.rest.rest;
		}
		ptr.rest = new IntList(ptr.first*ptr.first, null);
		ptr = ptr.rest;
		ptr.rest = new IntList(x, null);
	}

	public static void main(String[] args) {
		IntList L = new IntList(1, null);
		L.addLast(2);
		L.addLastWithSquare(5);
		L.addLastWithSquare(7);
//		L.addAdjacent();
		System.out.println(L.get(1));
	}
} 