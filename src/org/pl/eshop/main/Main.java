package org.pl.eshop.main;

import java.sql.SQLException;
import java.util.List;

import org.pl.eshop.dto.Categoria;
import org.pl.eshop.dto.CategoriaDAO;
import org.pl.eshop.dto.CategoriaDAOMySQL;

public class Main {
	
	public static void main(String [] args)
	{
		System.out.println("Testing Initilized");	
		InitializeConfig();
		TestAgregar();
		TestModificar();
		TestObtenerTodas();
		TestEliminar();
		TestObtenerPorId();
		TestEliminarException();
		AfterAll();
		System.out.println("Testing Finished");
	}

	private static void InitializeConfig() {
		System.out.println("InitializeConfig()");
		try {			
			CategoriaDAOMySQL.deleteAllCategorias();
			CategoriaDAOMySQL.resetAutoincrementCategoria();
		} catch (Exception e) {
			System.out.println("New Exception: throws from InitializeConfig.");
		}
		System.out.println("==================================================================");
	}
	
	private static void TestAgregar(){
		System.out.println("******************* TestAgregar() *******************");
		
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		Categoria category = new Categoria();
		category.setNombre("Mockup Name 1");
		category.setDescripcion("Description Name 1");
		
		try {			
			catDao.agregar(category);
			System.out.println(category.getNombre() == "Mockup Name 1");
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestAgregar.");
		}
		System.out.println("==================================================================");
	}
	
	private static void TestModificar() {
		System.out.println("******************* TestModificar() *******************");
		
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		
		try {
			Categoria category = catDao.obtenerPorId(1);
			
			category.setNombre("New Name");
			category.setDescripcion("New descritpion");
			catDao.modificar(category);
			System.out.println(category.getNombre() == "New Name");
			System.out.println(category.getDescripcion() == "New descritpion");
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestModificar.");
		}
		System.out.println("==================================================================");
	}
	
	private static void TestObtenerTodas() {
		System.out.println("******************* TestObtenerTodas() *******************");
		
		List<Categoria> categories;
		
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		Categoria categoryTwo = new Categoria();
		categoryTwo.setNombre("Mockup Name 2");
		categoryTwo.setDescripcion("Description Name 2");
		
		try {
			catDao.agregar(categoryTwo);
			
			categories = catDao.obtenerTodas();
			System.out.println(categories.size() == 2);
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestObtenerTodas.");
		}
		System.out.println("==================================================================");
	}
	
	private static void TestEliminar() {
		System.out.println("******************* TestEliminar() *******************");
		
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		try {		
			Categoria category = catDao.obtenerPorId(1);
			catDao.eliminar(category);
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestEliminar.");
		}	
		System.out.println("==================================================================");
	}
	
	private static void TestObtenerPorId() {
		System.out.println("******************* TestObtenerPorId() *******************");
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		try {
			Categoria newCategory = catDao.obtenerPorId(2);
			System.out.println(newCategory.getId() == 2);
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestObtenerPorId.");
		}	
		System.out.println("==================================================================");
	}
	
	private static void AfterAll() {
		System.out.println("******************* AfterAll() *******************");
		try {			
			CategoriaDAOMySQL.deleteAllCategorias();
		} catch (Exception e) {
			System.out.println("New Exception: throws from InitializeConfig.");
		}
		System.out.println("==================================================================");
	}
	
	private static void TestEliminarException() {
		System.out.println("******************* TestEliminarException() *******************");
		CategoriaDAO catDao = new CategoriaDAOMySQL();
		
		try {		
			Categoria category = catDao.obtenerPorId(0);
			catDao.eliminar(category);
			
		} catch (Exception e) {
			System.out.println("New Exception: throws from TestEliminar.");
		}
		System.out.println("==================================================================");
	}
}
