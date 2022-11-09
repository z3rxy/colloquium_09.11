import java.util.Scanner;

public class Main {
    public static Integer size;
    public static Scanner cin = new Scanner(System.in);
    public static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static boolean isDouble(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    public static String result(String str1, String str2) {
        //String str1 = cin.next(), str2 = cin.next();
        if(isInteger(str1)|| isDouble(str1)){
            while(isInteger(str1) || isDouble(str1)){
                System.out.println("Первая строка не должна быть числом. Введите новую строку.");
                str1 = cin.next();
            }
            if(isInteger(str2) && !isDouble(str2)){
                size = Integer.parseInt(str2);
                if(size > 0) {
                    String temp = str1;
                    for (int i = 1; i < size; i++) {
                        str1 += temp;
                    }
                }
                else if(size == 0) str1 = "";
                else if(size < 0){
                    while(size < 0) {
                        System.out.println("Число не может быть меньше нуля. Введите новое число или строку.");
                        str2 = cin.next();
                        if(isInteger(str2)) {
                            size = Integer.parseInt(str2);
                        }
                        else {
                            size = -1;
                            break;
                        }
                    }
                    if(size == -1){
                        str1 += str2;
                    }
                    else if(size == 0) str1 = "";
                    else {
                        String temp = str1;
                        for (int i = 1; i < size; i++) {
                            str1 += temp;
                        }
                    }
                }
            }
            else if(isDouble(str2)){
                while(isDouble(str2) && !isInteger(str2)){
                    System.out.println("Введенное число должно быть целым. Введите новое число или строку.");
                    str2 = cin.next();
                }
                if(isInteger(str2)){
                    size = Integer.parseInt(str2);
                    if(size > 0) {
                        String temp = str1;
                        for (int i = 1; i < size; i++) {
                            str1 += temp;
                        }
                    }
                    else if(size == 0) str1 = "";
                    else if(size < 0){
                        while(size < 0) {
                            System.out.println("Число не может быть меньше нуля. Введите новое число или строку.");
                            str2 = cin.next();
                            if(isInteger(str2)) {
                                size = Integer.parseInt(str2);
                            }
                            else {
                                size = -1;
                                break;
                            }
                        }
                        if(size == -1){
                            str1 += str2;
                        }
                        else if(size == 0) str1 = "";
                        else {
                            String temp = str1;
                            for (int i = 1; i < size; i++) {
                                str1 += temp;
                            }
                        }
                    }
                }
                else{
                    str1 += str2;
                }
            }
            else {
                str1 += str2;
            }
        }
        else if(isInteger(str2) && !isDouble(str2)){
            size = Integer.parseInt(str2);
            if(size > 0) {
                String temp = str1;
                for (int i = 1; i < size; i++) {
                    str1 += temp;
                }
            }
            else if(size == 0) str1 = "";
            else if(size < 0){
                while(size < 0) {
                    System.out.println("Число не может быть меньше нуля. Введите новое число или строку.");
                    str2 = cin.next();
                    if(isInteger(str2)) {
                        size = Integer.parseInt(str2);
                    }
                    else {
                        size = -1;
                        break;
                    }
                }
                if(size == -1){
                    str1 += str2;
                }
                else if(size == 0) str1 = "";
                else {
                    String temp = str1;
                    for (int i = 1; i < size; i++) {
                        str1 += temp;
                    }
                }
            }
        }
        else if(isDouble(str2)){
            while(isDouble(str2) && !isInteger(str2)){
                System.out.println("Введенное число должно быть целым. Введите новое число или строку.");
                str2 = cin.next();
            }
            if(isInteger(str2)){
                size = Integer.parseInt(str2);
                if(size > 0) {
                    String temp = str1;
                    for (int i = 1; i < size; i++) {
                        str1 += temp;
                    }
                }
                else if(size == 0) str1 = "";
                else if(size < 0){
                    while(size < 0) {
                        System.out.println("Число не может быть меньше нуля. Введите новое число или строку.");
                        str2 = cin.next();
                        if(isInteger(str2)) {
                            size = Integer.parseInt(str2);
                        }
                        else {
                            size = -1;
                            break;
                        }
                    }
                    if(size == -1){
                        str1 += str2;
                    }
                    else if(size == 0) str1 = "";
                    else {
                        String temp = str1;
                        for (int i = 1; i < size; i++) {
                            str1 += temp;
                        }
                    }
                }
            }
        }
        else {
            str1 += str2;
        }
        return str1;
    }

    public static void main(String[] args) {
        String str1 = cin.next(), str2 = cin.next();
        String str = result(str1, str2);
        System.out.println(str);
    }
}