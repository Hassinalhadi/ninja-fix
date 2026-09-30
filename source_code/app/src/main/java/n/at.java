package n;

import F.E2;
import a0.C0366t;
import a0.InterfaceC0368v;
import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.AbstractC0547m;
import androidx.compose.foundation.text.input.internal.CoreTextFieldSemanticsModifier;
import androidx.compose.foundation.text.modifiers.TextAnnotatedStringElement;
import androidx.compose.foundation.text.modifiers.TextStringSimpleElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.t0;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.C0703s;
import com.airbnb.lottie.compose.LottieConstants;
import com.google.android.gms.internal.measurement.C1290a1;
import com.google.mlkit.vision.barcode.common.Barcode;
import f.InterfaceC1673j;
import g.AbstractC1719b;
import h5.C1809a;
import i0.InterfaceC1878a;
import id.C1915c;
import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import k.C1990b;
import k0.AbstractC1996c;
import k5.C2008a;
import k5.C2015h;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import m0.C2095a;
import okhttp3.internal.http2.Http2;
import q0.AbstractC2366B;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;
import s6.AbstractC2618b7;
import s6.J4;
import s6.T7;
import s6.X6;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;
import t0.C2917h0;
import t0.C2932p;
import t0.E0;
import t0.InterfaceC2897O;
import t0.InterfaceC2937r0;
import t6.AbstractC2967a3;
import t6.AbstractC3056s3;
import t6.AbstractC3066u3;
import t6.AbstractC3072w;
import w.C3227e;
import y.AbstractC3355O;
import y.AbstractC3380t;
import y.C3344D;
import y.C3354N;
import y.C3379s;
import y.EnumC3381u;
import y.InterfaceC3372l;

/* loaded from: classes3.dex */
public abstract class at {
    public static final aq alpha = new aq(1);
    public static final C2095a bravo = new C2095a(1022);

    /* JADX WARN: Removed duplicated region for block: B:121:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(D0.g gVar, T.s sVar, D0.an anVar, Function1 function1, int i4, boolean z2, int i5, int i10, kotlin.collections.t tVar, InterfaceC0581m interfaceC0581m, int i11, int i12) {
        int i13;
        D0.an anVar2;
        int i14;
        int i15;
        int i16;
        kotlin.collections.t tVar2;
        int i17;
        int i18;
        boolean z10;
        C0585q c0585q;
        kotlin.collections.t tVar3;
        int i19;
        androidx.compose.runtime.Q uniform;
        int i20;
        kotlin.collections.t tVar4;
        int i21;
        boolean z11;
        kotlin.collections.t tVar5;
        List list;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1343466571);
        if ((i11 & 6) == 0) {
            if (c0585q2.golf(gVar)) {
                i28 = 4;
            } else {
                i28 = 2;
            }
            i13 = i28 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i27 = 32;
            } else {
                i27 = 16;
            }
            i13 |= i27;
        }
        if ((i11 & 384) == 0) {
            anVar2 = anVar;
            if (c0585q2.golf(anVar2)) {
                i26 = 256;
            } else {
                i26 = 128;
            }
            i13 |= i26;
        } else {
            anVar2 = anVar;
        }
        if ((i11 & 3072) == 0) {
            if (c0585q2.india(function1)) {
                i25 = 2048;
            } else {
                i25 = Barcode.FORMAT_UPC_E;
            }
            i13 |= i25;
        }
        if ((i11 & 24576) == 0) {
            if (c0585q2.echo(i4)) {
                i24 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i24 = 8192;
            }
            i13 |= i24;
        }
        if ((196608 & i11) == 0) {
            if (c0585q2.hotel(z2)) {
                i23 = 131072;
            } else {
                i23 = 65536;
            }
            i13 |= i23;
        }
        if ((1572864 & i11) == 0) {
            if (c0585q2.echo(i5)) {
                i22 = 1048576;
            } else {
                i22 = 524288;
            }
            i13 |= i22;
        }
        int i29 = 128 & i12;
        if (i29 != 0) {
            i13 |= 12582912;
        } else if ((12582912 & i11) == 0) {
            i14 = i10;
            if (c0585q2.echo(i14)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i13 |= i15;
            i16 = 256 & i12;
            if (i16 == 0) {
                i13 |= 100663296;
                tVar2 = tVar;
            } else {
                tVar2 = tVar;
                if ((i11 & 100663296) == 0) {
                    if (c0585q2.india(tVar2)) {
                        i17 = 67108864;
                    } else {
                        i17 = 33554432;
                    }
                    i13 |= i17;
                }
            }
            if ((i12 & 512) == 0) {
                i13 |= 805306368;
            } else if ((i11 & 805306368) == 0) {
                if (c0585q2.india(null)) {
                    i18 = 536870912;
                } else {
                    i18 = 268435456;
                }
                i13 |= i18;
            }
            boolean z12 = false;
            if ((306783379 & i13) != 306783378) {
                z10 = false;
            } else {
                z10 = true;
            }
            if (!c0585q2.magenta(i13 & 1, z10)) {
                if (i29 != 0) {
                    i20 = 1;
                } else {
                    i20 = i14;
                }
                if (i16 != 0) {
                    tVar4 = kotlin.collections.t.alpha;
                } else {
                    tVar4 = tVar2;
                }
                yankee(i20, i5);
                if (c0585q2.kilo(y.am.alpha) == null) {
                    c0585q2.purple(1588771313);
                    c0585q2.quebec(false);
                    Pair pair = AbstractC2130e.alpha;
                    int length = gVar.purple.length();
                    List list2 = gVar.alpha;
                    if (list2 != null) {
                        int size = list2.size();
                        int i30 = 0;
                        while (i30 < size) {
                            D0.e eVar = (D0.e) list2.get(i30);
                            if (eVar.alpha instanceof D0.ah) {
                                list = list2;
                                if (Intrinsics.areEqual("androidx.compose.foundation.text.inlineContent", eVar.delta)) {
                                    int i31 = eVar.bravo;
                                    int i32 = eVar.charlie;
                                    z12 = false;
                                    if (D0.h.bravo(0, length, i31, i32)) {
                                        i21 = i13;
                                        z11 = true;
                                        break;
                                    } else {
                                        i30++;
                                        list2 = list;
                                    }
                                }
                            } else {
                                list = list2;
                            }
                            z12 = false;
                            i30++;
                            list2 = list;
                        }
                    }
                    i21 = i13;
                    z11 = z12;
                    boolean alpha2 = AbstractC2967a3.alpha(gVar);
                    H0.j jVar = (H0.j) c0585q2.kilo(AbstractC2901T.kilo);
                    if (!z11 && !alpha2) {
                        c0585q2.purple(1589018166);
                        AbstractC2141p.alpha(gVar, anVar2, jVar, null, c0585q2, (i21 & 14) | 3072 | ((i21 >> 3) & 112));
                        c0585q = c0585q2;
                        boolean z13 = z12;
                        T.s xray = xray(sVar, gVar, anVar, function1, i4, z2, i5, i20, jVar, null, null, null, null);
                        C2129d c2129d = C2129d.charlie;
                        long j5 = c0585q.magenta;
                        int i33 = (int) (j5 ^ (j5 >>> 32));
                        T.s charlie = T.a.charlie(xray, c0585q);
                        androidx.compose.runtime.I mike = c0585q.mike();
                        InterfaceC2552l.maroon.getClass();
                        C2550j c2550j = C2551k.bravo;
                        c0585q.white();
                        if (c0585q.lime) {
                            c0585q.lima(c2550j);
                        } else {
                            c0585q.i();
                        }
                        C0564b.blue(C2551k.foxtrot, c0585q, c2129d);
                        C0564b.blue(C2551k.echo, c0585q, mike);
                        C0564b.blue(C2551k.delta, c0585q, charlie);
                        C2549i c2549i = C2551k.golf;
                        if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i33))) {
                            ao.ad.blue(i33, c0585q, i33, c2549i);
                        }
                        c0585q.quebec(true);
                        c0585q.quebec(z13);
                        tVar5 = tVar4;
                    } else {
                        c0585q = c0585q2;
                        boolean z14 = z12;
                        boolean z15 = true;
                        c0585q.purple(1590033974);
                        if ((i21 & 14) != 4) {
                            z15 = z14;
                        }
                        Object jade = c0585q.jade();
                        Object obj = C0580l.alpha;
                        if (z15 || jade == obj) {
                            jade = C0564b.zulu(gVar);
                            c0585q.f(jade);
                        }
                        androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade;
                        D0.g gVar2 = (D0.g) axVar.getValue();
                        boolean golf = c0585q.golf(axVar);
                        Object jade2 = c0585q.jade();
                        if (golf || jade2 == obj) {
                            jade2 = new Cb.i(axVar, 27);
                            c0585q.f(jade2);
                        }
                        int i34 = i21 << 6;
                        int i35 = i20;
                        tVar5 = tVar4;
                        india(sVar, gVar2, function1, z11, tVar5, anVar, i4, z2, i5, i35, jVar, null, (Function1) jade2, c0585q, ((i21 >> 3) & 910) | ((i21 >> 12) & 57344) | ((i21 << 9) & 458752) | (3670016 & i34) | (29360128 & i34) | (234881024 & i34) | (i34 & 1879048192), ((i21 >> 21) & 896) | 24576);
                        i20 = i35;
                        c0585q.quebec(false);
                    }
                    tVar3 = tVar5;
                    i19 = i20;
                } else {
                    throw new ClassCastException();
                }
            } else {
                c0585q = c0585q2;
                c0585q.ochre();
                tVar3 = tVar2;
                i19 = i14;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C2139n(gVar, sVar, anVar, function1, i4, z2, i5, i19, tVar3, i11, i12, 1);
                return;
            }
            return;
        }
        i14 = i10;
        i16 = 256 & i12;
        if (i16 == 0) {
        }
        if ((i12 & 512) == 0) {
        }
        boolean z122 = false;
        if ((306783379 & i13) != 306783378) {
        }
        if (!c0585q2.magenta(i13 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }

    public static final void bravo(final D0.g gVar, final T.s sVar, final D0.an anVar, final E2 e22, final int i4, final boolean z2, final int i5, final int i10, final kotlin.collections.t tVar, InterfaceC0581m interfaceC0581m, final int i11) {
        int i12;
        boolean z10;
        C0585q c0585q;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1064305212);
        if ((i11 & 6) == 0) {
            if (c0585q2.golf(gVar)) {
                i21 = 4;
            } else {
                i21 = 2;
            }
            i12 = i21 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i20 = 32;
            } else {
                i20 = 16;
            }
            i12 |= i20;
        }
        if ((i11 & 384) == 0) {
            if (c0585q2.golf(anVar)) {
                i19 = Barcode.FORMAT_QR_CODE;
            } else {
                i19 = 128;
            }
            i12 |= i19;
        }
        if ((i11 & 3072) == 0) {
            if (c0585q2.india(e22)) {
                i18 = 2048;
            } else {
                i18 = Barcode.FORMAT_UPC_E;
            }
            i12 |= i18;
        }
        if ((i11 & 24576) == 0) {
            if (c0585q2.echo(i4)) {
                i17 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((196608 & i11) == 0) {
            if (c0585q2.hotel(z2)) {
                i16 = 131072;
            } else {
                i16 = 65536;
            }
            i12 |= i16;
        }
        if ((1572864 & i11) == 0) {
            if (c0585q2.echo(i5)) {
                i15 = 1048576;
            } else {
                i15 = 524288;
            }
            i12 |= i15;
        }
        if ((12582912 & i11) == 0) {
            if (c0585q2.echo(i10)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i12 |= i14;
        }
        if ((100663296 & i11) == 0) {
            if (c0585q2.india(tVar)) {
                i13 = 67108864;
            } else {
                i13 = 33554432;
            }
            i12 |= i13;
        }
        int i22 = i12 | 805306368;
        if ((306783379 & i22) != 306783378) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i22 & 1, z10)) {
            c0585q = c0585q2;
            alpha(gVar, sVar, anVar, e22, i4, z2, i5, i10, tVar, c0585q, i22 & 2147483646, Barcode.FORMAT_UPC_E);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: n.m
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i11 | 1);
                    D0.g gVar2 = D0.g.this;
                    int i23 = i10;
                    kotlin.collections.t tVar2 = tVar;
                    at.bravo(gVar2, sVar, anVar, e22, i4, z2, i5, i23, tVar2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:117:0x0185, code lost:
    
        if (r15.golf(r23) == false) goto L117;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x029a  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void charlie(String str, T.s sVar, D0.an anVar, Function1 function1, int i4, boolean z2, int i5, int i10, InterfaceC0368v interfaceC0368v, InterfaceC0581m interfaceC0581m, int i11, int i12) {
        int i13;
        Function1 function12;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        boolean z10;
        boolean z11;
        InterfaceC0368v interfaceC0368v2;
        Function1 function13;
        int i26;
        int i27;
        androidx.compose.runtime.Q uniform;
        Function1 function14;
        boolean z12;
        int i28;
        int i29;
        InterfaceC0368v interfaceC0368v3;
        Function1 function15;
        boolean z13;
        boolean z14;
        int i30;
        char c3;
        T.s sVar2;
        boolean z15;
        boolean z16;
        boolean golf;
        Object jade;
        Object agVar;
        Executor executor;
        int i31;
        int i32;
        int i33;
        int i34;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1040751001);
        if ((i11 & 6) == 0) {
            if (c0585q.golf(str)) {
                i34 = 4;
            } else {
                i34 = 2;
            }
            i13 = i34 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (c0585q.golf(sVar)) {
                i33 = 32;
            } else {
                i33 = 16;
            }
            i13 |= i33;
        }
        if ((i11 & 384) == 0) {
            if (c0585q.golf(anVar)) {
                i32 = Barcode.FORMAT_QR_CODE;
            } else {
                i32 = 128;
            }
            i13 |= i32;
        }
        int i35 = i12 & 8;
        if (i35 != 0) {
            i13 |= 3072;
        } else if ((i11 & 3072) == 0) {
            function12 = function1;
            if (c0585q.india(function12)) {
                i14 = 2048;
            } else {
                i14 = Barcode.FORMAT_UPC_E;
            }
            i13 |= i14;
            i15 = i12 & 16;
            if (i15 == 0) {
                i13 |= 24576;
            } else if ((i11 & 24576) == 0) {
                i16 = i4;
                if (c0585q.echo(i16)) {
                    i17 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
                i18 = i12 & 32;
                if (i18 != 0) {
                    i13 |= 196608;
                } else if ((196608 & i11) == 0) {
                    if (c0585q.hotel(z2)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                    if ((i11 & 1572864) == 0) {
                        if (c0585q.echo(i5)) {
                            i31 = 1048576;
                        } else {
                            i31 = 524288;
                        }
                        i13 |= i31;
                    }
                    i20 = i12 & 128;
                    if (i20 == 0) {
                        i13 |= 12582912;
                    } else if ((i11 & 12582912) == 0) {
                        if (c0585q.echo(i10)) {
                            i21 = 8388608;
                        } else {
                            i21 = 4194304;
                        }
                        i13 |= i21;
                    }
                    int i36 = i13;
                    i22 = i12 & Barcode.FORMAT_QR_CODE;
                    if (i22 == 0) {
                        i36 |= 100663296;
                    } else if ((i11 & 100663296) == 0) {
                        i23 = i22;
                        if (c0585q.india(interfaceC0368v)) {
                            i24 = 67108864;
                        } else {
                            i24 = 33554432;
                        }
                        i36 |= i24;
                        i25 = i36 | 805306368;
                        if ((i25 & 306783379) != 306783378) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0585q.magenta(i25 & 1, z10)) {
                            if (i35 != 0) {
                                function14 = null;
                            } else {
                                function14 = function12;
                            }
                            if (i15 != 0) {
                                i16 = 1;
                            }
                            if (i18 != 0) {
                                z12 = true;
                            } else {
                                z12 = z2;
                            }
                            boolean z17 = z12;
                            if (i20 != 0) {
                                i28 = 1;
                            } else {
                                i28 = i10;
                            }
                            if (i23 != 0) {
                                i29 = i16;
                                interfaceC0368v3 = null;
                            } else {
                                i29 = i16;
                                interfaceC0368v3 = interfaceC0368v;
                            }
                            yankee(i28, i5);
                            if (c0585q.kilo(y.am.alpha) == null) {
                                c0585q.purple(356926143);
                                c0585q.quebec(false);
                                H0.j jVar = (H0.j) c0585q.kilo(AbstractC2901T.kilo);
                                int i37 = (i25 & 14) | ((i25 >> 3) & 112);
                                Executor executor2 = (Executor) c0585q.kilo(AbstractC2141p.alpha);
                                if (executor2 != null && AbstractC2141p.bravo(str.length())) {
                                    c0585q.purple(1254328095);
                                    Q0.n nVar = (Q0.n) c0585q.kilo(AbstractC2901T.november);
                                    Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
                                    function15 = function14;
                                    if (((i37 & 112) ^ 48) > 32) {
                                    }
                                    if ((i37 & 48) != 32) {
                                        z15 = false;
                                        boolean echo = z15 | c0585q.echo(nVar.ordinal());
                                        if ((((i37 & 14) ^ 6) <= 4 && c0585q.golf(str)) || (i37 & 6) == 4) {
                                            z16 = true;
                                        } else {
                                            z16 = false;
                                        }
                                        golf = echo | z16 | c0585q.golf(dVar) | c0585q.india(jVar);
                                        jade = c0585q.jade();
                                        if (!golf && jade != C0580l.alpha) {
                                            agVar = jade;
                                            executor = executor2;
                                            executor.execute((Runnable) agVar);
                                            z13 = false;
                                            c0585q.quebec(false);
                                        }
                                        executor = executor2;
                                        agVar = new A2.ag(anVar, nVar, str, dVar, jVar);
                                        c0585q.f(agVar);
                                        executor.execute((Runnable) agVar);
                                        z13 = false;
                                        c0585q.quebec(false);
                                    }
                                    z15 = true;
                                    boolean echo2 = z15 | c0585q.echo(nVar.ordinal());
                                    if (((i37 & 14) ^ 6) <= 4) {
                                    }
                                    z16 = false;
                                    golf = echo2 | z16 | c0585q.golf(dVar) | c0585q.india(jVar);
                                    jade = c0585q.jade();
                                    if (!golf) {
                                        agVar = jade;
                                        executor = executor2;
                                        executor.execute((Runnable) agVar);
                                        z13 = false;
                                        c0585q.quebec(false);
                                    }
                                    executor = executor2;
                                    agVar = new A2.ag(anVar, nVar, str, dVar, jVar);
                                    c0585q.f(agVar);
                                    executor.execute((Runnable) agVar);
                                    z13 = false;
                                    c0585q.quebec(false);
                                } else {
                                    function15 = function14;
                                    z13 = false;
                                    c0585q.purple(1255196839);
                                    c0585q.quebec(false);
                                }
                                if (function15 == null) {
                                    c0585q.purple(357887763);
                                    c0585q.quebec(z13);
                                    z14 = z17;
                                    i30 = i29;
                                    sVar2 = sVar.then(new TextStringSimpleElement(str, anVar, jVar, i30, z14, i5, i28, interfaceC0368v3));
                                    c3 = ' ';
                                } else {
                                    z14 = z17;
                                    i30 = i29;
                                    c0585q.purple(357244017);
                                    InterfaceC0368v interfaceC0368v4 = interfaceC0368v3;
                                    c3 = ' ';
                                    T.s xray = xray(sVar, new D0.g(str), anVar, function15, i30, z14, i5, i28, (H0.j) c0585q.kilo(AbstractC2901T.kilo), null, null, interfaceC0368v4, null);
                                    interfaceC0368v3 = interfaceC0368v4;
                                    c0585q.quebec(z13);
                                    sVar2 = xray;
                                }
                                C2129d c2129d = C2129d.charlie;
                                long j5 = c0585q.magenta;
                                int i38 = (int) (j5 ^ (j5 >>> c3));
                                T.s charlie = T.a.charlie(sVar2, c0585q);
                                androidx.compose.runtime.I mike = c0585q.mike();
                                InterfaceC2552l.maroon.getClass();
                                C2550j c2550j = C2551k.bravo;
                                c0585q.white();
                                if (c0585q.lime) {
                                    c0585q.lima(c2550j);
                                } else {
                                    c0585q.i();
                                }
                                C0564b.blue(C2551k.foxtrot, c0585q, c2129d);
                                C0564b.blue(C2551k.echo, c0585q, mike);
                                C0564b.blue(C2551k.delta, c0585q, charlie);
                                C2549i c2549i = C2551k.golf;
                                if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i38))) {
                                    ao.ad.blue(i38, c0585q, i38, c2549i);
                                }
                                c0585q.quebec(true);
                                z11 = z14;
                                interfaceC0368v2 = interfaceC0368v3;
                                i26 = i30;
                                i27 = i28;
                                function13 = function15;
                            } else {
                                throw new ClassCastException();
                            }
                        } else {
                            c0585q.ochre();
                            z11 = z2;
                            interfaceC0368v2 = interfaceC0368v;
                            function13 = function12;
                            i26 = i16;
                            i27 = i10;
                        }
                        uniform = c0585q.uniform();
                        if (uniform != null) {
                            uniform.delta = new C2139n(str, sVar, anVar, function13, i26, z11, i5, i27, interfaceC0368v2, i11, i12, 0);
                            return;
                        }
                        return;
                    }
                    i23 = i22;
                    i25 = i36 | 805306368;
                    if ((i25 & 306783379) != 306783378) {
                    }
                    if (c0585q.magenta(i25 & 1, z10)) {
                    }
                    uniform = c0585q.uniform();
                    if (uniform != null) {
                    }
                }
                if ((i11 & 1572864) == 0) {
                }
                i20 = i12 & 128;
                if (i20 == 0) {
                }
                int i362 = i13;
                i22 = i12 & Barcode.FORMAT_QR_CODE;
                if (i22 == 0) {
                }
                i23 = i22;
                i25 = i362 | 805306368;
                if ((i25 & 306783379) != 306783378) {
                }
                if (c0585q.magenta(i25 & 1, z10)) {
                }
                uniform = c0585q.uniform();
                if (uniform != null) {
                }
            }
            i16 = i4;
            i18 = i12 & 32;
            if (i18 != 0) {
            }
            if ((i11 & 1572864) == 0) {
            }
            i20 = i12 & 128;
            if (i20 == 0) {
            }
            int i3622 = i13;
            i22 = i12 & Barcode.FORMAT_QR_CODE;
            if (i22 == 0) {
            }
            i23 = i22;
            i25 = i3622 | 805306368;
            if ((i25 & 306783379) != 306783378) {
            }
            if (c0585q.magenta(i25 & 1, z10)) {
            }
            uniform = c0585q.uniform();
            if (uniform != null) {
            }
        }
        function12 = function1;
        i15 = i12 & 16;
        if (i15 == 0) {
        }
        i16 = i4;
        i18 = i12 & 32;
        if (i18 != 0) {
        }
        if ((i11 & 1572864) == 0) {
        }
        i20 = i12 & 128;
        if (i20 == 0) {
        }
        int i36222 = i13;
        i22 = i12 & Barcode.FORMAT_QR_CODE;
        if (i22 == 0) {
        }
        i23 = i22;
        i25 = i36222 | 805306368;
        if ((i25 & 306783379) != 306783378) {
        }
        if (c0585q.magenta(i25 & 1, z10)) {
        }
        uniform = c0585q.uniform();
        if (uniform != null) {
        }
    }

    public static final void delta(final String str, final T.s sVar, final D0.an anVar, final Function1 function1, final int i4, final boolean z2, final int i5, final int i10, InterfaceC0581m interfaceC0581m, final int i11) {
        int i12;
        boolean z10;
        C0585q c0585q;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-1186827822);
        if ((i11 & 6) == 0) {
            if (c0585q2.golf(str)) {
                i20 = 4;
            } else {
                i20 = 2;
            }
            i12 = i20 | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i19 = 32;
            } else {
                i19 = 16;
            }
            i12 |= i19;
        }
        if ((i11 & 384) == 0) {
            if (c0585q2.golf(anVar)) {
                i18 = Barcode.FORMAT_QR_CODE;
            } else {
                i18 = 128;
            }
            i12 |= i18;
        }
        if ((i11 & 3072) == 0) {
            if (c0585q2.india(function1)) {
                i17 = 2048;
            } else {
                i17 = Barcode.FORMAT_UPC_E;
            }
            i12 |= i17;
        }
        if ((i11 & 24576) == 0) {
            if (c0585q2.echo(i4)) {
                i16 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i16 = 8192;
            }
            i12 |= i16;
        }
        if ((196608 & i11) == 0) {
            if (c0585q2.hotel(z2)) {
                i15 = 131072;
            } else {
                i15 = 65536;
            }
            i12 |= i15;
        }
        if ((1572864 & i11) == 0) {
            if (c0585q2.echo(i5)) {
                i14 = 1048576;
            } else {
                i14 = 524288;
            }
            i12 |= i14;
        }
        if ((12582912 & i11) == 0) {
            if (c0585q2.echo(i10)) {
                i13 = 8388608;
            } else {
                i13 = 4194304;
            }
            i12 |= i13;
        }
        int i21 = i12 | 100663296;
        if ((38347923 & i21) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i21 & 1, z10)) {
            c0585q = c0585q2;
            charlie(str, sVar, anVar, function1, i4, z2, i5, i10, null, c0585q, i21 & 268435454, 512);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: n.j
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i11 | 1);
                    int i22 = i5;
                    int i23 = i10;
                    at.delta(str, sVar, anVar, function1, i4, z2, i22, i23, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void echo(final D0.g gVar, final T.s sVar, final D0.an anVar, boolean z2, int i4, int i5, Function1 function1, final Function1 function12, InterfaceC0581m interfaceC0581m, final int i10) {
        int i11;
        boolean z10;
        C0585q c0585q;
        final boolean z11;
        final int i12;
        final int i13;
        final Function1 function13;
        boolean z12;
        int i14;
        int i15;
        int i16;
        int i17;
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-246609449);
        if ((i10 & 6) == 0) {
            if (c0585q2.golf(gVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i11 = i17 | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            if (c0585q2.golf(sVar)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i11 |= i16;
        }
        if ((i10 & 384) == 0) {
            if (c0585q2.golf(anVar)) {
                i15 = Barcode.FORMAT_QR_CODE;
            } else {
                i15 = 128;
            }
            i11 |= i15;
        }
        int i18 = i11 | 1797120;
        if ((12582912 & i10) == 0) {
            if (c0585q2.india(function12)) {
                i14 = 8388608;
            } else {
                i14 = 4194304;
            }
            i18 |= i14;
        }
        boolean z13 = true;
        if ((4793491 & i18) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q2.magenta(i18 & 1, z10)) {
            androidx.compose.runtime.as asVar = C0580l.alpha;
            Object jade = c0585q2.jade();
            if (jade == asVar) {
                jade = new kd.l(11);
                c0585q2.f(jade);
            }
            Function1 function14 = (Function1) jade;
            Object jade2 = c0585q2.jade();
            if (jade2 == asVar) {
                jade2 = C0564b.zulu(null);
                c0585q2.f(jade2);
            }
            androidx.compose.runtime.ax axVar = (androidx.compose.runtime.ax) jade2;
            if ((29360128 & i18) == 8388608) {
                z12 = true;
            } else {
                z12 = false;
            }
            Object jade3 = c0585q2.jade();
            if (z12 || jade3 == asVar) {
                jade3 = new r(0, axVar, function12);
                c0585q2.f(jade3);
            }
            T.s then = sVar.then(new SuspendPointerInputElement(function12, null, (PointerInputEventHandler) jade3, 6));
            if ((i18 & 3670016) != 1048576) {
                z13 = false;
            }
            Object jade4 = c0585q2.jade();
            if (z13 || jade4 == asVar) {
                jade4 = new Ec.a(1, axVar, function14);
                c0585q2.f(jade4);
            }
            c0585q = c0585q2;
            alpha(gVar, then, anVar, (Function1) jade4, 1, true, LottieConstants.IterateForever, 0, null, c0585q, (58254 & i18) | ((i18 << 6) & 458752) | ((i18 << 3) & 3670016), 1920);
            function13 = function14;
            i12 = 1;
            z11 = true;
            i13 = Integer.MAX_VALUE;
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
            z11 = z2;
            i12 = i4;
            i13 = i5;
            function13 = function1;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: n.q
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i10 | 1);
                    Function1 function15 = function13;
                    Function1 function16 = function12;
                    at.echo(D0.g.this, sVar, anVar, z11, i12, i13, function15, function16, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void foxtrot(C3344D c3344d, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        int i10;
        int i11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2080741862);
        if ((i4 & 6) == 0) {
            if (c0585q.india(c3344d)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i5 = i11 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.india(dVar)) {
                i10 = 32;
            } else {
                i10 = 16;
            }
            i5 |= i10;
        }
        if ((i5 & 19) != 18) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            c0585q.purple(-1881943916);
            boolean lima = c3344d.lima();
            T.s sVar = T.p.alpha;
            if (lima) {
                sVar = androidx.compose.foundation.text.contextmenu.modifier.a.charlie(androidx.compose.foundation.text.contextmenu.modifier.a.bravo(new y.as(c3344d, null)), c3344d.yankee, new y.at(c3344d, null), new y.au(c3344d, null), new C2149y(c3344d, 2));
            }
            AbstractC3072w.bravo(sVar, dVar, c0585q, i5 & 112);
            c0585q.quebec(false);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.aa(i4, 24, c3344d, dVar);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:180:0x03df, code lost:
    
        if (r3.hotel == r9) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:208:0x04ae, code lost:
    
        if (r16 > ((r4 != null ? r4.longValue() : 0) + 5000)) goto L244;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v101 */
    /* JADX WARN: Type inference failed for: r0v104, types: [T.s] */
    /* JADX WARN: Type inference failed for: r0v86 */
    /* JADX WARN: Type inference failed for: r0v87, types: [boolean] */
    /* JADX WARN: Type inference failed for: r11v19, types: [androidx.compose.runtime.q, androidx.compose.runtime.m] */
    /* JADX WARN: Type inference failed for: r11v22 */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [boolean] */
    /* JADX WARN: Type inference failed for: r15v17 */
    /* JADX WARN: Type inference failed for: r2v32, types: [T.s] */
    /* JADX WARN: Type inference failed for: r5v54 */
    /* JADX WARN: Type inference failed for: r5v55, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r6v23 */
    /* JADX WARN: Type inference failed for: r6v24, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v36 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void golf(final I0.aa aaVar, Function1 function1, T.s sVar, D0.an anVar, I0.aj ajVar, Function1 function12, InterfaceC1673j interfaceC1673j, a0.au auVar, boolean z2, int i4, int i5, final I0.l lVar, av avVar, final boolean z10, final boolean z11, P.d dVar, InterfaceC0581m interfaceC0581m, int i10, int i11) {
        int i12;
        int i13;
        C0585q c0585q;
        Object obj;
        int i14;
        androidx.compose.runtime.as asVar;
        int i15;
        D0.g gVar;
        D0.am amVar;
        I0.ah ahVar;
        I0.t tVar;
        Y.s sVar2;
        C3227e c3227e;
        Q0.d dVar2;
        H0.j jVar;
        Y.i iVar;
        E0 e02;
        I0.ab abVar;
        D0.an anVar2;
        boolean z12;
        C0585q c0585q2;
        boolean z13;
        int i16;
        int i17;
        I0.aa aaVar2;
        I0.aa alpha2;
        C3379s c3379s;
        boolean z14;
        Object obj2;
        int i18;
        int i19;
        int i20;
        int i21;
        T.p pVar;
        c0 c0Var;
        androidx.compose.runtime.as asVar2;
        boolean z15;
        final C3344D c3344d;
        ax axVar;
        I0.l lVar2;
        C1990b c1990b;
        vf.ab abVar2;
        I0.t tVar2;
        I0.aa aaVar3;
        Object c2150z;
        final ax axVar2;
        Y.s sVar3;
        T.s sVar4;
        InterfaceC1673j interfaceC1673j2;
        androidx.compose.runtime.ax axVar3;
        I0.ab abVar3;
        final I0.t tVar3;
        int i22;
        int i23;
        E0 e03;
        int i24;
        Object obj3;
        int i25;
        ax axVar4;
        I0.l lVar3;
        ?? r02;
        boolean hotel;
        boolean india;
        Object obj4;
        int i26;
        ?? r15;
        String str;
        C0585q c0585q3 = (C0585q) interfaceC0581m;
        c0585q3.silver(31062401);
        if ((i10 & 6) == 0) {
            i12 = i10 | (c0585q3.golf(aaVar) ? 4 : 2);
        } else {
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            i12 |= c0585q3.india(function1) ? 32 : 16;
        }
        if ((i10 & 384) == 0) {
            i12 |= c0585q3.golf(sVar) ? 256 : 128;
        }
        int i27 = i10 & 3072;
        int i28 = Barcode.FORMAT_UPC_E;
        if (i27 == 0) {
            i12 |= c0585q3.golf(anVar) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i12 |= c0585q3.golf(ajVar) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i10 & 196608) == 0) {
            i12 |= c0585q3.india(function12) ? 131072 : 65536;
        }
        if ((i10 & 1572864) == 0) {
            i12 |= c0585q3.golf(interfaceC1673j) ? 1048576 : 524288;
        }
        if ((i10 & 12582912) == 0) {
            i12 |= c0585q3.golf(auVar) ? 8388608 : 4194304;
        }
        if ((i10 & 100663296) == 0) {
            i12 |= c0585q3.hotel(z2) ? 67108864 : 33554432;
        }
        if ((i10 & 805306368) == 0) {
            i12 |= c0585q3.echo(i4) ? 536870912 : 268435456;
        }
        if ((i11 & 6) == 0) {
            i13 = i11 | (c0585q3.echo(i5) ? 4 : 2);
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            i13 |= c0585q3.golf(lVar) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i13 |= c0585q3.golf(avVar) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            if (c0585q3.hotel(z10)) {
                i28 = 2048;
            }
            i13 |= i28;
        }
        if ((i11 & 24576) == 0) {
            i13 |= c0585q3.hotel(z11) ? Http2.INITIAL_MAX_FRAME_SIZE : 8192;
        }
        if ((i11 & 196608) == 0) {
            i13 |= c0585q3.india(dVar) ? 131072 : 65536;
        }
        int i29 = i13 | 1572864;
        if (c0585q3.magenta(i12 & 1, ((i12 & 306783379) == 306783378 && (599187 & i29) == 599186) ? false : true)) {
            c0585q3.orange();
            if ((i10 & 1) != 0 && !c0585q3.beige()) {
                c0585q3.ochre();
            }
            c0585q3.romeo();
            Object jade = c0585q3.jade();
            androidx.compose.runtime.as asVar3 = C0580l.alpha;
            Object obj5 = jade;
            if (jade == asVar3) {
                Y.s sVar5 = new Y.s();
                c0585q3.f(sVar5);
                obj5 = sVar5;
            }
            Y.s sVar6 = (Y.s) obj5;
            Object jade2 = c0585q3.jade();
            if (jade2 == asVar3) {
                w.s sVar7 = w.t.alpha;
                jade2 = new Object();
                c0585q3.f(jade2);
            }
            C3227e c3227e2 = (C3227e) jade2;
            Object jade3 = c0585q3.jade();
            Object obj6 = jade3;
            if (jade3 == asVar3) {
                I0.ab abVar4 = new I0.ab(c3227e2);
                c0585q3.f(abVar4);
                obj6 = abVar4;
            }
            I0.ab abVar5 = (I0.ab) obj6;
            Q0.d dVar3 = (Q0.d) c0585q3.kilo(AbstractC2901T.hotel);
            H0.j jVar2 = (H0.j) c0585q3.kilo(AbstractC2901T.kilo);
            long j5 = ((C3354N) c0585q3.kilo(AbstractC3355O.alpha)).bravo;
            Y.i iVar2 = (Y.i) c0585q3.kilo(AbstractC2901T.india);
            E0 e04 = (E0) c0585q3.kilo(AbstractC2901T.tango);
            InterfaceC2937r0 interfaceC2937r0 = (InterfaceC2937r0) c0585q3.kilo(AbstractC2901T.papa);
            d.K k6 = (i4 == 1 && !z2 && lVar.alpha) ? d.K.purple : d.K.alpha;
            c0585q3.purple(-213743954);
            Object[] objArr = {k6};
            J2.l lVar4 = c0.golf;
            boolean echo = c0585q3.echo(k6.ordinal());
            Object jade4 = c0585q3.jade();
            if (echo || jade4 == asVar3) {
                kotlin.collections.n nVar = new kotlin.collections.n(5, k6);
                c0585q3.f(nVar);
                obj = nVar;
            } else {
                obj = jade4;
            }
            c0 c0Var2 = (c0) R.l.charlie(objArr, lVar4, (Function0) obj, c0585q3, 0);
            c0585q3.quebec(false);
            if (((d.K) ((t0) c0Var2.foxtrot).getValue()) != k6) {
                if (k6 == d.K.alpha) {
                    str = "only single-line, non-wrap text fields can scroll horizontally";
                } else {
                    str = "single-line, non-wrap text fields can only scroll horizontally";
                }
                throw new IllegalArgumentException("Mismatching scroller orientation; ".concat(str));
            }
            int i30 = i12 & 14;
            boolean z16 = ((i12 & 57344) == 16384) | (i30 == 4);
            Object jade5 = c0585q3.jade();
            D0.am amVar2 = aaVar.charlie;
            D0.g gVar2 = aaVar.alpha;
            if (z16 || jade5 == asVar3) {
                I0.ah alpha3 = k0.alpha(ajVar, gVar2);
                if (amVar2 != null) {
                    I0.t tVar4 = alpha3.bravo;
                    int i31 = D0.am.charlie;
                    i14 = i29;
                    long j6 = amVar2.alpha;
                    int originalToTransformed = tVar4.originalToTransformed((int) (j6 >> 32));
                    int originalToTransformed2 = tVar4.originalToTransformed((int) (j6 & 4294967295L));
                    int min = Math.min(originalToTransformed, originalToTransformed2);
                    int max = Math.max(originalToTransformed, originalToTransformed2);
                    D0.d dVar4 = new D0.d(alpha3.alpha);
                    dVar4.red.add(new D0.c(new D0.af(0L, 0L, (H0.v) null, (H0.r) null, (H0.s) null, (H0.k) null, (String) null, 0L, (O0.a) null, (O0.p) null, (K0.b) null, 0L, O0.l.charlie, (a0.ar) null, 61439), min, max, null, 8));
                    jade5 = new I0.ah(dVar4.foxtrot(), tVar4);
                } else {
                    i14 = i29;
                    jade5 = alpha3;
                }
                c0585q3.f(jade5);
            } else {
                i14 = i29;
            }
            I0.ah ahVar2 = (I0.ah) jade5;
            D0.g gVar3 = ahVar2.alpha;
            I0.t tVar5 = ahVar2.bravo;
            androidx.compose.runtime.Q azure = c0585q3.azure();
            if (azure != null) {
                azure.bravo |= 1;
                boolean golf = c0585q3.golf(interfaceC2937r0);
                Object jade6 = c0585q3.jade();
                if (golf || jade6 == asVar3) {
                    asVar = asVar3;
                    i15 = i30;
                    gVar = gVar3;
                    amVar = amVar2;
                    ahVar = ahVar2;
                    tVar = tVar5;
                    sVar2 = sVar6;
                    c3227e = c3227e2;
                    dVar2 = dVar3;
                    jVar = jVar2;
                    iVar = iVar2;
                    e02 = e04;
                    abVar = abVar5;
                    C0585q c0585q4 = c0585q3;
                    anVar2 = anVar;
                    z12 = z2;
                    ax axVar5 = new ax(new J(gVar, anVar2, z12, dVar2, jVar, CollectionsKt.emptyList()), azure, interfaceC2937r0);
                    c0585q4.f(axVar5);
                    jade6 = axVar5;
                    c0585q2 = c0585q4;
                } else {
                    asVar = asVar3;
                    i15 = i30;
                    gVar = gVar3;
                    amVar = amVar2;
                    ahVar = ahVar2;
                    tVar = tVar5;
                    sVar2 = sVar6;
                    c3227e = c3227e2;
                    dVar2 = dVar3;
                    jVar = jVar2;
                    iVar = iVar2;
                    e02 = e04;
                    abVar = abVar5;
                    anVar2 = anVar;
                    z12 = z2;
                    c0585q2 = c0585q3;
                }
                final ax axVar6 = (ax) jade6;
                axVar6.uniform = function1;
                axVar6.zulu = j5;
                au auVar2 = axVar6.romeo;
                auVar2.bravo = avVar;
                auVar2.charlie = iVar;
                axVar6.juliet = gVar2;
                J j7 = axVar6.alpha;
                List emptyList = CollectionsKt.emptyList();
                if (Intrinsics.areEqual(j7.alpha, gVar) && Intrinsics.areEqual(j7.bravo, anVar2) && j7.echo == z12) {
                    z13 = true;
                    z13 = true;
                    z13 = true;
                    z13 = true;
                    z13 = true;
                    z13 = true;
                    z13 = true;
                    if (j7.foxtrot == 1) {
                        if (j7.charlie == Integer.MAX_VALUE) {
                            if (j7.delta == 1) {
                                if (Intrinsics.areEqual(j7.golf, dVar2)) {
                                    if (Intrinsics.areEqual(j7.india, emptyList)) {
                                    }
                                }
                            }
                        }
                    }
                } else {
                    z13 = true;
                }
                j7 = new J(gVar, anVar2, z12, dVar2, jVar, emptyList);
                Q0.d dVar5 = dVar2;
                if (axVar6.alpha != j7) {
                    axVar6.papa = z13;
                }
                axVar6.alpha = j7;
                I0.ag agVar = axVar6.echo;
                I0.h hVar = axVar6.delta;
                D0.am amVar3 = amVar;
                boolean areEqual = Intrinsics.areEqual(amVar3, hVar.bravo.charlie());
                boolean areEqual2 = Intrinsics.areEqual(hVar.alpha.alpha.purple, gVar2.purple);
                long j10 = aaVar.bravo;
                if (!areEqual2) {
                    hVar.bravo = new I0.i(gVar2, j10);
                    i16 = z13 ? 1 : 0;
                    i17 = 0;
                } else {
                    I0.aa aaVar4 = hVar.alpha;
                    i16 = z13 ? 1 : 0;
                    if (D0.am.bravo(aaVar4.bravo, j10)) {
                        i17 = 0;
                    } else {
                        hVar.bravo.foxtrot(D0.am.foxtrot(j10), D0.am.echo(j10));
                        i17 = i16;
                    }
                    z13 = false;
                }
                if (amVar3 == null) {
                    I0.i iVar3 = hVar.bravo;
                    iVar3.silver = -1;
                    iVar3.teal = -1;
                } else {
                    long j11 = amVar3.alpha;
                    if (!D0.am.charlie(j11)) {
                        hVar.bravo.echo(D0.am.foxtrot(j11), D0.am.echo(j11));
                    }
                }
                if (z13 || (i17 == 0 && !areEqual)) {
                    I0.i iVar4 = hVar.bravo;
                    iVar4.silver = -1;
                    iVar4.teal = -1;
                    aaVar2 = aaVar;
                    alpha2 = I0.aa.alpha(aaVar2, null, 0L, 3);
                } else {
                    alpha2 = aaVar;
                    aaVar2 = alpha2;
                }
                I0.aa aaVar5 = hVar.alpha;
                hVar.alpha = alpha2;
                if (agVar != null) {
                    agVar.alpha(aaVar5, alpha2);
                }
                Object jade7 = c0585q2.jade();
                androidx.compose.runtime.as asVar4 = asVar;
                if (jade7 == asVar4) {
                    jade7 = new Object();
                    c0585q2.f(jade7);
                }
                j0 j0Var = (j0) jade7;
                long currentTimeMillis = System.currentTimeMillis();
                if (!j0Var.echo) {
                    Long l10 = j0Var.delta;
                }
                j0Var.delta = Long.valueOf(currentTimeMillis);
                j0Var.alpha(aaVar2);
                Object jade8 = c0585q2.jade();
                Object obj7 = jade8;
                if (jade8 == asVar4) {
                    vf.ab november = C0564b.november(c0585q2);
                    c0585q2.f(november);
                    obj7 = november;
                }
                final vf.ab abVar6 = (vf.ab) obj7;
                Object jade9 = c0585q2.jade();
                Object obj8 = jade9;
                if (jade9 == asVar4) {
                    C1990b c1990b2 = new C1990b();
                    c0585q2.f(c1990b2);
                    obj8 = c1990b2;
                }
                final C1990b c1990b3 = (C1990b) obj8;
                Object jade10 = c0585q2.jade();
                Object obj9 = jade10;
                if (jade10 == asVar4) {
                    C3344D c3344d2 = new C3344D(j0Var);
                    c0585q2.f(c3344d2);
                    obj9 = c3344d2;
                }
                final C3344D c3344d3 = (C3344D) obj9;
                final I0.t tVar6 = tVar;
                c3344d3.bravo = tVar6;
                c3344d3.foxtrot = ajVar;
                c3344d3.charlie = axVar6.victor;
                c3344d3.delta = axVar6;
                ((t0) c3344d3.echo).setValue(aaVar2);
                c3344d3.whiskey = new D0.am(j10);
                c3344d3.hotel = (InterfaceC2897O) c0585q2.kilo(AbstractC2901T.foxtrot);
                c3344d3.india = abVar6;
                c3344d3.kilo = (InterfaceC1878a) c0585q2.kilo(AbstractC2901T.lima);
                Y.s sVar8 = sVar2;
                c3344d3.lima = sVar8;
                boolean z17 = !z11;
                ((t0) c3344d3.mike).setValue(Boolean.valueOf(z17));
                ((t0) c3344d3.november).setValue(Boolean.valueOf(z10));
                c0585q2.purple(1966776937);
                EnumC3381u enumC3381u = EnumC3381u.alpha;
                K0.b bVar = anVar.alpha.kilo;
                androidx.compose.runtime.E0 e05 = AbstractC3380t.alpha;
                EnumC3381u enumC3381u2 = EnumC3381u.alpha;
                c0585q2.purple(430530635);
                if (Build.VERSION.SDK_INT < 28) {
                    c0585q2.quebec(false);
                    z14 = false;
                    c3379s = null;
                } else {
                    Context context = (Context) c0585q2.kilo(AndroidCompositionLocals_androidKt.bravo);
                    Nd.h hVar2 = (Nd.h) c0585q2.kilo(AbstractC3380t.alpha);
                    boolean golf2 = c0585q2.golf(hVar2) | c0585q2.golf(context) | c0585q2.golf(bVar);
                    Object jade11 = c0585q2.jade();
                    Object obj10 = jade11;
                    if (golf2 || jade11 == asVar4) {
                        AbstractC3380t.bravo.getClass();
                        C3379s c3379s2 = new C3379s(hVar2, context, enumC3381u2, bVar);
                        c0585q2.f(c3379s2);
                        obj10 = c3379s2;
                    }
                    c3379s = (C3379s) obj10;
                    z14 = false;
                    c0585q2.quebec(false);
                }
                c3344d3.juliet = c3379s;
                c0585q2.quebec(z14);
                T.p pVar2 = T.p.alpha;
                int i32 = i14;
                int i33 = i32 & 7168;
                int i34 = i32 & 57344;
                final I0.ab abVar7 = abVar;
                int i35 = i15;
                Y.i iVar5 = iVar;
                int i36 = (i32 & 112) ^ 48;
                int i37 = (i34 == 16384 ? i16 : 0) | (c0585q2.india(axVar6) ? 1 : 0) | (i33 == 2048 ? i16 : 0) | (c0585q2.india(abVar7) ? 1 : 0) | (i35 == 4 ? i16 : 0) | (((i36 <= 32 || !c0585q2.golf(lVar)) && (i32 & 48) != 32) ? 0 : i16) | (c0585q2.india(tVar6) ? 1 : 0) | (c0585q2.india(abVar6) ? 1 : 0) | (c0585q2.india(c1990b3) ? 1 : 0) | (c0585q2.india(c3344d3) ? 1 : 0);
                Object jade12 = c0585q2.jade();
                if (i37 != 0 || jade12 == asVar4) {
                    i18 = i32;
                    i19 = i33;
                    i20 = i34;
                    i21 = i35;
                    pVar = pVar2;
                    c0Var = c0Var2;
                    asVar2 = asVar4;
                    obj2 = new Function1() { // from class: n.u
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj11) {
                            e0 delta;
                            ax axVar7 = ax.this;
                            Y.x xVar = (Y.x) ((Y.v) obj11);
                            if (axVar7.bravo() == xVar.bravo()) {
                                return Unit.INSTANCE;
                            }
                            ((t0) axVar7.foxtrot).setValue(Boolean.valueOf(xVar.bravo()));
                            boolean bravo2 = axVar7.bravo();
                            I0.aa aaVar6 = aaVar;
                            I0.t tVar7 = tVar6;
                            if (bravo2 && z10 && !z11) {
                                at.whiskey(abVar7, axVar7, aaVar6, lVar, tVar7);
                            } else {
                                at.papa(axVar7);
                            }
                            if (xVar.bravo() && (delta = axVar7.delta()) != null) {
                                vf.ad.zulu(abVar6, null, null, new ae(c1990b3, aaVar6, axVar7, delta, tVar7, null), 3);
                            }
                            if (!xVar.bravo()) {
                                c3344d3.india(null);
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    z15 = z10;
                    abVar7 = abVar7;
                    c3344d = c3344d3;
                    axVar = axVar6;
                    lVar2 = lVar;
                    c1990b = c1990b3;
                    abVar2 = abVar6;
                    tVar2 = tVar6;
                    aaVar3 = aaVar;
                    c0585q2.f(obj2);
                } else {
                    i18 = i32;
                    i19 = i33;
                    i20 = i34;
                    i21 = i35;
                    obj2 = jade12;
                    pVar = pVar2;
                    c0Var = c0Var2;
                    asVar2 = asVar4;
                    abVar2 = abVar6;
                    c1990b = c1990b3;
                    tVar2 = tVar6;
                    c3344d = c3344d3;
                    aaVar3 = aaVar;
                    z15 = z10;
                    axVar = axVar6;
                    lVar2 = lVar;
                }
                T.s golf3 = androidx.compose.foundation.a.golf(androidx.compose.ui.focus.a.bravo(androidx.compose.ui.focus.a.alpha(pVar, sVar8), (Function1) obj2), z15, interfaceC1673j);
                androidx.compose.runtime.ax black = C0564b.black(Boolean.valueOf((boolean) ((!z15 || z11) ? 0 : i16)), c0585q2);
                Unit unit = Unit.INSTANCE;
                int i38 = (c0585q2.golf(black) ? 1 : 0) | (c0585q2.india(axVar) ? 1 : 0) | (c0585q2.india(abVar7) ? 1 : 0) | (c0585q2.india(c3344d) ? 1 : 0) | (((i36 <= 32 || !c0585q2.golf(lVar2)) && (i18 & 48) != 32) ? 0 : i16);
                Object jade13 = c0585q2.jade();
                if (i38 != 0 || jade13 == asVar2) {
                    I0.ab abVar8 = abVar7;
                    axVar2 = axVar;
                    sVar3 = sVar8;
                    sVar4 = golf3;
                    interfaceC1673j2 = interfaceC1673j;
                    c2150z = new C2150z(axVar2, black, abVar8, c3344d, lVar, null);
                    axVar3 = black;
                    abVar7 = abVar8;
                    c0585q2.f(c2150z);
                } else {
                    c2150z = jade13;
                    axVar2 = axVar;
                    axVar3 = black;
                    sVar3 = sVar8;
                    sVar4 = golf3;
                    interfaceC1673j2 = interfaceC1673j;
                }
                C0564b.foxtrot((Xd.l) c2150z, c0585q2, unit);
                boolean india2 = c0585q2.india(axVar2);
                Object jade14 = c0585q2.jade();
                Object obj11 = jade14;
                if (india2 || jade14 == asVar2) {
                    C2146v c2146v = new C2146v(axVar2, 0);
                    c0585q2.f(c2146v);
                    obj11 = c2146v;
                }
                C0703s c0703s = new C0703s(5, (Function1) obj11);
                m0.k kVar = m0.ab.alpha;
                T.s suspendPointerInputElement = new SuspendPointerInputElement(8675309, null, c0703s, 6);
                int i39 = i19;
                int i40 = (c0585q2.india(axVar2) ? 1 : 0) | (i20 == 16384 ? i16 : 0) | (i39 == 2048 ? i16 : 0) | (c0585q2.india(tVar2) ? 1 : 0) | (c0585q2.india(c3344d) ? 1 : 0);
                Object jade15 = c0585q2.jade();
                if (i40 != 0 || jade15 == asVar2) {
                    abVar3 = abVar7;
                    tVar3 = tVar2;
                    final Y.s sVar9 = sVar3;
                    i22 = i39;
                    final C3344D c3344d4 = c3344d;
                    Function1 function13 = new Function1() { // from class: n.w
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj12) {
                            InterfaceC2937r0 interfaceC2937r02;
                            Z.b bVar2 = (Z.b) obj12;
                            ax axVar7 = ax.this;
                            if (!axVar7.bravo()) {
                                Y.s.bravo(sVar9);
                            } else if (!z11 && (interfaceC2937r02 = axVar7.charlie) != null) {
                                ((t0.U) interfaceC2937r02).bravo();
                            }
                            if (axVar7.bravo() && z10) {
                                if (axVar7.alpha() != am.purple) {
                                    e0 delta = axVar7.delta();
                                    if (delta != null) {
                                        int transformedToOriginal = tVar3.transformedToOriginal(delta.bravo(bVar2.alpha, true));
                                        axVar7.victor.invoke(I0.aa.alpha(axVar7.delta.alpha, null, D0.ae.bravo(transformedToOriginal, transformedToOriginal), 5));
                                        if (axVar7.alpha.alpha.purple.length() > 0) {
                                            ((t0) axVar7.kilo).setValue(am.red);
                                        }
                                    }
                                } else {
                                    c3344d4.india(bVar2);
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    c3344d = c3344d4;
                    c0585q2.f(function13);
                    jade15 = function13;
                } else {
                    abVar3 = abVar7;
                    tVar3 = tVar2;
                    i22 = i39;
                }
                Function1 function14 = (Function1) jade15;
                if (z10) {
                    suspendPointerInputElement = T.a.alpha(suspendPointerInputElement, AbstractC2911e0.alpha, new N2.ad(3, function14, interfaceC1673j2));
                }
                C1290a1 c1290a1 = c3344d.amber;
                y.ay ayVar = c3344d.zulu;
                vf.ab abVar9 = abVar2;
                T.s then = suspendPointerInputElement.then(new SuspendPointerInputElement(c1290a1, ayVar, new r(2, c1290a1, ayVar), 4));
                m0.o.alpha.getClass();
                T.s foxtrot = m0.q.foxtrot(then, m0.q.bravo);
                int i41 = i21;
                int i42 = (c0585q2.india(axVar2) ? 1 : 0) | (i41 == 4 ? i16 : 0) | (c0585q2.india(tVar3) ? 1 : 0);
                Object jade16 = c0585q2.jade();
                Object obj12 = jade16;
                if (i42 != 0 || jade16 == asVar2) {
                    Cb.ac acVar = new Cb.ac(axVar2, aaVar3, tVar3, 21);
                    c0585q2.f(acVar);
                    obj12 = acVar;
                }
                T.s alpha4 = androidx.compose.ui.draw.a.alpha(pVar, (Function1) obj12);
                final E0 e06 = e02;
                int i43 = (c0585q2.india(axVar2) ? 1 : 0) | (i22 == 2048 ? i16 : 0) | (c0585q2.golf(e06) ? 1 : 0) | (c0585q2.india(c3344d) ? 1 : 0) | (i41 == 4 ? i16 : 0) | (c0585q2.india(tVar3) ? 1 : 0);
                Object jade17 = c0585q2.jade();
                if (i43 != 0 || jade17 == asVar2) {
                    i23 = i41;
                    final I0.aa aaVar6 = aaVar3;
                    Function1 function15 = new Function1() { // from class: n.x
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj13) {
                            I0.ag agVar2;
                            q0.z zVar;
                            q0.z zVar2;
                            q0.z zVar3 = (q0.z) obj13;
                            ax axVar7 = ax.this;
                            axVar7.hotel = zVar3;
                            e0 delta = axVar7.delta();
                            if (delta != null) {
                                delta.bravo = zVar3;
                            }
                            if (z10) {
                                am alpha5 = axVar7.alpha();
                                am amVar4 = am.purple;
                                C3344D c3344d5 = c3344d;
                                I0.aa aaVar7 = aaVar6;
                                androidx.compose.runtime.ax axVar8 = axVar7.oscar;
                                if (alpha5 == amVar4) {
                                    if (((Boolean) ((t0) axVar7.lima).getValue()).booleanValue() && ((Boolean) ((t0) ((C2917h0) e06).alpha).getValue()).booleanValue()) {
                                        c3344d5.sierra();
                                    } else {
                                        c3344d5.papa();
                                    }
                                    ((t0) axVar7.mike).setValue(Boolean.valueOf(AbstractC3066u3.golf(c3344d5, true)));
                                    ((t0) axVar7.november).setValue(Boolean.valueOf(AbstractC3066u3.golf(c3344d5, false)));
                                    ((t0) axVar8).setValue(Boolean.valueOf(D0.am.charlie(aaVar7.bravo)));
                                } else if (axVar7.alpha() == am.red) {
                                    ((t0) axVar8).setValue(Boolean.valueOf(AbstractC3066u3.golf(c3344d5, true)));
                                }
                                I0.t tVar7 = tVar3;
                                at.victor(axVar7, aaVar7, tVar7);
                                e0 delta2 = axVar7.delta();
                                if (delta2 != null && (agVar2 = axVar7.echo) != null && axVar7.bravo() && (zVar = delta2.bravo) != null && zVar.india() && (zVar2 = delta2.charlie) != null) {
                                    Lb.W w4 = new Lb.W(7, zVar);
                                    Z.c bravo2 = AbstractC3056s3.bravo(zVar);
                                    Z.c sierra = zVar.sierra(zVar2, false);
                                    if (Intrinsics.areEqual((I0.ag) agVar2.alpha.bravo.get(), agVar2)) {
                                        agVar2.bravo.charlie(aaVar7, tVar7, delta2.alpha, w4, bravo2, sierra);
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    e03 = e06;
                    c0585q2.f(function15);
                    jade17 = function15;
                } else {
                    i23 = i41;
                    e03 = e06;
                }
                T.s delta = androidx.compose.ui.layout.a.delta(pVar, (Function1) jade17);
                I0.t tVar7 = tVar3;
                ax axVar7 = axVar2;
                I0.ab abVar10 = abVar3;
                C3344D c3344d5 = c3344d;
                int i44 = i23;
                CoreTextFieldSemanticsModifier coreTextFieldSemanticsModifier = new CoreTextFieldSemanticsModifier(ahVar, aaVar, axVar7, z11, z10, ajVar instanceof I0.u, tVar7, c3344d5, lVar, sVar3);
                T.p alpha5 = ((!z10 || z11 || !((Boolean) ((t0) ((C2917h0) e03).alpha).getValue()).booleanValue() || !D0.am.charlie(((D0.am) ((t0) axVar7.amber).getValue()).alpha) || !D0.am.charlie(((D0.am) ((t0) axVar7.azure).getValue()).alpha)) ? 0 : i16) != 0 ? T.a.alpha(pVar, AbstractC2911e0.alpha, new M(auVar, axVar7, aaVar, tVar7)) : pVar;
                boolean india3 = c0585q2.india(c3344d5);
                Object jade18 = c0585q2.jade();
                if (india3 || jade18 == asVar2) {
                    i24 = 0;
                    C2149y c2149y = new C2149y(c3344d5, i24);
                    c0585q2.f(c2149y);
                    obj3 = c2149y;
                } else {
                    i24 = 0;
                    obj3 = jade18;
                }
                C0564b.delta(c3344d5, (Function1) obj3, c0585q2);
                int i45 = (c0585q2.india(axVar7) ? 1 : 0) | (c0585q2.india(abVar10) ? 1 : 0) | (i44 == 4 ? i16 : i24) | (((i36 <= 32 || !c0585q2.golf(lVar)) && (i18 & 48) != 32) ? i24 : i16);
                Object jade19 = c0585q2.jade();
                if (i45 != 0 || jade19 == asVar2) {
                    i25 = i24;
                    axVar4 = axVar7;
                    X9.e eVar = new X9.e(axVar4, abVar10, aaVar, lVar, 11);
                    lVar3 = lVar;
                    c0585q2.f(eVar);
                    jade19 = eVar;
                } else {
                    i25 = i24;
                    lVar3 = lVar;
                    axVar4 = axVar7;
                }
                C0564b.delta(lVar3, (Function1) jade19, c0585q2);
                T t5 = new T(axVar4, c3344d5, aaVar, z17, i4 == i16 ? 1 : i25, tVar7, j0Var, axVar4.victor, lVar3.echo);
                C2932p c2932p = AbstractC2911e0.alpha;
                T.n nVar2 = new T.n(c2932p, t5);
                int i46 = lVar3.delta;
                if (i46 != 7 && i46 != 8) {
                    r02 = 1;
                    boolean booleanValue = ((Boolean) axVar3.getValue()).booleanValue();
                    C3227e c3227e3 = c3227e;
                    hotel = c0585q2.hotel(r02) | c0585q2.india(c3227e3);
                    Object jade20 = c0585q2.jade();
                    Object obj13 = jade20;
                    if (!hotel || jade20 == asVar2) {
                        C2008a c2008a = new C2008a(r02, c3227e3);
                        c0585q2.f(c2008a);
                        obj13 = c2008a;
                    }
                    T.s alpha6 = androidx.compose.foundation.text.handwriting.a.alpha(booleanValue, r02, (Function0) obj13);
                    long j12 = ((C0366t) c0585q2.kilo(AbstractC2132g.alpha)).alpha;
                    india = c0585q2.india(axVar4) | c0585q2.foxtrot(j12);
                    Object jade21 = c0585q2.jade();
                    if (!india || jade21 == asVar2) {
                        Jb.V v4 = new Jb.V(j12, 1, axVar4);
                        c0585q2.f(v4);
                        obj4 = v4;
                    } else {
                        obj4 = jade21;
                    }
                    c0 c0Var3 = c0Var;
                    T.s then2 = T.a.alpha(androidx.compose.ui.input.key.a.bravo(androidx.compose.ui.input.key.a.bravo(androidx.compose.foundation.text.input.internal.a.alpha(sVar.then(androidx.compose.ui.draw.a.alpha(pVar, (Function1) obj4)), c3227e3, axVar4, c3344d5).then(alpha6).then(sVar4), new Cb.l(13, iVar5, axVar4)), new Cb.l(12, axVar4, c3344d5)).then(nVar2), c2932p, new b0(c0Var3, z10, interfaceC1673j)).then(foxtrot).then(coreTextFieldSemanticsModifier);
                    i26 = 6;
                    T.s alpha7 = androidx.compose.foundation.text.contextmenu.modifier.a.alpha(androidx.compose.ui.layout.a.delta(then2, new Lb.W(i26, axVar4)), new C2015h(8, c3344d5, abVar9));
                    r15 = (!z10 && axVar4.bravo() && ((Boolean) ((t0) axVar4.quebec).getValue()).booleanValue() && ((Boolean) ((t0) ((C2917h0) e03).alpha).getValue()).booleanValue()) ? 1 : i25;
                    if (r15 != 0 && b.L.alpha()) {
                        pVar = T.a.alpha(pVar, c2932p, new androidx.compose.foundation.layout.c0(i26, c3344d5));
                    }
                    c0585q = c0585q2;
                    hotel(alpha7, c3344d5, P.e.echo(-814563849, new ad(dVar, axVar4, anVar, i5, i4, c0Var3, aaVar, ajVar, alpha5, alpha4, delta, pVar, c1990b, c3344d5, r15, z11, function12, tVar7, dVar5), c0585q), c0585q, 384);
                }
                r02 = i25;
                boolean booleanValue2 = ((Boolean) axVar3.getValue()).booleanValue();
                C3227e c3227e32 = c3227e;
                hotel = c0585q2.hotel(r02) | c0585q2.india(c3227e32);
                Object jade202 = c0585q2.jade();
                Object obj132 = jade202;
                if (!hotel) {
                }
                C2008a c2008a2 = new C2008a(r02, c3227e32);
                c0585q2.f(c2008a2);
                obj132 = c2008a2;
                T.s alpha62 = androidx.compose.foundation.text.handwriting.a.alpha(booleanValue2, r02, (Function0) obj132);
                long j122 = ((C0366t) c0585q2.kilo(AbstractC2132g.alpha)).alpha;
                india = c0585q2.india(axVar4) | c0585q2.foxtrot(j122);
                Object jade212 = c0585q2.jade();
                if (india) {
                }
                Jb.V v42 = new Jb.V(j122, 1, axVar4);
                c0585q2.f(v42);
                obj4 = v42;
                c0 c0Var32 = c0Var;
                T.s then22 = T.a.alpha(androidx.compose.ui.input.key.a.bravo(androidx.compose.ui.input.key.a.bravo(androidx.compose.foundation.text.input.internal.a.alpha(sVar.then(androidx.compose.ui.draw.a.alpha(pVar, (Function1) obj4)), c3227e32, axVar4, c3344d5).then(alpha62).then(sVar4), new Cb.l(13, iVar5, axVar4)), new Cb.l(12, axVar4, c3344d5)).then(nVar2), c2932p, new b0(c0Var32, z10, interfaceC1673j)).then(foxtrot).then(coreTextFieldSemanticsModifier);
                i26 = 6;
                T.s alpha72 = androidx.compose.foundation.text.contextmenu.modifier.a.alpha(androidx.compose.ui.layout.a.delta(then22, new Lb.W(i26, axVar4)), new C2015h(8, c3344d5, abVar9));
                if (!z10) {
                }
                if (r15 != 0) {
                    pVar = T.a.alpha(pVar, c2932p, new androidx.compose.foundation.layout.c0(i26, c3344d5));
                }
                c0585q = c0585q2;
                hotel(alpha72, c3344d5, P.e.echo(-814563849, new ad(dVar, axVar4, anVar, i5, i4, c0Var32, aaVar, ajVar, alpha5, alpha4, delta, pVar, c1990b, c3344d5, r15, z11, function12, tVar7, dVar5), c0585q), c0585q, 384);
            } else {
                throw new IllegalStateException("no recompose scope found");
            }
        } else {
            c0585q = c0585q3;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2144t(aaVar, function1, sVar, anVar, ajVar, function12, interfaceC1673j, auVar, z2, i4, i5, lVar, avVar, z10, z11, dVar, i10, i11);
        }
    }

    public static final void hotel(T.s sVar, C3344D c3344d, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2036174316);
        if (c0585q.golf(sVar)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.india(c3344d)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            q0.ap delta = AbstractC0547m.delta(T.d.alpha, true);
            long j5 = c0585q.magenta;
            int i13 = (int) ((j5 >>> 32) ^ j5);
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(sVar, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, delta);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i13))) {
                ao.ad.blue(i13, c0585q, i13, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            foxtrot(c3344d, dVar, c0585q, (i12 >> 3) & 126);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.n(sVar, c3344d, dVar, i4, 15);
        }
    }

    public static final void india(final T.s sVar, final D0.g gVar, final Function1 function1, final boolean z2, final Map map, final D0.an anVar, final int i4, final boolean z10, final int i5, final int i10, final H0.j jVar, final InterfaceC0368v interfaceC0368v, final Function1 function12, InterfaceC0581m interfaceC0581m, final int i11, final int i12) {
        int i13;
        int i14;
        boolean z11;
        int i15;
        h0 h0Var;
        boolean z12;
        Function0 function0;
        h0 h0Var2;
        Pair pair;
        Function1 function13;
        androidx.compose.runtime.ax axVar;
        Function1 function14;
        boolean z13;
        Object eVar;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean india;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-2118572703);
        if ((i11 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i27 = 4;
            } else {
                i27 = 2;
            }
            i13 = i27 | i11;
        } else {
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if (c0585q.golf(gVar)) {
                i26 = 32;
            } else {
                i26 = 16;
            }
            i13 |= i26;
        }
        int i28 = 128;
        int i29 = 1;
        if ((i11 & 384) == 0) {
            if (c0585q.india(function1)) {
                i25 = Barcode.FORMAT_QR_CODE;
            } else {
                i25 = 128;
            }
            i13 |= i25;
        }
        int i30 = i11 & 3072;
        int i31 = Barcode.FORMAT_UPC_E;
        if (i30 == 0) {
            if (c0585q.hotel(z2)) {
                i24 = 2048;
            } else {
                i24 = 1024;
            }
            i13 |= i24;
        }
        int i32 = 8192;
        if ((i11 & 24576) == 0) {
            if (c0585q.india(map)) {
                i23 = 16384;
            } else {
                i23 = 8192;
            }
            i13 |= i23;
        }
        if ((196608 & i11) == 0) {
            if (c0585q.golf(anVar)) {
                i22 = 131072;
            } else {
                i22 = 65536;
            }
            i13 |= i22;
        }
        if ((i11 & 1572864) == 0) {
            if (c0585q.echo(i4)) {
                i21 = 1048576;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        if ((i11 & 12582912) == 0) {
            if (c0585q.hotel(z10)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i13 |= i20;
        }
        if ((i11 & 100663296) == 0) {
            if (c0585q.echo(i5)) {
                i19 = 67108864;
            } else {
                i19 = 33554432;
            }
            i13 |= i19;
        }
        if ((i11 & 805306368) == 0) {
            if (c0585q.echo(i10)) {
                i18 = 536870912;
            } else {
                i18 = 268435456;
            }
            i13 |= i18;
        }
        if ((i12 & 6) == 0) {
            if (c0585q.india(jVar)) {
                i17 = 4;
            } else {
                i17 = 2;
            }
            i14 = i12 | i17;
        } else {
            i14 = i12;
        }
        if ((i12 & 48) == 0) {
            if (c0585q.india(null)) {
                i16 = 32;
            } else {
                i16 = 16;
            }
            i14 |= i16;
        }
        if ((i12 & 384) == 0) {
            if (c0585q.india(interfaceC0368v)) {
                i28 = Barcode.FORMAT_QR_CODE;
            }
            i14 |= i28;
        }
        if ((i12 & 3072) == 0) {
            if (c0585q.india(function12)) {
                i31 = 2048;
            }
            i14 |= i31;
        }
        if ((i12 & 24576) == 0) {
            if ((32768 & i12) == 0) {
                india = c0585q.golf(null);
            } else {
                india = c0585q.india(null);
            }
            if (india) {
                i32 = 16384;
            }
            i14 |= i32;
        }
        int i33 = i14;
        int i34 = i13;
        if ((i34 & 306783379) == 306783378 && (i33 & 9363) == 9362) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (c0585q.magenta(i34 & 1, z11)) {
            boolean alpha2 = AbstractC2967a3.alpha(gVar);
            Object obj = C0580l.alpha;
            if (alpha2) {
                c0585q.purple(145661411);
                i15 = i33;
                if ((i34 & 112) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                Object jade = c0585q.jade();
                if (z16 || jade == obj) {
                    jade = new h0(gVar);
                    c0585q.f(jade);
                }
                h0Var = (h0) jade;
                c0585q.quebec(false);
            } else {
                i15 = i33;
                c0585q.purple(145727068);
                c0585q.quebec(false);
                h0Var = null;
            }
            if (AbstractC2967a3.alpha(gVar)) {
                c0585q.purple(145925283);
                if ((i34 & 112) == 32) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean golf = z15 | c0585q.golf(h0Var);
                Object jade2 = c0585q.jade();
                if (golf || jade2 == obj) {
                    jade2 = new Yb.F(23, h0Var, gVar);
                    c0585q.f(jade2);
                }
                function0 = (Function0) jade2;
                c0585q.quebec(false);
            } else {
                c0585q.purple(146022561);
                if ((i34 & 112) == 32) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                Object jade3 = c0585q.jade();
                if (z12 || jade3 == obj) {
                    jade3 = new kotlin.collections.n(4, gVar);
                    c0585q.f(jade3);
                }
                function0 = (Function0) jade3;
                c0585q.quebec(false);
            }
            Function0 function02 = function0;
            if (z2) {
                if (map != null) {
                    Pair pair2 = AbstractC2130e.alpha;
                    if (!map.isEmpty()) {
                        h0Var2 = h0Var;
                        List bravo2 = gVar.bravo(0, gVar.purple.length(), "androidx.compose.foundation.text.inlineContent");
                        ArrayList arrayList = new ArrayList();
                        ArrayList arrayList2 = new ArrayList();
                        int size = bravo2.size();
                        int i35 = 0;
                        while (i35 < size) {
                            int i36 = size;
                            if (map.get(((D0.e) bravo2.get(i35)).alpha) == null) {
                                i35++;
                                size = i36;
                            } else {
                                throw new ClassCastException();
                            }
                        }
                        pair = new Pair(arrayList, arrayList2);
                    }
                }
                h0Var2 = h0Var;
                pair = AbstractC2130e.alpha;
            } else {
                h0Var2 = h0Var;
                pair = new Pair(null, null);
            }
            List list = (List) pair.first;
            List list2 = (List) pair.second;
            if (z2) {
                c0585q.purple(146338668);
                Object jade4 = c0585q.jade();
                if (jade4 == obj) {
                    function13 = null;
                    jade4 = C0564b.zulu(null);
                    c0585q.f(jade4);
                } else {
                    function13 = null;
                }
                c0585q.quebec(false);
                axVar = (androidx.compose.runtime.ax) jade4;
            } else {
                function13 = null;
                c0585q.purple(146426428);
                c0585q.quebec(false);
                axVar = null;
            }
            if (z2) {
                c0585q.purple(146519677);
                boolean golf2 = c0585q.golf(axVar);
                Object jade5 = c0585q.jade();
                if (golf2 || jade5 == obj) {
                    jade5 = new Cb.i(axVar, 28);
                    c0585q.f(jade5);
                }
                c0585q.quebec(false);
                function14 = (Function1) jade5;
            } else {
                c0585q.purple(146591100);
                c0585q.quebec(false);
                function14 = function13;
            }
            int i37 = (i34 >> 3) & 14;
            androidx.compose.runtime.ax axVar2 = axVar;
            h0 h0Var3 = h0Var2;
            AbstractC2141p.alpha(gVar, anVar, jVar, list, c0585q, ((i15 << 6) & 896) | ((i34 >> 12) & 112) | i37);
            D0.g gVar2 = (D0.g) function02.invoke();
            boolean india2 = c0585q.india(h0Var3);
            if ((i34 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z17 = india2 | z13;
            Object jade6 = c0585q.jade();
            if (z17 || jade6 == obj) {
                jade6 = new C2140o(h0Var3, function1, 0);
                c0585q.f(jade6);
            }
            T.s xray = xray(sVar, gVar2, anVar, (Function1) jade6, i4, z10, i5, i10, jVar, list, function14, interfaceC0368v, function12);
            if (!z2) {
                c0585q.purple(147770775);
                boolean india3 = c0585q.india(h0Var3);
                Object jade7 = c0585q.jade();
                if (india3 || jade7 == obj) {
                    jade7 = new C2136k(h0Var3, i29);
                    c0585q.f(jade7);
                }
                eVar = new az((Function0) jade7);
                c0585q.quebec(false);
            } else {
                c0585q.purple(147947537);
                boolean india4 = c0585q.india(h0Var3);
                Object jade8 = c0585q.jade();
                if (india4 || jade8 == obj) {
                    jade8 = new C2136k(h0Var3, 0);
                    c0585q.f(jade8);
                }
                Function0 function03 = (Function0) jade8;
                boolean golf3 = c0585q.golf(axVar2);
                Object jade9 = c0585q.jade();
                if (golf3 || jade9 == obj) {
                    jade9 = new Cb.u(axVar2, 28);
                    c0585q.f(jade9);
                }
                eVar = new T0.e(2, function03, (Function0) jade9);
                c0585q.quebec(false);
            }
            long j5 = c0585q.magenta;
            int i38 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike = c0585q.mike();
            T.s charlie = T.a.charlie(xray, c0585q);
            InterfaceC2552l.maroon.getClass();
            Function0 function04 = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(function04);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, eVar);
            C0564b.blue(C2551k.echo, c0585q, mike);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i38))) {
                ao.ad.blue(i38, c0585q, i38, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            if (h0Var3 == null) {
                c0585q.purple(-433557001);
                z14 = false;
            } else {
                z14 = false;
                c0585q.purple(-291080374);
                h0Var3.alpha(c0585q, 0);
            }
            c0585q.quebec(z14);
            if (list2 == null) {
                c0585q.purple(-433506223);
            } else {
                c0585q.purple(-433506222);
                AbstractC2130e.alpha(gVar, list2, c0585q, i37);
            }
            c0585q.quebec(z14);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Xd.l() { // from class: n.l
                @Override // Xd.l
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int cyan = C0564b.cyan(i11 | 1);
                    int cyan2 = C0564b.cyan(i12);
                    InterfaceC0368v interfaceC0368v2 = interfaceC0368v;
                    Function1 function15 = function12;
                    at.india(T.s.this, gVar, function1, z2, map, anVar, i4, z10, i5, i10, jVar, interfaceC0368v2, function15, (InterfaceC0581m) obj2, cyan, cyan2);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void juliet(C3344D c3344d, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        boolean z10;
        e0 delta;
        boolean z11;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(626339208);
        if (c0585q.india(c3344d)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i11 = i5 | i4;
        if (c0585q.hotel(z2)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i12 = i11 | i10;
        if ((i12 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i12 & 1, z10)) {
            if (z2) {
                c0585q.purple(1529773841);
                ax axVar = c3344d.delta;
                D0.ak akVar = null;
                if (axVar != null && (delta = axVar.delta()) != null) {
                    D0.ak akVar2 = delta.alpha;
                    ax axVar2 = c3344d.delta;
                    if (axVar2 != null) {
                        z11 = axVar2.papa;
                    } else {
                        z11 = true;
                    }
                    if (!z11) {
                        akVar = akVar2;
                    }
                }
                if (akVar == null) {
                    c0585q.purple(1530097387);
                } else {
                    c0585q.purple(1530097388);
                    if (!D0.am.charlie(c3344d.oscar().bravo)) {
                        c0585q.purple(2109807302);
                        int originalToTransformed = c3344d.bravo.originalToTransformed((int) (c3344d.oscar().bravo >> 32));
                        int originalToTransformed2 = c3344d.bravo.originalToTransformed((int) (c3344d.oscar().bravo & 4294967295L));
                        O0.j alpha2 = akVar.alpha(originalToTransformed);
                        O0.j alpha3 = akVar.alpha(Math.max(originalToTransformed2 - 1, 0));
                        ax axVar3 = c3344d.delta;
                        if (axVar3 != null && ((Boolean) ((t0) axVar3.mike).getValue()).booleanValue()) {
                            c0585q.purple(2110225306);
                            AbstractC3066u3.alpha(true, alpha2, c3344d, c0585q, ((i12 << 6) & 896) | 6);
                            c0585q.quebec(false);
                        } else {
                            c0585q.purple(2110490542);
                            c0585q.quebec(false);
                        }
                        ax axVar4 = c3344d.delta;
                        if (axVar4 != null && ((Boolean) ((t0) axVar4.november).getValue()).booleanValue()) {
                            c0585q.purple(2110574459);
                            AbstractC3066u3.alpha(false, alpha3, c3344d, c0585q, ((i12 << 6) & 896) | 6);
                            c0585q.quebec(false);
                        } else {
                            c0585q.purple(2110838734);
                            c0585q.quebec(false);
                        }
                        c0585q.quebec(false);
                    } else {
                        c0585q.purple(2110860558);
                        c0585q.quebec(false);
                    }
                    ax axVar5 = c3344d.delta;
                    if (axVar5 != null) {
                        boolean areEqual = Intrinsics.areEqual(c3344d.uniform.alpha.purple, c3344d.oscar().alpha.purple);
                        androidx.compose.runtime.ax axVar6 = axVar5.lima;
                        if (!areEqual) {
                            ((t0) axVar6).setValue(Boolean.FALSE);
                        }
                        if (axVar5.bravo()) {
                            if (((Boolean) ((t0) axVar6).getValue()).booleanValue()) {
                                c3344d.sierra();
                            } else {
                                c3344d.papa();
                            }
                        }
                    }
                }
                c0585q.quebec(false);
                c0585q.quebec(false);
            } else {
                c0585q.purple(1989076778);
                c0585q.quebec(false);
                c3344d.papa();
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Jb.ae(c3344d, z2, i4, 2);
        }
    }

    public static final void kilo(C3344D c3344d, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        D0.g november;
        e0 e0Var;
        int i10 = 1;
        int i11 = 2;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1436003720);
        if (c0585q.india(c3344d)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i12 = i5 | i4;
        if ((i12 & 3) != 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i12 & 1, z2)) {
            ax axVar = c3344d.delta;
            if (axVar != null && ((Boolean) ((t0) axVar.oscar).getValue()).booleanValue() && (november = c3344d.november()) != null && november.purple.length() > 0) {
                c0585q.purple(-2112330600);
                boolean golf = c0585q.golf(c3344d);
                Object jade = c0585q.jade();
                androidx.compose.runtime.as asVar = C0580l.alpha;
                if (golf || jade == asVar) {
                    jade = new y.aw(c3344d);
                    c0585q.f(jade);
                }
                K k6 = (K) jade;
                Q0.d dVar = (Q0.d) c0585q.kilo(AbstractC2901T.hotel);
                I0.t tVar = c3344d.bravo;
                long j5 = c3344d.oscar().bravo;
                int i13 = D0.am.charlie;
                int originalToTransformed = tVar.originalToTransformed((int) (j5 >> 32));
                ax axVar2 = c3344d.delta;
                if (axVar2 != null) {
                    e0Var = axVar2.delta();
                } else {
                    e0Var = null;
                }
                Intrinsics.checkNotNull(e0Var);
                D0.ak akVar = e0Var.alpha;
                Z.c charlie = akVar.charlie(J4.delta(originalToTransformed, 0, akVar.alpha.alpha.purple.length()));
                long floatToRawIntBits = (Float.floatToRawIntBits(charlie.delta) & 4294967295L) | (Float.floatToRawIntBits((dVar.lavender(N.alpha) / 2) + charlie.alpha) << 32);
                boolean foxtrot = c0585q.foxtrot(floatToRawIntBits);
                Object jade2 = c0585q.jade();
                if (foxtrot || jade2 == asVar) {
                    jade2 = new ag(floatToRawIntBits);
                    c0585q.f(jade2);
                }
                InterfaceC3372l interfaceC3372l = (InterfaceC3372l) jade2;
                boolean india = c0585q.india(k6) | c0585q.india(c3344d);
                Object jade3 = c0585q.jade();
                if (india || jade3 == asVar) {
                    jade3 = new r(i10, k6, c3344d);
                    c0585q.f(jade3);
                }
                SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(k6, null, (PointerInputEventHandler) jade3, 6);
                boolean foxtrot2 = c0585q.foxtrot(floatToRawIntBits);
                Object jade4 = c0585q.jade();
                if (foxtrot2 || jade4 == asVar) {
                    jade4 = new com.clevertap.android.sdk.inapp.evaluation.a(floatToRawIntBits, i11);
                    c0585q.f(jade4);
                }
                AbstractC2128c.alpha(interfaceC3372l, A0.o.bravo(suspendPointerInputElement, false, (Function1) jade4), 0L, c0585q, 0);
                c0585q.quebec(false);
            } else {
                c0585q.purple(-2111021718);
                c0585q.quebec(false);
            }
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new bz.af(c3344d, i4, 15);
        }
    }

    public static final Z.c lima(AbstractC2366B abstractC2366B, int i4, I0.ah ahVar, D0.ak akVar, boolean z2, int i5) {
        Z.c cVar;
        float f5;
        float f10;
        if (akVar != null) {
            cVar = akVar.charlie(ahVar.bravo.originalToTransformed(i4));
        } else {
            cVar = Z.c.echo;
        }
        float f11 = N.alpha;
        abstractC2366B.getClass();
        int bravo2 = Q0.c.bravo(abstractC2366B, f11);
        float f12 = cVar.alpha;
        if (z2) {
            f5 = (i5 - f12) - bravo2;
        } else {
            f5 = f12;
        }
        if (z2) {
            f10 = i5 - f12;
        } else {
            f10 = bravo2 + f12;
        }
        return new Z.c(f5, cVar.bravo, f10, cVar.delta);
    }

    public static final boolean mike(int i4, KeyEvent keyEvent) {
        if (((int) (AbstractC1996c.delta(keyEvent) >> 32)) == i4) {
            return true;
        }
        return false;
    }

    public static final ArrayList november(List list, Function0 function0) {
        S5.l lVar;
        if (((Boolean) function0.invoke()).booleanValue()) {
            ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            for (int i4 = 0; i4 < size; i4++) {
                q0.ao aoVar = (q0.ao) list.get(i4);
                Object yankee = aoVar.yankee();
                Intrinsics.charlie(yankee, "null cannot be cast to non-null type androidx.compose.foundation.text.TextRangeLayoutModifier");
                h9.an anVar = ((i0) yankee).alpha;
                D0.ak akVar = (D0.ak) ((t0) ((h0) anVar.alpha).alpha).getValue();
                if (akVar == null) {
                    lVar = new S5.l(0, 0, new C1809a(20));
                } else {
                    D0.e charlie = h0.charlie((D0.e) anVar.purple, akVar);
                    if (charlie == null) {
                        lVar = new S5.l(0, 0, new C1809a(21));
                    } else {
                        Q0.l bravo2 = AbstractC2618b7.bravo(akVar.hotel(charlie.bravo, charlie.charlie).alpha());
                        lVar = new S5.l(bravo2.delta(), bravo2.bravo(), new kotlin.collections.n(7, bravo2));
                    }
                }
                int i5 = lVar.purple;
                int i10 = lVar.red;
                arrayList.add(new Pair(aoVar.victor(X6.bravo(i5, i5, i10, i10)), (Function0) lVar.silver));
            }
            return arrayList;
        }
        return null;
    }

    public static final int oscar(float f5) {
        return Math.round((float) Math.ceil(f5));
    }

    public static final void papa(ax axVar) {
        I0.ag agVar = axVar.echo;
        if (agVar != null) {
            axVar.victor.invoke(I0.aa.alpha(axVar.delta.alpha, null, 0L, 3));
            I0.ab abVar = agVar.alpha;
            AtomicReference atomicReference = abVar.bravo;
            while (true) {
                if (atomicReference.compareAndSet(agVar, null)) {
                    abVar.alpha.echo();
                    break;
                } else if (atomicReference.get() != agVar) {
                    break;
                }
            }
        }
        axVar.echo = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final int quebec(int i4, String str) {
        String str2;
        int i5;
        K1.k uniform = uniform();
        Integer num = null;
        if (uniform != null) {
            boolean z2 = true;
            if (uniform.charlie() != 1) {
                z2 = false;
            }
            T7.golf("Not initialized yet", z2);
            T7.foxtrot(str, "charSequence cannot be null");
            C1915c c1915c = (C1915c) uniform.echo.alpha;
            c1915c.getClass();
            if (i4 < 0 || i4 >= str.length()) {
                str2 = str;
                i5 = -1;
            } else {
                if (str instanceof Spanned) {
                    Spanned spanned = (Spanned) str;
                    K1.z[] zVarArr = (K1.z[]) spanned.getSpans(i4, i4 + 1, K1.z.class);
                    if (zVarArr.length > 0) {
                        i5 = spanned.getSpanEnd(zVarArr[0]);
                        str2 = str;
                    }
                }
                str2 = str;
                i5 = ((K1.q) c1915c.whiskey(str2, Math.max(0, i4 - 16), Math.min(str.length(), i4 + 16), LottieConstants.IterateForever, true, new K1.q(i4))).red;
            }
            Integer valueOf = Integer.valueOf(i5);
            if (i5 != -1) {
                num = valueOf;
            }
        } else {
            str2 = str;
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str2);
        return characterInstance.following(i4);
    }

    public static final int romeo(CharSequence charSequence, int i4) {
        int length = charSequence.length();
        while (i4 < length) {
            if (charSequence.charAt(i4) == '\n') {
                return i4;
            }
            i4++;
        }
        return charSequence.length();
    }

    public static final int sierra(CharSequence charSequence, int i4) {
        while (i4 > 0) {
            if (charSequence.charAt(i4 - 1) == '\n') {
                return i4;
            }
            i4--;
        }
        return 0;
    }

    public static final int tango(int i4, String str) {
        K1.k uniform = uniform();
        Integer num = null;
        if (uniform != null) {
            Integer valueOf = Integer.valueOf(uniform.bravo(str, Math.max(0, i4 - 1)));
            if (valueOf.intValue() != -1) {
                num = valueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i4);
    }

    public static final K1.k uniform() {
        if (K1.k.delta()) {
            K1.k alpha2 = K1.k.alpha();
            if (alpha2.charlie() == 1) {
                return alpha2;
            }
            return null;
        }
        return null;
    }

    public static final void victor(ax axVar, I0.aa aaVar, I0.t tVar) {
        Function1 function1;
        S.g echo = r6.u.echo();
        if (echo != null) {
            function1 = echo.echo();
        } else {
            function1 = null;
        }
        Function1 function12 = function1;
        S.g foxtrot = r6.u.foxtrot(echo);
        try {
            e0 delta = axVar.delta();
            if (delta == null) {
                return;
            }
            I0.ag agVar = axVar.echo;
            if (agVar == null) {
                return;
            }
            q0.z charlie = axVar.charlie();
            if (charlie == null) {
                return;
            }
            O.alpha(aaVar, axVar.alpha, delta.alpha, charlie, agVar, axVar.bravo(), tVar);
        } finally {
            r6.u.juliet(echo, foxtrot, function12);
        }
    }

    public static final void whiskey(I0.ab abVar, ax axVar, I0.aa aaVar, I0.l lVar, I0.t tVar) {
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        Cb.ac acVar = new Cb.ac(axVar.delta, axVar.victor, objectRef, 23);
        I0.v vVar = abVar.alpha;
        vVar.hotel(aaVar, lVar, acVar, axVar.whiskey);
        I0.ag agVar = new I0.ag(abVar, vVar);
        abVar.bravo.set(agVar);
        objectRef.alpha = agVar;
        axVar.echo = agVar;
        victor(axVar, aaVar, tVar);
    }

    public static final T.s xray(T.s sVar, D0.g gVar, D0.an anVar, Function1 function1, int i4, boolean z2, int i5, int i10, H0.j jVar, List list, Function1 function12, InterfaceC0368v interfaceC0368v, Function1 function13) {
        return sVar.then(T.p.alpha).then(new TextAnnotatedStringElement(gVar, anVar, jVar, function1, i4, z2, i5, i10, list, function12, interfaceC0368v, function13));
    }

    public static final void yankee(int i4, int i5) {
        boolean z2;
        boolean z10 = false;
        if (i4 > 0 && i5 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            AbstractC1719b.alpha("both minLines " + i4 + " and maxLines " + i5 + " must be greater than zero");
        }
        if (i4 <= i5) {
            z10 = true;
        }
        if (!z10) {
            AbstractC1719b.alpha("minLines " + i4 + " must be less than or equal to maxLines " + i5);
        }
    }
}
