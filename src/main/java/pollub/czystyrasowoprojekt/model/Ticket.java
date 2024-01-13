package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
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

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    @Column
    private Double price;

    @Column(name = "seatNumber")
    private Integer seatNumber;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "kucOrder_id")
    private KucOrder kucOrder;

    @Column
    private Integer row;

    @Column(name = "zoneNumber")
    private Long zoneNumber;


    public Ticket(Event event,
                  Double price,
                  Integer seatNumber,
                  KucOrder kucOrder,
                  Integer row,
                  Long zoneNumber) {
        this.event = event;
        this.price = price;
        this.seatNumber = seatNumber;
        this.kucOrder = kucOrder;
        this.row = row;
        this.zoneNumber = zoneNumber;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "id=" + id +
                ", event=" + event +
                ", price=" + price +
                ", seatNumber=" + seatNumber +
                ", kucOrder=" + kucOrder +
                ", row=" + row +
                ", zoneNumber=" + zoneNumber +
                '}';
    }
}
