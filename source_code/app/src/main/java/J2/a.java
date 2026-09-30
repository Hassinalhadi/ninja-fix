package J2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class a {
    public final String alpha;
    public final String bravo;

    public a(String str, String prerequisiteId) {
        Intrinsics.echo(prerequisiteId, "prerequisiteId");
        this.alpha = str;
        this.bravo = prerequisiteId;
    }
}
