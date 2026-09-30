package t6;

import android.content.Context;
import android.content.Intent;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class C2 {
    public static final boolean alpha(long j5, long j6) {
        if (j5 == j6) {
            return true;
        }
        return false;
    }

    public static Intent bravo(Context context) {
        Intent addFlags = new Intent(context, (Class<?>) SignInActivity.class).addFlags(32768).addFlags(268435456);
        Intrinsics.delta(addFlags, "addFlags(...)");
        return addFlags;
    }

    public static String charlie(long j5) {
        int i4 = (int) (j5 >> 32);
        int i5 = (int) (j5 & 4294967295L);
        if (Float.intBitsToFloat(i4) == Float.intBitsToFloat(i5)) {
            return "CornerRadius.circular(" + G2.alpha(Float.intBitsToFloat(i4)) + ')';
        }
        return "CornerRadius.elliptical(" + G2.alpha(Float.intBitsToFloat(i4)) + ", " + G2.alpha(Float.intBitsToFloat(i5)) + ')';
    }
}
