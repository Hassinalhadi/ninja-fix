package androidx.compose.foundation.text.input.internal;

import T.s;
import n.ax;
import w.C3227e;
import y.C3344D;

/* loaded from: classes3.dex */
public abstract class a {
    public static final s alpha(s sVar, C3227e c3227e, ax axVar, C3344D c3344d) {
        return sVar.then(new LegacyAdaptingPlatformTextInputModifier(c3227e, axVar, c3344d));
    }
}
