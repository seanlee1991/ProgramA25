package week8;

public class practice3 {

    public static void sayHello() {
        System.out.println("안녕하세요? 메소드입니다.");
    }




    public static void main(String[] args) {
        System.out.println("메소드 호출 전");
        
        sayHello(); // == System.out.println("안녕하세요? 메소드입니다.");

        System.out.println("메소드 호출 후후");
        
    }
}
