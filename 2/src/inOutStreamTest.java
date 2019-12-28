import java.io.FileInputStream;
import java.io.FileOutputStream;

class inOutStreamTest {
    public static void main(String[] args) throws Exception {
        // Создаём поток чтения
        FileInputStream inputStream = new FileInputStream("d:/Java/random_tasks/1/src/availableTest.java");
        //Создаём поток записи
        FileOutputStream outputStream = new FileOutputStream("D:/Java/random_tasks/2/outputFile/ResultFile.txt");

        //Запускаем цикл побайтового копирования
        while (inputStream.available() > 0) {
            int data = inputStream.read();
            outputStream.write(data);
        }

        inputStream.close();
        outputStream.close();
    }
}