/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DomainModels;

import java.util.UUID;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
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
@Table(name = "Size")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Size {
    @Id
    @Column(name = "Id", columnDefinition = "UNIQUEIDENTIFIER")
    @GeneratedValue
    private UUID id;
    private String ma ;
    private String ten ;
    private int trangThai ;
   
    public String trangThai() {
        if (trangThai == 0) {
            return "Còn size";
        } else {
            return "Hết size";
        }
    }

   

  

    
}
