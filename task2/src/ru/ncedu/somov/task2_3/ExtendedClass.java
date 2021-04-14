package ru.ncedu.somov.task2_3;

import java.util.Objects;

public class ExtendedClass {
    private byte b;
    private int i;
    private double d;
    private String s;

    public ExtendedClass(byte b, int i, double d, String s) {
        this.b = b;
        this.i = i;
        this.d = d;
        this.s = s;
    }


    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }

        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }

        ExtendedClass guest = (ExtendedClass) obj;

        return Objects.equals(b, guest.b) && Objects.equals(i, guest.i) && Objects.equals(d, guest.d) && Objects.equals(s, guest.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(s,d,i,b);
    }

    @Override
    public String toString(){
        return "ExtendedClass [b=" + b
                + ", i=" + i
                + ", d=" + d
                + ", s=" + s + "]";
    }


}
