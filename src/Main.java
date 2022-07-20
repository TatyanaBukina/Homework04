import java.time.Year;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//задание 1
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
        for (int y = 10; y >= 0; y = y - 1) {
            System.out.println(y);
        }
        {
        // задание 2

        for(int f = 5; f <= 31; f=f+7){
            System.out.println(("Сегодня пятница" ) + f+ ("е число. Необходимо подготовить отчет"));
        }
    }

        // задание 3
        int Y=0, year=2022;
        int yearStart = year+100;
        int yearStop = year-200;
        while (Y<=yearStart){
            Y+=79;
            if (Y%79==0&&Y>=yearStop) {
                System.out.println(Y);
            }
                }
        }
}

