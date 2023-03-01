package co.mhRise.setBuilderMhRiseSunbreak.model.armor;

import co.mhRise.setBuilderMhRiseSunbreak.model.ability.Ability;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "Head")
public class Head {
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

    @ManyToMany
    @JoinTable(name = "head_abilities",
            joinColumns = @JoinColumn(name = "head_id"),
            inverseJoinColumns = @JoinColumn(name = "abilities_id"))
    private Set<Ability> abilities = new LinkedHashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }
}
