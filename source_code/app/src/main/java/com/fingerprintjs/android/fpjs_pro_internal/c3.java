package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.W;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "", "Lcom/fingerprintjs/android/fpjs_pro_internal/W;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class c3 extends Lambda implements Function1<SafeWithTimeoutProContext, List<? extends W>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ d3 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3(d3 d3Var) {
        super(1);
        this.alpha = d3Var;
    }

    @NotNull
    public final List<W> alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = purple;
        int i5 = (i4 ^ 123) + ((i4 & 123) << 1);
        red = i5 % 128;
        int i10 = i5 % 2;
        d3 d3Var = this.alpha;
        if (i10 != 0) {
            Ld.c hotel = kotlin.collections.ab.hotel();
            if (d3.alpha(d3Var, "android.permission.ACCESS_FINE_LOCATION")) {
                System.identityHashCode(this);
                int i11 = A.alpha;
                int i12 = i11 % 8260338;
                A.alpha = i11 + 1;
                if (i12 == 0) {
                    SystemClock.uptimeMillis();
                }
                hotel.add(W.b.alpha);
            }
            if (!(!d3.alpha(d3Var, "android.permission.ACCESS_COARSE_LOCATION"))) {
                int i13 = purple + 97;
                red = i13 % 128;
                if (i13 % 2 != 0) {
                    hotel.add(W.a.alpha);
                } else {
                    hotel.add(W.a.alpha);
                    throw null;
                }
            }
            return kotlin.collections.ab.alpha(hotel);
        }
        kotlin.collections.ab.hotel();
        d3.alpha(d3Var, "android.permission.ACCESS_FINE_LOCATION");
        throw null;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ List<? extends W> invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        purple = (red + 91) % 128;
        List<W> alpha = alpha(safeWithTimeoutProContext);
        purple = (red + 103) % 128;
        return alpha;
    }
}
