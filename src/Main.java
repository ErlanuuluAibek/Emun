import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String areas= scanner.nextLine();
        Areas areas1=Areas.valueOf(areas.toUpperCase());
        Areas chui=Areas.CHUI;
        Areas batken=Areas.BATKEN;
        Areas osh=Areas.OSH;
        Areas talas=Areas.TALAS;
        Areas naryn=Areas.NARYN;
        Areas issykKul=Areas.ISSYK_KUL;
        Areas jalalAbad=Areas.JALAl_ABAD;
        switch (areas1){
            case CHUI -> System.out.println(chui);
            case BATKEN -> System.out.println(batken);
            case OSH -> System.out.println(osh);
            case TALAS -> System.out.println(talas);
            case NARYN -> System.out.println(naryn);
            case ISSYK_KUL -> System.out.println(issykKul);
            case JALAl_ABAD -> System.out.println(jalalAbad);
            default -> System.out.println("нет такой области ");

        }


    }
}