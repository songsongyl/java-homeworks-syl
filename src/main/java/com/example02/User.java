package com.example02;

public class User {
    private int id;
    private String name;
    private String role;
    private String[] game;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setRole(String role){
        this.role = role;
    }
    public String getRole(){
        return role;
    }
    public void setGame(String... game){
        this.game = game;
    }
    public String[] getGame(){
        return game;
    }

}
