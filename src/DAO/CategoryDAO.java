/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DB.ConnectDB;
import DTO.Category;
import DTO.Product;
import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Sam
 */
public class CategoryDAO {
    private ConnectDB dB ;
    private Category category;
    private Connection connection;
    public CategoryDAO() {
        dB=new ConnectDB();
        this.connection=dB.GetConnect();
    }
     public ArrayList<Category>getAllRows()throws Exception{
        ArrayList<Category> lst=new ArrayList<Category>();
        String sql="select * from category";
        ResultSet rs=connection.createStatement().executeQuery(sql);
    // user lh=null;
        while(rs.next()){
            category=new Category(rs.getInt("id"),
                    rs.getString("name"));
            lst.add(category);
        }
        return lst;
 }
    
}
