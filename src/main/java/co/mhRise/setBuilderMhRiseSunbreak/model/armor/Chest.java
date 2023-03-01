package co.mhRise.setBuilderMhRiseSunbreak.model.armor;


import co.mhRise.setBuilderMhRiseSunbreak.model.ability.Ability;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="chest")
public class Chest {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    int defense;
    int fireDef;
    int thunderDef;
    int waterDef;
    int iceDef;
    int dragonDef;


    @ManyToMany
    @JoinTable(name = "chest_abilities",
            joinColumns = @JoinColumn(name = "chest_id"),
            inverseJoinColumns = @JoinColumn(name = "abilities_id"))
    private List<Ability> abilities = new ArrayList<>();

    public List<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(List<Ability> abilities) {
        this.abilities = abilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
