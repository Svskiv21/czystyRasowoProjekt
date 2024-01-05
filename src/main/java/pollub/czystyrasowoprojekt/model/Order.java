package pollub.czystyrasowoprojekt.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@Entity
public class Order {

    @GeneratedValue
    @Id
    private Long id;

    // private AppUser appUser;

    @Column
    private String paymentMethod;

    @OneToOne(mappedBy = "order")
    private Ticket ticket;

    public Order(String paymentMethod,
                 Ticket ticket) {
        this.paymentMethod = paymentMethod;
        this.ticket = ticket;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", paymentMethod='" + paymentMethod + '\'' +
                ", ticket=" + ticket +
                '}';
    }
}
