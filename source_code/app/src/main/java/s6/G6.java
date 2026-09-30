package s6;

import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.util.Log;
import androidx.compose.foundation.layout.AbstractC0542h;
import androidx.compose.foundation.layout.AbstractC0553t;
import androidx.compose.foundation.layout.C0554u;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.ui.captainsuniforms.viewmodel.CaptainsUniformsViewModel;
import h.AbstractC1797a;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import pe.AbstractC2327c;
import s0.C2549i;
import s0.C2550j;
import s0.C2551k;
import s0.InterfaceC2552l;

/* loaded from: classes2.dex */
public abstract class G6 {
    /* JADX WARN: Code restructure failed: missing block: B:23:0x008e, code lost:
    
        if (kotlin.text.StringsKt.gray(r13) == false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void alpha(CaptainsUniformsViewModel captainsUniformsViewModel, Function1 onBuyClick, Function1 onStoreClick, Function0 function0, InterfaceC0581m interfaceC0581m, int i4) {
        int i5;
        int i10;
        int i11;
        int i12;
        boolean z2;
        String str;
        boolean z10;
        Intrinsics.echo(onBuyClick, "onBuyClick");
        Intrinsics.echo(onStoreClick, "onStoreClick");
        C0585q c0585q = (C0585q) interfaceC0581m;
        c0585q.silver(1264333839);
        if (c0585q.golf(captainsUniformsViewModel)) {
            i5 = 4;
        } else {
            i5 = 2;
        }
        int i13 = i4 | i5;
        if (c0585q.india(onBuyClick)) {
            i10 = 32;
        } else {
            i10 = 16;
        }
        int i14 = i13 | i10;
        if (c0585q.india(onStoreClick)) {
            i11 = Barcode.FORMAT_QR_CODE;
        } else {
            i11 = 128;
        }
        int i15 = i14 | i11;
        if (c0585q.india(function0)) {
            i12 = 2048;
        } else {
            i12 = Barcode.FORMAT_UPC_E;
        }
        int i16 = i15 | i12;
        if ((i16 & 1171) != 1170) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (c0585q.magenta(i16 & 1, z2)) {
            androidx.compose.runtime.as asVar = C0580l.alpha;
            androidx.compose.runtime.ax mike = C0564b.mike(captainsUniformsViewModel.delta, c0585q, 0);
            androidx.compose.runtime.ax mike2 = C0564b.mike(captainsUniformsViewModel.foxtrot, c0585q, 0);
            try {
                z9.j jVar = (z9.j) captainsUniformsViewModel.bravo;
                jVar.getClass();
                AtomicInteger atomicInteger = L9.d.alpha;
                Context context = jVar.alpha;
                Intrinsics.echo(context, "<this>");
                str = L9.k.golf(context).getString("uniforms_deeplink", null);
                if (str != null) {
                }
            } catch (Exception unused) {
            }
            str = null;
            T.s bravo = androidx.compose.foundation.a.bravo(androidx.compose.foundation.layout.V.charlie, ((F.O) c0585q.kilo(F.Q.alpha)).november, a0.ao.alpha);
            C0554u alpha = AbstractC0553t.alpha(AbstractC0542h.charlie, T.d.f2062f, c0585q, 0);
            long j5 = c0585q.magenta;
            int i17 = (int) (j5 ^ (j5 >>> 32));
            androidx.compose.runtime.I mike3 = c0585q.mike();
            T.s charlie = T.a.charlie(bravo, c0585q);
            InterfaceC2552l.maroon.getClass();
            C2550j c2550j = C2551k.bravo;
            c0585q.white();
            if (c0585q.lime) {
                c0585q.lima(c2550j);
            } else {
                c0585q.i();
            }
            C0564b.blue(C2551k.foxtrot, c0585q, alpha);
            C0564b.blue(C2551k.echo, c0585q, mike3);
            C2549i c2549i = C2551k.golf;
            if (c0585q.lime || !Intrinsics.areEqual(c0585q.jade(), Integer.valueOf(i17))) {
                ao.ad.blue(i17, c0585q, i17, c2549i);
            }
            C0564b.blue(C2551k.delta, c0585q, charlie);
            Qa.a.foxtrot((i16 >> 9) & 14, null, c0585q, function0);
            boolean booleanValue = ((Boolean) mike2.getValue()).booleanValue();
            if ((i16 & 14) != 4) {
                z10 = false;
            } else {
                z10 = true;
            }
            Object jade = c0585q.jade();
            if (z10 || jade == asVar) {
                jade = new Oa.a(captainsUniformsViewModel, 0);
                c0585q.f(jade);
            }
            Function0 function02 = (Function0) jade;
            if (1.0f <= 0.0d) {
                AbstractC1797a.alpha("invalid weight; must be greater than zero");
            }
            Pa.a.alpha(3072, P.e.echo(1714814562, new Ac.d(captainsUniformsViewModel, onStoreClick, mike, mike2, 2), c0585q), new LayoutWeightElement(1.0f, true), c0585q, function02, booleanValue);
            Qa.a.delta(str, onBuyClick, null, c0585q, i16 & 112);
            c0585q.quebec(true);
        } else {
            c0585q.ochre();
        }
        androidx.compose.runtime.Q uniform = c0585q.uniform();
        if (uniform != null) {
            uniform.delta = new Ac.h(captainsUniformsViewModel, onBuyClick, onStoreClick, function0, i4);
        }
    }

    public static final int bravo(Cursor c3, String str) {
        String str2;
        Intrinsics.echo(c3, "c");
        int columnIndex = c3.getColumnIndex(str);
        if (columnIndex < 0) {
            columnIndex = c3.getColumnIndex("`" + str + '`');
            if (columnIndex < 0) {
                if (Build.VERSION.SDK_INT <= 25 && str.length() != 0) {
                    String[] columnNames = c3.getColumnNames();
                    Intrinsics.delta(columnNames, "columnNames");
                    String concat = ".".concat(str);
                    String victor = AbstractC2327c.victor('`', ".", str);
                    int length = columnNames.length;
                    int i4 = 0;
                    int i5 = 0;
                    while (i5 < length) {
                        String str3 = columnNames[i5];
                        int i10 = i4 + 1;
                        if (str3.length() >= str.length() + 2 && (kotlin.text.r.golf(str3, concat, false) || (str3.charAt(0) == '`' && kotlin.text.r.golf(str3, victor, false)))) {
                            columnIndex = i4;
                            break;
                        }
                        i5++;
                        i4 = i10;
                    }
                }
                columnIndex = -1;
            }
        }
        if (columnIndex >= 0) {
            return columnIndex;
        }
        try {
            String[] columnNames2 = c3.getColumnNames();
            Intrinsics.delta(columnNames2, "c.columnNames");
            str2 = ArraysKt.magenta(columnNames2, null, null, null, null, 63);
        } catch (Exception e) {
            Log.d("RoomCursorUtil", "Cannot collect column names for debug purposes", e);
            str2 = "unknown";
        }
        throw new IllegalArgumentException(av.q.foxtrot("column '", str, "' does not exist. Available columns: ", str2));
    }
}
