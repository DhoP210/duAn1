/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services.impl;

import DomainModels.ChatLieu;
import ViewModels.QLChatLieu;
import java.util.List;

/**
 *
 * @author Dell
 */
public interface ChatLieuServiceImpl {
    List<ChatLieu> getAll();

    boolean add(ChatLieu chatLieu);

    boolean update(ChatLieu chatLieu);

    boolean delete(ChatLieu chatLieu);
}
