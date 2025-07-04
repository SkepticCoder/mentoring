package ru.edu.hashmap;

import java.util.Objects;

public class Key {

    private String id;

    private String name;

    public Key(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Key key)) return false;
        return Objects.equals(getId(), key.getId()) && Objects.equals(getName(), key.getName());
    }

    //  result = 31 * result + Objects.hashCode(a[i]);
    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName());
    }
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Key key = (Key) o;
//        return Objects.equals(id, key.id) && Objects.equals(name, key.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, name);
//    }
}
