/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author ADMIN
 */

@Entity
@Table(name = "LoaiSP")
public class LoaiSP {
   @Id
    @GenericGenerator(name = "generator", strategy = "guid", parameters = {})
    @GeneratedValue(generator = "generator")
    @Column(name = "Id", columnDefinition = "uniqueidentifier")
    private String id;
    private String ma;
    private String ten;
    private int trangThai;

    public LoaiSP() {
    }

    public LoaiSP(String id, String ma, String ten, int trangThai) {
        this.id = id;
        this.ma = ma;
        this.ten = ten;
        this.trangThai = trangThai;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTrangThai() {
        return trangThai;
    }

    public void setTrangThai(int trangThai) {
        this.trangThai = trangThai;
    }

    
 
    @Override
    public String toString() {
        return "LoaiSP{" + "id=" + id + ", ma=" + ma + ", ten=" + ten + ", trangThai=" + trangThai + '}';
    }

    public String gettt(){
        if(trangThai == 0){
            return "Còn Hàng";
        }else{
           return "Hết Hàng"; 
        }
    }
}
