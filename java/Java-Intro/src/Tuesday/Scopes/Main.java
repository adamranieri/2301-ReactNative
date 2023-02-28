package Tuesday.Scopes;

public class Main {
    public static void main(String[] args) {

        for(int i = 0; i < 10; i ++) {

        }

        // cannot access block-scoped i:
//        System.out.println(i);
        for(int i = 0; i < 10; i ++) {

        }
    }
}
