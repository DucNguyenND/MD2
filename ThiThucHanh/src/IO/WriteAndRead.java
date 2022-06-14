package IO;

import Models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class WriteAndRead {
    File file=new File("C:\\Users\\DucNguyen\\Desktop\\ThiThucHanh\\Data\\Product.csv");

    public void Write(List<Product> products) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            bufferedWriter.write("ID,Name,Price,Ammount,Describe");
            bufferedWriter.newLine();
            for (Product s : products) {
                bufferedWriter.write(s.writeFile());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void reader() {
        try {
            Scanner myReader = new Scanner(file);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
public void reader(List<Product> products){
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
