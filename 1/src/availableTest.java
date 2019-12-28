import java.io.FileInputStream;

class availableTest {
    public static void main(String[] args) throws Exception
    {
        FileInputStream inputStream = new FileInputStream("d:/Java/random_tasks/1/src/availableTest.java");
        long sum = 0;

        while(inputStream.available() > 0) {
            int data = inputStream.read();
            sum += data;
        }
        inputStream.close();

        System.out.println(sum);
    }
}