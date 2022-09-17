package component;
import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;
import items.Items;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
@Component
@SessionScope
public class Basket {
    private final List<Items> items;

    public Basket(){
        this.items = new ArrayList<>();
    }
    public List<Items> add(List<Items> items) {
        this.items.addAll(items);
        return this.items;
    }
    /*  public List<Items> add(Items item){
          items.add(item);
          return items;
      } */
    public List<Items> get() {
        return Collections.unmodifiableList(items);
    }
}
