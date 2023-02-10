package baitap.ss1_introduction_to_java;
import java.util.Scanner;
public class DocSoThanhChu {
    static String S = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        if (number>=0 && number<10){
            switch (number){
                case 0:
                    S="zero";
                    break;
                case 1:
                    S="one";
                    break;
                case 2:
                    S="two";
                    break;
                case 3:
                    S="three";
                    break;
                case 4:
                    S="four";
                    break;
                case 5:
                    S="five";
                    break;
                case 6:
                    S="six";
                    break;
                case 7:
                    S="seven";
                    break;
                case 8:
                    S="eight";
                    break;
                case 9:
                    S="nine";
                    break;
            }
        }else if (number<20){
            switch (number%10){
                case 0:
                    S="ten";
                    break;
                case 1:
                    S="eleven";
                    break;
                case 2:
                    S="twelve";
                    break;
                case 3:
                    S="thirteen";
                    break;
                case 4:
                    S="fourteen";
                    break;
                case 5:
                    S="fifteen";
                    break;
                case 6:
                    S="sixteen";
                    break;
                case 7:
                    S="seventeen";
                    break;
                case 8:
                    S="eighteen";
                    break;
                case 9:
                    S="nineteen";
                    break;
            }
        }else if (number<100){
            switch (number/10){
                case 2:
                    S="Twenty ";
                    break;
                case 3:
                    S="thirty ";
                    break;
                case 4:
                    S="forty ";
                    break;
                case 5:
                    S="fifty ";
                    break;
                case 6:
                    S="sixty ";
                    break;
                case 7:
                    S="seventy ";
                    break;
                case 8:
                    S="eighty ";
                    break;
                case 9:
                    S="ninety ";
                    break;
            }
            switch (number%10){
                case 1:
                    S+="one";
                    break;
                case 2:
                    S+="two";
                    break;
                case 3:
                    S+="three";
                    break;
                case 4:
                    S+="four";
                    break;
                case 5:
                    S+="five";
                    break;
                case 6:
                    S+="six";
                    break;
                case 7:
                    S+="seven";
                    break;
                case 8:
                    S+="eight";
                    break;
                case 9:
                    S+="nine";
                    break;
            }
        }else if (number<1000){
            switch (number/100){
                case 1:
                    S= "one hundred";
                    break;
                case 2:
                    S="two hundred";
                    break;
                case 3:
                    S="three hundred";
                    break;
                case 4:
                    S="four hundred";
                    break;
                case 5:
                    S="five hundred";
                    break;
                case 6:
                    S="six hundred";
                    break;
                case 7:
                    S="seven hundred";
                    break;
                case 8:
                    S="eight hundred";
                    break;
                case 9:
                    S="nine hundred";
                    break;
            }
            int temp = number%100;
            if (temp>=10&&temp<20){
                switch (temp){
                    case 10:
                        S+=" and ten";
                        break;
                    case 11:
                        S+=" and eleven";
                        break;
                    case 12:
                        S+=" and twelve";
                        break;
                    case 13:
                        S+=" and thirteen";
                        break;
                    case 14:
                        S+=" and fourteen";
                        break;
                    case 15:
                        S+=" and fifteen";
                        break;
                    case 16:
                        S+=" and sixteen";
                        break;
                    case 17:
                        S+=" and seventeen";
                        break;
                    case 18:
                        S+=" and eighteen";
                        break;
                    case 19:
                        S+=" and nineteen";
                        break;
                }
            }else {
                switch ((number%100)/10){
                    case 2:
                        S+=" and twenty";
                        break;
                    case 3:
                        S+=" and thirty";
                        break;
                    case 4:
                        S+=" and forty";
                        break;
                    case 5:
                        S+=" and fifty";
                        break;
                    case 6:
                        S+=" and sixty";
                        break;
                    case 7:
                        S+=" and seventy";
                        break;
                    case 8:
                        S+=" and eighty";
                        break;
                    case 9:
                        S+=" and ninety";
                        break;
                }
                switch ((number%100)%10){
                    case 1:
                        S+=" one";
                        break;
                    case 2:
                        S+=" two";
                        break;
                    case 3:
                        S+=" three";
                        break;
                    case 4:
                        S+=" four";
                        break;
                    case 5:
                        S+=" five";
                        break;
                    case 6:
                        S+=" six";
                        break;
                    case 7:
                        S+=" seven";
                        break;
                    case 8:
                        S+=" eight";
                        break;
                    case 9:
                        S+=" nine";
                        break;
                }
            }
        }
        System.out.println(S);
    }
}

