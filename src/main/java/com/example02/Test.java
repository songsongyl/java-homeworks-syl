package com.example02;

public class Test {
    public static void main(String[] args){
        User user = new User();
        user = creatUser();
        listGames(user);
    }
    public static User creatUser(){
        Role role1 = new Role();
        role1.setName("普通用户");
        role1.setId(1);
        Role role2 = new Role();
        role2.setName("VIP");
        role2.setId(2);
        Game game1 = new Game();
        game1.setId(1);
        game1.setName("魂斗罗");
        Game game2 = new Game();
        game2.setId(2);
        game2.setName("超级马里奥");
        User user1 = new User();
        user1.setId(1);
        user1.setName("Mike");
        user1.setRole("VIP");
        user1.setGame("魂斗罗", "超级马里奥");
        return user1;
    }
    public static void listGames(User user1){
        String[] a = user1.getGame();
        for(int i = 0;i < a.length;i++){
            System.out.println(a[i]);
        }
    }

}
