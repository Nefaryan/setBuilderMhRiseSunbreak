package co.mhRise.setBuilderMhRiseSunbreak.model.armor;

import co.mhRise.setBuilderMhRiseSunbreak.model.ability.Ability;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "charm")
public class Charm {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @OneToMany(mappedBy = "charm", orphanRemoval = true)
    private List<Ability> abilities = new ArrayList<>();

    private Integer numberOfSlot;


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
