package THGhiFile2;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("C:\\Users\\DucNguyen\\Desktop\\New folder\\untitled\\src\\THGhiFile2\\numbers.txt");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("C:\\Users\\DucNguyen\\Desktop\\New folder\\untitled\\src\\THGhiFile2\\result.txt",maxValue);
    }
}
