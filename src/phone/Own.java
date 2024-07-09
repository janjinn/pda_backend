public abstract class Own implements Phone, Person{
    String name;
    String phoneName;

    public Own(String name, String phoneName){
        this.name = name;
        this.phoneName = phoneName;
    }

    public void buy(){
        System.out.println(name + "님이 " + phoneName + "폰을 구매했습니다.");
    }
    public void turnOn(){
        System.out.println(name + "님이 " + phoneName + "폰을 켰습니다.");
    }

    public abstract void alarm();
}
