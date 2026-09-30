package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.W;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00020\u00062\u0010\u0010\u0005\u001a\f\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/LocationPermissionsSignal;", "", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LocationPermission;", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LocationPermissionsCheckResult;", "locationPermissionsCheckResult", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "from", "(Ljava/util/List;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.s2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1259s2 {

    @NotNull
    public static final C1259s2 alpha = new Object();
    public static final String bravo = P28427.L5.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [com.fingerprintjs.android.fpjs_pro_internal.s2, java.lang.Object] */
    static {
        if (((1 & 29) + (1 | 29)) % 2 == 0) {
        } else {
            throw null;
        }
    }

    public static C1282y1 alpha(List list) {
        int collectionSizeOrDefault;
        int i4;
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
        ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
        Iterator it = list.iterator();
        int i5 = delta;
        charlie = ((i5 ^ 7) + ((i5 & 7) << 1)) % 128;
        while (it.hasNext()) {
            W w4 = (W) it.next();
            if (!Intrinsics.areEqual(w4, W.a.alpha)) {
                if (Intrinsics.areEqual(w4, W.b.alpha)) {
                    int i10 = (charlie + 47) % 128;
                    delta = i10;
                    charlie = (i10 + 59) % 128;
                    i4 = 1;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } else {
                int i11 = delta;
                charlie = ((i11 ^ 75) + ((i11 & 75) << 1)) % 128;
                i4 = 0;
            }
            arrayList.add(Integer.valueOf(i4));
        }
        C1282y1 c1282y1 = new C1282y1(bravo, arrayList);
        int i12 = charlie;
        int i13 = ((i12 | 103) << 1) - (i12 ^ 103);
        delta = i13 % 128;
        if (i13 % 2 != 0) {
            return c1282y1;
        }
        throw null;
    }
}
