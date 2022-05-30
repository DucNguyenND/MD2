package Text;

import java.io.*;

public class CopyFileText {
    public static void readAndWriteFileText(){
        try {
            File file=new File("C:\\Users\\Duc Nguyen\\Desktop\\MyList\\src\\Text\\file.txt");
        if (!file.exists()){

                throw new FileNotFoundException();
        }
        BufferedReader br= new BufferedReader(new FileReader(file));
        String line="";
        while (true){
            line= br.readLine();
            writeFile(line);
            if (line==null){
                break;
            }


        }
        } catch (FileNotFoundException e) {
            System.err.println("File không tồn tại hoặc có lỗi");
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e){

        }
    }
    public static void writeFile(String str){
        try {
            FileWriter fileWriter=new FileWriter("C:\\Users\\Duc Nguyen\\Desktop\\MyList\\src\\Text\\fileCoppy.txt",true);
            BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.close();
            fileWriter.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        readAndWriteFileText();
    }
}
