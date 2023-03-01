package co.mhRise.setBuilderMhRiseSunbreak.model.ability;

import co.mhRise.setBuilderMhRiseSunbreak.model.armor.Charm;
import co.mhRise.setBuilderMhRiseSunbreak.model.armor.Chest;

import javax.persistence.*;

@Entity
@Table(name = "ability")
public class Ability {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "id", nullable = false)
    private Long id;
    String Name;
    int level;
    int maxLevel;
    String levelDescription;
    String description;

    @ManyToOne
    @JoinColumn(name = "chest_id")
    private Chest chest;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "charm_id")
    private Charm charm;

    public Charm getCharm() {
        return charm;
    }

    public void setCharm(Charm charm) {
        this.charm = charm;
    }

    public Chest getChest() {
        return chest;
    }

    public void setChest(Chest chest) {
        this.chest = chest;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
