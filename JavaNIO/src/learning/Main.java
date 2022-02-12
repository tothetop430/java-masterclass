package learning;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.charset.StandardCharsets;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
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
