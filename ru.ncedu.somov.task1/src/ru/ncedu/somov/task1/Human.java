package ru.ncedu.somov.task1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Класс Human описывает данные о конкретном человеке.
 */
public class Human {
    private int personId;
    private String name;
    private String surname;
    private Date birthday;
    private int addressId;

    /**
     * Конструктор класса
     * @param personId
     * @param name
     * @param surname
     * @param dateOfBirth
     * @param addressId
     * @throws ParseException
     */
    public Human(int personId, String name, String surname, String dateOfBirth, int addressId) throws ParseException {
        this.personId = personId;
        this.name = name;
        this.surname = surname;
        SimpleDateFormat calendar = new SimpleDateFormat("yyyy-MM-dd");
        this.birthday = calendar.parse(dateOfBirth);
        this.addressId = addressId;
    }

    public int getPersonId() {
        return personId;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getBirthday() {
        return birthday;
    }

    public int getAddressId() {
        return addressId;
    }

    /**
     * Переопределение метода toString
     * @return
     */
    @Override
    public String toString() {
        return "Human [HumanID: " + personId + ", Name: " + name + ", Surname: " + surname + ", DateOfBirth: " + birthday + "]";
    }

}
