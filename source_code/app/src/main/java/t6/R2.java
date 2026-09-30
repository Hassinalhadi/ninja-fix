package t6;

import android.animation.ObjectAnimator;
import android.widget.ImageButton;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.R;
import f0.AbstractC1680b;
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;

/* loaded from: classes2.dex */
public abstract class R2 {
    public static final void alpha(int i4, T.s sVar, InterfaceC0581m interfaceC0581m, String str, String str2, Function0 onClick, boolean z2) {
        int i5;
        boolean z10;
        String str3;
        Function0 function0;
        boolean z11;
        T.s sVar2;
        String str4;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Intrinsics.echo(onClick, "onClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(-493063090);
        if ((i4 & 6) == 0) {
            if (c0585q.golf(str)) {
                i14 = 4;
            } else {
                i14 = 2;
            }
            i5 = i14 | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            if (c0585q.hotel(z2)) {
                i13 = 32;
            } else {
                i13 = 16;
            }
            i5 |= i13;
        }
        if ((i4 & 384) == 0) {
            if (c0585q.golf(str2)) {
                i12 = Barcode.FORMAT_QR_CODE;
            } else {
                i12 = 128;
            }
            i5 |= i12;
        }
        if ((i4 & 3072) == 0) {
            if (c0585q.india(onClick)) {
                i11 = 2048;
            } else {
                i11 = Barcode.FORMAT_UPC_E;
            }
            i5 |= i11;
        }
        if ((i4 & 24576) == 0) {
            if (c0585q.golf(sVar)) {
                i10 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i10 = 8192;
            }
            i5 |= i10;
        }
        if ((i5 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0585q.magenta(i5 & 1, z10)) {
            AbstractC1680b charlie = AbstractC3076w3.charlie(R.drawable.ic_upload_camera, c0585q, 0);
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            int i15 = (i5 >> 3) & 8064;
            int i16 = i5 << 9;
            str3 = str2;
            T2.bravo(charlie, str4, onClick, sVar, z2, str3, c0585q, i15 | (57344 & i16) | (i16 & 458752));
            function0 = onClick;
            sVar2 = sVar;
            z11 = z2;
        } else {
            str3 = str2;
            function0 = onClick;
            z11 = z2;
            sVar2 = sVar;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Za.e(str, z11, str3, function0, sVar2, i4);
        }
    }

    public static final void bravo(ImageButton imageButton, boolean z2) {
        float f5;
        Intrinsics.echo(imageButton, "<this>");
        if (z2) {
            f5 = 180.0f;
        } else {
            f5 = 0.0f;
        }
        ObjectAnimator.ofFloat(imageButton, "rotation", Arrays.copyOf(new float[]{f5}, 1)).setDuration(300L).start();
    }
}
