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
    private Zone zone;

    public Seat(Integer number, Integer row, Status status, Zone zone) {
        this.number = number;
        this.row = row;
        this.status = status;
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "Seat{" +
                "id=" + id +
                ", number=" + number +
                ", row=" + row +
                ", status=" + status +
                ", zone=" + zone +
                '}';
    }
}
