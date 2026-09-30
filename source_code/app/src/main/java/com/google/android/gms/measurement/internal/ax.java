package com.google.android.gms.measurement.internal;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;

/* loaded from: classes2.dex */
public final class ax extends P {

    /* renamed from: t, reason: collision with root package name */
    public static final Pair f7637t = new Pair("", 0L);

    /* renamed from: a, reason: collision with root package name */
    public final C3.d f7638a;

    /* renamed from: b, reason: collision with root package name */
    public String f7639b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7640c;

    /* renamed from: d, reason: collision with root package name */
    public long f7641d;
    public final aw e;

    /* renamed from: f, reason: collision with root package name */
    public final Y1.j f7642f;

    /* renamed from: g, reason: collision with root package name */
    public final C3.d f7643g;

    /* renamed from: h, reason: collision with root package name */
    public final J2.n f7644h;

    /* renamed from: i, reason: collision with root package name */
    public final Y1.j f7645i;

    /* renamed from: j, reason: collision with root package name */
    public final aw f7646j;

    /* renamed from: k, reason: collision with root package name */
    public final aw f7647k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7648l;

    /* renamed from: m, reason: collision with root package name */
    public final Y1.j f7649m;

    /* renamed from: n, reason: collision with root package name */
    public final Y1.j f7650n;

    /* renamed from: o, reason: collision with root package name */
    public final aw f7651o;

    /* renamed from: p, reason: collision with root package name */
    public final C3.d f7652p;

    /* renamed from: q, reason: collision with root package name */
    public final C3.d f7653q;

    /* renamed from: r, reason: collision with root package name */
    public final aw f7654r;
    public SharedPreferences red;

    /* renamed from: s, reason: collision with root package name */
    public final J2.n f7655s;
    public final Object silver;
    public SharedPreferences teal;
    public C2.d white;
    public final aw yellow;

    public ax(G g2) {
        super(g2);
        this.silver = new Object();
        this.e = new aw(this, "session_timeout", 1800000L);
        this.f7642f = new Y1.j(this, "start_new_session", true);
        this.f7646j = new aw(this, "last_pause_time", 0L);
        this.f7647k = new aw(this, "session_id", 0L);
        this.f7643g = new C3.d(this, "non_personalized_ads");
        this.f7644h = new J2.n(this, "last_received_uri_timestamps_by_source");
        this.f7645i = new Y1.j(this, "allow_remote_dynamite", false);
        this.yellow = new aw(this, "first_open_time", 0L);
        V5.x.echo("app_install_time");
        this.f7638a = new C3.d(this, "app_instance_id");
        this.f7649m = new Y1.j(this, "app_backgrounded", false);
        this.f7650n = new Y1.j(this, "deep_link_retrieval_complete", false);
        this.f7651o = new aw(this, "deep_link_retrieval_attempts", 0L);
        this.f7652p = new C3.d(this, "firebase_feature_rollouts");
        this.f7653q = new C3.d(this, "deferred_attribution_cache");
        this.f7654r = new aw(this, "deferred_attribution_cache_timestamp", 0L);
        this.f7655s = new J2.n(this, "default_event_parameters");
    }

    @Override // com.google.android.gms.measurement.internal.P
    public final boolean X() {
        return true;
    }

    public final SharedPreferences a0() {
        W();
        Y();
        if (this.teal == null) {
            synchronized (this.silver) {
                try {
                    if (this.teal == null) {
                        G g2 = (G) this.alpha;
                        String str = g2.alpha.getPackageName() + "_preferences";
                        ar arVar = g2.f7507b;
                        G.foxtrot(arVar);
                        arVar.f7636g.bravo(str, "Default prefs file");
                        this.teal = g2.alpha.getSharedPreferences(str, 0);
                    }
                } finally {
                }
            }
        }
        return this.teal;
    }

    public final SharedPreferences b0() {
        W();
        Y();
        V5.x.hotel(this.red);
        return this.red;
    }

    public final SparseArray c0() {
        Bundle tango = this.f7644h.tango();
        int[] intArray = tango.getIntArray("uriSources");
        long[] longArray = tango.getLongArray("uriTimestamps");
        if (intArray != null && longArray != null) {
            if (intArray.length != longArray.length) {
                ar arVar = ((G) this.alpha).f7507b;
                G.foxtrot(arVar);
                arVar.white.alpha("Trigger URI source and timestamp array lengths do not match");
                return new SparseArray();
            }
            SparseArray sparseArray = new SparseArray();
            for (int i4 = 0; i4 < intArray.length; i4++) {
                sparseArray.put(intArray[i4], Long.valueOf(longArray[i4]));
            }
            return sparseArray;
        }
        return new SparseArray();
    }

    public final V d0() {
        W();
        return V.echo(b0().getInt("consent_source", 100), b0().getString("consent_settings", "G1"));
    }

    public final void e0(boolean z2) {
        W();
        ar arVar = ((G) this.alpha).f7507b;
        G.foxtrot(arVar);
        arVar.f7636g.bravo(Boolean.valueOf(z2), "App measurement setting deferred collection");
        SharedPreferences.Editor edit = b0().edit();
        edit.putBoolean("deferred_analytics_collection", z2);
        edit.apply();
    }

    public final boolean f0(long j5) {
        if (j5 - this.e.alpha() > this.f7646j.alpha()) {
            return true;
        }
        return false;
    }

    public final boolean g0(P0 p02) {
        W();
        String string = b0().getString("stored_tcf_param", "");
        String charlie = p02.charlie();
        if (!charlie.equals(string)) {
            SharedPreferences.Editor edit = b0().edit();
            edit.putString("stored_tcf_param", charlie);
            edit.apply();
            return true;
        }
        return false;
    }
}
