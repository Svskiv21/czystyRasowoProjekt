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

    @Column
    private String paymentMethod;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = true)
    private User user;

    @OneToMany(mappedBy = "kucOrder", cascade = CascadeType.ALL, orphanRemoval = true)
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
