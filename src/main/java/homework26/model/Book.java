package homework26.model;

import lombok.*;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;

    @ManyToMany(mappedBy = "books")
    private Set<Client> clients;
}
