package s6;

import i8.InterfaceC1904b;

/* loaded from: classes2.dex */
public final /* synthetic */ class R7 implements InterfaceC1904b {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ E5.q bravo;

    public /* synthetic */ R7(E5.q qVar, int i4) {
        this.alpha = i4;
        this.bravo = qVar;
    }

    @Override // i8.InterfaceC1904b
    public final Object get() {
        switch (this.alpha) {
            case 0:
                return this.bravo.alpha("FIREBASE_ML_SDK", new B5.c("json"), new U7(3));
            case 1:
                return this.bravo.alpha("FIREBASE_ML_SDK", new B5.c("proto"), new U7(2));
            case 2:
                return this.bravo.alpha("FIREBASE_ML_SDK", new B5.c("json"), t6.l4.teal);
            default:
                return this.bravo.alpha("FIREBASE_ML_SDK", new B5.c("proto"), t6.l4.silver);
        }
    }
}
