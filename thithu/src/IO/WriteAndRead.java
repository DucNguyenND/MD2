package IO;

import Models.Product;

import java.io.*;
import java.util.List;

public class WriteAndRead {
    static File file=new File("C:\\Users\\DucNguyen\\Desktop\\thithu\\Data\\anhbinhcuuem.txt");
    public static void write(List<Product>products){
        FileWriter fileWriter= null;
        try {
            fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (int i = 0; i < products.size(); i++) {
            bufferedWriter.write(products.toString());
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();
        }} catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void read(List<Product> products){
            try{
                FileReader fileReader=new FileReader(file);
                BufferedReader bufferedReader=new BufferedReader(fileReader);
                String str=bufferedReader.readLine();
                while (str!=null){
                    String[] arr=str.split(",");
                    String id=arr[0];
                    String name=arr[1];
                    int price= Integer.parseInt(arr[2]);
                    int amount= Integer.parseInt(arr[3]);
                    String describe=arr[4];
                    products.add(new Product(id,name,price,amount,describe));
                    str=bufferedReader.readLine();
                }
                bufferedReader.close();
                fileReader.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
    }
}
