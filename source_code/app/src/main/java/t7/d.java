package t7;

import A7.j;
import A7.k;
import A7.n;
import A7.p;
import com.google.crypto.tink.shaded.protobuf.ao;
import id.C1915c;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.crypto.spec.SecretKeySpec;
import pe.AbstractC2327c;
import u7.C3145a;
import z7.C3468B;
import z7.C3470b;
import z7.C3475g;
import z7.C3478j;
import z7.E;
import z7.J;
import z7.ac;
import z7.ag;
import z7.ai;
import z7.r;
import z7.v;
import z7.y;

/* loaded from: classes2.dex */
public final class d {
    public final Class alpha;
    public final /* synthetic */ int bravo;

    public d(int i4, Class cls) {
        this.bravo = i4;
        this.alpha = cls;
    }

    public final Object alpha(ao aoVar) {
        boolean z2 = false;
        switch (this.bravo) {
            case 0:
                C3475g c3475g = (C3475g) aoVar;
                d[] dVarArr = {new d(1, n.class)};
                HashMap hashMap = new HashMap();
                for (d dVar : dVarArr) {
                    boolean containsKey = hashMap.containsKey(dVar.alpha);
                    Class cls = dVar.alpha;
                    if (!containsKey) {
                        hashMap.put(cls, dVar);
                    } else {
                        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (dVarArr.length > 0) {
                    Class cls2 = dVarArr[0].alpha;
                }
                Map unmodifiableMap = Collections.unmodifiableMap(hashMap);
                C3478j papa = c3475g.papa();
                d dVar2 = (d) unmodifiableMap.get(n.class);
                if (dVar2 != null) {
                    n nVar = (n) dVar2.alpha(papa);
                    d[] dVarArr2 = {new d(11, s7.e.class)};
                    HashMap hashMap2 = new HashMap();
                    int length = dVarArr2.length;
                    int i4 = 0;
                    while (i4 < length) {
                        d dVar3 = dVarArr2[i4];
                        boolean containsKey2 = hashMap2.containsKey(dVar3.alpha);
                        boolean z10 = z2;
                        Class cls3 = dVar3.alpha;
                        if (!containsKey2) {
                            hashMap2.put(cls3, dVar3);
                            i4++;
                            z2 = z10;
                        } else {
                            throw new IllegalArgumentException(AbstractC2327c.whiskey(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    boolean z11 = z2;
                    if (dVarArr2.length > 0) {
                        Class cls4 = dVarArr2[z11 ? 1 : 0].alpha;
                    }
                    Map unmodifiableMap2 = Collections.unmodifiableMap(hashMap2);
                    ai quebec = c3475g.quebec();
                    d dVar4 = (d) unmodifiableMap2.get(s7.e.class);
                    if (dVar4 != null) {
                        return new k(nVar, (s7.e) dVar4.alpha(quebec), c3475g.quebec().romeo().oscar());
                    }
                    throw new IllegalArgumentException("Requested primitive class " + s7.e.class.getCanonicalName() + " not supported.");
                }
                throw new IllegalArgumentException("Requested primitive class " + n.class.getCanonicalName() + " not supported.");
            case 1:
                C3478j c3478j = (C3478j) aoVar;
                return new A7.b(c3478j.romeo().november(), c3478j.quebec().kilo());
            case 2:
                z7.n nVar2 = (z7.n) aoVar;
                return new A7.c(nVar2.quebec().november(), nVar2.papa().kilo());
            case 3:
                return new A7.d(((r) aoVar).oscar().kilo());
            case 4:
                return new C3145a(((v) aoVar).oscar().kilo());
            case 5:
                return new j(0, ((ac) aoVar).oscar().kilo());
            case 6:
                String november = ((C3468B) aoVar).oscar().november();
                return s7.d.alpha(november).bravo(november);
            case 7:
                E e = (E) aoVar;
                String oscar = e.oscar().oscar();
                return new g(e.oscar().november(), s7.d.alpha(oscar).bravo(oscar));
            case 8:
                return new j(1, ((J) aoVar).oscar().kilo());
            case 9:
                return new A7.e(((y) aoVar).oscar().kilo());
            case 10:
                C3470b c3470b = (C3470b) aoVar;
                return new p(new C1915c(c3470b.papa().kilo()), c3470b.quebec().november());
            default:
                ai aiVar = (ai) aoVar;
                ag november2 = aiVar.romeo().november();
                SecretKeySpec secretKeySpec = new SecretKeySpec(aiVar.quebec().kilo(), "HMAC");
                int oscar2 = aiVar.romeo().oscar();
                int ordinal = november2.ordinal();
                if (ordinal != 1) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            return new p(new S5.k("HMACSHA512", secretKeySpec), oscar2);
                        }
                        throw new GeneralSecurityException("unknown hash");
                    }
                    return new p(new S5.k("HMACSHA256", secretKeySpec), oscar2);
                }
                return new p(new S5.k("HMACSHA1", secretKeySpec), oscar2);
        }
    }
}
