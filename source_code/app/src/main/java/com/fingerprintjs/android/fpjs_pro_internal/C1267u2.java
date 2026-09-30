package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Lcom/fingerprintjs/android/fpjs_pro_internal/t1;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Lcom/fingerprintjs/android/fpjs_pro_internal/t1;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.u2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C1267u2 extends Lambda implements Function1<SafeWithTimeoutProContext, C1262t1> {
    public static int red = 0;
    public static int silver = 1;
    public final /* synthetic */ pC2922 alpha;
    public final /* synthetic */ int purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1267u2(pC2922 pc2922, int i4) {
        super(1);
        this.alpha = pc2922;
        this.purple = i4;
    }

    @Nullable
    public final C1262t1 alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        red = (silver + 29) % 128;
        pC2922 pc2922 = this.alpha;
        FusedLocationProviderClient fusedLocationProviderClient = LocationServices.getFusedLocationProviderClient(((getAutofillType) pC2922.charlie(new Object[]{pc2922}, N.alpha(), N.alpha(), -511601479, N.alpha(), 511601479, N.alpha())).alpha);
        Intrinsics.checkNotNull(fusedLocationProviderClient);
        B1 b12 = new B1(fusedLocationProviderClient);
        G0 g02 = new G0();
        b12.invoke(g02);
        Location location = (Location) g02.bravo();
        int i4 = getAutofillType.foxtrot + 15;
        getAutofillType.golf = i4 % 128;
        if (i4 % 2 != 0) {
            safeWithTimeoutProContext.getClass();
            SafeWithTimeoutProContext.alpha();
            C1262t1 alpha = pC2922.alpha(pc2922, location, P28427.C1081l0.echo.vD14832N6715(), this.purple);
            int i5 = red;
            int i10 = (i5 & 93) + (i5 | 93);
            silver = i10 % 128;
            if (i10 % 2 != 0) {
                return alpha;
            }
            throw null;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ C1262t1 invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = silver;
        int i5 = (i4 ^ 39) + ((i4 & 39) << 1);
        red = i5 % 128;
        SafeWithTimeoutProContext safeWithTimeoutProContext2 = safeWithTimeoutProContext;
        if (i5 % 2 == 0) {
            return alpha(safeWithTimeoutProContext2);
        }
        alpha(safeWithTimeoutProContext2);
        throw null;
    }
}
