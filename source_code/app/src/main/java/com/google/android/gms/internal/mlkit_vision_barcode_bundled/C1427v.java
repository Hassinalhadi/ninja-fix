package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.mlkit_vision_barcode_bundled.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1427v extends AbstractC1428w {
    public int alpha = 0;
    public final int purple;
    public final /* synthetic */ AbstractC1431z red;

    public C1427v(AbstractC1431z abstractC1431z) {
        this.red = abstractC1431z;
        this.purple = abstractC1431z.hotel();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1428w
    public final byte alpha() {
        int i4 = this.alpha;
        if (i4 < this.purple) {
            this.alpha = i4 + 1;
            return this.red.bravo(i4);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.alpha < this.purple;
    }
}
