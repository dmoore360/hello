package spa;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by derek on 5/21/16.
 */

@Component
public class Nyse {
    //private List<String> nyseCompanyList;

    public void getNyseStockInfo(){

        List<String> nyseCompanyList = new ArrayList<>();
        nyseCompanyList.forEach(name -> System.out.println(name));

    }
}
