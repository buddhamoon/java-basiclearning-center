public class HelloWorld {
    
    public static void main( String[] args ) {
     
        // 程序开始运行
        System.out.println("Hello World");

        // 是否成功叠加

        int energyCheck = 0;
        for ( int i = 0; i < 10; i ++ ) {
            energyCheck = energyCheck + 10;
            System.out.println( "能量准备：" + energyCheck + " %");
        }
        
        long pasWord = 8392820020L;
        float paiDe = 3.14F;
        System.out.println( "机器人编号：NO." + pasWord );
        System.out.println( "轴心半径：" + paiDe + '米' );

        String popSay = "你的名字";
        int strLength = popSay.length();
        long [] arrpopSay = { 1, 3, 192030 }; 
        if ( popSay == "名" ) {
            System.out.println(popSay + " " + strLength);
        } else {
            System.out.println(strLength + " " + popSay);
            System.out.println(popSay.charAt(3));
            System.out.println(	arrpopSay + "数组某位：" +  arrpopSay[2]);
        }
    }
}