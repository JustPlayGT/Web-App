package com.gt.test1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.lang.Nullable;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
@Component
public class Box {
    private ArrayList<Shape> list = new ArrayList<>();
    private int capacity;

    public Box() {
        capacity = 42;
    }

    public void setShape(List<Shape> shapeList) {
        System.out.println(shapeList.getClass().getName());
        for ( Shape shape : shapeList) {
            if( capacity - shape.getVolume() < 0 ){
                System.out.println("Box overflowed");
            }else {
                list.add(shape);
                capacity -= shape.getVolume();
            }
        }
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public void openBox(){
        for(Shape shape : list){
            System.out.println(shape.getClass().getName() + "; Volume = "+ shape.getVolume());
            test1(list.get(0));
        }
    }
    public void test1(Shape ... shapes){
        System.out.println(shapes.getClass().getName());
    }
}
