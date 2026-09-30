package com.google.android.gms.internal.measurement;

import java.util.List;

/* loaded from: classes2.dex */
public final class K1 extends AbstractC1328i {
    public final /* synthetic */ int red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ K1(String str, int i4) {
        super(str);
        this.red = i4;
    }

    @Override // com.google.android.gms.internal.measurement.AbstractC1328i
    public final InterfaceC1355o charlie(J2.i iVar, List list) {
        switch (this.red) {
            case 0:
                return InterfaceC1355o.gold;
            case 1:
            case 2:
                return this;
            case 3:
                return new C1323h(Double.valueOf(0.0d));
            default:
                return InterfaceC1355o.gold;
        }
    }
}
