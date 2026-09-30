package com.bumptech.glide.load.data;

import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.resource.bitmap.w;
import java.io.InputStream;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class h implements g {
    public static final M3.a red = new M3.a(1);
    public final /* synthetic */ int alpha;
    public final Object purple;

    public h() {
        this.alpha = 0;
        this.purple = new HashMap();
    }

    private final void bravo() {
    }

    private final void charlie() {
    }

    @Override // com.bumptech.glide.load.data.g
    public Object alpha() {
        switch (this.alpha) {
            case 1:
                return ((ParcelFileDescriptorRewinder$InternalRewinder) this.purple).rewind();
            case 2:
                return this.purple;
            default:
                w wVar = (w) this.purple;
                wVar.reset();
                return wVar;
        }
    }

    @Override // com.bumptech.glide.load.data.g
    public void cleanup() {
        switch (this.alpha) {
            case 1:
            case 2:
                return;
            default:
                ((w) this.purple).echo();
                return;
        }
    }

    public ParcelFileDescriptor delta() {
        return ((ParcelFileDescriptorRewinder$InternalRewinder) this.purple).rewind();
    }

    public h(InputStream inputStream, G3.g gVar) {
        this.alpha = 3;
        w wVar = new w(inputStream, gVar);
        this.purple = wVar;
        wVar.mark(5242880);
    }

    public h(ParcelFileDescriptor parcelFileDescriptor) {
        this.alpha = 1;
        this.purple = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }

    public h(Object obj) {
        this.alpha = 2;
        this.purple = obj;
    }
}
