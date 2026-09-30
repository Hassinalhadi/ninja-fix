package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.Context;
import android.os.Environment;
import android.os.StatFs;
import java.io.File;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/os/StatFs;", "alpha", "()Landroid/os/StatFs;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class au extends Lambda implements Function0<StatFs> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ Context alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public au(Context context) {
        super(0);
        this.alpha = context;
    }

    @Nullable
    public final StatFs alpha() {
        Object m206constructorimpl;
        Object m206constructorimpl2;
        int i4 = purple;
        red = ((i4 ^ 17) + ((i4 & 17) << 1)) % 128;
        if (!Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted")) {
            purple = (red + 69) % 128;
            if (!Intrinsics.areEqual(Environment.getExternalStorageState(), "mounted_ro")) {
                return null;
            }
        }
        Context context = this.alpha;
        try {
            Result.Companion companion = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(context.getExternalCacheDir());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m206constructorimpl = Result.m206constructorimpl(ResultKt.createFailure(th));
        }
        if (m206constructorimpl instanceof kotlin.k) {
            m206constructorimpl = null;
        }
        File file = (File) m206constructorimpl;
        if (file != null) {
            int i5 = red;
            int i10 = ((i5 | 13) << 1) - (i5 ^ 13);
            purple = i10 % 128;
            if (i10 % 2 == 0) {
                if (file.exists()) {
                    red = (purple + 35) % 128;
                    if (file.canRead()) {
                        try {
                            m206constructorimpl2 = Result.m206constructorimpl(new StatFs(file.getAbsolutePath()));
                            int i11 = red;
                            purple = ((i11 ^ 49) + ((i11 & 49) << 1)) % 128;
                        } catch (Throwable th2) {
                            Result.Companion companion3 = Result.INSTANCE;
                            m206constructorimpl2 = Result.m206constructorimpl(ResultKt.createFailure(th2));
                        }
                        if (m206constructorimpl2 instanceof kotlin.k) {
                            int i12 = purple;
                            int i13 = (i12 ^ 69) + ((i12 & 69) << 1);
                            red = i13 % 128;
                            if (i13 % 2 != 0) {
                                m206constructorimpl2 = null;
                            } else {
                                throw null;
                            }
                        }
                        StatFs statFs = (StatFs) m206constructorimpl2;
                        int i14 = purple + 105;
                        red = i14 % 128;
                        if (i14 % 2 != 0) {
                            return statFs;
                        }
                        throw null;
                    }
                }
            } else {
                file.exists();
                throw null;
            }
        }
        red = (purple + 89) % 128;
        return null;
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ StatFs invoke() {
        purple = (red + 59) % 128;
        StatFs alpha = alpha();
        int i4 = red;
        purple = ((i4 ^ 57) + ((i4 & 57) << 1)) % 128;
        return alpha;
    }
}
