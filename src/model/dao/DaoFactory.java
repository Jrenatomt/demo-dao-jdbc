package model.dao;

import model.dao.impl.VendedorDaoJDBC;

public class DaoFactory {
	
	public static VendedorDao createVendedorDao() {
		return new VendedorDaoJDBC();
	}

}
