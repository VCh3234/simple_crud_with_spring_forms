package vlad.data_access_objects.entities;

import lombok.Data;

import javax.persistence.*;
import java.sql.Date;
import java.time.LocalDate;

@Data
@Entity
@Table(name = "vehicles", schema = "public", catalog = "postgres")
public class VehicleEntity {
    @Id
    @Basic
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Basic
    @Column(name = "reserve")
    private int reserve = 100;
    @Basic
    @Column(name = "coordinate_x")
    private float coordinateX;
    @Basic
    @Column(name = "coordinate_y")
    private float coordinateY;
    @Basic
    @Column(name = "color")
    private int color;
    @Basic
    @Column(name = "type")
    private int type;
    @Basic
    @Column(name = "status")
    private int status;
    @Basic
    @Column(name = "purchase_date")
    private LocalDate purchaseDate = LocalDate.now();
}
