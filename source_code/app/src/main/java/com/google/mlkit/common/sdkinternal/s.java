package com.google.mlkit.common.sdkinternal;

import com.google.android.gms.common.Feature;

/* loaded from: classes2.dex */
public final /* synthetic */ class s implements com.google.android.gms.common.api.l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Feature[] purple;

    public /* synthetic */ s(Feature[] featureArr, int i4) {
        this.alpha = i4;
        this.purple = featureArr;
    }

    @Override // com.google.android.gms.common.api.l
    public final Feature[] getOptionalFeatures() {
        Feature[] featureArr = this.purple;
        switch (this.alpha) {
            case 0:
                Feature[] featureArr2 = l.alpha;
                return featureArr;
            default:
                Feature[] featureArr3 = l.alpha;
                return featureArr;
        }
    }
}
