public class TestMroeClass {
    
    public static void main(String[] args) {
        
        DataLink one = new DataLink();
        one.mySay();
    }
}

class DataLink {

    int one = 1900;
    String two = "当前等级：";

    void mySay () {
        System.out.println( two + one );
    }

}