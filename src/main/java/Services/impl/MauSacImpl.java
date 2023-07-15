/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.MauSac;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public interface MauSacImpl {
    List<MauSac> getAll();

    boolean add(MauSac ms);

    boolean update(MauSac ms);

    boolean delete(MauSac ms);
}
