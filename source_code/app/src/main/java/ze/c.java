package ze;

import com.clevertap.android.sdk.Constants;
import kotlin.Pair;
import kotlin.collections.y;
import kotlin.jvm.internal.Intrinsics;
import me.m;
import t6.AbstractC3062u;
import ve.AbstractC3192d;
import ve.C3193e;
import ye.ab;

/* loaded from: classes2.dex */
public abstract class c {
    public static final Ne.f alpha = Ne.f.echo(Constants.KEY_MESSAGE);
    public static final Ne.f bravo = Ne.f.echo("allowedTargets");
    public static final Ne.f charlie = Ne.f.echo("value");
    public static final Object delta = y.sierra(new Pair(m.tango, ab.charlie), new Pair(m.whiskey, ab.delta), new Pair(m.xray, ab.foxtrot));

    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.Map, java.lang.Object] */
    public static Ae.h alpha(Ne.c kotlinName, Ee.b annotationOwner, B9.ab c3) {
        C3193e alpha2;
        Intrinsics.echo(kotlinName, "kotlinName");
        Intrinsics.echo(annotationOwner, "annotationOwner");
        Intrinsics.echo(c3, "c");
        if (Intrinsics.areEqual(kotlinName, m.mike)) {
            Ne.c DEPRECATED_ANNOTATION = ab.echo;
            Intrinsics.delta(DEPRECATED_ANNOTATION, "DEPRECATED_ANNOTATION");
            C3193e alpha3 = annotationOwner.alpha(DEPRECATED_ANNOTATION);
            if (alpha3 != null) {
                return new g(alpha3, c3);
            }
        }
        Ne.c cVar = (Ne.c) delta.get(kotlinName);
        if (cVar != null && (alpha2 = annotationOwner.alpha(cVar)) != null) {
            return bravo(c3, alpha2, false);
        }
        return null;
    }

    public static Ae.h bravo(B9.ab c3, C3193e annotation, boolean z2) {
        Intrinsics.echo(annotation, "annotation");
        Intrinsics.echo(c3, "c");
        Ne.b alpha2 = AbstractC3192d.alpha(AbstractC3062u.bravo(AbstractC3062u.alpha(annotation.alpha)));
        if (Intrinsics.areEqual(alpha2, Ne.b.juliet(ab.charlie))) {
            return new j(annotation, c3);
        }
        if (Intrinsics.areEqual(alpha2, Ne.b.juliet(ab.delta))) {
            return new i(annotation, c3);
        }
        if (Intrinsics.areEqual(alpha2, Ne.b.juliet(ab.foxtrot))) {
            return new b(c3, annotation, m.xray);
        }
        if (Intrinsics.areEqual(alpha2, Ne.b.juliet(ab.echo))) {
            return null;
        }
        return new Ce.f(c3, annotation, z2);
    }
}
