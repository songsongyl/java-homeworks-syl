package com.example01;

public class Student {

        private String name;
        private Sex sex;
        public enum Sex{
            MALE, FEMALE
        }

        public  void setName(String name){
            this.name = name;
        }
        public void setSex(Sex sex){
            this.sex = sex;
        }
        public String getName(){
            return name;
        }
        public Sex getSex(){
            return sex;
        }


}
