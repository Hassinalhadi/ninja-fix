package p6;

import android.app.PendingIntent;
import android.os.Parcel;
import com.google.android.gms.internal.identity.zzee;
import com.google.android.gms.internal.identity.zzei;

/* renamed from: p6.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2281b implements T5.m {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ PendingIntent purple;

    public /* synthetic */ C2281b(int i4, PendingIntent pendingIntent) {
        this.alpha = i4;
        this.purple = pendingIntent;
    }

    @Override // T5.m
    public final void accept(Object obj, Object obj2) {
        G6.h hVar = (G6.h) obj2;
        switch (this.alpha) {
            case 0:
                y yVar = (y) obj;
                yVar.getClass();
                PendingIntent pendingIntent = this.purple;
                V5.x.hotel(pendingIntent);
                ab abVar = (ab) yVar.tango();
                Parcel ivory = abVar.ivory();
                e.bravo(ivory, pendingIntent);
                abVar.lavender(ivory, 6);
                hVar.bravo(null);
                return;
            case 1:
                G6.p pVar = new G6.p(hVar);
                PendingIntent pendingIntent2 = this.purple;
                V5.x.india(pendingIntent2, "PendingIntent must be specified.");
                T5.n nVar = new T5.n(pVar);
                ab abVar2 = (ab) ((y) obj).tango();
                Parcel ivory2 = abVar2.ivory();
                e.bravo(ivory2, pendingIntent2);
                ivory2.writeStrongBinder(nVar);
                abVar2.lavender(ivory2, 69);
                return;
            default:
                q qVar = (q) obj;
                boolean black = qVar.black(com.google.android.gms.location.n.foxtrot);
                PendingIntent pendingIntent3 = this.purple;
                if (black) {
                    ab abVar3 = (ab) qVar.tango();
                    zzee zzeeVar = new zzee(3, null, null, pendingIntent3, null);
                    l lVar = new l(null, hVar);
                    Parcel ivory3 = abVar3.ivory();
                    e.bravo(ivory3, zzeeVar);
                    ivory3.writeStrongBinder(lVar);
                    abVar3.lavender(ivory3, 89);
                    return;
                }
                ((ab) qVar.tango()).magenta(new zzei(2, null, null, null, pendingIntent3, new i((Boolean) null, hVar), null));
                return;
        }
    }
}
