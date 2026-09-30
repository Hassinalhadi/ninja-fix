package sb;

import Cf.e;
import Q0.g;
import a0.C0366t;
import android.util.Log;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.aa;
import com.checkout.components.card.ui.component.paybutton.PayButtonViewKt;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.BarcodeScanning;
import com.google.mlkit.vision.barcode.common.Barcode;
import delivery.samurai.android.ui.auth.signin.presentation.SignInActivity;
import delivery.samurai.android.ui.auth.signup.SignUpActivity;
import delivery.samurai.android.ui.scanner.ScannerActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import u.AbstractC3134h;
import vf.ao;
import y.AbstractC3355O;
import y.am;
import z.AbstractC3451e;
import z.C3449c;
import z.ac;
import z.al;
import z.l;
import z.q;
import z.t;
import z.z;

/* renamed from: sb.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C2844c implements Function0 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ C2844c(int i4) {
        this.alpha = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Unit a6;
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return new ArrayList();
            case 2:
                return new ArrayList();
            case 3:
                aa aaVar = AbstractC3134h.alpha;
                return null;
            case 4:
                int i4 = SignInActivity.f12172P;
                return Unit.INSTANCE;
            case 5:
                int i5 = SignInActivity.f12172P;
                Log.d("LocationGate", "Location compliance check: READY");
                return Unit.INSTANCE;
            case 6:
                int i10 = SignInActivity.f12172P;
                Log.d("LocationGate", "Location compliance dialog dismissed");
                return Unit.INSTANCE;
            case 7:
                int i11 = SignInActivity.f12172P;
                Log.d("LocationGate", "Settings opened from location compliance dialog");
                return Unit.INSTANCE;
            case 8:
                int i12 = ScannerActivity.Q;
                BarcodeScannerOptions build = new BarcodeScannerOptions.Builder().setBarcodeFormats(Barcode.FORMAT_QR_CODE, new int[0]).build();
                Intrinsics.delta(build, "build(...)");
                return BarcodeScanning.getClient(build);
            case 9:
                int i13 = SignUpActivity.f12184d0;
                return Unit.INSTANCE;
            case 10:
                int i14 = SignUpActivity.f12184d0;
                return Unit.INSTANCE;
            case 11:
                return Unit.INSTANCE;
            case 12:
                return C0564b.zulu(Boolean.FALSE);
            case 13:
                e eVar = ao.alpha;
                return Cf.d.purple;
            case 14:
                aa aaVar2 = am.alpha;
                return null;
            case 15:
                return AbstractC3355O.bravo;
            case 16:
                a6 = PayButtonViewKt.a();
                return a6;
            case 17:
                return Unit.INSTANCE;
            case 18:
                long delta = a0.ao.delta(4284612846L);
                long delta2 = a0.ao.delta(4281794739L);
                long delta3 = a0.ao.delta(4278442694L);
                long delta4 = a0.ao.delta(4278290310L);
                long j5 = C0366t.echo;
                long delta5 = a0.ao.delta(4289724448L);
                long j6 = C0366t.bravo;
                return new C3449c(delta, delta2, delta3, delta4, j5, j5, delta5, j5, j6, j6, j6, j5);
            case 19:
                aa aaVar3 = AbstractC3451e.alpha;
                return Float.valueOf(1.0f);
            case 20:
                E0 e02 = q.alpha;
                return l.alpha;
            case 21:
                return new g(0);
            case 22:
                E0 e03 = t.alpha;
                return Boolean.TRUE;
            case 23:
                return new z();
            case 24:
                return new ac();
            case 25:
                return z.am.alpha;
            default:
                return new al();
        }
    }
}
