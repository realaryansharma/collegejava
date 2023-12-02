class Worker {

    String name;
    double salary;

    void calculatePay(double hours) {

        salary = hours * 100;
        System.out.println(name + " a daily worker has earned " + salary);

    } 

    void calculatePay(int days) {

        salary = days * 200;
        System.out.println(name + " a salaried worker has earned " + salary);

    }

}

class DailyWorker extends Worker {

    DailyWorker(String name, double hours) {

        super.name = name;
        super.calculatePay(hours);

    }

}

class SalariedWorker extends Worker {

    SalariedWorker(String name, int days) {

        super.name = name;
        super.calculatePay(days);

    }

}

public class Question3 {

    public static void main(String[] args) {
    
        DailyWorker objd = new DailyWorker("Harry", 22.5);
        SalariedWorker objs = new SalariedWorker("Sejal", 20);

    }

}