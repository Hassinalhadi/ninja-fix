package Gc;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.measurement.C1317f3;
import com.google.android.gms.measurement.internal.E;
import com.google.android.gms.measurement.internal.G;
import com.google.android.gms.measurement.internal.ac;
import com.google.android.gms.measurement.internal.ar;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class v extends BroadcastReceiver {
    public final /* synthetic */ int alpha;
    public final Object bravo;

    public /* synthetic */ v(int i4, Object obj) {
        this.alpha = i4;
        this.bravo = obj;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        char c3;
        switch (this.alpha) {
            case 0:
                ((ZenDeskChatActivity) this.bravo).amber(false);
                return;
            case 1:
                Intrinsics.echo(context, "context");
                Intrinsics.echo(intent, "intent");
                ((H2.d) this.bravo).foxtrot(intent);
                return;
            case 2:
                R3.r rVar = (R3.r) this.bravo;
                rVar.getClass();
                R3.r.yellow.execute(new R3.q(rVar, 2));
                return;
            case 3:
                ((K3.b) this.bravo).quebec();
                return;
            default:
                G g2 = (G) this.bravo;
                if (intent == null) {
                    ar arVar = g2.f7507b;
                    G.foxtrot(arVar);
                    arVar.f7632b.alpha("App receiver called with null intent");
                    return;
                }
                String action = intent.getAction();
                if (action == null) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7632b.alpha("App receiver called with null action");
                    return;
                }
                int hashCode = action.hashCode();
                if (hashCode != -1928239649) {
                    if (hashCode == 1279883384 && action.equals("com.google.android.gms.measurement.BATCHES_AVAILABLE")) {
                        c3 = 1;
                    }
                    c3 = 65535;
                } else {
                    if (action.equals("com.google.android.gms.measurement.TRIGGERS_AVAILABLE")) {
                        c3 = 0;
                    }
                    c3 = 65535;
                }
                if (c3 != 0) {
                    if (c3 != 1) {
                        ar arVar3 = g2.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7632b.alpha("App receiver called with unknown action");
                        return;
                    } else {
                        if (g2.yellow.j0(null, ac.f7570K)) {
                            ar arVar4 = g2.f7507b;
                            G.foxtrot(arVar4);
                            arVar4.f7636g.alpha("[sgtm] App Receiver notified batches are available");
                            E e = g2.f7508c;
                            G.foxtrot(e);
                            e.g0(new F6.b(25, this));
                            return;
                        }
                        return;
                    }
                }
                C1317f3.bravo();
                if (g2.yellow.j0(null, ac.f7575P)) {
                    ar arVar5 = g2.f7507b;
                    G.foxtrot(arVar5);
                    arVar5.f7636g.alpha("App receiver notified triggers are available");
                    E e4 = g2.f7508c;
                    G.foxtrot(e4);
                    e4.g0(new F6.b(24, g2));
                    return;
                }
                return;
        }
    }

    public v(G g2) {
        this.alpha = 4;
        this.bravo = g2;
    }
}
