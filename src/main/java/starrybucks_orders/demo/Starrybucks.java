package starrybucks_orders.demo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "starrybucks_orders")
public class Starrybucks {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_drink")
    private Long id;

    @Column(name = "drink_name")
    private String drinkname;

    @Column(name = "cup_type")
    private String cuptype;

    @Column(name = "drink_price")
    private float drinkprice;


}
