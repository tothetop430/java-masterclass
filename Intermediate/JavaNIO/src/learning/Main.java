package learning;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        try (FileOutputStream binFile = new FileOutputStream("data.dat");
            FileChannel binChannel = binFile.getChannel()) {
            byte[] bytes = "Hello World!".getBytes(StandardCharsets.UTF_8);
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            int writtenBytes = binChannel.write(byteBuffer);
            System.out.println("Bytes Written " + writtenBytes);

            ByteBuffer intBuffer = ByteBuffer.allocate(Integer.BYTES);
            intBuffer.putInt(42);
            intBuffer.flip();
            writtenBytes = binChannel.write(intBuffer);
            System.out.println("Integer Bytes Written " + writtenBytes);

            intBuffer.flip();
            intBuffer.putInt(-9823); intBuffer.flip();
            writtenBytes = binChannel.write(intBuffer);
            System.out.println("Negative Integer Buffer Written " + writtenBytes);

            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
            FileChannel readChannel = ra.getChannel();
            bytes[0] = 'a';
            byteBuffer.flip();
            readChannel.read(byteBuffer);
            System.out.println("Reading bytes buffer as " + new String(bytes));

//            RandomAccessFile ra = new RandomAccessFile("data.dat", "rwd");
//            byte[] b = new byte[bytes.length];
//            ra.read(b);
//            System.out.println(new String(b));
//
//            int num1 = ra.readInt();
//            int num2 = ra.readInt();
//            System.out.println("Number 1 " + num1);
//            System.out.println("Number 2 " + num2);
        }

//        FileInputStream fileInputStream = new FileInputStream("data.txt");
//        FileChannel fileChannel = fileInputStream.getChannel();

        Path filePath = FileSystems.getDefault().getPath("data.txt");

//        Files.write(filePath, "\nFile Line 5".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);

        List<String> lines = Files.readAllLines(filePath);
        for (String line: lines) {
            System.out.println(line);
        }
    }
}
