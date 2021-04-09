package ru.ncedu.somov.task1;

/**
 * Класс Address описывает данные о конкретном адресе
 */
public class Address {
    private int addressId;
    private String country;
    private String city;
    private String street;
    private String domNumber;
    private int humanId;

    /**
     * Конструктор класса Address
     * @param addressId
     * @param country
     * @param city
     * @param street
     * @param domNumber
     * @param humanId
     */
    public Address(int addressId, String country, String city, String street, String domNumber, int humanId) {
        this.addressId =addressId;
        this.country = country;
        this.city = city;
        this.street = street;
        this.domNumber = domNumber;
        this.humanId = humanId;
    }

    public int getAddressId() {
        return addressId;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getDomNumber() {
        return domNumber;
    }

    public int getHumanId() {
        return humanId;
    }
}
