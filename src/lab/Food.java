package lab;

public class Food {
    private int id;
    private String name;
    private String type;
    private int size;
    private double prize;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }
    public void getMenu(){
        System.out.printf("[id]%-15d[name]%-15s[type]%-15s[size]%-15d[price]%10.2f\n",id,name,type,size,prize);
    }
}