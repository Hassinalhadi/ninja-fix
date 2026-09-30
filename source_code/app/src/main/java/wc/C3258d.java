package wc;

import Xd.l;
import android.content.Intent;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.util.Base64;
import androidx.compose.runtime.C0580l;
import androidx.compose.runtime.C0585q;
import androidx.compose.runtime.InterfaceC0581m;
import androidx.compose.runtime.as;
import delivery.samurai.android.ui.scanner.invoice.InvoiceScannerActivity;
import kotlin.Unit;
import kotlin.collections.n;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import t0.aj;

/* renamed from: wc.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3258d implements l {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InvoiceScannerActivity purple;

    public /* synthetic */ C3258d(InvoiceScannerActivity invoiceScannerActivity, int i4) {
        this.alpha = i4;
        this.purple = invoiceScannerActivity;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        Vibrator vibrator;
        VibrationEffect createOneShot;
        int i4 = 1;
        InvoiceScannerActivity invoiceScannerActivity = this.purple;
        switch (this.alpha) {
            case 0:
                InterfaceC0581m interfaceC0581m = (InterfaceC0581m) obj;
                int intValue = ((Integer) obj2).intValue();
                int i5 = InvoiceScannerActivity.f12460I;
                if ((intValue & 3) != 2) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C0585q c0585q = (C0585q) interfaceC0581m;
                if (c0585q.magenta(intValue & 1, z2)) {
                    boolean india = c0585q.india(invoiceScannerActivity);
                    Object jade = c0585q.jade();
                    as asVar = C0580l.alpha;
                    if (india || jade == asVar) {
                        jade = new C3258d(invoiceScannerActivity, i4);
                        c0585q.f(jade);
                    }
                    l lVar = (l) jade;
                    boolean india2 = c0585q.india(invoiceScannerActivity);
                    Object jade2 = c0585q.jade();
                    if (india2 || jade2 == asVar) {
                        jade2 = new n(27, invoiceScannerActivity);
                        c0585q.f(jade2);
                    }
                    AbstractC3255a.alpha(lVar, (Function0) jade2, c0585q, 0);
                } else {
                    c0585q.ochre();
                }
                return Unit.INSTANCE;
            default:
                String str = (String) obj;
                byte[] bArr = (byte[]) obj2;
                int i10 = InvoiceScannerActivity.f12460I;
                int i11 = Build.VERSION.SDK_INT;
                if (i11 >= 31) {
                    Object systemService = invoiceScannerActivity.getSystemService("vibrator_manager");
                    Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
                    vibrator = aj.bravo(systemService).getDefaultVibrator();
                } else {
                    Object systemService2 = invoiceScannerActivity.getSystemService("vibrator");
                    Intrinsics.charlie(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
                    vibrator = (Vibrator) systemService2;
                }
                Intrinsics.checkNotNull(vibrator);
                if (i11 >= 26) {
                    createOneShot = VibrationEffect.createOneShot(100L, -1);
                    vibrator.vibrate(createOneShot);
                } else {
                    vibrator.vibrate(100L);
                }
                Intent intent = new Intent();
                if (str != null) {
                    intent.putExtra("SCAN_RESULT", str);
                }
                if (bArr != null) {
                    intent.putExtra("SCAN_RESULT_B64", Base64.encodeToString(bArr, 2));
                }
                invoiceScannerActivity.setResult(-1, intent);
                invoiceScannerActivity.finish();
                return Unit.INSTANCE;
        }
    }
}
