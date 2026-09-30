package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1428w implements Iterator {
    public abstract byte alpha();

    @Override // java.util.Iterator
    public final /* synthetic */ Object next() {
        return Byte.valueOf(alpha());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
