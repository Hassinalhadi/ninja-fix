package s0;

/* renamed from: s0.h, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2548h implements Y.o {
    public static final C2548h alpha = new Object();
    public static Boolean bravo;

    @Override // Y.o
    public final boolean alpha() {
        Boolean bool = bravo;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw Q0.c.xray("canFocus is read before it is written");
    }

    @Override // Y.o
    public final /* synthetic */ void bravo(T0.q qVar) {
    }

    @Override // Y.o
    public final /* synthetic */ void charlie(T0.q qVar) {
    }

    @Override // Y.o
    public final void delta(boolean z2) {
        bravo = Boolean.valueOf(z2);
    }
}
