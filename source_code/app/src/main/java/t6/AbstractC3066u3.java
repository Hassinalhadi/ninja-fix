package t6;

import android.os.Build;
import android.util.Log;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;
import b.C0703s;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.ArrayList;
import kb.C2026b;
import y.C3344D;
import y.C3345E;
import y.InterfaceC3372l;

/* renamed from: t6.u3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3066u3 {
    public static int alpha = 3;

    public static final void alpha(boolean z2, O0.j jVar, C3344D c3344d, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        boolean z10;
        boolean z11;
        boolean z12;
        long j5;
        n.e0 delta;
        int i10;
        int i11;
        int i12;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-1344558920);
        if ((i4 & 6) == 0) {
            if (c0585q.hotel(z2)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i5 = i12 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.echo(jVar.ordinal())) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i5 |= i11;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.india(c3344d)) {
                i10 = Barcode.FORMAT_QR_CODE;
            } else {
                i10 = 128;
            }
            i5 |= i10;
        }
        if ((i5 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            int i13 = i5 & 14;
            if (i13 == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean golf = z11 | c0585q.golf(c3344d);
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (golf || jade == asVar) {
                jade = new y.ay(c3344d, z2);
                c0585q.f(jade);
            }
            n.K k6 = (n.K) jade;
            boolean india = c0585q.india(c3344d);
            if (i13 == 4) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z13 = z12 | india;
            Object jade2 = c0585q.jade();
            if (z13 || jade2 == asVar) {
                jade2 = new C3345E(c3344d, z2);
                c0585q.f(jade2);
            }
            InterfaceC3372l interfaceC3372l = (InterfaceC3372l) jade2;
            boolean golf2 = D0.am.golf(c3344d.oscar().bravo);
            if (z2) {
                j5 = c3344d.oscar().bravo >> 32;
            } else {
                j5 = c3344d.oscar().bravo & 4294967295L;
            }
            int i14 = (int) j5;
            n.ax axVar = c3344d.delta;
            float f5 = 0.0f;
            if (axVar != null && (delta = axVar.delta()) != null) {
                D0.ak akVar = delta.alpha;
                if (i14 >= 0 && akVar.alpha.alpha.purple.length() != 0) {
                    D0.o oVar = akVar.bravo;
                    int min = Math.min(oVar.delta(i14), Math.min(oVar.bravo - 1, oVar.foxtrot - 1));
                    if (i14 <= oVar.charlie(min, false)) {
                        oVar.mike(min);
                        ArrayList arrayList = oVar.hotel;
                        D0.q qVar = (D0.q) arrayList.get(D0.ae.echo(min, arrayList));
                        D0.a aVar = qVar.alpha;
                        int i15 = min - qVar.delta;
                        E0.r rVar = aVar.delta;
                        f5 = rVar.echo(i15) - rVar.golf(i15);
                    }
                }
            }
            float f10 = f5;
            boolean india2 = c0585q.india(k6);
            Object jade3 = c0585q.jade();
            if (india2 || jade3 == asVar) {
                jade3 = new C0703s(6, k6);
                c0585q.f(jade3);
            }
            AbstractC3032n3.bravo(interfaceC3372l, z2, jVar, golf2, 0L, f10, new SuspendPointerInputElement(k6, null, (PointerInputEventHandler) jade3, 6), c0585q, (i5 << 3) & 1008);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C2026b(z2, jVar, c3344d, i4, 2);
        }
    }

    public static void bravo(String str, String str2) {
        String hotel = hotel(str);
        if (foxtrot(3, hotel)) {
            Log.d(hotel, str2);
        }
    }

    public static void charlie(String str, String str2) {
        String hotel = hotel(str);
        if (foxtrot(6, hotel)) {
            Log.e(hotel, str2);
        }
    }

    public static void delta(String str, String str2, Throwable th) {
        String hotel = hotel(str);
        if (foxtrot(6, hotel)) {
            Log.e(hotel, str2, th);
        }
    }

    public static boolean echo(String str) {
        return foxtrot(3, hotel(str));
    }

    public static boolean foxtrot(int i4, String str) {
        if (alpha > i4 && !Log.isLoggable(str, i4)) {
            return false;
        }
        return true;
    }

    public static final boolean golf(C3344D c3344d, boolean z2) {
        q0.z charlie;
        n.ax axVar = c3344d.delta;
        if (axVar != null && (charlie = axVar.charlie()) != null) {
            Z.c bravo = AbstractC3056s3.bravo(charlie);
            long mike = c3344d.mike(z2);
            float intBitsToFloat = Float.intBitsToFloat((int) (mike >> 32));
            if (bravo.alpha <= intBitsToFloat && intBitsToFloat <= bravo.charlie) {
                float intBitsToFloat2 = Float.intBitsToFloat((int) (mike & 4294967295L));
                if (bravo.bravo <= intBitsToFloat2 && intBitsToFloat2 <= bravo.delta) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public static String hotel(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static void india(String str, String str2) {
        String hotel = hotel(str);
        if (foxtrot(5, hotel)) {
            Log.w(hotel, str2);
        }
    }

    public static void juliet(String str, String str2, Throwable th) {
        String hotel = hotel(str);
        if (foxtrot(5, hotel)) {
            Log.w(hotel, str2, th);
        }
    }
}
