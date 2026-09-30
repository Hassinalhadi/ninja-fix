package J2;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class s {
    public final String alpha;
    public final String bravo;

    public s(String tag, String workSpecId) {
        Intrinsics.echo(tag, "tag");
        Intrinsics.echo(workSpecId, "workSpecId");
        this.alpha = tag;
        this.bravo = workSpecId;
    }
}
