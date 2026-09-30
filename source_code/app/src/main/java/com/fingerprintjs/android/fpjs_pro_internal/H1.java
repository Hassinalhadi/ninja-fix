package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.os.CancellationSignal;
import g1.AbstractC1735d;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/E0;", "Landroid/location/Location;", "", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro_internal/E0;)V"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class H1 extends Lambda implements Function1<E0, Unit> {
    public static int red = 0;
    public static int silver = 1;
    public final /* synthetic */ getAutofillType alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H1(getAutofillType getautofilltype, String str) {
        super(1);
        this.alpha = getautofilltype;
        this.purple = str;
    }

    /* JADX WARN: Type inference failed for: r4v4, types: [com.fingerprintjs.android.fpjs_pro_internal.G1] */
    public final void alpha(@NotNull final E0 e02) {
        final CancellationSignal cancellationSignal = new CancellationSignal();
        getAutofillType getautofilltype = this.alpha;
        LocationManager locationManager = (LocationManager) getAutofillType.delta(new Object[]{getautofilltype}, ak.alpha(), -2017728549, ak.alpha(), 2017728552, ak.alpha(), ak.alpha());
        Intrinsics.checkNotNull(locationManager);
        int i4 = getAutofillType.golf;
        getAutofillType.foxtrot = ((i4 & 95) + (i4 | 95)) % 128;
        Context context = getautofilltype.alpha;
        getAutofillType.foxtrot = ((i4 & 51) + (i4 | 51)) % 128;
        Executor delta = AbstractC1735d.delta(context);
        Intrinsics.checkNotNull(delta);
        locationManager.getCurrentLocation(this.purple, cancellationSignal, delta, new Consumer() { // from class: com.fingerprintjs.android.fpjs_pro_internal.G1
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                E0 e03 = E0.this;
                CancellationSignal cancellationSignal2 = cancellationSignal;
                Location location = (Location) obj;
                int i5 = H1.silver + 61;
                int i10 = i5 % 128;
                H1.red = i10;
                if (i5 % 2 == 0) {
                    if (location != null) {
                        H1.silver = (((i10 | 9) << 1) - (i10 ^ 9)) % 128;
                        ((G0) e03).alpha(location);
                        cancellationSignal2.cancel();
                        H1.silver = (H1.red + 35) % 128;
                    }
                    int i11 = H1.silver;
                    int i12 = ((i11 | 27) << 1) - (i11 ^ 27);
                    H1.red = i12 % 128;
                    if (i12 % 2 == 0) {
                        return;
                    } else {
                        throw null;
                    }
                }
                throw null;
            }
        });
        int i5 = silver;
        red = ((i5 ^ 109) + ((i5 & 109) << 1)) % 128;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(E0 e02) {
        int i4 = silver;
        int i5 = (i4 & 81) + (i4 | 81);
        red = i5 % 128;
        int i10 = i5 % 2;
        alpha(e02);
        if (i10 == 0) {
            return Unit.INSTANCE;
        }
        throw null;
    }
}
