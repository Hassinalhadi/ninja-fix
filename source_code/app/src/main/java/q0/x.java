package q0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class x implements aq {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ Map charlie;
    public final /* synthetic */ B2.ap delta;

    public x(int i4, int i5, Map map, B2.ap apVar) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = map;
        this.delta = apVar;
    }

    @Override // q0.aq
    public final int alpha() {
        return this.bravo;
    }

    @Override // q0.aq
    public final int bravo() {
        return this.alpha;
    }

    @Override // q0.aq
    public final Map charlie() {
        return this.charlie;
    }

    @Override // q0.aq
    public final void delta() {
    }

    @Override // q0.aq
    public final Function1 echo() {
        return this.delta;
    }
}
