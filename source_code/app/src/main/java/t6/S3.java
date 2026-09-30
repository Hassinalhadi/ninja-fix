package t6;

import android.view.View;
import android.view.ViewGroup;

/* loaded from: classes2.dex */
public abstract class S3 {
    public static final b.ab alpha(float f5, long j5) {
        return new b.ab(f5, new a0.au(j5));
    }

    public static View bravo(int i4, View view) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View findViewById = viewGroup.getChildAt(i5).findViewById(i4);
                if (findViewById != null) {
                    return findViewById;
                }
            }
            return null;
        }
        return null;
    }
}
