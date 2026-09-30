package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;
import y2.AbstractC3392a;
import y2.C3393b;
import y2.InterfaceC3394c;

/* loaded from: classes3.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(AbstractC3392a abstractC3392a) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        InterfaceC3394c interfaceC3394c = remoteActionCompat.alpha;
        boolean z2 = true;
        if (abstractC3392a.echo(1)) {
            interfaceC3394c = abstractC3392a.hotel();
        }
        remoteActionCompat.alpha = (IconCompat) interfaceC3394c;
        CharSequence charSequence = remoteActionCompat.bravo;
        if (abstractC3392a.echo(2)) {
            charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3393b) abstractC3392a).echo);
        }
        remoteActionCompat.bravo = charSequence;
        CharSequence charSequence2 = remoteActionCompat.charlie;
        if (abstractC3392a.echo(3)) {
            charSequence2 = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(((C3393b) abstractC3392a).echo);
        }
        remoteActionCompat.charlie = charSequence2;
        remoteActionCompat.delta = (PendingIntent) abstractC3392a.golf(remoteActionCompat.delta, 4);
        boolean z10 = remoteActionCompat.echo;
        if (abstractC3392a.echo(5)) {
            if (((C3393b) abstractC3392a).echo.readInt() != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
        }
        remoteActionCompat.echo = z10;
        boolean z11 = remoteActionCompat.foxtrot;
        if (!abstractC3392a.echo(6)) {
            z2 = z11;
        } else if (((C3393b) abstractC3392a).echo.readInt() == 0) {
            z2 = false;
        }
        remoteActionCompat.foxtrot = z2;
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, AbstractC3392a abstractC3392a) {
        abstractC3392a.getClass();
        IconCompat iconCompat = remoteActionCompat.alpha;
        abstractC3392a.india(1);
        abstractC3392a.kilo(iconCompat);
        CharSequence charSequence = remoteActionCompat.bravo;
        abstractC3392a.india(2);
        Parcel parcel = ((C3393b) abstractC3392a).echo;
        TextUtils.writeToParcel(charSequence, parcel, 0);
        CharSequence charSequence2 = remoteActionCompat.charlie;
        abstractC3392a.india(3);
        TextUtils.writeToParcel(charSequence2, parcel, 0);
        PendingIntent pendingIntent = remoteActionCompat.delta;
        abstractC3392a.india(4);
        parcel.writeParcelable(pendingIntent, 0);
        boolean z2 = remoteActionCompat.echo;
        abstractC3392a.india(5);
        parcel.writeInt(z2 ? 1 : 0);
        boolean z10 = remoteActionCompat.foxtrot;
        abstractC3392a.india(6);
        parcel.writeInt(z10 ? 1 : 0);
    }
}
