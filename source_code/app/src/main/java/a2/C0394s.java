package a2;

import B2.ad;
import android.location.Location;
import androidx.compose.runtime.D0;
import androidx.compose.runtime.ax;
import androidx.compose.runtime.t0;
import bv.af;
import bx.A;
import bx.C0772j;
import bx.K;
import bx.ay;
import bx.az;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import p3.ae;
import u3.InterfaceC3142e;

/* renamed from: a2.s, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C0394s implements Function1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2593a;
    public final /* synthetic */ int alpha = 1;
    public final /* synthetic */ Function1 purple;
    public final /* synthetic */ Object red;
    public final /* synthetic */ Object silver;
    public final /* synthetic */ Object teal;
    public final /* synthetic */ Object white;
    public final /* synthetic */ Object yellow;

    public /* synthetic */ C0394s(ad adVar, ae aeVar, Location location, String str, String str2, String str3, Function1 function1) {
        this.red = adVar;
        this.silver = aeVar;
        this.teal = location;
        this.white = str;
        this.yellow = str2;
        this.f2593a = str3;
        this.purple = function1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Function1 function1 = this.purple;
        Object obj2 = this.f2593a;
        Object obj3 = this.yellow;
        Object obj4 = this.white;
        Object obj5 = this.silver;
        Object obj6 = this.teal;
        Object obj7 = this.red;
        switch (this.alpha) {
            case 0:
                bx.s sVar = (bx.s) obj;
                float f5 = 0.0f;
                if (((List) ((D0) obj3).getValue()).contains(sVar.alpha())) {
                    String str = ((Y1.l) sVar.alpha()).white;
                    af afVar = (af) obj7;
                    int bravo = afVar.bravo(str);
                    if (bravo >= 0) {
                        f5 = afVar.charlie[bravo];
                    } else {
                        afVar.delta(str, 0.0f);
                    }
                    if (!Intrinsics.areEqual(((Y1.l) sVar.charlie()).white, ((Y1.l) sVar.alpha()).white)) {
                        if (!((Boolean) ((t0) ((C0383h) obj5).charlie).getValue()).booleanValue() && !((Boolean) ((ax) obj2).getValue()).booleanValue()) {
                            f5 += 1.0f;
                        } else {
                            f5 -= 1.0f;
                        }
                    }
                    afVar.delta(((Y1.l) sVar.charlie()).white, f5);
                    return new bx.ae((bx.ax) function1.invoke(sVar), (az) ((Function1) obj6).invoke(sVar), f5, (K) ((Function1) obj4).invoke(sVar));
                }
                ay ayVar = bx.ax.alpha;
                A a6 = az.alpha;
                int i4 = androidx.compose.animation.a.bravo;
                return new bx.ae(ayVar, a6, 0.0f, new K(C0772j.purple));
            default:
                Throwable err = (Throwable) obj;
                Intrinsics.echo(err, "err");
                ad adVar = (ad) obj7;
                InterfaceC3142e interfaceC3142e = (InterfaceC3142e) adVar.charlie;
                Location location = (Location) obj6;
                double latitude = location.getLatitude();
                double longitude = location.getLongitude();
                String message = err.getMessage();
                StringBuilder sb2 = new StringBuilder("[PUSH_FAILED] Location push failed | source=");
                ae aeVar = (ae) obj5;
                sb2.append(aeVar);
                sb2.append(" lat=");
                sb2.append(latitude);
                sb2.append(", lng=");
                sb2.append(longitude);
                sb2.append(", error=");
                sb2.append(message);
                sb2.append(", accuracyMode=");
                sb2.append((String) obj4);
                sb2.append(", adding to retry queue");
                interfaceC3142e.alpha("LocationFlow", sb2.toString());
                String message2 = "LocationSend: PUSH_FAILED source=" + aeVar + " error=" + err.getMessage();
                Intrinsics.echo(message2, "message");
                try {
                    K7.b.alpha().bravo(message2);
                } catch (Exception unused) {
                }
                adVar.alpha(location, (String) obj3, (String) obj2);
                function1.invoke(err);
                adVar.bravo();
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ C0394s(af afVar, C0383h c0383h, Function1 function1, Function1 function12, Function1 function13, D0 d02, ax axVar) {
        this.red = afVar;
        this.silver = c0383h;
        this.purple = function1;
        this.teal = function12;
        this.white = function13;
        this.yellow = d02;
        this.f2593a = axVar;
    }
}
