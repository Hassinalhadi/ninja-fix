package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public final class K extends AbstractC1428w {
    public final Oe.y alpha;
    public AbstractC1428w purple = bravo();

    public K(L l10) {
        this.alpha = new Oe.y(l10);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.AbstractC1428w
    public final byte alpha() {
        AbstractC1428w abstractC1428w = this.purple;
        if (abstractC1428w != null) {
            byte alpha = abstractC1428w.alpha();
            if (!this.purple.hasNext()) {
                this.purple = bravo();
            }
            return alpha;
        }
        throw new NoSuchElementException();
    }

    public final C1427v bravo() {
        Oe.y yVar = this.alpha;
        if (yVar.hasNext()) {
            return new C1427v(yVar.bravo());
        }
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.purple != null;
    }
}
