/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.ProductDAO;
import DTO.Product;
import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Sam
 */
public class ProductBus {
    ProductDAO ProductDao = new ProductDAO();
    public boolean insertProduct(Product p) throws Exception{
            if(ProductDao.insertProduct(p)){
                return true;
            }
         return false;
        }  
     public ArrayList<Product>getAllRows(int id)throws Exception{
         return ProductDao.getAllRows();
     }
     
     public ArrayList<Product> searchProduct(String key) throws SQLException{
         return ProductDao.searchProduct(key);
     }
      public Product getbyId(int id){
          return ProductDao.getbyId(id);
      }
   public int updateProduct(Product product){
       return ProductDao.updateProduct(product);
   }
   
   public int deleteProduct(Product product){
       return ProductDao.updateProduct(product);
   }
}