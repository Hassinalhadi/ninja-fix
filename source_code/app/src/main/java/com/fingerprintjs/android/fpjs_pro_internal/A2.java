package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro_internal.fO27287;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u000b¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;", "Lcom/fingerprintjs/android/fpjs_pro_internal/L;", "", "component9", "()Lcom/fingerprintjs/android/fpjs_pro_internal/N14263A23323;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class A2 extends Lambda implements Function0<N14263A23323<? extends L, ? extends Throwable>> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ D2 alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public A2(D2 d22) {
        super(0);
        this.alpha = d22;
    }

    public static /* synthetic */ N14263A23323 alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        Object m206constructorimpl;
        int i14 = ~i5;
        int i15 = ~i12;
        int i16 = (~(i15 | i11)) | i14;
        int i17 = ~i11;
        int i18 = ~(i15 | i17 | i5);
        int i19 = (~(i11 | i14)) | i15 | (~(i17 | i5));
        int i20 = ((-145752064) * i4) + ((-667418624) * i13) + ((-287834112) * i10) + ((-1076876666) * i19) + (1076876666 * i18) + (i16 * 1076876666) + ((-1364710777) * i12) + ((789042555 * i5) - 1205338112);
        int papa = AbstractC2327c.papa(i4, -1284996642, (325770565 * i13) + i5 + i12 + i10);
        if (AbstractC2327c.quebec(papa, -1931083776, (i4 * (-291900814)) + (i13 * (-1223611789)) + (i10 * (-1991010217)) + (i19 * 906) + (i18 * (-906)) + (i16 * (-906)) + (i12 * (-1991009311)) + (i5 * (-1991011123)) + 595473426, -1558839296, (1116340224 * papa) + i20) != 1) {
            A2 a22 = (A2) objArr[0];
            int i21 = purple;
            red = ao.ad.victor(i21 & 117, ~(i21 | 117), 1, 128);
            N14263A23323 alpha = alpha(new Object[]{a22}, Error.alpha(), 265508967, Error.alpha(), Error.alpha(), -265508966, Error.alpha());
            int i22 = red;
            purple = ((i22 & 47) + (i22 | 47)) % 128;
            return alpha;
        }
        A2 a23 = (A2) objArr[0];
        int i23 = purple + 69;
        red = i23 % 128;
        int i24 = i23 % 2;
        D2 d22 = a23.alpha;
        try {
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (i24 != 0) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(((fO27287.AnonymousClass2) D2.foxtrot(d22)).invoke());
            N14263A23323 component5 = bk.component5(m206constructorimpl);
            int i25 = red;
            int i26 = i25 ^ 7;
            int i27 = ((((i25 & 7) | i26) << 1) - (~(-i26))) - 1;
            purple = i27 % 128;
            if (i27 % 2 != 0) {
                int i28 = 30 / 0;
            }
            return component5;
        }
        Result.Companion companion3 = Result.INSTANCE;
        Result.m206constructorimpl(((fO27287.AnonymousClass2) D2.foxtrot(d22)).invoke());
        throw null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ N14263A23323<? extends L, ? extends Throwable> invoke() {
        return alpha(new Object[]{this}, Error.alpha(), 709093657, Error.alpha(), Error.alpha(), -709093657, Error.alpha());
    }
}
