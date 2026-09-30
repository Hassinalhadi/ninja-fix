package b3;

import R7.U;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import com.google.android.gms.internal.measurement.ac;
import com.google.android.gms.internal.measurement.ad;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ar;
import com.google.android.gms.measurement.internal.ay;

/* renamed from: b3.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class ServiceConnectionC0716b implements ServiceConnection {
    public final /* synthetic */ int alpha;
    public final Object bravo;
    public final /* synthetic */ Object charlie;

    public /* synthetic */ ServiceConnectionC0716b(int i4, Object obj, Object obj2) {
        this.alpha = i4;
        this.charlie = obj;
        this.bravo = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v7, types: [com.google.android.gms.internal.measurement.ad] */
    /* JADX WARN: Type inference failed for: r2v9 */
    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        P5.c aVar;
        ?? r22;
        Object obj = this.charlie;
        switch (this.alpha) {
            case 0:
                U.bravo("Install Referrer service connected.");
                int i4 = P5.b.golf;
                if (iBinder == null) {
                    aVar = null;
                } else {
                    IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (queryLocalInterface instanceof P5.c) {
                        aVar = (P5.c) queryLocalInterface;
                    } else {
                        aVar = new P5.a(iBinder);
                    }
                }
                c cVar = (c) obj;
                cVar.charlie = aVar;
                cVar.alpha = 2;
                ((d) this.bravo).onInstallReferrerSetupFinished(0);
                return;
            default:
                ay ayVar = (ay) obj;
                if (iBinder != null) {
                    try {
                        int i5 = ac.golf;
                        IInterface queryLocalInterface2 = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                        if (queryLocalInterface2 instanceof ad) {
                            r22 = (ad) queryLocalInterface2;
                        } else {
                            r22 = new AbstractC1394y(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService", 0);
                        }
                        if (r22 == 0) {
                            ar arVar = ayVar.bravo.f7507b;
                            G.foxtrot(arVar);
                            arVar.f7632b.alpha("Install Referrer Service implementation was not found");
                            return;
                        }
                        G g2 = ayVar.bravo;
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7636g.alpha("Install Referrer Service connected");
                        E e = g2.f7508c;
                        G.foxtrot(e);
                        e.g0(new s6.E(this, (ad) r22, this));
                        return;
                    } catch (RuntimeException e4) {
                        ar arVar3 = ayVar.bravo.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7632b.bravo(e4, "Exception occurred while calling Install Referrer API");
                        return;
                    }
                }
                ar arVar4 = ayVar.bravo.f7507b;
                G.foxtrot(arVar4);
                arVar4.f7632b.alpha("Install Referrer connection returned with null binder");
                return;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        switch (this.alpha) {
            case 0:
                U.charlie("Install Referrer service disconnected.");
                c cVar = (c) this.charlie;
                cVar.charlie = null;
                cVar.alpha = 0;
                ((d) this.bravo).onInstallReferrerServiceDisconnected();
                return;
            default:
                ar arVar = ((ay) this.charlie).bravo.f7507b;
                G.foxtrot(arVar);
                arVar.f7636g.alpha("Install Referrer Service disconnected");
                return;
        }
    }
}
