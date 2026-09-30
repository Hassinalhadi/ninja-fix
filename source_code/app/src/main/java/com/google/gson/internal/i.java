package com.google.gson.internal;

/* loaded from: classes2.dex */
public final class i extends k {
    public final /* synthetic */ int white;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i(m mVar, int i4) {
        super(mVar);
        this.white = i4;
    }

    @Override // com.google.gson.internal.k, java.util.Iterator
    public Object next() {
        switch (this.white) {
            case 1:
                return alpha().white;
            default:
                return super.next();
        }
    }
}
