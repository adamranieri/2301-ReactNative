package Monday.FlowControl;

public class SplitExample {
    public static void main(String[] args) {
        String sentence = "Hello this is a sentence";
        // delimiter is a "pattern" of how we want to split our string
        // array syntax is we include the []
        String[] arr = sentence.split(" ");
        for(int i = 0; i < arr.length; i ++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr.length);
        // Arrays in Java are statically-sized:
        // meaning we can't change the size and we can't push new elements on
//        arr.length = 6;
//        arr.push("New Word");

        // we can instnaitate an array like this
        int [] numbers = {1,2,3,4,5};

        // instantiate a new array of size 10 with all empty slots:
        boolean[] booleans = new boolean[10];
        booleans[5] = true;
        for(int i = 0; i < booleans.length; i ++) {
            System.out.println(booleans[i]);
        }

    }
}
