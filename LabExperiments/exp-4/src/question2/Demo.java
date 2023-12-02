class players
{
    String name;
    players(String name)
    {
        this.name=name;
    }
}
class football extends players
{   football(String name)
    {
        super(name);
    }
    int avg_age = 25;
}
class circket extends players
{
     circket(String name)
    {
        super(name);
    }
    int avg_age = 28;
}
class hockey extends players
{
     hockey(String name)
    {
        super(name);
    }
    int avg_age = 27;
}
class Demo
{
    public static void main(String[] args)
    {
        football a = new football("Aryan ");
        circket b = new circket("Gaurav ");
        hockey c = new hockey("Kanav ");
        System.out.print(a.name);
        System.out.print(a.avg_age);
    }
}
