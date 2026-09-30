package com.fingerprintjs.android.fpjs_pro_internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/u0;", "alpha", "()Lcom/fingerprintjs/android/fpjs_pro_internal/u0;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
final class ad extends Lambda implements Function0<C1265u0> {
    public static int purple = 0;
    public static int red = 1;
    public final /* synthetic */ ai alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad(ai aiVar) {
        super(0);
        this.alpha = aiVar;
    }

    @NotNull
    public final C1265u0 alpha() {
        int i4 = red;
        purple = (((i4 | 5) << 1) - (i4 ^ 5)) % 128;
        int i5 = ai.bronze;
        ai aiVar = this.alpha;
        ai.blue = ((i5 ^ 55) + ((i5 & 55) << 1)) % 128;
        androidx.core.widget.f fVar = (androidx.core.widget.f) aiVar.charlie;
        fVar.getClass();
        try {
            Object[] objArr = {0L, r9, r9, new C1238n0(fVar), 7, null};
            Boolean bool = Boolean.FALSE;
            Object echo = am.echo(-1815327613);
            if (echo == null) {
                char longPressTimeout = (char) (40619 - (ViewConfiguration.getLongPressTimeout() >> 16));
                int green = 52 - Color.green(0);
                int bitsPerPixel = 221 - ImageFormat.getBitsPerPixel(0);
                Class cls = Boolean.TYPE;
                echo = am.charlie(longPressTimeout, green, bitsPerPixel, -1707113179, "setPivotYN16904", new Class[]{Long.TYPE, cls, cls, Function1.class, Integer.TYPE, Object.class});
            }
            C1265u0 c1265u0 = (C1265u0) component13.vD14832N6715((N14263A23323) ((Method) echo).invoke(null, objArr), new C1265u0(null, null, null));
            int i10 = androidx.core.widget.f.red;
            int i11 = (i10 & 37) + (i10 | 37);
            androidx.core.widget.f.silver = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = purple;
                int i13 = (i12 & 71) + (i12 | 71);
                red = i13 % 128;
                if (i13 % 2 != 0) {
                    return c1265u0;
                }
                throw null;
            }
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final /* synthetic */ C1265u0 invoke() {
        int i4 = purple;
        int i5 = (i4 & 63) + (i4 | 63);
        red = i5 % 128;
        int i10 = i5 % 2;
        C1265u0 alpha = alpha();
        if (i10 == 0) {
            int i11 = 17 / 0;
        }
        return alpha;
    }
}
