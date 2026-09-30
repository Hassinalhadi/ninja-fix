package p7;

import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;

/* loaded from: classes2.dex */
public abstract class n {
    public static final /* synthetic */ int alpha = 0;

    static {
        n.class.getClassLoader();
    }

    public static Parcelable alpha(Parcel parcel) {
        Parcelable.Creator creator = Bundle.CREATOR;
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    public static void bravo(Parcel parcel) {
        int dataAvail = parcel.dataAvail();
        if (dataAvail <= 0) {
        } else {
            throw new BadParcelableException(ad.zulu(dataAvail, "Parcel data not fully consumed, unread size: "));
        }
    }
}
