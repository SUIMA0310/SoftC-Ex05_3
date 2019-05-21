public class Ex05_3 {

    public static void main(String[] args) {

        if(args.length == 0) {

            // 引数が無い場合, 処理を中断する
            System.out.println("引数がありません");
            return;

        }

        int[] source = new int[args.length];

        // argsのString型をint型に変換
        for(int i = 0; i < args.length; i++) {
            source[i] = Integer.parseInt(args[i]);
        }

        // 平均値を計算
        float avg = Stat.average(source);

        // 平均値を出力
        System.out.println(avg);

    }

}