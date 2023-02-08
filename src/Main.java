import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String areas= scanner.nextLine();
        Areas areas1=Areas.valueOf(areas.toUpperCase());
        switch (areas1){
            case CHUI -> System.out.println(Areas.CHUI);
            case BATKEN -> System.out.println(Areas.BATKEN);
            case OSH -> System.out.println(Areas.OSH);
            case TALAS -> System.out.println(Areas.TALAS);
            case NARYN -> System.out.println(Areas.NARYN);
            case ISSYK_KUL -> System.out.println(Areas.ISSYK_KUL);
            case JALAl_ABAD -> System.out.println(Areas.JALAl_ABAD);
            default -> System.out.println("нет такой области ");

        }


    }
}