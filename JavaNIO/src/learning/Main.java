package learning;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
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
        }
//        FileInputStream fileInputStream = new FileInputStream("data.txt");
//        FileChannel fileChannel = fileInputStream.getChannel();
        Path filePath = FileSystems.getDefault().getPath("data.txt");
        Files.write(filePath, "\nFile Line 5".getBytes(StandardCharsets.UTF_8), StandardOpenOption.APPEND);
        List<String> lines = Files.readAllLines(filePath);
        for (String line: lines) {
            System.out.println(line);
        }
    }
}
