package pl.catBreeding;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Builder
@Getter
@Setter
@ToString

public class Cat {
    private String name;
    private String race;
    private Colour color;
    int age;
}


