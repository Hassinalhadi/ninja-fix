package l7;

import an.d;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;

/* renamed from: l7.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2059a {
    public static final int[] alpha = {R.attr.theme, delivery.samurai.android.R.attr.theme};
    public static final int[] bravo = {delivery.samurai.android.R.attr.materialThemeOverlay};

    public static Context alpha(Context context, AttributeSet attributeSet, int i4, int i5) {
        return bravo(context, attributeSet, i4, i5, new int[0]);
    }

    public static Context bravo(Context context, AttributeSet attributeSet, int i4, int i5, int[] iArr) {
        boolean z2;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, bravo, i4, i5);
        int[] iArr2 = {obtainStyledAttributes.getResourceId(0, 0)};
        obtainStyledAttributes.recycle();
        int i10 = iArr2[0];
        if ((context instanceof d) && ((d) context).alpha == i10) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (i10 != 0 && !z2) {
            d dVar = new d(context, i10);
            int length = iArr.length;
            int[] iArr3 = new int[length];
            if (iArr.length > 0) {
                TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, iArr, i4, i5);
                for (int i11 = 0; i11 < iArr.length; i11++) {
                    iArr3[i11] = obtainStyledAttributes2.getResourceId(i11, 0);
                }
                obtainStyledAttributes2.recycle();
            }
            for (int i12 = 0; i12 < length; i12++) {
                int i13 = iArr3[i12];
                if (i13 != 0) {
                    dVar.getTheme().applyStyle(i13, true);
                }
            }
            TypedArray obtainStyledAttributes3 = context.obtainStyledAttributes(attributeSet, alpha);
            int resourceId = obtainStyledAttributes3.getResourceId(0, 0);
            int resourceId2 = obtainStyledAttributes3.getResourceId(1, 0);
            obtainStyledAttributes3.recycle();
            if (resourceId == 0) {
                resourceId = resourceId2;
            }
            if (resourceId != 0) {
                dVar.getTheme().applyStyle(resourceId, true);
            }
            return dVar;
        }
        return context;
    }
}
