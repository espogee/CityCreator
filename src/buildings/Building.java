package buildings;

import persons.Person;

public class Building {
    protected Person person;
    protected String color;


    public Building(Person person, String colorPaint){
        this.person = person;
        this.color = colorPaint;
        this.person.newBuilding();
    }

    public String toString(){
        System.out.println("Building Information");
        return "Owner: " + person.getName() +"\n"+ "Building Color: "+ color;
    }


}
