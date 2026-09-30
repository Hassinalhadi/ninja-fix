package S7;

import A0.z;
import R7.B;
import R7.C;
import R7.C0268a;
import R7.C0269b;
import R7.C0270c;
import R7.C0271d;
import R7.C0272e;
import R7.C0273f;
import R7.C0274g;
import R7.C0275h;
import R7.C0276i;
import R7.C0277j;
import R7.C0278k;
import R7.C0279l;
import R7.C0280m;
import R7.C0281n;
import R7.C0282o;
import R7.C0283p;
import R7.C0284q;
import R7.C0285s;
import R7.C0286t;
import R7.C0287u;
import R7.C0288v;
import R7.C0289w;
import R7.C0290x;
import R7.C0291y;
import R7.C0292z;
import R7.E;
import R7.F;
import R7.G;
import R7.I;
import R7.J;
import R7.O;
import R7.P;
import R7.Q;
import R7.S;
import R7.T;
import R7.U;
import R7.V;
import R7.W;
import R7.X;
import R7.Y;
import R7.Z;
import R7.a0;
import R7.ab;
import R7.ad;
import R7.ae;
import R7.af;
import R7.ag;
import R7.ah;
import R7.aj;
import R7.ak;
import R7.al;
import R7.an;
import R7.ap;
import R7.aq;
import R7.ar;
import R7.as;
import R7.at;
import R7.au;
import R7.av;
import R7.ax;
import R7.az;
import R7.b0;
import R7.c0;
import R7.d0;
import R7.e0;
import R7.f0;
import R7.g0;
import R7.h0;
import R7.i0;
import R7.j0;
import R7.k0;
import R7.l0;
import R7.m0;
import R7.n0;
import R7.o0;
import R7.r;
import android.util.Base64;
import android.util.JsonReader;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.network.api.CtApi;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import com.google.android.material.internal.s;
import d8.d;
import java.io.IOException;
import java.io.StringReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes2.dex */
public final class c {
    public static final s alpha;

    static {
        d dVar = new d();
        C0271d c0271d = C0271d.alpha;
        dVar.alpha(o0.class, c0271d);
        dVar.alpha(ab.class, c0271d);
        C0277j c0277j = C0277j.alpha;
        dVar.alpha(n0.class, c0277j);
        dVar.alpha(aj.class, c0277j);
        C0274g c0274g = C0274g.alpha;
        dVar.alpha(V.class, c0274g);
        dVar.alpha(ak.class, c0274g);
        C0275h c0275h = C0275h.alpha;
        dVar.alpha(U.class, c0275h);
        dVar.alpha(al.class, c0275h);
        C0292z c0292z = C0292z.alpha;
        dVar.alpha(m0.class, c0292z);
        dVar.alpha(J.class, c0292z);
        C0291y c0291y = C0291y.alpha;
        dVar.alpha(l0.class, c0291y);
        dVar.alpha(I.class, c0291y);
        C0276i c0276i = C0276i.alpha;
        dVar.alpha(W.class, c0276i);
        dVar.alpha(an.class, c0276i);
        C0286t c0286t = C0286t.alpha;
        dVar.alpha(k0.class, c0286t);
        dVar.alpha(ap.class, c0286t);
        C0278k c0278k = C0278k.alpha;
        dVar.alpha(e0.class, c0278k);
        dVar.alpha(aq.class, c0278k);
        C0280m c0280m = C0280m.alpha;
        dVar.alpha(c0.class, c0280m);
        dVar.alpha(ar.class, c0280m);
        C0283p c0283p = C0283p.alpha;
        dVar.alpha(b0.class, c0283p);
        dVar.alpha(av.class, c0283p);
        C0284q c0284q = C0284q.alpha;
        dVar.alpha(a0.class, c0284q);
        dVar.alpha(ax.class, c0284q);
        C0281n c0281n = C0281n.alpha;
        dVar.alpha(Y.class, c0281n);
        dVar.alpha(at.class, c0281n);
        C0269b c0269b = C0269b.alpha;
        dVar.alpha(P.class, c0269b);
        dVar.alpha(ad.class, c0269b);
        C0268a c0268a = C0268a.alpha;
        dVar.alpha(O.class, c0268a);
        dVar.alpha(ae.class, c0268a);
        C0282o c0282o = C0282o.alpha;
        dVar.alpha(Z.class, c0282o);
        dVar.alpha(au.class, c0282o);
        C0279l c0279l = C0279l.alpha;
        dVar.alpha(X.class, c0279l);
        dVar.alpha(as.class, c0279l);
        C0270c c0270c = C0270c.alpha;
        dVar.alpha(Q.class, c0270c);
        dVar.alpha(af.class, c0270c);
        r rVar = r.alpha;
        dVar.alpha(d0.class, rVar);
        dVar.alpha(az.class, rVar);
        C0285s c0285s = C0285s.alpha;
        dVar.alpha(f0.class, c0285s);
        dVar.alpha(B.class, c0285s);
        C0287u c0287u = C0287u.alpha;
        dVar.alpha(g0.class, c0287u);
        dVar.alpha(C.class, c0287u);
        C0290x c0290x = C0290x.alpha;
        dVar.alpha(j0.class, c0290x);
        dVar.alpha(G.class, c0290x);
        C0288v c0288v = C0288v.alpha;
        dVar.alpha(i0.class, c0288v);
        dVar.alpha(E.class, c0288v);
        C0289w c0289w = C0289w.alpha;
        dVar.alpha(h0.class, c0289w);
        dVar.alpha(F.class, c0289w);
        C0272e c0272e = C0272e.alpha;
        dVar.alpha(T.class, c0272e);
        dVar.alpha(ag.class, c0272e);
        C0273f c0273f = C0273f.alpha;
        dVar.alpha(S.class, c0273f);
        dVar.alpha(ah.class, c0273f);
        dVar.silver = true;
        alpha = new s(5, dVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0072 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x007f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x005a A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r3v0, types: [R7.aw, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ax alpha(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1019779949:
                    if (nextName.equals("offset")) {
                        c3 = 0;
                    }
                    switch (c3) {
                        case 0:
                            obj.delta = jsonReader.nextLong();
                            obj.foxtrot = (byte) (obj.foxtrot | 2);
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.bravo = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null symbol");
                            }
                        case 2:
                            obj.alpha = jsonReader.nextLong();
                            obj.foxtrot = (byte) (obj.foxtrot | 1);
                            break;
                        case 3:
                            obj.charlie = jsonReader.nextString();
                            break;
                        case 4:
                            obj.echo = jsonReader.nextInt();
                            obj.foxtrot = (byte) (obj.foxtrot | 4);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case -887523944:
                    if (nextName.equals("symbol")) {
                        c3 = 1;
                    }
                    switch (c3) {
                    }
                    break;
                case 3571:
                    if (nextName.equals("pc")) {
                        c3 = 2;
                    }
                    switch (c3) {
                    }
                    break;
                case 3143036:
                    if (nextName.equals(CTVariableUtils.FILE)) {
                        c3 = 3;
                    }
                    switch (c3) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 4;
                    }
                    switch (c3) {
                    }
                    break;
                default:
                    switch (c3) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    public static af bravo(JsonReader jsonReader) {
        jsonReader.beginObject();
        String str = null;
        String str2 = null;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            if (!nextName.equals(Constants.KEY_KEY)) {
                if (!nextName.equals("value")) {
                    jsonReader.skipValue();
                } else {
                    str2 = jsonReader.nextString();
                    if (str2 == null) {
                        throw new NullPointerException("Null value");
                    }
                }
            } else {
                str = jsonReader.nextString();
                if (str == null) {
                    throw new NullPointerException("Null key");
                }
            }
        }
        jsonReader.endObject();
        if (str != null && str2 != null) {
            return new af(str, str2);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" key");
        }
        if (str2 == null) {
            sb2.append(" value");
        }
        throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f2 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0100 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x008b A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r4v0, types: [R7.ac, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ad charlie(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1516200806:
                    if (nextName.equals("buildIdMappingForArch")) {
                        c3 = 0;
                    }
                    switch (c3) {
                        case 0:
                            obj.india = delta(jsonReader, new A8.a(27));
                            break;
                        case 1:
                            obj.alpha = jsonReader.nextInt();
                            obj.juliet = (byte) (obj.juliet | 1);
                            break;
                        case 2:
                            obj.echo = jsonReader.nextLong();
                            obj.juliet = (byte) (obj.juliet | 8);
                            break;
                        case 3:
                            obj.foxtrot = jsonReader.nextLong();
                            obj.juliet = (byte) (obj.juliet | 16);
                            break;
                        case 4:
                            obj.golf = jsonReader.nextLong();
                            obj.juliet = (byte) (obj.juliet | 32);
                            break;
                        case 5:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.bravo = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null processName");
                            }
                        case 6:
                            obj.charlie = jsonReader.nextInt();
                            obj.juliet = (byte) (obj.juliet | 2);
                            break;
                        case 7:
                            obj.hotel = jsonReader.nextString();
                            break;
                        case '\b':
                            obj.delta = jsonReader.nextInt();
                            obj.juliet = (byte) (obj.juliet | 4);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case 110987:
                    if (nextName.equals("pid")) {
                        c3 = 1;
                    }
                    switch (c3) {
                    }
                    break;
                case 111312:
                    if (nextName.equals("pss")) {
                        c3 = 2;
                    }
                    switch (c3) {
                    }
                    break;
                case 113234:
                    if (nextName.equals("rss")) {
                        c3 = 3;
                    }
                    switch (c3) {
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 4;
                    }
                    switch (c3) {
                    }
                    break;
                case 202325402:
                    if (nextName.equals("processName")) {
                        c3 = 5;
                    }
                    switch (c3) {
                    }
                    break;
                case 722137681:
                    if (nextName.equals("reasonCode")) {
                        c3 = 6;
                    }
                    switch (c3) {
                    }
                    break;
                case 723857505:
                    if (nextName.equals("traceFile")) {
                        c3 = 7;
                    }
                    switch (c3) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = '\b';
                    }
                    switch (c3) {
                    }
                    break;
                default:
                    switch (c3) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    public static List delta(JsonReader jsonReader, b bVar) {
        ArrayList arrayList = new ArrayList();
        jsonReader.beginArray();
        while (jsonReader.hasNext()) {
            arrayList.add(bVar.alpha(jsonReader));
        }
        jsonReader.endArray();
        return Collections.unmodifiableList(arrayList);
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:15:0x013d. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:23:0x01e8. Please report as an issue. */
    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x0063. Please report as an issue. */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, S7.b] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, R7.A] */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.lang.Object, R7.ao] */
    public static ap echo(JsonReader jsonReader) {
        char c3;
        char c4;
        char c10;
        char c11;
        char c12;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -1335157162:
                    if (nextName.equals("device")) {
                        c3 = 0;
                        break;
                    }
                    break;
                case -259312414:
                    if (nextName.equals("rollouts")) {
                        c3 = 1;
                        break;
                    }
                    break;
                case 96801:
                    if (nextName.equals("app")) {
                        c3 = 2;
                        break;
                    }
                    break;
                case 107332:
                    if (nextName.equals("log")) {
                        c3 = 3;
                        break;
                    }
                    break;
                case 3575610:
                    if (nextName.equals(Constants.KEY_TYPE)) {
                        c3 = 4;
                        break;
                    }
                    break;
                case 55126294:
                    if (nextName.equals("timestamp")) {
                        c3 = 5;
                        break;
                    }
                    break;
            }
            c3 = 65535;
            switch (c3) {
                case 0:
                    ?? obj2 = new Object();
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        switch (nextName2.hashCode()) {
                            case -1708606089:
                                if (nextName2.equals("batteryLevel")) {
                                    c4 = 0;
                                    break;
                                }
                                break;
                            case -1455558134:
                                if (nextName2.equals("batteryVelocity")) {
                                    c4 = 1;
                                    break;
                                }
                                break;
                            case -1439500848:
                                if (nextName2.equals(Constants.KEY_ORIENTATION)) {
                                    c4 = 2;
                                    break;
                                }
                                break;
                            case 279795450:
                                if (nextName2.equals("diskUsed")) {
                                    c4 = 3;
                                    break;
                                }
                                break;
                            case 976541947:
                                if (nextName2.equals("ramUsed")) {
                                    c4 = 4;
                                    break;
                                }
                                break;
                            case 1516795582:
                                if (nextName2.equals("proximityOn")) {
                                    c4 = 5;
                                    break;
                                }
                                break;
                        }
                        c4 = 65535;
                        switch (c4) {
                            case 0:
                                obj2.alpha = Double.valueOf(jsonReader.nextDouble());
                                break;
                            case 1:
                                obj2.bravo = jsonReader.nextInt();
                                obj2.golf = (byte) (obj2.golf | 1);
                                break;
                            case 2:
                                obj2.delta = jsonReader.nextInt();
                                obj2.golf = (byte) (obj2.golf | 4);
                                break;
                            case 3:
                                obj2.foxtrot = jsonReader.nextLong();
                                obj2.golf = (byte) (obj2.golf | 16);
                                break;
                            case 4:
                                obj2.echo = jsonReader.nextLong();
                                obj2.golf = (byte) (obj2.golf | 8);
                                break;
                            case 5:
                                obj2.charlie = jsonReader.nextBoolean();
                                obj2.golf = (byte) (obj2.golf | 2);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.delta = obj2.alpha();
                case 1:
                    jsonReader.beginObject();
                    List list = null;
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        if (!nextName3.equals("assignments")) {
                            jsonReader.skipValue();
                        } else {
                            List delta = delta(jsonReader, new Object());
                            if (delta != null) {
                                list = delta;
                            } else {
                                throw new NullPointerException("Null rolloutAssignments");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.foxtrot = new G(list);
                    } else {
                        throw new IllegalStateException("Missing required properties: rolloutAssignments");
                    }
                case 2:
                    jsonReader.beginObject();
                    byte b2 = 0;
                    int i4 = 0;
                    ar arVar = null;
                    List list2 = null;
                    List list3 = null;
                    Boolean bool = null;
                    az azVar = null;
                    List list4 = null;
                    while (jsonReader.hasNext()) {
                        String nextName4 = jsonReader.nextName();
                        nextName4.getClass();
                        switch (nextName4.hashCode()) {
                            case -1405314732:
                                if (nextName4.equals("appProcessDetails")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1332194002:
                                if (nextName4.equals("background")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1090974952:
                                if (nextName4.equals("execution")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -80231855:
                                if (nextName4.equals("internalKeys")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case 555169704:
                                if (nextName4.equals("customAttributes")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case 928737948:
                                if (nextName4.equals("uiOrientation")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 1847730860:
                                if (nextName4.equals("currentProcessDetails")) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(golf(jsonReader));
                                }
                                jsonReader.endArray();
                                list4 = Collections.unmodifiableList(arrayList);
                            case 1:
                                bool = Boolean.valueOf(jsonReader.nextBoolean());
                            case 2:
                                jsonReader.beginObject();
                                List list5 = null;
                                at atVar = null;
                                ad adVar = null;
                                au auVar = null;
                                List list6 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -1375141843:
                                            if (nextName5.equals("appExitInfo")) {
                                                c11 = 0;
                                                break;
                                            }
                                            break;
                                        case -1337936983:
                                            if (nextName5.equals("threads")) {
                                                c11 = 1;
                                                break;
                                            }
                                            break;
                                        case -902467928:
                                            if (nextName5.equals("signal")) {
                                                c11 = 2;
                                                break;
                                            }
                                            break;
                                        case 937615455:
                                            if (nextName5.equals("binaries")) {
                                                c11 = 3;
                                                break;
                                            }
                                            break;
                                        case 1481625679:
                                            if (nextName5.equals("exception")) {
                                                c11 = 4;
                                                break;
                                            }
                                            break;
                                    }
                                    c11 = 65535;
                                    switch (c11) {
                                        case 0:
                                            adVar = charlie(jsonReader);
                                        case 1:
                                            list5 = delta(jsonReader, new a(0));
                                        case 2:
                                            jsonReader.beginObject();
                                            long j5 = 0;
                                            byte b4 = 0;
                                            String str = null;
                                            String str2 = null;
                                            while (jsonReader.hasNext()) {
                                                String nextName6 = jsonReader.nextName();
                                                nextName6.getClass();
                                                switch (nextName6.hashCode()) {
                                                    case -1147692044:
                                                        if (nextName6.equals("address")) {
                                                            c12 = 0;
                                                            break;
                                                        }
                                                        break;
                                                    case 3059181:
                                                        if (nextName6.equals("code")) {
                                                            c12 = 1;
                                                            break;
                                                        }
                                                        break;
                                                    case 3373707:
                                                        if (nextName6.equals("name")) {
                                                            c12 = 2;
                                                            break;
                                                        }
                                                        break;
                                                }
                                                c12 = 65535;
                                                switch (c12) {
                                                    case 0:
                                                        b4 = (byte) (b4 | 1);
                                                        j5 = jsonReader.nextLong();
                                                        break;
                                                    case 1:
                                                        str2 = jsonReader.nextString();
                                                        if (str2 == null) {
                                                            throw new NullPointerException("Null code");
                                                        }
                                                        break;
                                                    case 2:
                                                        str = jsonReader.nextString();
                                                        if (str == null) {
                                                            throw new NullPointerException("Null name");
                                                        }
                                                        break;
                                                    default:
                                                        jsonReader.skipValue();
                                                        break;
                                                }
                                            }
                                            jsonReader.endObject();
                                            if (b4 == 1 && str != null && str2 != null) {
                                                auVar = new au(str, j5, str2);
                                            } else {
                                                StringBuilder sb2 = new StringBuilder();
                                                if (str == null) {
                                                    sb2.append(" name");
                                                }
                                                if (str2 == null) {
                                                    sb2.append(" code");
                                                }
                                                if ((b4 & 1) == 0) {
                                                    sb2.append(" address");
                                                }
                                                throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
                                            }
                                            break;
                                        case 3:
                                            list6 = delta(jsonReader, new a(1));
                                            if (list6 == null) {
                                                throw new NullPointerException("Null binaries");
                                            }
                                        case 4:
                                            atVar = foxtrot(jsonReader);
                                        default:
                                            jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (auVar != null && list6 != null) {
                                    arVar = new ar(list5, atVar, adVar, auVar, list6);
                                } else {
                                    StringBuilder sb3 = new StringBuilder();
                                    if (auVar == null) {
                                        sb3.append(" signal");
                                    }
                                    if (list6 == null) {
                                        sb3.append(" binaries");
                                    }
                                    throw new IllegalStateException(z.kilo(sb3, "Missing required properties:"));
                                }
                                break;
                            case 3:
                                ArrayList arrayList2 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList2.add(bravo(jsonReader));
                                }
                                jsonReader.endArray();
                                list3 = Collections.unmodifiableList(arrayList2);
                            case 4:
                                ArrayList arrayList3 = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList3.add(bravo(jsonReader));
                                }
                                jsonReader.endArray();
                                list2 = Collections.unmodifiableList(arrayList3);
                            case 5:
                                i4 = jsonReader.nextInt();
                                b2 = (byte) 1;
                            case 6:
                                azVar = golf(jsonReader);
                            default:
                                jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (b2 == 1 && arVar != null) {
                        obj.charlie = new aq(arVar, list2, list3, bool, azVar, list4, i4);
                    } else {
                        StringBuilder sb4 = new StringBuilder();
                        if (arVar == null) {
                            sb4.append(" execution");
                        }
                        if (b2 == 0) {
                            sb4.append(" uiOrientation");
                        }
                        throw new IllegalStateException(z.kilo(sb4, "Missing required properties:"));
                    }
                    break;
                case 3:
                    jsonReader.beginObject();
                    String str3 = null;
                    while (jsonReader.hasNext()) {
                        if (jsonReader.nextName().equals(Constants.KEY_CONTENT)) {
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str3 = nextString;
                            } else {
                                throw new NullPointerException("Null content");
                            }
                        } else {
                            jsonReader.skipValue();
                        }
                    }
                    jsonReader.endObject();
                    if (str3 != null) {
                        obj.echo = new C(str3);
                    } else {
                        throw new IllegalStateException("Missing required properties: content");
                    }
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.bravo = nextString2;
                    } else {
                        throw new NullPointerException("Null type");
                    }
                case 5:
                    obj.alpha = jsonReader.nextLong();
                    obj.golf = (byte) (obj.golf | 1);
                default:
                    jsonReader.skipValue();
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0060 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0067 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x005c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static at foxtrot(JsonReader jsonReader) {
        jsonReader.beginObject();
        int i4 = 0;
        String str = null;
        String str2 = null;
        List list = null;
        at atVar = null;
        byte b2 = 0;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case -1266514778:
                    if (nextName.equals("frames")) {
                        c3 = 0;
                    }
                    switch (c3) {
                        case 0:
                            List delta = delta(jsonReader, new a(2));
                            if (delta != null) {
                                list = delta;
                                break;
                            } else {
                                throw new NullPointerException("Null frames");
                            }
                        case 1:
                            str2 = jsonReader.nextString();
                            break;
                        case 2:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                str = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null type");
                            }
                        case 3:
                            atVar = foxtrot(jsonReader);
                            break;
                        case 4:
                            i4 = jsonReader.nextInt();
                            b2 = (byte) (b2 | 1);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case -934964668:
                    if (nextName.equals("reason")) {
                        c3 = 1;
                    }
                    switch (c3) {
                    }
                    break;
                case 3575610:
                    if (nextName.equals(Constants.KEY_TYPE)) {
                        c3 = 2;
                    }
                    switch (c3) {
                    }
                    break;
                case 91997906:
                    if (nextName.equals("causedBy")) {
                        c3 = 3;
                    }
                    switch (c3) {
                    }
                    break;
                case 581754413:
                    if (nextName.equals("overflowCount")) {
                        c3 = 4;
                    }
                    switch (c3) {
                    }
                    break;
                default:
                    switch (c3) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        if (b2 == 1 && str != null && list != null) {
            return new at(str, str2, list, atVar, i4);
        }
        StringBuilder sb2 = new StringBuilder();
        if (str == null) {
            sb2.append(" type");
        }
        if (list == null) {
            sb2.append(" frames");
        }
        if ((b2 & 1) == 0) {
            sb2.append(" overflowCount");
        }
        throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x005f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006d A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x004e A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, R7.ay] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static az golf(JsonReader jsonReader) {
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            char c3 = 65535;
            switch (nextName.hashCode()) {
                case 110987:
                    if (nextName.equals("pid")) {
                        c3 = 0;
                    }
                    switch (c3) {
                        case 0:
                            obj.bravo = jsonReader.nextInt();
                            obj.echo = (byte) (obj.echo | 1);
                            break;
                        case 1:
                            String nextString = jsonReader.nextString();
                            if (nextString != null) {
                                obj.alpha = nextString;
                                break;
                            } else {
                                throw new NullPointerException("Null processName");
                            }
                        case 2:
                            obj.delta = jsonReader.nextBoolean();
                            obj.echo = (byte) (obj.echo | 4);
                            break;
                        case 3:
                            obj.charlie = jsonReader.nextInt();
                            obj.echo = (byte) (obj.echo | 2);
                            break;
                        default:
                            jsonReader.skipValue();
                            break;
                    }
                case 202325402:
                    if (nextName.equals("processName")) {
                        c3 = 1;
                    }
                    switch (c3) {
                    }
                    break;
                case 1694598382:
                    if (nextName.equals("defaultProcess")) {
                        c3 = 2;
                    }
                    switch (c3) {
                    }
                    break;
                case 2125650548:
                    if (nextName.equals("importance")) {
                        c3 = 3;
                    }
                    switch (c3) {
                    }
                    break;
                default:
                    switch (c3) {
                    }
                    break;
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:7:0x00df. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v12 */
    /* JADX WARN: Type inference failed for: r10v14 */
    /* JADX WARN: Type inference failed for: r10v16 */
    /* JADX WARN: Type inference failed for: r10v18 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v22 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26 */
    /* JADX WARN: Type inference failed for: r10v32, types: [java.lang.Object, R7.ai] */
    /* JADX WARN: Type inference failed for: r10v33 */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r12v96, types: [R7.H, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v29, types: [R7.am, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v0, types: [R7.aa, java.lang.Object] */
    public static ab hotel(JsonReader jsonReader) {
        char c3;
        ?? r10;
        char c4;
        char c10;
        char c11;
        boolean z2;
        char c12;
        boolean z10 = false;
        Charset charset = o0.alpha;
        ?? obj = new Object();
        jsonReader.beginObject();
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.getClass();
            switch (nextName.hashCode()) {
                case -2118372775:
                    c3 = '\b';
                    if (nextName.equals("ndkPayload")) {
                        r10 = z10;
                        break;
                    }
                    break;
                case -1962630338:
                    c3 = '\b';
                    if (nextName.equals("sdkVersion")) {
                        r10 = 1;
                        break;
                    }
                    break;
                case -1907185581:
                    c3 = '\b';
                    if (nextName.equals("appQualitySessionId")) {
                        r10 = 2;
                        break;
                    }
                    break;
                case -1375141843:
                    c3 = '\b';
                    if (nextName.equals("appExitInfo")) {
                        r10 = 3;
                        break;
                    }
                    break;
                case -911706486:
                    c3 = '\b';
                    if (nextName.equals("buildVersion")) {
                        r10 = 4;
                        break;
                    }
                    break;
                case -401988390:
                    c3 = '\b';
                    if (nextName.equals("firebaseAuthenticationToken")) {
                        r10 = 5;
                        break;
                    }
                    break;
                case 344431858:
                    c3 = '\b';
                    if (nextName.equals("gmpAppId")) {
                        r10 = 6;
                        break;
                    }
                    break;
                case 719853845:
                    c3 = '\b';
                    if (nextName.equals("installationUuid")) {
                        r10 = 7;
                        break;
                    }
                    break;
                case 1047652060:
                    c3 = '\b';
                    if (nextName.equals("firebaseInstallationId")) {
                        r10 = 8;
                        break;
                    }
                    break;
                case 1874684019:
                    c3 = '\b';
                    if (nextName.equals("platform")) {
                        r10 = 9;
                        break;
                    }
                    break;
                case 1975623094:
                    c3 = '\b';
                    if (nextName.equals("displayVersion")) {
                        r10 = 10;
                        break;
                    }
                    break;
                case 1984987798:
                    c3 = '\b';
                    if (nextName.equals("session")) {
                        r10 = 11;
                        break;
                    }
                    break;
                default:
                    r10 = -1;
                    c3 = '\b';
                    break;
            }
            r10 = -1;
            switch (r10) {
                case 0:
                    jsonReader.beginObject();
                    List list = null;
                    String str = null;
                    while (jsonReader.hasNext()) {
                        String nextName2 = jsonReader.nextName();
                        nextName2.getClass();
                        if (!nextName2.equals("files")) {
                            if (!nextName2.equals("orgId")) {
                                jsonReader.skipValue();
                            } else {
                                str = jsonReader.nextString();
                            }
                        } else {
                            list = delta(jsonReader, new A8.a(28));
                            if (list == null) {
                                throw new NullPointerException("Null files");
                            }
                        }
                    }
                    jsonReader.endObject();
                    if (list != null) {
                        obj.kilo = new ag(list, str);
                        z10 = false;
                    } else {
                        throw new IllegalStateException("Missing required properties: files");
                    }
                case 1:
                    String nextString = jsonReader.nextString();
                    if (nextString != null) {
                        obj.alpha = nextString;
                        z10 = false;
                    } else {
                        throw new NullPointerException("Null sdkVersion");
                    }
                case 2:
                    obj.golf = jsonReader.nextString();
                    z10 = false;
                case 3:
                    obj.lima = charlie(jsonReader);
                    z10 = false;
                case 4:
                    String nextString2 = jsonReader.nextString();
                    if (nextString2 != null) {
                        obj.hotel = nextString2;
                        z10 = false;
                    } else {
                        throw new NullPointerException("Null buildVersion");
                    }
                case 5:
                    obj.foxtrot = jsonReader.nextString();
                    z10 = false;
                case 6:
                    String nextString3 = jsonReader.nextString();
                    if (nextString3 != null) {
                        obj.bravo = nextString3;
                        z10 = false;
                    } else {
                        throw new NullPointerException("Null gmpAppId");
                    }
                case 7:
                    String nextString4 = jsonReader.nextString();
                    if (nextString4 != null) {
                        obj.delta = nextString4;
                        z10 = false;
                    } else {
                        throw new NullPointerException("Null installationUuid");
                    }
                case 8:
                    obj.echo = jsonReader.nextString();
                    z10 = false;
                case 9:
                    obj.charlie = jsonReader.nextInt();
                    obj.mike = (byte) (obj.mike | 1);
                    z10 = false;
                case 10:
                    String nextString5 = jsonReader.nextString();
                    if (nextString5 != null) {
                        obj.india = nextString5;
                        z10 = false;
                    } else {
                        throw new NullPointerException("Null displayVersion");
                    }
                case 11:
                    ?? obj2 = new Object();
                    obj2.foxtrot = z10;
                    obj2.mike = (byte) (obj2.mike | 2);
                    jsonReader.beginObject();
                    while (jsonReader.hasNext()) {
                        String nextName3 = jsonReader.nextName();
                        nextName3.getClass();
                        switch (nextName3.hashCode()) {
                            case -2128794476:
                                c4 = 4;
                                if (nextName3.equals("startedAt")) {
                                    c10 = 0;
                                    break;
                                }
                                break;
                            case -1907185581:
                                c4 = 4;
                                if (nextName3.equals("appQualitySessionId")) {
                                    c10 = 1;
                                    break;
                                }
                                break;
                            case -1618432855:
                                c4 = 4;
                                if (nextName3.equals("identifier")) {
                                    c10 = 2;
                                    break;
                                }
                                break;
                            case -1606742899:
                                c4 = 4;
                                if (nextName3.equals("endedAt")) {
                                    c10 = 3;
                                    break;
                                }
                                break;
                            case -1335157162:
                                c4 = 4;
                                if (nextName3.equals("device")) {
                                    c10 = 4;
                                    break;
                                }
                                break;
                            case -1291329255:
                                c4 = 4;
                                if (nextName3.equals("events")) {
                                    c10 = 5;
                                    break;
                                }
                                break;
                            case 3556:
                                c4 = 4;
                                if (nextName3.equals(CtApi.QUERY_PARAM_OS_KEY)) {
                                    c10 = 6;
                                    break;
                                }
                                break;
                            case 96801:
                                c4 = 4;
                                if (nextName3.equals("app")) {
                                    c10 = 7;
                                    break;
                                }
                                break;
                            case 3599307:
                                c4 = 4;
                                if (nextName3.equals("user")) {
                                    c10 = c3;
                                    break;
                                }
                                break;
                            case 286956243:
                                c4 = 4;
                                if (nextName3.equals("generator")) {
                                    c10 = '\t';
                                    break;
                                }
                                break;
                            case 1025385094:
                                c4 = 4;
                                if (nextName3.equals("crashed")) {
                                    c10 = '\n';
                                    break;
                                }
                                break;
                            case 2047016109:
                                c4 = 4;
                                if (nextName3.equals("generatorType")) {
                                    c10 = 11;
                                    break;
                                }
                                break;
                            default:
                                c10 = 65535;
                                c4 = 4;
                                break;
                        }
                        c10 = 65535;
                        switch (c10) {
                            case 0:
                                obj2.delta = jsonReader.nextLong();
                                obj2.mike = (byte) (obj2.mike | 1);
                                break;
                            case 1:
                                obj2.charlie = jsonReader.nextString();
                                break;
                            case 2:
                                obj2.bravo = new String(Base64.decode(jsonReader.nextString(), 2), o0.alpha);
                                break;
                            case 3:
                                obj2.echo = Long.valueOf(jsonReader.nextLong());
                                break;
                            case 4:
                                ?? obj3 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName4 = jsonReader.nextName();
                                    nextName4.getClass();
                                    switch (nextName4.hashCode()) {
                                        case -1981332476:
                                            if (nextName4.equals("simulator")) {
                                                c11 = 0;
                                                break;
                                            }
                                            break;
                                        case -1969347631:
                                            if (nextName4.equals("manufacturer")) {
                                                c11 = 1;
                                                break;
                                            }
                                            break;
                                        case 112670:
                                            if (nextName4.equals("ram")) {
                                                c11 = 2;
                                                break;
                                            }
                                            break;
                                        case 3002454:
                                            if (nextName4.equals("arch")) {
                                                c11 = 3;
                                                break;
                                            }
                                            break;
                                        case 81784169:
                                            if (nextName4.equals("diskSpace")) {
                                                c11 = c4;
                                                break;
                                            }
                                            break;
                                        case 94848180:
                                            if (nextName4.equals("cores")) {
                                                c11 = 5;
                                                break;
                                            }
                                            break;
                                        case 104069929:
                                            if (nextName4.equals("model")) {
                                                c11 = 6;
                                                break;
                                            }
                                            break;
                                        case 109757585:
                                            if (nextName4.equals("state")) {
                                                c11 = 7;
                                                break;
                                            }
                                            break;
                                        case 2078953423:
                                            if (nextName4.equals("modelClass")) {
                                                c11 = c3;
                                                break;
                                            }
                                            break;
                                    }
                                    c11 = 65535;
                                    switch (c11) {
                                        case 0:
                                            obj3.foxtrot = jsonReader.nextBoolean();
                                            obj3.juliet = (byte) (obj3.juliet | 16);
                                            break;
                                        case 1:
                                            String nextString6 = jsonReader.nextString();
                                            if (nextString6 != null) {
                                                obj3.hotel = nextString6;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null manufacturer");
                                            }
                                        case 2:
                                            obj3.delta = jsonReader.nextLong();
                                            obj3.juliet = (byte) (obj3.juliet | 4);
                                            break;
                                        case 3:
                                            obj3.alpha = jsonReader.nextInt();
                                            obj3.juliet = (byte) (obj3.juliet | 1);
                                            break;
                                        case 4:
                                            obj3.echo = jsonReader.nextLong();
                                            obj3.juliet = (byte) (obj3.juliet | 8);
                                            break;
                                        case 5:
                                            obj3.charlie = jsonReader.nextInt();
                                            obj3.juliet = (byte) (obj3.juliet | 2);
                                            break;
                                        case 6:
                                            String nextString7 = jsonReader.nextString();
                                            if (nextString7 != null) {
                                                obj3.bravo = nextString7;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null model");
                                            }
                                        case 7:
                                            obj3.golf = jsonReader.nextInt();
                                            obj3.juliet = (byte) (obj3.juliet | 32);
                                            break;
                                        case '\b':
                                            String nextString8 = jsonReader.nextString();
                                            if (nextString8 != null) {
                                                obj3.india = nextString8;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null modelClass");
                                            }
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.juliet = obj3.alpha();
                                break;
                            case 5:
                                ArrayList arrayList = new ArrayList();
                                jsonReader.beginArray();
                                while (jsonReader.hasNext()) {
                                    arrayList.add(echo(jsonReader));
                                }
                                jsonReader.endArray();
                                obj2.kilo = Collections.unmodifiableList(arrayList);
                                break;
                            case 6:
                                ?? obj4 = new Object();
                                jsonReader.beginObject();
                                while (jsonReader.hasNext()) {
                                    String nextName5 = jsonReader.nextName();
                                    nextName5.getClass();
                                    switch (nextName5.hashCode()) {
                                        case -911706486:
                                            if (nextName5.equals("buildVersion")) {
                                                z2 = false;
                                                break;
                                            }
                                            break;
                                        case -293026577:
                                            if (nextName5.equals("jailbroken")) {
                                                z2 = true;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName5.equals("version")) {
                                                z2 = 2;
                                                break;
                                            }
                                            break;
                                        case 1874684019:
                                            if (nextName5.equals("platform")) {
                                                z2 = 3;
                                                break;
                                            }
                                            break;
                                    }
                                    z2 = -1;
                                    switch (z2) {
                                        case false:
                                            String nextString9 = jsonReader.nextString();
                                            if (nextString9 != null) {
                                                obj4.charlie = nextString9;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null buildVersion");
                                            }
                                        case true:
                                            obj4.delta = jsonReader.nextBoolean();
                                            obj4.echo = (byte) (obj4.echo | 2);
                                            break;
                                        case true:
                                            String nextString10 = jsonReader.nextString();
                                            if (nextString10 != null) {
                                                obj4.bravo = nextString10;
                                                break;
                                            } else {
                                                throw new NullPointerException("Null version");
                                            }
                                        case true:
                                            obj4.alpha = jsonReader.nextInt();
                                            obj4.echo = (byte) (obj4.echo | 1);
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                obj2.india = obj4.alpha();
                                break;
                            case 7:
                                jsonReader.beginObject();
                                String str2 = null;
                                String str3 = null;
                                String str4 = null;
                                String str5 = null;
                                String str6 = null;
                                String str7 = null;
                                while (jsonReader.hasNext()) {
                                    String nextName6 = jsonReader.nextName();
                                    nextName6.getClass();
                                    switch (nextName6.hashCode()) {
                                        case -1618432855:
                                            if (nextName6.equals("identifier")) {
                                                c12 = 0;
                                                break;
                                            }
                                            break;
                                        case -519438642:
                                            if (nextName6.equals("developmentPlatform")) {
                                                c12 = 1;
                                                break;
                                            }
                                            break;
                                        case 213652010:
                                            if (nextName6.equals("developmentPlatformVersion")) {
                                                c12 = 2;
                                                break;
                                            }
                                            break;
                                        case 351608024:
                                            if (nextName6.equals("version")) {
                                                c12 = 3;
                                                break;
                                            }
                                            break;
                                        case 719853845:
                                            if (nextName6.equals("installationUuid")) {
                                                c12 = c4;
                                                break;
                                            }
                                            break;
                                        case 1975623094:
                                            if (nextName6.equals("displayVersion")) {
                                                c12 = 5;
                                                break;
                                            }
                                            break;
                                    }
                                    c12 = 65535;
                                    switch (c12) {
                                        case 0:
                                            str2 = jsonReader.nextString();
                                            if (str2 == null) {
                                                throw new NullPointerException("Null identifier");
                                            }
                                            break;
                                        case 1:
                                            str6 = jsonReader.nextString();
                                            break;
                                        case 2:
                                            str7 = jsonReader.nextString();
                                            break;
                                        case 3:
                                            str3 = jsonReader.nextString();
                                            if (str3 == null) {
                                                throw new NullPointerException("Null version");
                                            }
                                            break;
                                        case 4:
                                            str5 = jsonReader.nextString();
                                            break;
                                        case 5:
                                            str4 = jsonReader.nextString();
                                            break;
                                        default:
                                            jsonReader.skipValue();
                                            break;
                                    }
                                }
                                jsonReader.endObject();
                                if (str2 != null && str3 != null) {
                                    obj2.golf = new ak(str2, str3, str4, str5, str6, str7);
                                    break;
                                } else {
                                    StringBuilder sb2 = new StringBuilder();
                                    if (str2 == null) {
                                        sb2.append(" identifier");
                                    }
                                    if (str3 == null) {
                                        sb2.append(" version");
                                    }
                                    throw new IllegalStateException(z.kilo(sb2, "Missing required properties:"));
                                }
                            case '\b':
                                jsonReader.beginObject();
                                String str8 = null;
                                while (jsonReader.hasNext()) {
                                    if (jsonReader.nextName().equals("identifier")) {
                                        str8 = jsonReader.nextString();
                                        if (str8 == null) {
                                            throw new NullPointerException("Null identifier");
                                        }
                                    } else {
                                        jsonReader.skipValue();
                                    }
                                }
                                jsonReader.endObject();
                                if (str8 != null) {
                                    obj2.hotel = new J(str8);
                                    break;
                                } else {
                                    throw new IllegalStateException("Missing required properties: identifier");
                                }
                            case '\t':
                                String nextString11 = jsonReader.nextString();
                                if (nextString11 != null) {
                                    obj2.alpha = nextString11;
                                    break;
                                } else {
                                    throw new NullPointerException("Null generator");
                                }
                            case '\n':
                                obj2.foxtrot = jsonReader.nextBoolean();
                                obj2.mike = (byte) (obj2.mike | 2);
                                break;
                            case 11:
                                obj2.lima = jsonReader.nextInt();
                                obj2.mike = (byte) (obj2.mike | 4);
                                break;
                            default:
                                jsonReader.skipValue();
                                break;
                        }
                    }
                    jsonReader.endObject();
                    obj.juliet = obj2.alpha();
                    z10 = false;
                    break;
                default:
                    jsonReader.skipValue();
                    z10 = false;
            }
        }
        jsonReader.endObject();
        return obj.alpha();
    }

    public static ab india(String str) {
        try {
            JsonReader jsonReader = new JsonReader(new StringReader(str));
            try {
                ab hotel = hotel(jsonReader);
                jsonReader.close();
                return hotel;
            } finally {
            }
        } catch (IllegalStateException e) {
            throw new IOException(e);
        }
    }
}
