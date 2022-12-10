package ouohoon.findemoproject.item;

import lombok.Getter;

import javax.persistence.*;

@Entity
@Getter
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "item_id")
    private Long id;

    @Column(length = 100, nullable = false)
    private String name;
}
