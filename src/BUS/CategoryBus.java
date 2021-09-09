/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BUS;

import DAO.CategoryDAO;
import DTO.Category;
import java.util.ArrayList;

/**
 *
 * @author Sam
 */
public class CategoryBus {
    CategoryDAO Category = new CategoryDAO();
    
    public ArrayList<Category>getAllRows()throws Exception{
        return Category.getAllRows();
    }
    
}
