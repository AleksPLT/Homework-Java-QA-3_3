public class CreditPaymentService {
    public int calculate(int sum, int years){
        double percent = 9.99;
        int months =(years * 12); // кол-во месяцев в зависимости от количества выбраных лет
        double monthPercent = (percent/(100 * 12));
        double coefficient = (monthPercent * ((Math.pow((1 + monthPercent) , months)) / ((Math.pow((1 + monthPercent) , months)) - 1))); //коэффициент аннуитета
        double result = (sum * coefficient);

        return (int)result;
    }
}
