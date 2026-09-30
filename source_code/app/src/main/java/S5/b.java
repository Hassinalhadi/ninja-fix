package S5;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.cloudmessaging.zzd;
import t6.AbstractC3038p;

/* loaded from: classes2.dex */
public final class b implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                int amber = AbstractC3038p.amber(parcel);
                Intent intent = null;
                while (parcel.dataPosition() < amber) {
                    int readInt = parcel.readInt();
                    if (((char) readInt) != 1) {
                        AbstractC3038p.zulu(parcel, readInt);
                    } else {
                        intent = (Intent) AbstractC3038p.hotel(parcel, readInt, Intent.CREATOR);
                    }
                }
                AbstractC3038p.november(parcel, amber);
                return new CloudMessage(intent);
            default:
                return new zzd(parcel.readStrongBinder());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new CloudMessage[i4];
            default:
                return new zzd[i4];
        }
    }
}
