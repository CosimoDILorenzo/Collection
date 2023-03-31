public class Dog {
    String name;
    String type;
    String size;
    String cip;

    public Dog(String name, String type, String size, String cip) {
        this.name = name;
        this.type = type;
        this.size = size;
        this.cip = cip;
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

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getCip() {
        return cip;
    }

    public void setCip(String cip) {
        this.cip = cip;
    }
}
