package demo;

import java.io.Serializable;

interface Printable extends Serializable {
    double PRICE_PER_SHEET = 0.04;

    void print();
}
