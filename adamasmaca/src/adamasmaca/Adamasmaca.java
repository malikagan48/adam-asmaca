package adamasmaca;
import java.util.Scanner;
public class Adamasmaca {
    public static void main(String[] args) {
        String kelime= "siyah";
        int i;
        int tahminn=0;
        int anahtarkelime=0;
        int dogruu=0;
        String eldevar[] = new String[kelime.length()];
        System.out.println("Kelimeyi bulmanız için 5 adet yanlış harf kullanma hakkınız var");
        Scanner klv= new Scanner(System.in);
        for (i = 0; i < kelime.length(); i++) {
             eldevar[i] = "_ ";
        }
           finish:
                while(tahminn<6){
                        System.out.println("Bir harf giriniz (Kalan hakkiniz "+(5-tahminn) +") : ");
                        String harf = klv.nextLine();
                        tahminn++;
                        for (i = 0; i < kelime.length(); i++)
                        {
                                if (kelime.charAt(i) == harf.charAt(0))
                                {
                                        eldevar[i] = harf+" ";
                                        anahtarkelime = 0;
                                        dogruu++;
                                        if (dogruu == kelime.length()) 
                                        {
                                            System.out.println("kelimemiz buydu : " +kelime  +"  Tebrikler bildinizz  ");
                                        break finish;
                                        }
                                }
                        }
                        if (anahtarkelime == 1) 
                        {
                            anahtarkelime = 0; 
                            tahminn--;
                        }
                        for (i = 0; i < kelime.length(); i++)
                        {
                                System.out.print(eldevar[i]);
                        }
                        System.out.println();
                }
                if (dogruu != kelime.length()) 
                { 
                    System.out.println("Bilemedinizz :( Dogru yanitimiz ==" + kelime); 
                }
    }
    
}
