package com.fingerprintjs.android.fpjs_pro_internal;

import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import pe.AbstractC2327c;
import vf.C3207k;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/Error;", "p0", "", "vD14832N6715", "(Lcom/fingerprintjs/android/fpjs_pro/Error;)V"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
final class B2 extends Lambda implements Function1<Error, Unit> {
    public final /* synthetic */ AtomicBoolean alpha;
    public final /* synthetic */ C3207k purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public B2(AtomicBoolean atomicBoolean, C3207k c3207k) {
        super(1);
        this.alpha = atomicBoolean;
        this.purple = c3207k;
    }

    public static /* synthetic */ Object alpha(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        int i14 = ~i10;
        int i15 = ~(i14 | i5);
        int i16 = ~i5;
        int i17 = i15 | (~(i16 | i10 | i4));
        int i18 = ~(i14 | i16);
        int i19 = (~i4) | i16;
        int i20 = i18 | (~i19);
        int i21 = ~(i19 | i10);
        int i22 = (1629880320 * i12) + ((-1928462336) * i11) + (742522880 * i13) + ((-1493335646) * i21) + ((-1308296004) * i20) + (1493335646 * i17) + ((-750812765) * i5) + ((i10 * (-750812765)) - 1471086592);
        int papa = AbstractC2327c.papa(i12, 2040842291, ((-1261570137) * i11) + i10 + i5 + i13);
        if (AbstractC2327c.quebec(papa, 1741225984, (i12 * (-121732677)) + (i11 * (-1046847217)) + (i13 * 1408202841) + (i21 * 338) + (i20 * (-676)) + (i17 * (-338)) + (i5 * 1408203179) + ((i10 * 1408203179) - 1033136887), 838795264, (2096168960 * papa) + i22) != 1) {
            alpha(new Object[]{(B2) objArr[0], (Error) objArr[1]}, N0.D8871(), -1354050114, 1354050115, N0.D8871(), N0.D8871(), N0.D8871());
            return Unit.INSTANCE;
        }
        B2 b2 = (B2) objArr[0];
        Error error = (Error) objArr[1];
        if (b2.alpha.compareAndSet(false, true)) {
            Result.Companion companion = Result.INSTANCE;
            b2.purple.resumeWith(Result.m206constructorimpl(ResultKt.createFailure(new FingerprintException(error))));
            return null;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r9v1, types: [kotlin.Unit, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Unit invoke(Error error) {
        return alpha(new Object[]{this, error}, N0.D8871(), 1226055053, -1226055053, N0.D8871(), N0.D8871(), N0.D8871());
    }
}
