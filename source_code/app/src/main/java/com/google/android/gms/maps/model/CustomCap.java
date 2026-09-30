package com.google.android.gms.maps.model;

import Q0.c;
import V5.x;
import com.clevertap.android.sdk.Constants;

/* loaded from: classes2.dex */
public final class CustomCap extends Cap {
    public final z6.b silver;
    public final float teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomCap(z6.b bVar, float f5) {
        super(3, bVar, Float.valueOf(f5));
        x.india(bVar, "bitmapDescriptor must not be null");
        if (f5 > 0.0f) {
            this.silver = bVar;
            this.teal = f5;
            return;
        }
        throw new IllegalArgumentException("refWidth must be positive");
    }

    @Override // com.google.android.gms.maps.model.Cap
    public final String toString() {
        StringBuilder victor = c.victor("[CustomCap: bitmapDescriptor=", String.valueOf(this.silver), " refWidth=");
        victor.append(this.teal);
        victor.append(Constants.AES_SUFFIX);
        return victor.toString();
    }
}
