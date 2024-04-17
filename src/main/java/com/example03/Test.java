package com.example03;

public class Test {
    public static void main(String[] args){
        Botton b1 = new Botton("BottonA");
        b1.setClickable(new Clickable() {
            @Override
            public void click() {
                System.out.println(b1.getName());            }
        });
        //System.out.println(b1.getClickable());
        b1.getClickable().click();


//        Botton b3 = new Botton();
//        Clickable c1 = new Clickable() {
//            @Override
//            public void click() {
//                System.out.println("sad");
//            }
//        };
//        b3.setClickable(c1);
//        b3.getClickable().click();
        Botton b2 = new Botton("BottonB");
        b2.setClickable(new Clickable() {
            @Override
            public void click() {
                System.out.println(b2.getName());
            }
        });
        // System.out.println(b2.getClickable());
        b2.getClickable().click();
    }

}
