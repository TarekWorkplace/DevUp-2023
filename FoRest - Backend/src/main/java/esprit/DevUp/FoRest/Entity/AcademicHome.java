package esprit.DevUp.FoRest.Entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class AcademicHome implements Serializable {
 @Id
 @GeneratedValue(strategy = GenerationType.AUTO)
 @Column(name = "id_academic_home", nullable = false)
        private int idAcademicHome;
        private int FloorNumber;
        private String name;
        private String Address;


    public int getId() {
        return idAcademicHome;
    }

    public void setId(int idAcademicHome) {
        this.idAcademicHome = idAcademicHome;
    }

    public int getFloorNumber() {
        return FloorNumber;
    }

    public void setFloorNumber(int floorNumber) {
        FloorNumber = floorNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
