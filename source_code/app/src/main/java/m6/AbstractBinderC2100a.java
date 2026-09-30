package m6;

import G6.h;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.integrity.i;
import p7.n;

/* renamed from: m6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractBinderC2100a extends Binder implements IInterface {
    public final /* synthetic */ int golf;

    @Override // android.os.IInterface
    public IBinder asBinder() {
        int i4 = this.golf;
        return this;
    }

    public abstract boolean ivory(int i4, Parcel parcel, Parcel parcel2);

    public boolean jade(int i4, Parcel parcel, Parcel parcel2) {
        return false;
    }

    public abstract boolean lavender(Parcel parcel, int i4);

    @Override // android.os.Binder
    public boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        switch (this.golf) {
            case 0:
                if (i4 > 16777215) {
                    if (super.onTransact(i4, parcel, parcel2, i5)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return ivory(i4, parcel, parcel2);
            case 1:
                if (i4 > 16777215) {
                    if (super.onTransact(i4, parcel, parcel2, i5)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return jade(i4, parcel, parcel2);
            case 2:
                if (i4 > 16777215) {
                    if (super.onTransact(i4, parcel, parcel2, i5)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return lavender(parcel, i4);
            case 3:
                if (i4 > 16777215) {
                    if (super.onTransact(i4, parcel, parcel2, i5)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                com.google.android.play.core.integrity.g gVar = (com.google.android.play.core.integrity.g) this;
                if (i4 != 2) {
                    if (i4 != 3) {
                        h hVar = gVar.hotel;
                        i iVar = gVar.india;
                        if (i4 != 4) {
                            if (i4 != 5) {
                                return false;
                            }
                            Parcelable.Creator creator = Bundle.CREATOR;
                            n.bravo(parcel);
                            iVar.echo.charlie(hVar);
                            return true;
                        }
                        Parcelable.Creator creator2 = Bundle.CREATOR;
                        n.bravo(parcel);
                        iVar.echo.charlie(hVar);
                        return true;
                    }
                    Parcelable.Creator creator3 = Bundle.CREATOR;
                    Bundle bundle = (Bundle) n.alpha(parcel);
                    n.bravo(parcel);
                    gVar.oscar(bundle);
                    return true;
                }
                Parcelable.Creator creator4 = Bundle.CREATOR;
                Bundle bundle2 = (Bundle) n.alpha(parcel);
                n.bravo(parcel);
                gVar.zulu(bundle2);
                return true;
            case 4:
                if (i4 > 16777215) {
                    if (super.onTransact(i4, parcel, parcel2, i5)) {
                        return true;
                    }
                } else {
                    parcel.enforceInterface(getInterfaceDescriptor());
                }
                return jade(i4, parcel, parcel2);
            default:
                return super.onTransact(i4, parcel, parcel2, i5);
        }
    }

    public AbstractBinderC2100a(String str, int i4) {
        this.golf = i4;
        switch (i4) {
            case 1:
                attachInterface(this, str);
                return;
            case 2:
                attachInterface(this, str);
                return;
            case 3:
            default:
                attachInterface(this, str);
                return;
            case 4:
                attachInterface(this, str);
                return;
        }
    }
}
