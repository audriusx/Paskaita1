public class pirma {
    private int value;
    private int secondValue;
    public static void main(String[] args){
        pirma pirma = new pirma();
        pirma.value = 12;
        pirma.secondValue = 30;
        pirma  antras = new pirma();
        System.out.println(antras.sum());//isvedimas i konsole
        pirma.testPrivate();//statinis kviecia nestatini per objekto varda

    }

    public int sum() {
        test();
        testPrivate();//tiesiogiai galima
        return 0;
    }

    public int test() {
        //sum(); //negalima
        return 0;

    }

    private void testPrivate(){

    }
}
