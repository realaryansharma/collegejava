package question3;

class DailyWorker extends Worker {
    DailyWorker(String var1, double var2) {
        super.name = var1;
        super.calculatePay(var2);
    }

    public static void main(String[] args) {
        DailyWorker dw = new DailyWorker("Aryan", 20.6);
    }
}
