package application;

import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.VendedorDao;
import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

		VendedorDao vd = DaoFactory.createVendedorDao();

		System.out.println("========= teste 1 Vendedor FindById ==========");
		Vendedor vendedor = vd.findById(3);
		System.out.println(vendedor);
		
		System.out.println("\n========= Teste 2 Vendedor FindByDepartamento ==========");
		Departamento departamento = new Departamento(2, null);
		List<Vendedor> list = vd.findByDepartamento(departamento);
		for (Vendedor obj : list) {
			System.out.println(obj);
			
		}
		System.out.println("\n========= Teste 3 Vendedor FindAll ==========");
		list = vd.findAll();
		for (Vendedor obj : list) {
			System.out.println(obj);
		}
		System.out.println("\n========= Teste a Vendedor inserir ==========");
		Vendedor novoVendedor = new Vendedor(null, "Greg", "greg@gmail.com", new Date(), 4000.0, departamento);
		vd.insert(novoVendedor);
		System.out.println("Inserted! New id = " + novoVendedor.getId());
		}
		

	}


