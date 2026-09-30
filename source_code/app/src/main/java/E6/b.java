package E6;

import T5.ad;
import android.os.Parcel;
import be.g;
import com.google.android.gms.signin.internal.zak;
import m6.AbstractBinderC2100a;
import m6.AbstractC2101b;

/* loaded from: classes2.dex */
public abstract class b extends AbstractBinderC2100a {
    @Override // m6.AbstractBinderC2100a
    public final boolean ivory(int i4, Parcel parcel, Parcel parcel2) {
        switch (i4) {
            case 3:
                AbstractC2101b.bravo(parcel);
                break;
            case 4:
                AbstractC2101b.bravo(parcel);
                break;
            case 5:
            default:
                return false;
            case 6:
                AbstractC2101b.bravo(parcel);
                break;
            case 7:
                AbstractC2101b.bravo(parcel);
                break;
            case 8:
                zak zakVar = (zak) AbstractC2101b.alpha(parcel, zak.CREATOR);
                AbstractC2101b.bravo(parcel);
                ad adVar = (ad) this;
                adVar.india.post(new g(7, adVar, zakVar, false));
                break;
            case 9:
                AbstractC2101b.bravo(parcel);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
