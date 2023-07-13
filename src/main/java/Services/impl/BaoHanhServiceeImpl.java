/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Services.impl;

import DomainModels.BaoHanh;
import Repositories.BaoHanhRepository;
import Services.BaoHanhServicee;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class BaoHanhServiceeImpl implements BaoHanhServicee{
      private BaoHanhRepository bhrepo = new BaoHanhRepository();
    @Override
    public List<BaoHanh> getALL() {
    return (ArrayList<BaoHanh>) bhrepo.getAll();    
    }

   
   

    @Override
    public String update(BaoHanh bh) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String delete(String ma) {
         if(bhrepo.delete(ma)){
           return "Thành công";
       }else{
           return "Thất bại";
       }
    }

    @Override
    public List<String> listcbbsize() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String add(BaoHanh bh) {
      return bhrepo.add(bh);
    }

    


}
