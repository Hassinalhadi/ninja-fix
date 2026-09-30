package com.checkout.components.address;

/* loaded from: classes3.dex */
public final class N implements I0.t {
    @Override // I0.t
    public final int originalToTransformed(int i4) {
        return i4 <= 5 ? i4 : i4 + 1;
    }

    @Override // I0.t
    public final int transformedToOriginal(int i4) {
        return i4 <= 5 ? i4 : i4 - 1;
    }
}
