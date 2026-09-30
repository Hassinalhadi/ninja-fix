package oe;

import bx.C0769g;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.ab;
import kotlin.collections.y;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import me.AbstractC2120h;
import qe.AbstractC2469e;
import qe.C2471g;
import qe.C2473i;
import qe.C2475k;
import se.z;

/* renamed from: oe.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2241l extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ C2243n purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2241l(C2243n c2243n, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = c2243n;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        C2243n c2243n = this.purple;
        switch (this.alpha) {
            case 0:
                return c2243n.alpha.silver.echo();
            default:
                z zVar = c2243n.alpha;
                Ne.f fVar = AbstractC2469e.alpha;
                AbstractC2120h abstractC2120h = zVar.silver;
                Intrinsics.echo(abstractC2120h, "<this>");
                List juliet = ab.juliet(new C2475k(abstractC2120h, me.m.mike, y.sierra(new Pair(AbstractC2469e.alpha, new Se.g("This member is not fully supported by Kotlin compiler, so it may be absent or have different signature in next major version")), new Pair(AbstractC2469e.bravo, new Se.g(new C2475k(abstractC2120h, me.m.oscar, y.sierra(new Pair(AbstractC2469e.delta, new Se.g("")), new Pair(AbstractC2469e.echo, new Se.b(CollectionsKt.emptyList(), new C0769g(15, abstractC2120h))))))), new Pair(AbstractC2469e.charlie, new Se.i(Ne.b.juliet(me.m.november), Ne.f.echo("WARNING"))))));
                if (juliet.isEmpty()) {
                    return C2471g.alpha;
                }
                return new C2473i(0, juliet);
        }
    }
}
