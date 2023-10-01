package buildings;

import persons.Person;


public class OldHouse extends Building {
    private int yearBuilt;

    public OldHouse(Person person, String colorPaint, int yearBuilt){
        super(person, colorPaint);
        this.yearBuilt = yearBuilt;
    }

    public String toString(){
        return super.toString() +"\n"+ "Type: Old House"+ "\n"+ "Year Built: " + yearBuilt;
    }

}
