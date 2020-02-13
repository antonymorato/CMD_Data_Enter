import kpi.iasa.controller.Controller;
import kpi.iasa.model.Model;
import kpi.iasa.view.View;

public class Main {

    public static void main(String[] args) {

        Controller controller=new Controller(new Model(),new View());
        controller.processUser();
    }


}
