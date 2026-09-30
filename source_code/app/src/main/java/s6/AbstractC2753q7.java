package s6;

import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.zendesk.service.HttpConstants;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import pb.C2299a;

/* renamed from: s6.q7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2753q7 {
    public static final /* synthetic */ int alpha = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(String str, Function0 onClick, boolean z2, T.s sVar, P.d dVar, InterfaceC0581m interfaceC0581m, int i4, int i5) {
        boolean z10;
        int i10;
        int i11;
        P.d dVar2;
        int i12;
        boolean z11;
        T.s sVar2;
        P.d dVar3;
        boolean z12;
        androidx.compose.runtime.Q uniform;
        P.d dVar4;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(598770916);
        int i13 = i5 & 4;
        if (i13 != 0) {
            i10 = i4 | 384;
            z10 = z2;
        } else if ((i4 & 384) == 0) {
            z10 = z2;
            if (c0585q.hotel(z10)) {
                i11 = Barcode.FORMAT_QR_CODE;
            } else {
                i11 = 128;
            }
            i10 = i11 | i4;
        } else {
            z10 = z2;
            i10 = i4;
        }
        int i14 = i10 | 3072;
        int i15 = i5 & 16;
        if (i15 != 0) {
            i14 = i10 | 27648;
        } else if ((i4 & 24576) == 0) {
            dVar2 = dVar;
            if (c0585q.india(dVar2)) {
                i12 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i12 = 8192;
            }
            i14 |= i12;
            boolean z13 = true;
            if ((i14 & 9363) == 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (!c0585q.magenta(i14 & 1, z11)) {
                if (i13 == 0) {
                    z13 = z10;
                }
                T.p pVar = T.p.alpha;
                if (i15 != 0) {
                    dVar4 = null;
                } else {
                    dVar4 = dVar2;
                }
                F.K1.juliet(onClick, androidx.compose.foundation.layout.V.echo(pVar, 48), z13, null, null, null, P.e.echo(-1581625, new Pa.e(dVar4, 3, str), c0585q), c0585q, 805306374 | (i14 & 896), HttpConstants.HTTP_GATEWAY_TIMEOUT);
                sVar2 = pVar;
                dVar3 = dVar4;
                z12 = z13;
            } else {
                c0585q.ochre();
                sVar2 = sVar;
                dVar3 = dVar2;
                z12 = z10;
            }
            uniform = c0585q.uniform();
            if (uniform == null) {
                uniform.delta = new C2299a(str, onClick, z12, sVar2, dVar3, i4, i5, 2);
                return;
            }
            return;
        }
        dVar2 = dVar;
        boolean z132 = true;
        if ((i14 & 9363) == 9362) {
        }
        if (!c0585q.magenta(i14 & 1, z11)) {
        }
        uniform = c0585q.uniform();
        if (uniform == null) {
        }
    }
}
