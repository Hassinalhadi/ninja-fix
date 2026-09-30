package com.google.android.gms.common.api;

import G6.q;
import T5.aa;
import T5.ab;
import T5.ae;
import T5.af;
import T5.aj;
import T5.o;
import T5.p;
import V5.x;
import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Looper;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.internal.measurement.ai;
import id.C1915c;
import java.util.Collections;
import java.util.Set;

/* loaded from: classes2.dex */
public abstract class g implements k {
    public final Context alpha;
    public final String bravo;
    public final e charlie;
    public final b delta;
    public final T5.b echo;
    public final int foxtrot;
    public final T5.a golf;
    public final T5.e hotel;

    public g(Context context, Activity activity, e eVar, b bVar, f fVar) {
        String str;
        x.india(context, "Null context is not permitted.");
        x.india(eVar, "Api must not be null.");
        x.india(fVar, "Settings must not be null; use Settings.DEFAULT_SETTINGS instead.");
        Context applicationContext = context.getApplicationContext();
        x.india(applicationContext, "The provided context did not have an application context.");
        this.alpha = applicationContext;
        if (Build.VERSION.SDK_INT >= 30) {
            str = context.getAttributionTag();
        } else {
            str = null;
        }
        this.bravo = str;
        this.charlie = eVar;
        this.delta = bVar;
        T5.b bVar2 = new T5.b(eVar, bVar, str);
        this.echo = bVar2;
        T5.e foxtrot = T5.e.foxtrot(applicationContext);
        this.hotel = foxtrot;
        this.foxtrot = foxtrot.hotel.getAndIncrement();
        this.golf = fVar.alpha;
        if (activity != null && !(activity instanceof GoogleApiActivity) && Looper.myLooper() == Looper.getMainLooper()) {
            T5.h bravo = aj.bravo(activity);
            p pVar = (p) bravo.alpha(p.class, "ConnectionlessLifecycleHelper");
            pVar = pVar == null ? new p(bravo, foxtrot, GoogleApiAvailability.getInstance()) : pVar;
            pVar.white.add(bVar2);
            foxtrot.alpha(pVar);
        }
        ai aiVar = foxtrot.november;
        aiVar.sendMessage(aiVar.obtainMessage(7, this));
    }

    public final C1915c alpha() {
        C1915c c1915c = new C1915c(18, false);
        b bVar = this.delta;
        if (bVar instanceof H6.d) {
            ((H6.d) bVar).getClass();
        }
        Set set = Collections.EMPTY_SET;
        if (((bv.f) c1915c.purple) == null) {
            c1915c.purple = new bv.f(0);
        }
        ((bv.f) c1915c.purple).addAll(set);
        Context context = this.alpha;
        c1915c.silver = context.getClass().getName();
        c1915c.red = context.getPackageName();
        return c1915c;
    }

    public final q bravo(J2.c cVar) {
        x.india((T5.i) ((K1.f) ((o) cVar.purple).delta).bravo, "Listener has already been released.");
        x.india((T5.i) ((w.o) cVar.red).purple, "Listener has already been released.");
        o oVar = (o) cVar.purple;
        w.o oVar2 = (w.o) cVar.red;
        T5.e eVar = this.hotel;
        eVar.getClass();
        G6.h hVar = new G6.h();
        eVar.echo(hVar, oVar.charlie, this);
        aa aaVar = new aa(new ae(new ab(oVar, oVar2), hVar), eVar.india.get(), this);
        ai aiVar = eVar.november;
        aiVar.sendMessage(aiVar.obtainMessage(8, aaVar));
        return hVar.alpha;
    }

    public final q charlie(T5.i iVar, int i4) {
        x.india(iVar, "Listener key cannot be null.");
        T5.e eVar = this.hotel;
        eVar.getClass();
        G6.h hVar = new G6.h();
        eVar.echo(hVar, i4, this);
        aa aaVar = new aa(new ae(iVar, hVar), eVar.india.get(), this);
        ai aiVar = eVar.november;
        aiVar.sendMessage(aiVar.obtainMessage(13, aaVar));
        return hVar.alpha;
    }

    public final q delta(int i4, o oVar) {
        G6.h hVar = new G6.h();
        T5.e eVar = this.hotel;
        eVar.getClass();
        eVar.echo(hVar, oVar.charlie, this);
        aa aaVar = new aa(new af(i4, oVar, hVar, this.golf), eVar.india.get(), this);
        ai aiVar = eVar.november;
        aiVar.sendMessage(aiVar.obtainMessage(4, aaVar));
        return hVar.alpha;
    }

    @Override // com.google.android.gms.common.api.k
    public final T5.b getApiKey() {
        return this.echo;
    }
}
