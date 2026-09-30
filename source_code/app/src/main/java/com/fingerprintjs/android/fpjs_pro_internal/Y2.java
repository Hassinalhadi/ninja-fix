package com.fingerprintjs.android.fpjs_pro_internal;

import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"", "Lcom/fingerprintjs/android/fpjs_pro_internal/Z2;", "alpha", "()Ljava/util/List;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class Y2 extends Lambda implements Function0<List<? extends Z2>> {
    public static int alpha = 0;
    public static int purple = 1;

    @NotNull
    public final List<Z2> alpha() {
        N14263A23323 settopp6481;
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        Intrinsics.checkNotNull(networkInterfaces);
        ArrayList emerald = CollectionsKt.emerald(Collections.list(networkInterfaces));
        ArrayList arrayList = new ArrayList();
        Iterator it = emerald.iterator();
        alpha = (purple + 33) % 128;
        while (it.hasNext()) {
            NetworkInterface networkInterface = (NetworkInterface) it.next();
            try {
                String name = networkInterface.getName();
                Intrinsics.checkNotNull(name);
                settopp6481 = new component8(new Z2(name, networkInterface.isUp()));
                int i4 = purple;
                alpha = ((i4 ^ 95) + ((i4 & 95) << 1)) % 128;
            } catch (Throwable th) {
                settopp6481 = new setTopP6481(th);
            }
            Z2 z2 = (Z2) component13.vD14832N6715(settopp6481, null);
            if (z2 != null) {
                int i5 = purple;
                int i10 = (i5 ^ 81) + ((i5 & 81) << 1);
                alpha = i10 % 128;
                if (i10 % 2 == 0) {
                    arrayList.add(z2);
                } else {
                    arrayList.add(z2);
                    throw null;
                }
            }
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ List<? extends Z2> invoke() {
        purple = (alpha + 33) % 128;
        List<Z2> alpha2 = alpha();
        int i4 = alpha + 77;
        purple = i4 % 128;
        if (i4 % 2 != 0) {
            return alpha2;
        }
        throw null;
    }
}
