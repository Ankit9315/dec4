package dec42;
class Sports{
    String getName(){
        return "Generic Sports";
    }
    void getNumberOfTeamMembers(){
        System.out.println( "Each team has n players in " + getName() );
    }
}
 

class Soccer extends Sports{
    @Override
    String getName(){
        return "Soccer Class";
    }
    void getNumberOfTeamMembers() {
    	System.out.println("Each team has 11 players in"+ getName());
    }
}
public class Driver{
	public static void main(String []args) {
		Sports a=new Sports();
		System.out.println(a.getName());
		a.getNumberOfTeamMembers();
		Sports b=new Sports();
		System.out.println(b.getName());
		b.getNumberOfTeamMembers();
		
	}
}
