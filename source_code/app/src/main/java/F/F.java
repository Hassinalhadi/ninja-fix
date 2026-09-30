package F;

import a0.C0366t;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.material3.MinimumInteractiveModifier;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import bz.AbstractC0779d;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import t6.T3;

/* loaded from: classes3.dex */
public abstract class F {
    public static final float alpha;
    public static final float bravo = 20;
    public static final float charlie;
    public static final float delta;

    static {
        float f5 = 2;
        alpha = f5;
        charlie = f5;
        delta = f5;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:42:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x009b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(boolean z2, Function1 function1, T.s sVar, boolean z10, ay ayVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        int i10;
        boolean z11;
        int i11;
        int i12;
        C0.a aVar;
        Function0 function0;
        boolean z12;
        androidx.compose.runtime.Q uniform;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1406741137);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i10 = i16 | i4;
        } else {
            i10 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function1)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i10 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i10 |= i14;
        }
        int i17 = i5 & 8;
        if (i17 != 0) {
            i10 |= 3072;
        } else if ((i4 & 3072) == 0) {
            z11 = z10;
            if (c0585q.hotel(z11)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i10 |= i11;
            if ((i4 & 24576) == 0) {
                if (c0585q.golf(ayVar)) {
                    i13 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i13 = 8192;
                }
                i10 |= i13;
            }
            i12 = i10 | 196608;
            if ((74899 & i12) != 74898 && c0585q.bronze()) {
                c0585q.ochre();
            } else {
                c0585q.orange();
                boolean z13 = true;
                if ((i4 & 1) == 0 && !c0585q.beige()) {
                    c0585q.ochre();
                } else if (i17 != 0) {
                    z11 = true;
                }
                boolean z14 = z11;
                c0585q.romeo();
                if (!z2) {
                    aVar = C0.a.alpha;
                } else {
                    aVar = C0.a.purple;
                }
                c0585q.purple(1046936362);
                if (function1 == null) {
                    if ((i12 & 112) == 32) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if ((i12 & 14) != 4) {
                        z13 = false;
                    }
                    boolean z15 = z12 | z13;
                    Object jade = c0585q.jade();
                    if (z15 || jade == C0580l.alpha) {
                        jade = new az(function1, z2);
                        c0585q.f(jade);
                    }
                    function0 = (Function0) jade;
                } else {
                    function0 = null;
                }
                Function0 function02 = function0;
                c0585q.quebec(false);
                charlie(aVar, function02, sVar, z14, ayVar, c0585q, i12 & 524160);
                z11 = z14;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new A(z2, function1, sVar, z11, ayVar, i4, i5, 0);
                return;
            }
            return;
        }
        z11 = z10;
        if ((i4 & 24576) == 0) {
        }
        i12 = i10 | 196608;
        if ((74899 & i12) != 74898) {
        }
        c0585q.orange();
        boolean z132 = true;
        if ((i4 & 1) == 0) {
        }
        if (i17 != 0) {
        }
        boolean z142 = z11;
        c0585q.romeo();
        if (!z2) {
        }
        c0585q.purple(1046936362);
        if (function1 == null) {
        }
        Function0 function022 = function0;
        c0585q.quebec(false);
        charlie(aVar, function022, sVar, z142, ayVar, c0585q, i12 & 524160);
        z11 = z142;
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x029d A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x011b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0204  */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v30 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(boolean z2, C0.a aVar, T.s sVar, ay ayVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        float f5;
        int ordinal;
        float f10;
        int ordinal2;
        ?? r02;
        float f11;
        int ordinal3;
        float f12;
        C0585q c0585q;
        Object jade;
        androidx.compose.runtime.as asVar;
        C0.a aVar2;
        long j5;
        int i10;
        long j6;
        androidx.compose.runtime.D0 d02;
        Object black;
        long j7;
        Object black2;
        boolean golf;
        Object jade2;
        int i11;
        int i12;
        C0585q c0585q2;
        int i13;
        int i14;
        int i15;
        int i16;
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(2007131616);
        if ((i4 & 6) == 0) {
            if (c0585q3.hotel(z2)) {
                i16 = 4;
            } else {
                i16 = 2;
            }
            i5 = i16 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q3.golf(aVar)) {
                i15 = 32;
            } else {
                i15 = 16;
            }
            i5 |= i15;
        }
        if ((i4 & 384) == 0) {
            if (c0585q3.golf(sVar)) {
                i14 = Barcode.FORMAT_QR_CODE;
            } else {
                i14 = 128;
            }
            i5 |= i14;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q3.golf(ayVar)) {
                i13 = 2048;
            } else {
                i13 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i13;
        }
        if ((i5 & 1171) == 1170 && c0585q3.bronze()) {
            c0585q3.ochre();
            c0585q2 = c0585q3;
        } else {
            bz.a0 echo = bz.e0.echo(aVar, null, c0585q3, (i5 >> 3) & 14, 2);
            bz.g0 g0Var = AbstractC0779d.juliet;
            G3.a aVar3 = echo.alpha;
            C0.a aVar4 = (C0.a) aVar3.L();
            c0585q3.purple(1800065638);
            int ordinal4 = aVar4.ordinal();
            if (ordinal4 != 0) {
                if (ordinal4 != 1) {
                    if (ordinal4 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                } else {
                    f5 = 0.0f;
                    c0585q3.quebec(false);
                    Float valueOf = Float.valueOf(f5);
                    androidx.compose.runtime.t0 t0Var = (androidx.compose.runtime.t0) echo.delta;
                    C0.a aVar5 = (C0.a) t0Var.getValue();
                    c0585q3.purple(1800065638);
                    ordinal = aVar5.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            f10 = 0.0f;
                            c0585q3.quebec(false);
                            bz.X charlie2 = bz.e0.charlie(echo, valueOf, Float.valueOf(f10), (bz.aa) D.red.invoke(echo.foxtrot(), c0585q3, 0), g0Var, c0585q3, 0);
                            C0.a aVar6 = (C0.a) aVar3.L();
                            c0585q3.purple(-1426969489);
                            ordinal2 = aVar6.ordinal();
                            if (ordinal2 == 0 && ordinal2 != 1) {
                                if (ordinal2 == 2) {
                                    f11 = 1.0f;
                                    r02 = 0;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                r02 = 0;
                                f11 = 0.0f;
                            }
                            c0585q3.quebec(r02);
                            Float valueOf2 = Float.valueOf(f11);
                            C0.a aVar7 = (C0.a) t0Var.getValue();
                            c0585q3.purple(-1426969489);
                            ordinal3 = aVar7.ordinal();
                            if (ordinal3 == 0 && ordinal3 != 1) {
                                if (ordinal3 == 2) {
                                    f12 = 1.0f;
                                } else {
                                    throw new NoWhenBranchMatchedException();
                                }
                            } else {
                                f12 = 0.0f;
                            }
                            c0585q3.quebec(r02);
                            bz.X charlie3 = bz.e0.charlie(echo, valueOf2, Float.valueOf(f12), (bz.aa) D.purple.invoke(echo.foxtrot(), c0585q3, Integer.valueOf((int) r02)), g0Var, c0585q3, 0);
                            c0585q = c0585q3;
                            jade = c0585q.jade();
                            asVar = C0580l.alpha;
                            if (jade == asVar) {
                                jade = new ax();
                                c0585q.f(jade);
                            }
                            ax axVar = (ax) jade;
                            aVar2 = C0.a.purple;
                            if (aVar == aVar2) {
                                j5 = ayVar.bravo;
                            } else {
                                j5 = ayVar.alpha;
                            }
                            if (aVar == aVar2) {
                                i10 = 100;
                            } else {
                                i10 = 50;
                            }
                            androidx.compose.runtime.D0 alpha2 = bx.F.alpha(j5, AbstractC0779d.kilo(i10, r02, null, 6), c0585q, 0, 12);
                            if (z2) {
                                int ordinal5 = aVar.ordinal();
                                if (ordinal5 != 0) {
                                    if (ordinal5 != 1) {
                                        if (ordinal5 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j6 = ayVar.delta;
                                    }
                                }
                                j6 = ayVar.charlie;
                            } else {
                                int ordinal6 = aVar.ordinal();
                                if (ordinal6 != 0) {
                                    if (ordinal6 != 1) {
                                        if (ordinal6 == 2) {
                                            j6 = ayVar.golf;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j6 = ayVar.foxtrot;
                                    }
                                } else {
                                    j6 = ayVar.echo;
                                }
                            }
                            if (z2) {
                                c0585q.purple(-392211906);
                                if (aVar == aVar2) {
                                    i12 = 100;
                                } else {
                                    i12 = 50;
                                }
                                d02 = alpha2;
                                black = bx.F.alpha(j6, AbstractC0779d.kilo(i12, 0, null, 6), c0585q, 0, 12);
                                c0585q.quebec(false);
                            } else {
                                d02 = alpha2;
                                c0585q.purple(-392031362);
                                black = C0564b.black(new C0366t(j6), c0585q);
                                c0585q.quebec(false);
                            }
                            Object obj = black;
                            if (z2) {
                                int ordinal7 = aVar.ordinal();
                                if (ordinal7 != 0) {
                                    if (ordinal7 != 1) {
                                        if (ordinal7 != 2) {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j7 = ayVar.india;
                                    }
                                }
                                j7 = ayVar.hotel;
                            } else {
                                int ordinal8 = aVar.ordinal();
                                if (ordinal8 != 0) {
                                    if (ordinal8 != 1) {
                                        if (ordinal8 == 2) {
                                            j7 = ayVar.lima;
                                        } else {
                                            throw new NoWhenBranchMatchedException();
                                        }
                                    } else {
                                        j7 = ayVar.kilo;
                                    }
                                } else {
                                    j7 = ayVar.juliet;
                                }
                            }
                            if (z2) {
                                c0585q.purple(-1725816497);
                                if (aVar == aVar2) {
                                    i11 = 100;
                                } else {
                                    i11 = 50;
                                }
                                black2 = bx.F.alpha(j7, AbstractC0779d.kilo(i11, 0, null, 6), c0585q, 0, 12);
                                c0585q.quebec(false);
                            } else {
                                c0585q.purple(-1725635953);
                                black2 = C0564b.black(new C0366t(j7), c0585q);
                                c0585q.quebec(false);
                            }
                            T.s hotel = androidx.compose.foundation.layout.V.hotel(androidx.compose.foundation.layout.V.sierra(sVar, T.d.teal, 2), bravo);
                            androidx.compose.runtime.D0 d03 = d02;
                            golf = c0585q.golf(obj) | c0585q.golf(black2) | c0585q.golf(d03) | c0585q.golf(charlie2) | c0585q.golf(charlie3);
                            jade2 = c0585q.jade();
                            if (!golf || jade2 == asVar) {
                                jade2 = new B(obj, black2, d03, charlie2, charlie3, axVar, 0);
                                c0585q.f(jade2);
                            }
                            T3.alpha(hotel, (Function1) jade2, c0585q, 0);
                            c0585q2 = c0585q;
                        }
                    }
                    f10 = 1.0f;
                    c0585q3.quebec(false);
                    bz.X charlie22 = bz.e0.charlie(echo, valueOf, Float.valueOf(f10), (bz.aa) D.red.invoke(echo.foxtrot(), c0585q3, 0), g0Var, c0585q3, 0);
                    C0.a aVar62 = (C0.a) aVar3.L();
                    c0585q3.purple(-1426969489);
                    ordinal2 = aVar62.ordinal();
                    if (ordinal2 == 0) {
                    }
                    r02 = 0;
                    f11 = 0.0f;
                    c0585q3.quebec(r02);
                    Float valueOf22 = Float.valueOf(f11);
                    C0.a aVar72 = (C0.a) t0Var.getValue();
                    c0585q3.purple(-1426969489);
                    ordinal3 = aVar72.ordinal();
                    if (ordinal3 == 0) {
                    }
                    f12 = 0.0f;
                    c0585q3.quebec(r02);
                    bz.X charlie32 = bz.e0.charlie(echo, valueOf22, Float.valueOf(f12), (bz.aa) D.purple.invoke(echo.foxtrot(), c0585q3, Integer.valueOf((int) r02)), g0Var, c0585q3, 0);
                    c0585q = c0585q3;
                    jade = c0585q.jade();
                    asVar = C0580l.alpha;
                    if (jade == asVar) {
                    }
                    ax axVar2 = (ax) jade;
                    aVar2 = C0.a.purple;
                    if (aVar == aVar2) {
                    }
                    if (aVar == aVar2) {
                    }
                    androidx.compose.runtime.D0 alpha22 = bx.F.alpha(j5, AbstractC0779d.kilo(i10, r02, null, 6), c0585q, 0, 12);
                    if (z2) {
                    }
                    if (z2) {
                    }
                    Object obj2 = black;
                    if (z2) {
                    }
                    if (z2) {
                    }
                    T.s hotel2 = androidx.compose.foundation.layout.V.hotel(androidx.compose.foundation.layout.V.sierra(sVar, T.d.teal, 2), bravo);
                    androidx.compose.runtime.D0 d032 = d02;
                    golf = c0585q.golf(obj2) | c0585q.golf(black2) | c0585q.golf(d032) | c0585q.golf(charlie22) | c0585q.golf(charlie32);
                    jade2 = c0585q.jade();
                    if (!golf) {
                    }
                    jade2 = new B(obj2, black2, d032, charlie22, charlie32, axVar2, 0);
                    c0585q.f(jade2);
                    T3.alpha(hotel2, (Function1) jade2, c0585q, 0);
                    c0585q2 = c0585q;
                }
            }
            f5 = 1.0f;
            c0585q3.quebec(false);
            Float valueOf3 = Float.valueOf(f5);
            androidx.compose.runtime.t0 t0Var2 = (androidx.compose.runtime.t0) echo.delta;
            C0.a aVar52 = (C0.a) t0Var2.getValue();
            c0585q3.purple(1800065638);
            ordinal = aVar52.ordinal();
            if (ordinal != 0) {
            }
            f10 = 1.0f;
            c0585q3.quebec(false);
            bz.X charlie222 = bz.e0.charlie(echo, valueOf3, Float.valueOf(f10), (bz.aa) D.red.invoke(echo.foxtrot(), c0585q3, 0), g0Var, c0585q3, 0);
            C0.a aVar622 = (C0.a) aVar3.L();
            c0585q3.purple(-1426969489);
            ordinal2 = aVar622.ordinal();
            if (ordinal2 == 0) {
            }
            r02 = 0;
            f11 = 0.0f;
            c0585q3.quebec(r02);
            Float valueOf222 = Float.valueOf(f11);
            C0.a aVar722 = (C0.a) t0Var2.getValue();
            c0585q3.purple(-1426969489);
            ordinal3 = aVar722.ordinal();
            if (ordinal3 == 0) {
            }
            f12 = 0.0f;
            c0585q3.quebec(r02);
            bz.X charlie322 = bz.e0.charlie(echo, valueOf222, Float.valueOf(f12), (bz.aa) D.purple.invoke(echo.foxtrot(), c0585q3, Integer.valueOf((int) r02)), g0Var, c0585q3, 0);
            c0585q = c0585q3;
            jade = c0585q.jade();
            asVar = C0580l.alpha;
            if (jade == asVar) {
            }
            ax axVar22 = (ax) jade;
            aVar2 = C0.a.purple;
            if (aVar == aVar2) {
            }
            if (aVar == aVar2) {
            }
            androidx.compose.runtime.D0 alpha222 = bx.F.alpha(j5, AbstractC0779d.kilo(i10, r02, null, 6), c0585q, 0, 12);
            if (z2) {
            }
            if (z2) {
            }
            Object obj22 = black;
            if (z2) {
            }
            if (z2) {
            }
            T.s hotel22 = androidx.compose.foundation.layout.V.hotel(androidx.compose.foundation.layout.V.sierra(sVar, T.d.teal, 2), bravo);
            androidx.compose.runtime.D0 d0322 = d02;
            golf = c0585q.golf(obj22) | c0585q.golf(black2) | c0585q.golf(d0322) | c0585q.golf(charlie222) | c0585q.golf(charlie322);
            jade2 = c0585q.jade();
            if (!golf) {
            }
            jade2 = new B(obj22, black2, d0322, charlie222, charlie322, axVar22, 0);
            c0585q.f(jade2);
            T3.alpha(hotel22, (Function1) jade2, c0585q, 0);
            c0585q2 = c0585q;
        }
        androidx.compose.runtime.Q uniform = c0585q2.uniform();
        if (uniform != null) {
            uniform.delta = new C(z2, aVar, sVar, ayVar, i4);
        }
    }

    public static final void charlie(C0.a aVar, Function0 function0, T.s sVar, boolean z2, ay ayVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        T.s sVar2;
        C0.a aVar2;
        boolean z10;
        ay ayVar2;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1608358065);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(aVar)) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(function0)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(sVar)) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(ayVar)) {
                i11 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i11 = 8192;
            }
            i5 |= i11;
        }
        if ((196608 & i4) == 0) {
            if (c0585q.golf(null)) {
                i10 = 131072;
            } else {
                i10 = 65536;
            }
            i5 |= i10;
        }
        if ((74899 & i5) == 74898 && c0585q.bronze()) {
            c0585q.ochre();
            aVar2 = aVar;
            ayVar2 = ayVar;
            z10 = z2;
        } else {
            c0585q.orange();
            int i16 = i4 & 1;
            T.s sVar3 = T.p.alpha;
            if (i16 != 0 && !c0585q.beige()) {
                c0585q.ochre();
            }
            c0585q.romeo();
            c0585q.purple(-97239746);
            if (function0 != null) {
                sVar2 = androidx.compose.foundation.selection.b.charlie(new A0.h(1), aVar, L1.bravo(false, H.a.alpha / 2, c0585q, 54, 4), function0, z2);
            } else {
                sVar2 = sVar3;
            }
            c0585q.quebec(false);
            if (function0 != null) {
                androidx.compose.runtime.E0 e02 = AbstractC0145p0.alpha;
                sVar3 = MinimumInteractiveModifier.alpha;
            }
            aVar2 = aVar;
            bravo(z2, aVar2, AbstractC0538d.sierra(sVar.then(sVar3).then(sVar2), alpha), ayVar, c0585q, ((i5 >> 9) & 14) | ((i5 << 3) & 112) | ((i5 >> 3) & 7168));
            z10 = z2;
            ayVar2 = ayVar;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new E(aVar2, function0, sVar, z10, ayVar2, i4);
        }
    }
}
