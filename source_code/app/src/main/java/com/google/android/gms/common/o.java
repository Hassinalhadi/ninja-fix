package com.google.android.gms.common;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class o extends n {
    public final byte[] juliet;

    public o(byte[] bArr) {
        super(Arrays.copyOfRange(bArr, 0, 25));
        this.juliet = bArr;
    }

    @Override // com.google.android.gms.common.n
    public final byte[] magenta() {
        return this.juliet;
    }
}
