package Task2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class ObjectBox {
    protected Collection<Object> container;


    public ObjectBox(Collection<Object> container){
        this.container = container;
    }

    public ObjectBox(Object[] arr){
        container = new ArrayList<>(Arrays.asList(arr));
    }

    public void addObject(Object obj) {
        container.add(obj);
    }

    public void removeObject(Object obj) {
        container.remove(obj);
    }

    public void dump() {
        System.out.println(container.toString());
    }
}
