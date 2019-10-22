package application;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		VendedorDao vd = DaoFactory.createVendedorDao();

		Vendedor vendedor = vd.findById(3);

		System.out.println(vendedor);

	}

}
