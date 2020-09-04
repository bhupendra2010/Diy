package CommonPackage;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
    Driverfactory driverfactory=new Driverfactory();
    @Before
    public void open(){
        driverfactory.openbrowser();
    }
    //@After
    public void close(){
        driverfactory.closebrowser();
    }
}
