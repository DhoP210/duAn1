/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package DomainModels;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
@Entity
@Table(name = "SanPham")
public class SanPham {
     @Id
    @Column(name = "Id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID Id;
    private String Ma ;
    private String Ten ;
    private int TrangThai ;
   
    public String trangThai() {
        if (TrangThai == 0) {
            return "Còn Hàng";
        } else {
            return "Hết Hàng";
        }
    }

    public SanPham() {
    }

    public SanPham(UUID Id, String Ma, String Ten, int TrangThai) {
        this.Id = Id;
        this.Ma = Ma;
        this.Ten = Ten;
        this.TrangThai = TrangThai;
    }

    public UUID getId() {
        return Id;
    }

    public void setId(UUID Id) {
        this.Id = Id;
    }

    public String getMa() {
        return Ma;
    }

    public void setMa(String Ma) {
        this.Ma = Ma;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String Ten) {
        this.Ten = Ten;
    }

    public int getTrangThai() {
        return TrangThai;
    }

    public void setTrangThai(int TrangThai) {
        this.TrangThai = TrangThai;
    }

    @Override
    public String toString() {
        return "SanPham{" + "Id=" + Id + ", Ma=" + Ma + ", Ten=" + Ten + ", TrangThai=" + TrangThai + '}';
    }

    

}
