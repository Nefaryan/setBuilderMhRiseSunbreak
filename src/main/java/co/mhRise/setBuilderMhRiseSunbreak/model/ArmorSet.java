package co.mhRise.setBuilderMhRiseSunbreak.model;

import javax.persistence.*;

@Entity
@Table(name = "ArmorSet")
public class ArmorSet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
