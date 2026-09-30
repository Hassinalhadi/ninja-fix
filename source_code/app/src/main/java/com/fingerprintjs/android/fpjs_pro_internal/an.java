package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Environment;
import android.os.StatFs;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "alpha", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class an extends Lambda implements Function0<StatFs> {
    public static final an alpha = new Lambda(0);
    public static int purple = 0;
    public static int red = 1;

    public an() {
        super(0);
    }

    @Nullable
    public final StatFs alpha() {
        Object m206constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(new StatFs(Environment.getRootDirectory().getAbsolutePath()));
            int i4 = purple;
            red = ((i4 ^ 89) + ((i4 & 89) << 1)) % 128;
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            int i5 = red;
            int i10 = (i5 ^ 37) + ((i5 & 37) << 1);
            purple = i10 % 128;
            m206constructorimpl = null;
            if (i10 % 2 != 0) {
                throw null;
            }
        } else {
            int i11 = purple;
            red = ((i11 & 69) + (i11 | 69)) % 128;
        }
        StatFs statFs = (StatFs) m206constructorimpl;
        int i12 = purple;
        int i13 = (i12 & 113) + (i12 | 113);
        red = i13 % 128;
        if (i13 % 2 == 0) {
            int i14 = 59 / 0;
        }
        return statFs;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ StatFs invoke() {
        red = (purple + 29) % 128;
        StatFs alpha2 = alpha();
        purple = (red + 75) % 128;
        return alpha2;
    }
}
