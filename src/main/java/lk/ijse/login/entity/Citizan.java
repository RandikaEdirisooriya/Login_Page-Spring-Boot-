package lk.ijse.login.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
@Table(name = "Citizan")
public class Citizan {
        @Id
        private  int id;
        private String NIC;
        @Column(name = "first_name" ,unique = true,nullable = false)
        private String FirstName;
        private String LastName;
        private String ContactNumber;
        private String Address;
        private String EmailAddress;
        private String Password;

}
