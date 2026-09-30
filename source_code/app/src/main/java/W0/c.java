package W0;

import id.C1915c;
import java.util.ArrayList;
import java.util.Arrays;

/* loaded from: classes3.dex */
public final class c {
    public static boolean quebec;
    public final e delta;
    public final C1915c mike;
    public b papa;
    public int alpha = 1000;
    public boolean bravo = false;
    public int charlie = 0;
    public int echo = 32;
    public int foxtrot = 32;
    public boolean hotel = false;
    public boolean[] india = new boolean[32];
    public int juliet = 1;
    public int kilo = 0;
    public int lima = 32;
    public f[] november = new f[1000];
    public int oscar = 0;
    public b[] golf = new b[32];

    /* JADX WARN: Type inference failed for: r2v2, types: [W0.b, W0.e] */
    public c() {
        sierra();
        C1915c c1915c = new C1915c(19, false);
        c1915c.purple = new d();
        c1915c.red = new d();
        c1915c.silver = new f[32];
        this.mike = c1915c;
        ?? bVar = new b(c1915c);
        bVar.foxtrot = new f[128];
        bVar.golf = new f[128];
        bVar.hotel = 0;
        bVar.india = new J2.c((e) bVar);
        this.delta = bVar;
        this.papa = new b(c1915c);
    }

    public static int november(Object obj) {
        f fVar = ((Z0.c) obj).india;
        if (fVar != null) {
            return (int) (fVar.teal + 0.5f);
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    public final f alpha(int i4) {
        d dVar = (d) this.mike.red;
        int i5 = dVar.purple;
        f fVar = null;
        if (i5 > 0) {
            int i10 = i5 - 1;
            ?? r32 = dVar.alpha;
            ?? r4 = r32[i10];
            r32[i10] = 0;
            dVar.purple = i10;
            fVar = r4;
        }
        f fVar2 = fVar;
        if (fVar2 == null) {
            fVar2 = new f(i4);
            fVar2.e = i4;
        } else {
            fVar2.charlie();
            fVar2.e = i4;
        }
        int i11 = this.oscar;
        int i12 = this.alpha;
        if (i11 >= i12) {
            int i13 = i12 * 2;
            this.alpha = i13;
            this.november = (f[]) Arrays.copyOf(this.november, i13);
        }
        f[] fVarArr = this.november;
        int i14 = this.oscar;
        this.oscar = i14 + 1;
        fVarArr[i14] = fVar2;
        return fVar2;
    }

    public final void bravo(f fVar, f fVar2, int i4, float f5, f fVar3, f fVar4, int i5, int i10) {
        b lima = lima();
        if (fVar2 == fVar3) {
            lima.delta.golf(fVar, 1.0f);
            lima.delta.golf(fVar4, 1.0f);
            lima.delta.golf(fVar2, -2.0f);
        } else if (f5 == 0.5f) {
            lima.delta.golf(fVar, 1.0f);
            lima.delta.golf(fVar2, -1.0f);
            lima.delta.golf(fVar3, -1.0f);
            lima.delta.golf(fVar4, 1.0f);
            if (i4 > 0 || i5 > 0) {
                lima.bravo = (-i4) + i5;
            }
        } else if (f5 <= 0.0f) {
            lima.delta.golf(fVar, -1.0f);
            lima.delta.golf(fVar2, 1.0f);
            lima.bravo = i4;
        } else if (f5 >= 1.0f) {
            lima.delta.golf(fVar4, -1.0f);
            lima.delta.golf(fVar3, 1.0f);
            lima.bravo = -i5;
        } else {
            float f10 = 1.0f - f5;
            lima.delta.golf(fVar, f10 * 1.0f);
            lima.delta.golf(fVar2, f10 * (-1.0f));
            lima.delta.golf(fVar3, (-1.0f) * f5);
            lima.delta.golf(fVar4, 1.0f * f5);
            if (i4 > 0 || i5 > 0) {
                lima.bravo = (i5 * f5) + ((-i4) * f10);
            }
        }
        if (i10 != 8) {
            lima.alpha(this, i10);
        }
        charlie(lima);
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x00d3, code lost:
    
        if (r4.f2192d <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00d6, code lost:
    
        r12 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x00e0, code lost:
    
        if (r4.f2192d <= 1) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x00f5, code lost:
    
        if (r4.f2192d <= 1) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x00f8, code lost:
    
        r14 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0102, code lost:
    
        if (r4.f2192d <= 1) goto L87;
     */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:146:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void charlie(b bVar) {
        boolean z2;
        boolean z10;
        f fVar;
        f foxtrot;
        ArrayList arrayList;
        if (this.kilo + 1 >= this.lima || this.juliet + 1 >= this.foxtrot) {
            oscar();
        }
        if (!bVar.echo) {
            if (this.golf.length != 0) {
                boolean z11 = false;
                while (!z11) {
                    int delta = bVar.delta.delta();
                    int i4 = 0;
                    while (true) {
                        arrayList = bVar.charlie;
                        if (i4 >= delta) {
                            break;
                        }
                        f echo = bVar.delta.echo(i4);
                        if (echo.red != -1 || echo.white) {
                            arrayList.add(echo);
                        }
                        i4++;
                    }
                    int size = arrayList.size();
                    if (size > 0) {
                        for (int i5 = 0; i5 < size; i5++) {
                            f fVar2 = (f) arrayList.get(i5);
                            if (fVar2.white) {
                                bVar.hotel(this, fVar2, true);
                            } else {
                                bVar.india(this, this.golf[fVar2.red], true);
                            }
                        }
                        arrayList.clear();
                    } else {
                        z11 = true;
                    }
                }
                if (bVar.alpha != null && bVar.delta.delta() == 0) {
                    bVar.echo = true;
                    this.bravo = true;
                }
            }
            if (!bVar.echo()) {
                float f5 = bVar.bravo;
                float f10 = 0.0f;
                if (f5 < 0.0f) {
                    bVar.bravo = f5 * (-1.0f);
                    a aVar = bVar.delta;
                    int i10 = aVar.hotel;
                    for (int i11 = 0; i10 != -1 && i11 < aVar.alpha; i11++) {
                        float[] fArr = aVar.golf;
                        fArr[i10] = fArr[i10] * (-1.0f);
                        i10 = aVar.foxtrot[i10];
                    }
                }
                int delta2 = bVar.delta.delta();
                float f11 = 0.0f;
                float f12 = 0.0f;
                f fVar3 = null;
                f fVar4 = null;
                int i12 = 0;
                boolean z12 = false;
                boolean z13 = false;
                while (i12 < delta2) {
                    float foxtrot2 = bVar.delta.foxtrot(i12);
                    f echo2 = bVar.delta.echo(i12);
                    float f13 = f10;
                    if (echo2.e == 1) {
                        if (fVar3 != null) {
                            if (f11 <= foxtrot2) {
                                if (!z12) {
                                    if (echo2.f2192d > 1) {
                                    }
                                }
                            }
                            z12 = true;
                        }
                        fVar3 = echo2;
                        f11 = foxtrot2;
                    } else if (fVar3 == null && foxtrot2 < f13) {
                        if (fVar4 != null) {
                            if (f12 <= foxtrot2) {
                                if (!z13) {
                                    if (echo2.f2192d > 1) {
                                    }
                                }
                            }
                            z13 = true;
                        }
                        fVar4 = echo2;
                        f12 = foxtrot2;
                    }
                    i12++;
                    f10 = f13;
                }
                float f14 = f10;
                if (fVar3 == null) {
                    fVar3 = fVar4;
                }
                if (fVar3 == null) {
                    z10 = true;
                } else {
                    bVar.golf(fVar3);
                    z10 = false;
                }
                if (bVar.delta.delta() == 0) {
                    bVar.echo = true;
                }
                if (z10) {
                    if (this.juliet + 1 >= this.foxtrot) {
                        oscar();
                    }
                    f alpha = alpha(3);
                    int i13 = this.charlie + 1;
                    this.charlie = i13;
                    this.juliet++;
                    alpha.purple = i13;
                    C1915c c1915c = this.mike;
                    ((f[]) c1915c.silver)[i13] = alpha;
                    bVar.alpha = alpha;
                    int i14 = this.kilo;
                    hotel(bVar);
                    if (this.kilo == i14 + 1) {
                        b bVar2 = this.papa;
                        bVar2.alpha = null;
                        bVar2.delta.bravo();
                        for (int i15 = 0; i15 < bVar.delta.delta(); i15++) {
                            bVar2.delta.alpha(bVar.delta.echo(i15), bVar.delta.foxtrot(i15), true);
                        }
                        romeo(this.papa);
                        if (alpha.red == -1) {
                            if (bVar.alpha == alpha && (foxtrot = bVar.foxtrot(null, alpha)) != null) {
                                bVar.golf(foxtrot);
                            }
                            if (!bVar.echo) {
                                bVar.alpha.echo(this, bVar);
                            }
                            ((d) c1915c.purple).bravo(bVar);
                            this.kilo--;
                        }
                        z2 = true;
                        fVar = bVar.alpha;
                        if (fVar == null) {
                            if (fVar.e != 1 && bVar.bravo < f14) {
                                return;
                            }
                        } else {
                            return;
                        }
                    }
                }
                z2 = false;
                fVar = bVar.alpha;
                if (fVar == null) {
                }
            } else {
                return;
            }
        } else {
            z2 = false;
        }
        if (!z2) {
            hotel(bVar);
        }
    }

    public final void delta(f fVar, int i4) {
        int i5 = fVar.red;
        if (i5 == -1) {
            fVar.delta(this, i4);
            for (int i10 = 0; i10 < this.charlie + 1; i10++) {
                f fVar2 = ((f[]) this.mike.silver)[i10];
            }
            return;
        }
        if (i5 != -1) {
            b bVar = this.golf[i5];
            if (bVar.echo) {
                bVar.bravo = i4;
                return;
            }
            if (bVar.delta.delta() == 0) {
                bVar.echo = true;
                bVar.bravo = i4;
                return;
            }
            b lima = lima();
            if (i4 < 0) {
                lima.bravo = i4 * (-1);
                lima.delta.golf(fVar, 1.0f);
            } else {
                lima.bravo = i4;
                lima.delta.golf(fVar, -1.0f);
            }
            charlie(lima);
            return;
        }
        b lima2 = lima();
        lima2.alpha = fVar;
        float f5 = i4;
        fVar.teal = f5;
        lima2.bravo = f5;
        lima2.echo = true;
        charlie(lima2);
    }

    public final void echo(f fVar, f fVar2, int i4, int i5) {
        if (i5 == 8 && fVar2.white && fVar.red == -1) {
            fVar.delta(this, fVar2.teal + i4);
            return;
        }
        b lima = lima();
        boolean z2 = false;
        if (i4 != 0) {
            if (i4 < 0) {
                i4 *= -1;
                z2 = true;
            }
            lima.bravo = i4;
        }
        if (!z2) {
            lima.delta.golf(fVar, -1.0f);
            lima.delta.golf(fVar2, 1.0f);
        } else {
            lima.delta.golf(fVar, 1.0f);
            lima.delta.golf(fVar2, -1.0f);
        }
        if (i5 != 8) {
            lima.alpha(this, i5);
        }
        charlie(lima);
    }

    public final void foxtrot(f fVar, f fVar2, int i4, int i5) {
        b lima = lima();
        f mike = mike();
        mike.silver = 0;
        lima.bravo(fVar, fVar2, mike, i4);
        if (i5 != 8) {
            lima.delta.golf(juliet(i5), (int) (lima.delta.charlie(mike) * (-1.0f)));
        }
        charlie(lima);
    }

    public final void golf(f fVar, f fVar2, int i4, int i5) {
        b lima = lima();
        f mike = mike();
        mike.silver = 0;
        lima.charlie(fVar, fVar2, mike, i4);
        if (i5 != 8) {
            lima.delta.golf(juliet(i5), (int) (lima.delta.charlie(mike) * (-1.0f)));
        }
        charlie(lima);
    }

    public final void hotel(b bVar) {
        int i4;
        if (bVar.echo) {
            bVar.alpha.delta(this, bVar.bravo);
        } else {
            b[] bVarArr = this.golf;
            int i5 = this.kilo;
            bVarArr[i5] = bVar;
            f fVar = bVar.alpha;
            fVar.red = i5;
            this.kilo = i5 + 1;
            fVar.echo(this, bVar);
        }
        if (this.bravo) {
            int i10 = 0;
            while (i10 < this.kilo) {
                if (this.golf[i10] == null) {
                    System.out.println("WTF");
                }
                b bVar2 = this.golf[i10];
                if (bVar2 != null && bVar2.echo) {
                    bVar2.alpha.delta(this, bVar2.bravo);
                    ((d) this.mike.purple).bravo(bVar2);
                    this.golf[i10] = null;
                    int i11 = i10 + 1;
                    int i12 = i11;
                    while (true) {
                        i4 = this.kilo;
                        if (i11 >= i4) {
                            break;
                        }
                        b[] bVarArr2 = this.golf;
                        int i13 = i11 - 1;
                        b bVar3 = bVarArr2[i11];
                        bVarArr2[i13] = bVar3;
                        f fVar2 = bVar3.alpha;
                        if (fVar2.red == i11) {
                            fVar2.red = i13;
                        }
                        i12 = i11;
                        i11++;
                    }
                    if (i12 < i4) {
                        this.golf[i12] = null;
                    }
                    this.kilo = i4 - 1;
                    i10--;
                }
                i10++;
            }
            this.bravo = false;
        }
    }

    public final void india() {
        for (int i4 = 0; i4 < this.kilo; i4++) {
            b bVar = this.golf[i4];
            bVar.alpha.teal = bVar.bravo;
        }
    }

    public final f juliet(int i4) {
        if (this.juliet + 1 >= this.foxtrot) {
            oscar();
        }
        f alpha = alpha(4);
        int i5 = this.charlie + 1;
        this.charlie = i5;
        this.juliet++;
        alpha.purple = i5;
        alpha.silver = i4;
        ((f[]) this.mike.silver)[i5] = alpha;
        e eVar = this.delta;
        eVar.india.purple = alpha;
        float[] fArr = alpha.f2189a;
        Arrays.fill(fArr, 0.0f);
        fArr[alpha.silver] = 1.0f;
        eVar.juliet(alpha);
        return alpha;
    }

    public final f kilo(Object obj) {
        if (obj != null) {
            if (this.juliet + 1 >= this.foxtrot) {
                oscar();
            }
            if (obj instanceof Z0.c) {
                Z0.c cVar = (Z0.c) obj;
                f fVar = cVar.india;
                if (fVar == null) {
                    cVar.kilo();
                    fVar = cVar.india;
                }
                int i4 = fVar.purple;
                C1915c c1915c = this.mike;
                if (i4 != -1 && i4 <= this.charlie && ((f[]) c1915c.silver)[i4] != null) {
                    return fVar;
                }
                if (i4 != -1) {
                    fVar.charlie();
                }
                int i5 = this.charlie + 1;
                this.charlie = i5;
                this.juliet++;
                fVar.purple = i5;
                fVar.e = 1;
                ((f[]) c1915c.silver)[i5] = fVar;
                return fVar;
            }
            return null;
        }
        return null;
    }

    public final b lima() {
        Object obj;
        C1915c c1915c = this.mike;
        d dVar = (d) c1915c.purple;
        int i4 = dVar.purple;
        if (i4 > 0) {
            int i5 = i4 - 1;
            Object[] objArr = dVar.alpha;
            obj = objArr[i5];
            objArr[i5] = null;
            dVar.purple = i5;
        } else {
            obj = null;
        }
        b bVar = (b) obj;
        if (bVar == null) {
            return new b(c1915c);
        }
        bVar.alpha = null;
        bVar.delta.bravo();
        bVar.bravo = 0.0f;
        bVar.echo = false;
        return bVar;
    }

    public final f mike() {
        if (this.juliet + 1 >= this.foxtrot) {
            oscar();
        }
        f alpha = alpha(3);
        int i4 = this.charlie + 1;
        this.charlie = i4;
        this.juliet++;
        alpha.purple = i4;
        ((f[]) this.mike.silver)[i4] = alpha;
        return alpha;
    }

    public final void oscar() {
        int i4 = this.echo * 2;
        this.echo = i4;
        this.golf = (b[]) Arrays.copyOf(this.golf, i4);
        C1915c c1915c = this.mike;
        c1915c.silver = (f[]) Arrays.copyOf((f[]) c1915c.silver, this.echo);
        int i5 = this.echo;
        this.india = new boolean[i5];
        this.foxtrot = i5;
        this.lima = i5;
    }

    public final void papa() {
        e eVar = this.delta;
        if (eVar.echo()) {
            india();
            return;
        }
        if (this.hotel) {
            for (int i4 = 0; i4 < this.kilo; i4++) {
                if (!this.golf[i4].echo) {
                    quebec(eVar);
                    return;
                }
            }
            india();
            return;
        }
        quebec(eVar);
    }

    public final void quebec(e eVar) {
        int i4 = 0;
        while (true) {
            if (i4 >= this.kilo) {
                break;
            }
            b bVar = this.golf[i4];
            int i5 = 1;
            if (bVar.alpha.e != 1) {
                float f5 = 0.0f;
                if (bVar.bravo < 0.0f) {
                    boolean z2 = false;
                    int i10 = 0;
                    while (!z2) {
                        i10 += i5;
                        float f10 = Float.MAX_VALUE;
                        int i11 = -1;
                        int i12 = -1;
                        int i13 = 0;
                        int i14 = 0;
                        while (i13 < this.kilo) {
                            b bVar2 = this.golf[i13];
                            if (bVar2.alpha.e != i5 && !bVar2.echo && bVar2.bravo < f5) {
                                int delta = bVar2.delta.delta();
                                int i15 = 0;
                                while (i15 < delta) {
                                    f echo = bVar2.delta.echo(i15);
                                    float charlie = bVar2.delta.charlie(echo);
                                    if (charlie > f5) {
                                        for (int i16 = 0; i16 < 9; i16++) {
                                            float f11 = echo.yellow[i16] / charlie;
                                            if ((f11 < f10 && i16 == i14) || i16 > i14) {
                                                i14 = i16;
                                                i12 = echo.purple;
                                                i11 = i13;
                                                f10 = f11;
                                            }
                                        }
                                    }
                                    i15++;
                                    f5 = 0.0f;
                                }
                            }
                            i13++;
                            f5 = 0.0f;
                            i5 = 1;
                        }
                        if (i11 != -1) {
                            b bVar3 = this.golf[i11];
                            bVar3.alpha.red = -1;
                            bVar3.golf(((f[]) this.mike.silver)[i12]);
                            f fVar = bVar3.alpha;
                            fVar.red = i11;
                            fVar.echo(this, bVar3);
                        } else {
                            z2 = true;
                        }
                        if (i10 > this.juliet / 2) {
                            z2 = true;
                        }
                        f5 = 0.0f;
                        i5 = 1;
                    }
                }
            }
            i4++;
        }
        romeo(eVar);
        india();
    }

    public final void romeo(b bVar) {
        boolean z2;
        int i4 = 0;
        for (int i5 = 0; i5 < this.juliet; i5++) {
            this.india[i5] = false;
        }
        boolean z10 = false;
        int i10 = 0;
        while (!z10) {
            int i11 = 1;
            i10++;
            if (i10 < this.juliet * 2) {
                f fVar = bVar.alpha;
                if (fVar != null) {
                    this.india[fVar.purple] = true;
                }
                f delta = bVar.delta(this.india);
                if (delta != null) {
                    boolean[] zArr = this.india;
                    int i12 = delta.purple;
                    if (!zArr[i12]) {
                        zArr[i12] = true;
                    } else {
                        return;
                    }
                }
                if (delta != null) {
                    float f5 = Float.MAX_VALUE;
                    int i13 = i4;
                    int i14 = -1;
                    while (i13 < this.kilo) {
                        b bVar2 = this.golf[i13];
                        if (bVar2.alpha.e != i11 && !bVar2.echo) {
                            a aVar = bVar2.delta;
                            int i15 = aVar.hotel;
                            if (i15 != -1) {
                                for (int i16 = 0; i15 != -1 && i16 < aVar.alpha; i16++) {
                                    if (aVar.echo[i15] == delta.purple) {
                                        z2 = true;
                                        break;
                                    }
                                    i15 = aVar.foxtrot[i15];
                                }
                            }
                            z2 = false;
                            if (z2) {
                                float charlie = bVar2.delta.charlie(delta);
                                if (charlie < 0.0f) {
                                    float f10 = (-bVar2.bravo) / charlie;
                                    if (f10 < f5) {
                                        f5 = f10;
                                        i14 = i13;
                                    }
                                }
                            }
                        }
                        i13++;
                        i11 = 1;
                    }
                    if (i14 > -1) {
                        b bVar3 = this.golf[i14];
                        bVar3.alpha.red = -1;
                        bVar3.golf(delta);
                        f fVar2 = bVar3.alpha;
                        fVar2.red = i14;
                        fVar2.echo(this, bVar3);
                    }
                } else {
                    z10 = true;
                }
                i4 = 0;
            } else {
                return;
            }
        }
    }

    public final void sierra() {
        for (int i4 = 0; i4 < this.kilo; i4++) {
            b bVar = this.golf[i4];
            if (bVar != null) {
                ((d) this.mike.purple).bravo(bVar);
            }
            this.golf[i4] = null;
        }
    }

    public final void tango() {
        C1915c c1915c;
        int i4 = 0;
        while (true) {
            c1915c = this.mike;
            f[] fVarArr = (f[]) c1915c.silver;
            if (i4 >= fVarArr.length) {
                break;
            }
            f fVar = fVarArr[i4];
            if (fVar != null) {
                fVar.charlie();
            }
            i4++;
        }
        d dVar = (d) c1915c.red;
        f[] fVarArr2 = this.november;
        int i5 = this.oscar;
        dVar.getClass();
        if (i5 > fVarArr2.length) {
            i5 = fVarArr2.length;
        }
        for (int i10 = 0; i10 < i5; i10++) {
            f fVar2 = fVarArr2[i10];
            int i11 = dVar.purple;
            Object[] objArr = dVar.alpha;
            if (i11 < objArr.length) {
                objArr[i11] = fVar2;
                dVar.purple = i11 + 1;
            }
        }
        this.oscar = 0;
        Arrays.fill((f[]) c1915c.silver, (Object) null);
        this.charlie = 0;
        e eVar = this.delta;
        eVar.hotel = 0;
        eVar.bravo = 0.0f;
        this.juliet = 1;
        for (int i12 = 0; i12 < this.kilo; i12++) {
            b bVar = this.golf[i12];
        }
        sierra();
        this.kilo = 0;
        this.papa = new b(c1915c);
    }
}
