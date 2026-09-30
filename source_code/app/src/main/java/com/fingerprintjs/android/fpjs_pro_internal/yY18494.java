package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.ClientTimeout;
import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro.UnknownError;
import com.fingerprintjs.android.fpjs_pro_internal.bp;
import com.fingerprintjs.android.fpjs_pro_internal.getRightG17489;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class yY18494 implements iA15411 {
    public static int charlie = 0;
    public static int delta = 1;
    public static int echo;
    public static int foxtrot;
    public final M0 alpha;
    public final boolean bravo;

    public yY18494(M0 m02, boolean z2) {
        this.alpha = m02;
        this.bravo = z2;
    }

    public static int component9() {
        int i4 = echo;
        int i5 = i4 % 8053569;
        echo = i4 + 1;
        if (i5 != 0) {
            return foxtrot;
        }
        int tango = ao.ad.tango(69242132);
        foxtrot = tango;
        return tango;
    }

    @Override // com.fingerprintjs.android.fpjs_pro_internal.iA15411
    public final N14263A23323 D8871(E17257D21259 e17257d21259, Integer num, Function0 function0, Function0 function02) {
        N14263A23323 settopp6481;
        bp D8871 = bp.Companion.D8871(bp.INSTANCE, num);
        C1232l2 c1232l2 = new C1232l2(this.alpha.alpha(e17257d21259, num, num, function0, function02).component5(), this.bravo, null, 4, null);
        I0.delta = (I0.charlie + 93) % 128;
        if (c1232l2.component5() == null) {
            settopp6481 = new setTopP6481(new Error("Network error. Check your connection or the endpoint URL"));
            int i4 = I0.delta + 103;
            I0.charlie = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
        } else {
            Error charlie2 = c1232l2.charlie();
            FingerprintJSProResponse fingerprintJSProResponse = (FingerprintJSProResponse) C1232l2.bravo(new Object[]{c1232l2}, getRightG17489.e.component9(), getRightG17489.e.component9(), -932556039, 932556040, getRightG17489.e.component9(), getRightG17489.e.component9());
            if (charlie2 == null) {
                I0.delta = (I0.charlie + 107) % 128;
                if (fingerprintJSProResponse != null) {
                    N14263A23323 component8Var = new component8(fingerprintJSProResponse);
                    rV4669$8.D8871();
                    rV4669$8.D8871();
                    settopp6481 = component8Var;
                }
            }
            Error charlie3 = c1232l2.charlie();
            if (charlie3 == null) {
                charlie3 = new UnknownError(null, null, 3, null);
            }
            settopp6481 = new setTopP6481(charlie3);
            I0.delta = (I0.charlie + 75) % 128;
        }
        if (settopp6481 instanceof component8) {
            int i5 = charlie;
            delta = ((i5 & 121) + (i5 | 121)) % 128;
            return settopp6481;
        }
        if (settopp6481 instanceof setTopP6481) {
            int i10 = charlie;
            int i11 = ((i10 ^ 53) + ((i10 & 53) << 1)) % 128;
            delta = i11;
            Object obj = (Error) ((setTopP6481) settopp6481).vD14832N6715;
            if (obj instanceof com.fingerprintjs.android.fpjs_pro.q) {
                int i12 = ((i11 | 17) << 1) - (i11 ^ 17);
                charlie = i12 % 128;
                if (i12 % 2 == 0) {
                    Long pivotYN16904 = D8871.setPivotYN16904();
                    if (pivotYN16904 != null) {
                        if (pivotYN16904.longValue() < 0) {
                            int i13 = charlie + 67;
                            delta = i13 % 128;
                            if (i13 % 2 != 0) {
                                obj = new ClientTimeout();
                                return new setTopP6481(obj);
                            }
                        }
                    } else {
                        int i14 = charlie;
                        delta = (((i14 | 25) << 1) - (i14 ^ 25)) % 128;
                    }
                } else {
                    D8871.setPivotYN16904();
                    throw null;
                }
            }
            int i15 = delta;
            charlie = ((i15 ^ 57) + ((i15 & 57) << 1)) % 128;
            return new setTopP6481(obj);
        }
        throw new NoWhenBranchMatchedException();
    }
}
