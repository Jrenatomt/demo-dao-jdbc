package application;

import java.util.Date;

import model.entities.Departamento;
import model.entities.Vendedor;

public class Program {

	public static void main(String[] args) {

     Departamento obj = new Departamento(2, "Renato");
     Vendedor vendedor = new Vendedor(21, "renato", "jrenatomt@gmail.com", new Date(), 3000.00, obj);
     System.out.println(vendedor);

	}

}
