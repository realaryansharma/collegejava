package question3;

class SalariedWorker extends Worker {
    SalariedWorker(String var1, int var2) {
        super.name = var1;
        super.calculatePay(var2);
    }

    public static void main(String[] args) {
        SalariedWorker sw = new SalariedWorker("Aryan", 20);
    }
}
