package mamad.haxor.tutorecycleview.app;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by mamadhaxor on 22/01/15.
 */
public class ItemsModelList implements Serializable
{
    private int itemCount = 0;
    private List<ItemsModel> itemsModels;
    public ItemsModelList()
    {
        itemsModels = new ArrayList<ItemsModel>();
    }
    public void addItem(ItemsModel itemsModel)
    {
        itemsModels.add(itemsModel);
        itemCount++;
    }
    public int getItemCount()
    {
        return itemsModels.size();
    }
    public ItemsModel getItem(int index)
    {
        return itemsModels.get(index);
    }
}
