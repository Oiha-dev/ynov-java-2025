package fr.ynov.java.medium;

import java.util.Objects;

public class Quality {
    int id;
    String name;

    public static void main(String[] args) {
        Quality quality = new Quality();
        quality.id = 1;
        quality.name = "High";

        Quality quality2 = new Quality();
        quality2.id = 1;
        quality2.name = "High";

        System.out.println(quality.equals(quality2));
        System.out.println(quality == quality2);
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Quality quality = (Quality) o;
        return id == quality.id && Objects.equals(name, quality.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
