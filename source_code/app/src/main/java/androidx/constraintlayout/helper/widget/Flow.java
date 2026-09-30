package androidx.constraintlayout.helper.widget;

import Z0.c;
import Z0.d;
import Z0.e;
import Z0.f;
import Z0.g;
import Z0.h;
import Z0.i;
import a1.b;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import c1.AbstractC0820s;
import c1.AbstractC0822u;
import c1.C0807f;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes3.dex */
public class Flow extends AbstractC0822u {

    /* renamed from: c, reason: collision with root package name */
    public final g f3028c;

    /* JADX WARN: Type inference failed for: r1v0, types: [a1.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v1, types: [Z0.g, Z0.i] */
    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.alpha = new int[32];
        this.yellow = new HashMap();
        this.red = context;
        super.golf(attributeSet);
        ?? iVar = new i();
        iVar.f2490k = 0;
        iVar.f2491l = 0;
        iVar.f2492m = 0;
        iVar.f2493n = 0;
        iVar.f2494o = 0;
        iVar.f2495p = 0;
        iVar.f2496q = false;
        iVar.f2497r = 0;
        iVar.f2498s = 0;
        iVar.f2499t = new Object();
        iVar.f2500u = null;
        iVar.f2501v = -1;
        iVar.f2502w = -1;
        iVar.f2503x = -1;
        iVar.f2504y = -1;
        iVar.f2505z = -1;
        iVar.A = -1;
        iVar.B = 0.5f;
        iVar.C = 0.5f;
        iVar.f2474D = 0.5f;
        iVar.f2475E = 0.5f;
        iVar.f2476F = 0.5f;
        iVar.f2477G = 0.5f;
        iVar.f2478H = 0;
        iVar.f2479I = 0;
        iVar.f2480J = 2;
        iVar.f2481K = 2;
        iVar.f2482L = 0;
        iVar.f2483M = -1;
        iVar.f2484N = 0;
        iVar.f2485O = new ArrayList();
        iVar.f2486P = null;
        iVar.Q = null;
        iVar.f2487R = null;
        iVar.f2489T = 0;
        this.f3028c = iVar;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC0820s.bravo);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i4 = 0; i4 < indexCount; i4++) {
                int index = obtainStyledAttributes.getIndex(i4);
                if (index == 0) {
                    this.f3028c.f2484N = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    g gVar = this.f3028c;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar.f2490k = dimensionPixelSize;
                    gVar.f2491l = dimensionPixelSize;
                    gVar.f2492m = dimensionPixelSize;
                    gVar.f2493n = dimensionPixelSize;
                } else if (index == 18) {
                    g gVar2 = this.f3028c;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    gVar2.f2492m = dimensionPixelSize2;
                    gVar2.f2494o = dimensionPixelSize2;
                    gVar2.f2495p = dimensionPixelSize2;
                } else if (index == 19) {
                    this.f3028c.f2493n = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.f3028c.f2494o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.f3028c.f2490k = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.f3028c.f2495p = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.f3028c.f2491l = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.f3028c.f2482L = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.f3028c.f2501v = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.f3028c.f2502w = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.f3028c.f2503x = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.f3028c.f2505z = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.f3028c.f2504y = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.f3028c.A = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.f3028c.B = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.f3028c.f2474D = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.f3028c.f2476F = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.f3028c.f2475E = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.f3028c.f2477G = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.f3028c.C = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.f3028c.f2480J = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.f3028c.f2481K = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.f3028c.f2478H = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.f3028c.f2479I = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.f3028c.f2483M = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.silver = this.f3028c;
        india();
    }

    @Override // c1.AbstractC0804c
    public final void hotel(d dVar, boolean z2) {
        g gVar = this.f3028c;
        int i4 = gVar.f2492m;
        if (i4 <= 0 && gVar.f2493n <= 0) {
            return;
        }
        if (z2) {
            gVar.f2494o = gVar.f2493n;
            gVar.f2495p = i4;
        } else {
            gVar.f2494o = i4;
            gVar.f2495p = gVar.f2493n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06e6  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0713  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0716  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x06f7  */
    /* JADX WARN: Type inference failed for: r28v0 */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v2 */
    @Override // c1.AbstractC0822u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void juliet(g gVar, int i4, int i5) {
        int i10;
        int i11;
        d[] dVarArr;
        int i12;
        int i13;
        int i14;
        int[] iArr;
        int i15;
        int i16;
        f fVar;
        ?? r28;
        int i17;
        boolean z2;
        int i18;
        boolean z10;
        int i19;
        boolean z11;
        boolean z12;
        int i20;
        int i21;
        int i22;
        boolean z13;
        Object obj;
        d dVar;
        int i23;
        boolean z14;
        int i24;
        boolean z15;
        boolean z16;
        int i25;
        int i26;
        int i27;
        C0807f c0807f;
        int mode = View.MeasureSpec.getMode(i4);
        int size = View.MeasureSpec.getSize(i4);
        int mode2 = View.MeasureSpec.getMode(i5);
        int size2 = View.MeasureSpec.getSize(i5);
        if (gVar != null) {
            if (gVar.f2513j > 0) {
                d dVar2 = gVar.magenta;
                if (dVar2 != null) {
                    c0807f = ((e) dVar2).f2460m;
                } else {
                    c0807f = null;
                }
                if (c0807f == null) {
                    gVar.f2497r = 0;
                    gVar.f2498s = 0;
                    gVar.f2496q = false;
                    setMeasuredDimension(gVar.f2497r, gVar.f2498s);
                    return;
                }
                for (int i28 = 0; i28 < gVar.f2513j; i28++) {
                    d dVar3 = gVar.f2512i[i28];
                    if (dVar3 != null && !(dVar3 instanceof h)) {
                        int juliet = dVar3.juliet(0);
                        int juliet2 = dVar3.juliet(1);
                        if (juliet != 3 || dVar3.romeo == 1 || juliet2 != 3 || dVar3.sierra == 1) {
                            if (juliet == 3) {
                                juliet = 2;
                            }
                            if (juliet2 == 3) {
                                juliet2 = 2;
                            }
                            b bVar = gVar.f2499t;
                            bVar.alpha = juliet;
                            bVar.bravo = juliet2;
                            bVar.charlie = dVar3.quebec();
                            bVar.delta = dVar3.kilo();
                            c0807f.bravo(dVar3, bVar);
                            dVar3.indigo(bVar.echo);
                            dVar3.gold(bVar.foxtrot);
                            dVar3.cyan(bVar.golf);
                        }
                    }
                }
            }
            int i29 = gVar.f2494o;
            int i30 = gVar.f2495p;
            int i31 = gVar.f2490k;
            int i32 = gVar.f2491l;
            int[] iArr2 = new int[2];
            int i33 = (size - i29) - i30;
            int i34 = gVar.f2484N;
            if (i34 == 1) {
                i33 = (size2 - i31) - i32;
            }
            if (i34 == 0) {
                if (gVar.f2501v == -1) {
                    gVar.f2501v = 0;
                }
                if (gVar.f2502w == -1) {
                    gVar.f2502w = 0;
                }
            } else {
                if (gVar.f2501v == -1) {
                    gVar.f2501v = 0;
                }
                if (gVar.f2502w == -1) {
                    gVar.f2502w = 0;
                }
            }
            d[] dVarArr2 = gVar.f2512i;
            int i35 = 0;
            int i36 = 0;
            char c3 = 0;
            while (true) {
                i10 = gVar.f2513j;
                if (i35 >= i10) {
                    break;
                }
                if (gVar.f2512i[i35].white == 8) {
                    i36++;
                }
                i35++;
            }
            if (i36 > 0) {
                d[] dVarArr3 = new d[i10 - i36];
                int i37 = 0;
                i11 = 0;
                while (i37 < gVar.f2513j) {
                    d dVar4 = gVar.f2512i[i37];
                    int i38 = i29;
                    d[] dVarArr4 = dVarArr3;
                    if (dVar4.white != 8) {
                        dVarArr4[i11] = dVar4;
                        i11++;
                    }
                    i37++;
                    i29 = i38;
                    dVarArr3 = dVarArr4;
                }
                dVarArr = dVarArr3;
            } else {
                i11 = i10;
                dVarArr = dVarArr2;
            }
            int i39 = i29;
            gVar.f2488S = dVarArr;
            gVar.f2489T = i11;
            int i40 = gVar.f2482L;
            ArrayList arrayList = gVar.f2485O;
            if (i40 != 0) {
                c cVar = gVar.emerald;
                c cVar2 = gVar.cyan;
                c cVar3 = gVar.fuchsia;
                c cVar4 = gVar.gold;
                int[] iArr3 = gVar.f2454h;
                if (i40 != 1) {
                    if (i40 != 2) {
                        if (i40 == 3) {
                            int i41 = gVar.f2484N;
                            if (i11 != 0) {
                                arrayList.clear();
                                i16 = i39;
                                i12 = i30;
                                i13 = i31;
                                i14 = i32;
                                iArr = iArr2;
                                f fVar2 = new f(gVar, i41, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                                arrayList.add(fVar2);
                                if (i41 == 0) {
                                    int i42 = 0;
                                    int i43 = 0;
                                    i23 = 0;
                                    int i44 = 0;
                                    while (i42 < i11) {
                                        i43++;
                                        d dVar5 = dVarArr[i42];
                                        int maroon = gVar.maroon(dVar5, i33);
                                        int i45 = i41;
                                        int i46 = i42;
                                        if (dVar5.f2454h[0] == 3) {
                                            i23++;
                                        }
                                        int i47 = i23;
                                        if ((i44 == i33 || gVar.f2478H + i44 + maroon > i33) && fVar2.bravo != null) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        if (!z16 && i46 > 0 && (i27 = gVar.f2483M) > 0 && i43 > i27) {
                                            z16 = true;
                                        }
                                        if (z16) {
                                            i41 = i45;
                                            i25 = size2;
                                            i26 = i46;
                                            fVar2 = new f(gVar, i41, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                                            fVar2.november = i26;
                                            arrayList.add(fVar2);
                                            i44 = maroon;
                                            i43 = 1;
                                        } else {
                                            i41 = i45;
                                            i25 = size2;
                                            i26 = i46;
                                            if (i26 > 0) {
                                                i44 = gVar.f2478H + maroon + i44;
                                            } else {
                                                i44 = maroon;
                                            }
                                        }
                                        fVar2.alpha(dVar5);
                                        i42 = i26 + 1;
                                        i23 = i47;
                                        size2 = i25;
                                    }
                                    i15 = size2;
                                } else {
                                    i15 = size2;
                                    int i48 = 0;
                                    int i49 = 0;
                                    int i50 = 0;
                                    int i51 = 0;
                                    while (i48 < i11) {
                                        i49++;
                                        d dVar6 = dVarArr[i48];
                                        int magenta = gVar.magenta(dVar6, i33);
                                        int i52 = i41;
                                        if (dVar6.f2454h[1] == 3) {
                                            i50++;
                                        }
                                        int i53 = i50;
                                        if ((i51 == i33 || gVar.f2479I + i51 + magenta > i33) && fVar2.bravo != null) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        if (!z14 && i48 > 0 && (i24 = gVar.f2483M) > 0 && i49 > i24) {
                                            z14 = true;
                                        }
                                        if (z14) {
                                            i41 = i52;
                                            fVar2 = new f(gVar, i41, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                                            fVar2.november = i48;
                                            arrayList.add(fVar2);
                                            i51 = magenta;
                                            i49 = 1;
                                        } else {
                                            i41 = i52;
                                            if (i48 > 0) {
                                                i51 = gVar.f2479I + magenta + i51;
                                            } else {
                                                i51 = magenta;
                                            }
                                        }
                                        fVar2.alpha(dVar6);
                                        i48++;
                                        i50 = i53;
                                    }
                                    i23 = i50;
                                }
                                int size3 = arrayList.size();
                                int i54 = gVar.f2494o;
                                int i55 = gVar.f2490k;
                                int i56 = gVar.f2495p;
                                int i57 = gVar.f2491l;
                                if (iArr3[0] != 2 && iArr3[1] != 2) {
                                    z15 = false;
                                } else {
                                    z15 = true;
                                }
                                if (i23 > 0 && z15) {
                                    for (int i58 = 0; i58 < size3; i58++) {
                                        f fVar3 = (f) arrayList.get(i58);
                                        if (i41 == 0) {
                                            fVar3.echo(i33 - fVar3.delta());
                                        } else {
                                            fVar3.echo(i33 - fVar3.charlie());
                                        }
                                    }
                                }
                                int i59 = i54;
                                int i60 = i55;
                                int i61 = i56;
                                int i62 = i57;
                                c cVar5 = cVar2;
                                c cVar6 = cVar;
                                int i63 = 0;
                                int i64 = 0;
                                c cVar7 = cVar3;
                                c cVar8 = cVar4;
                                for (int i65 = 0; i65 < size3; i65++) {
                                    f fVar4 = (f) arrayList.get(i65);
                                    if (i41 == 0) {
                                        if (i65 < size3 - 1) {
                                            cVar8 = ((f) arrayList.get(i65 + 1)).bravo.emerald;
                                            i62 = 0;
                                        } else {
                                            i62 = gVar.f2491l;
                                            cVar8 = cVar4;
                                        }
                                        c cVar9 = fVar4.bravo.gold;
                                        fVar4.foxtrot(i41, cVar5, cVar6, cVar7, cVar8, i59, i60, i61, i62, i33);
                                        i63 = Math.max(i63, fVar4.delta());
                                        int charlie = fVar4.charlie() + i64;
                                        if (i65 > 0) {
                                            charlie += gVar.f2479I;
                                        }
                                        i64 = charlie;
                                        cVar6 = cVar9;
                                        i60 = 0;
                                    } else {
                                        if (i65 < size3 - 1) {
                                            cVar7 = ((f) arrayList.get(i65 + 1)).bravo.cyan;
                                            i61 = 0;
                                        } else {
                                            i61 = gVar.f2495p;
                                            cVar7 = cVar3;
                                        }
                                        c cVar10 = fVar4.bravo.fuchsia;
                                        fVar4.foxtrot(i41, cVar5, cVar6, cVar7, cVar8, i59, i60, i61, i62, i33);
                                        int delta = fVar4.delta() + i63;
                                        int max = Math.max(i64, fVar4.charlie());
                                        if (i65 > 0) {
                                            delta += gVar.f2478H;
                                        }
                                        i64 = max;
                                        i63 = delta;
                                        cVar5 = cVar10;
                                        i59 = 0;
                                    }
                                }
                                iArr[0] = i63;
                                iArr[1] = i64;
                            }
                        }
                        i12 = i30;
                        i13 = i31;
                        i14 = i32;
                        iArr = iArr2;
                        i15 = size2;
                        i16 = i39;
                    } else {
                        i12 = i30;
                        i13 = i31;
                        i14 = i32;
                        iArr = iArr2;
                        i15 = size2;
                        i16 = i39;
                        int i66 = gVar.f2484N;
                        if (i66 == 0) {
                            int i67 = gVar.f2483M;
                            if (i67 <= 0) {
                                int i68 = 0;
                                i22 = 0;
                                for (int i69 = 0; i69 < i11; i69++) {
                                    if (i69 > 0) {
                                        i68 += gVar.f2478H;
                                    }
                                    d dVar7 = dVarArr[i69];
                                    if (dVar7 != null) {
                                        int maroon2 = gVar.maroon(dVar7, i33) + i68;
                                        if (maroon2 > i33) {
                                            break;
                                        }
                                        i22++;
                                        i68 = maroon2;
                                    }
                                }
                            } else {
                                i22 = i67;
                            }
                            i21 = 0;
                        } else {
                            i21 = gVar.f2483M;
                            if (i21 <= 0) {
                                int i70 = 0;
                                int i71 = 0;
                                for (int i72 = 0; i72 < i11; i72++) {
                                    if (i72 > 0) {
                                        i70 += gVar.f2479I;
                                    }
                                    d dVar8 = dVarArr[i72];
                                    if (dVar8 != null) {
                                        int magenta2 = gVar.magenta(dVar8, i33) + i70;
                                        if (magenta2 > i33) {
                                            break;
                                        }
                                        i71++;
                                        i70 = magenta2;
                                    }
                                }
                                i21 = i71;
                            }
                            i22 = 0;
                        }
                        if (gVar.f2487R == null) {
                            gVar.f2487R = new int[2];
                        }
                        if ((i21 == 0 && i66 == 1) || (i22 == 0 && i66 == 0)) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        while (!z13) {
                            if (i66 == 0) {
                                i21 = (int) Math.ceil(i11 / i22);
                            } else {
                                i22 = (int) Math.ceil(i11 / i21);
                            }
                            d[] dVarArr5 = gVar.Q;
                            if (dVarArr5 == null || dVarArr5.length < i22) {
                                obj = null;
                                gVar.Q = new d[i22];
                            } else {
                                obj = null;
                                Arrays.fill(dVarArr5, (Object) null);
                            }
                            d[] dVarArr6 = gVar.f2486P;
                            if (dVarArr6 != null && dVarArr6.length >= i21) {
                                Arrays.fill(dVarArr6, obj);
                            } else {
                                gVar.f2486P = new d[i21];
                            }
                            for (int i73 = 0; i73 < i22; i73++) {
                                for (int i74 = 0; i74 < i21; i74++) {
                                    int i75 = (i74 * i22) + i73;
                                    if (i66 == 1) {
                                        i75 = (i73 * i21) + i74;
                                    }
                                    if (i75 < dVarArr.length && (dVar = dVarArr[i75]) != null) {
                                        int maroon3 = gVar.maroon(dVar, i33);
                                        d dVar9 = gVar.Q[i73];
                                        if (dVar9 == null || dVar9.quebec() < maroon3) {
                                            gVar.Q[i73] = dVar;
                                        }
                                        int magenta3 = gVar.magenta(dVar, i33);
                                        d dVar10 = gVar.f2486P[i74];
                                        if (dVar10 == null || dVar10.kilo() < magenta3) {
                                            gVar.f2486P[i74] = dVar;
                                        }
                                    }
                                }
                            }
                            int i76 = 0;
                            for (int i77 = 0; i77 < i22; i77++) {
                                d dVar11 = gVar.Q[i77];
                                if (dVar11 != null) {
                                    if (i77 > 0) {
                                        i76 += gVar.f2478H;
                                    }
                                    i76 = gVar.maroon(dVar11, i33) + i76;
                                }
                            }
                            int i78 = 0;
                            for (int i79 = 0; i79 < i21; i79++) {
                                d dVar12 = gVar.f2486P[i79];
                                if (dVar12 != null) {
                                    if (i79 > 0) {
                                        i78 += gVar.f2479I;
                                    }
                                    i78 = gVar.magenta(dVar12, i33) + i78;
                                }
                            }
                            iArr[0] = i76;
                            iArr[1] = i78;
                            if (i66 == 0) {
                                if (i76 > i33 && i22 > 1) {
                                    i22--;
                                }
                                z13 = true;
                            } else {
                                if (i78 > i33 && i21 > 1) {
                                    i21--;
                                }
                                z13 = true;
                            }
                        }
                        int[] iArr4 = gVar.f2487R;
                        iArr4[0] = i22;
                        iArr4[1] = i21;
                    }
                } else {
                    i12 = i30;
                    i13 = i31;
                    i14 = i32;
                    iArr = iArr2;
                    i15 = size2;
                    i16 = i39;
                    int i80 = gVar.f2484N;
                    if (i11 != 0) {
                        arrayList.clear();
                        f fVar5 = new f(gVar, i80, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                        arrayList.add(fVar5);
                        if (i80 == 0) {
                            int i81 = 0;
                            i18 = 0;
                            int i82 = 0;
                            while (i81 < i11) {
                                d dVar13 = dVarArr[i81];
                                int maroon4 = gVar.maroon(dVar13, i33);
                                if (dVar13.f2454h[0] == 3) {
                                    i18++;
                                }
                                int i83 = i18;
                                if ((i82 == i33 || gVar.f2478H + i82 + maroon4 > i33) && fVar5.bravo != null) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (!z12 && i81 > 0 && (i20 = gVar.f2483M) > 0 && i81 % i20 == 0) {
                                    z12 = true;
                                }
                                if (z12) {
                                    fVar5 = new f(gVar, i80, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                                    fVar5.november = i81;
                                    arrayList.add(fVar5);
                                } else if (i81 > 0) {
                                    i82 = gVar.f2478H + maroon4 + i82;
                                    fVar5.alpha(dVar13);
                                    i81++;
                                    i18 = i83;
                                }
                                i82 = maroon4;
                                fVar5.alpha(dVar13);
                                i81++;
                                i18 = i83;
                            }
                        } else {
                            int i84 = 0;
                            i18 = 0;
                            int i85 = 0;
                            while (i84 < i11) {
                                d dVar14 = dVarArr[i84];
                                int magenta4 = gVar.magenta(dVar14, i33);
                                if (dVar14.f2454h[1] == 3) {
                                    i18++;
                                }
                                int i86 = i18;
                                if ((i85 == i33 || gVar.f2479I + i85 + magenta4 > i33) && fVar5.bravo != null) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (!z10 && i84 > 0 && (i19 = gVar.f2483M) > 0 && i84 % i19 == 0) {
                                    z10 = true;
                                }
                                if (z10) {
                                    fVar5 = new f(gVar, i80, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                                    fVar5.november = i84;
                                    arrayList.add(fVar5);
                                } else if (i84 > 0) {
                                    i85 = gVar.f2479I + magenta4 + i85;
                                    fVar5.alpha(dVar14);
                                    i84++;
                                    i18 = i86;
                                }
                                i85 = magenta4;
                                fVar5.alpha(dVar14);
                                i84++;
                                i18 = i86;
                            }
                        }
                        int size4 = arrayList.size();
                        int i87 = gVar.f2494o;
                        int i88 = gVar.f2490k;
                        int i89 = gVar.f2495p;
                        int i90 = gVar.f2491l;
                        if (iArr3[0] != 2 && iArr3[1] != 2) {
                            z11 = false;
                        } else {
                            z11 = true;
                        }
                        if (i18 > 0 && z11) {
                            for (int i91 = 0; i91 < size4; i91++) {
                                f fVar6 = (f) arrayList.get(i91);
                                if (i80 == 0) {
                                    fVar6.echo(i33 - fVar6.delta());
                                } else {
                                    fVar6.echo(i33 - fVar6.charlie());
                                }
                            }
                        }
                        int i92 = i87;
                        int i93 = i88;
                        int i94 = i89;
                        int i95 = i90;
                        c cVar11 = cVar2;
                        c cVar12 = cVar;
                        int i96 = 0;
                        int i97 = 0;
                        c cVar13 = cVar3;
                        c cVar14 = cVar4;
                        for (int i98 = 0; i98 < size4; i98++) {
                            f fVar7 = (f) arrayList.get(i98);
                            if (i80 == 0) {
                                if (i98 < size4 - 1) {
                                    cVar14 = ((f) arrayList.get(i98 + 1)).bravo.emerald;
                                    i95 = 0;
                                } else {
                                    i95 = gVar.f2491l;
                                    cVar14 = cVar4;
                                }
                                c cVar15 = fVar7.bravo.gold;
                                fVar7.foxtrot(i80, cVar11, cVar12, cVar13, cVar14, i92, i93, i94, i95, i33);
                                i96 = Math.max(i96, fVar7.delta());
                                int charlie2 = fVar7.charlie() + i97;
                                if (i98 > 0) {
                                    charlie2 += gVar.f2479I;
                                }
                                i97 = charlie2;
                                cVar12 = cVar15;
                                i93 = 0;
                            } else {
                                if (i98 < size4 - 1) {
                                    cVar13 = ((f) arrayList.get(i98 + 1)).bravo.cyan;
                                    i94 = 0;
                                } else {
                                    i94 = gVar.f2495p;
                                    cVar13 = cVar3;
                                }
                                c cVar16 = fVar7.bravo.fuchsia;
                                fVar7.foxtrot(i80, cVar11, cVar12, cVar13, cVar14, i92, i93, i94, i95, i33);
                                int delta2 = fVar7.delta() + i96;
                                int max2 = Math.max(i97, fVar7.charlie());
                                if (i98 > 0) {
                                    delta2 += gVar.f2478H;
                                }
                                i97 = max2;
                                i96 = delta2;
                                cVar11 = cVar16;
                                i92 = 0;
                            }
                        }
                        iArr[0] = i96;
                        iArr[1] = i97;
                    }
                }
            } else {
                i12 = i30;
                i13 = i31;
                i14 = i32;
                iArr = iArr2;
                i15 = size2;
                i16 = i39;
                int i99 = gVar.f2484N;
                if (i11 != 0) {
                    if (arrayList.size() == 0) {
                        fVar = new f(gVar, i99, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, i33);
                        arrayList.add(fVar);
                    } else {
                        fVar = (f) arrayList.get(0);
                        fVar.charlie = 0;
                        fVar.bravo = null;
                        fVar.lima = 0;
                        fVar.mike = 0;
                        fVar.november = 0;
                        fVar.oscar = 0;
                        fVar.papa = 0;
                        fVar.foxtrot(i99, gVar.cyan, gVar.emerald, gVar.fuchsia, gVar.gold, gVar.f2494o, gVar.f2490k, gVar.f2495p, gVar.f2491l, i33);
                    }
                    for (int i100 = 0; i100 < i11; i100++) {
                        fVar.alpha(dVarArr[i100]);
                    }
                    c3 = 0;
                    iArr[0] = fVar.delta();
                    r28 = 1;
                    iArr[1] = fVar.charlie();
                    int i101 = iArr[c3] + i16 + i12;
                    int i102 = iArr[r28] + i13 + i14;
                    if (mode != 1073741824) {
                        if (mode == Integer.MIN_VALUE) {
                            size = Math.min(i101, size);
                        } else if (mode == 0) {
                            size = i101;
                        } else {
                            size = 0;
                        }
                    }
                    if (mode2 != 1073741824) {
                        i17 = i15;
                    } else if (mode2 == Integer.MIN_VALUE) {
                        i17 = Math.min(i102, i15);
                    } else if (mode2 == 0) {
                        i17 = i102;
                    } else {
                        i17 = 0;
                    }
                    gVar.f2497r = size;
                    gVar.f2498s = i17;
                    gVar.indigo(size);
                    gVar.gold(i17);
                    if (gVar.f2513j <= 0) {
                        z2 = r28;
                    } else {
                        z2 = false;
                    }
                    gVar.f2496q = z2;
                    setMeasuredDimension(gVar.f2497r, gVar.f2498s);
                    return;
                }
            }
            r28 = 1;
            int i1012 = iArr[c3] + i16 + i12;
            int i1022 = iArr[r28] + i13 + i14;
            if (mode != 1073741824) {
            }
            if (mode2 != 1073741824) {
            }
            gVar.f2497r = size;
            gVar.f2498s = i17;
            gVar.indigo(size);
            gVar.gold(i17);
            if (gVar.f2513j <= 0) {
            }
            gVar.f2496q = z2;
            setMeasuredDimension(gVar.f2497r, gVar.f2498s);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // c1.AbstractC0804c, android.view.View
    public final void onMeasure(int i4, int i5) {
        juliet(this.f3028c, i4, i5);
    }

    public void setFirstHorizontalBias(float f5) {
        this.f3028c.f2474D = f5;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i4) {
        this.f3028c.f2503x = i4;
        requestLayout();
    }

    public void setFirstVerticalBias(float f5) {
        this.f3028c.f2475E = f5;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i4) {
        this.f3028c.f2504y = i4;
        requestLayout();
    }

    public void setHorizontalAlign(int i4) {
        this.f3028c.f2480J = i4;
        requestLayout();
    }

    public void setHorizontalBias(float f5) {
        this.f3028c.B = f5;
        requestLayout();
    }

    public void setHorizontalGap(int i4) {
        this.f3028c.f2478H = i4;
        requestLayout();
    }

    public void setHorizontalStyle(int i4) {
        this.f3028c.f2501v = i4;
        requestLayout();
    }

    public void setLastHorizontalBias(float f5) {
        this.f3028c.f2476F = f5;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i4) {
        this.f3028c.f2505z = i4;
        requestLayout();
    }

    public void setLastVerticalBias(float f5) {
        this.f3028c.f2477G = f5;
        requestLayout();
    }

    public void setLastVerticalStyle(int i4) {
        this.f3028c.A = i4;
        requestLayout();
    }

    public void setMaxElementsWrap(int i4) {
        this.f3028c.f2483M = i4;
        requestLayout();
    }

    public void setOrientation(int i4) {
        this.f3028c.f2484N = i4;
        requestLayout();
    }

    public void setPadding(int i4) {
        g gVar = this.f3028c;
        gVar.f2490k = i4;
        gVar.f2491l = i4;
        gVar.f2492m = i4;
        gVar.f2493n = i4;
        requestLayout();
    }

    public void setPaddingBottom(int i4) {
        this.f3028c.f2491l = i4;
        requestLayout();
    }

    public void setPaddingLeft(int i4) {
        this.f3028c.f2494o = i4;
        requestLayout();
    }

    public void setPaddingRight(int i4) {
        this.f3028c.f2495p = i4;
        requestLayout();
    }

    public void setPaddingTop(int i4) {
        this.f3028c.f2490k = i4;
        requestLayout();
    }

    public void setVerticalAlign(int i4) {
        this.f3028c.f2481K = i4;
        requestLayout();
    }

    public void setVerticalBias(float f5) {
        this.f3028c.C = f5;
        requestLayout();
    }

    public void setVerticalGap(int i4) {
        this.f3028c.f2479I = i4;
        requestLayout();
    }

    public void setVerticalStyle(int i4) {
        this.f3028c.f2502w = i4;
        requestLayout();
    }

    public void setWrapMode(int i4) {
        this.f3028c.f2482L = i4;
        requestLayout();
    }
}
