package pokefenn.totemic.init;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.registries.RegistryBuilder;
import pokefenn.totemic.Totemic;
import pokefenn.totemic.api.music.MusicInstrument;
import pokefenn.totemic.api.totem.RegisterTotemEffectsEvent;
import pokefenn.totemic.api.totem.TotemEffect;
import pokefenn.totemic.totem.TotemEffectNone;

@ObjectHolder(Totemic.MOD_ID)
public final class ModContent {
    public static final MusicInstrument flute = null;
    /*
     * public static MusicInstrument drum;
     * public static MusicInstrument windChime;
     * public static MusicInstrument jingleDress;
     * public static MusicInstrument rattle;
     * public static MusicInstrument eagleBoneWhistle;
     * public static MusicInstrument netherPipe;
     */

    public static final TotemEffect none = null;
    public static final TotemEffect bat = null;
    public static final TotemEffect blaze = null;
    public static final TotemEffect buffalo = null;
    public static final TotemEffect cow = null;
    public static final TotemEffect enderman = null;
    public static final TotemEffect horse = null;
    public static final TotemEffect ocelot = null;
    public static final TotemEffect pig = null;
    public static final TotemEffect rabbit = null;
    public static final TotemEffect spider = null;
    public static final TotemEffect squid = null;
    public static final TotemEffect wolf = null;

    @SubscribeEvent
    public static void instruments(RegistryEvent.Register<MusicInstrument> event) {
        event.getRegistry().registerAll(new MusicInstrument("totemic:flute", 3, 50).setItem(ModItems.flute).setRegistryName("flute"));
    }

    @SubscribeEvent
    public static void totemEffects(RegisterTotemEffectsEvent event) {
        event.registerAll(new TotemEffectNone().setRegistryName("none"), new TotemEffectNone().setRegistryName("bat"),
                new TotemEffectNone().setRegistryName("blaze"), new TotemEffectNone().setRegistryName("buffalo"), new TotemEffectNone().setRegistryName("cow"),
                new TotemEffectNone().setRegistryName("enderman"), new TotemEffectNone().setRegistryName("horse"),
                new TotemEffectNone().setRegistryName("ocelot"), new TotemEffectNone().setRegistryName("pig"), new TotemEffectNone().setRegistryName("rabbit"),
                new TotemEffectNone().setRegistryName("spider"), new TotemEffectNone().setRegistryName("squid"), new TotemEffectNone().setRegistryName("wolf"));
    }

    @SubscribeEvent
    public static void createRegistries(RegistryEvent.NewRegistry event) {
        // RegistryEvents are fired in alphabetic order.
        // Instruments have to be registered before Ceremonies.
        new RegistryBuilder<MusicInstrument>().setName(new ResourceLocation(Totemic.MOD_ID, "a_music_instruments")).setType(MusicInstrument.class)
                .setMaxID(Byte.MAX_VALUE).create();
        new RegistryBuilder<TotemEffect>().setName(new ResourceLocation(Totemic.MOD_ID, "b_totem_effects")).setType(TotemEffect.class).setMaxID(Byte.MAX_VALUE)
                .create();
        // new RegistryBuilder<Ceremony>().setName(new ResourceLocation(Totemic.MOD_ID,
        // "c_ceremonies")).setType(Ceremony.class).setMaxID(Byte.MAX_VALUE).disableSaving().create();
    }
}
