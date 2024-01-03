package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Ticket {

    @GeneratedValue
    @Id
    private Long id;

//    @Column
//    private Integer event_id;

    @Column
    private Double price;

    @Column(name = "seat_number")
    private Integer seatNumber;

//    @Column
//    private Long order_id;

    @Column
    private Integer row;

    @Column(name = "zone_number")
    private Integer zoneNumber;

    public Ticket(Double price, Integer seatNumber, Integer row, Integer zoneNumber) {
        this.price = price;
        this.seatNumber = seatNumber;
        this.row = row;
        this.zoneNumber = zoneNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", price=" + price +
                ", seatNumber=" + seatNumber +
                ", row=" + row +
                '}';
    }
}
