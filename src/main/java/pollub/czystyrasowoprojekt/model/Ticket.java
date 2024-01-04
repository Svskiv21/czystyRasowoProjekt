package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@Entity
public class Ticket {

    @GeneratedValue
    @Id
    private Long id;

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

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

//    public Ticket(Event event,
//                  Double price,
//                  Integer seatNumber,
//                  Integer row,
//                  Integer zoneNumber) {
//        this.event = event;
//        this.price = price;
//        this.seatNumber = seatNumber;
//        this.row = row;
//        this.zoneNumber = zoneNumber;
//    }
//
//    public Ticket() {
//    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", event=" + event +
                ", price=" + price +
                ", seatNumber=" + seatNumber +
                ", row=" + row +
                ", zoneNumber=" + zoneNumber +
                '}';
    }
}
