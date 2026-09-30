package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.Log;

/* renamed from: androidx.appcompat.widget.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0488x {
    public static final PorterDuff.Mode bravo = PorterDuff.Mode.SRC_IN;
    public static C0488x charlie;
    public C0487w0 alpha;

    public static synchronized C0488x alpha() {
        C0488x c0488x;
        synchronized (C0488x.class) {
            try {
                if (charlie == null) {
                    delta();
                }
                c0488x = charlie;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0488x;
    }

    public static synchronized PorterDuffColorFilter charlie(int i4, PorterDuff.Mode mode) {
        PorterDuffColorFilter hotel;
        synchronized (C0488x.class) {
            hotel = C0487w0.hotel(i4, mode);
        }
        return hotel;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, androidx.appcompat.widget.x] */
    public static synchronized void delta() {
        synchronized (C0488x.class) {
            if (charlie == null) {
                ?? obj = new Object();
                charlie = obj;
                obj.alpha = C0487w0.delta();
                charlie.alpha.mike(new av.ao(7));
            }
        }
    }

    public static void echo(Drawable drawable, U0 u02, int[] iArr) {
        ColorStateList colorStateList;
        PorterDuff.Mode mode;
        PorterDuff.Mode mode2 = C0487w0.hotel;
        int[] state = drawable.getState();
        if (drawable.mutate() == drawable) {
            if ((drawable instanceof LayerDrawable) && drawable.isStateful()) {
                drawable.setState(new int[0]);
                drawable.setState(state);
            }
            boolean z2 = u02.delta;
            if (!z2 && !u02.charlie) {
                drawable.clearColorFilter();
            } else {
                PorterDuffColorFilter porterDuffColorFilter = null;
                if (z2) {
                    colorStateList = u02.alpha;
                } else {
                    colorStateList = null;
                }
                if (u02.charlie) {
                    mode = u02.bravo;
                } else {
                    mode = C0487w0.hotel;
                }
                if (colorStateList != null && mode != null) {
                    porterDuffColorFilter = C0487w0.hotel(colorStateList.getColorForState(iArr, 0), mode);
                }
                drawable.setColorFilter(porterDuffColorFilter);
            }
            if (Build.VERSION.SDK_INT <= 23) {
                drawable.invalidateSelf();
                return;
            }
            return;
        }
        Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
    }

    public final synchronized Drawable bravo(int i4, Context context) {
        return this.alpha.foxtrot(i4, context);
    }
}
