package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Process;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "component5", "()V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class m3 extends Lambda implements Function0<Unit> {
    public static int purple = 0;
    public static int red = 0;
    public static int silver = 0;
    public static int teal = 1;
    public final /* synthetic */ C1252q2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m3(C1252q2 c1252q2) {
        super(0);
        this.alpha = c1252q2;
    }

    public static /* synthetic */ Unit alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~(i10 | i4);
        int i15 = (~i11) | (~i4);
        int i16 = (~i15) | i10;
        int i17 = (~(i4 | i11)) | (~((~i10) | i11)) | (~(i15 | i10));
        int i18 = ((-1643118592) * i12) + (1710751744 * i13) + ((-1190395904) * i5) + (1233194106 * i17) + (1828579084 * i16) + ((-1233194106) * i14) + (42798203 * i10) + ((i11 * 42798203) - 224002048);
        int papa = AbstractC2327c.papa(i12, -829309908, ((-101282902) * i13) + i11 + i10 + i5);
        if (AbstractC2327c.quebec(papa, 1017511936, (i12 * (-1871011668)) + (i13 * (-1587019414)) + (i5 * 1745018721) + (i17 * 58) + (i16 * (-116)) + (i14 * (-58)) + (i10 * 1745018779) + (i11 * 1745018779) + 1790267665, -1139146752, ((-1134166016) * papa) + i18) != 1) {
            m3 m3Var = (m3) objArr[0];
            int i19 = silver;
            int i20 = ((i19 ^ 104) + ((i19 & 104) << 1)) - 1;
            teal = i20 % 128;
            if (i20 % 2 != 0) {
                m3Var.alpha.golf = I0.echo();
                int i21 = teal;
                int i22 = i21 ^ 41;
                silver = ((((i21 & 41) | i22) << 1) - i22) % 128;
                return null;
            }
            m3Var.alpha.golf = I0.echo();
            throw null;
        }
        m3 m3Var2 = (m3) objArr[0];
        int i23 = silver;
        teal = ((i23 ^ 83) + ((i23 & 83) << 1)) % 128;
        alpha(new Object[]{m3Var2}, copy$D8871.component5(), copy$D8871.component5(), -356537301, 356537301, copy$D8871.component5(), copy$D8871.component5());
        Unit unit = Unit.INSTANCE;
        int i24 = silver;
        int i25 = ((i24 | 122) << 1) - (i24 ^ 122);
        teal = ((i25 ^ (-1)) + (i25 << 1)) % 128;
        return unit;
    }

    public static int setPivotYN16904() {
        int i4 = purple;
        int i5 = i4 % 5056198;
        purple = i4 + 1;
        if (i5 != 0) {
            return red;
        }
        int myPid = Process.myPid();
        red = myPid;
        return myPid;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ Unit invoke() {
        return alpha(new Object[]{this}, copy$D8871.component5(), copy$D8871.component5(), -1829528680, 1829528681, copy$D8871.component5(), copy$D8871.component5());
    }
}
