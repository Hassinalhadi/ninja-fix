package com.fingerprintjs.android.fpjs_pro_internal;

import android.content.ContentResolver;
import android.graphics.Color;
import android.os.Process;
import android.util.TypedValue;
import java.lang.reflect.Method;
import kotlin.Result;
import kotlin.jvm.functions.Function0;

/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.o2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1244o2 {
    public static int bravo = 0;
    public static int charlie = 1;
    public final ContentResolver alpha;

    public C1244o2(ContentResolver contentResolver) {
        this.alpha = contentResolver;
    }

    public final String alpha() {
        try {
            Object[] objArr = {0L, r7, r7, new C1240n2(this), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(373658851);
            if (echo == null) {
                int rgb = 16777268 + Color.rgb(0, 0, 0);
                int i4 = (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)) + 904;
                Class cls = Boolean.TYPE;
                echo = am.charlie((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), rgb, i4, 532045125, "D8871", new Class[]{Long.TYPE, cls, cls, Function0.class, Integer.TYPE, Object.class});
            }
            Object invoke = ((Method) echo).invoke(null, objArr);
            Result.Companion companion = Result.INSTANCE;
            if (invoke instanceof kotlin.k) {
                bravo = (charlie + 17) % 128;
                invoke = "";
            } else {
                int i5 = bravo;
                charlie = ((i5 & 67) + (i5 | 67)) % 128;
            }
            String str = (String) invoke;
            int i10 = bravo;
            charlie = (((i10 | 53) << 1) - (i10 ^ 53)) % 128;
            return str;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
