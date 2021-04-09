package ru.ncedu.somov.task1;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.text.SimpleDateFormat;

/**
 * Класс HumanAddress, при помощи котрого осуществляется поиск по объектам классов Human и Address
 */

public class HumanAddress {
    private ArrayList<Human> human = new ArrayList<Human>();
    private ArrayList<Address> address = new ArrayList<Address>();

    /**
     * Конструктор класса HumanAddress, при помощи котрого, при создании объекта класса HumanAddress,
     * создаются объекты классов Human и Address и добавляются в ArrayList
     * @throws ParseException
     */
    public HumanAddress() throws ParseException {
        this.human.add(new Human(1, "Jack", "Smith", "1997-04-12", 1));
        this.human.add(new Human(2, "Mike", "Smith", "1997-05-07", 2));
        this.human.add(new Human(3, "Sam", "Rooney", "1990-05-08", 3));
        this.human.add(new Human(4, "Harry", "Potter", "1992-06-02", 4));

        this.address.add(new Address(1, "Russia", "Moscow", "Myasnickaya", "2/b", 1));
        this.address.add(new Address(2, "Russia", "Moscow", "Mira", "44/4", 2));
        this.address.add(new Address(3, "Russia", "Moscow", "Snejnaya", "16k4", 3));
        this.address.add(new Address(4, "Russia", "Moscow", "Myasnickaya", "8/4", 4));

    }

    /**
     * Метод searchBySurname реализовывает поиск объекта класса Human по свойству Surname
     * @param surname
     * @return
     */
    public ArrayList<String> searchBySurname(String surname) {

        ArrayList<String> ourHuman = new ArrayList<String>();


        for (int i = 0; i < this.human.size(); i++) {
            if (surname == this.human.get(i).getSurname()) {
                ourHuman.add("\n " + this.human.get(i));
            }
        }
        return ourHuman;
    }

    /**
     * Метод searchByAddressAttribute реализовывает поиск объекта класса Human по свойству addressId
     * @param addressId
     * @return
     */
    public ArrayList<String> searchByAddressAttribute(int addressId) {

        ArrayList<String> ourHuman = new ArrayList<String>();


        for (int i = 0; i < this.human.size(); i++) {
            if (addressId == this.human.get(i).getAddressId()) {
                ourHuman.add("\n " + this.human.get(i));
            }
        }
        return ourHuman;
    }

    /**
     * Метод searchByDateOfBirthRange реализовывает поиск объекта класса Human по свойству birthday,
     * которое находится в диапазоне [firstDate;secondDate]
     * @param firstDate
     * @param secondDate
     * @return
     * @throws ParseException
     */
    public ArrayList<String> searchByDateOfBirthRange(String firstDate, String secondDate) throws ParseException {

        ArrayList<String> ourHuman = new ArrayList<String>();
        Date ourFirstDate;
        Date ourSecondDate;

        SimpleDateFormat calendar = new SimpleDateFormat("yyyy-MM-dd");
        ourFirstDate = calendar.parse(firstDate);
        ourSecondDate = calendar.parse(secondDate);


        for (int i = 0; i < this.human.size(); i++) {
            if (ourFirstDate.before(this.human.get(i).getBirthday())) {
                if (this.human.get(i).getBirthday().before(ourSecondDate)) {
                    ourHuman.add("\n " + this.human.get(i));
                }
            }
        }
        return ourHuman;
    }

    /**
     * Метод searchForTheYoungestHuman реализовывет поиск объекта класса Human,
     * который имеет наибольшее значение в свойстве birthday (наименьший возраст)
     * @return
     */
    public ArrayList<String> searchForTheYoungestHuman() {

        ArrayList<String> ourHuman = new ArrayList<String>();
        Date youngestHuman = this.human.get(0).getBirthday();
        ourHuman.add("\n " + this.human.get(0));

        for (int i = 1; i < this.human.size(); i++) {
            if (this.human.get(i).getBirthday().after(youngestHuman)) {
                youngestHuman = this.human.get(i).getBirthday();
                ourHuman.set(0, "\n" + this.human.get(i));
            }
        }
        return ourHuman;
    }

    /**
     * Метод searchPeopleByStreetName реализовывается поиск объектов по двум классам Human и Address.
     * Сначала выполняетя поиск свойства Street класса Address.
     * Затем берет свойство humanId объекта класса Street.
     * Далее выполняется поиск объекта класса Human по свойству personId (address.humanId == human.personId)
     * @param street
     * @return
     */
    public ArrayList<String> searchPeopleByStreetName(String street) {

        ArrayList<String> ourHuman = new ArrayList<String>();

        for (int i = 0; i < this.address.size(); i++) {

            if (address.get(i).getStreet() == street) {
                int humanId = address.get(i).getHumanId();

                for (int j = 0; j < this.human.size(); j++) {
                    if(human.get(j).getPersonId() == humanId) {
                        ourHuman.add("\n " + this.human.get(j));
                    }
                }
            }
        }
        return ourHuman;

    }
}
