package s;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import q0.z;
import u.InterfaceC3132f;

/* renamed from: s.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2522a implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2528g purple;
    public final /* synthetic */ InterfaceC3132f red;

    public /* synthetic */ C2522a(C2528g c2528g, InterfaceC3132f interfaceC3132f, int i4) {
        this.alpha = i4;
        this.purple = c2528g;
        this.red = interfaceC3132f;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                C2528g c2528g = this.purple;
                C2523b c2523b = c2528g.foxtrot;
                kotlin.collections.n nVar = new kotlin.collections.n(17, this.red);
                Ref.ObjectRef objectRef = new Ref.ObjectRef();
                c2528g.echo.delta("dataBuilder", c2523b, new okhttp3.internal.ws.a(1, objectRef, nVar));
                Object obj = objectRef.alpha;
                if (obj != null) {
                    return (q.c) obj;
                }
                Intrinsics.lima("result");
                throw null;
            case 1:
                C2528g c2528g2 = this.purple;
                C2523b c2523b2 = c2528g2.golf;
                C2522a c2522a = new C2522a(c2528g2, this.red, 2);
                Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                c2528g2.echo.delta("positioner", c2523b2, new okhttp3.internal.ws.a(1, objectRef2, c2522a));
                Object obj2 = objectRef2.alpha;
                if (obj2 != null) {
                    return (Z.c) obj2;
                }
                Intrinsics.lima("result");
                throw null;
            default:
                z zVar = (z) this.purple.charlie.invoke();
                return this.red.lima(zVar).hotel(zVar.gray(0L));
        }
    }
}
