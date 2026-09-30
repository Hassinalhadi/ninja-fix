package com.google.android.gms.measurement.internal;

import android.util.Log;
import com.google.android.gms.internal.measurement.AbstractC1392x1;
import com.google.android.gms.internal.measurement.C1383v0;
import com.google.android.gms.internal.measurement.C1395y0;
import com.google.android.gms.internal.measurement.E2;
import com.google.maps.android.BuildConfig;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Iterator;

/* renamed from: com.google.android.gms.measurement.internal.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1434b extends Y1.ab {
    public final /* synthetic */ int golf;
    public final /* synthetic */ C1436c hotel;
    public final AbstractC1392x1 india;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C1434b(C1436c c1436c, String str, int i4, AbstractC1392x1 abstractC1392x1, int i5) {
        super(str, i4);
        this.golf = i5;
        this.hotel = c1436c;
        this.india = abstractC1392x1;
    }

    @Override // Y1.ab
    public final int delta() {
        switch (this.golf) {
            case 0:
                return ((com.google.android.gms.internal.measurement.N) this.india).oscar();
            default:
                return ((com.google.android.gms.internal.measurement.V) this.india).november();
        }
    }

    @Override // Y1.ab
    public final boolean echo() {
        switch (this.golf) {
            case 0:
                return ((com.google.android.gms.internal.measurement.N) this.india).zulu();
            default:
                return false;
        }
    }

    @Override // Y1.ab
    public final boolean foxtrot() {
        switch (this.golf) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:197:0x02b1, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x0292, code lost:
    
        r16 = r3;
        r17 = r4;
     */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x03c8 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x03c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean kilo(Long l10, Long l11, C1383v0 c1383v0, long j5, C1460o c1460o, boolean z2) {
        long j6;
        Integer num;
        boolean z10;
        boolean z11;
        com.google.android.gms.internal.measurement.N n5;
        boolean z12;
        Boolean bool;
        boolean z13;
        Boolean bool2;
        Boolean golf;
        Long l12;
        Double d4;
        Object obj;
        Integer num2;
        Integer num3;
        E2.alpha();
        C1436c c1436c = this.hotel;
        G g2 = (G) c1436c.alpha;
        C1440e c1440e = g2.yellow;
        ab abVar = ac.f7618x;
        String str = this.alpha;
        boolean j02 = c1440e.j0(str, abVar);
        com.google.android.gms.internal.measurement.N n10 = (com.google.android.gms.internal.measurement.N) this.india;
        if (n10.yankee()) {
            j6 = c1460o.echo;
        } else {
            j6 = j5;
        }
        ar arVar = g2.f7507b;
        G.foxtrot(arVar);
        boolean isLoggable = Log.isLoggable(arVar.h0(), 2);
        boolean z14 = false;
        a4.j jVar = arVar.f7636g;
        int i4 = this.bravo;
        am amVar = g2.f7510f;
        if (isLoggable) {
            G.foxtrot(arVar);
            Integer valueOf = Integer.valueOf(i4);
            if (n10.amber()) {
                num3 = Integer.valueOf(n10.oscar());
            } else {
                num3 = null;
            }
            jVar.delta("Evaluating filter. audience, filter, event", valueOf, num3, amVar.delta(n10.sierra()));
            G.foxtrot(arVar);
            au auVar = c1436c.purple.yellow;
            Z0.cyan(auVar);
            StringBuilder sb2 = new StringBuilder();
            sb2.append("\nevent_filter {\n");
            if (n10.amber()) {
                au.o0(sb2, 0, "filter_id", Integer.valueOf(n10.oscar()));
            }
            au.o0(sb2, 0, "event_name", ((G) auVar.alpha).f7510f.delta(n10.sierra()));
            String l02 = au.l0(n10.whiskey(), n10.xray(), n10.yankee());
            if (!l02.isEmpty()) {
                au.o0(sb2, 0, "filter_type", l02);
            }
            if (n10.zulu()) {
                au.p0(sb2, 1, "event_count_filter", n10.romeo());
            }
            if (n10.november() > 0) {
                sb2.append("  filters {\n");
                Iterator it = n10.tango().iterator();
                while (it.hasNext()) {
                    auVar.i0(sb2, 2, (com.google.android.gms.internal.measurement.P) it.next());
                }
            }
            au.j0(1, sb2);
            sb2.append("}\n}\n");
            jVar.bravo(sb2.toString(), "Filter definition");
        }
        boolean amber = n10.amber();
        a4.j jVar2 = arVar.f7632b;
        if (amber && n10.oscar() <= 256) {
            boolean whiskey = n10.whiskey();
            boolean xray = n10.xray();
            boolean yankee = n10.yankee();
            if (whiskey || xray || yankee) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z2 && !z10) {
                G.foxtrot(arVar);
                Integer valueOf2 = Integer.valueOf(i4);
                if (n10.amber()) {
                    num2 = Integer.valueOf(n10.oscar());
                } else {
                    num2 = null;
                }
                jVar.charlie(valueOf2, num2, "Event filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
                return true;
            }
            String tango = c1383v0.tango();
            if (n10.zulu()) {
                Boolean india = Y1.ab.india(j6, n10.romeo());
                if (india != null) {
                    if (!india.booleanValue()) {
                        bool = Boolean.FALSE;
                        z11 = j02;
                        n5 = n10;
                        z12 = false;
                        G.foxtrot(arVar);
                        if (bool == null) {
                            obj = BuildConfig.TRAVIS;
                        } else {
                            obj = bool;
                        }
                        jVar.bravo(obj, "Event filter result");
                        if (bool == null) {
                            return z12;
                        }
                        Boolean bool3 = Boolean.TRUE;
                        this.charlie = bool3;
                        if (!bool.booleanValue()) {
                            return true;
                        }
                        this.delta = bool3;
                        if (!z10 || !c1383v0.bronze()) {
                            return true;
                        }
                        Long valueOf3 = Long.valueOf(c1383v0.quebec());
                        if (n5.xray()) {
                            if (z11 && n5.zulu()) {
                                valueOf3 = l10;
                            }
                            this.foxtrot = valueOf3;
                            return true;
                        }
                        if (z11 && n5.zulu()) {
                            valueOf3 = l11;
                        }
                        this.echo = valueOf3;
                        return true;
                    }
                }
                z11 = j02;
                n5 = n10;
                z12 = z14;
                bool = null;
                G.foxtrot(arVar);
                if (bool == null) {
                }
                jVar.bravo(obj, "Event filter result");
                if (bool == null) {
                }
            }
            HashSet hashSet = new HashSet();
            Iterator it2 = n10.tango().iterator();
            while (true) {
                if (it2.hasNext()) {
                    com.google.android.gms.internal.measurement.P p4 = (com.google.android.gms.internal.measurement.P) it2.next();
                    if (p4.quebec().isEmpty()) {
                        G.foxtrot(arVar);
                        jVar2.bravo(amVar.delta(tango), "null or empty param name in filter. event");
                        break;
                    }
                    hashSet.add(p4.quebec());
                } else {
                    bv.aw awVar = new bv.aw(0);
                    Iterator it3 = c1383v0.uniform().iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C1395y0 c1395y0 = (C1395y0) it3.next();
                            if (hashSet.contains(c1395y0.sierra())) {
                                if (c1395y0.crimson()) {
                                    String sierra = c1395y0.sierra();
                                    if (c1395y0.crimson()) {
                                        l12 = Long.valueOf(c1395y0.quebec());
                                    } else {
                                        l12 = null;
                                    }
                                    awVar.put(sierra, l12);
                                } else if (c1395y0.bronze()) {
                                    String sierra2 = c1395y0.sierra();
                                    if (c1395y0.bronze()) {
                                        d4 = Double.valueOf(c1395y0.november());
                                    } else {
                                        d4 = null;
                                    }
                                    awVar.put(sierra2, d4);
                                } else if (c1395y0.emerald()) {
                                    awVar.put(c1395y0.sierra(), c1395y0.tango());
                                } else {
                                    G.foxtrot(arVar);
                                    jVar2.charlie(amVar.delta(tango), amVar.echo(c1395y0.sierra()), "Unknown value for param. event, param");
                                    break;
                                }
                            }
                        } else {
                            Iterator it4 = n10.tango().iterator();
                            while (true) {
                                if (it4.hasNext()) {
                                    com.google.android.gms.internal.measurement.P p5 = (com.google.android.gms.internal.measurement.P) it4.next();
                                    if (p5.tango() && p5.sierra()) {
                                        z13 = true;
                                    } else {
                                        z13 = z14;
                                    }
                                    String quebec = p5.quebec();
                                    if (quebec.isEmpty()) {
                                        G.foxtrot(arVar);
                                        jVar2.bravo(amVar.delta(tango), "Event has empty param name. event");
                                        break;
                                    }
                                    Object obj2 = awVar.get(quebec);
                                    z12 = z14;
                                    if (obj2 instanceof Long) {
                                        if (!p5.uniform()) {
                                            G.foxtrot(arVar);
                                            jVar2.charlie(amVar.delta(tango), amVar.echo(quebec), "No number filter for long param. event, param");
                                            break;
                                        }
                                        Boolean india2 = Y1.ab.india(((Long) obj2).longValue(), p5.oscar());
                                        if (india2 == null) {
                                            break;
                                        }
                                        if (india2.booleanValue() == z13) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        z14 = z12;
                                    } else if (obj2 instanceof Double) {
                                        if (!p5.uniform()) {
                                            G.foxtrot(arVar);
                                            jVar2.charlie(amVar.delta(tango), amVar.echo(quebec), "No number filter for double param. event, param");
                                            break;
                                        }
                                        double doubleValue = ((Double) obj2).doubleValue();
                                        try {
                                            bool2 = Y1.ab.golf(new BigDecimal(doubleValue), p5.oscar(), Math.ulp(doubleValue));
                                        } catch (NumberFormatException unused) {
                                            bool2 = null;
                                        }
                                        if (bool2 == null) {
                                            break;
                                        }
                                        if (bool2.booleanValue() == z13) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        z14 = z12;
                                    } else if (obj2 instanceof String) {
                                        if (p5.whiskey()) {
                                            com.google.android.gms.internal.measurement.W papa = p5.papa();
                                            G.foxtrot(arVar);
                                            golf = Y1.ab.hotel((String) obj2, papa, arVar);
                                            z11 = j02;
                                            n5 = n10;
                                        } else if (p5.uniform()) {
                                            String str2 = (String) obj2;
                                            if (au.a0(str2)) {
                                                com.google.android.gms.internal.measurement.T oscar = p5.oscar();
                                                if (au.a0(str2)) {
                                                    try {
                                                        z11 = j02;
                                                        n5 = n10;
                                                        try {
                                                            golf = Y1.ab.golf(new BigDecimal(str2), oscar, 0.0d);
                                                        } catch (NumberFormatException unused2) {
                                                        }
                                                    } catch (NumberFormatException unused3) {
                                                    }
                                                }
                                                z11 = j02;
                                                n5 = n10;
                                                golf = null;
                                            } else {
                                                z11 = j02;
                                                n5 = n10;
                                                G.foxtrot(arVar);
                                                jVar2.charlie(amVar.delta(tango), amVar.echo(quebec), "Invalid param value for number filter. event, param");
                                                break;
                                            }
                                        } else {
                                            z11 = j02;
                                            n5 = n10;
                                            G.foxtrot(arVar);
                                            jVar2.charlie(amVar.delta(tango), amVar.echo(quebec), "No filter for String param. event, param");
                                            break;
                                        }
                                        if (golf == null) {
                                            break;
                                        }
                                        if (golf.booleanValue() == z13) {
                                            bool = Boolean.FALSE;
                                            break;
                                        }
                                        z14 = z12;
                                        j02 = z11;
                                        n10 = n5;
                                    } else {
                                        z11 = j02;
                                        n5 = n10;
                                        if (obj2 == null) {
                                            G.foxtrot(arVar);
                                            jVar.charlie(amVar.delta(tango), amVar.echo(quebec), "Missing param for filter. event, param");
                                            bool = Boolean.FALSE;
                                        } else {
                                            G.foxtrot(arVar);
                                            jVar2.charlie(amVar.delta(tango), amVar.echo(quebec), "Unknown param type. event, param");
                                        }
                                    }
                                } else {
                                    z11 = j02;
                                    n5 = n10;
                                    z12 = z14;
                                    bool = Boolean.TRUE;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            G.foxtrot(arVar);
            if (bool == null) {
            }
            jVar.bravo(obj, "Event filter result");
            if (bool == null) {
            }
        } else {
            G.foxtrot(arVar);
            aq e02 = ar.e0(str);
            if (n10.amber()) {
                num = Integer.valueOf(n10.oscar());
            } else {
                num = null;
            }
            jVar2.charlie(e02, String.valueOf(num), "Invalid event filter ID. appId, id");
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean lima(Long l10, Long l11, com.google.android.gms.internal.measurement.M0 m02, boolean z2) {
        Object[] objArr;
        Object obj;
        E2.alpha();
        G g2 = (G) this.hotel.alpha;
        boolean j02 = g2.yellow.j0(this.alpha, ac.f7616v);
        com.google.android.gms.internal.measurement.V v4 = (com.google.android.gms.internal.measurement.V) this.india;
        boolean sierra = v4.sierra();
        boolean tango = v4.tango();
        boolean uniform = v4.uniform();
        if (sierra || tango || uniform) {
            objArr = true;
        } else {
            objArr = false;
        }
        Boolean bool = null;
        Boolean bool2 = null;
        Boolean bool3 = null;
        Integer num = null;
        bool = null;
        bool = null;
        bool = null;
        bool = null;
        ar arVar = g2.f7507b;
        if (z2 && objArr == false) {
            G.foxtrot(arVar);
            Integer valueOf = Integer.valueOf(this.bravo);
            if (v4.victor()) {
                num = Integer.valueOf(v4.november());
            }
            arVar.f7636g.charlie(valueOf, num, "Property filter already evaluated true and it is not associated with an enhanced audience. audience ID, filter ID");
            return true;
        }
        com.google.android.gms.internal.measurement.P oscar = v4.oscar();
        boolean sierra2 = oscar.sierra();
        boolean blue = m02.blue();
        am amVar = g2.f7510f;
        if (blue) {
            if (!oscar.uniform()) {
                G.foxtrot(arVar);
                arVar.f7632b.bravo(amVar.foxtrot(m02.sierra()), "No number filter for long property. property");
            } else {
                bool = Y1.ab.juliet(Y1.ab.india(m02.papa(), oscar.oscar()), sierra2);
            }
        } else if (m02.beige()) {
            if (!oscar.uniform()) {
                G.foxtrot(arVar);
                arVar.f7632b.bravo(amVar.foxtrot(m02.sierra()), "No number filter for double property. property");
            } else {
                double november = m02.november();
                try {
                    bool3 = Y1.ab.golf(new BigDecimal(november), oscar.oscar(), Math.ulp(november));
                } catch (NumberFormatException unused) {
                }
                bool = Y1.ab.juliet(bool3, sierra2);
            }
        } else if (m02.coral()) {
            if (!oscar.whiskey()) {
                if (!oscar.uniform()) {
                    G.foxtrot(arVar);
                    arVar.f7632b.bravo(amVar.foxtrot(m02.sierra()), "No string or number filter defined. property");
                } else if (au.a0(m02.tango())) {
                    String tango2 = m02.tango();
                    com.google.android.gms.internal.measurement.T oscar2 = oscar.oscar();
                    if (au.a0(tango2)) {
                        try {
                            bool2 = Y1.ab.golf(new BigDecimal(tango2), oscar2, 0.0d);
                        } catch (NumberFormatException unused2) {
                        }
                    }
                    bool = Y1.ab.juliet(bool2, sierra2);
                } else {
                    G.foxtrot(arVar);
                    arVar.f7632b.charlie(amVar.foxtrot(m02.sierra()), m02.tango(), "Invalid user property value for Numeric number filter. property, value");
                }
            } else {
                String tango3 = m02.tango();
                com.google.android.gms.internal.measurement.W papa = oscar.papa();
                G.foxtrot(arVar);
                bool = Y1.ab.juliet(Y1.ab.hotel(tango3, papa, arVar), sierra2);
            }
        } else {
            G.foxtrot(arVar);
            arVar.f7632b.bravo(amVar.foxtrot(m02.sierra()), "User property has no value, property");
        }
        G.foxtrot(arVar);
        if (bool == null) {
            obj = BuildConfig.TRAVIS;
        } else {
            obj = bool;
        }
        arVar.f7636g.bravo(obj, "Property filter result");
        if (bool == null) {
            return false;
        }
        this.charlie = Boolean.TRUE;
        if (!uniform || bool.booleanValue()) {
            if (!z2 || v4.sierra()) {
                this.delta = bool;
            }
            if (bool.booleanValue() && objArr != false && m02.bronze()) {
                long quebec = m02.quebec();
                if (l10 != null) {
                    quebec = l10.longValue();
                }
                if (j02 && v4.sierra() && !v4.tango() && l11 != null) {
                    quebec = l11.longValue();
                }
                if (v4.tango()) {
                    this.foxtrot = Long.valueOf(quebec);
                } else {
                    this.echo = Long.valueOf(quebec);
                }
            }
        }
        return true;
    }
}
