package p6;

import android.os.Parcel;
import com.google.android.gms.internal.identity.zzl;
import m6.AbstractBinderC2100a;
import s6.AbstractC2833z7;

/* loaded from: classes2.dex */
public final class i extends AbstractBinderC2100a implements aa {
    public final /* synthetic */ int hotel;
    public final /* synthetic */ G6.h india;
    public final /* synthetic */ Object juliet;

    public i() {
        super("com.google.android.gms.location.internal.IFusedLocationProviderCallback", 2);
    }

    private final void lime() {
    }

    @Override // p6.aa
    public final void alpha() {
        switch (this.hotel) {
            case 0:
                ((o) this.juliet).zzf();
                return;
            default:
                return;
        }
    }

    @Override // m6.AbstractBinderC2100a
    public final boolean lavender(Parcel parcel, int i4) {
        if (i4 != 1) {
            if (i4 != 2) {
                return false;
            }
            alpha();
            return true;
        }
        zzl zzlVar = (zzl) e.alpha(parcel, zzl.CREATOR);
        e.charlie(parcel);
        tango(zzlVar);
        return true;
    }

    @Override // p6.aa
    public final void tango(zzl zzlVar) {
        switch (this.hotel) {
            case 0:
                AbstractC2833z7.charlie(zzlVar.alpha, null, this.india);
                return;
            default:
                AbstractC2833z7.charlie(zzlVar.alpha, (Boolean) this.juliet, this.india);
                return;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(G6.h hVar, o oVar) {
        this();
        this.hotel = 0;
        this.india = hVar;
        this.juliet = oVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(Boolean bool, G6.h hVar) {
        this();
        this.hotel = 1;
        this.juliet = bool;
        this.india = hVar;
    }
}
