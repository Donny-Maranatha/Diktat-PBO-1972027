/**
 * @author Donny (1972027)
 */

import java.util.ArrayList;
import java.util.List;

public class WareHouse {
    private List<Item>items;
    public WareHouse(){
        items = new ArrayList<>();
    }
    public void addItemToList(Item items){
        this.items.add(items);
    }
    public void showAllItemData(){
        if (items.isEmpty()){
            System.out.println("No Data");
        }else{
            items.forEach(Item ->{
                if (Item instanceof Shirt){
                    System.out.println(((Shirt)Item).toString());
                }
                else if (Item instanceof Shoe){
                    System.out.println(((Shoe)Item).toString());
                }
            });
        }
    }
}