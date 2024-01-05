package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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

    @ManyToOne
    @JoinColumn(name = "event_id")
    private Event event;

    public Zone(String name,
                Double price,
                Event event) {
        this.name = name;
        this.price = price;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Zone{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", event=" + event +
                '}';
    }
}
