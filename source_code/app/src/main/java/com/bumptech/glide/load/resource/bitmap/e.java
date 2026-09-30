package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.os.ParcelFileDescriptor;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
public final class e implements E3.k {
    public final /* synthetic */ int alpha;
    public final o bravo;

    public /* synthetic */ e(o oVar, int i4) {
        this.alpha = i4;
        this.bravo = oVar;
    }

    @Override // E3.k
    public final boolean alpha(Object obj, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                this.bravo.getClass();
                return true;
            default:
                ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) obj;
                String str = Build.MANUFACTURER;
                if (((!"HUAWEI".equalsIgnoreCase(str) && !"HONOR".equalsIgnoreCase(str)) || parcelFileDescriptor.getStatSize() <= 536870912) && !"robolectric".equals(Build.FINGERPRINT)) {
                    return true;
                }
                return false;
        }
    }

    @Override // E3.k
    public final com.bumptech.glide.load.engine.w bravo(Object obj, int i4, int i5, E3.i iVar) {
        switch (this.alpha) {
            case 0:
                o oVar = this.bravo;
                return oVar.alpha(new com.bumptech.glide.load.engine.h((ByteBuffer) obj, oVar.delta, oVar.charlie, 1), i4, i5, iVar, o.kilo);
            default:
                o oVar2 = this.bravo;
                return oVar2.alpha(new com.bumptech.glide.load.engine.h((ParcelFileDescriptor) obj, oVar2.delta, oVar2.charlie), i4, i5, iVar, o.kilo);
        }
    }
}
