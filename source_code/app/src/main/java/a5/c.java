package a5;

import A0.ad;
import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.runtime.E0;
import androidx.compose.runtime.I;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import b.AbstractC0706v;
import b.C0705u;
import b.T;
import b.U;
import b.g0;
import bz.C0789n;
import bz.C0790o;
import bz.F;
import bz.av;
import bz.e0;
import com.checkout.components.rememberme.AbstractC0927b;
import com.checkout.components.rememberme.M1;
import com.checkout.components.rememberme.webview.BottomSheetWebViewImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import s0.an;
import t0.AbstractC2901T;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function1 {
    public final /* synthetic */ int alpha;

    public /* synthetic */ c(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                return M1.a(((Boolean) obj).booleanValue());
            case 1:
                return M1.a((String) obj);
            case 2:
                return M1.b(((Boolean) obj).booleanValue());
            case 3:
                return AbstractC0927b.a((BottomSheetWebViewImpl) obj);
            case 4:
                return Unit.INSTANCE;
            case 5:
                return Unit.INSTANCE;
            case 6:
                return Unit.INSTANCE;
            case 7:
                return Unit.INSTANCE;
            case 8:
                return Unit.INSTANCE;
            case 9:
                ((an) obj).charlie();
                return Unit.INSTANCE;
            case 10:
                return Unit.INSTANCE;
            case 11:
                ((Long) obj).longValue();
                return Unit.INSTANCE;
            case 12:
                int i4 = AbstractC0706v.alpha;
                E0 e02 = AndroidCompositionLocals_androidKt.bravo;
                P.i iVar = (P.i) ((I) obj);
                iVar.getClass();
                Context context = (Context) C0564b.azure(iVar, e02);
                Q0.d dVar = (Q0.d) C0564b.azure(iVar, AbstractC2901T.hotel);
                T t5 = (T) C0564b.azure(iVar, U.alpha);
                if (t5 == null) {
                    return null;
                }
                return new C0705u(context, dVar, t5.alpha, t5.bravo);
            case 13:
                A0.aa.delta((ad) obj, A0.g.charlie);
                return Unit.INSTANCE;
            case 14:
                return new g0(((Integer) obj).intValue());
            case 15:
                return Unit.INSTANCE;
            case 16:
                F f5 = (F) obj;
                long j5 = f5.white;
                ((S.x) e0.bravo.getValue()).delta(f5, e0.alpha, f5.yellow);
                long j6 = f5.white;
                if (j5 != j6) {
                    av avVar = f5.f3443g;
                    if (avVar != null) {
                        if (avVar.alpha > j6) {
                            f5.c0();
                        } else {
                            avVar.golf = j6;
                            if (avVar.bravo == null) {
                                avVar.hotel = Zd.a.echo((1.0d - avVar.echo.alpha(0)) * f5.white);
                            }
                        }
                    } else if (j6 != 0) {
                        f5.g0();
                    }
                }
                return Unit.INSTANCE;
            case 17:
                ((Function0) obj).invoke();
                return Unit.INSTANCE;
            case 18:
                return new C0789n(((Float) obj).floatValue());
            case 19:
                return new C0789n(((Integer) obj).intValue());
            case 20:
                return Integer.valueOf((int) ((C0789n) obj).alpha);
            case 21:
                return new C0789n(((Q0.g) obj).alpha);
            case 22:
                return new Q0.g(((C0789n) obj).alpha);
            case 23:
                Q0.h hVar = (Q0.h) obj;
                return new C0790o(Float.intBitsToFloat((int) (hVar.alpha >> 32)), Float.intBitsToFloat((int) (4294967295L & hVar.alpha)));
            case 24:
                C0790o c0790o = (C0790o) obj;
                float f10 = c0790o.alpha;
                float f11 = c0790o.bravo;
                return new Q0.h((4294967295L & Float.floatToRawIntBits(f11)) | (Float.floatToRawIntBits(f10) << 32));
            case 25:
                Z.e eVar = (Z.e) obj;
                return new C0790o(Float.intBitsToFloat((int) (eVar.alpha >> 32)), Float.intBitsToFloat((int) (4294967295L & eVar.alpha)));
            case 26:
                C0790o c0790o2 = (C0790o) obj;
                float f12 = c0790o2.alpha;
                float f13 = c0790o2.bravo;
                return new Z.e((4294967295L & Float.floatToRawIntBits(f13)) | (Float.floatToRawIntBits(f12) << 32));
            case 27:
                Z.b bVar = (Z.b) obj;
                return new C0790o(Float.intBitsToFloat((int) (bVar.alpha >> 32)), Float.intBitsToFloat((int) (4294967295L & bVar.alpha)));
            case 28:
                C0790o c0790o3 = (C0790o) obj;
                float f14 = c0790o3.alpha;
                float f15 = c0790o3.bravo;
                return new Z.b((4294967295L & Float.floatToRawIntBits(f15)) | (Float.floatToRawIntBits(f14) << 32));
            default:
                long j7 = ((Q0.k) obj).alpha;
                return new C0790o((int) (j7 >> 32), (int) (4294967295L & j7));
        }
    }
}
