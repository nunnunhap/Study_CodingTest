package chap01.problem10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A = scanner.nextInt();
        String B = scanner.next();

        scanner.close();

        // charAt() : 문자열에서 특정 인덱스에 위치한 문자(char)을 반환
        System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(2))));
        System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(1))));
        System.out.println(A * Integer.parseInt(String.valueOf(B.charAt(0))));
        // parseInt() : 문자열을 정수로 변환
        System.out.println(A * Integer.parseInt(B));
    }
}
