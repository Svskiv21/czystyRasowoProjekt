package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class KucOrder {

    @GeneratedValue
    @Id
    private Long id;

    // private AppUser appUser;

    @Column
    private String paymentMethod;

    @OneToMany(mappedBy = "kucOrder", cascade = CascadeType.ALL)
    private List<Ticket> tickets;

    public KucOrder(String paymentMethod, List<Ticket> tickets) {
        this.paymentMethod = paymentMethod;
        this.tickets = tickets;
    }

    @Override
    public String toString() {
        return "KucOrder{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", tickets=" + tickets +
                '}';
    }
}
