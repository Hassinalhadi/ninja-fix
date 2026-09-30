package p6;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.internal.identity.zzem;

/* renamed from: p6.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2282c implements T5.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ PendingIntent purple;

    public /* synthetic */ C2282c(int i4, PendingIntent pendingIntent) {
        this.alpha = i4;
        this.purple = pendingIntent;
    }

    @Override // T5.m
    public final void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        switch (this.alpha) {
            case 0:
                T5.n nVar = new T5.n(new G6.p(hVar));
                ab abVar = (ab) ((y) obj).tango();
                Parcel ivory = abVar.ivory();
                e.bravo(ivory, this.purple);
                ivory.writeStrongBinder(nVar);
                abVar.lavender(ivory, 73);
                return;
            default:
                PendingIntent pendingIntent = this.purple;
                V5.x.india(pendingIntent, "PendingIntent can not be null.");
                ((q) obj).beige(new zzem(null, pendingIntent, ""), hVar);
                return;
        }
    }
}
