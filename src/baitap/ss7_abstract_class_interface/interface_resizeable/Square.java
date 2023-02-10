package baitap.ss7_abstract_class_interface.interface_resizeable;

import baitap.ss7_abstract_class_interface.interface_resizeable.Resizeable;
import baitap.ss7_abstract_class_interface.interface_resizeable.Shape;

public class Square extends Shape implements Resizeable {
    private double edge ;
    private Rectangle abc;

    public double getEdge() {
        return edge;
    }

    public void setEdge(double edge) {
        this.edge = edge;
    }

    public Square(double edge) {
        this.edge = edge;
    }

    public double getArea(){
        return this.edge*this.edge;
    }

    @Override
    public String getName() {
        return "Square: ";
    }

    @Override
    public void resize(double percent) {
        setEdge(this.edge+this.edge*(percent/100));
    }
}
