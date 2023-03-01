package co.mhRise.setBuilderMhRiseSunbreak.model.weapon;

import javax.persistence.*;

@Table(name = "Weapon")
@Entity
public class Weapon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;
    private String name;
    private int rowAttack;
    private String elementType;
    private int elementalAttack;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
