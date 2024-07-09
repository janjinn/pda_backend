public class Job extends Own{
    public Job(String name, String phoneName){
        super(name, phoneName);
    }

    public void alarm(){
        System.out.println("@@@ 폰 켜지는 중 @@@");
    }
}
