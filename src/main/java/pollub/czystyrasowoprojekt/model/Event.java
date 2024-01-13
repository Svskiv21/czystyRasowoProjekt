package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class Event {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String title;

    @Column(columnDefinition = "TEXT")
    private String description;

    @Column(columnDefinition = "TEXT")
    private String pictures;

    @Column(name = "startDate")
    private Date startDate;

    @Column(name = "endDate")
    private Date endDate;

    @Column
    private String address;

    @Column(name = "limitedNumberOfSeats")
    private Boolean limitedNumberOfSeats;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "eventType_id")
    private EventType eventType;

    @OneToMany(mappedBy = "event")
    private List<Zone> zones;

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

    @Column(name = "ageRange")
    private String ageRange;

    public Event(String title,
                 String description,
                 String pictures,
                 Date startDate,
                 Date endDate,
                 String address,
                 Boolean limitedNumberOfSeats,
                 EventType eventType,
                 List<Zone> zones,
                 List<Ticket> tickets,
                 String ageRange) {
        this.title = title;
        this.description = description;
        this.pictures = pictures;
        this.startDate = startDate;
        this.endDate = endDate;
        this.address = address;
        this.limitedNumberOfSeats = limitedNumberOfSeats;
        this.eventType = eventType;
        this.zones = zones;
        this.tickets = tickets;
        this.ageRange = ageRange;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pictures='" + pictures + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", address='" + address + '\'' +
                ", limitedNumberOfSeats=" + limitedNumberOfSeats +
                ", eventType=" + eventType +
                ", zones=" + zones +
                ", tickets=" + tickets +
                ", ageRange='" + ageRange + '\'' +
                '}';
    }
}
