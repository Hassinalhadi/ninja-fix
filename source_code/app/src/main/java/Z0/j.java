package Z0;

import java.util.ArrayList;

/* loaded from: classes3.dex */
public abstract class j {
    public static final boolean[] alpha = new boolean[3];

    /* JADX WARN: Code restructure failed: missing block: B:162:0x028e, code lost:
    
        if (r8.delta == r6) goto L190;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x010c, code lost:
    
        if (r4.delta == r8) goto L75;
     */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0695 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x06a1  */
    /* JADX WARN: Removed duplicated region for block: B:272:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x06b5  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x06bc  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x06cc  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x06d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x06ec A[ADDED_TO_REGION, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:289:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x06af  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0116 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void alpha(e eVar, W0.c cVar, ArrayList arrayList, int i4) {
        int i5;
        b[] bVarArr;
        int i10;
        int i11;
        float f5;
        boolean z2;
        boolean z10;
        boolean z11;
        float f10;
        boolean z12;
        d dVar;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        c[] cVarArr;
        int i12;
        b[] bVarArr2;
        d dVar2;
        boolean z17;
        W0.c cVar2;
        W0.f fVar;
        W0.f fVar2;
        c cVar3;
        W0.f fVar3;
        int i13;
        d dVar3;
        boolean z18;
        int i14;
        W0.f fVar4;
        c cVar4;
        W0.f fVar5;
        d dVar4;
        d dVar5;
        int i15;
        int i16;
        c cVar5;
        int i17;
        c[] cVarArr2;
        c cVar6;
        c cVar7;
        W0.f fVar6;
        c cVar8;
        W0.f fVar7;
        W0.f fVar8;
        W0.f fVar9;
        float f11;
        int size;
        float f12;
        ArrayList arrayList2;
        int i18;
        float f13;
        d dVar6;
        int i19;
        float f14;
        b[] bVarArr3;
        boolean z19;
        int i20;
        boolean z20;
        int i21;
        d dVar7;
        int i22;
        int i23;
        boolean z21;
        boolean z22;
        boolean z23;
        int i24;
        int i25;
        c cVar9;
        d dVar8;
        e eVar2 = eVar;
        W0.c cVar10 = cVar;
        ArrayList arrayList3 = arrayList;
        if (i4 == 0) {
            i5 = eVar2.f2465r;
            bVarArr = eVar2.f2468u;
            i10 = 0;
        } else {
            i5 = eVar2.f2466s;
            bVarArr = eVar2.f2467t;
            i10 = 2;
        }
        int i26 = i5;
        b[] bVarArr4 = bVarArr;
        int i27 = 0;
        while (i27 < i26) {
            b bVar = bVarArr4[i27];
            boolean z24 = bVar.quebec;
            d dVar9 = bVar.alpha;
            int i28 = 3;
            int i29 = 8;
            W0.f fVar10 = null;
            if (!z24) {
                int i30 = bVar.lima;
                int i31 = i30 * 2;
                d dVar10 = dVar9;
                d dVar11 = dVar10;
                boolean z25 = false;
                f5 = 0.0f;
                while (!z25) {
                    bVar.india++;
                    dVar10.e[i30] = null;
                    dVar10.f2451d[i30] = null;
                    int i32 = dVar10.white;
                    c[] cVarArr3 = dVar10.jade;
                    if (i32 != i29) {
                        dVar10.juliet(i30);
                        cVarArr3[i31].echo();
                        int i33 = i31 + 1;
                        cVarArr3[i33].echo();
                        cVarArr3[i31].echo();
                        cVarArr3[i33].echo();
                        if (bVar.bravo == null) {
                            bVar.bravo = dVar10;
                        }
                        bVar.delta = dVar10;
                        int i34 = dVar10.f2454h[i30];
                        if (i34 == i28) {
                            int i35 = dVar10.tango[i30];
                            if (i35 != 0 && i35 != i28 && i35 != 2) {
                                i24 = i27;
                                i25 = i30;
                            } else {
                                bVar.juliet++;
                                float f15 = dVar10.f2450c[i30];
                                if (f15 > 0.0f) {
                                    i24 = i27;
                                    bVar.kilo += f15;
                                } else {
                                    i24 = i27;
                                }
                                i25 = i30;
                                if (dVar10.white != 8 && i34 == 3 && (i35 == 0 || i35 == 3)) {
                                    if (f15 < 0.0f) {
                                        bVar.november = true;
                                    } else {
                                        bVar.oscar = true;
                                    }
                                    if (bVar.hotel == null) {
                                        bVar.hotel = new ArrayList();
                                    }
                                    bVar.hotel.add(dVar10);
                                }
                                if (bVar.foxtrot == null) {
                                    bVar.foxtrot = dVar10;
                                }
                                d dVar12 = bVar.golf;
                                if (dVar12 != null) {
                                    dVar12.f2451d[i25] = dVar10;
                                }
                                bVar.golf = dVar10;
                            }
                            if (i25 == 0) {
                                if (dVar10.romeo == 0 && dVar10.uniform == 0) {
                                    int i36 = dVar10.victor;
                                }
                            } else if (dVar10.sierra == 0 && dVar10.xray == 0) {
                                int i37 = dVar10.yankee;
                            }
                            if (dVar11 != dVar10) {
                                dVar11.e[i25] = dVar10;
                            }
                            cVar9 = cVarArr3[i31 + 1].foxtrot;
                            if (cVar9 != null) {
                                dVar8 = cVar9.delta;
                                c cVar11 = dVar8.jade[i31].foxtrot;
                                if (cVar11 != null) {
                                }
                            }
                            dVar8 = null;
                            if (dVar8 != null) {
                                dVar8 = dVar10;
                                z25 = true;
                            }
                            dVar11 = dVar10;
                            i30 = i25;
                            i28 = 3;
                            i29 = 8;
                            dVar10 = dVar8;
                            i27 = i24;
                        }
                    }
                    i24 = i27;
                    i25 = i30;
                    if (dVar11 != dVar10) {
                    }
                    cVar9 = cVarArr3[i31 + 1].foxtrot;
                    if (cVar9 != null) {
                    }
                    dVar8 = null;
                    if (dVar8 != null) {
                    }
                    dVar11 = dVar10;
                    i30 = i25;
                    i28 = 3;
                    i29 = 8;
                    dVar10 = dVar8;
                    i27 = i24;
                }
                i11 = i27;
                int i38 = i30;
                d dVar13 = bVar.bravo;
                if (dVar13 != null) {
                    dVar13.jade[i31].echo();
                }
                d dVar14 = bVar.delta;
                if (dVar14 != null) {
                    dVar14.jade[i31 + 1].echo();
                }
                bVar.charlie = dVar10;
                if (i38 == 0 && bVar.mike) {
                    bVar.echo = dVar10;
                } else {
                    bVar.echo = dVar9;
                }
                if (bVar.oscar && bVar.november) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                bVar.papa = z23;
            } else {
                i11 = i27;
                f5 = 0.0f;
            }
            bVar.quebec = true;
            if (arrayList3 != null && !arrayList3.contains(dVar9)) {
                i12 = i26;
                bVarArr2 = bVarArr4;
            } else {
                d dVar15 = bVar.charlie;
                d dVar16 = bVar.bravo;
                d dVar17 = bVar.delta;
                d dVar18 = bVar.echo;
                float f16 = bVar.kilo;
                if (eVar2.f2454h[i4] == 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (i4 == 0) {
                    int i39 = dVar18.f2448a;
                    if (i39 == 0) {
                        z21 = true;
                    } else {
                        z21 = false;
                    }
                    if (i39 == 1) {
                        z22 = true;
                    } else {
                        z22 = false;
                    }
                    if (i39 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z2;
                    z15 = z22;
                    z14 = z21;
                    z16 = false;
                    f10 = f16;
                    dVar = dVar9;
                } else {
                    int i40 = dVar18.f2449b;
                    if (i40 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (i40 == 1) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    f10 = f16;
                    if (i40 == 2) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    dVar = dVar9;
                    z13 = z2;
                    z14 = z10;
                    z15 = z11;
                    z16 = false;
                }
                while (true) {
                    cVarArr = eVar2.jade;
                    if (z16) {
                        break;
                    }
                    c cVar12 = dVar.jade[i10];
                    if (z12) {
                        i20 = 1;
                    } else {
                        i20 = 4;
                    }
                    int echo = cVar12.echo();
                    boolean z26 = z16;
                    int[] iArr = dVar.f2454h;
                    boolean z27 = z12;
                    if (iArr[i4] == 3 && dVar.tango[i4] == 0) {
                        z20 = true;
                    } else {
                        z20 = false;
                    }
                    c cVar13 = cVar12.foxtrot;
                    if (cVar13 != null && dVar != dVar9) {
                        echo = cVar13.echo() + echo;
                    }
                    int i41 = echo;
                    if (z27 && dVar != dVar9 && dVar != dVar16) {
                        i20 = 8;
                    }
                    boolean z28 = z20;
                    c cVar14 = cVar12.foxtrot;
                    if (cVar14 != null) {
                        if (dVar == dVar16) {
                            i21 = i26;
                            cVar10.foxtrot(cVar12.india, cVar14.india, i41, 6);
                        } else {
                            i21 = i26;
                            cVar10.foxtrot(cVar12.india, cVar14.india, i41, 8);
                        }
                        if (z28 && !z27) {
                            i20 = 5;
                        }
                        if (dVar == dVar16 && z27 && dVar.lime[i4]) {
                            i23 = 5;
                        } else {
                            i23 = i20;
                        }
                        cVar10.echo(cVar12.india, cVar12.foxtrot.india, i41, i23);
                    } else {
                        i21 = i26;
                    }
                    c[] cVarArr4 = dVar.jade;
                    if (z13) {
                        if (dVar.white != 8 && iArr[i4] == 3) {
                            i22 = 0;
                            cVar10.foxtrot(cVarArr4[i10 + 1].india, cVarArr4[i10].india, 0, 5);
                        } else {
                            i22 = 0;
                        }
                        cVar10.foxtrot(cVarArr4[i10].india, cVarArr[i10].india, i22, 8);
                    }
                    c cVar15 = cVarArr4[i10 + 1].foxtrot;
                    if (cVar15 != null) {
                        dVar7 = cVar15.delta;
                        c cVar16 = dVar7.jade[i10].foxtrot;
                        if (cVar16 != null) {
                        }
                    }
                    dVar7 = null;
                    if (dVar7 != null) {
                        dVar = dVar7;
                        z16 = z26;
                    } else {
                        z16 = true;
                    }
                    z12 = z27;
                    i26 = i21;
                }
                boolean z29 = z12;
                i12 = i26;
                if (dVar17 != null) {
                    int i42 = i10 + 1;
                    if (dVar15.jade[i42].foxtrot != null) {
                        c cVar17 = dVar17.jade[i42];
                        if (dVar17.f2454h[i4] == 3 && dVar17.tango[i4] == 0 && !z29) {
                            c cVar18 = cVar17.foxtrot;
                            if (cVar18.delta == eVar2) {
                                cVar10.echo(cVar17.india, cVar18.india, -cVar17.echo(), 5);
                                cVar10.golf(cVar17.india, dVar15.jade[i42].foxtrot.india, -cVar17.echo(), 6);
                            }
                        }
                        if (z29) {
                            c cVar19 = cVar17.foxtrot;
                            if (cVar19.delta == eVar2) {
                                cVar10.echo(cVar17.india, cVar19.india, -cVar17.echo(), 4);
                            }
                        }
                        cVar10.golf(cVar17.india, dVar15.jade[i42].foxtrot.india, -cVar17.echo(), 6);
                    }
                }
                if (z13) {
                    int i43 = i10 + 1;
                    W0.f fVar11 = cVarArr[i43].india;
                    c cVar20 = dVar15.jade[i43];
                    cVar10.foxtrot(fVar11, cVar20.india, cVar20.echo(), 8);
                }
                ArrayList arrayList4 = bVar.hotel;
                if (arrayList4 != null && (size = arrayList4.size()) > 1) {
                    if (bVar.november && !bVar.papa) {
                        f10 = bVar.juliet;
                    }
                    d dVar19 = null;
                    float f17 = f5;
                    int i44 = 0;
                    while (i44 < size) {
                        d dVar20 = (d) arrayList4.get(i44);
                        float f18 = dVar20.f2450c[i4];
                        c[] cVarArr5 = dVar20.jade;
                        if (f18 < f5) {
                            if (bVar.papa) {
                                arrayList2 = arrayList4;
                                i18 = size;
                                cVar10.echo(cVarArr5[i10 + 1].india, cVarArr5[i10].india, 0, 4);
                                z19 = false;
                                i19 = i44;
                                f14 = f5;
                                bVarArr3 = bVarArr4;
                                i44 = i19 + 1;
                                bVarArr4 = bVarArr3;
                                arrayList4 = arrayList2;
                                size = i18;
                                f5 = f14;
                            } else {
                                f12 = 1.0f;
                            }
                        } else {
                            f12 = f18;
                        }
                        arrayList2 = arrayList4;
                        i18 = size;
                        if (f12 == f5) {
                            z19 = false;
                            cVar10.echo(cVarArr5[i10 + 1].india, cVarArr5[i10].india, 0, 8);
                            i19 = i44;
                            f14 = f5;
                            bVarArr3 = bVarArr4;
                            i44 = i19 + 1;
                            bVarArr4 = bVarArr3;
                            arrayList4 = arrayList2;
                            size = i18;
                            f5 = f14;
                        } else {
                            if (dVar19 != null) {
                                c[] cVarArr6 = dVar19.jade;
                                W0.f fVar12 = cVarArr6[i10].india;
                                int i45 = i10 + 1;
                                W0.f fVar13 = cVarArr6[i45].india;
                                f13 = f12;
                                W0.f fVar14 = cVarArr5[i10].india;
                                W0.f fVar15 = cVarArr5[i45].india;
                                dVar6 = dVar20;
                                W0.b lima = cVar10.lima();
                                i19 = i44;
                                float f19 = f5;
                                lima.bravo = f19;
                                f14 = f19;
                                if (f10 == f19 || f17 == f13) {
                                    bVarArr3 = bVarArr4;
                                    lima.delta.golf(fVar12, 1.0f);
                                    lima.delta.golf(fVar13, -1.0f);
                                    lima.delta.golf(fVar15, 1.0f);
                                    lima.delta.golf(fVar14, -1.0f);
                                } else {
                                    if (f17 == f14) {
                                        lima.delta.golf(fVar12, 1.0f);
                                        lima.delta.golf(fVar13, -1.0f);
                                    } else if (f12 == f5) {
                                        lima.delta.golf(fVar14, 1.0f);
                                        lima.delta.golf(fVar15, -1.0f);
                                    } else {
                                        float f20 = (f17 / f10) / (f13 / f10);
                                        bVarArr3 = bVarArr4;
                                        lima.delta.golf(fVar12, 1.0f);
                                        lima.delta.golf(fVar13, -1.0f);
                                        lima.delta.golf(fVar15, f20);
                                        lima.delta.golf(fVar14, -f20);
                                    }
                                    bVarArr3 = bVarArr4;
                                }
                                cVar10.charlie(lima);
                            } else {
                                f13 = f12;
                                dVar6 = dVar20;
                                i19 = i44;
                                f14 = f5;
                                bVarArr3 = bVarArr4;
                            }
                            dVar19 = dVar6;
                            f17 = f13;
                            i44 = i19 + 1;
                            bVarArr4 = bVarArr3;
                            arrayList4 = arrayList2;
                            size = i18;
                            f5 = f14;
                        }
                    }
                }
                bVarArr2 = bVarArr4;
                if (dVar16 == null || (dVar16 != dVar17 && !z29)) {
                    dVar2 = dVar17;
                    if (z14 && dVar16 != null) {
                        int i46 = bVar.juliet;
                        if (i46 > 0 && bVar.india == i46) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        d dVar21 = dVar16;
                        d dVar22 = dVar21;
                        while (dVar21 != null) {
                            d dVar23 = dVar21.e[i4];
                            while (true) {
                                if (dVar23 != null) {
                                    i14 = 8;
                                    if (dVar23.white != 8) {
                                        break;
                                    } else {
                                        dVar23 = dVar23.e[i4];
                                    }
                                } else {
                                    i14 = 8;
                                    break;
                                }
                            }
                            if (dVar23 == null && dVar21 != dVar2) {
                                dVar4 = dVar9;
                                dVar5 = dVar22;
                                i15 = i14;
                            } else {
                                c[] cVarArr7 = dVar21.jade;
                                c cVar21 = cVarArr7[i10];
                                W0.f fVar16 = cVar21.india;
                                c cVar22 = cVar21.foxtrot;
                                if (cVar22 != null) {
                                    fVar4 = cVar22.india;
                                } else {
                                    fVar4 = null;
                                }
                                if (dVar22 != dVar21) {
                                    fVar4 = dVar22.jade[i10 + 1].india;
                                } else if (dVar21 == dVar16) {
                                    c cVar23 = dVar9.jade[i10].foxtrot;
                                    if (cVar23 != null) {
                                        fVar4 = cVar23.india;
                                    } else {
                                        fVar4 = null;
                                    }
                                }
                                int echo2 = cVar21.echo();
                                int i47 = i10 + 1;
                                int echo3 = cVarArr7[i47].echo();
                                if (dVar23 != null) {
                                    cVar4 = dVar23.jade[i10];
                                    fVar5 = cVar4.india;
                                } else {
                                    cVar4 = dVar15.jade[i47].foxtrot;
                                    if (cVar4 != null) {
                                        fVar5 = cVar4.india;
                                    } else {
                                        fVar5 = null;
                                    }
                                }
                                W0.f fVar17 = cVarArr7[i47].india;
                                if (cVar4 != null) {
                                    echo3 += cVar4.echo();
                                }
                                int echo4 = dVar22.jade[i47].echo() + echo2;
                                if (fVar16 != null && fVar4 != null && fVar5 != null && fVar17 != null) {
                                    if (dVar21 == dVar16) {
                                        echo4 = dVar16.jade[i10].echo();
                                    }
                                    if (dVar21 == dVar2) {
                                        echo3 = dVar2.jade[i47].echo();
                                    }
                                    W0.f fVar18 = fVar4;
                                    W0.f fVar19 = fVar5;
                                    int i48 = echo4;
                                    if (z18) {
                                        i16 = 8;
                                    } else {
                                        i16 = 5;
                                    }
                                    dVar4 = dVar9;
                                    dVar5 = dVar22;
                                    i15 = 8;
                                    cVar.bravo(fVar16, fVar18, i48, 0.5f, fVar19, fVar17, echo3, i16);
                                } else {
                                    dVar4 = dVar9;
                                    dVar5 = dVar22;
                                    i15 = 8;
                                }
                            }
                            if (dVar21.white != i15) {
                                dVar5 = dVar21;
                            }
                            dVar21 = dVar23;
                            dVar22 = dVar5;
                            dVar9 = dVar4;
                        }
                    } else if (z15 && dVar16 != null) {
                        int i49 = bVar.juliet;
                        if (i49 > 0 && bVar.india == i49) {
                            z17 = true;
                        } else {
                            z17 = false;
                        }
                        d dVar24 = dVar16;
                        d dVar25 = dVar24;
                        while (dVar24 != null) {
                            d dVar26 = dVar24.e[i4];
                            while (dVar26 != null && dVar26.white == 8) {
                                dVar26 = dVar26.e[i4];
                            }
                            if (dVar24 != dVar16 && dVar24 != dVar2 && dVar26 != null) {
                                if (dVar26 == dVar2) {
                                    dVar26 = null;
                                }
                                c[] cVarArr8 = dVar24.jade;
                                c cVar24 = cVarArr8[i10];
                                W0.f fVar20 = cVar24.india;
                                int i50 = i10 + 1;
                                W0.f fVar21 = dVar25.jade[i50].india;
                                int echo5 = cVar24.echo();
                                int echo6 = cVarArr8[i50].echo();
                                if (dVar26 != null) {
                                    cVar3 = dVar26.jade[i10];
                                    fVar3 = cVar3.india;
                                    c cVar25 = cVar3.foxtrot;
                                    if (cVar25 != null) {
                                        fVar2 = cVar25.india;
                                    } else {
                                        fVar2 = null;
                                    }
                                } else {
                                    c cVar26 = dVar2.jade[i10];
                                    if (cVar26 != null) {
                                        fVar = cVar26.india;
                                    } else {
                                        fVar = null;
                                    }
                                    W0.f fVar22 = fVar;
                                    fVar2 = cVarArr8[i50].india;
                                    cVar3 = cVar26;
                                    fVar3 = fVar22;
                                }
                                if (cVar3 != null) {
                                    echo6 += cVar3.echo();
                                }
                                int echo7 = dVar25.jade[i50].echo() + echo5;
                                W0.f fVar23 = fVar3;
                                int i51 = echo6;
                                W0.f fVar24 = fVar2;
                                if (z17) {
                                    i13 = 8;
                                } else {
                                    i13 = 4;
                                }
                                if (fVar20 != null && fVar21 != null && fVar23 != null && fVar24 != null) {
                                    dVar3 = dVar26;
                                    cVar.bravo(fVar20, fVar21, echo7, 0.5f, fVar23, fVar24, i51, i13);
                                } else {
                                    dVar3 = dVar26;
                                }
                                dVar26 = dVar3;
                            }
                            if (dVar24.white != 8) {
                                dVar25 = dVar24;
                            }
                            dVar24 = dVar26;
                        }
                        c cVar27 = dVar16.jade[i10];
                        c cVar28 = dVar9.jade[i10].foxtrot;
                        int i52 = i10 + 1;
                        c cVar29 = dVar2.jade[i52];
                        c cVar30 = dVar15.jade[i52].foxtrot;
                        if (cVar28 != null) {
                            if (dVar16 != dVar2) {
                                cVar.echo(cVar27.india, cVar28.india, cVar27.echo(), 5);
                            } else if (cVar30 != null) {
                                cVar2 = cVar;
                                cVar2.bravo(cVar27.india, cVar28.india, cVar27.echo(), 0.5f, cVar29.india, cVar30.india, cVar29.echo(), 5);
                                if (cVar30 != null && dVar16 != dVar2) {
                                    cVar2.echo(cVar29.india, cVar30.india, -cVar29.echo(), 5);
                                }
                                if ((!z14 || z15) && dVar16 != null && dVar16 != dVar2) {
                                    c[] cVarArr9 = dVar16.jade;
                                    cVar5 = cVarArr9[i10];
                                    if (dVar2 == null) {
                                        dVar2 = dVar16;
                                    }
                                    i17 = i10 + 1;
                                    cVarArr2 = dVar2.jade;
                                    cVar6 = cVarArr2[i17];
                                    cVar7 = cVar5.foxtrot;
                                    if (cVar7 != null) {
                                        fVar6 = cVar7.india;
                                    } else {
                                        fVar6 = null;
                                    }
                                    cVar8 = cVar6.foxtrot;
                                    if (cVar8 != null) {
                                        fVar7 = cVar8.india;
                                    } else {
                                        fVar7 = null;
                                    }
                                    if (dVar15 != dVar2) {
                                        c cVar31 = dVar15.jade[i17].foxtrot;
                                        if (cVar31 != null) {
                                            fVar10 = cVar31.india;
                                        }
                                        fVar7 = fVar10;
                                    }
                                    if (dVar16 == dVar2) {
                                        cVar6 = cVarArr9[i17];
                                    }
                                    if (fVar6 == null && fVar7 != null) {
                                        cVar2.bravo(cVar5.india, fVar6, cVar5.echo(), 0.5f, fVar7, cVar6.india, cVarArr2[i17].echo(), 5);
                                    }
                                }
                            }
                        }
                        cVar2 = cVar;
                        if (cVar30 != null) {
                            cVar2.echo(cVar29.india, cVar30.india, -cVar29.echo(), 5);
                        }
                        if (!z14) {
                        }
                        c[] cVarArr92 = dVar16.jade;
                        cVar5 = cVarArr92[i10];
                        if (dVar2 == null) {
                        }
                        i17 = i10 + 1;
                        cVarArr2 = dVar2.jade;
                        cVar6 = cVarArr2[i17];
                        cVar7 = cVar5.foxtrot;
                        if (cVar7 != null) {
                        }
                        cVar8 = cVar6.foxtrot;
                        if (cVar8 != null) {
                        }
                        if (dVar15 != dVar2) {
                        }
                        if (dVar16 == dVar2) {
                        }
                        if (fVar6 == null) {
                            cVar2.bravo(cVar5.india, fVar6, cVar5.echo(), 0.5f, fVar7, cVar6.india, cVarArr2[i17].echo(), 5);
                        }
                    }
                } else {
                    c cVar32 = dVar9.jade[i10];
                    int i53 = i10 + 1;
                    c cVar33 = dVar15.jade[i53];
                    c cVar34 = cVar32.foxtrot;
                    if (cVar34 != null) {
                        fVar8 = cVar34.india;
                    } else {
                        fVar8 = null;
                    }
                    c cVar35 = cVar33.foxtrot;
                    if (cVar35 != null) {
                        fVar9 = cVar35.india;
                    } else {
                        fVar9 = null;
                    }
                    c cVar36 = dVar16.jade[i10];
                    if (dVar17 != null) {
                        cVar33 = dVar17.jade[i53];
                    }
                    if (fVar8 != null && fVar9 != null) {
                        if (i4 == 0) {
                            f11 = dVar18.red;
                        } else {
                            f11 = dVar18.silver;
                        }
                        float f21 = f11;
                        int echo8 = cVar36.echo();
                        int echo9 = cVar33.echo();
                        W0.f fVar25 = cVar36.india;
                        W0.f fVar26 = cVar33.india;
                        W0.f fVar27 = fVar8;
                        dVar2 = dVar17;
                        cVar10.bravo(fVar25, fVar27, echo8, f21, fVar9, fVar26, echo9, 7);
                    } else {
                        dVar2 = dVar17;
                    }
                }
                cVar2 = cVar;
                if (!z14) {
                }
                c[] cVarArr922 = dVar16.jade;
                cVar5 = cVarArr922[i10];
                if (dVar2 == null) {
                }
                i17 = i10 + 1;
                cVarArr2 = dVar2.jade;
                cVar6 = cVarArr2[i17];
                cVar7 = cVar5.foxtrot;
                if (cVar7 != null) {
                }
                cVar8 = cVar6.foxtrot;
                if (cVar8 != null) {
                }
                if (dVar15 != dVar2) {
                }
                if (dVar16 == dVar2) {
                }
                if (fVar6 == null) {
                }
            }
            i27 = i11 + 1;
            eVar2 = eVar;
            cVar10 = cVar;
            arrayList3 = arrayList;
            bVarArr4 = bVarArr2;
            i26 = i12;
        }
    }

    public static void bravo(e eVar, W0.c cVar, d dVar) {
        dVar.oscar = -1;
        dVar.papa = -1;
        int i4 = eVar.f2454h[0];
        int[] iArr = dVar.f2454h;
        if (i4 != 2 && iArr[0] == 4) {
            c cVar2 = dVar.cyan;
            int i5 = cVar2.golf;
            int quebec = eVar.quebec();
            c cVar3 = dVar.fuchsia;
            int i10 = quebec - cVar3.golf;
            cVar2.india = cVar.kilo(cVar2);
            cVar3.india = cVar.kilo(cVar3);
            cVar.delta(cVar2.india, i5);
            cVar.delta(cVar3.india, i10);
            dVar.oscar = 2;
            dVar.orange = i5;
            int i11 = i10 - i5;
            dVar.maroon = i11;
            int i12 = dVar.plum;
            if (i11 < i12) {
                dVar.maroon = i12;
            }
        }
        if (eVar.f2454h[1] != 2 && iArr[1] == 4) {
            c cVar4 = dVar.emerald;
            int i13 = cVar4.golf;
            int kilo = eVar.kilo();
            c cVar5 = dVar.gold;
            int i14 = kilo - cVar5.golf;
            cVar4.india = cVar.kilo(cVar4);
            cVar5.india = cVar.kilo(cVar5);
            cVar.delta(cVar4.india, i13);
            cVar.delta(cVar5.india, i14);
            if (dVar.pink > 0 || dVar.white == 8) {
                c cVar6 = dVar.gray;
                W0.f kilo2 = cVar.kilo(cVar6);
                cVar6.india = kilo2;
                cVar.delta(kilo2, dVar.pink + i13);
            }
            dVar.papa = 2;
            dVar.peach = i13;
            int i15 = i14 - i13;
            dVar.navy = i15;
            int i16 = dVar.purple;
            if (i15 < i16) {
                dVar.navy = i16;
            }
        }
    }

    public static final boolean charlie(int i4, int i5) {
        if ((i4 & i5) == i5) {
            return true;
        }
        return false;
    }
}
