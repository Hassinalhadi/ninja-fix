package com.fingerprintjs.android.fpjs_pro_internal;

import com.zendesk.service.HttpConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "p0", "", "component5", "(I)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class n3 extends Lambda implements Function1<Integer, Unit> {
    public final /* synthetic */ C1252q2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n3(C1252q2 c1252q2) {
        super(1);
        this.alpha = c1252q2;
    }

    public static /* synthetic */ Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i13;
        int i15 = ~((~i10) | i14);
        int i16 = ~(i11 | i14);
        int i17 = i15 | i16;
        int i18 = i16 | i10;
        int i19 = ~(i14 | i10);
        int i20 = (1290797056 * i12) + ((-767557632) * i5) + ((-837287936) * i4) + (189531495 * i19) + ((-189531495) * i18) + (i17 * 189531495) + ((-647756440) * i10) + (((-1026819430) * i13) - 865599488);
        int papa = AbstractC2327c.papa(i12, 977123338, (1577873432 * i5) + i13 + i10 + i4);
        if (AbstractC2327c.quebec(papa, 70909952, (i12 * (-1884272278)) + (i5 * 1546282648) + (i4 * (-1177406223)) + (i19 * HttpConstants.HTTP_UNAVAILABLE) + (i18 * (-503)) + (i17 * HttpConstants.HTTP_UNAVAILABLE) + (i10 * (-1177405720)) + (i13 * (-1177406726)) + 1326046462, 451280896, ((-539361280) * papa) + i20) != 1) {
            n3 n3Var = (n3) objArr[0];
            ((Number) objArr[1]).intValue();
            n3Var.alpha.india = I0.echo();
            return null;
        }
        alpha(new Object[]{(n3) objArr[0], Integer.valueOf(((Number) objArr[1]).intValue())}, C1258s1.alpha(), C1258s1.alpha(), 1710537111, C1258s1.alpha(), C1258s1.alpha(), -1710537111);
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Integer num) {
        return alpha(new Object[]{this, num}, C1258s1.alpha(), C1258s1.alpha(), -1503428249, C1258s1.alpha(), C1258s1.alpha(), 1503428250);
    }
}
