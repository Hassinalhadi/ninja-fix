package com.google.android.gms.cloudmessaging;

import S5.b;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class zzd implements Parcelable {
    public static final Parcelable.Creator<zzd> CREATOR = new b(1);
    public final Messenger alpha;

    public zzd(IBinder iBinder) {
        this.alpha = new Messenger(iBinder);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            try {
                Messenger messenger = this.alpha;
                messenger.getClass();
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((zzd) obj).alpha;
                messenger2.getClass();
                return binder.equals(messenger2.getBinder());
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        Messenger messenger = this.alpha;
        messenger.getClass();
        return messenger.getBinder().hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Messenger messenger = this.alpha;
        messenger.getClass();
        parcel.writeStrongBinder(messenger.getBinder());
    }
}
