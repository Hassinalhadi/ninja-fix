package com.fingerprintjs.android.fpjs_pro_internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "component9", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class l3 extends Lambda implements Function0<Unit> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ C1252q2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3(C1252q2 c1252q2) {
        super(0);
        this.alpha = c1252q2;
    }

    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = (~(i11 | i13)) | i5;
        int i15 = ~i11;
        int i16 = ~((~i5) | i15 | i13);
        int i17 = (i16 * 484569389) + ((-484569389) * i14) + (806482222 * i5) + ((-162656556) * i11) + 1587019776;
        int i18 = (~(i13 | i5)) | (~(i15 | (~i13)));
        int i19 = (904921088 * i10) + ((-395313152) * i4) + (321912832 * i12) + (484569389 * i18) + i17;
        int papa = AbstractC2327c.papa(i10, 2077170981, (1616745821 * i4) + i11 + i5 + i12);
        if (AbstractC2327c.quebec(papa, -138936320, (i10 * 609114465) + (i4 * 397062201) + (i12 * (-1558553459)) + (i18 * 457) + (i16 * 457) + (i14 * (-457)) + (i5 * (-1558553002)) + (i11 * (-1558553916)) + 318941677, 1630011392, (345505792 * papa) + i19) != 1) {
            l3 l3Var = (l3) objArr[0];
            int i20 = purple;
            int i21 = ((i20 | 115) << 1) - (i20 ^ 115);
            red = i21 % 128;
            if (i21 % 2 == 0) {
                alpha(new Object[]{l3Var}, C1264u.bravo(), 1156651960, C1264u.bravo(), -1156651959, C1264u.bravo(), C1264u.bravo());
                int i22 = 71 / 0;
                return Unit.INSTANCE;
            }
            alpha(new Object[]{l3Var}, C1264u.bravo(), 1156651960, C1264u.bravo(), -1156651959, C1264u.bravo(), C1264u.bravo());
            return Unit.INSTANCE;
        }
        l3 l3Var2 = (l3) objArr[0];
        int i23 = red;
        int i24 = i23 & 39;
        int i25 = ((i23 ^ 39) | i24) << 1;
        int i26 = -((i23 | 39) & (~i24));
        purple = ((i25 ^ i26) + ((i26 & i25) << 1)) % 128;
        l3Var2.alpha.foxtrot = I0.echo();
        int i27 = red;
        int i28 = i27 & 53;
        int i29 = ((i27 ^ 53) | i28) << 1;
        int i30 = -((i27 | 53) & (~i28));
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        purple = i31 % 128;
        if (i31 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return alpha(new Object[]{this}, C1264u.bravo(), -194867754, C1264u.bravo(), 194867754, C1264u.bravo(), C1264u.bravo());
    }
}
