package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Rabbit4 {


    private Duck5 dug;
    @Autowired
    public Rabbit4(Duck5 dug) {
        this.dug = dug;
    }

    @Override
    public String toString() {
        return ", в зайце утка " + dug.toString();
    }
}
