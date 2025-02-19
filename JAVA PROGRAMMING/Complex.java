// Q6..Add two complex numbers.
class Complex {
    int real, imag;
    Complex(int r, int i) { real = r; imag = i; }
    void add(Complex c) {
        real += c.real; imag += c.imag;
    }
    void display() { System.out.println(real + " + " + imag + "i"); }
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2), c2 = new Complex(1, 7);
        c1.add(c2);
        c1.display();
    }
}
