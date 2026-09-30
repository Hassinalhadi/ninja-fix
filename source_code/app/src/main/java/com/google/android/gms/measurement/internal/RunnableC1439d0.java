package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* renamed from: com.google.android.gms.measurement.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class RunnableC1439d0 implements Runnable {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C1459n0 purple;

    public /* synthetic */ RunnableC1439d0(C1459n0 c1459n0, int i4) {
        this.alpha = i4;
        this.purple = c1459n0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        switch (this.alpha) {
            case 0:
                C1459n0 c1459n0 = this.purple;
                c1459n0.W();
                G g2 = (G) c1459n0.alpha;
                ax axVar = g2.f7506a;
                G.delta(axVar);
                boolean charlie = axVar.f7650n.charlie();
                ar arVar = g2.f7507b;
                if (!charlie) {
                    ax axVar2 = g2.f7506a;
                    G.delta(axVar2);
                    aw awVar = axVar2.f7651o;
                    long alpha = awVar.alpha();
                    awVar.bravo(1 + alpha);
                    if (alpha >= 5) {
                        G.foxtrot(arVar);
                        arVar.f7632b.alpha("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        axVar2.f7650n.bravo(true);
                        return;
                    } else {
                        if (c1459n0.f7684m == null) {
                            c1459n0.f7684m = new C1443f0(c1459n0, g2, 3);
                        }
                        c1459n0.f7684m.charlie(0L);
                        return;
                    }
                }
                G.foxtrot(arVar);
                arVar.f7635f.alpha("Deferred Deep Link already retrieved. Not fetching again.");
                return;
            case 1:
                this.purple.e0();
                return;
            case 2:
                F f5 = this.purple.f7682k;
                G g5 = f5.alpha;
                E e = g5.f7508c;
                G.foxtrot(e);
                e.W();
                if (f5.charlie()) {
                    boolean delta = f5.delta();
                    C1459n0 c1459n02 = g5.f7513i;
                    ax axVar3 = g5.f7506a;
                    if (delta) {
                        G.delta(axVar3);
                        axVar3.f7653q.oscar(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString("medium", "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        G.echo(c1459n02);
                        c1459n02.h0("auto", "_cmpx", bundle);
                    } else {
                        G.delta(axVar3);
                        C3.d dVar = axVar3.f7653q;
                        String november = dVar.november();
                        if (TextUtils.isEmpty(november)) {
                            ar arVar2 = g5.f7507b;
                            G.foxtrot(arVar2);
                            arVar2.yellow.alpha("Cache still valid but referrer not found");
                        } else {
                            long alpha2 = axVar3.f7654r.alpha() / 3600000;
                            Uri parse = Uri.parse(november);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(parse.getPath(), bundle2);
                            for (String str2 : parse.getQueryParameterNames()) {
                                bundle2.putString(str2, parse.getQueryParameter(str2));
                            }
                            ((Bundle) pair.second).putLong("_cc", (alpha2 - 1) * 3600000);
                            Object obj = pair.first;
                            if (obj == null) {
                                str = "app";
                            } else {
                                str = (String) obj;
                            }
                            G.echo(c1459n02);
                            c1459n02.h0(str, "_cmp", (Bundle) pair.second);
                        }
                        dVar.oscar(null);
                    }
                    G.delta(axVar3);
                    axVar3.f7654r.bravo(0L);
                    return;
                }
                return;
            default:
                this.purple.e0();
                return;
        }
    }
}
