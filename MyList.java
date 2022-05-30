import java.util.Arrays;
    public class MyList<E>{
        private int size=0;
        private static int DEFAULT_CAPACITY=10;
        private Object elements[];

        public MyList() {
            elements=new Object [DEFAULT_CAPACITY];
        }

        private void ensureCapa() {
            int newSize = elements.length * 2;
            elements = Arrays.copyOf(elements, newSize);
        }
        public void add(E e) {
            if (size == elements.length) {
                ensureCapa();
            }
            elements[size++] = e;
        }
        public Object remote(int index){
            int newsize=elements.length-1;
            Object[] newElements= new Object[newsize];
            for (int i = 0; i <elements.length ; i++) {
                if (i < index) {
                    newElements[i] = elements[i];
                } else
                    newElements[i] = elements[i + 1];
            }
                elements=newElements;
                return elements;
            }
        public int size() {
            size=0;
            for (int i = 0; i < elements.length; i++) {
                if (elements[i].equals("null")==false){
                    size++;
                }
            }
            return size;
        }
        public Object[] clone(E arr[]){
            Object [] newArrr= new Object [arr.length];
            for (int i = 0; i < arr.length; i++) {
                newArrr[i]=arr[i];
            }
            return newArrr;
        }
        public int indexOf(E element){
            int number=-1;
            for (int i = 0; i < elements.length; i++) {
                if (element==elements[i]){
                    number=i;
                }

            } return number;
        }
public boolean contains(E element) {
    boolean check=false;
    for (int i = 0; i < elements.length; i++) {
        if (element == elements) {
            check = true;
            break;
        }
    }
    return check;
}
        public void ensureCapacity(int minCapacity){
            Object newelements[]= new Object[elements.length+minCapacity];
            for (int i = 0; i < elements.length; i++) {
                newelements[i]=elements[i];
            }
            elements=newelements;
        }
        public  Object  get (int index){
            return elements[index];
        }
        public void clear(){
            for (int i = 0; i < elements.length; i++) {
                elements[i]=null;
            }
        }
    }

