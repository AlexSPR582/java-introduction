package by.epam.courses.module5.task4.treasure;

import java.util.Objects;

public class Treasure {
    private String name;
    private int price;

    public Treasure(String name, int price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        else if (obj == this) {
            return true;
        }
        Treasure treasure = (Treasure) obj;
        return treasure.name.equals(this.name)
                && treasure.price == this.price;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price) + Objects.hashCode(name);
    }

    @Override
    public String toString() {
        return "Treasure{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
