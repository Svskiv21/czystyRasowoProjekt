package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class Zone {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String name;

    @Column
    private Double price;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "event_id")
    private Event event;

    @OneToMany
    private List<Seat> seats;

    public Zone(String name,
                Double price,
                Event event,
                List<Seat> seats) {
        this.name = name;
        this.price = price;
        this.event = event;
        this.seats = seats;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", event=" + event +
                ", seats=" + seats +
                '}';
    }
}
