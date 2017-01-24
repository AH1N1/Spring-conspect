package AH1N1.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by RENT on 2017-01-24.
 */
@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String country;
    private String city;
    private String street;
    private Integer bulidingNumber;
    private Integer flatName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Integer getBulidingNumber() {
        return bulidingNumber;
    }

    public void setBulidingNumber(Integer bulidingNumber) {
        this.bulidingNumber = bulidingNumber;
    }

    public Integer getFlatName() {
        return flatName;
    }

    public void setFlatName(Integer flatName) {
        this.flatName = flatName;
    }

    public Address() {
    }
}
