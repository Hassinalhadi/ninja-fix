package t6;

import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;

/* renamed from: t6.e3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2987e3 {
    public static boolean alpha = true;

    public static Object alpha(Parcel parcel, Parcelable.Creator creator) {
        if (parcel.readInt() != 0) {
            return creator.createFromParcel(parcel);
        }
        return null;
    }

    public static void bravo(ViewGroup viewGroup, boolean z2) {
        if (Build.VERSION.SDK_INT >= 29) {
            x2.ak.bravo(viewGroup, z2);
        } else if (alpha) {
            try {
                x2.ak.bravo(viewGroup, z2);
            } catch (NoSuchMethodError unused) {
                alpha = false;
            }
        }
    }
}
