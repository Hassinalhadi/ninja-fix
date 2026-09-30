package androidx.camera.core.impl;

import android.util.Range;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class ad {
    public static final C0505c hotel = new C0505c("camerax.core.captureConfig.rotation", Integer.TYPE, null);
    public static final C0505c india = new C0505c("camerax.core.captureConfig.jpegQuality", Integer.class, null);
    public static final C0505c juliet = new C0505c("camerax.core.captureConfig.resolvedFrameRate", Range.class, null);
    public final ArrayList alpha;
    public final B bravo;
    public final int charlie;
    public final List delta;
    public final boolean echo;
    public final V foxtrot;
    public final InterfaceC0519q golf;

    public ad(ArrayList arrayList, B b2, int i4, ArrayList arrayList2, boolean z2, V v4, InterfaceC0519q interfaceC0519q) {
        this.alpha = arrayList;
        this.bravo = b2;
        this.charlie = i4;
        this.delta = Collections.unmodifiableList(arrayList2);
        this.echo = z2;
        this.foxtrot = v4;
        this.golf = interfaceC0519q;
    }

    public final int alpha() {
        Object obj = 0;
        try {
            obj = this.bravo.quebec(Z.black);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) obj;
        Objects.requireNonNull(num);
        return num.intValue();
    }

    public final int bravo() {
        Object obj = 0;
        try {
            obj = this.bravo.quebec(Z.blue);
        } catch (IllegalArgumentException unused) {
        }
        Integer num = (Integer) obj;
        Objects.requireNonNull(num);
        return num.intValue();
    }
}
