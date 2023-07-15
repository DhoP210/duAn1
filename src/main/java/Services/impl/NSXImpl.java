/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.NSX;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface NSXImpl {
    List<NSX> getAll();
    
    Boolean add(NSX nsx);
    
    Boolean update(NSX nsx);
    
    Boolean delete(String ma);
}
