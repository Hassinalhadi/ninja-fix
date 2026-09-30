package t7;

import A2.aj;
import com.google.crypto.tink.shaded.protobuf.AbstractC1490h;
import com.google.crypto.tink.shaded.protobuf.ao;
import com.google.crypto.tink.shaded.protobuf.p;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Collections;
import java.util.HashMap;
import pe.AbstractC2327c;
import z7.C3468B;
import z7.C3470b;
import z7.C3472d;
import z7.C3473e;
import z7.C3475g;
import z7.C3478j;
import z7.E;
import z7.J;
import z7.ac;
import z7.ai;
import z7.ak;
import z7.am;
import z7.l;
import z7.n;
import z7.r;
import z7.v;
import z7.y;

/* loaded from: classes2.dex */
public final class f extends aj {
    public final /* synthetic */ int echo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(Class cls, d[] dVarArr, int i4) {
        super(cls, dVarArr);
        this.echo = i4;
    }

    public static void november(C3473e c3473e) {
        if (c3473e.november() >= 10) {
            if (c3473e.november() <= 16) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too long");
            }
        }
        throw new GeneralSecurityException("tag size too short");
    }

    public static void oscar(ak akVar) {
        if (akVar.oscar() >= 10) {
            int ordinal = akVar.november().ordinal();
            if (ordinal != 1) {
                if (ordinal != 3) {
                    if (ordinal == 4) {
                        if (akVar.oscar() > 64) {
                            throw new GeneralSecurityException("tag size too big");
                        }
                        return;
                    }
                    throw new GeneralSecurityException("unknown hash type");
                }
                if (akVar.oscar() > 32) {
                    throw new GeneralSecurityException("tag size too big");
                }
                return;
            }
            if (akVar.oscar() <= 20) {
                return;
            } else {
                throw new GeneralSecurityException("tag size too big");
            }
        }
        throw new GeneralSecurityException("tag size too small");
    }

    @Override // A2.aj
    public final String golf() {
        switch (this.echo) {
            case 0:
                return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
            case 1:
                return "type.googleapis.com/google.crypto.tink.AesEaxKey";
            case 2:
                return "type.googleapis.com/google.crypto.tink.AesGcmKey";
            case 3:
                return "type.googleapis.com/google.crypto.tink.AesGcmSivKey";
            case 4:
                return "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key";
            case 5:
                return "type.googleapis.com/google.crypto.tink.KmsAeadKey";
            case 6:
                return "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey";
            case 7:
                return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
            case 8:
                return "type.googleapis.com/google.crypto.tink.AesSivKey";
            case 9:
                return "type.googleapis.com/google.crypto.tink.AesCmacKey";
            default:
                return "type.googleapis.com/google.crypto.tink.HmacKey";
        }
    }

    @Override // A2.aj
    public final G3.a india() {
        switch (this.echo) {
            case 0:
                return new e(this);
            case 1:
                return new e(this, (byte) 0);
            case 2:
                return new e(this, (char) 0);
            case 3:
                return new e(this, 0);
            case 4:
                return new e(this, (short) 0);
            case 5:
                return new e(this, (byte) 0, false);
            case 6:
                return new e(this, (byte) 0, (byte) 0);
            case 7:
                return new e(this, (byte) 0, (char) 0);
            case 8:
                return new e(this, (byte) 0, 0);
            case 9:
                return new G3.a(C3472d.class);
            default:
                return new e(this, (byte) 0, (short) 0);
        }
    }

    @Override // A2.aj
    public final am juliet() {
        switch (this.echo) {
            case 0:
                return am.SYMMETRIC;
            case 1:
                return am.SYMMETRIC;
            case 2:
                return am.SYMMETRIC;
            case 3:
                return am.SYMMETRIC;
            case 4:
                return am.SYMMETRIC;
            case 5:
                return am.REMOTE;
            case 6:
                return am.REMOTE;
            case 7:
                return am.SYMMETRIC;
            case 8:
                return am.SYMMETRIC;
            case 9:
                return am.SYMMETRIC;
            default:
                return am.SYMMETRIC;
        }
    }

    @Override // A2.aj
    public final ao kilo(AbstractC1490h abstractC1490h) {
        switch (this.echo) {
            case 0:
                return C3475g.tango(abstractC1490h, p.alpha());
            case 1:
                return n.tango(abstractC1490h, p.alpha());
            case 2:
                return r.romeo(abstractC1490h, p.alpha());
            case 3:
                return v.romeo(abstractC1490h, p.alpha());
            case 4:
                return ac.romeo(abstractC1490h, p.alpha());
            case 5:
                return C3468B.romeo(abstractC1490h, p.alpha());
            case 6:
                return E.romeo(abstractC1490h, p.alpha());
            case 7:
                return J.romeo(abstractC1490h, p.alpha());
            case 8:
                return y.romeo(abstractC1490h, p.alpha());
            case 9:
                return C3470b.tango(abstractC1490h, p.alpha());
            default:
                return ai.uniform(abstractC1490h, p.alpha());
        }
    }

    @Override // A2.aj
    public final void mike(ao aoVar) {
        switch (this.echo) {
            case 0:
                C3475g c3475g = (C3475g) aoVar;
                A7.r.charlie(c3475g.romeo());
                d[] dVarArr = {new d(1, A7.n.class)};
                HashMap hashMap = new HashMap();
                for (int i4 = 0; i4 < 1; i4++) {
                    d dVar = dVarArr[i4];
                    boolean containsKey = hashMap.containsKey(dVar.alpha);
                    Class cls = dVar.alpha;
                    if (!containsKey) {
                        hashMap.put(cls, dVar);
                    } else {
                        throw new IllegalArgumentException(AbstractC2327c.whiskey(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                    }
                }
                Class cls2 = dVarArr[0].alpha;
                Collections.unmodifiableMap(hashMap);
                C3478j papa = c3475g.papa();
                A7.r.charlie(papa.sierra());
                A7.r.alpha(papa.quebec().size());
                l romeo = papa.romeo();
                if (romeo.november() >= 12 && romeo.november() <= 16) {
                    d[] dVarArr2 = {new d(11, s7.e.class)};
                    HashMap hashMap2 = new HashMap();
                    d dVar2 = dVarArr2[0];
                    boolean containsKey2 = hashMap2.containsKey(dVar2.alpha);
                    Class cls3 = dVar2.alpha;
                    if (!containsKey2) {
                        hashMap2.put(cls3, dVar2);
                        Class cls4 = dVarArr2[0].alpha;
                        Collections.unmodifiableMap(hashMap2);
                        ai quebec = c3475g.quebec();
                        A7.r.charlie(quebec.sierra());
                        if (quebec.quebec().size() >= 16) {
                            oscar(quebec.romeo());
                            return;
                        }
                        throw new GeneralSecurityException("key too short");
                    }
                    throw new IllegalArgumentException(AbstractC2327c.whiskey(cls3, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                }
                throw new GeneralSecurityException("invalid IV size");
            case 1:
                n nVar = (n) aoVar;
                A7.r.charlie(nVar.romeo());
                A7.r.alpha(nVar.papa().size());
                if (nVar.quebec().november() != 12 && nVar.quebec().november() != 16) {
                    throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
                }
                return;
            case 2:
                r rVar = (r) aoVar;
                A7.r.charlie(rVar.papa());
                A7.r.alpha(rVar.oscar().size());
                return;
            case 3:
                v vVar = (v) aoVar;
                A7.r.charlie(vVar.papa());
                A7.r.alpha(vVar.oscar().size());
                return;
            case 4:
                ac acVar = (ac) aoVar;
                A7.r.charlie(acVar.papa());
                if (acVar.oscar().size() == 32) {
                    return;
                } else {
                    throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
                }
            case 5:
                A7.r.charlie(((C3468B) aoVar).papa());
                return;
            case 6:
                A7.r.charlie(((E) aoVar).papa());
                return;
            case 7:
                J j5 = (J) aoVar;
                A7.r.charlie(j5.papa());
                if (j5.oscar().size() == 32) {
                    return;
                } else {
                    throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
                }
            case 8:
                y yVar = (y) aoVar;
                A7.r.charlie(yVar.papa());
                if (yVar.oscar().size() == 64) {
                    return;
                }
                throw new InvalidKeyException("invalid key size: " + yVar.oscar().size() + ". Valid keys must have 64 bytes.");
            case 9:
                C3470b c3470b = (C3470b) aoVar;
                A7.r.charlie(c3470b.romeo());
                if (c3470b.papa().size() == 32) {
                    november(c3470b.quebec());
                    return;
                }
                throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
            default:
                ai aiVar = (ai) aoVar;
                A7.r.charlie(aiVar.sierra());
                if (aiVar.quebec().size() >= 16) {
                    oscar(aiVar.romeo());
                    return;
                }
                throw new GeneralSecurityException("key too short");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f() {
        super(ai.class, new d[]{new d(11, s7.e.class)});
        this.echo = 10;
    }
}
