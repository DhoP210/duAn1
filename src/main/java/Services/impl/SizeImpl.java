/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.Size;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface SizeImpl {
        List<Size> getAll();

    boolean getMa(String ma);

    boolean add(Size size);
    
    boolean update( String id,Size size);
    
    String delete(String id);
}
