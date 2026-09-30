package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Criteria;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/E0;", "Landroid/location/Location;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/E0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class D1 extends Lambda implements Function1<E0, Unit> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ getAutofillType alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(getAutofillType getautofilltype) {
        super(1);
        this.alpha = getautofilltype;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [com.fingerprintjs.android.fpjs_pro_internal.C1, java.lang.Object, android.location.LocationListener] */
    public final void alpha(@NotNull E0 e02) {
        Criteria criteria = new Criteria();
        criteria.setAccuracy(1);
        criteria.setPowerRequirement(3);
        criteria.setCostAllowed(true);
        criteria.setAltitudeRequired(true);
        criteria.setBearingRequired(false);
        criteria.setSpeedRequired(false);
        criteria.setHorizontalAccuracy(3);
        criteria.setVerticalAccuracy(3);
        ?? obj = new Object();
        obj.alpha = e02;
        getAutofillType getautofilltype = this.alpha;
        obj.bravo = getautofilltype;
        LocationManager locationManager = (LocationManager) getAutofillType.delta(new Object[]{getautofilltype}, ak.alpha(), -2017728549, ak.alpha(), 2017728552, ak.alpha(), ak.alpha());
        Intrinsics.checkNotNull(locationManager);
        locationManager.requestSingleUpdate(criteria, (LocationListener) obj, Looper.getMainLooper());
        int i4 = red;
        purple = (((i4 | 47) << 1) - (i4 ^ 47)) % 128;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(E0 e02) {
        int i4 = purple + 5;
        red = i4 % 128;
        int i5 = i4 % 2;
        alpha(e02);
        if (i5 != 0) {
            Unit unit = Unit.INSTANCE;
            int i10 = red;
            int i11 = (i10 & 33) + (i10 | 33);
            purple = i11 % 128;
            if (i11 % 2 == 0) {
                return unit;
            }
            throw null;
        }
        throw null;
    }
}
