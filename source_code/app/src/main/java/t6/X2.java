package t6;

import a2.C0383h;
import a2.C0389n;
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import pe.InterfaceC2321ad;
import xe.C3338a;
import xe.EnumC3339b;

/* loaded from: classes2.dex */
public abstract class X2 {
    /* JADX WARN: Type inference failed for: r0v0, types: [Y1.ag, Y1.r] */
    public static final Y1.ag alpha(Context context) {
        Intrinsics.echo(context, "context");
        ?? rVar = new Y1.r(context);
        androidx.navigation.internal.g gVar = rVar.bravo;
        Y1.au auVar = gVar.sierra;
        auVar.alpha(new Y1.af(auVar));
        gVar.sierra.alpha(new C0383h());
        gVar.sierra.alpha(new C0389n());
        return rVar;
    }

    public static final void bravo(C3338a c3338a, EnumC3339b from, InterfaceC2321ad scopeOwner, Ne.f name) {
        Intrinsics.echo(c3338a, "<this>");
        Intrinsics.echo(from, "from");
        Intrinsics.echo(scopeOwner, "scopeOwner");
        Intrinsics.echo(name, "name");
        ((se.ab) scopeOwner).teal.bravo();
        Intrinsics.delta(name.bravo(), "name.asString()");
    }
}
