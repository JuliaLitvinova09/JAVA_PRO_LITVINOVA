package homework26.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "clients")
@Getter
@Setter
@ToString
public class  Client{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private Long phone;
    private String email;
    private String about;
    private int age;

    @OneToMany(cascade = CascadeType.ALL)
    private Set<Account> accounts;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "chain_id")
    private Chain chain;

    @ManyToMany
    @JoinTable(
            name = "client_book_like",
            joinColumns = {@JoinColumn(name = "client_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}

    )
    private Set<Book> books;
}

