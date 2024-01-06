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

    @OneToMany(mappedBy = "kucOrder")
    private List<Ticket> ticket;

    public KucOrder(String paymentMethod, List<Ticket> ticket) {
        this.paymentMethod = paymentMethod;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "KucOrder{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
