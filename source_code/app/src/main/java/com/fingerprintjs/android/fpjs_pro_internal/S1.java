package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import android.location.LocationManager;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class S1 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int red = 0;
    public static int silver = 1;
    public final /* synthetic */ U1 alpha;
    public final /* synthetic */ String purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public S1(U1 u12, String str) {
        super(1);
        this.alpha = u12;
        this.purple = str;
    }

    @Nullable
    public final Location alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        red = (silver + 71) % 128;
        LocationManager charlie = U1.charlie(this.alpha);
        Intrinsics.checkNotNull(charlie);
        Location lastKnownLocation = charlie.getLastKnownLocation(this.purple);
        int i4 = red;
        int i5 = ((i4 | 21) << 1) - (i4 ^ 21);
        silver = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 14 / 0;
        }
        return lastKnownLocation;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = silver;
        red = (((i4 | 111) << 1) - (i4 ^ 111)) % 128;
        Location alpha = alpha(safeWithTimeoutProContext);
        int i5 = silver;
        int i10 = (i5 ^ 51) + ((i5 & 51) << 1);
        red = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 76 / 0;
        }
        return alpha;
    }
}
