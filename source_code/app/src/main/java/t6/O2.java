package t6;

import F.C0108g;
import android.os.Build;
import android.view.View;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import okhttp3.internal.http2.Http2;
import t0.AbstractC2901T;

/* loaded from: classes2.dex */
public abstract class O2 {
    public static final void alpha(Function0 function0, String str, T.s sVar, Z8.a aVar, Z8.b bVar, float f5, boolean z2, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        T.s sVar2;
        float f10;
        boolean z10;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z11 = true;
        int i15 = 4;
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-101155437);
        if ((i4 & 14) == 0) {
            if (c0585q.india(function0)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 112) == 0) {
            if (c0585q.golf(str)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 896) == 0) {
            sVar2 = sVar;
            if (c0585q.golf(sVar2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        } else {
            sVar2 = sVar;
        }
        if ((i4 & 7168) == 0) {
            if (c0585q.golf(aVar)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((57344 & i4) == 0) {
            if (c0585q.golf(bVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        int i16 = i5 | 1769472;
        if ((2995931 & i16) == 599186 && c0585q.bronze()) {
            c0585q.ochre();
            f10 = f5;
            z10 = z2;
        } else {
            float f11 = 100;
            int lavender = (int) ((Q0.d) c0585q.kilo(AbstractC2901T.hotel)).lavender(f11);
            Object[] objArr = {aVar, bVar, Integer.valueOf(lavender), str};
            c0585q.red(-568225417);
            int i17 = 0;
            boolean z12 = false;
            while (i17 < 4) {
                z12 |= c0585q.golf(objArr[i17]);
                i17++;
                z11 = z11;
            }
            boolean z13 = z11;
            Object jade = c0585q.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z12 || jade == asVar) {
                jade = new C0108g(aVar, bVar, lavender, str);
                c0585q.f(jade);
            }
            c0585q.quebec(false);
            Function1 function1 = (Function1) jade;
            Boolean valueOf = Boolean.valueOf(z13);
            c0585q.red(511388516);
            boolean golf = c0585q.golf(valueOf) | c0585q.golf(function0);
            Object jade2 = c0585q.jade();
            if (golf || jade2 == asVar) {
                jade2 = new F.R0(function0, i15);
                c0585q.f(jade2);
            }
            c0585q.quebec(false);
            androidx.compose.ui.viewinterop.a.alpha(function1, sVar2, (Function1) jade2, c0585q, (i16 >> 3) & 112, 0);
            f10 = f11;
            z10 = z13;
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform == null) {
            return;
        }
        uniform.delta = new Z8.d(function0, str, sVar, aVar, bVar, f10, z10, i4);
    }

    public static ai.a bravo(View view) {
        if (Build.VERSION.SDK_INT >= 26) {
            return new ai.a(d.S0.bravo(view));
        }
        return null;
    }
}
