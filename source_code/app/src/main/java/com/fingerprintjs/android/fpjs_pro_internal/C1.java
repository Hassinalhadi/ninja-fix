package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class C1 implements LocationListener {
    public static int charlie = 0;
    public static int delta = 1;
    public /* synthetic */ E0 alpha;
    public /* synthetic */ getAutofillType bravo;

    public static /* synthetic */ void alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i12;
        int i15 = ~i11;
        int i16 = (~i10) | i15;
        int i17 = ~(i10 | i15);
        int i18 = (-1674575872) * i5;
        int i19 = ((-1355808768) * i4) + ((-1891631104) * i13) + i18 + ((-1483702105) * i17) + (1483702105 * i16) + (i14 * (-1483702105)) + (1136689320 * i12) + (((-190873766) * i11) - 1983905792);
        int papa = AbstractC2327c.papa(i4, 1142003473, ((-714989572) * i13) + i11 + i12 + i5);
        if (AbstractC2327c.quebec(papa, -451215360, (i4 * 1202573125) + (i13 * 1387703340) + (i5 * (-1158906635)) + (i17 * 979) + (i16 * (-979)) + (i14 * 979) + (i12 * (-1158905656)) + (i11 * (-1158907614)) + 1427560840, -310837248, ((-1882259456) * papa) + i19) != 1) {
            int i20 = charlie;
            int i21 = (i20 & 101) + (i20 | 101);
            delta = i21 % 128;
            if (i21 % 2 != 0) {
                return;
            } else {
                throw null;
            }
        }
        int i22 = delta;
        charlie = (((i22 | 109) << 1) - (i22 ^ 109)) % 128;
    }

    @Override // android.location.LocationListener
    public final void onLocationChanged(Location location) {
        int i4 = charlie;
        delta = ((i4 & 57) + (i4 | 57)) % 128;
        ((G0) this.alpha).alpha(location);
        LocationManager locationManager = (LocationManager) getAutofillType.delta(new Object[]{this.bravo}, ak.alpha(), -2017728549, ak.alpha(), 2017728552, ak.alpha(), ak.alpha());
        Intrinsics.checkNotNull(locationManager);
        locationManager.removeUpdates(this);
        int i5 = charlie;
        delta = ((i5 & 85) + (i5 | 85)) % 128;
    }

    @Override // android.location.LocationListener
    public final void onProviderDisabled(String str) {
        alpha(new Object[]{this, str}, com.fingerprintjs.android.fpjs_pro.c.bravo(), com.fingerprintjs.android.fpjs_pro.c.bravo(), com.fingerprintjs.android.fpjs_pro.c.bravo(), 166709094, -166709094, com.fingerprintjs.android.fpjs_pro.c.bravo());
    }

    @Override // android.location.LocationListener
    public final void onProviderEnabled(String str) {
        alpha(new Object[]{this, str}, com.fingerprintjs.android.fpjs_pro.c.bravo(), com.fingerprintjs.android.fpjs_pro.c.bravo(), com.fingerprintjs.android.fpjs_pro.c.bravo(), 893666714, -893666713, com.fingerprintjs.android.fpjs_pro.c.bravo());
    }

    @Override // android.location.LocationListener
    public final void onStatusChanged(String str, int i4, Bundle bundle) {
        int i5 = charlie + 1;
        delta = i5 % 128;
        if (i5 % 2 != 0) {
        } else {
            throw null;
        }
    }
}
