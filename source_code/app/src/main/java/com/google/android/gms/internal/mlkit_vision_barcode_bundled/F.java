package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes2.dex */
public final class F implements M {
    public final B alpha;
    public final ah bravo;
    public final boolean charlie;

    public F(ah ahVar, B b2) {
        ah ahVar2 = ad.alpha;
        this.bravo = ahVar;
        this.charlie = b2 instanceof aj;
        this.alpha = b2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final Object alpha() {
        B b2 = this.alpha;
        if (b2 instanceof am) {
            return (am) ((am) b2).mike(4, null);
        }
        return ((ai) ((am) b2).mike(5, null)).delta();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void bravo(Object obj) {
        this.bravo.getClass();
        Q q4 = ((am) obj).zzc;
        if (q4.echo) {
            q4.echo = false;
        }
        ah ahVar = ad.alpha;
        ((aj) obj).zzb.delta();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final boolean charlie(Object obj) {
        return ((aj) obj).zzb.foxtrot();
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void delta(Object obj, Object obj2) {
        N.quebec(obj, obj2);
        if (this.charlie) {
            ah ahVar = ad.alpha;
            N.papa(obj, obj2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[EDGE_INSN: B:37:0x009c->B:38:0x009c BREAK  A[LOOP:1: B:23:0x005c->B:31:0x005c], SYNTHETIC] */
    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo(Object obj, byte[] bArr, int i4, int i5, C1425t c1425t) {
        int i10;
        C1425t c1425t2;
        int i11;
        am amVar = (am) obj;
        Q q4 = amVar.zzc;
        if (q4 == Q.foxtrot) {
            q4 = Q.bravo();
            amVar.zzc = q4;
        }
        Q q5 = q4;
        aj ajVar = (aj) obj;
        ae aeVar = ajVar.zzb;
        if (aeVar.bravo) {
            ajVar.zzb = aeVar.clone();
        }
        while (i4 < i5) {
            int juliet = AbstractC1426u.juliet(bArr, i4, c1425t);
            int i12 = c1425t.alpha;
            B b2 = this.alpha;
            ac acVar = c1425t.delta;
            if (i12 != 11) {
                if ((i12 & 7) == 2) {
                    acVar.getClass();
                    byte[] bArr2 = bArr;
                    i10 = i5;
                    c1425t2 = c1425t;
                    i4 = AbstractC1426u.india(i12, bArr2, juliet, i10, q5, c1425t2);
                    bArr = bArr2;
                } else {
                    i4 = AbstractC1426u.papa(i12, bArr, juliet, i5, c1425t);
                }
            } else {
                i10 = i5;
                c1425t2 = c1425t;
                int i13 = 0;
                AbstractC1431z abstractC1431z = null;
                while (true) {
                    if (juliet < i10) {
                        i11 = AbstractC1426u.juliet(bArr, juliet, c1425t2);
                        int i14 = c1425t2.alpha;
                        int i15 = i14 >>> 3;
                        int i16 = i14 & 7;
                        if (i15 != 2) {
                            if (i15 == 3 && i16 == 2) {
                                juliet = AbstractC1426u.alpha(bArr, i11, c1425t2);
                                abstractC1431z = (AbstractC1431z) c1425t2.charlie;
                            }
                            if (i14 != 12) {
                                break;
                            } else {
                                juliet = AbstractC1426u.papa(i14, bArr, i11, i10, c1425t2);
                            }
                        } else if (i16 == 0) {
                            juliet = AbstractC1426u.juliet(bArr, i11, c1425t2);
                            i13 = c1425t2.alpha;
                            acVar.getClass();
                        } else if (i14 != 12) {
                        }
                    } else {
                        i11 = juliet;
                        break;
                    }
                }
                if (abstractC1431z != null) {
                    q5.charlie((i13 << 3) | 2, abstractC1431z);
                }
                i4 = i11;
            }
            i5 = i10;
            c1425t = c1425t2;
        }
        if (i4 == i5) {
        } else {
            throw new zzer("Failed to parse the message.");
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final int foxtrot(am amVar) {
        int hashCode = amVar.zzc.hashCode();
        if (this.charlie) {
            return ((aj) amVar).zzb.alpha.hashCode() + (hashCode * 53);
        }
        return hashCode;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final int golf(am amVar) {
        Q q4 = amVar.zzc;
        int i4 = q4.delta;
        if (i4 == -1) {
            i4 = 0;
            for (int i5 = 0; i5 < q4.alpha; i5++) {
                int i10 = q4.bravo[i5] >>> 3;
                AbstractC1431z abstractC1431z = (AbstractC1431z) q4.charlie[i5];
                int romeo = aa.romeo(8);
                int romeo2 = aa.romeo(i10) + aa.romeo(16);
                int romeo3 = aa.romeo(24);
                int hotel = abstractC1431z.hotel();
                i4 += romeo + romeo + romeo2 + ao.ad.fuchsia(hotel, hotel, romeo3);
            }
            q4.delta = i4;
        }
        if (this.charlie) {
            O o5 = ((aj) amVar).zzb.alpha;
            int i11 = o5.purple;
            int i12 = 0;
            for (int i13 = 0; i13 < i11; i13++) {
                i12 += ae.india(o5.charlie(i13));
            }
            Iterator it = o5.alpha().iterator();
            while (it.hasNext()) {
                i12 += ae.india((Map.Entry) it.next());
            }
            return i4 + i12;
        }
        return i4;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final boolean hotel(am amVar, am amVar2) {
        if (!amVar.zzc.equals(amVar2.zzc)) {
            return false;
        }
        if (this.charlie) {
            return ((aj) amVar).zzb.equals(((aj) amVar2).zzb);
        }
        return true;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_barcode_bundled.M
    public final void india(Object obj, ax axVar) {
        Iterator charlie = ((aj) obj).zzb.charlie();
        if (!charlie.hasNext()) {
            Q q4 = ((am) obj).zzc;
            for (int i4 = 0; i4 < q4.alpha; i4++) {
                int i5 = q4.bravo[i4] >>> 3;
                Object obj2 = q4.charlie[i4];
                axVar.getClass();
                boolean z2 = obj2 instanceof AbstractC1431z;
                aa aaVar = (aa) axVar.alpha;
                if (z2) {
                    aaVar.bronze(11);
                    aaVar.blue(2, i5);
                    aaVar.victor(3, (AbstractC1431z) obj2);
                    aaVar.bronze(12);
                } else {
                    aaVar.bronze(11);
                    aaVar.blue(2, i5);
                    aaVar.bronze(26);
                    am amVar = (am) ((B) obj2);
                    aaVar.bronze(amVar.charlie());
                    amVar.lima(aaVar);
                    aaVar.bronze(12);
                }
            }
            return;
        }
        ((ak) ((Map.Entry) charlie.next()).getKey()).getClass();
        throw null;
    }
}
