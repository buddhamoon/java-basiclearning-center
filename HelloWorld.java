public class HelloWorld {
    public static void main( String[] args ) {
        System.out.println("Hello World");

        int varone = 190;
        for ( var i = 0; i < 10; i ++ ) {
            System.out.println(varone + i);
        }
      
        long pasWord = 20020L;
        System.out.println(pasWord);

        String popSay = "你的名字";
        int strLength = popSay.length();
        long [] arrpopSay = { 1, 3, 0 }; 
        if ( popSay == "名" ) {
            System.out.println(popSay + " " + strLength);
        } else {
            System.out.println(strLength + " " + popSay);
            System.out.println(popSay.charAt(3));
            System.out.println(	arrpopSay + "数组某位：" +  arrpopSay[2]);
        }
    }
}