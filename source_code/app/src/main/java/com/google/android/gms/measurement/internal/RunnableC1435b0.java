package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import com.zendesk.service.HttpConstants;
import java.util.Iterator;
import java.util.TreeSet;

/* renamed from: com.google.android.gms.measurement.internal.b0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1435b0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Bundle purple;
    public final /* synthetic */ C1459n0 red;

    public /* synthetic */ RunnableC1435b0(C1459n0 c1459n0, Bundle bundle, int i4) {
        this.alpha = i4;
        this.red = c1459n0;
        this.purple = bundle;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle;
        int i4;
        switch (this.alpha) {
            case 0:
                Bundle bundle2 = this.purple;
                boolean isEmpty = bundle2.isEmpty();
                C1459n0 c1459n0 = this.red;
                if (isEmpty) {
                    bundle = bundle2;
                } else {
                    G g2 = (G) c1459n0.alpha;
                    ax axVar = g2.f7506a;
                    G.delta(axVar);
                    bundle = new Bundle(axVar.f7655s.tango());
                    Iterator<String> it = bundle2.keySet().iterator();
                    while (true) {
                        boolean hasNext = it.hasNext();
                        androidx.core.widget.f fVar = c1459n0.f7687p;
                        C1440e c1440e = g2.yellow;
                        ar arVar = g2.f7507b;
                        d1 d1Var = g2.e;
                        if (hasNext) {
                            String next = it.next();
                            Object obj = bundle2.get(next);
                            if (obj != null && !(obj instanceof String) && !(obj instanceof Long) && !(obj instanceof Double)) {
                                G.delta(d1Var);
                                if (d1.N0(obj)) {
                                    d1.q0(fVar, null, 27, null, null, 0);
                                }
                                G.foxtrot(arVar);
                                arVar.f7634d.charlie(next, obj, "Invalid default event parameter type. Name, value");
                            } else if (d1.Q0(next)) {
                                G.foxtrot(arVar);
                                arVar.f7634d.bravo(next, "Invalid default event parameter name. Name");
                            } else if (obj == null) {
                                bundle.remove(next);
                            } else {
                                G.delta(d1Var);
                                c1440e.getClass();
                                if (d1Var.I0("param", next, HttpConstants.HTTP_INTERNAL_ERROR, obj)) {
                                    d1Var.r0(bundle, next, obj);
                                }
                            }
                        } else {
                            G.delta(d1Var);
                            d1 d1Var2 = ((G) c1440e.alpha).e;
                            G.delta(d1Var2);
                            if (d1Var2.P0(201500000)) {
                                i4 = 100;
                            } else {
                                i4 = 25;
                            }
                            if (bundle.size() > i4) {
                                Iterator it2 = new TreeSet(bundle.keySet()).iterator();
                                int i5 = 0;
                                while (it2.hasNext()) {
                                    String str = (String) it2.next();
                                    i5++;
                                    if (i5 > i4) {
                                        bundle.remove(str);
                                    }
                                }
                                G.delta(d1Var);
                                d1.q0(fVar, null, 26, null, null, 0);
                                G.foxtrot(arVar);
                                arVar.f7634d.alpha("Too many default event parameters set. Discarding beyond event parameter limit");
                            }
                        }
                    }
                }
                G g5 = (G) c1459n0.alpha;
                ax axVar2 = g5.f7506a;
                G.delta(axVar2);
                axVar2.f7655s.uniform(bundle);
                if (bundle2.isEmpty()) {
                    if (!g5.yellow.j0(null, ac.f7581W)) {
                        return;
                    }
                }
                ((G) c1459n0.alpha).mike().f0(bundle);
                return;
            default:
                C1459n0 c1459n02 = this.red;
                c1459n02.W();
                c1459n02.X();
                Bundle bundle3 = this.purple;
                String string = bundle3.getString("name");
                String string2 = bundle3.getString("origin");
                V5.x.echo(string);
                V5.x.echo(string2);
                V5.x.hotel(bundle3.get("value"));
                G g10 = (G) c1459n02.alpha;
                if (!g10.alpha()) {
                    ar arVar2 = g10.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.f7636g.alpha("Conditional property not set since app measurement is disabled");
                    return;
                }
                zzqb zzqbVar = new zzqb(bundle3.getLong("triggered_timestamp"), bundle3.get("value"), string, string2);
                try {
                    d1 d1Var3 = g10.e;
                    G.delta(d1Var3);
                    bundle3.getString("app_id");
                    zzbh c02 = d1Var3.c0(bundle3.getString("triggered_event_name"), bundle3.getBundle("triggered_event_params"), string2, 0L, true);
                    G.delta(d1Var3);
                    bundle3.getString("app_id");
                    zzbh c03 = d1Var3.c0(bundle3.getString("timed_out_event_name"), bundle3.getBundle("timed_out_event_params"), string2, 0L, true);
                    bundle3.getString("app_id");
                    g10.mike().e0(new zzai(bundle3.getString("app_id"), string2, zzqbVar, bundle3.getLong("creation_timestamp"), false, bundle3.getString("trigger_event_name"), c03, bundle3.getLong("trigger_timeout"), c02, bundle3.getLong("time_to_live"), d1Var3.c0(bundle3.getString("expired_event_name"), bundle3.getBundle("expired_event_params"), string2, 0L, true)));
                    return;
                } catch (IllegalArgumentException unused) {
                    return;
                }
        }
    }
}
