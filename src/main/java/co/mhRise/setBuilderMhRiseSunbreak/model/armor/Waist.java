package co.mhRise.setBuilderMhRiseSunbreak.model.armor;

import javax.persistence.*;

@Entity
@Table(name= "waist")
public class Waist {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
