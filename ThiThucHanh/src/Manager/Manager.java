package Manager;
import IO.SortByPriceMaxToMin;
import IO.SortByPriceMinToMax;
import IO.ValidateChoice;
import IO.WriteAndRead;
import Models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Manager {
    private Scanner scanner= new Scanner(System.in);
    List<Product> products=new ArrayList<>();
    WriteAndRead writeAndRead=new WriteAndRead();
    ValidateChoice validateChoice=new ValidateChoice();
    public void menu() {
        while (true){
            while (true){
            try {
        System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM----");
        System.out.println("Chọn chức năng theo số(để tiếp tục)");
        System.out.println("1. Xem danh sách");
        System.out.println("2. Thêm mới");
        System.out.println("3. Cập nhật");
        System.out.println("4. Xóa");
        System.out.println("5. Sắp xếp");
        System.out.println("6. Tìm kiếm sản phẩm có giá đăt nhất");
        System.out.println("7. Đọc từ file");
        System.out.println("8. Ghi vào file");
        System.out.println("9. Thoát");
                int choice=Integer.parseInt(scanner.nextLine());
                    if (validateChoice.validatechoicemenu(String.valueOf(choice))){
                        switch (choice){
                            case 1:
                                showProduct();
                                break;
                            case 2:
                                addProduct();
                                break;
                            case 3:
                                editProduct();
                                break;
                            case 4:
                                delete();
                                break;
                            case 5:
                                sortByPrice();
                                break;
                            case 6:
                                findMax();
                                break;
                            case 7:
                                writeAndRead.reader();
                                System.out.println("Đọc thành công");
                                break;
                            case 8:
                                writeAndRead.Write(products);
                                System.out.println("Ghi thành công");
                                break;
                            case 9:
                                System.exit(1);
                                break;

                        }
                        break;
                    }
                break;
            }catch (Exception e){
                System.out.println("Vui lòng nhập lại");
            }
            }
    }}

    public void showProduct(){
        if (products.size()==0){
            System.out.println("Không có sản phẩm nào");
        }else {
        for (Product product:products
        ) {
            System.out.println(product.toString());
        }
    }}
    public Product creatProduct() {
        System.out.println("Nhập mã sản phẩm ");
        String idProduct = scanner.nextLine();
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        int price;
        while (true) {
            try {
                System.out.println("Nhập giá sản phẩm");
                price = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại giá");
            }
        }
        int amount;
        while (true) {
            try {
                System.out.println("Nhập số lượng sản phẩm");
                amount = Integer.parseInt(scanner.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Vui lòng nhập lại số lượng sản phẩm");
            }
        }
        System.out.println("Nhập mô tả sản phẩm");
        String describe = scanner.nextLine();
        return new Product(idProduct, name, price, amount, describe);
    }
    public void addProduct(){
        products.add(creatProduct());
    }
    public void editProduct(){
        int indexEdit=-1;
        try {
            System.out.println("Vui lòng nhập mã sản phẩm");
            String idProduct=scanner.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals(idProduct)){
                    indexEdit=i;
                }
            }
            products.set(indexEdit,creatProduct());
            System.out.println("OK!");
        }catch (Exception e){
            System.out.println("Không có mã sản phẩm trùng khớp");
        }
    }
    public void delete(){
        int index =-1;
        try {
            System.out.println("Vui lòng nhập mã sản phẩm để xóa");
            String id=scanner.nextLine();
            for (int i = 0; i < products.size(); i++) {
                if (products.get(i).equals(id)){
                    index=i;
                }
            }
            products.remove(index);
            System.out.println("Đã xóa");}
        catch (Exception e){
            System.out.println("Không có mã sản phẩm này");
        }
    }
    //    public void findMax(){
//        int max=products.get(0).getPrice();
//        int index=-1;
//        for (int i = 1; i < products.size(); i++) {
//            if (max<products.get(i).getPrice()){
//                max= products.get(i).getPrice();
//            }
//        }
//        for (int i = 0; i < products.size(); i++) {
//            if (max==products.get(i).getPrice()){
//                System.out.println(products.get(i).toString());
//            }
//        }
//    }
    public void sortByPrice(){
        while (true){
            try {
                System.out.println("Vui lòng chọn:");
                System.out.println("1. Sắp xếp theo giá giảm dần");
                System.out.println("2. Sắp xếp theo giá tăng dần");
                System.out.println("3. Quay lại");
                int choiceSort=Integer.parseInt(scanner.nextLine());
                if (validateChoice.validatechoiceSort(String.valueOf(choiceSort))){
                    switch (choiceSort){
                        case 1:
                            products.sort(new SortByPriceMinToMax());
                            for (int i = 0; i < products.size(); i++) {
                                System.out.println(products.get(i).toString());
                            }
                            break;
                        case 2:
                            products.sort(new SortByPriceMaxToMin());
                            for (int i = 0; i < products.size(); i++) {
                                System.out.println(products.get(i).toString());
                            }
                            break;
                        case 3:
                            menu();
                            break;
                    }
                    break;
                }
            }catch (Exception e){
                System.out.println("Vui lòng chọn lại");
            }
        }
    }
    public void findMax(){
        products.sort(new SortByPriceMinToMax());
        System.out.println(products.get(products.size()-1).toString());
    }
}
