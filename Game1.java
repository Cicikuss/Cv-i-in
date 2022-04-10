
import java.util.Scanner;


public class Game1 {
    public static void main(String[] args) {
        System.out.println("Adam asmaca oyunuma hoşgeldiniz...");
       
        Scanner klavye = new Scanner(System.in);
        
        
        while (true) {
            System.out.println("Oyunu başlamak için 1 , çıkmak için q ya basınız.");
            String a = klavye.next();
            if (a.equalsIgnoreCase("1")){
                System.out.println("Lütfen rakibinin tahmin etmesi için bir kelime giriniz: ");
                String s = klavye.next();
                int k =0;
                String yanlışk="",boşluk="";
                int hak = 6 ;
                while(s.length()>k){
                    boşluk += "_";
                    k++;
                    
                }
                
                do { 
                    System.out.println(boşluk);
                    System.out.println("Lütfen harf tahmin ediniz");
                    String tahmin =klavye.next();
                    boolean yanlış = true;
                   
                    for(int i = 0 ;i < s.length();i++){
                        
                        if(tahmin.equalsIgnoreCase(s.substring(i,i+1))){
                            boşluk = boşluk.substring(0,i)+tahmin+boşluk.substring(i+1,s.length());
                           
                            yanlış=false;
                            
                            
                        }
                       
                        }
                     if(yanlış){
                            System.out.println("Yanlış harf :(");
                            hak --;
                            yanlışk += tahmin +" ";
                            
                        }
                        switch(hak){
                            case 5:
                                System.out.println("O");
                                break;
                            case 4:
                                System.out.println("O");
                                System.out.println("|");
                                break;
                            case 3:
                              System.out.println(" O");
                              System.out.println("/"+"|");
                              break;
                            case 2:
                              System.out.println(" O");
                              System.out.println("/"+"|"+"\\");
                              break;
                              
                            case 1:
                              System.out.println(" O");
                              System.out.println("/"+"|"+"\\");
                              System.out.println("/");
                              break;
                             case 0:
                              System.out.println(" O");
                              System.out.println("/"+"|"+"\\");
                              System.out.println(" /"+"\\");
                              System.out.println("GG");
                              break;
                    }
                    System.out.println("Yanlış harfler: "+yanlışk);
                    System.out.println("***********************************************");
                    
                if(boşluk.equalsIgnoreCase(s)){
                        System.out.println("Tebrikler...");
                        break;
                    }    
                    
                } while (hak>0);
                
                
            }
            else if(a.equalsIgnoreCase("q")){
                break;
            }
            else{
                System.out.println("Hatalı input");
            }
            
        }
        
    }
    
}
