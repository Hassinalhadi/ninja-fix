package com.bumptech.glide.load.resource.bitmap;

import android.graphics.ImageDecoder;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class g implements E3.k {
    public final /* synthetic */ int alpha;
    public final P3.i bravo;

    public g(int i4) {
        this.alpha = i4;
        switch (i4) {
            case 1:
                this.bravo = new P3.i();
                return;
            default:
                this.bravo = new P3.i();
                return;
        }
    }

    @Override // E3.k
    public final /* bridge */ /* synthetic */ boolean alpha(Object obj, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                return true;
            default:
                return true;
        }
    }

    @Override // E3.k
    public final com.bumptech.glide.load.engine.w bravo(Object obj, int i4, int i5, E3.i iVar) {
        ImageDecoder.Source createSource;
        ImageDecoder.Source createSource2;
        switch (this.alpha) {
            case 0:
                createSource = ImageDecoder.createSource((ByteBuffer) obj);
                return this.bravo.charlie(createSource, i4, i5, iVar);
            default:
                createSource2 = ImageDecoder.createSource(Y3.b.bravo((InputStream) obj));
                return this.bravo.charlie(createSource2, i4, i5, iVar);
        }
    }
}
