package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.component2;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001J+\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0005¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/PhoneTypeSignal;", "", "Lcom/cloned/github/michaelbull/result/Result;", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/telephony/PhoneType;", "", "Lcom/fingerprintjs/android/fpjs_pro/raw_signal_providers/telephony/PhoneTypeResult;", "result", "Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "from", "(Lcom/cloned/github/michaelbull/result/Result;)Lcom/fingerprintjs/android/fpjs_pro/api/fetch_visitor_id_request/signals/ProSignal;", "", "name", "Ljava/lang/String;", "fpjs-pro_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.p1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1247p1 {

    @NotNull
    public static final C1247p1 alpha = new Object();
    public static final String bravo = P28427.K0.echo.vD14832N6715();
    public static int charlie = 0;
    public static int delta = 1;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.fingerprintjs.android.fpjs_pro_internal.p1] */
    static {
        if (ao.ad.victor(1, -92, 1, 2) != 0) {
            int i4 = 72 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static gF31878 alpha(N14263A23323 n14263a23323) {
        int i4 = charlie;
        int i5 = (i4 ^ 13) + ((i4 & 13) << 1);
        delta = i5 % 128;
        if (i5 % 2 != 0) {
            boolean z2 = n14263a23323 instanceof component8;
            String str = bravo;
            if (z2) {
                AbstractC1210g0 abstractC1210g0 = (AbstractC1210g0) ((component8) n14263a23323).component9;
                int i10 = P2.bravo;
                int i11 = ((i10 | 27) << 1) - (i10 ^ 27);
                P2.alpha = i11 % 128;
                if (i11 % 2 == 0) {
                    C1282y1 c1282y1 = new C1282y1(str, Integer.valueOf(P2.alpha(abstractC1210g0)));
                    int i12 = delta;
                    int i13 = (i12 ^ 27) + ((i12 & 27) << 1);
                    charlie = i13 % 128;
                    if (i13 % 2 != 0) {
                        int i14 = 73 / 0;
                    }
                    return c1282y1;
                }
                P2.alpha(abstractC1210g0);
                throw null;
            }
            if (n14263a23323 instanceof setTopP6481) {
                C1278x1 c1278x1 = new C1278x1(str, null, component2.b.a.foxtrot);
                int i15 = delta;
                charlie = ((i15 ^ 15) + ((i15 & 15) << 1)) % 128;
                return c1278x1;
            }
            throw new NoWhenBranchMatchedException();
        }
        boolean z10 = n14263a23323 instanceof component8;
        throw null;
    }
}
