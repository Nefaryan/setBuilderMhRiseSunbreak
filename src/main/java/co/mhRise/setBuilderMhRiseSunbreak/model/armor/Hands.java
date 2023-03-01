package co.mhRise.setBuilderMhRiseSunbreak.model.armor;

import co.mhRise.setBuilderMhRiseSunbreak.model.ability.Ability;

import javax.persistence.*;

@Entity
@Table(schema = "Hands")
public class Hands {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    int defense;
    int fireDef;
    int thunderDef;
    int waterDef;
    int iceDef;
    int dragonDef;

    @ManyToOne
    @JoinColumn(name = "ability_id")
    private Ability ability;

    public Ability getAbility() {
        return ability;
    }

    public void setAbility(Ability ability) {
        this.ability = ability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
