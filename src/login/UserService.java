public class UserService {
    UserDAO userDAO = new UserDAO();
    ConsoleService consoleService = new ConsoleService();
    private boolean isStart = true;

    public void startService(){
        while(isStart){
            selectMenu(consoleService.receiveMenu());
        }
    }

   public void join(User user){
       userDAO.save(user);

       System.out.println(user.getName() + "님 가입을 환영합니다.");
   }

   private User configureUser(String str){
       String userInfo[] = str.split(" ");
       String id = userInfo[0];
       String psw = userInfo[1];

       return new User(id, psw);
   }

   public void selectMenu(String menu){
       switch (menu){
           case "1":
               joinService();
               break;
           case "2":
               logIn();
               break;
           case "3":
               editUserInfo();
               break;
           case "4":
               removeUser();
               break;
           case "0":
               exitService();
               break;
       }
   }

   private void joinService(){
       join(configureUser(consoleService.receiveUserInfo()));
   }

   private void logIn(){
       System.out.println("login");
   }

   private void editUserInfo(){
        userDAO.updateUserInfo();
       System.out.println("edit info");

   }

   private void removeUser(){
       System.out.println("remove user");

   }

   private void exitService(){
       System.out.println("exit");
       isStart = false;
   }
}
