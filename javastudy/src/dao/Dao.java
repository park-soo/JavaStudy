package dao;

public interface Dao {
	
	public void select();
	public void insert();
	public void update();
	public abstract void delete();	//인터페이스는 abstract생략 가능
	
	
}
