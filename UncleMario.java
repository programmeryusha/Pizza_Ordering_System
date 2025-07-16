
public class UncleMario
{
    public static void main(String[] args) {
        CustomPizza cP1 = new CustomPizza("Dr. J's Custom Pizza.");
        cP1.addTopping("anchovies");
        cP1.addTopping("Canadian ham");
        cP1.addTopping("pepperoni");
        cP1.addTopping("onions");
        cP1.addTopping("green olives");
        cP1.selectCrust("thick");
        cP1.selectSauce("marinara");
        cP1.orderonline(true);
        
        System.out.println(cP1.toString());

        CustomCalzone cC1 = new CustomCalzone("Dr. J's Custom Calzone Pizza");
        cC1.addStuffing("anchovies");
        cC1.addStuffing("Canadian ham");
        cC1.addStuffing("pepperoni");
        cC1.addStuffing("onions");
        cC1.addStuffing("green olives");
        cC1.orderonline(true);
        System.out.println(cC1.toString());
    }
}
