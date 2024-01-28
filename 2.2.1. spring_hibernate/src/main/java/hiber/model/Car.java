package hiber.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Car {

    @Column
    private String model;

    @Column
    private Integer series;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "car")
    User user;

    public Car(String model, int series) {
        this.model = model;
        this.series = series;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(series, car.series) && Objects.equals(model, car.model) && Objects.equals(id, car.id) && Objects.equals(user, car.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, series, id, user);
    }

    @Override
    public String toString() {
        return "Car{" +
                "model = '" + model + '\'' +
                ", series = " + series +
                ", id = " + id +
                ", user id = " + user.getId() +
                '}';
    }
}