package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.fingerprintjs.android.fpjs_pro_internal.ax;
import g1.AbstractC1735d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;", "", "Lcom/fingerprintjs/android/fpjs_pro_internal/ax$component9$b;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.v0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1269v0 extends Lambda implements Function0<N14263A23323<? extends Boolean, ? extends ax.component9.b>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1277x0 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1269v0(C1277x0 c1277x0) {
        super(0);
        this.alpha = c1277x0;
    }

    @NotNull
    public final N14263A23323<Boolean, ax.component9.b> alpha() {
        boolean z2;
        char c3;
        boolean z10;
        boolean z11 = false;
        red = (purple + 117) % 128;
        C1277x0 c1277x0 = this.alpha;
        if (AbstractC1735d.alpha((Context) C1277x0.charlie(new Object[]{c1277x0}, -548505908, C1252q2.alpha(), C1252q2.alpha(), C1252q2.alpha(), 548505908, C1252q2.alpha()), "android.permission.ACCESS_NETWORK_STATE") != 0) {
            int i4 = purple + 109;
            red = i4 % 128;
            if (i4 % 2 == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            z2 = !z10;
        } else {
            z2 = false;
        }
        if (z2) {
            return new setTopP6481(ax.component9.b.charlie);
        }
        ConnectivityManager alpha = C1277x0.alpha(c1277x0);
        Intrinsics.checkNotNull(alpha);
        Network[] allNetworks = alpha.getAllNetworks();
        Intrinsics.checkNotNull(allNetworks);
        List filterNotNull = ArraysKt.filterNotNull(allNetworks);
        ArrayList arrayList = new ArrayList();
        Iterator it = filterNotNull.iterator();
        while (it.hasNext()) {
            int i5 = red;
            int i10 = (i5 ^ 113) + ((i5 & 113) << 1);
            purple = i10 % 128;
            if (i10 % 2 != 0) {
                c3 = 'P';
            } else {
                c3 = ',';
            }
            if (c3 == ',') {
                NetworkCapabilities networkCapabilities = C1277x0.alpha(c1277x0).getNetworkCapabilities((Network) it.next());
                if (networkCapabilities != null) {
                    purple = (red + 27) % 128;
                    arrayList.add(networkCapabilities);
                }
            } else {
                C1277x0.alpha(c1277x0).getNetworkCapabilities((Network) it.next());
                throw null;
            }
        }
        if (!arrayList.isEmpty()) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                purple = (red + 93) % 128;
                if (!(!((NetworkCapabilities) it2.next()).hasTransport(4))) {
                    int i11 = purple;
                    red = (((i11 | 117) << 1) - (i11 ^ 117)) % 128;
                    z11 = true;
                    break;
                }
            }
        }
        component8 component8Var = new component8(Boolean.valueOf(z11));
        int i12 = red;
        purple = (((i12 | 121) << 1) - (i12 ^ 121)) % 128;
        return component8Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ N14263A23323<? extends Boolean, ? extends ax.component9.b> invoke() {
        int i4 = red;
        int i5 = ((i4 | 37) << 1) - (i4 ^ 37);
        purple = i5 % 128;
        int i10 = i5 % 2;
        N14263A23323<Boolean, ax.component9.b> alpha = alpha();
        if (i10 != 0) {
            int i11 = 15 / 0;
        }
        return alpha;
    }
}
