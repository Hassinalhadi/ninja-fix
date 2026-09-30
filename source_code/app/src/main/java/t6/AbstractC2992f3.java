package t6;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import java.lang.reflect.Field;

/* renamed from: t6.f3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2992f3 {
    public static boolean alpha = true;
    public static Field bravo;
    public static boolean charlie;

    public static void delta(Parcel parcel, Parcelable parcelable) {
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public float alpha(View view) {
        if (alpha) {
            try {
                return x2.an.alpha(view);
            } catch (NoSuchMethodError unused) {
                alpha = false;
            }
        }
        return view.getAlpha();
    }

    public void bravo(View view, float f5) {
        if (alpha) {
            try {
                x2.an.bravo(view, f5);
                return;
            } catch (NoSuchMethodError unused) {
                alpha = false;
            }
        }
        view.setAlpha(f5);
    }

    public void charlie(View view, int i4) {
        if (!charlie) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                bravo = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
                Log.i("ViewUtilsApi19", "fetchViewFlagsField: ");
            }
            charlie = true;
        }
        Field field = bravo;
        if (field != null) {
            try {
                bravo.setInt(view, i4 | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }
}
