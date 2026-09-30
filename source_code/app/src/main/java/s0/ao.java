package s0;

import s6.Y6;
import t0.C2946x;

/* loaded from: classes3.dex */
public abstract class ao {
    public static final Q0.e alpha = Y6.alpha();

    public static final W alpha(al alVar) {
        C2946x c2946x = alVar.f13287f;
        if (c2946x != null) {
            return c2946x;
        }
        throw Q0.c.xray("LayoutNode should be attached to an owner");
    }
}
