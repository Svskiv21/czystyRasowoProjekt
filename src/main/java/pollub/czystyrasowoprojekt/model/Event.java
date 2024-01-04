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

    @OneToMany(mappedBy = "event")
    private List<Ticket> tickets;

//    @Column(name = "event_type_id")
//    private Long eventTypeId;

    @Column
    private String title;

    @Column
    private String description;

    @Column
    private String pictures;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "end_date")
    private Date endDate;

    @Column
    private String address;

    @Column(name = "limited_number_of_seats")
    private Boolean limitedNrOfSeats;

//    @Column(name = "number_of_zones")
//    private Integer numberOfZone; // to bedzie foreign key

    @Column(name = "age_range")
    private String ageRange;

//    public Event(List<Ticket> tickets,
//                 String title,
//                 String description,
//                 String pictures,
//                 Date startDate,
//                 Date endDate,
//                 String address,
//                 Boolean limitedNrOfSeats,
//                 String ageRange) {
//        this.tickets = tickets;
//        this.title = title;
//        this.description = description;
//        this.pictures = pictures;
//        this.startDate = startDate;
//        this.endDate = endDate;
//        this.address = address;
//        this.limitedNrOfSeats = limitedNrOfSeats;
//        this.ageRange = ageRange;
//    }

    @Override
    public String toString() {
        return "Event{" +
                "id=" + id +
                ", tickets=" + tickets +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", pictures='" + pictures + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", address='" + address + '\'' +
                ", limitedNrOfSeats=" + limitedNrOfSeats +
                ", ageRange='" + ageRange + '\'' +
                '}';
    }
}
