package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.text.TextUtils;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.n, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1458n {
    public final String alpha;
    public final String bravo;
    public final String charlie;
    public final long delta;
    public final long echo;
    public final zzbf foxtrot;

    public C1458n(G g2, String str, String str2, String str3, long j5, long j6, Bundle bundle) {
        zzbf zzbfVar;
        V5.x.echo(str2);
        V5.x.echo(str3);
        this.alpha = str2;
        this.bravo = str3;
        this.charlie = true == TextUtils.isEmpty(str) ? null : str;
        this.delta = j5;
        this.echo = j6;
        if (j6 != 0 && j6 > j5) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.bravo(ar.e0(str2), "Event created with reverse previous/current timestamps. appId");
        }
        if (bundle != null && !bundle.isEmpty()) {
            Bundle bundle2 = new Bundle(bundle);
            Iterator<String> it = bundle2.keySet().iterator();
            while (it.hasNext()) {
                String next = it.next();
                if (next == null) {
                    ar arVar2 = g2.f7507b;
                    G.foxtrot(arVar2);
                    arVar2.white.alpha("Param name can't be null");
                    it.remove();
                } else {
                    d1 d1Var = g2.e;
                    G.delta(d1Var);
                    Object d02 = d1Var.d0(bundle2.get(next), next);
                    if (d02 == null) {
                        ar arVar3 = g2.f7507b;
                        G.foxtrot(arVar3);
                        arVar3.f7632b.bravo(g2.f7510f.echo(next), "Param value can't be null");
                        it.remove();
                    } else {
                        d1 d1Var2 = g2.e;
                        G.delta(d1Var2);
                        d1Var2.r0(bundle2, next, d02);
                    }
                }
            }
            zzbfVar = new zzbf(bundle2);
        } else {
            zzbfVar = new zzbf(new Bundle());
        }
        this.foxtrot = zzbfVar;
    }

    public final C1458n alpha(G g2, long j5) {
        return new C1458n(g2, this.charlie, this.alpha, this.bravo, this.delta, j5, this.foxtrot);
    }

    public final String toString() {
        String zzbfVar = this.foxtrot.toString();
        StringBuilder sb2 = new StringBuilder("Event{appId='");
        sb2.append(this.alpha);
        sb2.append("', name='");
        return com.google.android.material.datepicker.j.lima(sb2, this.bravo, "', params=", zzbfVar, "}");
    }

    public C1458n(G g2, String str, String str2, String str3, long j5, long j6, zzbf zzbfVar) {
        V5.x.echo(str2);
        V5.x.echo(str3);
        V5.x.hotel(zzbfVar);
        this.alpha = str2;
        this.bravo = str3;
        this.charlie = true == TextUtils.isEmpty(str) ? null : str;
        this.delta = j5;
        this.echo = j6;
        if (j6 != 0 && j6 > j5) {
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7632b.charlie(ar.e0(str2), ar.e0(str3), "Event created with reverse previous/current timestamps. appId, name");
        }
        this.foxtrot = zzbfVar;
    }
}
