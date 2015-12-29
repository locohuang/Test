public class BaseDaoImpl<T> implements BaseDaoI<T> {

	T t;
	@Override
	public void save(T t) {
		// TODO Auto-generated method stub
		this.t=t;
		
	}

	@Override
	public T get() {
		// TODO Auto-generated method stub
		return t;
	}


}
