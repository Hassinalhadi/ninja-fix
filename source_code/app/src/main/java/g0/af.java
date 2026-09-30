package g0;

import a0.AbstractC0367u;
import a0.C0348b;
import a0.C0352f;
import a0.C0360n;
import a0.C0366t;
import a0.InterfaceC0364r;
import a0.ao;
import android.graphics.Bitmap;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import c0.C0801a;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import p0.AbstractC2264a;
import s6.AbstractC2627c7;

/* loaded from: classes3.dex */
public final class af extends ad {
    public final C1723c bravo;
    public String charlie;
    public boolean delta;
    public final C1721a echo;
    public Lambda foxtrot;
    public final ax golf;
    public C0360n hotel;
    public final ax india;
    public long juliet;
    public float kilo;
    public float lima;
    public final ae mike;

    public af(C1723c c1723c) {
        this.bravo = c1723c;
        c1723c.india = new ae(this, 0);
        this.charlie = "";
        this.delta = true;
        this.echo = new C1721a();
        this.foxtrot = C1727g.red;
        this.golf = C0564b.zulu(null);
        this.india = C0564b.zulu(new Z.e(0L));
        this.juliet = 9205357640488583168L;
        this.kilo = 1.0f;
        this.lima = 1.0f;
        this.mike = new ae(this, 1);
    }

    @Override // g0.ad
    public final void alpha(c0.d dVar) {
        echo(dVar, 1.0f, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0062, code lost:
    
        if (r3 != r8) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0104, code lost:
    
        if (r9.delta == r3) goto L49;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void echo(c0.d dVar, float f5, AbstractC0367u abstractC0367u) {
        int i4;
        boolean z2;
        C1721a c1721a;
        C0360n c0360n;
        C0352f c0352f;
        char c3;
        long j5;
        C0352f c0352f2;
        C0352f c0352f3;
        int i5;
        int i10;
        int i11;
        AbstractC0367u abstractC0367u2 = abstractC0367u;
        C1723c c1723c = this.bravo;
        boolean z10 = c1723c.delta;
        ax axVar = this.golf;
        if (z10 && c1723c.echo != 16) {
            AbstractC0367u abstractC0367u3 = (AbstractC0367u) ((t0) axVar).getValue();
            List list = ah.alpha;
            if (!(abstractC0367u3 instanceof C0360n) ? abstractC0367u3 == null : !((i11 = ((C0360n) abstractC0367u3).charlie) != 5 && i11 != 3)) {
                if (!(abstractC0367u2 instanceof C0360n) ? abstractC0367u2 == null : !((i10 = ((C0360n) abstractC0367u2).charlie) != 5 && i10 != 3)) {
                    i4 = 1;
                    z2 = this.delta;
                    c1721a = this.echo;
                    if (!z2 && Z.e.alpha(this.juliet, dVar.bravo())) {
                        c0352f3 = c1721a.alpha;
                        if (c0352f3 == null) {
                            i5 = c0352f3.alpha();
                        } else {
                            i5 = 0;
                        }
                    }
                    if (i4 != 1) {
                        c0360n = new C0360n(c1723c.echo, 5);
                    } else {
                        c0360n = null;
                    }
                    this.hotel = c0360n;
                    float intBitsToFloat = Float.intBitsToFloat((int) (dVar.bravo() >> 32));
                    ax axVar2 = this.india;
                    this.kilo = intBitsToFloat / Float.intBitsToFloat((int) (((Z.e) ((t0) axVar2).getValue()).alpha >> 32));
                    this.lima = Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)) / Float.intBitsToFloat((int) (((Z.e) ((t0) axVar2).getValue()).alpha & 4294967295L));
                    long ceil = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.bravo() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)))) & 4294967295L);
                    Q0.n layoutDirection = dVar.getLayoutDirection();
                    c0352f = c1721a.alpha;
                    C0348b c0348b = c1721a.bravo;
                    if (c0352f == null && c0348b != null) {
                        int i12 = (int) (ceil >> 32);
                        Bitmap bitmap = c0352f.alpha;
                        c3 = ' ';
                        j5 = 4294967295L;
                        if (i12 <= bitmap.getWidth()) {
                            if (((int) (ceil & 4294967295L)) <= bitmap.getHeight()) {
                            }
                        }
                    } else {
                        c3 = ' ';
                        j5 = 4294967295L;
                    }
                    c0352f = ao.foxtrot((int) (ceil >> c3), (int) (ceil & j5), i4, 24);
                    c0348b = ao.alpha(c0352f);
                    c1721a.alpha = c0352f;
                    c1721a.bravo = c0348b;
                    c1721a.delta = i4;
                    c1721a.charlie = ceil;
                    long bravo = AbstractC2627c7.bravo(ceil);
                    c0.b bVar = c1721a.echo;
                    C0801a c0801a = bVar.alpha;
                    Q0.d dVar2 = c0801a.alpha;
                    Q0.n nVar = c0801a.bravo;
                    InterfaceC0364r interfaceC0364r = c0801a.charlie;
                    long j6 = c0801a.delta;
                    c0801a.alpha = dVar;
                    c0801a.bravo = layoutDirection;
                    c0801a.charlie = c0348b;
                    c0801a.delta = bravo;
                    c0348b.golf();
                    ao.ad.november(bVar, C0366t.bravo, 0L, 0L, 0.0f, null, 62);
                    this.mike.invoke(bVar);
                    c0348b.november();
                    C0801a c0801a2 = bVar.alpha;
                    c0801a2.alpha = dVar2;
                    c0801a2.bravo = nVar;
                    c0801a2.charlie = interfaceC0364r;
                    c0801a2.delta = j6;
                    c0352f.alpha.prepareToDraw();
                    this.delta = false;
                    this.juliet = dVar.bravo();
                    if (abstractC0367u2 == null) {
                        if (((AbstractC0367u) ((t0) axVar).getValue()) != null) {
                            abstractC0367u2 = (AbstractC0367u) ((t0) axVar).getValue();
                        } else {
                            abstractC0367u2 = this.hotel;
                        }
                    }
                    AbstractC0367u abstractC0367u4 = abstractC0367u2;
                    c0352f2 = c1721a.alpha;
                    if (c0352f2 == null) {
                        AbstractC2264a.bravo("drawCachedImage must be invoked first before attempting to draw the result into another destination");
                    }
                    ao.ad.hotel(dVar, c0352f2, c1721a.charlie, 0L, f5, abstractC0367u4, 0, 858);
                }
            }
        }
        i4 = 0;
        z2 = this.delta;
        c1721a = this.echo;
        if (!z2) {
            c0352f3 = c1721a.alpha;
            if (c0352f3 == null) {
            }
        }
        if (i4 != 1) {
        }
        this.hotel = c0360n;
        float intBitsToFloat2 = Float.intBitsToFloat((int) (dVar.bravo() >> 32));
        ax axVar22 = this.india;
        this.kilo = intBitsToFloat2 / Float.intBitsToFloat((int) (((Z.e) ((t0) axVar22).getValue()).alpha >> 32));
        this.lima = Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)) / Float.intBitsToFloat((int) (((Z.e) ((t0) axVar22).getValue()).alpha & 4294967295L));
        long ceil2 = (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.bravo() >> 32)))) << 32) | (((int) Math.ceil(Float.intBitsToFloat((int) (dVar.bravo() & 4294967295L)))) & 4294967295L);
        Q0.n layoutDirection2 = dVar.getLayoutDirection();
        c0352f = c1721a.alpha;
        C0348b c0348b2 = c1721a.bravo;
        if (c0352f == null) {
        }
        c3 = ' ';
        j5 = 4294967295L;
        c0352f = ao.foxtrot((int) (ceil2 >> c3), (int) (ceil2 & j5), i4, 24);
        c0348b2 = ao.alpha(c0352f);
        c1721a.alpha = c0352f;
        c1721a.bravo = c0348b2;
        c1721a.delta = i4;
        c1721a.charlie = ceil2;
        long bravo2 = AbstractC2627c7.bravo(ceil2);
        c0.b bVar2 = c1721a.echo;
        C0801a c0801a3 = bVar2.alpha;
        Q0.d dVar22 = c0801a3.alpha;
        Q0.n nVar2 = c0801a3.bravo;
        InterfaceC0364r interfaceC0364r2 = c0801a3.charlie;
        long j62 = c0801a3.delta;
        c0801a3.alpha = dVar;
        c0801a3.bravo = layoutDirection2;
        c0801a3.charlie = c0348b2;
        c0801a3.delta = bravo2;
        c0348b2.golf();
        ao.ad.november(bVar2, C0366t.bravo, 0L, 0L, 0.0f, null, 62);
        this.mike.invoke(bVar2);
        c0348b2.november();
        C0801a c0801a22 = bVar2.alpha;
        c0801a22.alpha = dVar22;
        c0801a22.bravo = nVar2;
        c0801a22.charlie = interfaceC0364r2;
        c0801a22.delta = j62;
        c0352f.alpha.prepareToDraw();
        this.delta = false;
        this.juliet = dVar.bravo();
        if (abstractC0367u2 == null) {
        }
        AbstractC0367u abstractC0367u42 = abstractC0367u2;
        c0352f2 = c1721a.alpha;
        if (c0352f2 == null) {
        }
        ao.ad.hotel(dVar, c0352f2, c1721a.charlie, 0L, f5, abstractC0367u42, 0, 858);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Params: \tname: ");
        sb2.append(this.charlie);
        sb2.append("\n\tviewportWidth: ");
        ax axVar = this.india;
        sb2.append(Float.intBitsToFloat((int) (((Z.e) ((t0) axVar).getValue()).alpha >> 32)));
        sb2.append("\n\tviewportHeight: ");
        sb2.append(Float.intBitsToFloat((int) (((Z.e) ((t0) axVar).getValue()).alpha & 4294967295L)));
        sb2.append("\n");
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }
}
