package s0;

import java.util.Map;
import kotlin.jvm.functions.Function1;

/* loaded from: classes3.dex */
public final class as implements q0.aq {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ int bravo;
    public final /* synthetic */ Map charlie;
    public final /* synthetic */ B2.ap delta;
    public final /* synthetic */ Function1 echo;
    public final /* synthetic */ at foxtrot;

    public as(int i4, int i5, Map map, B2.ap apVar, Function1 function1, at atVar) {
        this.alpha = i4;
        this.bravo = i5;
        this.charlie = map;
        this.delta = apVar;
        this.echo = function1;
        this.foxtrot = atVar;
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
        this.echo.invoke(this.foxtrot.e);
    }

    @Override // q0.aq
    public final Function1 echo() {
        return this.delta;
    }
}
