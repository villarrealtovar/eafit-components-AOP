package org.pl.eshop.sqlaspect;

import org.pl.eshop.dto.*;


public aspect Query{
		
	//Aspect: Query to DataBase
	pointcut querySQL(): call(* java.sql.*Statement.execute*(..));
	
	after() returning(): querySQL(){
		System.out.println("ASPECT: Before call to database");
	}
	
	//Aspect: Exception SQL
	pointcut sqlException(): handler(Exception);
	
	before(): sqlException(){
		System.out.println("ASPECT: Exception SQL");
	}
	
	//Aspect: Add Category
	pointcut addCategoria(): execution(* *.agregar (..));
	
	after() returning(): addCategoria(){
		System.out.println("ASPECT: Added Category");
	}
	
	//Aspect: Delete Category
	pointcut deleteCategory(): execution(* CategoriaDAOMySQL.eliminar (..));
	
	after() returning(): deleteCategory(){
		System.out.println("ASPECT: Deleted Category");
	}
}
