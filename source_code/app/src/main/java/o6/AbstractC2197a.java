package o6;

import android.os.BadParcelableException;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;

/* renamed from: o6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2197a {
    public static final /* synthetic */ int alpha = 0;

    static {
        AbstractC2197a.class.getClassLoader();
    }

    public static Parcelable alpha(Parcel parcel, Parcelable.Creator creator) {
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

    public static void charlie(Parcel parcel, IInterface iInterface) {
        if (iInterface == null) {
            parcel.writeStrongBinder(null);
        } else {
            parcel.writeStrongBinder(iInterface.asBinder());
        }
    }
}
