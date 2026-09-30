package androidx.camera.core.impl;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public abstract /* synthetic */ class ao {
    public static final /* synthetic */ int alpha = 0;

    static {
        C0505c c0505c = ap.kilo;
    }

    public static int alpha(ap apVar) {
        return ((Integer) apVar.plum(ap.mike, -1)).intValue();
    }

    public static ArrayList bravo(ap apVar) {
        List list = (List) apVar.plum(ap.tango, null);
        if (list == null) {
            return null;
        }
        return new ArrayList(list);
    }

    public static int charlie(ap apVar) {
        return ((Integer) apVar.plum(ap.november, -1)).intValue();
    }

    public static int delta(ap apVar) {
        return ((Integer) apVar.plum(ap.lima, 0)).intValue();
    }

    public static void echo(ap apVar) {
        boolean z2;
        boolean indigo = apVar.indigo();
        if (apVar.cyan() != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (indigo && z2) {
            throw new IllegalArgumentException("Cannot use both setTargetResolution and setTargetAspectRatio on the same config.");
        }
        if (apVar.zulu() != null) {
            if (indigo || z2) {
                throw new IllegalArgumentException("Cannot use setTargetResolution or setTargetAspectRatio with setResolutionSelector on the same config.");
            }
        }
    }
}
