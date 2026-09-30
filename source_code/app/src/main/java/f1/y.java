package f1;

import ac.C0418a;
import ac.InterfaceC0420c;
import android.app.Notification;
import android.os.Parcel;
import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class y {
    public final String alpha;
    public final int bravo;
    public final Notification charlie;

    public y(String str, int i4, Notification notification) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = notification;
    }

    public final void alpha(InterfaceC0420c interfaceC0420c) {
        String str = this.alpha;
        int i4 = this.bravo;
        C0418a c0418a = (C0418a) interfaceC0420c;
        c0418a.getClass();
        Parcel obtain = Parcel.obtain();
        try {
            obtain.writeInterfaceToken(InterfaceC0420c.charlie);
            obtain.writeString(str);
            obtain.writeInt(i4);
            obtain.writeString(null);
            Notification notification = this.charlie;
            if (notification != null) {
                obtain.writeInt(1);
                notification.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            c0418a.golf.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NotifyTask[packageName:");
        sb2.append(this.alpha);
        sb2.append(", id:");
        return P0.cyan(sb2, this.bravo, ", tag:null]");
    }
}
