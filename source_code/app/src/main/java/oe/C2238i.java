package oe;

import av.q;
import ge.v;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u;
import me.AbstractC2120h;
import re.InterfaceC2518b;
import re.InterfaceC2520d;
import s6.K4;
import se.z;

/* renamed from: oe.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2238i extends AbstractC2120h {
    public static final /* synthetic */ v[] hotel;
    public me.k foxtrot;
    public final ff.i golf;

    static {
        kotlin.jvm.internal.v vVar = u.alpha;
        hotel = new v[]{vVar.hotel(new kotlin.jvm.internal.o(vVar.bravo(C2238i.class), "customizer", "getCustomizer()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltInsCustomizer;"))};
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2238i(ff.l lVar) {
        super(lVar);
        com.google.android.material.datepicker.j.papa(1, "kind");
        this.golf = lVar.bravo(new Xa.f(26, this, lVar));
        int mike = q.mike(1);
        if (mike != 1) {
            if (mike != 2) {
                return;
            }
            charlie();
            return;
        }
        charlie();
    }

    public final C2243n cyan() {
        return (C2243n) K4.alpha(this.golf, hotel[0]);
    }

    @Override // me.AbstractC2120h
    public final InterfaceC2518b delta() {
        return cyan();
    }

    @Override // me.AbstractC2120h
    public final List lima() {
        List lima = super.lima();
        ff.l lVar = this.delta;
        z builtInsModule = kilo();
        Intrinsics.delta(builtInsModule, "builtInsModule");
        return CollectionsKt.b(lima, new C2236g(lVar, builtInsModule));
    }

    @Override // me.AbstractC2120h
    public final InterfaceC2520d oscar() {
        return cyan();
    }
}
