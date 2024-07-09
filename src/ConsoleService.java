import java.util.Scanner;

public class ConsoleService {
    Scanner sc = new Scanner(System.in);
    public String receiveMenu(){
        System.out.println("1: 회원가입, 2: 로그인, 3: 회원정보 수정, 4: 탈퇴, 0: 종료");
        System.out.print("입력: ");

        String menu = sc.nextLine();
        return menu;
    }

    public String receiveUserInfo(){
        System.out.println("가입하실 아이디와 비밀번호를 (띄어쓰기로 구분해) 입력하세요.");
        return sc.nextLine();
    }

    public void welcomeMsg(String name){
        System.out.println(name + "님 가입을 환영합니다.");
    }

    public void errorMsg(){
        System.out.println("로그인 상태가 아닙니다.");
    }
}
