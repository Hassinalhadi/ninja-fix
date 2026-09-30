package Z0;

import a1.k;
import a1.m;
import a1.o;
import android.view.View;
import androidx.appcompat.widget.P0;
import av.q;
import com.airbnb.lottie.compose.LottieConstants;
import com.clevertap.android.sdk.Constants;
import id.C1915c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes3.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    public int f2448a;
    public int amber;
    public float azure;

    /* renamed from: b, reason: collision with root package name */
    public int f2449b;
    public final int[] beige;
    public float black;
    public boolean blue;
    public a1.c bravo;
    public boolean bronze;

    /* renamed from: c, reason: collision with root package name */
    public final float[] f2450c;
    public a1.c charlie;
    public int coral;
    public int crimson;
    public final c cyan;

    /* renamed from: d, reason: collision with root package name */
    public final d[] f2451d;
    public final d[] e;
    public final c emerald;

    /* renamed from: f, reason: collision with root package name */
    public int f2452f;
    public final c fuchsia;

    /* renamed from: g, reason: collision with root package name */
    public int f2453g;
    public final c gold;
    public final c gray;
    public final c green;

    /* renamed from: h, reason: collision with root package name */
    public final int[] f2454h;
    public final c indigo;
    public final c ivory;
    public final c[] jade;
    public String juliet;
    public boolean kilo;
    public final ArrayList lavender;
    public boolean lima;
    public final boolean[] lime;
    public d magenta;
    public int maroon;
    public boolean mike;
    public int navy;
    public boolean november;
    public float ochre;
    public int olive;
    public int orange;
    public int oscar;
    public int papa;
    public int peach;
    public int pink;
    public int plum;
    public int purple;
    public int quebec;
    public float red;
    public int romeo;
    public int sierra;
    public float silver;
    public final int[] tango;
    public View teal;
    public int uniform;
    public int victor;
    public float whiskey;
    public int white;
    public int xray;
    public int yankee;
    public String yellow;
    public float zulu;
    public boolean alpha = false;
    public k delta = null;
    public m echo = null;
    public final boolean[] foxtrot = {true, true};
    public boolean golf = true;
    public int hotel = -1;
    public int india = -1;

    public d() {
        new HashMap();
        this.kilo = false;
        this.lima = false;
        this.mike = false;
        this.november = false;
        this.oscar = -1;
        this.papa = -1;
        this.quebec = 0;
        this.romeo = 0;
        this.sierra = 0;
        this.tango = new int[2];
        this.uniform = 0;
        this.victor = 0;
        this.whiskey = 1.0f;
        this.xray = 0;
        this.yankee = 0;
        this.zulu = 1.0f;
        this.amber = -1;
        this.azure = 1.0f;
        this.beige = new int[]{LottieConstants.IterateForever, LottieConstants.IterateForever};
        this.black = Float.NaN;
        this.blue = false;
        this.bronze = false;
        this.coral = 0;
        this.crimson = 0;
        c cVar = new c(this, 2);
        this.cyan = cVar;
        c cVar2 = new c(this, 3);
        this.emerald = cVar2;
        c cVar3 = new c(this, 4);
        this.fuchsia = cVar3;
        c cVar4 = new c(this, 5);
        this.gold = cVar4;
        c cVar5 = new c(this, 6);
        this.gray = cVar5;
        c cVar6 = new c(this, 8);
        this.green = cVar6;
        c cVar7 = new c(this, 9);
        this.indigo = cVar7;
        c cVar8 = new c(this, 7);
        this.ivory = cVar8;
        this.jade = new c[]{cVar, cVar3, cVar2, cVar4, cVar5, cVar8};
        ArrayList arrayList = new ArrayList();
        this.lavender = arrayList;
        this.lime = new boolean[2];
        this.f2454h = new int[]{1, 1};
        this.magenta = null;
        this.maroon = 0;
        this.navy = 0;
        this.ochre = 0.0f;
        this.olive = -1;
        this.orange = 0;
        this.peach = 0;
        this.pink = 0;
        this.red = 0.5f;
        this.silver = 0.5f;
        this.white = 0;
        this.yellow = null;
        this.f2448a = 0;
        this.f2449b = 0;
        this.f2450c = new float[]{-1.0f, -1.0f};
        this.f2451d = new d[]{null, null};
        this.e = new d[]{null, null};
        this.f2452f = -1;
        this.f2453g = -1;
        arrayList.add(cVar);
        arrayList.add(cVar2);
        arrayList.add(cVar3);
        arrayList.add(cVar4);
        arrayList.add(cVar6);
        arrayList.add(cVar7);
        arrayList.add(cVar8);
        arrayList.add(cVar5);
    }

    public static void coral(int i4, int i5, String str, StringBuilder sb2) {
        if (i4 == i5) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(i4);
        sb2.append(",\n");
    }

    public static void crimson(StringBuilder sb2, String str, float f5, float f10) {
        if (f5 == f10) {
            return;
        }
        sb2.append(str);
        sb2.append(" :   ");
        sb2.append(f5);
        sb2.append(",\n");
    }

    public static void oscar(StringBuilder sb2, String str, int i4, int i5, int i10, int i11, int i12, float f5, int i13) {
        String str2;
        sb2.append(str);
        sb2.append(" :  {\n");
        if (i13 != 1) {
            if (i13 != 2) {
                if (i13 != 3) {
                    if (i13 == 4) {
                        str2 = "MATCH_PARENT";
                    } else {
                        throw null;
                    }
                } else {
                    str2 = "MATCH_CONSTRAINT";
                }
            } else {
                str2 = "WRAP_CONTENT";
            }
        } else {
            str2 = "FIXED";
        }
        if (!"FIXED".equals(str2)) {
            Q0.c.azure(sb2, "      behavior", " :   ", str2, ",\n");
        }
        coral(i4, 0, "      size", sb2);
        coral(i5, 0, "      min", sb2);
        coral(i10, LottieConstants.IterateForever, "      max", sb2);
        coral(i11, 0, "      matchMin", sb2);
        coral(i12, 0, "      matchDef", sb2);
        crimson(sb2, "      matchPercent", f5, 1.0f);
        sb2.append("    },\n");
    }

    public static void papa(StringBuilder sb2, String str, c cVar) {
        if (cVar.foxtrot == null) {
            return;
        }
        sb2.append("    ");
        sb2.append(str);
        sb2.append(" : [ '");
        sb2.append(cVar.foxtrot);
        sb2.append("'");
        if (cVar.hotel != Integer.MIN_VALUE || cVar.golf != 0) {
            sb2.append(Constants.SEPARATOR_COMMA);
            sb2.append(cVar.golf);
            if (cVar.hotel != Integer.MIN_VALUE) {
                sb2.append(Constants.SEPARATOR_COMMA);
                sb2.append(cVar.hotel);
                sb2.append(Constants.SEPARATOR_COMMA);
            }
        }
        sb2.append(" ] ,\n");
    }

    public final void alpha(e eVar, W0.c cVar, HashSet hashSet, int i4, boolean z2) {
        if (z2) {
            if (hashSet.contains(this)) {
                j.bravo(eVar, cVar, this);
                hashSet.remove(this);
                bravo(cVar, eVar.ochre(64));
            } else {
                return;
            }
        }
        if (i4 == 0) {
            HashSet hashSet2 = this.cyan.alpha;
            if (hashSet2 != null) {
                Iterator it = hashSet2.iterator();
                while (it.hasNext()) {
                    ((c) it.next()).delta.alpha(eVar, cVar, hashSet, i4, true);
                }
            }
            HashSet hashSet3 = this.fuchsia.alpha;
            if (hashSet3 != null) {
                Iterator it2 = hashSet3.iterator();
                while (it2.hasNext()) {
                    ((c) it2.next()).delta.alpha(eVar, cVar, hashSet, i4, true);
                }
                return;
            }
            return;
        }
        HashSet hashSet4 = this.emerald.alpha;
        if (hashSet4 != null) {
            Iterator it3 = hashSet4.iterator();
            while (it3.hasNext()) {
                ((c) it3.next()).delta.alpha(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet5 = this.gold.alpha;
        if (hashSet5 != null) {
            Iterator it4 = hashSet5.iterator();
            while (it4.hasNext()) {
                ((c) it4.next()).delta.alpha(eVar, cVar, hashSet, i4, true);
            }
        }
        HashSet hashSet6 = this.gray.alpha;
        if (hashSet6 != null) {
            Iterator it5 = hashSet6.iterator();
            while (it5.hasNext()) {
                ((c) it5.next()).delta.alpha(eVar, cVar, hashSet, i4, true);
            }
        }
    }

    public boolean amber() {
        if (!this.kilo) {
            if (!this.cyan.charlie || !this.fuchsia.charlie) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean azure() {
        if (!this.lima) {
            if (!this.emerald.charlie || !this.gold.charlie) {
                return false;
            }
            return true;
        }
        return true;
    }

    public void beige() {
        this.cyan.juliet();
        this.emerald.juliet();
        this.fuchsia.juliet();
        this.gold.juliet();
        this.gray.juliet();
        this.green.juliet();
        this.indigo.juliet();
        this.ivory.juliet();
        this.magenta = null;
        this.black = Float.NaN;
        this.maroon = 0;
        this.navy = 0;
        this.ochre = 0.0f;
        this.olive = -1;
        this.orange = 0;
        this.peach = 0;
        this.pink = 0;
        this.plum = 0;
        this.purple = 0;
        this.red = 0.5f;
        this.silver = 0.5f;
        int[] iArr = this.f2454h;
        iArr[0] = 1;
        iArr[1] = 1;
        this.teal = null;
        this.white = 0;
        this.f2448a = 0;
        this.f2449b = 0;
        float[] fArr = this.f2450c;
        fArr[0] = -1.0f;
        fArr[1] = -1.0f;
        this.oscar = -1;
        this.papa = -1;
        int[] iArr2 = this.beige;
        iArr2[0] = Integer.MAX_VALUE;
        iArr2[1] = Integer.MAX_VALUE;
        this.romeo = 0;
        this.sierra = 0;
        this.whiskey = 1.0f;
        this.zulu = 1.0f;
        this.victor = LottieConstants.IterateForever;
        this.yankee = LottieConstants.IterateForever;
        this.uniform = 0;
        this.xray = 0;
        this.amber = -1;
        this.azure = 1.0f;
        boolean[] zArr = this.foxtrot;
        zArr[0] = true;
        zArr[1] = true;
        this.bronze = false;
        boolean[] zArr2 = this.lime;
        zArr2[0] = false;
        zArr2[1] = false;
        this.golf = true;
        int[] iArr3 = this.tango;
        iArr3[0] = 0;
        iArr3[1] = 0;
        this.hotel = -1;
        this.india = -1;
    }

    public final void black() {
        d dVar = this.magenta;
        if (dVar != null && (dVar instanceof e)) {
            ((e) dVar).getClass();
        }
        ArrayList arrayList = this.lavender;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            ((c) arrayList.get(i4)).juliet();
        }
    }

    public final void blue() {
        this.kilo = false;
        this.lima = false;
        this.mike = false;
        this.november = false;
        ArrayList arrayList = this.lavender;
        int size = arrayList.size();
        for (int i4 = 0; i4 < size; i4++) {
            c cVar = (c) arrayList.get(i4);
            cVar.charlie = false;
            cVar.bravo = 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        if (r13 != 3) goto L23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x04cb  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x04fe  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x053d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x059e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x05a2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0671  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x06cf  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0503  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04c5  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x0418  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x03f7  */
    /* JADX WARN: Removed duplicated region for block: B:331:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:332:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:333:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:337:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:397:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x02b7  */
    /* JADX WARN: Type inference failed for: r12v35 */
    /* JADX WARN: Type inference failed for: r12v36, types: [int] */
    /* JADX WARN: Type inference failed for: r12v41 */
    /* JADX WARN: Type inference failed for: r13v48, types: [Z0.e] */
    /* JADX WARN: Type inference failed for: r17v1 */
    /* JADX WARN: Type inference failed for: r17v16 */
    /* JADX WARN: Type inference failed for: r17v17 */
    /* JADX WARN: Type inference failed for: r17v19 */
    /* JADX WARN: Type inference failed for: r17v21 */
    /* JADX WARN: Type inference failed for: r17v9, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v0 */
    /* JADX WARN: Type inference failed for: r18v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r18v2 */
    /* JADX WARN: Type inference failed for: r19v1 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v14 */
    /* JADX WARN: Type inference failed for: r19v15 */
    /* JADX WARN: Type inference failed for: r19v16 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /* JADX WARN: Type inference failed for: r27v4, types: [boolean] */
    /* JADX WARN: Type inference failed for: r27v6 */
    /* JADX WARN: Type inference failed for: r27v7 */
    /* JADX WARN: Type inference failed for: r27v8 */
    /* JADX WARN: Type inference failed for: r59v0, types: [Z0.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void bravo(W0.c cVar, boolean z2) {
        boolean z10;
        boolean z11;
        ?? r19;
        ?? r17;
        boolean z12;
        boolean z13;
        int i4;
        boolean z14;
        boolean z15;
        d dVar;
        d dVar2;
        boolean[] zArr;
        c cVar2;
        boolean[] zArr2;
        c cVar3;
        c cVar4;
        boolean z16;
        boolean z17;
        boolean z18;
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        int[] iArr;
        int i14;
        boolean z19;
        int i15;
        boolean z20;
        float f5;
        c cVar5;
        W0.f fVar;
        c cVar6;
        int i16;
        int i17;
        int i18;
        boolean z21;
        int i19;
        boolean z22;
        boolean z23;
        boolean z24;
        c cVar7;
        boolean z25;
        char c3;
        boolean z26;
        int i20;
        int[] iArr2;
        c cVar8;
        W0.f fVar2;
        W0.f fVar3;
        c cVar9;
        int[] iArr3;
        W0.f fVar4;
        boolean z27;
        boolean z28;
        boolean[] zArr3;
        boolean z29;
        W0.f fVar5;
        c cVar10;
        W0.f fVar6;
        int i21;
        W0.f fVar7;
        W0.f fVar8;
        W0.f fVar9;
        int i22;
        int i23;
        int i24;
        int i25;
        W0.f fVar10;
        W0.f fVar11;
        int i26;
        int i27;
        W0.f fVar12;
        int i28;
        ?? r27;
        ?? r18;
        m mVar;
        a1.f fVar13;
        d dVar3;
        d dVar4;
        W0.f fVar14;
        d dVar5;
        W0.f fVar15;
        W0.f fVar16;
        boolean z30;
        k kVar;
        a1.f fVar17;
        int i29;
        int i30;
        int i31;
        boolean xray;
        ?? r12;
        boolean yankee;
        k kVar2;
        m mVar2;
        boolean z31;
        W0.c cVar11 = cVar;
        c cVar12 = this.cyan;
        W0.f kilo = cVar11.kilo(cVar12);
        c cVar13 = this.fuchsia;
        W0.f kilo2 = cVar11.kilo(cVar13);
        c cVar14 = this.emerald;
        W0.f kilo3 = cVar11.kilo(cVar14);
        c cVar15 = this.gold;
        W0.f kilo4 = cVar11.kilo(cVar15);
        c cVar16 = this.gray;
        W0.f kilo5 = cVar11.kilo(cVar16);
        d dVar6 = this.magenta;
        if (dVar6 != null) {
            int[] iArr4 = dVar6.f2454h;
            r17 = 0;
            r17 = 0;
            z11 = false;
            r17 = 0;
            if (iArr4[0] == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (iArr4[1] == 2) {
                z13 = true;
            } else {
                z13 = false;
            }
            int i32 = this.quebec;
            if (i32 != 1) {
                boolean z32 = true;
                if (i32 != 2) {
                    z10 = z32;
                    r19 = z32;
                } else {
                    z12 = false;
                    r19 = z32;
                }
            } else {
                r19 = 1;
                z13 = false;
            }
            i4 = this.white;
            boolean[] zArr4 = this.lime;
            boolean z33 = z13;
            if (i4 != 8) {
                ArrayList arrayList = this.lavender;
                int size = arrayList.size();
                z14 = z12;
                int i33 = r17;
                while (true) {
                    if (i33 < size) {
                        int i34 = size;
                        HashSet hashSet = ((c) arrayList.get(i33)).alpha;
                        if (hashSet != null && hashSet.size() > 0) {
                            break;
                        }
                        i33++;
                        size = i34;
                    } else if (!zArr4[r17] && !zArr4[r19]) {
                        return;
                    }
                }
            } else {
                z14 = z12;
            }
            z15 = this.kilo;
            if (!z15 || this.lima) {
                if (z15) {
                    cVar11.delta(kilo, this.orange);
                    cVar11.delta(kilo2, this.orange + this.maroon);
                    if (z14 && (dVar2 = this.magenta) != null) {
                        e eVar = (e) dVar2;
                        WeakReference weakReference = eVar.f2473z;
                        if (weakReference == null || weakReference.get() == null || cVar12.delta() > ((c) eVar.f2473z.get()).delta()) {
                            eVar.f2473z = new WeakReference(cVar12);
                        }
                        WeakReference weakReference2 = eVar.B;
                        if (weakReference2 == null || weakReference2.get() == null || cVar13.delta() > ((c) eVar.B.get()).delta()) {
                            eVar.B = new WeakReference(cVar13);
                        }
                    }
                }
                if (this.lima) {
                    cVar11.delta(kilo3, this.peach);
                    cVar11.delta(kilo4, this.peach + this.navy);
                    HashSet hashSet2 = cVar16.alpha;
                    if (hashSet2 != null && hashSet2.size() > 0) {
                        cVar11.delta(kilo5, this.peach + this.pink);
                    }
                    if (z33 && (dVar = this.magenta) != null) {
                        e eVar2 = (e) dVar;
                        WeakReference weakReference3 = eVar2.f2472y;
                        if (weakReference3 == null || weakReference3.get() == null || cVar14.delta() > ((c) eVar2.f2472y.get()).delta()) {
                            eVar2.f2472y = new WeakReference(cVar14);
                        }
                        WeakReference weakReference4 = eVar2.A;
                        if (weakReference4 == null || weakReference4.get() == null || cVar15.delta() > ((c) eVar2.A.get()).delta()) {
                            eVar2.A = new WeakReference(cVar15);
                        }
                    }
                }
                if (this.kilo && this.lima) {
                    boolean z34 = r17;
                    this.kilo = z34;
                    this.lima = z34;
                    return;
                }
            }
            zArr = this.foxtrot;
            if (!z2 && (kVar2 = this.delta) != null && (mVar2 = this.echo) != null) {
                cVar2 = cVar16;
                a1.f fVar18 = kVar2.hotel;
                zArr2 = zArr;
                if (fVar18.juliet && kVar2.india.juliet && mVar2.hotel.juliet && mVar2.india.juliet) {
                    cVar11.delta(kilo, fVar18.golf);
                    cVar11.delta(kilo2, this.delta.india.golf);
                    cVar11.delta(kilo3, this.echo.hotel.golf);
                    cVar11.delta(kilo4, this.echo.india.golf);
                    cVar11.delta(kilo5, this.echo.kilo.golf);
                    if (this.magenta != null) {
                        if (z14 && zArr2[0] && !xray()) {
                            cVar11.foxtrot(cVar11.kilo(this.magenta.fuchsia), kilo2, 0, 8);
                        }
                        if (z33 && zArr2[r19] && !yankee()) {
                            z31 = false;
                            cVar11.foxtrot(cVar11.kilo(this.magenta.gold), kilo4, 0, 8);
                            this.kilo = z31;
                            this.lima = z31;
                            return;
                        }
                    }
                    z31 = false;
                    this.kilo = z31;
                    this.lima = z31;
                    return;
                }
            } else {
                cVar2 = cVar16;
                zArr2 = zArr;
            }
            if (this.magenta == null) {
                if (whiskey(0)) {
                    ((e) this.magenta).lavender(this, 0);
                    xray = r19;
                    r12 = xray;
                } else {
                    xray = xray();
                    r12 = r19;
                }
                if (whiskey(r12)) {
                    ((e) this.magenta).lavender(this, r12);
                    yankee = true;
                } else {
                    yankee = yankee();
                }
                if (!xray && z14 && this.white != 8 && cVar12.foxtrot == null && cVar13.foxtrot == null) {
                    cVar3 = cVar12;
                    cVar11.foxtrot(cVar11.kilo(this.magenta.fuchsia), kilo2, 0, 1);
                } else {
                    cVar3 = cVar12;
                }
                if (!yankee && z33 && this.white != 8 && cVar14.foxtrot == null && cVar15.foxtrot == null && cVar2 == null) {
                    cVar11.foxtrot(cVar11.kilo(this.magenta.gold), kilo4, 0, 1);
                }
                cVar4 = cVar13;
                z16 = z33;
                z18 = yankee;
                z17 = xray;
            } else {
                cVar3 = cVar12;
                cVar4 = cVar13;
                z16 = z33;
                z17 = false;
                z18 = false;
            }
            i5 = this.maroon;
            i10 = this.plum;
            if (i5 >= i10) {
                i10 = i5;
            }
            i11 = this.navy;
            c cVar17 = cVar4;
            i12 = this.purple;
            if (i11 >= i12) {
                i13 = i12;
            } else {
                i13 = i11;
            }
            iArr = this.f2454h;
            i14 = iArr[0];
            boolean z35 = z16;
            if (i14 == 3) {
                z19 = true;
            } else {
                z19 = false;
            }
            i15 = iArr[1];
            if (i15 == 3) {
                z20 = true;
            } else {
                z20 = false;
            }
            int i35 = this.olive;
            this.amber = i35;
            f5 = this.ochre;
            this.azure = f5;
            int i36 = this.romeo;
            int i37 = this.sierra;
            if (f5 <= 0.0f) {
                cVar5 = cVar15;
                if (this.white != 8) {
                    if (i14 == 3 && i36 == 0) {
                        i30 = 3;
                    } else {
                        i30 = i36;
                    }
                    if (i15 == 3 && i37 == 0) {
                        fVar = kilo4;
                        i31 = 3;
                    } else {
                        fVar = kilo4;
                        i31 = i37;
                    }
                    if (i14 == 3 && i15 == 3 && i30 == 3 && i31 == 3) {
                        if (i35 == -1) {
                            if (z19 && !z20) {
                                this.amber = 0;
                            } else if (!z19 && z20) {
                                this.amber = 1;
                                if (i35 == -1) {
                                    this.azure = 1.0f / f5;
                                }
                            }
                        }
                        if (this.amber == 0 && (!cVar14.hotel() || !cVar5.hotel())) {
                            this.amber = 1;
                        } else if (this.amber == 1 && (!cVar3.hotel() || !cVar17.hotel())) {
                            this.amber = 0;
                        }
                        if (this.amber == -1 && (!cVar14.hotel() || !cVar5.hotel() || !cVar3.hotel() || !cVar17.hotel())) {
                            if (cVar14.hotel() && cVar5.hotel()) {
                                this.amber = 0;
                            } else if (cVar3.hotel() && cVar17.hotel()) {
                                this.azure = 1.0f / this.azure;
                                this.amber = 1;
                            }
                        }
                        if (this.amber == -1) {
                            int i38 = this.uniform;
                            if (i38 > 0 && this.xray == 0) {
                                this.amber = 0;
                            } else if (i38 == 0 && this.xray > 0) {
                                this.azure = 1.0f / this.azure;
                                this.amber = 1;
                            }
                        }
                    } else if (i14 == 3 && i30 == 3) {
                        this.amber = 0;
                        i10 = (int) (f5 * i11);
                        if (i15 != 3) {
                            cVar6 = cVar2;
                            i16 = i13;
                            i17 = 4;
                            z21 = false;
                            i18 = i31;
                            int[] iArr5 = this.tango;
                            iArr5[0] = i17;
                            iArr5[1] = i18;
                            if (!z21) {
                            }
                            z22 = false;
                            if (!z21) {
                            }
                            z23 = false;
                            if (iArr[0] != 2) {
                            }
                            z24 = false;
                            if (z24) {
                            }
                            cVar7 = this.ivory;
                            z25 = !cVar7.hotel();
                            c3 = '\b';
                            z26 = zArr4[0];
                            boolean z36 = zArr4[1];
                            i20 = this.oscar;
                            iArr2 = this.beige;
                            W0.f fVar19 = null;
                            if (i20 != 2) {
                            }
                            cVar8 = cVar6;
                            fVar2 = kilo;
                            fVar3 = kilo2;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = kilo5;
                            z27 = z17;
                            z28 = z14;
                            zArr3 = zArr2;
                            z29 = z35;
                            fVar5 = kilo3;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i21 = i17;
                            if (z2) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i22 = 0;
                            i23 = 8;
                            i24 = 1;
                            i25 = 1;
                            if (this.papa == 2) {
                            }
                            if (i25 == 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z21) {
                            }
                            if (cVar9.hotel()) {
                            }
                            this.kilo = false;
                            this.lima = false;
                        }
                    } else if (i15 == 3 && i31 == 3) {
                        this.amber = 1;
                        if (i35 == -1) {
                            this.azure = 1.0f / f5;
                        }
                        i16 = (int) (this.azure * i5);
                        if (i14 != 3) {
                            i17 = i30;
                            cVar6 = cVar2;
                            i18 = 4;
                            z21 = false;
                            int[] iArr52 = this.tango;
                            iArr52[0] = i17;
                            iArr52[1] = i18;
                            if (!z21) {
                                int i39 = this.amber;
                                i19 = -1;
                                if (i39 == 0 || i39 == -1) {
                                    z22 = true;
                                    if (!z21 && ((i29 = this.amber) == 1 || i29 == i19)) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    if (iArr[0] != 2 && (this instanceof e)) {
                                        z24 = true;
                                    } else {
                                        z24 = false;
                                    }
                                    if (z24) {
                                        i10 = 0;
                                    }
                                    cVar7 = this.ivory;
                                    z25 = !cVar7.hotel();
                                    c3 = '\b';
                                    z26 = zArr4[0];
                                    boolean z362 = zArr4[1];
                                    i20 = this.oscar;
                                    iArr2 = this.beige;
                                    W0.f fVar192 = null;
                                    if (i20 != 2 && !this.kilo) {
                                        if (z2 && (kVar = this.delta) != null) {
                                            fVar17 = kVar.hotel;
                                            if (fVar17.juliet || !kVar.india.juliet) {
                                                c3 = '\b';
                                            } else if (z2) {
                                                cVar11.delta(kilo, fVar17.golf);
                                                cVar11.delta(kilo2, this.delta.india.golf);
                                                if (this.magenta != null && z14 && zArr2[0] && !xray()) {
                                                    cVar11.foxtrot(cVar11.kilo(this.magenta.fuchsia), kilo2, 0, 8);
                                                }
                                            }
                                        }
                                        dVar4 = this.magenta;
                                        if (dVar4 == null) {
                                            fVar14 = cVar11.kilo(dVar4.fuchsia);
                                        } else {
                                            fVar14 = null;
                                        }
                                        dVar5 = this.magenta;
                                        if (dVar5 == null) {
                                            fVar15 = cVar11.kilo(dVar5.cyan);
                                        } else {
                                            fVar15 = null;
                                        }
                                        boolean z37 = zArr2[0];
                                        z28 = z14;
                                        i21 = i17;
                                        W0.f fVar20 = fVar14;
                                        int i40 = iArr[0];
                                        z27 = z17;
                                        int i41 = this.orange;
                                        int i42 = this.plum;
                                        cVar9 = cVar7;
                                        W0.f fVar21 = fVar15;
                                        int i43 = iArr2[0];
                                        float f10 = this.red;
                                        c cVar18 = cVar6;
                                        if (iArr[1] != 3) {
                                            fVar16 = kilo2;
                                            z30 = true;
                                        } else {
                                            fVar16 = kilo2;
                                            z30 = false;
                                        }
                                        iArr3 = iArr2;
                                        zArr3 = zArr2;
                                        boolean z38 = z22;
                                        fVar2 = kilo;
                                        z29 = z35;
                                        fVar5 = kilo3;
                                        cVar10 = cVar5;
                                        fVar6 = fVar;
                                        cVar8 = cVar18;
                                        fVar3 = fVar16;
                                        fVar4 = kilo5;
                                        cVar11 = cVar;
                                        delta(cVar11, true, z28, z29, z37, fVar21, fVar20, i40, z24, this.cyan, this.fuchsia, i41, i10, i42, i43, f10, z38, z30, z27, z18, z26, i21, i18, this.uniform, this.victor, this.whiskey, z25);
                                        if (z2 && (mVar = this.echo) != null) {
                                            fVar13 = mVar.hotel;
                                            if (fVar13.juliet && mVar.india.juliet) {
                                                int i44 = fVar13.golf;
                                                fVar7 = fVar5;
                                                cVar11.delta(fVar7, i44);
                                                fVar8 = fVar6;
                                                cVar11.delta(fVar8, this.echo.india.golf);
                                                fVar9 = fVar4;
                                                cVar11.delta(fVar9, this.echo.kilo.golf);
                                                dVar3 = this.magenta;
                                                if (dVar3 == null && !z18 && z29) {
                                                    i24 = 1;
                                                    if (zArr3[1]) {
                                                        i22 = 0;
                                                        i23 = 8;
                                                        cVar11.foxtrot(cVar11.kilo(dVar3.gold), fVar8, 0, 8);
                                                    } else {
                                                        i22 = 0;
                                                        i23 = 8;
                                                    }
                                                } else {
                                                    i22 = 0;
                                                    i23 = 8;
                                                    i24 = 1;
                                                }
                                                i25 = i22;
                                                if (this.papa == 2) {
                                                    i25 = i22;
                                                }
                                                if (i25 == 0 && !this.lima) {
                                                    if (iArr[i24] == 2 && (this instanceof e)) {
                                                        i26 = i24;
                                                    } else {
                                                        i26 = i22;
                                                    }
                                                    if (i26 != 0) {
                                                        i27 = i22;
                                                    } else {
                                                        i27 = i16;
                                                    }
                                                    d dVar7 = this.magenta;
                                                    if (dVar7 != null) {
                                                        fVar12 = cVar11.kilo(dVar7.gold);
                                                    } else {
                                                        fVar12 = null;
                                                    }
                                                    d dVar8 = this.magenta;
                                                    if (dVar8 != null) {
                                                        fVar192 = cVar11.kilo(dVar8.emerald);
                                                    }
                                                    int i45 = this.pink;
                                                    if (i45 > 0 || this.white == i23) {
                                                        i28 = i24;
                                                        c cVar19 = cVar8;
                                                        if (cVar19.foxtrot != null) {
                                                            cVar11.echo(fVar9, fVar7, i45, i23);
                                                            cVar11.echo(fVar9, cVar11.kilo(cVar19.foxtrot), cVar19.echo(), i23);
                                                            if (z29) {
                                                                cVar11.foxtrot(fVar12, cVar11.kilo(cVar10), i22, 5);
                                                            }
                                                            r27 = i22;
                                                        } else if (this.white == i23) {
                                                            cVar11.echo(fVar9, fVar7, cVar19.echo(), i23);
                                                            r27 = z25;
                                                        } else {
                                                            cVar11.echo(fVar9, fVar7, i45, i23);
                                                            r27 = z25;
                                                        }
                                                    } else {
                                                        i28 = i24;
                                                        r27 = z25;
                                                    }
                                                    boolean z39 = zArr3[i28];
                                                    int i46 = i22;
                                                    int i47 = iArr[i28];
                                                    int i48 = this.peach;
                                                    int i49 = this.purple;
                                                    int i50 = iArr3[i28];
                                                    float f11 = this.silver;
                                                    if (iArr[i46] == 3) {
                                                        r18 = i28;
                                                    } else {
                                                        r18 = i46;
                                                    }
                                                    fVar11 = fVar8;
                                                    fVar10 = fVar7;
                                                    cVar11 = cVar;
                                                    delta(cVar11, false, z29, z28, z39, fVar192, fVar12, i47, i26, this.emerald, this.gold, i48, i27, i49, i50, f11, z23, r18, z18, z27, z362, i18, i21, this.xray, this.yankee, this.zulu, r27);
                                                } else {
                                                    fVar10 = fVar7;
                                                    fVar11 = fVar8;
                                                }
                                                if (z21) {
                                                    if (this.amber == 1) {
                                                        float f12 = this.azure;
                                                        W0.b lima = cVar11.lima();
                                                        lima.delta.golf(fVar11, -1.0f);
                                                        lima.delta.golf(fVar10, 1.0f);
                                                        lima.delta.golf(fVar3, f12);
                                                        lima.delta.golf(fVar2, -f12);
                                                        cVar11.charlie(lima);
                                                    } else {
                                                        float f13 = this.azure;
                                                        W0.b lima2 = cVar11.lima();
                                                        lima2.delta.golf(fVar3, -1.0f);
                                                        lima2.delta.golf(fVar2, 1.0f);
                                                        lima2.delta.golf(fVar11, f13);
                                                        lima2.delta.golf(fVar10, -f13);
                                                        cVar11.charlie(lima2);
                                                    }
                                                }
                                                if (cVar9.hotel()) {
                                                    c cVar20 = cVar9;
                                                    d dVar9 = cVar20.foxtrot.delta;
                                                    float radians = (float) Math.toRadians(this.black + 90.0f);
                                                    int echo = cVar20.echo();
                                                    W0.f kilo6 = cVar11.kilo(india(2));
                                                    W0.f kilo7 = cVar11.kilo(india(3));
                                                    W0.f kilo8 = cVar11.kilo(india(4));
                                                    W0.f kilo9 = cVar11.kilo(india(5));
                                                    W0.f kilo10 = cVar11.kilo(dVar9.india(2));
                                                    W0.f kilo11 = cVar11.kilo(dVar9.india(3));
                                                    W0.f kilo12 = cVar11.kilo(dVar9.india(4));
                                                    W0.f kilo13 = cVar11.kilo(dVar9.india(5));
                                                    W0.b lima3 = cVar11.lima();
                                                    double d4 = radians;
                                                    double sin = Math.sin(d4);
                                                    double d9 = echo;
                                                    lima3.delta.golf(kilo11, 0.5f);
                                                    lima3.delta.golf(kilo13, 0.5f);
                                                    lima3.delta.golf(kilo7, -0.5f);
                                                    lima3.delta.golf(kilo9, -0.5f);
                                                    lima3.bravo = -((float) (sin * d9));
                                                    cVar11.charlie(lima3);
                                                    W0.b lima4 = cVar11.lima();
                                                    float cos = (float) (Math.cos(d4) * d9);
                                                    lima4.delta.golf(kilo10, 0.5f);
                                                    lima4.delta.golf(kilo12, 0.5f);
                                                    lima4.delta.golf(kilo6, -0.5f);
                                                    lima4.delta.golf(kilo8, -0.5f);
                                                    lima4.bravo = -cos;
                                                    cVar11.charlie(lima4);
                                                }
                                                this.kilo = false;
                                                this.lima = false;
                                            }
                                        }
                                        fVar7 = fVar5;
                                        fVar8 = fVar6;
                                        fVar9 = fVar4;
                                        i22 = 0;
                                        i23 = 8;
                                        i24 = 1;
                                        i25 = 1;
                                        if (this.papa == 2) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        fVar10 = fVar7;
                                        fVar11 = fVar8;
                                        if (z21) {
                                        }
                                        if (cVar9.hotel()) {
                                        }
                                        this.kilo = false;
                                        this.lima = false;
                                    }
                                    cVar8 = cVar6;
                                    fVar2 = kilo;
                                    fVar3 = kilo2;
                                    cVar9 = cVar7;
                                    iArr3 = iArr2;
                                    fVar4 = kilo5;
                                    z27 = z17;
                                    z28 = z14;
                                    zArr3 = zArr2;
                                    z29 = z35;
                                    fVar5 = kilo3;
                                    cVar10 = cVar5;
                                    fVar6 = fVar;
                                    i21 = i17;
                                    if (z2) {
                                        fVar13 = mVar.hotel;
                                        if (fVar13.juliet) {
                                            int i442 = fVar13.golf;
                                            fVar7 = fVar5;
                                            cVar11.delta(fVar7, i442);
                                            fVar8 = fVar6;
                                            cVar11.delta(fVar8, this.echo.india.golf);
                                            fVar9 = fVar4;
                                            cVar11.delta(fVar9, this.echo.kilo.golf);
                                            dVar3 = this.magenta;
                                            if (dVar3 == null) {
                                            }
                                            i22 = 0;
                                            i23 = 8;
                                            i24 = 1;
                                            i25 = i22;
                                            if (this.papa == 2) {
                                            }
                                            if (i25 == 0) {
                                            }
                                            fVar10 = fVar7;
                                            fVar11 = fVar8;
                                            if (z21) {
                                            }
                                            if (cVar9.hotel()) {
                                            }
                                            this.kilo = false;
                                            this.lima = false;
                                        }
                                    }
                                    fVar7 = fVar5;
                                    fVar8 = fVar6;
                                    fVar9 = fVar4;
                                    i22 = 0;
                                    i23 = 8;
                                    i24 = 1;
                                    i25 = 1;
                                    if (this.papa == 2) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    fVar10 = fVar7;
                                    fVar11 = fVar8;
                                    if (z21) {
                                    }
                                    if (cVar9.hotel()) {
                                    }
                                    this.kilo = false;
                                    this.lima = false;
                                }
                            } else {
                                i19 = -1;
                            }
                            z22 = false;
                            if (!z21) {
                            }
                            z23 = false;
                            if (iArr[0] != 2) {
                            }
                            z24 = false;
                            if (z24) {
                            }
                            cVar7 = this.ivory;
                            z25 = !cVar7.hotel();
                            c3 = '\b';
                            z26 = zArr4[0];
                            boolean z3622 = zArr4[1];
                            i20 = this.oscar;
                            iArr2 = this.beige;
                            W0.f fVar1922 = null;
                            if (i20 != 2) {
                                if (z2) {
                                    fVar17 = kVar.hotel;
                                    if (fVar17.juliet) {
                                    }
                                    c3 = '\b';
                                }
                                dVar4 = this.magenta;
                                if (dVar4 == null) {
                                }
                                dVar5 = this.magenta;
                                if (dVar5 == null) {
                                }
                                boolean z372 = zArr2[0];
                                z28 = z14;
                                i21 = i17;
                                W0.f fVar202 = fVar14;
                                int i402 = iArr[0];
                                z27 = z17;
                                int i412 = this.orange;
                                int i422 = this.plum;
                                cVar9 = cVar7;
                                W0.f fVar212 = fVar15;
                                int i432 = iArr2[0];
                                float f102 = this.red;
                                c cVar182 = cVar6;
                                if (iArr[1] != 3) {
                                }
                                iArr3 = iArr2;
                                zArr3 = zArr2;
                                boolean z382 = z22;
                                fVar2 = kilo;
                                z29 = z35;
                                fVar5 = kilo3;
                                cVar10 = cVar5;
                                fVar6 = fVar;
                                cVar8 = cVar182;
                                fVar3 = fVar16;
                                fVar4 = kilo5;
                                cVar11 = cVar;
                                delta(cVar11, true, z28, z29, z372, fVar212, fVar202, i402, z24, this.cyan, this.fuchsia, i412, i10, i422, i432, f102, z382, z30, z27, z18, z26, i21, i18, this.uniform, this.victor, this.whiskey, z25);
                                if (z2) {
                                }
                                fVar7 = fVar5;
                                fVar8 = fVar6;
                                fVar9 = fVar4;
                                i22 = 0;
                                i23 = 8;
                                i24 = 1;
                                i25 = 1;
                                if (this.papa == 2) {
                                }
                                if (i25 == 0) {
                                }
                                fVar10 = fVar7;
                                fVar11 = fVar8;
                                if (z21) {
                                }
                                if (cVar9.hotel()) {
                                }
                                this.kilo = false;
                                this.lima = false;
                            }
                            cVar8 = cVar6;
                            fVar2 = kilo;
                            fVar3 = kilo2;
                            cVar9 = cVar7;
                            iArr3 = iArr2;
                            fVar4 = kilo5;
                            z27 = z17;
                            z28 = z14;
                            zArr3 = zArr2;
                            z29 = z35;
                            fVar5 = kilo3;
                            cVar10 = cVar5;
                            fVar6 = fVar;
                            i21 = i17;
                            if (z2) {
                            }
                            fVar7 = fVar5;
                            fVar8 = fVar6;
                            fVar9 = fVar4;
                            i22 = 0;
                            i23 = 8;
                            i24 = 1;
                            i25 = 1;
                            if (this.papa == 2) {
                            }
                            if (i25 == 0) {
                            }
                            fVar10 = fVar7;
                            fVar11 = fVar8;
                            if (z21) {
                            }
                            if (cVar9.hotel()) {
                            }
                            this.kilo = false;
                            this.lima = false;
                        }
                        i17 = i30;
                        cVar6 = cVar2;
                        z21 = true;
                        i18 = i31;
                        int[] iArr522 = this.tango;
                        iArr522[0] = i17;
                        iArr522[1] = i18;
                        if (!z21) {
                        }
                        z22 = false;
                        if (!z21) {
                        }
                        z23 = false;
                        if (iArr[0] != 2) {
                        }
                        z24 = false;
                        if (z24) {
                        }
                        cVar7 = this.ivory;
                        z25 = !cVar7.hotel();
                        c3 = '\b';
                        z26 = zArr4[0];
                        boolean z36222 = zArr4[1];
                        i20 = this.oscar;
                        iArr2 = this.beige;
                        W0.f fVar19222 = null;
                        if (i20 != 2) {
                        }
                        cVar8 = cVar6;
                        fVar2 = kilo;
                        fVar3 = kilo2;
                        cVar9 = cVar7;
                        iArr3 = iArr2;
                        fVar4 = kilo5;
                        z27 = z17;
                        z28 = z14;
                        zArr3 = zArr2;
                        z29 = z35;
                        fVar5 = kilo3;
                        cVar10 = cVar5;
                        fVar6 = fVar;
                        i21 = i17;
                        if (z2) {
                        }
                        fVar7 = fVar5;
                        fVar8 = fVar6;
                        fVar9 = fVar4;
                        i22 = 0;
                        i23 = 8;
                        i24 = 1;
                        i25 = 1;
                        if (this.papa == 2) {
                        }
                        if (i25 == 0) {
                        }
                        fVar10 = fVar7;
                        fVar11 = fVar8;
                        if (z21) {
                        }
                        if (cVar9.hotel()) {
                        }
                        this.kilo = false;
                        this.lima = false;
                    }
                    i17 = i30;
                    cVar6 = cVar2;
                    i16 = i13;
                    z21 = true;
                    i18 = i31;
                    int[] iArr5222 = this.tango;
                    iArr5222[0] = i17;
                    iArr5222[1] = i18;
                    if (!z21) {
                    }
                    z22 = false;
                    if (!z21) {
                    }
                    z23 = false;
                    if (iArr[0] != 2) {
                    }
                    z24 = false;
                    if (z24) {
                    }
                    cVar7 = this.ivory;
                    z25 = !cVar7.hotel();
                    c3 = '\b';
                    z26 = zArr4[0];
                    boolean z362222 = zArr4[1];
                    i20 = this.oscar;
                    iArr2 = this.beige;
                    W0.f fVar192222 = null;
                    if (i20 != 2) {
                    }
                    cVar8 = cVar6;
                    fVar2 = kilo;
                    fVar3 = kilo2;
                    cVar9 = cVar7;
                    iArr3 = iArr2;
                    fVar4 = kilo5;
                    z27 = z17;
                    z28 = z14;
                    zArr3 = zArr2;
                    z29 = z35;
                    fVar5 = kilo3;
                    cVar10 = cVar5;
                    fVar6 = fVar;
                    i21 = i17;
                    if (z2) {
                    }
                    fVar7 = fVar5;
                    fVar8 = fVar6;
                    fVar9 = fVar4;
                    i22 = 0;
                    i23 = 8;
                    i24 = 1;
                    i25 = 1;
                    if (this.papa == 2) {
                    }
                    if (i25 == 0) {
                    }
                    fVar10 = fVar7;
                    fVar11 = fVar8;
                    if (z21) {
                    }
                    if (cVar9.hotel()) {
                    }
                    this.kilo = false;
                    this.lima = false;
                }
            } else {
                cVar5 = cVar15;
            }
            fVar = kilo4;
            cVar6 = cVar2;
            i16 = i13;
            i17 = i36;
            i18 = i37;
            z21 = false;
            int[] iArr52222 = this.tango;
            iArr52222[0] = i17;
            iArr52222[1] = i18;
            if (!z21) {
            }
            z22 = false;
            if (!z21) {
            }
            z23 = false;
            if (iArr[0] != 2) {
            }
            z24 = false;
            if (z24) {
            }
            cVar7 = this.ivory;
            z25 = !cVar7.hotel();
            c3 = '\b';
            z26 = zArr4[0];
            boolean z3622222 = zArr4[1];
            i20 = this.oscar;
            iArr2 = this.beige;
            W0.f fVar1922222 = null;
            if (i20 != 2) {
            }
            cVar8 = cVar6;
            fVar2 = kilo;
            fVar3 = kilo2;
            cVar9 = cVar7;
            iArr3 = iArr2;
            fVar4 = kilo5;
            z27 = z17;
            z28 = z14;
            zArr3 = zArr2;
            z29 = z35;
            fVar5 = kilo3;
            cVar10 = cVar5;
            fVar6 = fVar;
            i21 = i17;
            if (z2) {
            }
            fVar7 = fVar5;
            fVar8 = fVar6;
            fVar9 = fVar4;
            i22 = 0;
            i23 = 8;
            i24 = 1;
            i25 = 1;
            if (this.papa == 2) {
            }
            if (i25 == 0) {
            }
            fVar10 = fVar7;
            fVar11 = fVar8;
            if (z21) {
            }
            if (cVar9.hotel()) {
            }
            this.kilo = false;
            this.lima = false;
        }
        z10 = true;
        z11 = false;
        z13 = z11 ? 1 : 0;
        z12 = z13;
        r17 = z11;
        r19 = z10;
        i4 = this.white;
        boolean[] zArr42 = this.lime;
        boolean z332 = z13;
        if (i4 != 8) {
        }
        z15 = this.kilo;
        if (!z15) {
        }
        if (z15) {
        }
        if (this.lima) {
        }
        if (this.kilo) {
            boolean z342 = r17;
            this.kilo = z342;
            this.lima = z342;
            return;
        }
        zArr = this.foxtrot;
        if (!z2) {
        }
        cVar2 = cVar16;
        zArr2 = zArr;
        if (this.magenta == null) {
        }
        i5 = this.maroon;
        i10 = this.plum;
        if (i5 >= i10) {
        }
        i11 = this.navy;
        c cVar172 = cVar4;
        i12 = this.purple;
        if (i11 >= i12) {
        }
        iArr = this.f2454h;
        i14 = iArr[0];
        boolean z352 = z16;
        if (i14 == 3) {
        }
        i15 = iArr[1];
        if (i15 == 3) {
        }
        int i352 = this.olive;
        this.amber = i352;
        f5 = this.ochre;
        this.azure = f5;
        int i362 = this.romeo;
        int i372 = this.sierra;
        if (f5 <= 0.0f) {
        }
        fVar = kilo4;
        cVar6 = cVar2;
        i16 = i13;
        i17 = i362;
        i18 = i372;
        z21 = false;
        int[] iArr522222 = this.tango;
        iArr522222[0] = i17;
        iArr522222[1] = i18;
        if (!z21) {
        }
        z22 = false;
        if (!z21) {
        }
        z23 = false;
        if (iArr[0] != 2) {
        }
        z24 = false;
        if (z24) {
        }
        cVar7 = this.ivory;
        z25 = !cVar7.hotel();
        c3 = '\b';
        z26 = zArr42[0];
        boolean z36222222 = zArr42[1];
        i20 = this.oscar;
        iArr2 = this.beige;
        W0.f fVar19222222 = null;
        if (i20 != 2) {
        }
        cVar8 = cVar6;
        fVar2 = kilo;
        fVar3 = kilo2;
        cVar9 = cVar7;
        iArr3 = iArr2;
        fVar4 = kilo5;
        z27 = z17;
        z28 = z14;
        zArr3 = zArr2;
        z29 = z352;
        fVar5 = kilo3;
        cVar10 = cVar5;
        fVar6 = fVar;
        i21 = i17;
        if (z2) {
        }
        fVar7 = fVar5;
        fVar8 = fVar6;
        fVar9 = fVar4;
        i22 = 0;
        i23 = 8;
        i24 = 1;
        i25 = 1;
        if (this.papa == 2) {
        }
        if (i25 == 0) {
        }
        fVar10 = fVar7;
        fVar11 = fVar8;
        if (z21) {
        }
        if (cVar9.hotel()) {
        }
        this.kilo = false;
        this.lima = false;
    }

    public void bronze(C1915c c1915c) {
        this.cyan.kilo();
        this.emerald.kilo();
        this.fuchsia.kilo();
        this.gold.kilo();
        this.gray.kilo();
        this.ivory.kilo();
        this.green.kilo();
        this.indigo.kilo();
    }

    public boolean charlie() {
        if (this.white != 8) {
            return true;
        }
        return false;
    }

    public final void cyan(int i4) {
        boolean z2;
        this.pink = i4;
        if (i4 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.blue = z2;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x03bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x041e  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x043f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0457  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x04a4  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x04b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04d3 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void delta(W0.c cVar, boolean z2, boolean z10, boolean z11, boolean z12, W0.f fVar, W0.f fVar2, int i4, boolean z13, c cVar2, c cVar3, int i5, int i10, int i11, int i12, float f5, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, int i13, int i14, int i15, int i16, float f10, boolean z19) {
        boolean z20;
        boolean z21;
        int i17;
        boolean z22;
        boolean z23;
        int i18;
        int i19;
        boolean z24;
        W0.f kilo;
        W0.f kilo2;
        c cVar4;
        W0.f fVar3;
        boolean z25;
        int i20;
        W0.f fVar4;
        W0.f fVar5;
        W0.f fVar6;
        W0.f fVar7;
        int i21;
        int i22;
        int i23;
        boolean z26;
        boolean z27;
        boolean z28;
        boolean z29;
        d dVar;
        int i24;
        int i25;
        c cVar5;
        boolean z30;
        int i26;
        boolean z31;
        int i27;
        int i28;
        HashSet hashSet;
        boolean z32;
        int i29;
        int i30;
        int i31;
        int i32;
        int i33;
        boolean z33;
        boolean z34;
        int i34;
        W0.c cVar6 = cVar;
        int i35 = i15;
        int i36 = i16;
        W0.f kilo3 = cVar6.kilo(cVar2);
        W0.f kilo4 = cVar6.kilo(cVar3);
        W0.f kilo5 = cVar6.kilo(cVar2.foxtrot);
        W0.f kilo6 = cVar6.kilo(cVar3.foxtrot);
        boolean hotel = cVar2.hotel();
        boolean hotel2 = cVar3.hotel();
        boolean hotel3 = this.ivory.hotel();
        int i37 = hotel2 ? (hotel ? 1 : 0) + 1 : hotel ? 1 : 0;
        if (hotel3) {
            i37++;
        }
        int i38 = i37;
        int i39 = z14 ? 3 : i13;
        int mike = q.mike(i4);
        boolean z35 = (mike == 0 || mike == 1 || mike != 2 || i39 == 4) ? false : true;
        int i40 = this.hotel;
        if (i40 == -1 || !z2) {
            i40 = i10;
            z20 = z35;
        } else {
            this.hotel = -1;
            z20 = false;
        }
        int i41 = this.india;
        if (i41 == -1 || z2) {
            z21 = z20;
        } else {
            this.india = -1;
            i40 = i41;
            z21 = false;
        }
        boolean z36 = z21;
        if (this.white == 8) {
            z22 = false;
            i17 = 0;
        } else {
            i17 = i40;
            z22 = z36;
        }
        if (z19) {
            if (!hotel && !hotel2 && !hotel3) {
                cVar6.delta(kilo3, i5);
            } else if (hotel && !hotel2) {
                z23 = z22;
                i18 = 8;
                cVar6.echo(kilo3, kilo5, cVar2.echo(), 8);
            }
            z23 = z22;
            i18 = 8;
        } else {
            z23 = z22;
            i18 = 8;
        }
        if (z23) {
            if (i38 == 2 || z14 || !(i39 == 1 || i39 == 0)) {
                if (i35 == -2) {
                    i35 = i17;
                }
                if (i36 == -2) {
                    i36 = i17;
                }
                if (i17 > 0 && i39 != 1) {
                    i17 = 0;
                }
                if (i35 > 0) {
                    cVar6.foxtrot(kilo4, kilo3, i35, 8);
                    i17 = Math.max(i17, i35);
                }
                if (i36 > 0) {
                    if (!z10 || i39 != 1) {
                        cVar6.golf(kilo4, kilo3, i36, 8);
                    }
                    i17 = Math.min(i17, i36);
                }
                if (i39 == 1) {
                    if (z10) {
                        cVar6.echo(kilo4, kilo3, i17, 8);
                    } else if (z16) {
                        cVar6.echo(kilo4, kilo3, i17, 5);
                        cVar6.golf(kilo4, kilo3, i17, 8);
                    } else {
                        cVar6.echo(kilo4, kilo3, i17, 5);
                        cVar6.golf(kilo4, kilo3, i17, 8);
                    }
                } else if (i39 == 2) {
                    int i42 = cVar2.echo;
                    if (i42 != 3 && i42 != 5) {
                        kilo = cVar6.kilo(this.magenta.india(2));
                        kilo2 = cVar6.kilo(this.magenta.india(4));
                    } else {
                        kilo = cVar6.kilo(this.magenta.india(3));
                        kilo2 = cVar6.kilo(this.magenta.india(5));
                    }
                    W0.b lima = cVar6.lima();
                    int i43 = i35;
                    lima.delta.golf(kilo4, -1.0f);
                    lima.delta.golf(kilo3, 1.0f);
                    lima.delta.golf(kilo2, f10);
                    lima.delta.golf(kilo, -f10);
                    cVar6.charlie(lima);
                    if (z10) {
                        z23 = false;
                    }
                    z24 = z12;
                    i19 = i43;
                } else {
                    i19 = i35;
                    z24 = true;
                }
            } else {
                int max = Math.max(i35, i17);
                if (i36 > 0) {
                    max = Math.min(i36, max);
                }
                cVar6.echo(kilo4, kilo3, max, 8);
                z24 = z12;
                i19 = i35;
                z23 = false;
            }
            if (z19 || z16) {
                boolean z37 = z24;
                if (i38 >= 2 && z10 && z37) {
                    cVar6.foxtrot(kilo3, fVar, 0, 8);
                    c cVar7 = this.gray;
                    boolean z38 = z2 || cVar7.foxtrot == null;
                    if (!z2 && (cVar4 = cVar7.foxtrot) != null) {
                        d dVar2 = cVar4.delta;
                        if (dVar2.ochre != 0.0f) {
                            int[] iArr = dVar2.f2454h;
                            if (iArr[0] == 3 && iArr[1] == 3) {
                                z38 = true;
                            }
                        }
                        z38 = false;
                    }
                    if (z38) {
                        cVar6.foxtrot(fVar2, kilo4, 0, 8);
                        return;
                    }
                    return;
                }
                return;
            }
            if (!hotel && !hotel2 && !hotel3) {
                cVar5 = cVar3;
                fVar6 = kilo4;
                z25 = z24;
                fVar3 = kilo6;
            } else if (!hotel || hotel2) {
                if (hotel || !hotel2) {
                    fVar3 = kilo6;
                    if (hotel && hotel2) {
                        d dVar3 = cVar2.foxtrot.delta;
                        d dVar4 = cVar3.foxtrot.delta;
                        z25 = z24;
                        d dVar5 = this.magenta;
                        int i44 = 6;
                        if (z23) {
                            if (i39 == 0) {
                                if (i36 != 0 || i19 != 0) {
                                    i32 = 5;
                                    i33 = 5;
                                    z33 = true;
                                    z34 = false;
                                    z27 = true;
                                } else if (kilo5.white && fVar3.white) {
                                    cVar6.echo(kilo3, kilo5, cVar2.echo(), 8);
                                    cVar6.echo(kilo4, fVar3, -cVar3.echo(), 8);
                                    return;
                                } else {
                                    i32 = 8;
                                    i33 = 8;
                                    z33 = false;
                                    z34 = true;
                                    z27 = false;
                                }
                                if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                    cVar6 = cVar;
                                    i20 = i39;
                                    fVar5 = kilo3;
                                    fVar6 = kilo4;
                                    z28 = z34;
                                    fVar4 = fVar2;
                                    i22 = i32;
                                    fVar7 = kilo5;
                                    i21 = 6;
                                    z26 = z33;
                                    i23 = 4;
                                    if (z27 || fVar7 != fVar3 || dVar3 == dVar5) {
                                        z29 = true;
                                    } else {
                                        z27 = false;
                                        z29 = false;
                                    }
                                    if (z26) {
                                        dVar = dVar4;
                                        i24 = i19;
                                        i25 = i20;
                                        cVar5 = cVar3;
                                        z30 = z10;
                                    } else {
                                        if (z23 || z15 || z17 || fVar7 != fVar || fVar3 != fVar4) {
                                            z30 = z10;
                                            z32 = z29;
                                            i29 = i22;
                                        } else {
                                            i21 = 8;
                                            z30 = false;
                                            i29 = 8;
                                            z32 = false;
                                        }
                                        W0.f fVar8 = fVar7;
                                        i24 = i19;
                                        i25 = i20;
                                        dVar = dVar4;
                                        cVar5 = cVar3;
                                        cVar6.bravo(fVar5, fVar8, cVar2.echo(), f5, fVar3, fVar6, cVar3.echo(), i21);
                                        fVar7 = fVar8;
                                        i22 = i29;
                                        z29 = z32;
                                    }
                                    if (this.white != 8 && ((hashSet = cVar5.alpha) == null || hashSet.size() <= 0)) {
                                        return;
                                    }
                                    if (z27) {
                                        if (z30 && fVar7 != fVar3 && !z23 && ((dVar3 instanceof a) || (dVar instanceof a))) {
                                            i22 = 6;
                                        }
                                        cVar6.foxtrot(fVar5, fVar7, cVar2.echo(), i22);
                                        cVar6.golf(fVar6, fVar3, -cVar5.echo(), i22);
                                    }
                                    if (z30 || !z18 || (dVar3 instanceof a) || (dVar instanceof a) || dVar == dVar5) {
                                        i26 = i23;
                                        z31 = z29;
                                    } else {
                                        i26 = 6;
                                        i22 = 6;
                                        z31 = true;
                                    }
                                    if (z31) {
                                        if (z28 && (!z17 || z11)) {
                                            if (dVar3 != dVar5 && dVar != dVar5) {
                                                i44 = i26;
                                            }
                                            if ((dVar3 instanceof h) || (dVar instanceof h)) {
                                                i44 = 5;
                                            }
                                            if ((dVar3 instanceof a) || (dVar instanceof a)) {
                                                i44 = 5;
                                            }
                                            i26 = Math.max(z17 ? 5 : i44, i26);
                                        }
                                        if (z30) {
                                            i26 = Math.min(i22, i26);
                                            if (z14 && !z17 && (dVar3 == dVar5 || dVar == dVar5)) {
                                                i28 = 4;
                                                cVar6.echo(fVar5, fVar7, cVar2.echo(), i28);
                                                cVar6.echo(fVar6, fVar3, -cVar5.echo(), i28);
                                            }
                                        }
                                        i28 = i26;
                                        cVar6.echo(fVar5, fVar7, cVar2.echo(), i28);
                                        cVar6.echo(fVar6, fVar3, -cVar5.echo(), i28);
                                    }
                                    if (z30) {
                                        int echo = fVar == fVar7 ? cVar2.echo() : 0;
                                        if (fVar7 != fVar) {
                                            cVar6.foxtrot(fVar5, fVar, echo, 5);
                                        }
                                    }
                                    if (z30 && z23 && i11 == 0 && i24 == 0) {
                                        if (!z23 && i25 == 3) {
                                            cVar6.foxtrot(fVar6, fVar5, 0, 8);
                                        } else {
                                            i27 = 5;
                                            cVar6.foxtrot(fVar6, fVar5, 0, 5);
                                        }
                                    }
                                    i27 = 5;
                                } else {
                                    cVar6 = cVar;
                                    fVar5 = kilo3;
                                    fVar6 = kilo4;
                                    z28 = z34;
                                    i22 = i32;
                                    fVar7 = kilo5;
                                    i21 = 6;
                                    z26 = z33;
                                    i23 = i33;
                                    i20 = i39;
                                    fVar4 = fVar2;
                                    if (z27) {
                                    }
                                    z29 = true;
                                    if (z26) {
                                    }
                                    if (this.white != 8) {
                                    }
                                    if (z27) {
                                    }
                                    if (z30) {
                                    }
                                    i26 = i23;
                                    z31 = z29;
                                    if (z31) {
                                    }
                                    if (z30) {
                                    }
                                    if (z30) {
                                        if (!z23) {
                                        }
                                        i27 = 5;
                                        cVar6.foxtrot(fVar6, fVar5, 0, 5);
                                    }
                                    i27 = 5;
                                }
                            } else {
                                if (i39 == 2) {
                                    if ((dVar3 instanceof a) || (dVar4 instanceof a)) {
                                        cVar6 = cVar;
                                        i20 = i39;
                                        fVar5 = kilo3;
                                        fVar6 = kilo4;
                                        fVar7 = kilo5;
                                        i21 = 6;
                                        i22 = 5;
                                    } else {
                                        cVar6 = cVar;
                                        i20 = i39;
                                        fVar5 = kilo3;
                                        fVar6 = kilo4;
                                        fVar7 = kilo5;
                                        i21 = 6;
                                        i22 = 5;
                                        i23 = 5;
                                        z26 = true;
                                        z27 = true;
                                        z28 = false;
                                        fVar4 = fVar2;
                                        if (z27) {
                                        }
                                        z29 = true;
                                        if (z26) {
                                        }
                                        if (this.white != 8) {
                                        }
                                        if (z27) {
                                        }
                                        if (z30) {
                                        }
                                        i26 = i23;
                                        z31 = z29;
                                        if (z31) {
                                        }
                                        if (z30) {
                                        }
                                        if (z30) {
                                        }
                                        i27 = 5;
                                    }
                                } else if (i39 == 1) {
                                    cVar6 = cVar;
                                    i20 = i39;
                                    fVar5 = kilo3;
                                    fVar6 = kilo4;
                                    fVar7 = kilo5;
                                    i21 = 6;
                                    i22 = 8;
                                } else if (i39 == 3) {
                                    i20 = i39;
                                    if (this.amber != -1) {
                                        if (z14) {
                                            if (i14 == 2 || i14 == 1) {
                                                i30 = 5;
                                                i31 = 4;
                                            } else {
                                                i30 = 8;
                                                i31 = 5;
                                            }
                                            i23 = i31;
                                            fVar5 = kilo3;
                                            fVar6 = kilo4;
                                            fVar7 = kilo5;
                                            i21 = 6;
                                            z26 = true;
                                            z27 = true;
                                            z28 = true;
                                            fVar4 = fVar2;
                                        } else if (i36 > 0) {
                                            cVar6 = cVar;
                                            fVar4 = fVar2;
                                            fVar5 = kilo3;
                                            fVar6 = kilo4;
                                            fVar7 = kilo5;
                                            i21 = 6;
                                            i22 = 5;
                                        } else {
                                            if (i36 != 0 || i19 != 0) {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = kilo3;
                                                fVar6 = kilo4;
                                                fVar7 = kilo5;
                                                i21 = 6;
                                                i22 = 5;
                                                i23 = 4;
                                            } else if (z17) {
                                                i30 = (dVar3 == dVar5 || dVar4 == dVar5) ? 5 : 4;
                                                fVar4 = fVar2;
                                                fVar5 = kilo3;
                                                fVar6 = kilo4;
                                                fVar7 = kilo5;
                                                i21 = 6;
                                                i23 = 4;
                                                z26 = true;
                                                z27 = true;
                                                z28 = true;
                                            } else {
                                                cVar6 = cVar;
                                                fVar4 = fVar2;
                                                fVar5 = kilo3;
                                                fVar6 = kilo4;
                                                fVar7 = kilo5;
                                                i21 = 6;
                                                i22 = 5;
                                                i23 = 8;
                                            }
                                            z26 = true;
                                            z27 = true;
                                            z28 = true;
                                            if (z27) {
                                            }
                                            z29 = true;
                                            if (z26) {
                                            }
                                            if (this.white != 8) {
                                            }
                                            if (z27) {
                                            }
                                            if (z30) {
                                            }
                                            i26 = i23;
                                            z31 = z29;
                                            if (z31) {
                                            }
                                            if (z30) {
                                            }
                                            if (z30) {
                                            }
                                            i27 = 5;
                                        }
                                        i22 = i30;
                                        cVar6 = cVar;
                                        if (z27) {
                                        }
                                        z29 = true;
                                        if (z26) {
                                        }
                                        if (this.white != 8) {
                                        }
                                        if (z27) {
                                        }
                                        if (z30) {
                                        }
                                        i26 = i23;
                                        z31 = z29;
                                        if (z31) {
                                        }
                                        if (z30) {
                                        }
                                        if (z30) {
                                        }
                                        i27 = 5;
                                    } else if (z17) {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = kilo3;
                                        fVar6 = kilo4;
                                        fVar7 = kilo5;
                                        i22 = 8;
                                        i21 = z10 ? 5 : 4;
                                    } else {
                                        cVar6 = cVar;
                                        fVar4 = fVar2;
                                        fVar5 = kilo3;
                                        fVar6 = kilo4;
                                        fVar7 = kilo5;
                                        i22 = 8;
                                        i21 = 8;
                                    }
                                    i23 = 5;
                                    z26 = true;
                                    z27 = true;
                                    z28 = true;
                                    if (z27) {
                                    }
                                    z29 = true;
                                    if (z26) {
                                    }
                                    if (this.white != 8) {
                                    }
                                    if (z27) {
                                    }
                                    if (z30) {
                                    }
                                    i26 = i23;
                                    z31 = z29;
                                    if (z31) {
                                    }
                                    if (z30) {
                                    }
                                    if (z30) {
                                    }
                                    i27 = 5;
                                } else {
                                    i20 = i39;
                                    cVar6 = cVar;
                                    fVar4 = fVar2;
                                    fVar5 = kilo3;
                                    fVar6 = kilo4;
                                    fVar7 = kilo5;
                                    i21 = 6;
                                    i22 = 5;
                                    i23 = 4;
                                    z26 = false;
                                    z27 = false;
                                }
                                i23 = 4;
                                z26 = true;
                                z27 = true;
                                z28 = false;
                                fVar4 = fVar2;
                                if (z27) {
                                }
                                z29 = true;
                                if (z26) {
                                }
                                if (this.white != 8) {
                                }
                                if (z27) {
                                }
                                if (z30) {
                                }
                                i26 = i23;
                                z31 = z29;
                                if (z31) {
                                }
                                if (z30) {
                                }
                                if (z30) {
                                }
                                i27 = 5;
                            }
                            i34 = i27;
                            if (z30 && z25) {
                                int echo2 = cVar5.foxtrot != null ? cVar5.echo() : 0;
                                if (fVar3 != fVar2) {
                                    cVar6.foxtrot(fVar2, fVar6, echo2, i34);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        i20 = i39;
                        if (kilo5.white && fVar3.white) {
                            cVar.bravo(kilo3, kilo5, cVar2.echo(), f5, fVar3, kilo4, cVar3.echo(), 8);
                            if (z10 && z25) {
                                int echo3 = cVar3.foxtrot != null ? cVar3.echo() : 0;
                                if (fVar3 != fVar2) {
                                    cVar.foxtrot(fVar2, kilo4, echo3, 5);
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        cVar6 = cVar;
                        fVar4 = fVar2;
                        fVar5 = kilo3;
                        fVar6 = kilo4;
                        fVar7 = kilo5;
                        i21 = 6;
                        i22 = 5;
                        i23 = 4;
                        z26 = true;
                        z27 = true;
                        z28 = false;
                        if (z27) {
                        }
                        z29 = true;
                        if (z26) {
                        }
                        if (this.white != 8) {
                        }
                        if (z27) {
                        }
                        if (z30) {
                        }
                        i26 = i23;
                        z31 = z29;
                        if (z31) {
                        }
                        if (z30) {
                        }
                        if (z30) {
                        }
                        i27 = 5;
                        i34 = i27;
                        if (z30) {
                            return;
                        } else {
                            return;
                        }
                    }
                } else {
                    fVar3 = kilo6;
                    cVar6.echo(kilo4, fVar3, -cVar3.echo(), 8);
                    if (z10) {
                        cVar6.foxtrot(kilo3, fVar, 0, 5);
                        cVar5 = cVar3;
                        i27 = 5;
                        fVar6 = kilo4;
                        z25 = z24;
                        z30 = z10;
                        i34 = i27;
                        if (z30) {
                        }
                    }
                }
                cVar5 = cVar3;
                fVar6 = kilo4;
                z25 = z24;
            } else {
                cVar5 = cVar3;
                fVar6 = kilo4;
                z25 = z24;
                fVar3 = kilo6;
                z30 = z10;
                i34 = (z10 && (cVar2.foxtrot.delta instanceof a)) ? 8 : 5;
                if (z30) {
                }
            }
            i27 = 5;
            z30 = z10;
            i34 = i27;
            if (z30) {
            }
        } else if (z13) {
            cVar6.echo(kilo4, kilo3, 0, 3);
            if (i11 > 0) {
                cVar6.foxtrot(kilo4, kilo3, i11, i18);
            }
            if (i12 < Integer.MAX_VALUE) {
                cVar6.golf(kilo4, kilo3, i12, i18);
            }
        } else {
            cVar6.echo(kilo4, kilo3, i17, i18);
        }
        z24 = z12;
        i19 = i35;
        if (z19) {
        }
        boolean z372 = z24;
        if (i38 >= 2) {
        }
    }

    public final void echo(int i4, d dVar, int i5, int i10) {
        boolean z2;
        if (i4 == 7) {
            if (i5 == 7) {
                c india = india(2);
                c india2 = india(4);
                c india3 = india(3);
                c india4 = india(5);
                boolean z10 = true;
                if ((india != null && india.hotel()) || (india2 != null && india2.hotel())) {
                    z2 = false;
                } else {
                    echo(2, dVar, 2, 0);
                    echo(4, dVar, 4, 0);
                    z2 = true;
                }
                if ((india3 != null && india3.hotel()) || (india4 != null && india4.hotel())) {
                    z10 = false;
                } else {
                    echo(3, dVar, 3, 0);
                    echo(5, dVar, 5, 0);
                }
                if (z2 && z10) {
                    india(7).alpha(dVar.india(7), 0);
                    return;
                } else if (z2) {
                    india(8).alpha(dVar.india(8), 0);
                    return;
                } else {
                    if (z10) {
                        india(9).alpha(dVar.india(9), 0);
                        return;
                    }
                    return;
                }
            }
            if (i5 != 2 && i5 != 4) {
                if (i5 == 3 || i5 == 5) {
                    echo(3, dVar, i5, 0);
                    echo(5, dVar, i5, 0);
                    india(7).alpha(dVar.india(i5), 0);
                    return;
                }
                return;
            }
            echo(2, dVar, i5, 0);
            echo(4, dVar, i5, 0);
            india(7).alpha(dVar.india(i5), 0);
            return;
        }
        if (i4 == 8 && (i5 == 2 || i5 == 4)) {
            c india5 = india(2);
            c india6 = dVar.india(i5);
            c india7 = india(4);
            india5.alpha(india6, 0);
            india7.alpha(india6, 0);
            india(8).alpha(india6, 0);
            return;
        }
        if (i4 == 9 && (i5 == 3 || i5 == 5)) {
            c india8 = dVar.india(i5);
            india(3).alpha(india8, 0);
            india(5).alpha(india8, 0);
            india(9).alpha(india8, 0);
            return;
        }
        if (i4 == 8 && i5 == 8) {
            india(2).alpha(dVar.india(2), 0);
            india(4).alpha(dVar.india(4), 0);
            india(8).alpha(dVar.india(i5), 0);
            return;
        }
        if (i4 == 9 && i5 == 9) {
            india(3).alpha(dVar.india(3), 0);
            india(5).alpha(dVar.india(5), 0);
            india(9).alpha(dVar.india(i5), 0);
            return;
        }
        c india9 = india(i4);
        c india10 = dVar.india(i5);
        if (india9.india(india10)) {
            if (i4 == 6) {
                c india11 = india(3);
                c india12 = india(5);
                if (india11 != null) {
                    india11.juliet();
                }
                if (india12 != null) {
                    india12.juliet();
                }
            } else if (i4 != 3 && i4 != 5) {
                if (i4 == 2 || i4 == 4) {
                    c india13 = india(7);
                    if (india13.foxtrot != india10) {
                        india13.juliet();
                    }
                    c foxtrot = india(i4).foxtrot();
                    c india14 = india(8);
                    if (india14.hotel()) {
                        foxtrot.juliet();
                        india14.juliet();
                    }
                }
            } else {
                c india15 = india(6);
                if (india15 != null) {
                    india15.juliet();
                }
                c india16 = india(7);
                if (india16.foxtrot != india10) {
                    india16.juliet();
                }
                c foxtrot2 = india(i4).foxtrot();
                c india17 = india(9);
                if (india17.hotel()) {
                    foxtrot2.juliet();
                    india17.juliet();
                }
            }
            india9.alpha(india10, i10);
        }
    }

    public final void emerald(int i4, int i5) {
        if (this.kilo) {
            return;
        }
        this.cyan.lima(i4);
        this.fuchsia.lima(i5);
        this.orange = i4;
        this.maroon = i5 - i4;
        this.kilo = true;
    }

    public final void foxtrot(c cVar, c cVar2, int i4) {
        if (cVar.delta == this) {
            echo(cVar.echo, cVar2.delta, cVar2.echo, i4);
        }
    }

    public final void fuchsia(int i4, int i5) {
        if (this.lima) {
            return;
        }
        this.emerald.lima(i4);
        this.gold.lima(i5);
        this.peach = i4;
        this.navy = i5 - i4;
        if (this.blue) {
            this.gray.lima(i4 + this.pink);
        }
        this.lima = true;
    }

    public final void gold(int i4) {
        this.navy = i4;
        int i5 = this.purple;
        if (i4 < i5) {
            this.navy = i5;
        }
    }

    public final void golf(W0.c cVar) {
        cVar.kilo(this.cyan);
        cVar.kilo(this.emerald);
        cVar.kilo(this.fuchsia);
        cVar.kilo(this.gold);
        if (this.pink > 0) {
            cVar.kilo(this.gray);
        }
    }

    public final void gray(int i4) {
        this.f2454h[0] = i4;
    }

    public final void green(int i4) {
        this.f2454h[1] = i4;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [a1.m, a1.o] */
    /* JADX WARN: Type inference failed for: r0v3, types: [a1.k, a1.o] */
    public final void hotel() {
        if (this.delta == null) {
            ?? oVar = new o(this);
            oVar.hotel.echo = 4;
            oVar.india.echo = 5;
            oVar.foxtrot = 0;
            this.delta = oVar;
        }
        if (this.echo == null) {
            ?? oVar2 = new o(this);
            a1.f fVar = new a1.f(oVar2);
            oVar2.kilo = fVar;
            oVar2.lima = null;
            oVar2.hotel.echo = 6;
            oVar2.india.echo = 7;
            fVar.echo = 8;
            oVar2.foxtrot = 1;
            this.echo = oVar2;
        }
    }

    public c india(int i4) {
        switch (q.mike(i4)) {
            case 0:
                return null;
            case 1:
                return this.cyan;
            case 2:
                return this.emerald;
            case 3:
                return this.fuchsia;
            case 4:
                return this.gold;
            case 5:
                return this.gray;
            case 6:
                return this.ivory;
            case 7:
                return this.green;
            case 8:
                return this.indigo;
            default:
                throw new AssertionError(Q0.c.black(i4));
        }
    }

    public final void indigo(int i4) {
        this.maroon = i4;
        int i5 = this.plum;
        if (i4 < i5) {
            this.maroon = i5;
        }
    }

    public void ivory(boolean z2, boolean z10) {
        int i4;
        int i5;
        k kVar = this.delta;
        boolean z11 = z2 & kVar.golf;
        m mVar = this.echo;
        boolean z12 = z10 & mVar.golf;
        int i10 = kVar.hotel.golf;
        int i11 = mVar.hotel.golf;
        int i12 = kVar.india.golf;
        int i13 = mVar.india.golf;
        int i14 = i13 - i11;
        if (i12 - i10 < 0 || i14 < 0 || i10 == Integer.MIN_VALUE || i10 == Integer.MAX_VALUE || i11 == Integer.MIN_VALUE || i11 == Integer.MAX_VALUE || i12 == Integer.MIN_VALUE || i12 == Integer.MAX_VALUE || i13 == Integer.MIN_VALUE || i13 == Integer.MAX_VALUE) {
            i12 = 0;
            i13 = 0;
            i10 = 0;
            i11 = 0;
        }
        int i15 = i12 - i10;
        int i16 = i13 - i11;
        if (z11) {
            this.orange = i10;
        }
        if (z12) {
            this.peach = i11;
        }
        if (this.white == 8) {
            this.maroon = 0;
            this.navy = 0;
            return;
        }
        int[] iArr = this.f2454h;
        if (z11) {
            if (iArr[0] == 1 && i15 < (i5 = this.maroon)) {
                i15 = i5;
            }
            this.maroon = i15;
            int i17 = this.plum;
            if (i15 < i17) {
                this.maroon = i17;
            }
        }
        if (z12) {
            if (iArr[1] == 1 && i16 < (i4 = this.navy)) {
                i16 = i4;
            }
            this.navy = i16;
            int i18 = this.purple;
            if (i16 < i18) {
                this.navy = i18;
            }
        }
    }

    public void jade(W0.c cVar, boolean z2) {
        int i4;
        int i5;
        m mVar;
        k kVar;
        c cVar2 = this.cyan;
        cVar.getClass();
        int november = W0.c.november(cVar2);
        int november2 = W0.c.november(this.emerald);
        int november3 = W0.c.november(this.fuchsia);
        int november4 = W0.c.november(this.gold);
        if (z2 && (kVar = this.delta) != null) {
            a1.f fVar = kVar.hotel;
            if (fVar.juliet) {
                a1.f fVar2 = kVar.india;
                if (fVar2.juliet) {
                    november = fVar.golf;
                    november3 = fVar2.golf;
                }
            }
        }
        if (z2 && (mVar = this.echo) != null) {
            a1.f fVar3 = mVar.hotel;
            if (fVar3.juliet) {
                a1.f fVar4 = mVar.india;
                if (fVar4.juliet) {
                    november2 = fVar3.golf;
                    november4 = fVar4.golf;
                }
            }
        }
        int i10 = november4 - november2;
        if (november3 - november < 0 || i10 < 0 || november == Integer.MIN_VALUE || november == Integer.MAX_VALUE || november2 == Integer.MIN_VALUE || november2 == Integer.MAX_VALUE || november3 == Integer.MIN_VALUE || november3 == Integer.MAX_VALUE || november4 == Integer.MIN_VALUE || november4 == Integer.MAX_VALUE) {
            november = 0;
            november2 = 0;
            november3 = 0;
            november4 = 0;
        }
        int i11 = november3 - november;
        int i12 = november4 - november2;
        this.orange = november;
        this.peach = november2;
        if (this.white == 8) {
            this.maroon = 0;
            this.navy = 0;
            return;
        }
        int[] iArr = this.f2454h;
        int i13 = iArr[0];
        if (i13 == 1 && i11 < (i5 = this.maroon)) {
            i11 = i5;
        }
        if (iArr[1] == 1 && i12 < (i4 = this.navy)) {
            i12 = i4;
        }
        this.maroon = i11;
        this.navy = i12;
        int i14 = this.purple;
        if (i12 < i14) {
            this.navy = i14;
        }
        int i15 = this.plum;
        if (i11 < i15) {
            this.maroon = i15;
        }
        int i16 = this.victor;
        if (i16 > 0 && i13 == 3) {
            this.maroon = Math.min(this.maroon, i16);
        }
        int i17 = this.yankee;
        if (i17 > 0 && iArr[1] == 3) {
            this.navy = Math.min(this.navy, i17);
        }
        int i18 = this.maroon;
        if (i11 != i18) {
            this.hotel = i18;
        }
        int i19 = this.navy;
        if (i12 != i19) {
            this.india = i19;
        }
    }

    public final int juliet(int i4) {
        int[] iArr = this.f2454h;
        if (i4 == 0) {
            return iArr[0];
        }
        if (i4 != 1) {
            return 0;
        }
        return iArr[1];
    }

    public final int kilo() {
        if (this.white == 8) {
            return 0;
        }
        return this.navy;
    }

    public final d lima(int i4) {
        c cVar;
        c cVar2;
        if (i4 == 0) {
            c cVar3 = this.fuchsia;
            c cVar4 = cVar3.foxtrot;
            if (cVar4 != null && cVar4.foxtrot == cVar3) {
                return cVar4.delta;
            }
            return null;
        }
        if (i4 == 1 && (cVar2 = (cVar = this.gold).foxtrot) != null && cVar2.foxtrot == cVar) {
            return cVar2.delta;
        }
        return null;
    }

    public final d mike(int i4) {
        c cVar;
        c cVar2;
        if (i4 == 0) {
            c cVar3 = this.cyan;
            c cVar4 = cVar3.foxtrot;
            if (cVar4 != null && cVar4.foxtrot == cVar3) {
                return cVar4.delta;
            }
            return null;
        }
        if (i4 == 1 && (cVar2 = (cVar = this.emerald).foxtrot) != null && cVar2.foxtrot == cVar) {
            return cVar2.delta;
        }
        return null;
    }

    public void november(StringBuilder sb2) {
        sb2.append("  " + this.juliet + ":{\n");
        StringBuilder sb3 = new StringBuilder("    actualWidth:");
        sb3.append(this.maroon);
        sb2.append(sb3.toString());
        sb2.append("\n");
        sb2.append("    actualHeight:" + this.navy);
        sb2.append("\n");
        sb2.append("    actualLeft:" + this.orange);
        sb2.append("\n");
        sb2.append("    actualTop:" + this.peach);
        sb2.append("\n");
        papa(sb2, "left", this.cyan);
        papa(sb2, "top", this.emerald);
        papa(sb2, "right", this.fuchsia);
        papa(sb2, "bottom", this.gold);
        papa(sb2, "baseline", this.gray);
        papa(sb2, "centerX", this.green);
        papa(sb2, "centerY", this.indigo);
        int i4 = this.maroon;
        int i5 = this.plum;
        int[] iArr = this.beige;
        int i10 = iArr[0];
        int i11 = this.uniform;
        int i12 = this.romeo;
        float f5 = this.whiskey;
        int[] iArr2 = this.f2454h;
        int i13 = iArr2[0];
        float[] fArr = this.f2450c;
        float f10 = fArr[0];
        oscar(sb2, "    width", i4, i5, i10, i11, i12, f5, i13);
        int i14 = this.navy;
        int i15 = this.purple;
        int i16 = iArr[1];
        int i17 = this.xray;
        int i18 = this.sierra;
        float f11 = this.zulu;
        int i19 = iArr2[1];
        float f12 = fArr[1];
        oscar(sb2, "    height", i14, i15, i16, i17, i18, f11, i19);
        float f13 = this.ochre;
        int i20 = this.olive;
        if (f13 != 0.0f) {
            sb2.append("    dimensionRatio");
            sb2.append(" :  [");
            sb2.append(f13);
            sb2.append(Constants.SEPARATOR_COMMA);
            sb2.append(i20);
            sb2.append("");
            sb2.append("],\n");
        }
        crimson(sb2, "    horizontalBias", this.red, 0.5f);
        crimson(sb2, "    verticalBias", this.silver, 0.5f);
        coral(this.f2448a, 0, "    horizontalChainStyle", sb2);
        coral(this.f2449b, 0, "    verticalChainStyle", sb2);
        sb2.append("  }");
    }

    public final int quebec() {
        if (this.white == 8) {
            return 0;
        }
        return this.maroon;
    }

    public final int romeo() {
        d dVar = this.magenta;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f2463p + this.orange;
        }
        return this.orange;
    }

    public final int sierra() {
        d dVar = this.magenta;
        if (dVar != null && (dVar instanceof e)) {
            return ((e) dVar).f2464q + this.peach;
        }
        return this.peach;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003a A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean tango(int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        int i13;
        if (i4 == 0) {
            if (this.cyan.foxtrot != null) {
                i12 = 1;
            } else {
                i12 = 0;
            }
            if (this.fuchsia.foxtrot != null) {
                i13 = 1;
            } else {
                i13 = 0;
            }
            if (i12 + i13 >= 2) {
                return false;
            }
            return true;
        }
        if (this.emerald.foxtrot != null) {
            i5 = 1;
        } else {
            i5 = 0;
        }
        if (this.gold.foxtrot != null) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        int i14 = i5 + i10;
        if (this.gray.foxtrot != null) {
            i11 = 1;
        } else {
            i11 = 0;
        }
        if (i14 + i11 < 2) {
        }
    }

    public String toString() {
        String str = "";
        StringBuilder tango = Q0.c.tango("");
        if (this.yellow != null) {
            str = P0.gold(new StringBuilder("id: "), this.yellow, " ");
        }
        tango.append(str);
        tango.append("(");
        tango.append(this.orange);
        tango.append(", ");
        tango.append(this.peach);
        tango.append(") - (");
        tango.append(this.maroon);
        tango.append(" x ");
        return P0.cyan(tango, this.navy, ")");
    }

    public final boolean uniform(int i4, int i5) {
        c cVar;
        c cVar2;
        c cVar3;
        c cVar4;
        if (i4 == 0) {
            c cVar5 = this.cyan;
            c cVar6 = cVar5.foxtrot;
            if (cVar6 != null && cVar6.charlie && (cVar4 = (cVar3 = this.fuchsia).foxtrot) != null && cVar4.charlie) {
                if ((cVar4.delta() - cVar3.echo()) - (cVar5.echo() + cVar5.foxtrot.delta()) >= i5) {
                    return true;
                }
                return false;
            }
            return false;
        }
        c cVar7 = this.emerald;
        c cVar8 = cVar7.foxtrot;
        if (cVar8 != null && cVar8.charlie && (cVar2 = (cVar = this.gold).foxtrot) != null && cVar2.charlie) {
            if ((cVar2.delta() - cVar.echo()) - (cVar7.echo() + cVar7.foxtrot.delta()) >= i5) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void victor(int i4, int i5, int i10, int i11, d dVar) {
        india(i4).bravo(dVar.india(i5), i10, i11, true);
    }

    public final boolean whiskey(int i4) {
        c cVar;
        c cVar2;
        int i5 = i4 * 2;
        c[] cVarArr = this.jade;
        c cVar3 = cVarArr[i5];
        c cVar4 = cVar3.foxtrot;
        if (cVar4 != null && cVar4.foxtrot != cVar3 && (cVar2 = (cVar = cVarArr[i5 + 1]).foxtrot) != null && cVar2.foxtrot == cVar) {
            return true;
        }
        return false;
    }

    public final boolean xray() {
        c cVar = this.cyan;
        c cVar2 = cVar.foxtrot;
        if (cVar2 == null || cVar2.foxtrot != cVar) {
            c cVar3 = this.fuchsia;
            c cVar4 = cVar3.foxtrot;
            if (cVar4 != null && cVar4.foxtrot == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean yankee() {
        c cVar = this.emerald;
        c cVar2 = cVar.foxtrot;
        if (cVar2 == null || cVar2.foxtrot != cVar) {
            c cVar3 = this.gold;
            c cVar4 = cVar3.foxtrot;
            if (cVar4 != null && cVar4.foxtrot == cVar3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean zulu() {
        if (this.golf && this.white != 8) {
            return true;
        }
        return false;
    }
}
