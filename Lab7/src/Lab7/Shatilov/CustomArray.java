package Lab7.Shatilov;
import java.util.AbstractList;
import java.util.List;

public class CustomArray <Obj> extends AbstractList implements List {
    private Obj[] array;
    private int size;
    private int memory;

    CustomArray(){
        array = (Obj[]) new Object[0];
        size = 0;
        memory = 1;
    }

    @Override
    public Obj get(int index) {
        return array[index];
    }

    @Override
    public Obj[] toArray() {
        return array;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Obj remove(int index) {
        Obj object = (Obj) new Object();
        memory--;
        Obj[] anotherArray = (Obj[]) new Object[memory];
        for (int i = 0, k =0; i < size; i++)
            if (i != index){
                anotherArray[k] = array[i];
                k++;
            }
            else
                object = array[i];
        array = anotherArray;
        size--;
        return object;
    }

    public boolean add(Object e) {
        if (size < Integer.MAX_VALUE) {
            size++;
            if (size > memory)
                memory += (memory *= 2) + 1;
            Obj[] anotherArray = (Obj[]) new Object[memory];
            for (int i = 0; i < size-1; i++)
                anotherArray[i] = array[i];
            anotherArray[size-1] = (Obj) e;
            array = anotherArray;
            return true;
        }else
            return false;
    }

    @Override
    public Object set(int index, Object element) {
        Obj e = array[index];
        Obj[] anotherArray = (Obj[]) new Object[memory];
        for (int i = 0; i < size; i++)
            if (i == index)
                anotherArray[i] = (Obj) element;
            else
                anotherArray[i] = array[i];
        array = anotherArray;
        return e;
    }

    @Override
    public void clear() {
        super.clear();
        array = null;
        size = 0;
    }

    @Override
    public boolean isEmpty() {
        return ( size > 0 ? false : true);
    }

    @Override
    public String toString() {
        String str = new String("[");
        for (int i = 0; i < size; i++) {
            str += array[i];
            if (i != size-1)
                str += ", ";
        }
        str += "]";
        return str;
    }
}