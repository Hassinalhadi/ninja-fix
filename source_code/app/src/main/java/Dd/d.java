package Dd;

import Af.t;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.x;
import s6.F4;

/* loaded from: classes2.dex */
public final class d {
    public static final ArrayList echo = new ArrayList();
    public final t alpha;
    public final F4 bravo;
    public List charlie;
    public boolean delta;

    public d(t phase, F4 f42) {
        Intrinsics.echo(phase, "phase");
        ArrayList arrayList = echo;
        Intrinsics.charlie(arrayList, "null cannot be cast to non-null type kotlin.collections.MutableList<@[ExtensionFunctionType] kotlin.coroutines.SuspendFunction2<io.ktor.util.pipeline.PipelineContext<TSubject of io.ktor.util.pipeline.PhaseContent, Call of io.ktor.util.pipeline.PhaseContent>, TSubject of io.ktor.util.pipeline.PhaseContent, kotlin.Unit>>");
        x.bravo(arrayList);
        this.alpha = phase;
        this.bravo = f42;
        this.charlie = arrayList;
        this.delta = true;
        if (arrayList.isEmpty()) {
        } else {
            throw new IllegalStateException("The shared empty array list has been modified");
        }
    }

    public final String toString() {
        return "Phase `" + this.alpha.purple + "`, " + this.charlie.size() + " handlers";
    }
}
