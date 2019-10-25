package Command;

public class Light {
    public String location = "Light" ;

    public Light(String location) {
        this.location = location ;
    }
    public void on() {
        System.out.println(location+" is on");
    }
    public void off() {
        System.out.println(location+" is off");
    }

}
