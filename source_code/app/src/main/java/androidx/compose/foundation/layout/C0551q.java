package androidx.compose.foundation.layout;

import t0.AbstractC2911e0;

/* renamed from: androidx.compose.foundation.layout.q, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0551q implements InterfaceC0550p {
    public static final C0551q alpha = new Object();

    @Override // androidx.compose.foundation.layout.InterfaceC0550p
    public final T.s alpha(T.s sVar, T.k kVar) {
        return sVar.then(new BoxChildDataElement(kVar, false, AbstractC2911e0.alpha));
    }

    public final T.s bravo() {
        return new BoxChildDataElement(T.d.teal, true, AbstractC2911e0.alpha);
    }
}
