import java.util.Scanner;
public class Main {
    static int sum(int a, int b){
        int result = a+b;
        System.out.println("Toplam :" + result);
        return result;
    }
    static int minus (int a, int b){
        int result = a-b;
        System.out.println("Çıkarma : "+result);
        return result;
    }
    static int times (int a,int b){
        int result = a*b;
        System.out.println("Çarpma :" + result);
        return result;
    }
    static int divided(int a,int b){
        if(b!=0){
            int result = a/b;
            System.out.println("Bölme : "+result);
            return result;
        }else{
            String error=" Sıfıra Bölünmez";
            System.out.println(error);
            return 0;
        }
    }
    static int power (int a,int b){
        int result =1;
        for(int i=1; i<=b;i++){
            result*=a;
        }
        return result;
    }
    static void calc(int a, int b){
        System.out.println("Çevresi : "+(2*(a+b)));
        System.out.println("Alan : "+ (a*b));
    }
    static int mod (int a,int b){
        return a%b;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int select;

        String menu = "1- Toplama İşlmi\n"
                +"2- Çıkarma İşlemi\n"
                +"3- Çarpma İşlemi\n"
                +"4- Bölme İşlemi\n"
                +"5- Üslü Sayılar Hesaplama\n"
                +"6- Mod Alma\n"
                +"7- Dikdörtgen Alan ve Çevre Hesabı\n"
                +"0- Çıkış Yap";
        System.out.println(menu);
        System.out.print("Bir İşlem Seçiniz :");
        while(true) {
            System.out.print("Bir İşlem Seçiniz :");
            select = input.nextInt();
            if(select==0){
                break;
            }
            System.out.print("İlk sayıyı giriniz : ");
            int a = input.nextInt();
            System.out.print("İkinci sayıyı giriniz : ");
            int b = input.nextInt();

            switch (select){
                case 1:
                    sum(a,b);
                    break;
                case 2:
                    minus(a,b);
                    break;
                case 3:
                    times(a,b);
                    break;
                case 4:
                    divided(a,b);
                    break;
                case 5:
                    System.out.println("Üs Hesabı :"+power(a,b));
                    break;
                case 6:
                    System.out.println("Mod İşlemi : "+ mod(a,b));
                   break;
                case 7:
                    calc(a,b);
                default:
                    System.out.println("Geçersiz Bir İşlem Girdiniz");
            }
        }
        System.out.println("Güle Güle ");
    }
}

























