public class City {
    // class
    public static final int BIG_CITY = 250000;

    // instance variables
    private String name;
    private int population;
    private double area;

    public City(String name, int population, double area) {
        this.name = name;
        this.population = population;
        this.area = area;
    }

    public City merge(City that) {
        String newName = "";
        if (this.difference(that) > 0) {
            newName = this.name + "-" + that.name;
        }
        else {
            newName = that.name + "-" + this.name;
        }
        return new City(newName,
                        this.population + that.population,
                        this.area + that.area);
    }

    public int populationDensity() {
        return (int) Math.round(this.population / this.area);
    }

    public int difference(City that) {
        return this.populationDensity() - that.populationDensity();
    }

    public boolean isBigCity() {
        return (this.population > BIG_CITY);
    }

    public String toString() {
        return this.name + " " + this.population + " " + this.area;
    }
}
