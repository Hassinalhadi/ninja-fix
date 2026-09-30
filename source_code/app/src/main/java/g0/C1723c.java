package g0;

import a0.AbstractC0358l;
import a0.AbstractC0362p;
import a0.C0347ag;
import a0.C0354h;
import a0.C0366t;
import a0.au;
import bx.C0769g;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: g0.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1723c extends ad {
    public float[] bravo;
    public C0354h hotel;
    public Lambda india;
    public float lima;
    public float mike;
    public float november;
    public float quebec;
    public float romeo;
    public final ArrayList charlie = new ArrayList();
    public boolean delta = true;
    public long echo = C0366t.kilo;
    public List foxtrot = ah.alpha;
    public boolean golf = true;
    public final C0769g juliet = new C0769g(9, this);
    public String kilo = "";
    public float oscar = 1.0f;
    public float papa = 1.0f;
    public boolean sierra = true;

    @Override // g0.ad
    public final void alpha(c0.d dVar) {
        if (this.sierra) {
            float[] fArr = this.bravo;
            if (fArr == null) {
                fArr = C0347ag.alpha();
                this.bravo = fArr;
            } else {
                C0347ag.delta(fArr);
            }
            C0347ag.foxtrot(fArr, this.quebec + this.mike, this.romeo + this.november);
            float f5 = this.lima;
            if (fArr.length >= 16) {
                double d4 = f5 * 0.017453292519943295d;
                float sin = (float) Math.sin(d4);
                float cos = (float) Math.cos(d4);
                float f10 = fArr[0];
                float f11 = fArr[4];
                float f12 = (sin * f11) + (cos * f10);
                float f13 = -sin;
                float f14 = (f11 * cos) + (f10 * f13);
                float f15 = fArr[1];
                float f16 = fArr[5];
                float f17 = (sin * f16) + (cos * f15);
                float f18 = (f16 * cos) + (f15 * f13);
                float f19 = fArr[2];
                float f20 = fArr[6];
                float f21 = (sin * f20) + (cos * f19);
                float f22 = (f20 * cos) + (f19 * f13);
                float f23 = fArr[3];
                float f24 = fArr[7];
                fArr[0] = f12;
                fArr[1] = f17;
                fArr[2] = f21;
                fArr[3] = (sin * f24) + (cos * f23);
                fArr[4] = f14;
                fArr[5] = f18;
                fArr[6] = f22;
                fArr[7] = (cos * f24) + (f13 * f23);
            }
            float f25 = this.oscar;
            float f26 = this.papa;
            if (fArr.length >= 16) {
                fArr[0] = fArr[0] * f25;
                fArr[1] = fArr[1] * f25;
                fArr[2] = fArr[2] * f25;
                fArr[3] = fArr[3] * f25;
                fArr[4] = fArr[4] * f26;
                fArr[5] = fArr[5] * f26;
                fArr[6] = fArr[6] * f26;
                fArr[7] = fArr[7] * f26;
                fArr[8] = fArr[8] * 1.0f;
                fArr[9] = fArr[9] * 1.0f;
                fArr[10] = fArr[10] * 1.0f;
                fArr[11] = fArr[11] * 1.0f;
            }
            C0347ag.foxtrot(fArr, -this.mike, -this.november);
            this.sierra = false;
        }
        if (this.golf) {
            if (!this.foxtrot.isEmpty()) {
                C0354h c0354h = this.hotel;
                if (c0354h == null) {
                    c0354h = AbstractC0358l.alpha();
                    this.hotel = c0354h;
                }
                ac.bravo(this.foxtrot, c0354h);
            }
            this.golf = false;
        }
        J2.t lime = dVar.lime();
        long oscar = lime.oscar();
        lime.mike().golf();
        try {
            av.ah ahVar = (av.ah) lime.alpha;
            float[] fArr2 = this.bravo;
            J2.t tVar = (J2.t) ahVar.purple;
            if (fArr2 != null) {
                tVar.mike().juliet(fArr2);
            }
            C0354h c0354h2 = this.hotel;
            if (!this.foxtrot.isEmpty() && c0354h2 != null) {
                tVar.mike().kilo(c0354h2);
            }
            ArrayList arrayList = this.charlie;
            int size = arrayList.size();
            for (int i4 = 0; i4 < size; i4++) {
                ((ad) arrayList.get(i4)).alpha(dVar);
            }
        } finally {
            ao.ad.coral(lime, oscar);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.Lambda] */
    @Override // g0.ad
    public final Function1 bravo() {
        return this.india;
    }

    @Override // g0.ad
    public final void delta(C0769g c0769g) {
        this.india = c0769g;
    }

    public final void echo(int i4, ad adVar) {
        ArrayList arrayList = this.charlie;
        if (i4 < arrayList.size()) {
            arrayList.set(i4, adVar);
        } else {
            arrayList.add(adVar);
        }
        golf(adVar);
        adVar.delta(this.juliet);
        charlie();
    }

    public final void foxtrot(long j5) {
        if (this.delta && j5 != 16) {
            long j6 = this.echo;
            if (j6 == 16) {
                this.echo = j5;
                return;
            }
            List list = ah.alpha;
            if (C0366t.hotel(j6) != C0366t.hotel(j5) || C0366t.golf(j6) != C0366t.golf(j5) || C0366t.echo(j6) != C0366t.echo(j5)) {
                this.delta = false;
                this.echo = C0366t.kilo;
            }
        }
    }

    public final void golf(ad adVar) {
        if (adVar instanceof C1728h) {
            C1728h c1728h = (C1728h) adVar;
            AbstractC0362p abstractC0362p = c1728h.bravo;
            if (this.delta && abstractC0362p != null) {
                if (abstractC0362p instanceof au) {
                    foxtrot(((au) abstractC0362p).alpha);
                } else {
                    this.delta = false;
                    this.echo = C0366t.kilo;
                }
            }
            AbstractC0362p abstractC0362p2 = c1728h.golf;
            if (this.delta && abstractC0362p2 != null) {
                if (abstractC0362p2 instanceof au) {
                    foxtrot(((au) abstractC0362p2).alpha);
                    return;
                } else {
                    this.delta = false;
                    this.echo = C0366t.kilo;
                    return;
                }
            }
            return;
        }
        if (adVar instanceof C1723c) {
            C1723c c1723c = (C1723c) adVar;
            if (c1723c.delta && this.delta) {
                foxtrot(c1723c.echo);
            } else {
                this.delta = false;
                this.echo = C0366t.kilo;
            }
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VGroup: ");
        sb2.append(this.kilo);
        ArrayList arrayList = this.charlie;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ad adVar = (ad) arrayList.get(i4);
            sb2.append("\t");
            sb2.append(adVar.toString());
            sb2.append("\n");
        }
        return sb2.toString();
    }
}
