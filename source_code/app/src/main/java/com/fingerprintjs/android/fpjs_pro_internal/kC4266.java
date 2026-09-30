package com.fingerprintjs.android.fpjs_pro_internal;

import android.net.Uri;
import android.view.View;
import android.view.ViewConfiguration;
import com.fingerprintjs.android.fpjs_pro_internal.P28427;
import com.fingerprintjs.android.fpjs_pro_internal.T0;
import fe.C1715g;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pe.AbstractC2327c;

/* loaded from: classes3.dex */
public final class kC4266 implements cf {
    public static int delta;
    public final String alpha;
    public final T0.a bravo;
    public final kotlin.collections.t charlie;

    public kC4266(@NotNull rP23717 rp23717) {
        rp23717.getClass();
        int i4 = rP23717.foxtrot;
        rP23717.echo = ((i4 ^ 111) + ((i4 & 111) << 1)) % 128;
        C1715g c1715g = rp23717.delta;
        String str = rp23717.bravo;
        try {
            Object[] objArr = {0L, new J0(c1715g, str), 1, null};
            Object echo = am.echo(853678683);
            Uri parse = Uri.parse(String.format(rp23717.alpha, Arrays.copyOf(new Object[]{Integer.valueOf(((Number) component13.vD14832N6715((N14263A23323) ((Method) (echo == null ? am.charlie((char) (40619 - View.resolveSizeAndState(0, 0, 0)), View.MeasureSpec.getSize(0) + 52, (ViewConfiguration.getJumpTapTimeout() >> 16) + 222, 991024125, "component5", new Class[]{Long.TYPE, Function0.class, Integer.TYPE, Object.class}) : echo)).invoke(null, objArr), Integer.valueOf(c1715g.alpha))).intValue()), str}, 2)));
            Intrinsics.checkNotNull(parse);
            Uri.Builder buildUpon = parse.buildUpon();
            Intrinsics.checkNotNull(buildUpon);
            String vD14832N6715 = P28427.ak.echo.vD14832N6715();
            Y0 y02 = Y0.alpha;
            buildUpon.appendQueryParameter(vD14832N6715, Y0.alpha(rp23717.charlie));
            String obj = buildUpon.build().toString();
            int i5 = rP23717.echo;
            rP23717.foxtrot = ((i5 & 81) + (i5 | 81)) % 128;
            this.alpha = obj;
            this.bravo = T0.a.alpha;
            this.charlie = kotlin.collections.t.alpha;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    public static /* synthetic */ Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i5;
        int i15 = ~i11;
        int i16 = ~((~i4) | i15);
        int i17 = i4 | i15;
        int i18 = (1092222976 * i10) + (952107008 * i13) + ((-271974400) * i12) + ((-282608405) * i17) + (282608405 * i16) + (i14 * 282608405) + (10634006 * i5) + (((-554582804) * i11) - 1671495680);
        int papa = AbstractC2327c.papa(i10, -1809372279, ((-189913888) * i13) + i11 + i5 + i12);
        if (AbstractC2327c.quebec(papa, -2050686976, (i10 * (-1872984789)) + (i13 * 1843362976) + (i12 * 986544659) + (i17 * 881) + (i16 * (-881)) + (i14 * (-881)) + (i5 * 986543778) + (i11 * 986545540) + 223666697, 1179713536, ((-70844416) * papa) + i18) != 1) {
            kC4266 kc4266 = (kC4266) objArr[0];
            int i19 = delta;
            String str = kc4266.alpha;
            if ((i19 + 73) % 2 != 0) {
                return str;
            }
            throw null;
        }
        kC4266 kc42662 = (kC4266) objArr[0];
        int i20 = delta + 71;
        int i21 = i20 % 128;
        int i22 = i20 % 2;
        T0.a aVar = kc42662.bravo;
        if (i22 != 0) {
            int i23 = (i21 & 33) + (i21 | 33);
            delta = i23 % 128;
            if (i23 % 2 != 0) {
                int i24 = 72 / 0;
            }
            return aVar;
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final Map D8871() {
        if ((delta + 99) % 2 != 0) {
            return this.charlie;
        }
        throw null;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final Map alpha(ca caVar) {
        kotlin.collections.t tVar = kotlin.collections.t.alpha;
        if ((delta + 67) % 2 == 0) {
            int i4 = 39 / 0;
        }
        return tVar;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final String component5() {
        return (String) bravo(new Object[]{this}, bi.alpha(), -858905425, bi.alpha(), 858905425, bi.alpha(), bi.alpha());
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.cf
    public final /* synthetic */ T0 setPivotYN16904() {
        if ((delta + 23) % 2 != 0) {
            return (T0.a) bravo(new Object[]{this}, bi.alpha(), 24265793, bi.alpha(), -24265792, bi.alpha(), bi.alpha());
        }
        throw null;
    }
}
