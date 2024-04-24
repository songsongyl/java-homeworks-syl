package com.example06;

import java.time.Year;
import java.util.*;

public class Test {
    public static final Set<User> USERS = create();
    public static final String CHINA ="中国";
    public static final String AMERICA ="美国";
    public static void main(String[] args){
        toMap(USERS);
    }
    private static Set<User> create(){
        User user1 = new User(1,"syl",CHINA);
        User user2 = new User(2,"ll",AMERICA);
        User user3 = new User(3,"bob",CHINA);
        User user4 = new User(4,"mike",AMERICA);
        Set<User> users = new HashSet<>();
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        return users;
    }


    private static void toMap(Set<User> users) {
        Map<String, Set<User>> map = new HashMap<>();

        for(User user:users){
            Set<User> set1 = map.computeIfAbsent(user.getCity(), k -> new HashSet<>());
            set1.add(user);
//             Set<User> set = map.getOrDefault(user.getCity(),  new HashSet<>());
//            set.add(user);
//            map.put(user.getCity(),set);
//            String city =user.getCity();
//            map.computeIfAbsent(city, k -> new HashSet<>());
//            map.get(city).add(user);
//            map.computeIfAbsent(user.getCity(),k->new HashSet<>()).add(user);
        }
        System.out.println(map.size());
        for(Map.Entry<String,Set<User>> all:map.entrySet()){
            System.out.println(all.getKey() );
            for(User user: all.getValue()){
                System.out.println(user.getName());
            }
        }
        //map.forEach((k,v)-> System.out.println(k +" " + map));
    }
}
