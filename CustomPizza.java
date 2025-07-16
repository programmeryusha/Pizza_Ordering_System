import java.util.ArrayList;

public class CustomPizza implements IPizza
{
    private String _name;
    private ArrayList<String> _toppings = new ArrayList<String>();
    private String _crust;
    private String _sauce;
    private double _payonline;
    private double _paywalkin;
    private boolean _online=false;
    private boolean _walkin=false;
    
    public CustomPizza(String name){
        _name=name;
    }
 
    @Override
    public String toString() {
        String strPizza="";
        strPizza+="Pizza name: "+_name+"\n";
        strPizza+="Crust: "+_crust+"\n";
        strPizza+="Sauce: "+_sauce+"\n";
        strPizza+="Toppings:\n";
        for(String s:_toppings){
            strPizza+="\t"+s+"\n";
        }
        strPizza+="Online Order? = "+_online+"\n";
        strPizza+="Walkin Order? = "+_walkin+"\n";
        return strPizza;
    }
    public void addTopping(String topping){
        _toppings.add(topping);
    }
    public void selectCrust(String crust){
        _crust=crust;
    }
    public void selectSauce(String sauce){
        _sauce=sauce;
    }
    
    public void orderonline(boolean bOnline){
        _online=bOnline;
    }
    public void orderwalkin(boolean bWalkin){
        _walkin=bWalkin;
    }
        
    public void payonline(double cost){}
    public void paywalkin(double cost){}  
}









