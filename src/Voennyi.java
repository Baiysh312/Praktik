public abstract class  Voennyi {
    String name;
    String zvanie;
    int year;
    Bag bag;

    public Voennyi(String name, String zvanie, int year, Bag bag) {
        this.name = name;
        this.zvanie = zvanie;
        this.year = year;
        this.bag = bag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getZvanie() {
        return zvanie;
    }

    public void setZvanie(String zvanie) {
        this.zvanie = zvanie;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Bag getBag() {
        return bag;
    }

    public void setBag(Bag bag) {
        this.bag = bag;
    }

}
