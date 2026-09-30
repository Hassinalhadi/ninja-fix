package s6;

import a0.C0366t;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import g0.C1725e;
import g0.C1726f;
import g1.AbstractC1735d;
import id.C1915c;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import t6.AbstractC3032n3;

/* renamed from: s6.n0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2719n0 {
    public static C1726f alpha;

    public static ColorStateList alpha(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        ColorStateList charlie;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (charlie = AbstractC1735d.charlie(resourceId, context)) != null) {
            return charlie;
        }
        return typedArray.getColorStateList(i4);
    }

    public static ColorStateList bravo(Context context, C1915c c1915c, int i4) {
        int resourceId;
        ColorStateList charlie;
        TypedArray typedArray = (TypedArray) c1915c.red;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (charlie = AbstractC1735d.charlie(resourceId, context)) != null) {
            return charlie;
        }
        return c1915c.november(i4);
    }

    public static int charlie(Context context, TypedArray typedArray, int i4, int i5) {
        TypedValue typedValue = new TypedValue();
        if (typedArray.getValue(i4, typedValue) && typedValue.type == 2) {
            TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(new int[]{typedValue.data});
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(0, i5);
            obtainStyledAttributes.recycle();
            return dimensionPixelSize;
        }
        return typedArray.getDimensionPixelSize(i4, i5);
    }

    public static Drawable delta(Context context, TypedArray typedArray, int i4) {
        int resourceId;
        Drawable echo;
        if (typedArray.hasValue(i4) && (resourceId = typedArray.getResourceId(i4, 0)) != 0 && (echo = AbstractC3032n3.echo(resourceId, context)) != null) {
            return echo;
        }
        return typedArray.getDrawable(i4);
    }

    public static final C1726f echo() {
        C1726f c1726f = alpha;
        if (c1726f != null) {
            Intrinsics.checkNotNull(c1726f);
            return c1726f;
        }
        C1725e c1725e = new C1725e("Filled.Warning", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        List list = g0.ah.alpha;
        a0.au auVar = new a0.au(C0366t.bravo);
        T3.b bVar = new T3.b(2, false);
        bVar.juliet(1.0f, 21.0f);
        bVar.golf(22.0f);
        bVar.hotel(12.0f, 2.0f);
        bVar.hotel(1.0f, 21.0f);
        bVar.charlie();
        bVar.juliet(13.0f, 18.0f);
        bVar.golf(-2.0f);
        bVar.november(-2.0f);
        bVar.golf(2.0f);
        bVar.november(2.0f);
        bVar.charlie();
        bVar.juliet(13.0f, 14.0f);
        bVar.golf(-2.0f);
        bVar.november(-4.0f);
        bVar.golf(2.0f);
        bVar.november(4.0f);
        bVar.charlie();
        C1725e.delta(c1725e, bVar.alpha, 0, auVar);
        C1726f echo = c1725e.echo();
        alpha = echo;
        Intrinsics.checkNotNull(echo);
        return echo;
    }

    public static boolean foxtrot(Context context) {
        if (context.getResources().getConfiguration().fontScale >= 1.3f) {
            return true;
        }
        return false;
    }
}
