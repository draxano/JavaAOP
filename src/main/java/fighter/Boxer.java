package fighter;


import org.springframework.stereotype.Component;

@Component
public class Boxer {
    private String country;
    private String name;
    private int level;
    private double weight;
    private String move;



    public void punch(){
        System.out.println(name + " landed a beautiful " + move);
    }

    public void introduction(){
        System.out.println("Please welcome "+ name +" fighting out of "+country);
    }

    public void fighterDetails(){
        System.out.println(level + " " + " weighing in " + weight);
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getMove() {
        return move;
    }

    public void setMove(String move) {
        this.move = move;
    }

}
