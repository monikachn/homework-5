package javahomework;

/*
go to ..\homework-5 build dir> java java homework.Programme10 25 5
 */
public class Programme10 {
    public static void main(String[] args) {

        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        System.out.println((args[0] + " x " + args[1]) + "=" + a*b);
    }
}
