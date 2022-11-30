package com.gt.test1;

public class Cube implements Shape {
    private int a;
    private int id;
    private String name;
    private static int count = 1;

    public Cube(int a, String name) {
    this.a = a;
    this.name = name;
    this.id = count++;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getVolume() {
      return (int) Math.pow(a,3);
    }

    @Override
    public int getArea() {
        return (a*a)*6;
    }
}

abstract class Rounded implements Shape{
    int R;

    public Rounded(int r) {
        R = r;
    }

    public int getR() {
        return R;
    }

    public void setR(int r) {
        R = r;
    }
}

class Cylinder extends Rounded{
    int h;

    public Cylinder(int r,int h) {
        super(r);
        this.h = h;
    }

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public int getVolume() {
        return (int) ((2*Math.PI*R*R)*h);
    }

    @Override
    public int getArea() {
        return  (int) (2*Math.PI*R*(h+R));
    }
}

class Sphere extends Rounded{

    public Sphere(int r) {
        super(r);
    }

    @Override
    public int getVolume() {
        return (int) ((4*Math.PI*Math.pow(R,3))/3);
    }

    @Override
    public int getArea() {
        return (int) (4*Math.PI*R*R);
    }
}

