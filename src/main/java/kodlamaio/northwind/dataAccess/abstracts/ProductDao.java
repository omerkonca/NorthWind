package kodlamaio.northwind.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import kodlamaio.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product,Integer>{
	  Product getByProductName(String productName);
	  Product getByProductNameandCategoryId(String productName, int categoryId);
	  List<Product> getByProductNameOrCategoryId(String productName, int categoryId);
	  List<Product> getByCategoryIdIn(List<Integer> categories);
	  List<Product> getByProductNameContains(String productName);
	  List<Product> getByProductNameStartsWith(String productName);
	  
	  @Query("From Product where productName=:productName and categoryId")
	  List<Product> getByNameandCategory(String productName, int categoryId);

}
