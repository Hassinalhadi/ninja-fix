package androidx.camera.core.impl;

import android.util.Size;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public interface ap extends H {
    public static final C0505c kilo = new C0505c("camerax.core.imageOutput.targetAspectRatio", D6.b.class, null);
    public static final C0505c lima;
    public static final C0505c mike;
    public static final C0505c november;
    public static final C0505c oscar;
    public static final C0505c papa;
    public static final C0505c quebec;
    public static final C0505c romeo;
    public static final C0505c sierra;
    public static final C0505c tango;

    static {
        Class cls = Integer.TYPE;
        lima = new C0505c("camerax.core.imageOutput.targetRotation", cls, null);
        mike = new C0505c("camerax.core.imageOutput.appTargetRotation", cls, null);
        november = new C0505c("camerax.core.imageOutput.mirrorMode", cls, null);
        oscar = new C0505c("camerax.core.imageOutput.targetResolution", Size.class, null);
        papa = new C0505c("camerax.core.imageOutput.defaultResolution", Size.class, null);
        quebec = new C0505c("camerax.core.imageOutput.maxResolution", Size.class, null);
        romeo = new C0505c("camerax.core.imageOutput.supportedResolutions", List.class, null);
        sierra = new C0505c("camerax.core.imageOutput.resolutionSelector", bm.b.class, null);
        tango = new C0505c("camerax.core.imageOutput.customOrderedResolutions", List.class, null);
    }

    Size bronze();

    int crimson();

    Size cyan();

    boolean indigo();

    int ivory();

    List lima();

    bm.b mike();

    Size olive();

    int papa();

    int peach();

    ArrayList yankee();

    bm.b zulu();
}
