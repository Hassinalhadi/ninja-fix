package com.google.android.gms.measurement.internal;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.internal.measurement.C1289a0;
import com.google.android.gms.internal.measurement.C1294b0;
import com.google.android.gms.internal.measurement.C1299c0;
import com.google.android.gms.internal.measurement.C1304d0;
import com.google.android.gms.internal.measurement.C1309e0;
import com.google.android.gms.internal.measurement.C1314f0;
import com.google.android.gms.internal.measurement.C1334j0;
import com.google.android.gms.internal.measurement.J1;
import com.google.android.gms.internal.measurement.zzd;
import com.google.android.gms.internal.measurement.zzmm;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class A extends U0 implements InterfaceC1438d {

    /* renamed from: a, reason: collision with root package name */
    public final bv.e f7496a;

    /* renamed from: b, reason: collision with root package name */
    public final bv.e f7497b;

    /* renamed from: c, reason: collision with root package name */
    public final V2.d f7498c;

    /* renamed from: d, reason: collision with root package name */
    public final av.ah f7499d;
    public final bv.e e;

    /* renamed from: f, reason: collision with root package name */
    public final bv.e f7500f;

    /* renamed from: g, reason: collision with root package name */
    public final bv.e f7501g;
    public final bv.e silver;
    public final bv.e teal;
    public final bv.e white;
    public final bv.e yellow;

    /* JADX WARN: Type inference failed for: r2v1, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v2, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v3, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v4, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v5, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v6, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v7, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v8, types: [bv.e, bv.aw] */
    /* JADX WARN: Type inference failed for: r2v9, types: [bv.e, bv.aw] */
    public A(Z0 z02) {
        super(z02);
        this.silver = new bv.aw(0);
        this.teal = new bv.aw(0);
        this.white = new bv.aw(0);
        this.yellow = new bv.aw(0);
        this.f7496a = new bv.aw(0);
        this.e = new bv.aw(0);
        this.f7500f = new bv.aw(0);
        this.f7501g = new bv.aw(0);
        this.f7497b = new bv.aw(0);
        this.f7498c = new V2.d(this);
        this.f7499d = new av.ah(19, this);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [bv.e, bv.aw] */
    public static final bv.e g0(C1314f0 c1314f0) {
        ?? awVar = new bv.aw(0);
        for (C1334j0 c1334j0 : c1314f0.amber()) {
            awVar.put(c1334j0.november(), c1334j0.oscar());
        }
        return awVar;
    }

    public static final U h0(int i4) {
        int i5 = i4 - 1;
        if (i5 != 1) {
            if (i5 != 2) {
                if (i5 != 3) {
                    if (i5 != 4) {
                        return null;
                    }
                    return U.AD_PERSONALIZATION;
                }
                return U.AD_USER_DATA;
            }
            return U.ANALYTICS_STORAGE;
        }
        return U.AD_STORAGE;
    }

    @Override // com.google.android.gms.measurement.internal.U0
    public final void Z() {
    }

    public final boolean a0(String str) {
        W();
        e0(str);
        bv.e eVar = this.teal;
        if (eVar.get(str) != null && ((Set) eVar.get(str)).contains("app_instance_id")) {
            return true;
        }
        return false;
    }

    public final boolean b0(String str) {
        W();
        e0(str);
        bv.e eVar = this.teal;
        if (eVar.get(str) != null) {
            if (((Set) eVar.get(str)).contains("os_version") || ((Set) eVar.get(str)).contains("device_info")) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final C1314f0 c0(String str, byte[] bArr) {
        Long l10;
        G g2 = (G) this.alpha;
        if (bArr == null) {
            return C1314f0.tango();
        }
        try {
            C1314f0 c1314f0 = (C1314f0) ((C1309e0) au.C0(C1314f0.sierra(), bArr)).echo();
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            a4.j jVar = arVar.f7636g;
            String str2 = null;
            if (c1314f0.crimson()) {
                l10 = Long.valueOf(c1314f0.papa());
            } else {
                l10 = null;
            }
            if (c1314f0.bronze()) {
                str2 = c1314f0.victor();
            }
            jVar.charlie(l10, str2, "Parsed config. version, gmp_app_id");
            return c1314f0;
        } catch (zzmm e) {
            ar arVar2 = g2.f7507b;
            G.foxtrot(arVar2);
            arVar2.f7632b.charlie(ar.e0(str), e, "Unable to merge remote config. appId");
            return C1314f0.tango();
        } catch (RuntimeException e4) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.f7632b.charlie(ar.e0(str), e4, "Unable to merge remote config. appId");
            return C1314f0.tango();
        }
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC1438d
    public final String d(String str, String str2) {
        W();
        e0(str);
        Map map = (Map) this.silver.get(str);
        if (map != null) {
            return (String) map.get(str2);
        }
        return null;
    }

    public final void d0(String str, C1309e0 c1309e0) {
        HashSet hashSet = new HashSet();
        bv.aw awVar = new bv.aw(0);
        bv.aw awVar2 = new bv.aw(0);
        bv.aw awVar3 = new bv.aw(0);
        Iterator it = Collections.unmodifiableList(((C1314f0) c1309e0.purple).yankee()).iterator();
        while (it.hasNext()) {
            hashSet.add(((C1294b0) it.next()).november());
        }
        for (int i4 = 0; i4 < ((C1314f0) c1309e0.purple).oscar(); i4++) {
            C1299c0 c1299c0 = (C1299c0) ((C1314f0) c1309e0.purple).romeo(i4).foxtrot();
            boolean isEmpty = c1299c0.hotel().isEmpty();
            G g2 = (G) this.alpha;
            if (isEmpty) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.alpha("EventConfig contained null event name");
            } else {
                String hotel = c1299c0.hotel();
                String delta = W.delta(c1299c0.hotel(), W.alpha, W.charlie);
                if (!TextUtils.isEmpty(delta)) {
                    c1299c0.golf();
                    C1304d0.papa((C1304d0) c1299c0.purple, delta);
                    c1309e0.golf();
                    C1314f0.black((C1314f0) c1309e0.purple, i4, (C1304d0) c1299c0.echo());
                }
                if (((C1304d0) c1299c0.purple).sierra() && ((C1304d0) c1299c0.purple).quebec()) {
                    awVar.put(hotel, Boolean.TRUE);
                }
                if (((C1304d0) c1299c0.purple).tango() && ((C1304d0) c1299c0.purple).romeo()) {
                    awVar2.put(c1299c0.hotel(), Boolean.TRUE);
                }
                if (((C1304d0) c1299c0.purple).uniform()) {
                    if (((C1304d0) c1299c0.purple).november() >= 2 && ((C1304d0) c1299c0.purple).november() <= 65535) {
                        awVar3.put(c1299c0.hotel(), Integer.valueOf(((C1304d0) c1299c0.purple).november()));
                    } else {
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7632b.charlie(c1299c0.hotel(), Integer.valueOf(((C1304d0) c1299c0.purple).november()), "Invalid sampling rate. Event name, sample rate");
                    }
                }
            }
        }
        this.teal.put(str, hashSet);
        this.white.put(str, awVar);
        this.yellow.put(str, awVar2);
        this.f7497b.put(str, awVar3);
    }

    public final void e0(String str) {
        X();
        W();
        V5.x.echo(str);
        bv.e eVar = this.f7496a;
        if (eVar.get(str) == null) {
            C1450j c1450j = this.purple.red;
            Z0.cyan(c1450j);
            com.bumptech.glide.load.engine.h V02 = c1450j.V0(str);
            bv.e eVar2 = this.f7501g;
            bv.e eVar3 = this.f7500f;
            bv.e eVar4 = this.e;
            bv.e eVar5 = this.silver;
            if (V02 == null) {
                eVar5.put(str, null);
                this.white.put(str, null);
                this.teal.put(str, null);
                this.yellow.put(str, null);
                eVar.put(str, null);
                eVar4.put(str, null);
                eVar3.put(str, null);
                eVar2.put(str, null);
                this.f7497b.put(str, null);
                return;
            }
            C1309e0 c1309e0 = (C1309e0) c0(str, (byte[]) V02.purple).foxtrot();
            d0(str, c1309e0);
            eVar5.put(str, g0((C1314f0) c1309e0.echo()));
            eVar.put(str, (C1314f0) c1309e0.echo());
            f0(str, (C1314f0) c1309e0.echo());
            eVar4.put(str, ((C1314f0) c1309e0.purple).whiskey());
            eVar3.put(str, (String) V02.red);
            eVar2.put(str, (String) V02.silver);
        }
    }

    public final void f0(String str, C1314f0 c1314f0) {
        int november = c1314f0.november();
        V2.d dVar = this.f7498c;
        if (november != 0) {
            G g2 = (G) this.alpha;
            ar arVar = g2.f7507b;
            G.foxtrot(arVar);
            arVar.f7636g.bravo(Integer.valueOf(c1314f0.november()), "EES programs found");
            com.google.android.gms.internal.measurement.P0 p02 = (com.google.android.gms.internal.measurement.P0) c1314f0.zulu().get(0);
            try {
                com.google.android.gms.internal.measurement.af afVar = new com.google.android.gms.internal.measurement.af();
                com.google.firebase.messaging.o oVar = afVar.alpha;
                ((HashMap) ((J1) oVar.delta).alpha).put("internal.remoteConfig", new az(this, str, 0));
                ((HashMap) ((J1) oVar.delta).alpha).put("internal.appMetadata", new az(this, str, 1));
                ((HashMap) ((J1) oVar.delta).alpha).put("internal.logger", new C3.b(2, this));
                afVar.alpha(p02);
                dVar.delta(str, afVar);
                G.foxtrot(arVar);
                a4.j jVar = arVar.f7636g;
                jVar.charlie(str, Integer.valueOf(p02.november().november()), "EES program loaded for appId, activities");
                for (com.google.android.gms.internal.measurement.O0 o02 : p02.november().papa()) {
                    G.foxtrot(arVar);
                    jVar.bravo(o02.november(), "EES program activity");
                }
                return;
            } catch (zzd unused) {
                ar arVar2 = g2.f7507b;
                G.foxtrot(arVar2);
                arVar2.white.bravo(str, "Failed to load EES program. appId");
                return;
            }
        }
        dVar.echo(str);
    }

    public final int i0(String str, String str2) {
        Integer num;
        W();
        e0(str);
        Map map = (Map) this.f7497b.get(str);
        if (map != null && (num = (Integer) map.get(str2)) != null) {
            return num.intValue();
        }
        return 1;
    }

    public final S j0(String str, U u4) {
        W();
        e0(str);
        C1289a0 k02 = k0(str);
        S s3 = S.UNINITIALIZED;
        if (k02 != null) {
            Iterator it = k02.romeo().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                com.google.android.gms.internal.measurement.X x4 = (com.google.android.gms.internal.measurement.X) it.next();
                if (h0(x4.oscar()) == u4) {
                    int november = x4.november() - 1;
                    if (november != 1) {
                        if (november == 2) {
                            return S.DENIED;
                        }
                    } else {
                        return S.GRANTED;
                    }
                }
            }
        }
        return s3;
    }

    public final C1289a0 k0(String str) {
        W();
        e0(str);
        C1314f0 l02 = l0(str);
        if (l02 != null && l02.blue()) {
            return l02.quebec();
        }
        return null;
    }

    public final C1314f0 l0(String str) {
        X();
        W();
        V5.x.echo(str);
        e0(str);
        return (C1314f0) this.f7496a.get(str);
    }

    public final String m0(String str) {
        W();
        e0(str);
        return (String) this.e.get(str);
    }

    public final boolean n0(String str, U u4) {
        W();
        e0(str);
        C1289a0 k02 = k0(str);
        if (k02 != null) {
            for (com.google.android.gms.internal.measurement.X x4 : k02.papa()) {
                if (u4 == h0(x4.oscar())) {
                    if (x4.november() == 2) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final boolean o0(String str, String str2) {
        Boolean bool;
        W();
        e0(str);
        if (!"ecommerce_purchase".equals(str2) && !"purchase".equals(str2) && !"refund".equals(str2)) {
            Map map = (Map) this.yellow.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    public final boolean p0(String str, String str2) {
        Boolean bool;
        W();
        e0(str);
        if (!"1".equals(d(str, "measurement.upload.blacklist_internal")) || !d1.Q0(str2)) {
            if ("1".equals(d(str, "measurement.upload.blacklist_public")) && d1.R0(str2)) {
                return true;
            }
            Map map = (Map) this.white.get(str);
            if (map != null && (bool = (Boolean) map.get(str2)) != null) {
                return bool.booleanValue();
            }
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0460, code lost:
    
        r9.X();
        r9.W();
        V5.x.echo(r32);
        r0 = r9.S0();
        r0.delete("property_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r26)});
        r0.delete("event_filters", "app_id=? and audience_id=?", new java.lang.String[]{r32, java.lang.String.valueOf(r26)});
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0483, code lost:
    
        r1 = r24;
        r3 = r25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x0342, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x0326, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x02d1, code lost:
    
        r0 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r0);
        r0 = r0.f7632b;
        r3 = com.google.android.gms.measurement.internal.ar.e0(r32);
        r4 = java.lang.Integer.valueOf(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x02e6, code lost:
    
        if (r14.amber() == false) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x02e8, code lost:
    
        r5 = java.lang.Integer.valueOf(r14.oscar());
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x02f5, code lost:
    
        r0.delta("Event filter had no event name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
        r26 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x02f4, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x0386, code lost:
    
        r26 = r7;
        r7 = r23.tango().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0394, code lost:
    
        if (r7.hasNext() == false) goto L203;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x0396, code lost:
    
        r8 = (com.google.android.gms.internal.measurement.V) r7.next();
        r9.X();
        r9.W();
        V5.x.echo(r32);
        V5.x.hotel(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x03b0, code lost:
    
        if (r8.quebec().isEmpty() == false) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:122:0x03dc, code lost:
    
        r14 = r8.charlie();
        r23 = r7;
        r7 = new android.content.ContentValues();
        r7.put(r3, r32);
        r27 = r3;
        r7.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x03f7, code lost:
    
        if (r8.victor() == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x03f9, code lost:
    
        r3 = java.lang.Integer.valueOf(r8.november());
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0403, code lost:
    
        r7.put(r0, r3);
        r28 = r0;
        r7.put("property_name", r8.quebec());
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0415, code lost:
    
        if (r8.whiskey() == false) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0417, code lost:
    
        r0 = java.lang.Boolean.valueOf(r8.uniform());
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x0421, code lost:
    
        r7.put("session_scoped", r0);
        r7.put(com.clevertap.android.sdk.db.Column.DATA, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:131:0x0433, code lost:
    
        if (r9.S0().insertWithOnConflict("property_filters", null, r7, 5) != (-1)) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:132:0x0448, code lost:
    
        r7 = r23;
        r3 = r27;
        r0 = r28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x0435, code lost:
    
        r0 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r0);
        r0.white.bravo(com.google.android.gms.measurement.internal.ar.e0(r32), "Failed to insert property filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0446, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x0450, code lost:
    
        r1 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r1);
        r1.white.charlie(com.google.android.gms.measurement.internal.ar.e0(r32), r0, "Error storing property filter. appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:138:0x0420, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x0402, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x03b2, code lost:
    
        r0 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r0);
        r0 = r0.f7632b;
        r3 = com.google.android.gms.measurement.internal.ar.e0(r32);
        r4 = java.lang.Integer.valueOf(r26);
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x03c7, code lost:
    
        if (r8.victor() == false) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x03c9, code lost:
    
        r5 = java.lang.Integer.valueOf(r8.november());
     */
    /* JADX WARN: Code restructure failed: missing block: B:144:0x03d3, code lost:
    
        r0.delta("Property filter had no property name. Audience definition ignored. appId, audienceId, filterId", r3, r4, java.lang.String.valueOf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x03d2, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0265, code lost:
    
        r8 = r0.tango().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0271, code lost:
    
        if (r8.hasNext() == false) goto L188;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x027d, code lost:
    
        if (((com.google.android.gms.internal.measurement.V) r8.next()).victor() != false) goto L196;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x027f, code lost:
    
        r0 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r0);
        r0.f7632b.charlie(com.google.android.gms.measurement.internal.ar.e0(r32), java.lang.Integer.valueOf(r7), "Property filter with no ID. Audience definition ignored. appId, audienceId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0295, code lost:
    
        r8 = r0.sierra().iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x02a1, code lost:
    
        r23 = r0;
        r0 = "filter_id";
        r24 = r1;
        r25 = r3;
        r3 = "app_id";
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x02b3, code lost:
    
        if (r8.hasNext() == false) goto L198;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x02b5, code lost:
    
        r14 = (com.google.android.gms.internal.measurement.N) r8.next();
        r9.X();
        r9.W();
        V5.x.echo(r32);
        V5.x.hotel(r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x02cf, code lost:
    
        if (r14.sierra().isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0300, code lost:
    
        r26 = r7;
        r7 = r14.charlie();
        r27 = r8;
        r8 = new android.content.ContentValues();
        r8.put("app_id", r32);
        r8.put("audience_id", java.lang.Integer.valueOf(r26));
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x031b, code lost:
    
        if (r14.amber() == false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x031d, code lost:
    
        r1 = java.lang.Integer.valueOf(r14.oscar());
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0327, code lost:
    
        r8.put("filter_id", r1);
        r8.put("event_name", r14.sierra());
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0337, code lost:
    
        if (r14.azure() == false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0339, code lost:
    
        r0 = java.lang.Boolean.valueOf(r14.yankee());
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0343, code lost:
    
        r8.put("session_scoped", r0);
        r8.put(com.clevertap.android.sdk.db.Column.DATA, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0355, code lost:
    
        if (r9.S0().insertWithOnConflict("event_filters", null, r8, 5) != (-1)) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0357, code lost:
    
        r0 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r0);
        r0.white.bravo(com.google.android.gms.measurement.internal.ar.e0(r32), "Failed to insert event filter (got -1). appId");
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0367, code lost:
    
        r0 = r23;
        r1 = r24;
        r3 = r25;
        r7 = r26;
        r8 = r27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x0373, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0374, code lost:
    
        r1 = r5.f7507b;
        com.google.android.gms.measurement.internal.G.foxtrot(r1);
        r1.white.charlie(com.google.android.gms.measurement.internal.ar.e0(r32), r0, "Error storing event filter. appId");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void q0(String str, byte[] bArr, String str2, String str3) {
        SQLiteDatabase sQLiteDatabase;
        Iterator it;
        G g2;
        G g5;
        byte[] bArr2;
        Integer num;
        boolean z2;
        G g10 = (G) this.alpha;
        X();
        W();
        V5.x.echo(str);
        C1309e0 c1309e0 = (C1309e0) c0(str, bArr).foxtrot();
        d0(str, c1309e0);
        f0(str, (C1314f0) c1309e0.echo());
        C1314f0 c1314f0 = (C1314f0) c1309e0.echo();
        bv.e eVar = this.f7496a;
        eVar.put(str, c1314f0);
        this.e.put(str, ((C1314f0) c1309e0.purple).whiskey());
        this.f7500f.put(str, str2);
        this.f7501g.put(str, str3);
        this.silver.put(str, g0((C1314f0) c1309e0.echo()));
        Z0 z02 = this.purple;
        C1450j c1450j = z02.red;
        Z0.cyan(c1450j);
        ArrayList arrayList = new ArrayList(Collections.unmodifiableList(((C1314f0) c1309e0.purple).xray()));
        int i4 = 0;
        while (i4 < arrayList.size()) {
            com.google.android.gms.internal.measurement.K k6 = (com.google.android.gms.internal.measurement.K) ((com.google.android.gms.internal.measurement.L) arrayList.get(i4)).foxtrot();
            bv.e eVar2 = eVar;
            if (((com.google.android.gms.internal.measurement.L) k6.purple).oscar() != 0) {
                int i5 = 0;
                while (i5 < ((com.google.android.gms.internal.measurement.L) k6.purple).oscar()) {
                    com.google.android.gms.internal.measurement.M m4 = (com.google.android.gms.internal.measurement.M) ((com.google.android.gms.internal.measurement.L) k6.purple).quebec(i5).foxtrot();
                    com.google.android.gms.internal.measurement.M m5 = (com.google.android.gms.internal.measurement.M) m4.clone();
                    Z0 z03 = z02;
                    G g11 = g10;
                    String delta = W.delta(((com.google.android.gms.internal.measurement.N) m4.purple).sierra(), W.alpha, W.charlie);
                    if (delta != null) {
                        m5.golf();
                        com.google.android.gms.internal.measurement.N.uniform((com.google.android.gms.internal.measurement.N) m5.purple, delta);
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    int i10 = 0;
                    while (i10 < ((com.google.android.gms.internal.measurement.N) m4.purple).november()) {
                        com.google.android.gms.internal.measurement.P quebec = ((com.google.android.gms.internal.measurement.N) m4.purple).quebec(i10);
                        boolean z10 = z2;
                        com.google.android.gms.internal.measurement.M m8 = m4;
                        String delta2 = W.delta(quebec.quebec(), W.echo, W.foxtrot);
                        if (delta2 != null) {
                            com.google.android.gms.internal.measurement.O o5 = (com.google.android.gms.internal.measurement.O) quebec.foxtrot();
                            o5.golf();
                            com.google.android.gms.internal.measurement.P.romeo((com.google.android.gms.internal.measurement.P) o5.purple, delta2);
                            com.google.android.gms.internal.measurement.P p4 = (com.google.android.gms.internal.measurement.P) o5.echo();
                            m5.golf();
                            com.google.android.gms.internal.measurement.N.victor((com.google.android.gms.internal.measurement.N) m5.purple, i10, p4);
                            z2 = true;
                        } else {
                            z2 = z10;
                        }
                        i10++;
                        m4 = m8;
                    }
                    if (z2) {
                        k6.golf();
                        com.google.android.gms.internal.measurement.L.uniform((com.google.android.gms.internal.measurement.L) k6.purple, i5, (com.google.android.gms.internal.measurement.N) m5.echo());
                        arrayList.set(i4, (com.google.android.gms.internal.measurement.L) k6.echo());
                    }
                    i5++;
                    z02 = z03;
                    g10 = g11;
                }
            }
            G g12 = g10;
            Z0 z04 = z02;
            if (((com.google.android.gms.internal.measurement.L) k6.purple).papa() != 0) {
                for (int i11 = 0; i11 < ((com.google.android.gms.internal.measurement.L) k6.purple).papa(); i11++) {
                    com.google.android.gms.internal.measurement.V romeo = ((com.google.android.gms.internal.measurement.L) k6.purple).romeo(i11);
                    String delta3 = W.delta(romeo.quebec(), W.india, W.juliet);
                    if (delta3 != null) {
                        com.google.android.gms.internal.measurement.U u4 = (com.google.android.gms.internal.measurement.U) romeo.foxtrot();
                        u4.golf();
                        com.google.android.gms.internal.measurement.V.romeo((com.google.android.gms.internal.measurement.V) u4.purple, delta3);
                        k6.golf();
                        com.google.android.gms.internal.measurement.L.victor((com.google.android.gms.internal.measurement.L) k6.purple, i11, (com.google.android.gms.internal.measurement.V) u4.echo());
                        arrayList.set(i4, (com.google.android.gms.internal.measurement.L) k6.echo());
                    }
                }
            }
            i4++;
            eVar = eVar2;
            z02 = z04;
            g10 = g12;
        }
        G g13 = g10;
        bv.e eVar3 = eVar;
        Z0 z05 = z02;
        c1450j.X();
        c1450j.W();
        V5.x.echo(str);
        SQLiteDatabase S02 = c1450j.S0();
        S02.beginTransaction();
        try {
            c1450j.X();
            c1450j.W();
            V5.x.echo(str);
            SQLiteDatabase S03 = c1450j.S0();
            S03.delete("property_filters", "app_id=?", new String[]{str});
            S03.delete("event_filters", "app_id=?", new String[]{str});
            it = arrayList.iterator();
        } catch (Throwable th) {
            th = th;
            sQLiteDatabase = S02;
        }
        while (true) {
            boolean hasNext = it.hasNext();
            g2 = (G) c1450j.alpha;
            if (!hasNext) {
                break;
            }
            com.google.android.gms.internal.measurement.L l10 = (com.google.android.gms.internal.measurement.L) it.next();
            c1450j.X();
            c1450j.W();
            V5.x.echo(str);
            V5.x.hotel(l10);
            if (!l10.whiskey()) {
                ar arVar = g2.f7507b;
                G.foxtrot(arVar);
                arVar.f7632b.bravo(ar.e0(str), "Audience with no ID. appId");
            } else {
                int november = l10.november();
                Iterator it2 = l10.sierra().iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((com.google.android.gms.internal.measurement.N) it2.next()).amber()) {
                        ar arVar2 = g2.f7507b;
                        G.foxtrot(arVar2);
                        arVar2.f7632b.charlie(ar.e0(str), Integer.valueOf(november), "Event filter with no ID. Audience definition ignored. appId, audienceId");
                        break;
                    }
                }
            }
            th = th;
            sQLiteDatabase.endTransaction();
            throw th;
        }
        sQLiteDatabase = S02;
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            com.google.android.gms.internal.measurement.L l11 = (com.google.android.gms.internal.measurement.L) it3.next();
            if (l11.whiskey()) {
                num = Integer.valueOf(l11.november());
            } else {
                num = null;
            }
            arrayList2.add(num);
        }
        V5.x.echo(str);
        c1450j.X();
        c1450j.W();
        SQLiteDatabase S04 = c1450j.S0();
        try {
            long N02 = c1450j.N0("select count(1) from audience_filter_values where app_id=?", new String[]{str});
            int max = Math.max(0, Math.min(2000, g2.yellow.c0(str, ac.maroon)));
            if (N02 > max) {
                ArrayList arrayList3 = new ArrayList();
                int i12 = 0;
                while (true) {
                    if (i12 < arrayList2.size()) {
                        Integer num2 = (Integer) arrayList2.get(i12);
                        if (num2 == null) {
                            break;
                        }
                        arrayList3.add(Integer.toString(num2.intValue()));
                        i12++;
                    } else {
                        S04.delete("audience_filter_values", "audience_id in (select audience_id from audience_filter_values where app_id=? and audience_id not in " + ("(" + TextUtils.join(Constants.SEPARATOR_COMMA, arrayList3) + ")") + " order by rowid desc limit -1 offset ?)", new String[]{str, Integer.toString(max)});
                        break;
                    }
                }
            }
        } catch (SQLiteException e) {
            ar arVar3 = g2.f7507b;
            G.foxtrot(arVar3);
            arVar3.white.charlie(ar.e0(str), e, "Database error querying filters. appId");
        }
        sQLiteDatabase.setTransactionSuccessful();
        sQLiteDatabase.endTransaction();
        try {
            c1309e0.golf();
            C1314f0.azure((C1314f0) c1309e0.purple);
            bArr2 = ((C1314f0) c1309e0.echo()).charlie();
            g5 = g13;
        } catch (RuntimeException e4) {
            g5 = g13;
            ar arVar4 = g5.f7507b;
            G.foxtrot(arVar4);
            arVar4.f7632b.charlie(ar.e0(str), e4, "Unable to serialize reduced-size config. Storing full config instead. appId");
            bArr2 = bArr;
        }
        C1450j c1450j2 = z05.red;
        Z0.cyan(c1450j2);
        G g14 = (G) c1450j2.alpha;
        V5.x.echo(str);
        c1450j2.W();
        c1450j2.X();
        ContentValues contentValues = new ContentValues();
        contentValues.put("remote_config", bArr2);
        contentValues.put("config_last_modified_time", str2);
        contentValues.put("e_tag", str3);
        try {
            if (c1450j2.S0().update("apps", contentValues, "app_id = ?", new String[]{str}) == 0) {
                ar arVar5 = g14.f7507b;
                G.foxtrot(arVar5);
                arVar5.white.bravo(ar.e0(str), "Failed to update remote config (got 0). appId");
            }
        } catch (SQLiteException e5) {
            ar arVar6 = g14.f7507b;
            G.foxtrot(arVar6);
            arVar6.white.charlie(ar.e0(str), e5, "Error storing remote config. appId");
        }
        if (g5.yellow.j0(null, ac.f7597g0)) {
            c1309e0.golf();
            C1314f0.beige((C1314f0) c1309e0.purple);
        }
        eVar3.put(str, (C1314f0) c1309e0.echo());
    }
}
