package c0;

import J2.t;
import Q0.n;
import a0.AbstractC0362p;
import a0.AbstractC0367u;
import a0.C0352f;
import a0.C0354h;
import a0.C0355i;
import a0.C0360n;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ak;
import a0.ao;
import android.graphics.Paint;
import android.graphics.Shader;
import av.ah;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import t6.M2;

/* loaded from: classes3.dex */
public final class b implements d {
    public final C0801a alpha;
    public final t purple;
    public Be.e red;
    public Be.e silver;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, c0.a] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, J2.t] */
    public b() {
        Q0.e eVar = c.alpha;
        n nVar = n.alpha;
        f fVar = f.alpha;
        ?? obj = new Object();
        obj.alpha = eVar;
        obj.bravo = nVar;
        obj.charlie = fVar;
        obj.delta = 0L;
        this.alpha = obj;
        ?? obj2 = new Object();
        obj2.red = this;
        obj2.alpha = new ah(12, (Object) obj2);
        this.purple = obj2;
    }

    public static ak charlie(b bVar, long j5, e eVar, float f5, int i4) {
        ak golf = bVar.golf(eVar);
        if (f5 != 1.0f) {
            j5 = C0366t.bravo(C0366t.delta(j5) * f5, j5);
        }
        Be.e eVar2 = (Be.e) golf;
        if (!C0366t.charlie(ao.charlie(((Paint) eVar2.bravo).getColor()), j5)) {
            eVar2.oscar(j5);
        }
        if (((Shader) eVar2.charlie) != null) {
            eVar2.sierra(null);
        }
        if (!Intrinsics.areEqual((AbstractC0367u) eVar2.delta, null)) {
            eVar2.papa(null);
        }
        if (eVar2.alpha != i4) {
            eVar2.november(i4);
        }
        if (((Paint) eVar2.bravo).isFilterBitmap()) {
            return golf;
        }
        eVar2.quebec(1);
        return golf;
    }

    @Override // Q0.d
    public final float alpha() {
        return this.alpha.alpha.alpha();
    }

    @Override // c0.d
    public final void azure(C0352f c0352f, long j5, long j6, long j7, float f5, AbstractC0367u abstractC0367u, int i4) {
        this.alpha.charlie.foxtrot(c0352f, j5, j6, j7, delta(null, g.alpha, f5, abstractC0367u, 3, i4));
    }

    @Override // Q0.d
    public final long beige(float f5) {
        return Q0.c.hotel(this, gold(f5));
    }

    @Override // c0.d
    public final long bravo() {
        return this.purple.oscar();
    }

    @Override // Q0.d
    public final float crimson(int i4) {
        return i4 / alpha();
    }

    public final ak delta(AbstractC0362p abstractC0362p, e eVar, float f5, AbstractC0367u abstractC0367u, int i4, int i5) {
        ak golf = golf(eVar);
        if (abstractC0362p != null) {
            abstractC0362p.alpha(f5, this.purple.oscar(), golf);
        } else {
            Be.e eVar2 = (Be.e) golf;
            if (((Shader) eVar2.charlie) != null) {
                eVar2.sierra(null);
            }
            long charlie = ao.charlie(((Paint) eVar2.bravo).getColor());
            long j5 = C0366t.bravo;
            if (!C0366t.charlie(charlie, j5)) {
                eVar2.oscar(j5);
            }
            if (((Paint) eVar2.bravo).getAlpha() / 255.0f != f5) {
                eVar2.mike(f5);
            }
        }
        Be.e eVar3 = (Be.e) golf;
        if (!Intrinsics.areEqual((AbstractC0367u) eVar3.delta, abstractC0367u)) {
            eVar3.papa(abstractC0367u);
        }
        if (eVar3.alpha != i4) {
            eVar3.november(i4);
        }
        if (((Paint) eVar3.bravo).isFilterBitmap() == i5) {
            return golf;
        }
        eVar3.quebec(i5);
        return golf;
    }

    @Override // c0.d
    public final void echo(C0354h c0354h, long j5, float f5, e eVar) {
        this.alpha.charlie.echo(c0354h, charlie(this, j5, eVar, f5, 3));
    }

    @Override // c0.d
    public final void emerald(long j5, long j6, long j7, float f5, e eVar, int i4) {
        int i5 = (int) (j6 >> 32);
        int i10 = (int) (j6 & 4294967295L);
        this.alpha.charlie.sierra(Float.intBitsToFloat(i5), Float.intBitsToFloat(i10), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (4294967295L & j7)) + Float.intBitsToFloat(i10), charlie(this, j5, eVar, f5, i4));
    }

    public final void foxtrot(C0352f c0352f, C0360n c0360n) {
        this.alpha.charlie.oscar(c0352f, delta(null, g.alpha, 1.0f, c0360n, 3, 1));
    }

    @Override // c0.d
    public final n getLayoutDirection() {
        return this.alpha.bravo;
    }

    @Override // Q0.d
    public final float gold(float f5) {
        return f5 / alpha();
    }

    public final ak golf(e eVar) {
        if (Intrinsics.areEqual(eVar, g.alpha)) {
            Be.e eVar2 = this.red;
            if (eVar2 == null) {
                Be.e golf = ao.golf();
                golf.yankee(0);
                this.red = golf;
                return golf;
            }
            return eVar2;
        }
        if (eVar instanceof h) {
            Be.e eVar3 = this.silver;
            if (eVar3 == null) {
                eVar3 = ao.golf();
                eVar3.yankee(1);
                this.silver = eVar3;
            }
            Paint paint = (Paint) eVar3.bravo;
            float strokeWidth = paint.getStrokeWidth();
            h hVar = (h) eVar;
            float f5 = hVar.alpha;
            if (strokeWidth != f5) {
                eVar3.xray(f5);
            }
            int india = eVar3.india();
            int i4 = hVar.charlie;
            if (india != i4) {
                eVar3.victor(i4);
            }
            float strokeMiter = paint.getStrokeMiter();
            float f10 = hVar.bravo;
            if (strokeMiter != f10) {
                ((Paint) eVar3.bravo).setStrokeMiter(f10);
            }
            int juliet = eVar3.juliet();
            int i5 = hVar.delta;
            if (juliet != i5) {
                eVar3.whiskey(i5);
            }
            C0355i c0355i = (C0355i) eVar3.echo;
            C0355i c0355i2 = hVar.echo;
            if (!Intrinsics.areEqual(c0355i, c0355i2)) {
                eVar3.romeo(c0355i2);
            }
            return eVar3;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // Q0.d
    public final float indigo() {
        return this.alpha.alpha.indigo();
    }

    @Override // Q0.d
    public final float lavender(float f5) {
        return alpha() * f5;
    }

    @Override // c0.d
    public final t lime() {
        return this.purple;
    }

    @Override // Q0.d
    public final /* synthetic */ long mike(long j5) {
        return Q0.c.echo(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ int ochre(float f5) {
        return Q0.c.bravo(this, f5);
    }

    @Override // c0.d
    public final void olive(C0354h c0354h, AbstractC0362p abstractC0362p, float f5, e eVar, int i4) {
        this.alpha.charlie.echo(c0354h, delta(abstractC0362p, eVar, f5, null, i4, 1));
    }

    @Override // c0.d
    public final long orange() {
        return M2.charlie(this.purple.oscar());
    }

    @Override // Q0.d
    public final /* synthetic */ float quebec(long j5) {
        return Q0.c.delta(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ long red(long j5) {
        return Q0.c.golf(j5, this);
    }

    @Override // Q0.d
    public final /* synthetic */ float teal(long j5) {
        return Q0.c.foxtrot(j5, this);
    }

    @Override // c0.d
    public final void uniform(long j5, float f5, long j6, e eVar) {
        this.alpha.charlie.tango(f5, j6, charlie(this, j5, eVar, 1.0f, 3));
    }

    @Override // c0.d
    public final void whiskey(long j5, long j6, long j7, float f5, int i4) {
        InterfaceC0364r interfaceC0364r = this.alpha.charlie;
        Be.e eVar = this.silver;
        if (eVar == null) {
            eVar = ao.golf();
            eVar.yankee(1);
            this.silver = eVar;
        }
        if (!C0366t.charlie(ao.charlie(((Paint) eVar.bravo).getColor()), j5)) {
            eVar.oscar(j5);
        }
        if (((Shader) eVar.charlie) != null) {
            eVar.sierra(null);
        }
        if (!Intrinsics.areEqual((AbstractC0367u) eVar.delta, null)) {
            eVar.papa(null);
        }
        if (eVar.alpha != 3) {
            eVar.november(3);
        }
        Paint paint = (Paint) eVar.bravo;
        if (paint.getStrokeWidth() != f5) {
            eVar.xray(f5);
        }
        if (paint.getStrokeMiter() != 4.0f) {
            ((Paint) eVar.bravo).setStrokeMiter(4.0f);
        }
        if (eVar.india() != i4) {
            eVar.victor(i4);
        }
        if (eVar.juliet() != 0) {
            eVar.whiskey(0);
        }
        if (!Intrinsics.areEqual((C0355i) eVar.echo, null)) {
            eVar.romeo(null);
        }
        if (!paint.isFilterBitmap()) {
            eVar.quebec(1);
        }
        interfaceC0364r.alpha(j6, j7, eVar);
    }

    @Override // c0.d
    public final void white(long j5, float f5, float f10, long j6, long j7, float f11, h hVar) {
        int i4 = (int) (j6 >> 32);
        int i5 = (int) (j6 & 4294967295L);
        this.alpha.charlie.hotel(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i5), f5, f10, charlie(this, j5, hVar, f11, 3));
    }

    @Override // c0.d
    public final void zulu(long j5, long j6, long j7, long j10, e eVar) {
        int i4 = (int) (j6 >> 32);
        int i5 = (int) (j6 & 4294967295L);
        this.alpha.charlie.charlie(Float.intBitsToFloat(i4), Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j7 >> 32)) + Float.intBitsToFloat(i4), Float.intBitsToFloat((int) (j7 & 4294967295L)) + Float.intBitsToFloat(i5), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)), charlie(this, j5, eVar, 1.0f, 3));
    }
}
