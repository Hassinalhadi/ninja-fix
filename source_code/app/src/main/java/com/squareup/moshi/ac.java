package com.squareup.moshi;

/* loaded from: classes2.dex */
public final class ac extends com.google.gson.internal.k {
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ac(af afVar, int i4) {
        super(afVar);
        this.white = i4;
    }

    @Override // com.google.gson.internal.k, java.util.Iterator
    public Object next() {
        switch (this.white) {
            case 1:
                return bravo().white;
            default:
                return super.next();
        }
    }
}
