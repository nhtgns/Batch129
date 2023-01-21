package day30exceptionsinterface;

 /*
 1)Bir interface'i bir Class'in parent'i yapmak icin "implements" keyword'unu kullaniriz.
 2)Java parent'lar Class oldugunda "multiple parent"a musaade etmez ama biz bazen "multiple parent"a ihtiyac duyariz.
  Bu ihtiyaci gidermek icin Java "interface" ismini verdigi yeni bir yapi olusturdu.
  Bu yapi sayesinde bir Class icin coklu interface parent olusturabiliriz.
 */
public class Civic implements Ac, Engine,Security {
     @Override
     public void cool() {
         System.out.println("Civic cools perfectly");
     }
 }
