package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.SystemClock;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.collections.CollectionsKt__IterablesKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001JC\u0010\u000b\u001a\u001a\u0012\u0016\u0012\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t0\u00030\b2\u001c\u0010\u0007\u001a\u0018\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/NetworkInterfacesSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/network_interface/NetworkInterfacesInfoProvider$NetworkInterfaceInfo;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/network_interface/NetworkInterfacesInfo;", "networkInterfacesInfo", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class J {

    @NotNull
    public static final J alpha = new Object();
    public static final String bravo = P28427.h6.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        int collectionSizeOrDefault;
        int elapsedRealtime;
        int i4 = charlie + 21;
        delta = i4 % 128;
        if (i4 % 2 != 0) {
            boolean z2 = n14263a23323 instanceof component8;
            String str = bravo;
            if (z2) {
                List<Z2> list = (List) ((component8) n14263a23323).component9;
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                for (Z2 z22 : list) {
                    int i5 = delta;
                    charlie = ((i5 ^ 119) + ((i5 & 119) << 1)) % 128;
                    String vD14832N6715 = P28427.C1096n1.echo.vD14832N6715();
                    z22.getClass();
                    Z2.delta = (Z2.charlie + 45) % 128;
                    int i10 = R0.bravo;
                    int i11 = i10 % 9534684;
                    R0.bravo = i10 + 1;
                    if (i11 != 0) {
                        elapsedRealtime = R0.charlie;
                    } else {
                        elapsedRealtime = (int) SystemClock.elapsedRealtime();
                        R0.charlie = elapsedRealtime;
                    }
                    int i12 = ~elapsedRealtime;
                    int i13 = ~((i12 & (-757443)) | ((-757443) ^ i12));
                    int i14 = ~(elapsedRealtime | (-100867));
                    int i15 = (((i14 & (-2094772191)) | ((-2094772191) ^ i14)) * 446) + ((((i13 & 656576) | (656576 ^ i13)) * 446) - 463516247);
                    int i16 = ((i15 | 292832896) << 1) - (i15 ^ 292832896);
                    int identityHashCode = System.identityHashCode(z22);
                    int i17 = ~(((-684594014) ^ identityHashCode) | ((-684594014) & identityHashCode));
                    int i18 = ((i17 & (-48842005)) | ((-48842005) ^ i17)) * 262;
                    int i19 = (169029049 & i18) + (i18 | 169029049);
                    int i20 = (i19 ^ 492559326) + ((492559326 & i19) << 1);
                    int i21 = ~identityHashCode;
                    int i22 = ~((i21 & (-684594014)) | ((-684594014) ^ i21));
                    int i23 = (i22 & (-720328542)) | (i22 ^ (-720328542));
                    int i24 = -(-(((i23 & 671486537) | (i23 ^ 671486537)) * 262));
                    if (i16 > (i20 ^ i24) + ((i24 & i20) << 1)) {
                        int i25 = 31 / 0;
                    }
                    Pair pair = new Pair(vD14832N6715, z22.alpha);
                    String vD14832N67152 = P28427.C1009a5.echo.vD14832N6715();
                    int i26 = Z2.delta;
                    int i27 = i26 + 11;
                    Z2.charlie = i27 % 128;
                    if (i27 % 2 == 0) {
                        Z2.charlie = ((i26 & 83) + (i26 | 83)) % 128;
                        arrayList.add(kotlin.collections.y.sierra(pair, new Pair(vD14832N67152, Boolean.valueOf(z22.bravo))));
                        int i28 = delta;
                        charlie = ((i28 & 77) + (i28 | 77)) % 128;
                    } else {
                        throw null;
                    }
                }
                C1282y1 c1282y1 = new C1282y1(str, arrayList);
                delta = (charlie + 43) % 128;
                return c1282y1;
            }
            if (n14263a23323 instanceof setTopP6481) {
                return new C1278x1(str, null, component2.b.a.foxtrot);
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z10 = n14263a23323 instanceof component8;
        throw null;
    }
}
