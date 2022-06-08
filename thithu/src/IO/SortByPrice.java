package IO;

import Models.Product;

import java.util.Comparator;
import java.util.Iterator;

public class SortByPrice implements Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        if (o1.getPrice()> o2.getPrice()){
            return 1;
        }else return -1;
    }
}
