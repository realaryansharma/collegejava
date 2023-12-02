class CopyCon {

    int id;
    String name;

    CopyCon(int i, String n) {

        id = i;
        name = n;

    }

    CopyCon(CopyCon tmp) {

        id = tmp.id;
        name = tmp.name;

    }

    void display() {

        System.out.println("Name : " + name + "\nID : " + id);

    }

    public static void main(String[] args) {

        CopyCon s1 = new CopyCon(101, "Aryan");
        CopyCon s2 = new CopyCon(s1);
        CopyCon s3 = new CopyCon(234, "anything");
        
        s1.display();
        s2.display();
        
        s3.name = s2.name;
        s3.id = s2.id;

        s3.display();

    }

}