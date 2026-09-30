package o3;

import Pd.i;
import Xd.l;
import Yb.F;
import android.content.Context;
import android.location.LocationManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import g1.AbstractC1735d;
import h5.C1809a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import xf.q;
import xf.r;

/* loaded from: classes3.dex */
public final class e extends i implements l {
    public int alpha;
    public /* synthetic */ Object purple;
    public final /* synthetic */ g red;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(g gVar, Nd.c cVar) {
        super(2, cVar);
        this.red = gVar;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        e eVar = new e(this.red, cVar);
        eVar.purple = obj;
        return eVar;
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((e) create((r) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
    
        if (t6.AbstractC3027m3.alpha(r0, r3, r7) == r1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x007d, code lost:
    
        if (t6.AbstractC3027m3.alpha(r0, r8, r7) == r1) goto L21;
     */
    @Override // Pd.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        r rVar = (r) this.purple;
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0) {
            if (i4 != 1 && i4 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.alpha(obj);
        } else {
            ResultKt.alpha(obj);
            ((q) rVar).mike(new a());
            if (Build.VERSION.SDK_INT >= 24) {
                Context context = this.red.alpha;
                if (AbstractC1735d.alpha(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
                    Object systemService = context.getSystemService("location");
                    Intrinsics.charlie(systemService, "null cannot be cast to non-null type android.location.LocationManager");
                    LocationManager locationManager = (LocationManager) systemService;
                    d dVar = new d(rVar);
                    try {
                        locationManager.registerGnssStatusCallback(dVar, new Handler(Looper.getMainLooper()));
                    } catch (Exception unused) {
                    }
                    F f5 = new F(26, locationManager, dVar);
                    this.purple = null;
                    this.alpha = 1;
                }
            }
            C1809a c1809a = new C1809a(22);
            this.purple = null;
            this.alpha = 2;
        }
        return Unit.INSTANCE;
    }
}
