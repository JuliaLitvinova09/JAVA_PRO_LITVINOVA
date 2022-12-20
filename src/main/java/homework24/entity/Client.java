package homework24.entity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class  Client{
    private int id;
    private String name;
    private Long phone;
    private String email;
    private String about;

}
