package co.mhRise.setBuilderMhRiseSunbreak.model.ability;

import javax.persistence.*;

@Entity
@Table(name = "rampageAbility")
public class RampageAbility {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    String desc;
    int rampageSlot;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
