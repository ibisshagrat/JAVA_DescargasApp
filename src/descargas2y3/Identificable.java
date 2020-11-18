package descargas2y3;

import java.util.Comparator;

public interface Identificable<T> {

	public Object getId();
	
	class Compare<T> implements Comparator<Identificable<T>> {

////			@Override
//			public<T, V> int compare(Identificable<T> obj1, Identificable<V> obj2) {
//				String id1 = obj1.getId().toString();
//				String id2 = obj2.getId().toString();
//				return id1.compareTo(id2);
//			}

			@Override
			public int compare(Identificable<T> arg0, Identificable<T> arg1) {
				String id1 = arg0.getId().toString();
				String id2 = arg1.getId().toString();
				return id1.compareTo(id2);
			}
	}
}
