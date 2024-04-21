package com.example04;

import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args){
    User user1 = new User(1,"mike","china");
        User user2 = new User(2,"moke","China");
        User user3 = new User(3,"jack","NewYork");
        User user4 = new User(4,"jery","America");
        User user5 = new User(5,"bob","China");
        Set<User> userSet = new HashSet<>();
        userSet.add(user1);
        userSet.add(user2);
        userSet.add(user3);
        userSet.add(user4);
        userSet.add(user5);
//        System.out.println( userSet.size());
//        for(User user:userSet){
//            System.out.println(user.getName());
//        }
//     List<User> userList =  setToList(userSet);
//    userList.forEach(user -> System.out.println(user.getName()));
//        removeUser(userSet,2);
//        System.out.println( userSet.size());
    Map<String,List<User>>  listMap =  setMap(userSet);
       for(Map.Entry<String,List<User>> all:listMap.entrySet()){
           System.out.println(all.getKey());
           for(User values: all.getValue()){
               System.out.println(values.getName());
           }
       }
    }
    public static List<User> setToList(Set<User> users){
     return   users.stream().toList();
   // return users.stream().collect(Collectors.toList());
    }
    public static void removeUser(Set<User> userSet,int id){
      //userSet.removeIf(u -> id == u.getId());
        Iterator<User> userIterator = userSet.iterator();
        while (userIterator.hasNext()){
            User u =userIterator.next();
            if(id==u.getId()){
                userIterator.remove();
            }
        }
    }
    public static Map<String,List<User>> setMap(Set<User> userSet){
   return   userSet.stream().collect(Collectors.groupingBy(User::getCity));
    }
}
