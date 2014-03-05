package totemic_commons.pokefenn.util;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import totemic_commons.pokefenn.ModItems;

public class CreativeTabTotemic extends CreativeTabs
{


    public CreativeTabTotemic(String lable)
    {
        super(lable);
    }

    public CreativeTabTotemic(int par1, String par2Str)
    {
        super(par1, par2Str);
    }

    @Override
    public Item getTabIconItem()
    {
        return ModItems.chlorophyllCrystal;
    }
}
