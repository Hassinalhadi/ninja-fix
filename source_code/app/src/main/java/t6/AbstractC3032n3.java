package t6;

import a0.C0348b;
import a0.C0352f;
import a0.C0366t;
import a0.InterfaceC0364r;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import androidx.appcompat.widget.C0487w0;
import androidx.compose.foundation.layout.AbstractC0538d;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import c0.C0801a;
import com.google.mlkit.vision.barcode.common.Barcode;
import kb.C2026b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import t0.AbstractC2901T;
import t0.AbstractC2911e0;
import t6.AbstractC3032n3;
import y.C3365e;
import y.C3368h;
import y.C3371k;
import y.InterfaceC3372l;

/* renamed from: t6.n3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3032n3 {
    public static final void alpha(InterfaceC3372l interfaceC3372l, T.f fVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z2;
        boolean z10;
        int i10;
        int i11;
        boolean india;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1090171650);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(interfaceC3372l);
            } else {
                india = c0585q.india(interfaceC3372l);
            }
            if (india) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.golf(fVar)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(dVar)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        boolean z11 = true;
        if ((i5 & 147) != 146) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i5 & 1, z2)) {
            if ((i5 & 112) == 32) {
                z10 = true;
            } else {
                z10 = false;
            }
            if ((i5 & 14) != 4 && ((i5 & 8) == 0 || !c0585q.golf(interfaceC3372l))) {
                z11 = false;
            }
            boolean z12 = z10 | z11;
            Object jade = c0585q.jade();
            if (z12 || jade == C0580l.alpha) {
                jade = new C3371k(fVar, interfaceC3372l);
                c0585q.f(jade);
            }
            U0.l.alpha((C3371k) jade, null, new U0.ad(false, U0.ae.alpha, false), dVar, c0585q, ((i5 << 3) & 7168) | 384, 2);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ec.al(interfaceC3372l, fVar, dVar, i4, 23);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x00ba, code lost:
    
        if (r21 == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00d6, code lost:
    
        r3 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x00c0, code lost:
    
        if (r21 != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x00d4, code lost:
    
        if (r3 == false) goto L75;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void bravo(final InterfaceC3372l interfaceC3372l, final boolean z2, final O0.j jVar, final boolean z10, long j5, final float f5, final SuspendPointerInputElement suspendPointerInputElement, InterfaceC0581m interfaceC0581m, final int i4) {
        int i5;
        boolean z11;
        long j6;
        int i10;
        long j7;
        boolean z12;
        final boolean z13;
        T.h hVar;
        boolean z14;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean india;
        int i15;
        boolean z15 = true;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-466280168);
        if ((i4 & 6) == 0) {
            if ((i4 & 8) == 0) {
                india = c0585q.golf(interfaceC3372l);
            } else {
                india = c0585q.india(interfaceC3372l);
            }
            if (india) {
                i15 = 4;
            } else {
                i15 = 2;
            }
            i5 = i15 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i14 = 32;
            } else {
                i14 = 16;
            }
            i5 |= i14;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.echo(jVar.ordinal())) {
                i13 = Barcode.FORMAT_QR_CODE;
            } else {
                i13 = 128;
            }
            i5 |= i13;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.hotel(z10)) {
                i12 = 2048;
            } else {
                i12 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i12;
        }
        if ((i4 & 24576) == 0) {
            i5 |= 8192;
        }
        if ((1572864 & i4) == 0) {
            if (c0585q.golf(suspendPointerInputElement)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i5 |= i11;
        }
        if ((533651 & i5) != 533650) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0585q.magenta(i5 & 1, z11)) {
            c0585q.orange();
            if ((i4 & 1) != 0 && !c0585q.beige()) {
                c0585q.ochre();
                i10 = i5 & (-57345);
                j7 = j5;
            } else {
                i10 = i5 & (-57345);
                j7 = 9205357640488583168L;
            }
            c0585q.romeo();
            if (z2) {
                float f10 = y.ai.alpha;
                if (jVar == O0.j.alpha) {
                }
                if (jVar == O0.j.purple) {
                }
                z13 = false;
            } else {
                float f11 = y.ai.alpha;
                if ((jVar == O0.j.alpha && !z10) || (jVar == O0.j.purple && z10)) {
                    z12 = true;
                } else {
                    z12 = false;
                }
            }
            if (z13) {
                hVar = T.a.bravo;
            } else {
                hVar = T.a.alpha;
            }
            int i16 = i10 & 14;
            if (i16 != 4 && ((i10 & 8) == 0 || !c0585q.india(interfaceC3372l))) {
                z14 = false;
            } else {
                z14 = true;
            }
            if ((i10 & 112) != 32) {
                z15 = false;
            }
            boolean hotel = z15 | z14 | c0585q.hotel(z13);
            Object jade = c0585q.jade();
            if (hotel || jade == C0580l.alpha) {
                jade = new Function1() { // from class: y.a
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        n.al alVar;
                        ag agVar;
                        boolean z16;
                        A0.ad adVar = (A0.ad) obj;
                        long alpha = InterfaceC3372l.this.alpha();
                        A0.ac acVar = ai.charlie;
                        if (z2) {
                            alVar = n.al.purple;
                        } else {
                            alVar = n.al.red;
                        }
                        if (z13) {
                            agVar = ag.alpha;
                        } else {
                            agVar = ag.red;
                        }
                        if ((9223372034707292159L & alpha) != 9205357640488583168L) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        ((A0.k) adVar).hotel(acVar, new ah(alVar, alpha, agVar, z16));
                        return Unit.INSTANCE;
                    }
                };
                c0585q.f(jade);
            }
            j6 = j7;
            alpha(interfaceC3372l, hVar, P.e.echo(1365123137, new C3365e((t0.C0) c0585q.kilo(AbstractC2901T.sierra), j6, z13, A0.o.bravo(suspendPointerInputElement, false, (Function1) jade), interfaceC3372l), c0585q), c0585q, i16 | 384);
        } else {
            c0585q.ochre();
            j6 = j5;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            final long j10 = j6;
            uniform.delta = new Xd.l() { // from class: y.b
                @Override // Xd.l
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int cyan = C0564b.cyan(i4 | 1);
                    O0.j jVar2 = jVar;
                    SuspendPointerInputElement suspendPointerInputElement2 = suspendPointerInputElement;
                    AbstractC3032n3.bravo(InterfaceC3372l.this, z2, jVar2, z10, j10, f5, suspendPointerInputElement2, (InterfaceC0581m) obj, cyan);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void charlie(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, Function0 function0, boolean z2) {
        int i5;
        int i10;
        int i11;
        boolean z10;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(2111672474);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(sVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if (c0585q.india(function0)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i13 = i5 | i10;
        if (c0585q.hotel(z2)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if ((i14 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i14 & 1, z10)) {
            AbstractC0538d.echo(T.a.alpha(androidx.compose.foundation.layout.V.lima(sVar, y.ai.alpha, y.ai.bravo), AbstractC2911e0.alpha, new C3368h(function0, z2)), c0585q);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2026b(sVar, function0, z2, i4);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final C0352f delta(X.c cVar, float f5) {
        int ceil = ((int) Math.ceil(f5)) * 2;
        C0352f c0352f = AbstractC3037o3.alpha;
        C0348b c0348b = AbstractC3037o3.bravo;
        c0.b bVar = AbstractC3037o3.charlie;
        if (c0352f != null && c0348b != null) {
            Bitmap bitmap = c0352f.alpha;
            if (ceil <= bitmap.getWidth()) {
            }
        }
        c0352f = a0.ao.foxtrot(ceil, ceil, 1, 24);
        AbstractC3037o3.alpha = c0352f;
        c0348b = a0.ao.alpha(c0352f);
        AbstractC3037o3.bravo = c0348b;
        C0352f c0352f2 = c0352f;
        C0348b c0348b2 = c0348b;
        if (bVar == null) {
            bVar = new c0.b();
            AbstractC3037o3.charlie = bVar;
        }
        c0.b bVar2 = bVar;
        Q0.n layoutDirection = cVar.alpha.getLayoutDirection();
        Bitmap bitmap2 = c0352f2.alpha;
        float width = bitmap2.getWidth();
        float height = bitmap2.getHeight();
        C0801a c0801a = bVar2.alpha;
        Q0.d dVar = c0801a.alpha;
        Q0.n nVar = c0801a.bravo;
        InterfaceC0364r interfaceC0364r = c0801a.charlie;
        long j5 = c0801a.delta;
        c0801a.alpha = cVar;
        c0801a.bravo = layoutDirection;
        c0801a.charlie = c0348b2;
        c0801a.delta = (Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L);
        c0348b2.golf();
        ao.ad.november(bVar2, C0366t.bravo, 0L, bVar2.purple.oscar(), 0.0f, null, 58);
        ao.ad.november(bVar2, a0.ao.delta(4278190080L), 0L, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), 0.0f, null, 120);
        ao.ad.golf(bVar2, a0.ao.delta(4278190080L), f5, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f5) & 4294967295L), null, 120);
        c0348b2.november();
        c0801a.alpha = dVar;
        c0801a.bravo = nVar;
        c0801a.charlie = interfaceC0364r;
        c0801a.delta = j5;
        return c0352f2;
    }

    public static Drawable echo(int i4, Context context) {
        return C0487w0.delta().foxtrot(i4, context);
    }
}
