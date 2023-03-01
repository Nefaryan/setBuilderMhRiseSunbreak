package co.mhRise.setBuilderMhRiseSunbreak.model.ability;

import javax.persistence.*;
import java.util.LinkedHashSet;
import java.util.Set;

@Entity
@Table(name = "decoration" )
public class Decoration {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;

    String name;
    int Slot;

    @ManyToMany
    @JoinTable(name = "decoration_abilities",
            joinColumns = @JoinColumn(name = "decoration_id"),
            inverseJoinColumns = @JoinColumn(name = "abilities_id"))
    private Set<Ability> abilities = new LinkedHashSet<>();

    public Set<Ability> getAbilities() {
        return abilities;
    }

    public void setAbilities(Set<Ability> abilities) {
        this.abilities = abilities;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
