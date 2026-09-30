package t7;

import A2.aj;
import A7.n;
import A7.q;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.C1489g;
import com.google.crypto.tink.shaded.protobuf.ao;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import z7.C;
import z7.C3467A;
import z7.C3468B;
import z7.C3474f;
import z7.C3475g;
import z7.C3476h;
import z7.C3477i;
import z7.C3478j;
import z7.C3479k;
import z7.D;
import z7.E;
import z7.F;
import z7.I;
import z7.J;
import z7.K;
import z7.aa;
import z7.ab;
import z7.ac;
import z7.ad;
import z7.ah;
import z7.ai;
import z7.ak;
import z7.l;
import z7.m;
import z7.o;
import z7.p;
import z7.r;
import z7.t;
import z7.u;
import z7.v;
import z7.w;
import z7.x;
import z7.y;

/* loaded from: classes2.dex */
public final class e extends G3.a {
    public final /* synthetic */ int purple = 0;
    public final /* synthetic */ aj red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2, boolean z2) {
        super(C.class);
        this.red = fVar;
    }

    @Override // G3.a
    public final Object I(ao aoVar) {
        aj ajVar = this.red;
        switch (this.purple) {
            case 0:
                C3476h c3476h = (C3476h) aoVar;
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
                Collections.unmodifiableMap(hashMap);
                C3479k mike = c3476h.mike();
                C3477i tango = C3478j.tango();
                l oscar = mike.oscar();
                tango.charlie();
                C3478j.november((C3478j) tango.purple, oscar);
                byte[] alpha = q.alpha(mike.november());
                C1489g delta = AbstractC1490h.delta(alpha, 0, alpha.length);
                tango.charlie();
                C3478j.oscar((C3478j) tango.purple, delta);
                tango.charlie();
                C3478j.mike((C3478j) tango.purple);
                C3478j c3478j = (C3478j) tango.alpha();
                d[] dVarArr2 = {new d(11, s7.e.class)};
                HashMap hashMap2 = new HashMap();
                for (d dVar2 : dVarArr2) {
                    boolean containsKey2 = hashMap2.containsKey(dVar2.alpha);
                    Class cls3 = dVar2.alpha;
                    if (!containsKey2) {
                        hashMap2.put(cls3, dVar2);
                    } else {
                        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                if (dVarArr2.length > 0) {
                    Class cls4 = dVarArr2[0].alpha;
                }
                Collections.unmodifiableMap(hashMap2);
                z7.aj november = c3476h.november();
                ah tango2 = ai.tango();
                tango2.charlie();
                ai.mike((ai) tango2.purple);
                ak oscar2 = november.oscar();
                tango2.charlie();
                ai.november((ai) tango2.purple, oscar2);
                byte[] alpha2 = q.alpha(november.november());
                C1489g delta2 = AbstractC1490h.delta(alpha2, 0, alpha2.length);
                tango2.charlie();
                ai.oscar((ai) tango2.purple, delta2);
                ai aiVar = (ai) tango2.alpha();
                C3474f sierra = C3475g.sierra();
                sierra.charlie();
                C3475g.november((C3475g) sierra.purple, c3478j);
                sierra.charlie();
                C3475g.oscar((C3475g) sierra.purple, aiVar);
                ((f) ajVar).getClass();
                sierra.charlie();
                C3475g.mike((C3475g) sierra.purple);
                return (C3475g) sierra.alpha();
            case 1:
                o oVar = (o) aoVar;
                m sierra2 = z7.n.sierra();
                byte[] alpha3 = q.alpha(oVar.mike());
                C1489g delta3 = AbstractC1490h.delta(alpha3, 0, alpha3.length);
                sierra2.charlie();
                z7.n.oscar((z7.n) sierra2.purple, delta3);
                p november2 = oVar.november();
                sierra2.charlie();
                z7.n.november((z7.n) sierra2.purple, november2);
                ((f) ajVar).getClass();
                sierra2.charlie();
                z7.n.mike((z7.n) sierra2.purple);
                return (z7.n) sierra2.alpha();
            case 2:
                z7.q quebec = r.quebec();
                byte[] alpha4 = q.alpha(((t) aoVar).november());
                C1489g delta4 = AbstractC1490h.delta(alpha4, 0, alpha4.length);
                quebec.charlie();
                r.november((r) quebec.purple, delta4);
                ((f) ajVar).getClass();
                quebec.charlie();
                r.mike((r) quebec.purple);
                return (r) quebec.alpha();
            case 3:
                u quebec2 = v.quebec();
                byte[] alpha5 = q.alpha(((w) aoVar).mike());
                C1489g delta5 = AbstractC1490h.delta(alpha5, 0, alpha5.length);
                quebec2.charlie();
                v.november((v) quebec2.purple, delta5);
                ((f) ajVar).getClass();
                quebec2.charlie();
                v.mike((v) quebec2.purple);
                return (v) quebec2.alpha();
            case 4:
                ab quebec3 = ac.quebec();
                ((f) ajVar).getClass();
                quebec3.charlie();
                ac.mike((ac) quebec3.purple);
                byte[] alpha6 = q.alpha(32);
                C1489g delta6 = AbstractC1490h.delta(alpha6, 0, alpha6.length);
                quebec3.charlie();
                ac.november((ac) quebec3.purple, delta6);
                return (ac) quebec3.alpha();
            case 5:
                C3467A quebec4 = C3468B.quebec();
                quebec4.charlie();
                C3468B.november((C3468B) quebec4.purple, (C) aoVar);
                ((f) ajVar).getClass();
                quebec4.charlie();
                C3468B.mike((C3468B) quebec4.purple);
                return (C3468B) quebec4.alpha();
            case 6:
                D quebec5 = E.quebec();
                quebec5.charlie();
                E.november((E) quebec5.purple, (F) aoVar);
                ((f) ajVar).getClass();
                quebec5.charlie();
                E.mike((E) quebec5.purple);
                return (E) quebec5.alpha();
            case 7:
                I quebec6 = J.quebec();
                ((f) ajVar).getClass();
                quebec6.charlie();
                J.mike((J) quebec6.purple);
                byte[] alpha7 = q.alpha(32);
                C1489g delta7 = AbstractC1490h.delta(alpha7, 0, alpha7.length);
                quebec6.charlie();
                J.november((J) quebec6.purple, delta7);
                return (J) quebec6.alpha();
            case 8:
                x quebec7 = y.quebec();
                byte[] alpha8 = q.alpha(((aa) aoVar).november());
                C1489g delta8 = AbstractC1490h.delta(alpha8, 0, alpha8.length);
                quebec7.charlie();
                y.november((y) quebec7.purple, delta8);
                ((f) ajVar).getClass();
                quebec7.charlie();
                y.mike((y) quebec7.purple);
                return (y) quebec7.alpha();
            default:
                z7.aj ajVar2 = (z7.aj) aoVar;
                ah tango3 = ai.tango();
                ((f) ajVar).getClass();
                tango3.charlie();
                ai.mike((ai) tango3.purple);
                ak oscar3 = ajVar2.oscar();
                tango3.charlie();
                ai.november((ai) tango3.purple, oscar3);
                byte[] alpha9 = q.alpha(ajVar2.november());
                C1489g delta9 = AbstractC1490h.delta(alpha9, 0, alpha9.length);
                tango3.charlie();
                ai.oscar((ai) tango3.purple, delta9);
                return (ai) tango3.alpha();
        }
    }

    @Override // G3.a
    public final ao P(AbstractC1490h abstractC1490h) {
        switch (this.purple) {
            case 0:
                return C3476h.oscar(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 1:
                return o.oscar(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 2:
                return t.papa(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 3:
                return w.november(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 4:
                return ad.mike(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 5:
                return C.oscar(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 6:
                return F.papa(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 7:
                return K.mike(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            case 8:
                return aa.papa(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
            default:
                return z7.aj.papa(abstractC1490h, com.google.crypto.tink.shaded.protobuf.p.alpha());
        }
    }

    @Override // G3.a
    public final void T(ao aoVar) {
        switch (this.purple) {
            case 0:
                C3476h c3476h = (C3476h) aoVar;
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
                Collections.unmodifiableMap(hashMap);
                C3479k mike = c3476h.mike();
                A7.r.alpha(mike.november());
                l oscar = mike.oscar();
                if (oscar.november() >= 12 && oscar.november() <= 16) {
                    d[] dVarArr2 = {new d(11, s7.e.class)};
                    HashMap hashMap2 = new HashMap();
                    for (d dVar2 : dVarArr2) {
                        boolean containsKey2 = hashMap2.containsKey(dVar2.alpha);
                        Class cls3 = dVar2.alpha;
                        if (!containsKey2) {
                            hashMap2.put(cls3, dVar2);
                        } else {
                            throw new IllegalArgumentException(AbstractC2327c.whiskey(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                        }
                    }
                    if (dVarArr2.length > 0) {
                        Class cls4 = dVarArr2[0].alpha;
                    }
                    Collections.unmodifiableMap(hashMap2);
                    z7.aj november = c3476h.november();
                    if (november.november() >= 16) {
                        f.oscar(november.oscar());
                        A7.r.alpha(c3476h.mike().november());
                        return;
                    }
                    throw new GeneralSecurityException("key too short");
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                o oVar = (o) aoVar;
                A7.r.alpha(oVar.mike());
                if (oVar.november().november() != 12 && oVar.november().november() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                A7.r.alpha(((t) aoVar).november());
                return;
            case 3:
                A7.r.alpha(((w) aoVar).mike());
                return;
            case 4:
                return;
            case 5:
                return;
            case 6:
                return;
            case 7:
                return;
            case 8:
                aa aaVar = (aa) aoVar;
                if (aaVar.november() == 64) {
                    return;
                }
                throw new InvalidAlgorithmParameterException("invalid key size: " + aaVar.november() + ". Valid keys must have 64 bytes.");
            default:
                z7.aj ajVar = (z7.aj) aoVar;
                if (ajVar.november() >= 16) {
                    f.oscar(ajVar.oscar());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2, byte b4) {
        super(F.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, char c3) {
        super(t.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2) {
        super(o.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2, int i4) {
        super(aa.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, int i4) {
        super(w.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, short s3) {
        super(ad.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2, char c3) {
        super(K.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(C3476h.class);
        this.red = fVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar, byte b2, short s3) {
        super(z7.aj.class);
        this.red = fVar;
    }
}
