package question3;

class Worker {
    String name;
    double salary;

    Worker() {
    }

    void calculatePay(double var1) {
        this.salary = var1 * 100.0;
        System.out.println(this.name + " a daily worker has earned " + this.salary);
    }

    void calculatePay(int var1) {
        this.salary = (double)(var1 * 200);
        System.out.println(this.name + " a salaried worker has earned " + this.salary);
    }
}
