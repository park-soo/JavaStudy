package dao;

public class DaoRun {
	public static void dbWork(Dao dao) {
		dao.select();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new MySqlDao());

		Dao or = new OracleDao();
		OracleDao or1 = new OracleDao();
		dbWork(or);

		MySqlDao my = new MySqlDao();
		Dao my1 = new MySqlDao();
		dbWork(my);
	}

}
