package buildings;

import persons.Person;


public class FarmHouse extends Building implements Paintable {
    private int size;

    public FarmHouse(Person person, String colorPaint, int size){
        super(person, colorPaint);
        this.size = size;
    }


    public void paint(String newPaint) {
        super.color = newPaint;
    }

    public String toString(){
        return super.toString() + "\n"+ "Type: Farm House" +"\n"+ "Farm Size: "+ size + " Sq feet";
    }
}
