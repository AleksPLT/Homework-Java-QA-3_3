public class CreditPaymentService {
    public int calculate(int a, int b){
        double percent = 9.99;
        int months =(b * 12); // кол-во месяцев в зависимости от количества выбраных лет
        double monthPercent = (percent/(100 * 12));
        double coefficient = (monthPercent * ((Math.pow((1 + monthPercent) , months)) / ((Math.pow((1 + monthPercent) , months)) - 1))); //коэффициент аннуитета
        double result = (a * coefficient);

        return (int)result;
    }
}
