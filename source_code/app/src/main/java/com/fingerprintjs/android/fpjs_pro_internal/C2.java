package com.fingerprintjs.android.fpjs_pro_internal;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "vD14832N6715", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class C2 extends Lambda implements Function1<Throwable, Unit> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ AtomicBoolean alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2(AtomicBoolean atomicBoolean) {
        super(1);
        this.alpha = atomicBoolean;
    }

    public static /* synthetic */ Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i4;
        int i15 = ~i13;
        int i16 = (~((~i11) | i15)) | i14;
        int i17 = i4 | i15;
        int i18 = (~(i11 | i14 | i15)) | (~(i13 | i4));
        int i19 = ((-895483904) * i10) + ((-243269632) * i5) + ((-1205862400) * i12) + (1605645861 * i18) + (1083675574 * i17) + (i16 * 1605645861) + (2005429323 * i4) + ((1483459036 * i13) - 1284505600);
        int papa = AbstractC2327c.papa(i10, -609071723, (2049387148 * i5) + i13 + i4 + i12);
        if (AbstractC2327c.quebec(papa, 2020605952, (i10 * 126640917) + (i5 * (-616405876)) + (i12 * 335896449) + (i18 * 933) + (i17 * (-1866)) + (i16 * 933) + (i4 * 335898315) + ((i13 * 335895516) - 1139737737), -544210944, ((-1334837248) * papa) + i19) != 1) {
            C2 c22 = (C2) objArr[0];
            int i20 = red;
            int i21 = i20 & 95;
            purple = ao.ad.victor(i21, ~(-(-((i20 ^ 95) | i21))), 1, 128);
            c22.alpha.set(true);
            int i22 = purple + 86;
            int i23 = (i22 ^ (-1)) + (i22 << 1);
            red = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        C2 c23 = (C2) objArr[0];
        Object obj = objArr[1];
        int i24 = purple;
        int i25 = i24 & 75;
        red = ((((i24 ^ 75) | i25) << 1) - ((i24 | 75) & (~i25))) % 128;
        alpha(new Object[]{c23, (Throwable) obj}, 264020188, U0.alpha(), U0.alpha(), U0.alpha(), U0.alpha(), -264020188);
        Unit unit = Unit.INSTANCE;
        int i26 = purple + 20;
        red = ((i26 ^ (-1)) + (i26 << 1)) % 128;
        return unit;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Throwable th) {
        return alpha(new Object[]{this, th}, -1518163777, U0.alpha(), U0.alpha(), U0.alpha(), U0.alpha(), 1518163778);
    }
}
