/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import DomainModels.BaoHanh;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public interface BaoHanhServicee {
     public List<BaoHanh> getALL();

    String add(BaoHanh bh);

    String update(BaoHanh bh);

    String delete(String ma);

    public List<String> listcbbsize();
}
