package three;
//C#  int uint
public class UnaryDemo {
    public static void main(String[] args) {
        int number = +1;
        //poslati number varijabla
        System.out.println(number);
        number = -number;
        System.out.println(number);
        //inkrement ++
        number = 1;
        //POST INKREMENT
        number++;
        System.out.println(number);
        number = 1;
        ++number;
        System.out.println(number);
        //RAZLIKA IZMEĐU POST I PRE
        number = 1;
        System.out.println(number++);// 1
        System.out.println(number); // 2
        number = 1;
        System.out.println(++number);// 2
        System.out.println(number); //2
        number = 1;
        System.out.println(number--);//1
        System.out.println(number);//0
        boolean uspjeh = true;
        //logički komplement operator
        System.out.println(!uspjeh);
    }
}
