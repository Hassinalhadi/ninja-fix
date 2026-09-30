package w6;

import G6.h;
import V5.x;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.wallet.PaymentData;
import s6.AbstractC2833z7;

/* loaded from: classes2.dex */
public final class f extends Binder implements e, IInterface {
    public final /* synthetic */ int golf;
    public final h hotel;

    public f(int i4, h hVar) {
        this.golf = i4;
        attachInterface(this, "com.google.android.gms.wallet.internal.IWalletServiceCallbacks");
        this.hotel = hVar;
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this;
    }

    @Override // w6.e
    public void azure(Status status, boolean z2) {
        switch (this.golf) {
            case 0:
                AbstractC2833z7.charlie(status, Boolean.valueOf(z2), this.hotel);
                return;
            default:
                return;
        }
    }

    public final void bravo(Status status, boolean z2) {
    }

    public final void charlie(Status status, PaymentData paymentData) {
    }

    public final void delta(int i4, boolean z2) {
    }

    @Override // w6.e
    public void lima(int i4, boolean z2) {
        switch (this.golf) {
            case 0:
                AbstractC2833z7.charlie(new Status(i4, null, null, null), Boolean.valueOf(z2), this.hotel);
                return;
            default:
                return;
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i4, Parcel parcel, Parcel parcel2, int i5) {
        if (i4 > 16777215) {
            if (super.onTransact(i4, parcel, parcel2, i5)) {
                return true;
            }
        } else {
            parcel.enforceInterface(getInterfaceDescriptor());
        }
        boolean z2 = false;
        switch (i4) {
            case 1:
                parcel.readInt();
                AbstractC3237a.bravo(parcel);
                return true;
            case 2:
                parcel.readInt();
                AbstractC3237a.bravo(parcel);
                return true;
            case 3:
                int readInt = parcel.readInt();
                int i10 = AbstractC3237a.alpha;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                AbstractC3237a.bravo(parcel);
                lima(readInt, z2);
                return true;
            case 4:
                parcel.readInt();
                AbstractC3237a.bravo(parcel);
                return true;
            case 5:
            default:
                return false;
            case 6:
                parcel.readInt();
                int i11 = AbstractC3237a.alpha;
                parcel.readInt();
                AbstractC3237a.bravo(parcel);
                return true;
            case 7:
                AbstractC3237a.bravo(parcel);
                return true;
            case 8:
                AbstractC3237a.bravo(parcel);
                return true;
            case 9:
                Status status = (Status) AbstractC3237a.alpha(parcel, Status.CREATOR);
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                AbstractC3237a.bravo(parcel);
                azure(status, z2);
                return true;
            case 10:
                AbstractC3237a.bravo(parcel);
                return true;
            case 11:
                AbstractC3237a.bravo(parcel);
                return true;
            case 12:
                AbstractC3237a.bravo(parcel);
                return true;
            case 13:
                AbstractC3237a.bravo(parcel);
                return true;
            case 14:
                Status status2 = (Status) AbstractC3237a.alpha(parcel, Status.CREATOR);
                PaymentData paymentData = (PaymentData) AbstractC3237a.alpha(parcel, PaymentData.CREATOR);
                AbstractC3237a.bravo(parcel);
                romeo(status2, paymentData);
                return true;
            case 15:
                AbstractC3237a.bravo(parcel);
                return true;
            case 16:
                AbstractC3237a.bravo(parcel);
                return true;
            case 17:
                AbstractC3237a.bravo(parcel);
                return true;
            case 18:
                parcel.readInt();
                AbstractC3237a.bravo(parcel);
                return true;
            case 19:
                AbstractC3237a.bravo(parcel);
                return true;
            case 20:
                AbstractC3237a.bravo(parcel);
                return true;
        }
    }

    @Override // w6.e
    public void romeo(Status status, PaymentData paymentData) {
        boolean z2;
        switch (this.golf) {
            case 1:
                int i4 = H6.a.alpha;
                if (status.alpha <= 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                h hVar = this.hotel;
                if (z2) {
                    hVar.bravo(paymentData);
                    return;
                } else {
                    hVar.alpha(x.mike(status));
                    return;
                }
            default:
                return;
        }
    }
}
