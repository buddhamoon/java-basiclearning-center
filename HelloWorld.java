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

        // java 计算时只有浮点数能够触发浮点数（小数计算）
        float a1num = 5F;
        float a2num = 3F;
        System.out.println( a1num / a2num );

        // 字符 + 操作会转换为数字类型，顺序为 int → long → float → double
        char st01 = '就';
        char st02 = 'p';
        System.out.println( st01 + 8 );
        System.out.println( st01 + st02 );

        // 这里要注意，当要使用某个变量保存两个字符的 + 操作时，变量类型需要能够涵盖两个字符的叠加结果
        int st03 = st01 + st02;
        System.out.println( st03 );

        // 字符串的拼接相对简单 ，字符串 + 操作单纯拼接（但要注意计算从左到右的先后顺序）。
        System.out.println( "字符" + 99 + 1 );  // 结果 ：字符991
        System.out.println( 99 + 1 + "字符" );  // 结果 ：100字符

        // 赋值符号 = 、 += ，赋值时要注意数据类型 。

    }
}