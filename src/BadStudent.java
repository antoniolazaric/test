public class BadStudent extends Student {
    @Override
    public int learn(){
        System.out.println("Bad student ne uci");
        return 0;
    }
    @Override
    public int sleep(){
        System.out.println("Bad student spava do 10");
        return 0;
    }
}
