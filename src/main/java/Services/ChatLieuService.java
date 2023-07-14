/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import DomainModels.ChatLieu;
import Repositories.ChatLieuRepo;
import Services.impl.ChatLieuServiceImpl;
import ViewModels.QLChatLieu;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dell
 */
public class ChatLieuService implements ChatLieuServiceImpl {

    private ChatLieuRepo chatLieuRepo = new ChatLieuRepo();

    @Override
    public List<ChatLieu> getAll() {
        try {
            return chatLieuRepo.getAll();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public boolean add(ChatLieu chatLieu) {
        try {
            return chatLieuRepo.add(chatLieu);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean update(ChatLieu chatLieu) {
        try {
            return chatLieuRepo.update(chatLieu);
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public boolean delete(ChatLieu chatLieu) {
        try {
            return chatLieuRepo.delete(chatLieu);
        } catch (Exception e) {
            return false;
        }
    }

}
