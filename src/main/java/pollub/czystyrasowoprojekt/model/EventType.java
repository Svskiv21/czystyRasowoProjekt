package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class EventType {

    @GeneratedValue
    @Id
    private Long id;

    @Column
    private String name;

    @OneToMany(mappedBy = "eventType")
    private List<Event> events;

    public EventType(String name, List<Event> events) {
        this.name = name;
        this.events = events;
    }

    @Override
    public String toString() {
        return "EventType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", events=" + events +
                '}';
    }
}
