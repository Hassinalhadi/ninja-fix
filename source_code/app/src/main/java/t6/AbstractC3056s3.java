package t6;

import android.os.Build;
import android.text.TextUtils;
import android.view.View;
import q0.AbstractC2375K;

/* renamed from: t6.s3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3056s3 {
    public static void alpha(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            androidx.appcompat.widget.f1.alpha(view, charSequence);
            return;
        }
        androidx.appcompat.widget.h1 h1Var = androidx.appcompat.widget.h1.f2874d;
        if (h1Var != null && h1Var.alpha == view) {
            androidx.appcompat.widget.h1.bravo(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            androidx.appcompat.widget.h1 h1Var2 = androidx.appcompat.widget.h1.e;
            if (h1Var2 != null && h1Var2.alpha == view) {
                h1Var2.alpha();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new androidx.appcompat.widget.h1(view, charSequence);
    }

    public static final Z.c bravo(q0.z zVar) {
        long xray = zVar.xray(AbstractC2375K.foxtrot(zVar).charlie());
        long xray2 = zVar.xray((Float.floatToRawIntBits(r0.charlie) << 32) | (Float.floatToRawIntBits(r0.delta) & 4294967295L));
        return new Z.c(Float.intBitsToFloat((int) (xray >> 32)), Float.intBitsToFloat((int) (xray & 4294967295L)), Float.intBitsToFloat((int) (xray2 >> 32)), Float.intBitsToFloat((int) (xray2 & 4294967295L)));
    }
}
