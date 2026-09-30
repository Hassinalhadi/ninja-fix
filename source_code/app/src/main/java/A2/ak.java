package A2;

import java.util.Set;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class ak {
    public final UUID alpha;
    public final J2.p bravo;
    public final Set charlie;

    public ak(UUID id2, J2.p workSpec, Set tags) {
        Intrinsics.echo(id2, "id");
        Intrinsics.echo(workSpec, "workSpec");
        Intrinsics.echo(tags, "tags");
        this.alpha = id2;
        this.bravo = workSpec;
        this.charlie = tags;
    }
}
