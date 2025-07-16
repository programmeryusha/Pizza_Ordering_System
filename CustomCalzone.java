import java.util.ArrayList;

public class CustomCalzone implements ICalzone {
    private String _name;
    private ArrayList<String> _stuffings = new ArrayList<String>();
    private String _crust;
    private String _sauce;
    private double _payonline;
    private double _paywalkin;
    private boolean _online=false;
    private boolean _walkin=false;


    public CustomCalzone(String name){
        _name=name;
    }
    @Override
    public String toString() {
        String strPizza="";
        strPizza+="Pizza name: "+_name+"\n";
        strPizza+="Stuffings:\n";
        for(String s:_stuffings){
            strPizza+="\t"+s+"\n";
        }
        strPizza+="Online Order? = "+_online+"\n";
        strPizza+="Walkin Order? = "+_walkin+"\n";
        return strPizza;
    }
    @Override
    public void addStuffing(String stuffing){
        _stuffings.add(stuffing);
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
