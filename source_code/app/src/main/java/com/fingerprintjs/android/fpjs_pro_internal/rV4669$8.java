package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro.UnknownError;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import okhttp3.internal.http.HttpStatusCodesKt;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "vD14832N6715", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class rV4669$8 extends Lambda implements Function0<Unit> {

    /* renamed from: c, reason: collision with root package name */
    public static int f6618c = 0;

    /* renamed from: d, reason: collision with root package name */
    public static int f6619d = 0;
    public static int e = 0;

    /* renamed from: f, reason: collision with root package name */
    public static int f6620f = 1;
    public final /* synthetic */ D2 alpha;
    public final /* synthetic */ Long purple;
    public final /* synthetic */ Integer red;
    public final /* synthetic */ Map silver;
    public final /* synthetic */ String teal;
    public final /* synthetic */ Function1 white;
    public final /* synthetic */ Function1 yellow;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rV4669$8(D2 d22, Long l10, Integer num, Map map, String str, Function1 function1, Function1 function12) {
        super(0);
        this.alpha = d22;
        this.purple = l10;
        this.red = num;
        this.silver = map;
        this.teal = str;
        this.white = function1;
        this.yellow = function12;
    }

    public static int D8871() {
        int i4 = f6618c;
        int i5 = i4 % 8184510;
        f6618c = i4 + 1;
        if (i5 != 0) {
            return f6619d;
        }
        int freeMemory = (int) Runtime.getRuntime().freeMemory();
        f6619d = freeMemory;
        return freeMemory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Object m206constructorimpl;
        int i14 = ~i4;
        int i15 = i10 | i14 | (~i5);
        int i16 = ~i10;
        int i17 = (~(i5 | i14)) | (~(i14 | i16));
        int i18 = ((-742522880) * i12) + ((-1056047104) * i11) + ((-669908992) * i13) + ((-4778405) * i17) + (i16 * (-4778405)) + (4778405 * i15) + ((-674687396) * i10) + (((-665130586) * i4) - 357761024);
        int papa = AbstractC2327c.papa(i12, 1942122663, ((-92689393) * i11) + i4 + i10 + i13);
        int i19 = i15 * (-307);
        if (AbstractC2327c.quebec(papa, 173867008, ((-1279783457) * i12) + (439444615 * i11) + (1048061961 * i13) + (i17 * HttpStatusCodesKt.HTTP_TEMP_REDIRECT) + (i16 * HttpStatusCodesKt.HTTP_TEMP_REDIRECT) + i19 + (i10 * 1048062268) + (i4 * 1048061654) + 1366922925, -1898250240, ((-592117760) * papa) + i18) != 1) {
            rV4669$8 rv4669_8 = (rV4669$8) objArr[0];
            int i20 = e;
            int i21 = i20 & 97;
            f6620f = ao.ad.victor((i20 | 97) & (~i21), ~(i21 << 1), 1, 128);
            N14263A23323 n14263a23323 = (N14263A23323) D2.november(new Object[]{rv4669_8.alpha}, k3.component9(), k3.component9(), k3.component9(), k3.component9(), -1183857065, 1183857074);
            boolean z2 = n14263a23323 instanceof component8;
            Function1 function1 = rv4669_8.yellow;
            if (z2) {
                int i22 = f6620f;
                e = ao.ad.victor((i22 | 74) << 1, i22 ^ 74, 1, 128);
                p3 p3Var = (p3) ((L) ((component8) n14263a23323).component9);
                p3Var.getClass();
                N14263A23323 n14263a233232 = (N14263A23323) p3.alpha(new Object[]{p3Var, rv4669_8.purple, rv4669_8.red, rv4669_8.silver, rv4669_8.teal}, m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), m3.setPivotYN16904(), -1474673271, 1474673272);
                if (n14263a233232 instanceof component8) {
                    int i23 = e;
                    int i24 = i23 & 105;
                    int i25 = (i24 - (~(-(-((i23 ^ 105) | i24))))) - 1;
                    f6620f = i25 % 128;
                    int i26 = i25 % 2;
                    Function1 function12 = rv4669_8.white;
                    if (i26 != 0) {
                        function12.invoke((FingerprintJSProResponse) ((component8) n14263a233232).component9);
                    } else {
                        function12.invoke((FingerprintJSProResponse) ((component8) n14263a233232).component9);
                        throw null;
                    }
                } else if (n14263a233232 instanceof setTopP6481) {
                    int i27 = f6620f;
                    int i28 = i27 & 23;
                    int i29 = (i27 ^ 23) | i28;
                    int i30 = (i28 & i29) + (i29 | i28);
                    e = i30 % 128;
                    if (i30 % 2 != 0) {
                        function1.invoke((Error) ((setTopP6481) n14263a233232).vD14832N6715);
                        int i31 = 31 / 0;
                    } else {
                        function1.invoke((Error) ((setTopP6481) n14263a233232).vD14832N6715);
                    }
                    int i32 = e;
                    int i33 = (i32 ^ 106) + ((i32 & 106) << 1);
                    f6620f = ((i33 ^ (-1)) + (i33 << 1)) % 128;
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            }
            if (!(!(n14263a23323 instanceof setTopP6481))) {
                int i34 = e;
                int i35 = i34 & 47;
                f6620f = (i35 + ((i34 ^ 47) | i35)) % 128;
                Throwable th = (Throwable) ((setTopP6481) n14263a23323).vD14832N6715;
                StringBuilder sb2 = new StringBuilder("Internal unexpected error occurred. Please contact support.\n");
                sb2.append(th.toString());
                sb2.append('\n');
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(th.getStackTrace());
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th2));
                }
                Object[] objArr2 = (Object[]) component13.vD14832N6715(bk.component5(m206constructorimpl), null);
                if (objArr2 == null) {
                    objArr2 = new StackTraceElement[0];
                }
                sb2.append(CollectionsKt.maroon(ArraysKt.filterNotNull(objArr2), "\n", null, null, K0.alpha, 30));
                sb2.append('\n');
                function1.invoke(new UnknownError(null, sb2.toString(), 1, null));
                f6620f = (e + 41) % 128;
            }
            int i36 = e;
            int i37 = ((i36 ^ 85) | (i36 & 85)) << 1;
            int i38 = -(((~i36) & 85) | (i36 & (-86)));
            int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
            f6620f = i39 % 128;
            if (i39 % 2 == 0) {
                int i40 = 98 / 0;
            }
            return null;
        }
        rV4669$8 rv4669_82 = (rV4669$8) objArr[0];
        int i41 = f6620f;
        int i42 = i41 & 43;
        int i43 = (i41 | 43) & (~i42);
        int i44 = -(-(i42 << 1));
        e = (((i43 | i44) << 1) - (i43 ^ i44)) % 128;
        alpha(new Object[]{rv4669_82}, 415805562, C1224j2.alpha(), -415805562, C1224j2.alpha(), C1224j2.alpha(), C1224j2.alpha());
        Unit unit = Unit.INSTANCE;
        int i45 = f6620f;
        int i46 = i45 & 65;
        int i47 = (i46 - (~(-(-((i45 ^ 65) | i46))))) - 1;
        e = i47 % 128;
        if (i47 % 2 == 0) {
            return unit;
        }
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return alpha(new Object[]{this}, -361354383, C1224j2.alpha(), 361354384, C1224j2.alpha(), C1224j2.alpha(), C1224j2.alpha());
    }
}
