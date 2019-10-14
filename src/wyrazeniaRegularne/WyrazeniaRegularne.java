package wyrazeniaRegularne;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WyrazeniaRegularne {

    public void wyrazeniaRegularne() {

        Pattern p = Pattern.compile("[^a-d]");
        Matcher m = p.matcher("ef");

        System.out.println(m.find()); //musi zawierac slowo Java
        System.out.println(m.matches()); //musi byc takie samo jak wzorzec
    }
}
