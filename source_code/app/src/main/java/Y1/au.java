package Y1;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC2996g2;

/* loaded from: classes3.dex */
public final class au {
    public static final LinkedHashMap bravo = new LinkedHashMap();
    public final LinkedHashMap alpha = new LinkedHashMap();

    public final void alpha(at navigator) {
        Intrinsics.echo(navigator, "navigator");
        String name = AbstractC2996g2.bravo(navigator.getClass());
        Intrinsics.echo(name, "name");
        if (name.length() > 0) {
            LinkedHashMap linkedHashMap = this.alpha;
            at atVar = (at) linkedHashMap.get(name);
            if (Intrinsics.areEqual(atVar, navigator)) {
                return;
            }
            boolean z2 = false;
            if (atVar != null && atVar.bravo) {
                z2 = true;
            }
            if (!z2) {
                if (!navigator.bravo) {
                    return;
                }
                throw new IllegalStateException(("Navigator " + navigator + " is already attached to another NavController").toString());
            }
            throw new IllegalStateException(("Navigator " + navigator + " is replacing an already attached " + atVar).toString());
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public final at bravo(String name) {
        Intrinsics.echo(name, "name");
        if (name.length() > 0) {
            at atVar = (at) this.alpha.get(name);
            if (atVar != null) {
                return atVar;
            }
            throw new IllegalStateException(ao.ad.gray("Could not find Navigator with name \"", name, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
