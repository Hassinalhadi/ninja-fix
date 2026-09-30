package com.fingerprintjs.android.fpjs_pro_internal;

import android.location.Location;
import com.fingerprintjs.android.fpjs_pro.tools.threading.SafeWithTimeoutProContext;
import com.fingerprintjs.android.fpjs_pro_internal.C1203e1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u000b¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;", "Landroid/location/Location;", "alpha", "(Lcom/fingerprintjs/android/fpjs_pro/tools/threading/SafeWithTimeoutProContext;)Landroid/location/Location;"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes3.dex */
public final class f3 extends Lambda implements Function1<SafeWithTimeoutProContext, Location> {
    public static int red;
    public static int silver;
    public final /* synthetic */ g3 alpha;
    public final /* synthetic */ long purple;

    static {
        foxtrot();
        delta();
        red = 0;
        silver = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(g3 g3Var, long j5) {
        super(1);
        this.alpha = g3Var;
        this.purple = j5;
    }

    public static void delta() {
    }

    public static void foxtrot() {
    }

    @Nullable
    public final Location alpha(@NotNull SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = red + 103;
        silver = i4 % 128;
        int i5 = i4 % 2;
        long j5 = this.purple;
        g3 g3Var = this.alpha;
        if (i5 == 0) {
            Location alpha = ((getAutofillType) g3.charlie(new Object[]{g3Var}, 213583762, C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), -213583761, C1203e1.Companion.bravo())).alpha(j5);
            safeWithTimeoutProContext.getClass();
            SafeWithTimeoutProContext.alpha();
            int i10 = 90 / 0;
            return alpha;
        }
        Location alpha2 = ((getAutofillType) g3.charlie(new Object[]{g3Var}, 213583762, C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), C1203e1.Companion.bravo(), -213583761, C1203e1.Companion.bravo())).alpha(j5);
        safeWithTimeoutProContext.getClass();
        SafeWithTimeoutProContext.alpha();
        return alpha2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final /* synthetic */ Location invoke(SafeWithTimeoutProContext safeWithTimeoutProContext) {
        int i4 = silver;
        red = (((i4 | 49) << 1) - (i4 ^ 49)) % 128;
        Location alpha = alpha(safeWithTimeoutProContext);
        int i5 = red + 29;
        silver = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 75 / 0;
        }
        return alpha;
    }
}
