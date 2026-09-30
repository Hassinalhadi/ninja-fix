package s6;

import Q0.p;
import a0.ao;
import android.os.Build;
import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import android.widget.TextView;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.io.File;
import jb.C1956a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public abstract class G5 {
    public static final void alpha(final String html, T.s sVar, final long j5, final int i4, InterfaceC0581m interfaceC0581m, int i5) {
        int i10;
        int i11;
        int i12;
        boolean z2;
        C0585q c0585q;
        boolean z10;
        boolean z11;
        boolean z12;
        Intrinsics.echo(html, "html");
        C0585q c0585q2 = (C0585q) interfaceC0581m;
        c0585q2.silver(-661474837);
        if (c0585q2.golf(html)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i13 = i5 | i10;
        if (c0585q2.foxtrot(j5)) {
            i11 = 256;
        } else {
            i11 = 128;
        }
        int i14 = i13 | i11;
        if (c0585q2.echo(i4)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i15 = i14 | i12;
        boolean z13 = true;
        if ((i15 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q2.magenta(i15 & 1, z2)) {
            c0585q2.orange();
            if ((i5 & 1) != 0 && !c0585q2.beige()) {
                c0585q2.ochre();
            }
            c0585q2.romeo();
            final D0.an anVar = ((F.S2) c0585q2.kilo(F.T2.alpha)).lima;
            int i16 = i15 & 7168;
            if (i16 == 2048) {
                z10 = true;
            } else {
                z10 = false;
            }
            Object jade = c0585q2.jade();
            androidx.compose.runtime.as asVar = C0580l.alpha;
            if (z10 || jade == asVar) {
                jade = new Cb.ab(i4, 2);
                c0585q2.f(jade);
            }
            Function1 function1 = (Function1) jade;
            if ((((i15 & 896) ^ 384) > 256 && c0585q2.foxtrot(j5)) || (i15 & 384) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean golf = z11 | c0585q2.golf(anVar);
            if (i16 == 2048) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z14 = golf | z12;
            if ((i15 & 14) != 4) {
                z13 = false;
            }
            boolean z15 = z14 | z13;
            Object jade2 = c0585q2.jade();
            if (z15 || jade2 == asVar) {
                Function1 function12 = new Function1() { // from class: jb.b
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        Spanned fromHtml;
                        TextView view = (TextView) obj;
                        Intrinsics.echo(view, "view");
                        view.setTextColor(ao.beige(j5));
                        view.setTextSize(2, p.charlie(anVar.alpha.bravo));
                        view.setMaxLines(i4);
                        view.setEllipsize(TextUtils.TruncateAt.END);
                        int i17 = Build.VERSION.SDK_INT;
                        String str = html;
                        if (i17 >= 24) {
                            fromHtml = Html.fromHtml(str, 0);
                        } else {
                            fromHtml = Html.fromHtml(str);
                        }
                        view.setText(fromHtml);
                        return Unit.INSTANCE;
                    }
                };
                c0585q2.f(function12);
                jade2 = function12;
            }
            c0585q = c0585q2;
            androidx.compose.ui.viewinterop.a.alpha(function1, sVar, (Function1) jade2, c0585q, 48, 0);
        } else {
            c0585q = c0585q2;
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new C1956a(html, sVar, j5, i4, i5);
        }
    }

    public static final void bravo(File file, String operation) {
        Intrinsics.echo(file, "file");
        Intrinsics.echo(operation, "operation");
        if (!file.exists()) {
            return;
        }
        try {
            file.delete();
        } catch (Exception unused) {
        }
    }
}
