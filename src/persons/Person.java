package persons;

public class Person {
    protected String name;
    protected int amtOfBuildings;
    public Person(String name){
        this.name = name;
        this.amtOfBuildings = 0;
    }
    public void newBuilding(){
        amtOfBuildings +=1;
    }

    public String getName(){
        return name;
    }
    public int getAmtOfBuildings(){
        return amtOfBuildings;
    }

    public String toString(){
        System.out.println("Owner Information");
        return "Name: "+ getName() + "\n" + "Number of Buildings: "+ getAmtOfBuildings();
    }

}
