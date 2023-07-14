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
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "SanPham")
@Entity
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

    public SanPham(String Ma, String Ten, int TrangThai) {
        this.Ma = Ma;
        this.Ten = Ten;
        this.TrangThai = TrangThai;
    }
    

}
