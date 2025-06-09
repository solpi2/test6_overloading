import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        String message = "Hello, java!";

        // 문자열 길이 확인
        // System.out.println("문자열 길이: " + message.length());

        // 대문자로 변환
        // System.out.println("대문자로 변환: " + message.toUpperCase());

        // 특정 문자열 추출
        // System.out.println(message.indexOf("j"));


        // 특정 문자열에서 멈춤
        for (int i = 0; i < message.length(); i++) {

            if(message.charAt(i) == 'l') {
                System.out.println(message.charAt(i));
                break;
            }
        }
    }
}