package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.AbstractC1275w2;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t0\u00030\b2\u001c\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/LastKnownLocationsInfoSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownLocationInfo;", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownLocationsInfoError;", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/location/LastKnownLocationsInfoResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class P1 {

    @NotNull
    public static final P1 alpha = new Object();
    public static final String bravo = P28427.C1115q.echo.vD14832N6715();

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        component2.b bVar;
        int collectionSizeOrDefault;
        boolean z2 = n14263a23323 instanceof component8;
        String str = bravo;
        if (z2) {
            List<C1262t1> list = (List) ((component8) n14263a23323).component9;
            collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
            ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
            for (C1262t1 c1262t1 : list) {
                Pair pair = new Pair(P28427.N5.echo.vD14832N6715(), (List) C1262t1.alpha(new Object[]{c1262t1}, copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), -271803073, 271803073));
                String vD14832N6715 = P28427.C1095n0.echo.vD14832N6715();
                c1262t1.getClass();
                int i4 = (C1262t1.foxtrot + 103) % 128;
                C1262t1.echo = i4;
                int i5 = (i4 ^ 67) + ((i4 & 67) << 1);
                C1262t1.foxtrot = i5 % 128;
                if (i5 % 2 == 0) {
                    int i10 = 19 / 0;
                }
                Pair pair2 = new Pair(vD14832N6715, Boolean.valueOf(c1262t1.bravo));
                String vD14832N67152 = P28427.C1180z1.echo.vD14832N6715();
                int i11 = C1262t1.echo;
                int i12 = ((i11 & 33) + (i11 | 33)) % 128;
                C1262t1.foxtrot = i12;
                int i13 = (i12 & 103) + (i12 | 103);
                C1262t1.echo = i13 % 128;
                if (i13 % 2 == 0) {
                    arrayList.add(kotlin.collections.y.sierra(pair, pair2, new Pair(vD14832N67152, c1262t1.charlie), new Pair(P28427.V4.echo.vD14832N6715(), Long.valueOf(((Long) C1262t1.alpha(new Object[]{c1262t1}, copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), copy$D8871.component5(), -1670617357, 1670617358)).longValue()))));
                } else {
                    throw null;
                }
            }
            return new C1282y1(str, arrayList);
        }
        if (n14263a23323 instanceof setTopP6481) {
            AbstractC1275w2 abstractC1275w2 = (AbstractC1275w2) ((setTopP6481) n14263a23323).vD14832N6715;
            if (Intrinsics.areEqual(abstractC1275w2, AbstractC1275w2.b.alpha)) {
                bVar = component2.b.C0008b.foxtrot;
            } else if (Intrinsics.areEqual(abstractC1275w2, AbstractC1275w2.a.alpha)) {
                bVar = component2.b.c.foxtrot;
            } else if (Intrinsics.areEqual(abstractC1275w2, AbstractC1275w2.c.alpha)) {
                bVar = component2.b.d.foxtrot;
            } else if (Intrinsics.areEqual(abstractC1275w2, AbstractC1275w2.d.alpha)) {
                bVar = component2.b.a.foxtrot;
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return new C1278x1(str, null, bVar);
        }
        throw new NoWhenBranchMatchedException();
    }
}
