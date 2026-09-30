package gf;

import android.view.View;
import ge.InterfaceC1774f;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.jvm.internal.impl.types.y;

/* loaded from: classes2.dex */
public final /* synthetic */ class t extends kotlin.jvm.internal.h implements Xd.l {
    public final /* synthetic */ int alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t(int i4, Object obj, int i5) {
        super(i4, obj);
        this.alpha = i5;
    }

    @Override // kotlin.jvm.internal.c, ge.InterfaceC1771c
    public final String getName() {
        switch (this.alpha) {
            case 0:
                return "isStrictSupertype";
            case 1:
                return "equalTypes";
            default:
                return "handleSwipeViewMove";
        }
    }

    @Override // kotlin.jvm.internal.c
    public final InterfaceC1774f getOwner() {
        switch (this.alpha) {
            case 0:
                return kotlin.jvm.internal.u.alpha.bravo(u.class);
            case 1:
                return kotlin.jvm.internal.u.alpha.bravo(l.class);
            default:
                return kotlin.jvm.internal.u.alpha.bravo(u9.c.class);
        }
    }

    @Override // kotlin.jvm.internal.c
    public final String getSignature() {
        switch (this.alpha) {
            case 0:
                return "isStrictSupertype(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            case 1:
                return "equalTypes(Lorg/jetbrains/kotlin/types/KotlinType;Lorg/jetbrains/kotlin/types/KotlinType;)Z";
            default:
                return "handleSwipeViewMove(FI)V";
        }
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        boolean z2;
        switch (this.alpha) {
            case 0:
                y p02 = (y) obj;
                y p12 = (y) obj2;
                Intrinsics.echo(p02, "p0");
                Intrinsics.echo(p12, "p1");
                ((u) this.receiver).getClass();
                InterfaceC1796k.bravo.getClass();
                l lVar = C1795j.bravo;
                if (lVar.bravo(p02, p12) && !lVar.bravo(p12, p02)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                return Boolean.valueOf(z2);
            case 1:
                y p03 = (y) obj;
                y p13 = (y) obj2;
                Intrinsics.echo(p03, "p0");
                Intrinsics.echo(p13, "p1");
                return Boolean.valueOf(((l) this.receiver).alpha(p03, p13));
            default:
                float floatValue = ((Number) obj).floatValue();
                int intValue = ((Number) obj2).intValue();
                u9.c cVar = (u9.c) this.receiver;
                cVar.getClass();
                float abs = 1.0f - (Math.abs(floatValue) * ((1.0f / intValue) / 4.0f));
                cVar.f13970a.setAlpha(abs);
                View view = cVar.white;
                if (view != null) {
                    view.setAlpha(abs);
                }
                return Unit.INSTANCE;
        }
    }
}
