package es.upm.miw.iwvg.ecosystem.practica;
import java.util.Arrays;
import java.util.stream.Collectors;

public class User {

    private int number;

    private String name;

    private String familyName;

    public User(int number, String name, String familyName) {
        this.number = number;
        this.name = this.newFormat(name);
        this.familyName = this.newFormat(familyName);
    }

    private String newFormat(String string){
        return  String.join(" ",Arrays.asList(string.split(" ")).stream().map(value -> value.trim().substring(0, 1)
                .toUpperCase() + value.substring(1).toLowerCase()).collect(Collectors.toList()));
    }

    private String format(String string) {
        return string.trim().substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public String fullName() {
        return this.name + " " + this.familyName;
    }

    public String initials() {
        return this.name.substring(0, 1) + ".";
    }

    public int getNumber() {
        return this.number;
    }

    public String getName() {
        return this.name.toUpperCase();
    }

    public String getFamilyName() {
        return this.familyName;
    }

}