package Z0;

/* loaded from: classes3.dex */
public final class f {
    public int alpha;
    public c delta;
    public c echo;
    public c foxtrot;
    public c golf;
    public int hotel;
    public int india;
    public int juliet;
    public int kilo;
    public int quebec;
    public final /* synthetic */ g romeo;
    public d bravo = null;
    public int charlie = 0;
    public int lima = 0;
    public int mike = 0;
    public int november = 0;
    public int oscar = 0;
    public int papa = 0;

    public f(g gVar, int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5) {
        this.romeo = gVar;
        this.alpha = i4;
        this.delta = cVar;
        this.echo = cVar2;
        this.foxtrot = cVar3;
        this.golf = cVar4;
        this.hotel = gVar.f2494o;
        this.india = gVar.f2490k;
        this.juliet = gVar.f2495p;
        this.kilo = gVar.f2491l;
        this.quebec = i5;
    }

    public final void alpha(d dVar) {
        int i4 = this.alpha;
        g gVar = this.romeo;
        int i5 = 0;
        if (i4 == 0) {
            int maroon = gVar.maroon(dVar, this.quebec);
            if (dVar.f2454h[0] == 3) {
                this.papa++;
                maroon = 0;
            }
            int i10 = gVar.f2478H;
            if (dVar.white != 8) {
                i5 = i10;
            }
            this.lima = maroon + i5 + this.lima;
            int magenta = gVar.magenta(dVar, this.quebec);
            if (this.bravo == null || this.charlie < magenta) {
                this.bravo = dVar;
                this.charlie = magenta;
                this.mike = magenta;
            }
        } else {
            int maroon2 = gVar.maroon(dVar, this.quebec);
            int magenta2 = gVar.magenta(dVar, this.quebec);
            if (dVar.f2454h[1] == 3) {
                this.papa++;
                magenta2 = 0;
            }
            int i11 = gVar.f2479I;
            if (dVar.white != 8) {
                i5 = i11;
            }
            this.mike = magenta2 + i5 + this.mike;
            if (this.bravo == null || this.charlie < maroon2) {
                this.bravo = dVar;
                this.charlie = maroon2;
                this.lima = maroon2;
            }
        }
        this.oscar++;
    }

    public final void bravo(int i4, boolean z2, boolean z10) {
        g gVar;
        boolean z11;
        int i5;
        int i10;
        d dVar;
        int i11;
        boolean z12;
        char c3;
        float f5;
        float f10;
        int i12;
        float f11;
        float f12;
        int i13;
        int i14;
        int i15;
        int i16 = this.oscar;
        int i17 = 0;
        while (true) {
            gVar = this.romeo;
            if (i17 >= i16 || (i15 = this.november + i17) >= gVar.f2489T) {
                break;
            }
            d dVar2 = gVar.f2488S[i15];
            if (dVar2 != null) {
                dVar2.black();
            }
            i17++;
        }
        if (i16 != 0 && this.bravo != null) {
            if (z10 && i4 == 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            int i18 = -1;
            int i19 = -1;
            for (int i20 = 0; i20 < i16; i20++) {
                if (z2) {
                    i14 = (i16 - 1) - i20;
                } else {
                    i14 = i20;
                }
                int i21 = this.november + i14;
                if (i21 >= gVar.f2489T) {
                    break;
                }
                d dVar3 = gVar.f2488S[i21];
                if (dVar3 != null && dVar3.white == 0) {
                    if (i18 == -1) {
                        i18 = i20;
                    }
                    i19 = i20;
                }
            }
            if (this.alpha == 0) {
                d dVar4 = this.bravo;
                dVar4.f2449b = gVar.f2502w;
                int i22 = this.india;
                if (i4 > 0) {
                    i22 += gVar.f2479I;
                }
                c cVar = this.echo;
                c cVar2 = dVar4.emerald;
                cVar2.alpha(cVar, i22);
                c cVar3 = dVar4.gold;
                if (z10) {
                    cVar3.alpha(this.golf, this.kilo);
                }
                if (i4 > 0) {
                    this.echo.delta.gold.alpha(cVar2, 0);
                }
                if (gVar.f2481K == 3 && !dVar4.blue) {
                    for (int i23 = 0; i23 < i16; i23++) {
                        if (z2) {
                            i13 = (i16 - 1) - i23;
                        } else {
                            i13 = i23;
                        }
                        int i24 = this.november + i13;
                        if (i24 >= gVar.f2489T) {
                            break;
                        }
                        dVar = gVar.f2488S[i24];
                        if (dVar.blue) {
                            break;
                        }
                    }
                }
                dVar = dVar4;
                int i25 = 0;
                d dVar5 = null;
                while (i25 < i16) {
                    if (z2) {
                        i11 = (i16 - 1) - i25;
                    } else {
                        i11 = i25;
                    }
                    int i26 = this.november + i11;
                    if (i26 < gVar.f2489T) {
                        d dVar6 = gVar.f2488S[i26];
                        if (dVar6 == null) {
                            z12 = z11;
                            c3 = 3;
                        } else {
                            c cVar4 = dVar6.cyan;
                            if (i25 == 0) {
                                dVar6.foxtrot(cVar4, this.delta, this.hotel);
                            }
                            if (i11 == 0) {
                                int i27 = gVar.f2501v;
                                if (z2) {
                                    f5 = 1.0f;
                                    f10 = 1.0f - gVar.B;
                                } else {
                                    f5 = 1.0f;
                                    f10 = gVar.B;
                                }
                                if (this.november == 0) {
                                    i12 = gVar.f2503x;
                                    z12 = z11;
                                    if (i12 != -1) {
                                        if (z2) {
                                            f12 = gVar.f2474D;
                                            f10 = f5 - f12;
                                            dVar6.f2448a = i12;
                                            dVar6.red = f10;
                                        } else {
                                            f11 = gVar.f2474D;
                                            f10 = f11;
                                            dVar6.f2448a = i12;
                                            dVar6.red = f10;
                                        }
                                    }
                                } else {
                                    z12 = z11;
                                }
                                if (z10 && (i12 = gVar.f2505z) != -1) {
                                    if (z2) {
                                        f12 = gVar.f2476F;
                                        f10 = f5 - f12;
                                        dVar6.f2448a = i12;
                                        dVar6.red = f10;
                                    } else {
                                        f11 = gVar.f2476F;
                                        f10 = f11;
                                        dVar6.f2448a = i12;
                                        dVar6.red = f10;
                                    }
                                } else {
                                    i12 = i27;
                                    dVar6.f2448a = i12;
                                    dVar6.red = f10;
                                }
                            } else {
                                z12 = z11;
                            }
                            if (i25 == i16 - 1) {
                                dVar6.foxtrot(dVar6.fuchsia, this.foxtrot, this.juliet);
                            }
                            if (dVar5 != null) {
                                int i28 = gVar.f2478H;
                                c cVar5 = dVar5.fuchsia;
                                cVar4.alpha(cVar5, i28);
                                if (i25 == i18) {
                                    int i29 = this.hotel;
                                    if (cVar4.hotel()) {
                                        cVar4.hotel = i29;
                                    }
                                }
                                cVar5.alpha(cVar4, 0);
                                if (i25 == i19 + 1) {
                                    int i30 = this.juliet;
                                    if (cVar5.hotel()) {
                                        cVar5.hotel = i30;
                                    }
                                }
                            }
                            if (dVar6 != dVar4) {
                                int i31 = gVar.f2481K;
                                c3 = 3;
                                if (i31 == 3 && dVar.blue && dVar6 != dVar && dVar6.blue) {
                                    dVar6.gray.alpha(dVar.gray, 0);
                                } else {
                                    c cVar6 = dVar6.emerald;
                                    if (i31 != 0) {
                                        c cVar7 = dVar6.gold;
                                        if (i31 != 1) {
                                            if (z12) {
                                                cVar6.alpha(this.echo, this.india);
                                                cVar7.alpha(this.golf, this.kilo);
                                            } else {
                                                cVar6.alpha(cVar2, 0);
                                                cVar7.alpha(cVar3, 0);
                                            }
                                        } else {
                                            cVar7.alpha(cVar3, 0);
                                        }
                                    } else {
                                        cVar6.alpha(cVar2, 0);
                                    }
                                }
                            } else {
                                c3 = 3;
                            }
                            dVar5 = dVar6;
                        }
                        i25++;
                        z11 = z12;
                    } else {
                        return;
                    }
                }
                return;
            }
            boolean z13 = z11;
            d dVar7 = this.bravo;
            dVar7.f2448a = gVar.f2501v;
            int i32 = this.hotel;
            if (i4 > 0) {
                i32 += gVar.f2478H;
            }
            c cVar8 = dVar7.cyan;
            c cVar9 = dVar7.fuchsia;
            if (z2) {
                cVar9.alpha(this.foxtrot, i32);
                if (z10) {
                    cVar8.alpha(this.delta, this.juliet);
                }
                if (i4 > 0) {
                    this.foxtrot.delta.cyan.alpha(cVar9, 0);
                }
            } else {
                cVar8.alpha(this.delta, i32);
                if (z10) {
                    cVar9.alpha(this.foxtrot, this.juliet);
                }
                if (i4 > 0) {
                    this.delta.delta.fuchsia.alpha(cVar8, 0);
                }
            }
            d dVar8 = null;
            for (int i33 = 0; i33 < i16; i33++) {
                int i34 = this.november + i33;
                if (i34 < gVar.f2489T) {
                    d dVar9 = gVar.f2488S[i34];
                    if (dVar9 != null) {
                        c cVar10 = dVar9.emerald;
                        if (i33 == 0) {
                            dVar9.foxtrot(cVar10, this.echo, this.india);
                            int i35 = gVar.f2502w;
                            float f13 = gVar.C;
                            if (this.november == 0) {
                                i10 = gVar.f2504y;
                                i5 = -1;
                                if (i10 != -1) {
                                    f13 = gVar.f2475E;
                                    i35 = i10;
                                    dVar9.f2449b = i35;
                                    dVar9.silver = f13;
                                }
                            } else {
                                i5 = -1;
                            }
                            if (z10 && (i10 = gVar.A) != i5) {
                                f13 = gVar.f2477G;
                                i35 = i10;
                            }
                            dVar9.f2449b = i35;
                            dVar9.silver = f13;
                        }
                        if (i33 == i16 - 1) {
                            dVar9.foxtrot(dVar9.gold, this.golf, this.kilo);
                        }
                        if (dVar8 != null) {
                            int i36 = gVar.f2479I;
                            c cVar11 = dVar8.gold;
                            cVar10.alpha(cVar11, i36);
                            if (i33 == i18) {
                                int i37 = this.india;
                                if (cVar10.hotel()) {
                                    cVar10.hotel = i37;
                                }
                            }
                            cVar11.alpha(cVar10, 0);
                            if (i33 == i19 + 1) {
                                int i38 = this.kilo;
                                if (cVar11.hotel()) {
                                    cVar11.hotel = i38;
                                }
                            }
                        }
                        if (dVar9 != dVar7) {
                            c cVar12 = dVar9.fuchsia;
                            c cVar13 = dVar9.cyan;
                            if (z2) {
                                int i39 = gVar.f2480J;
                                if (i39 != 0) {
                                    if (i39 != 1) {
                                        if (i39 == 2) {
                                            cVar13.alpha(cVar8, 0);
                                            cVar12.alpha(cVar9, 0);
                                        }
                                    } else {
                                        cVar13.alpha(cVar8, 0);
                                    }
                                } else {
                                    cVar12.alpha(cVar9, 0);
                                }
                            } else {
                                int i40 = gVar.f2480J;
                                if (i40 != 0) {
                                    if (i40 != 1) {
                                        if (i40 == 2) {
                                            if (z13) {
                                                cVar13.alpha(this.delta, this.hotel);
                                                cVar12.alpha(this.foxtrot, this.juliet);
                                            } else {
                                                cVar13.alpha(cVar8, 0);
                                                cVar12.alpha(cVar9, 0);
                                            }
                                        }
                                    } else {
                                        cVar12.alpha(cVar9, 0);
                                    }
                                } else {
                                    cVar13.alpha(cVar8, 0);
                                }
                                dVar8 = dVar9;
                            }
                        }
                        dVar8 = dVar9;
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final int charlie() {
        if (this.alpha == 1) {
            return this.mike - this.romeo.f2479I;
        }
        return this.mike;
    }

    public final int delta() {
        if (this.alpha == 0) {
            return this.lima - this.romeo.f2478H;
        }
        return this.lima;
    }

    public final void echo(int i4) {
        g gVar;
        int i5;
        int i10 = this.papa;
        if (i10 != 0) {
            int i11 = this.oscar;
            int i12 = i4 / i10;
            int i13 = 0;
            while (true) {
                gVar = this.romeo;
                if (i13 >= i11 || (i5 = this.november + i13) >= gVar.f2489T) {
                    break;
                }
                d dVar = gVar.f2488S[i5];
                if (this.alpha == 0) {
                    if (dVar != null) {
                        int[] iArr = dVar.f2454h;
                        if (iArr[0] == 3 && dVar.romeo == 0) {
                            gVar.navy(1, i12, iArr[1], dVar.kilo(), dVar);
                        }
                    }
                } else if (dVar != null) {
                    int[] iArr2 = dVar.f2454h;
                    if (iArr2[1] == 3 && dVar.sierra == 0) {
                        int i14 = iArr2[0];
                        int i15 = i12;
                        gVar.navy(i14, dVar.quebec(), 1, i15, dVar);
                        i12 = i15;
                    }
                }
                i13++;
            }
            this.lima = 0;
            this.mike = 0;
            this.bravo = null;
            this.charlie = 0;
            int i16 = this.oscar;
            for (int i17 = 0; i17 < i16; i17++) {
                int i18 = this.november + i17;
                if (i18 < gVar.f2489T) {
                    d dVar2 = gVar.f2488S[i18];
                    if (this.alpha == 0) {
                        int quebec = dVar2.quebec();
                        int i19 = gVar.f2478H;
                        if (dVar2.white == 8) {
                            i19 = 0;
                        }
                        this.lima = quebec + i19 + this.lima;
                        int magenta = gVar.magenta(dVar2, this.quebec);
                        if (this.bravo == null || this.charlie < magenta) {
                            this.bravo = dVar2;
                            this.charlie = magenta;
                            this.mike = magenta;
                        }
                    } else {
                        int maroon = gVar.maroon(dVar2, this.quebec);
                        int magenta2 = gVar.magenta(dVar2, this.quebec);
                        int i20 = gVar.f2479I;
                        if (dVar2.white == 8) {
                            i20 = 0;
                        }
                        this.mike = magenta2 + i20 + this.mike;
                        if (this.bravo == null || this.charlie < maroon) {
                            this.bravo = dVar2;
                            this.charlie = maroon;
                            this.lima = maroon;
                        }
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final void foxtrot(int i4, c cVar, c cVar2, c cVar3, c cVar4, int i5, int i10, int i11, int i12, int i13) {
        this.alpha = i4;
        this.delta = cVar;
        this.echo = cVar2;
        this.foxtrot = cVar3;
        this.golf = cVar4;
        this.hotel = i5;
        this.india = i10;
        this.juliet = i11;
        this.kilo = i12;
        this.quebec = i13;
    }
}
