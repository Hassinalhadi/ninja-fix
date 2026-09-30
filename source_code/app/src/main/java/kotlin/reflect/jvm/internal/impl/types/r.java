package kotlin.reflect.jvm.internal.impl.types;

import kotlin.jvm.internal.Intrinsics;
import qe.InterfaceC2472h;

/* loaded from: classes2.dex */
public final class r extends av {
    public final av bravo;
    public final av charlie;

    public r(av avVar, av avVar2) {
        this.bravo = avVar;
        this.charlie = avVar2;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final boolean alpha() {
        if (!this.bravo.alpha() && !this.charlie.alpha()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final boolean bravo() {
        if (!this.bravo.bravo() && !this.charlie.bravo()) {
            return false;
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final InterfaceC2472h charlie(InterfaceC2472h annotations) {
        Intrinsics.echo(annotations, "annotations");
        return this.charlie.charlie(this.bravo.charlie(annotations));
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final as delta(y yVar) {
        as delta = this.bravo.delta(yVar);
        if (delta == null) {
            return this.charlie.delta(yVar);
        }
        return delta;
    }

    @Override // kotlin.reflect.jvm.internal.impl.types.av
    public final y foxtrot(int i4, y topLevelType) {
        Intrinsics.echo(topLevelType, "topLevelType");
        com.google.android.material.datepicker.j.papa(i4, "position");
        return this.charlie.foxtrot(i4, this.bravo.foxtrot(i4, topLevelType));
    }
}
