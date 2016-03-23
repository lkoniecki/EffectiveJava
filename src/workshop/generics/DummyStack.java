package workshop.generics;

import java.util.ArrayList;
import java.util.Collection;

public class DummyStack {
	private final Collection stack = new ArrayList();

	public synchronized void pushAll(Collection src) {
		stack.addAll(src);
	}

	public synchronized void popAll(Collection dst) {
		dst.addAll(stack);
		stack.clear();
	}

	public synchronized Collection popAll() {
		Collection dst = new ArrayList(stack);
		stack.clear();
		return dst;
	}
}
