package coupling.tight;

public class IndianFood implements Food{

    @Override
    public void getFood1() { //if getFood1 method name change in Food interface then it force IndianFood class to change its method name
        System.out.println("Indian Food");
    }
}
