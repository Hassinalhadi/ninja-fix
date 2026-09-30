package t0;

import android.content.Context;
import androidx.compose.runtime.C0564b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* renamed from: t0.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2932p extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public static final C2932p purple = new C2932p(1, 0);
    public static final C2932p red = new C2932p(1, 1);
    public static final C2932p silver = new C2932p(1, 2);
    public static final C2932p teal = new C2932p(1, 3);
    public static final C2932p white = new C2932p(1, 4);
    public static final C2932p yellow = new C2932p(1, 5);

    /* renamed from: c, reason: collision with root package name */
    public static final C2932p f13847c = new C2932p(1, 6);

    /* renamed from: d, reason: collision with root package name */
    public static final C2932p f13848d = new C2932p(1, 7);
    public static final C2932p e = new C2932p(1, 8);

    /* renamed from: f, reason: collision with root package name */
    public static final C2932p f13849f = new C2932p(1, 9);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2932p(int i4, int i5) {
        super(i4);
        this.alpha = i5;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r3.alpha.charlie(A0.x.blue) != false) goto L20;
     */
    @Override // kotlin.jvm.functions.Function1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                return Boolean.TRUE;
            case 2:
                return Boolean.FALSE;
            case 3:
                A0.k xray = ((s0.al) obj).xray();
                boolean z10 = false;
                if (xray != null && xray.red) {
                    z10 = true;
                }
                return Boolean.valueOf(z10);
            case 4:
                return Boolean.valueOf(((s0.al) obj).f13305x.foxtrot(8));
            case 5:
                A0.k xray2 = ((s0.al) obj).xray();
                if (xray2 != null) {
                    z2 = true;
                    if (xray2.red) {
                        break;
                    }
                }
                z2 = false;
                return Boolean.valueOf(z2);
            case 6:
                return (I0.v) obj;
            case 7:
                androidx.compose.runtime.aa aaVar = AndroidCompositionLocals_androidKt.alpha;
                P.i iVar = (P.i) ((androidx.compose.runtime.I) obj);
                iVar.getClass();
                C0564b.azure(iVar, aaVar);
                return ((Context) C0564b.azure(iVar, AndroidCompositionLocals_androidKt.bravo)).getResources();
            case 8:
                return Boolean.valueOf(W.echo(obj));
            default:
                return Unit.INSTANCE;
        }
    }
}
