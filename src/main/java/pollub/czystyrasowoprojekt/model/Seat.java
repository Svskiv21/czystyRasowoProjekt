package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Seat
{
    @GeneratedValue
    @Id
    private Long id;

    @Column
    private Integer number;

    @Column
    private Integer row;

    @Enumerated(EnumType.STRING)
    private Status status;

    @ManyToOne
    @JoinColumn()
    private Event event;

    public Seat(Integer number,
                Integer row,
                Status status,
                Event event) {
        this.number = number;
        this.row = row;
        this.status = status;
        this.event = event;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", number=" + number +
                ", row=" + row +
                ", status=" + status +
                ", event=" + event +
                '}';
    }
}
