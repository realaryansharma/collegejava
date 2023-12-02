class First {

        int rNo;
        String name;
        float fee;

        First(int rNo, String name, float fee) {
            rNo = rNo;
            name = name;
            fee = fee;
        }

        void display() {
            System.out.println(rNo + " " + name + " " + fee);
        }

}

class Test {

    public static void main(String[] args) {

        First s1 = new First(111, "aryan", 54f);
        First s2 = new First(112, "shruti", 55f);

        s1.display();
        s2.display();

    }

}
