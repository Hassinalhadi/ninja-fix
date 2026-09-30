package F;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class y2 extends Lambda implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ androidx.compose.runtime.ax purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y2(androidx.compose.runtime.ax axVar, int i4) {
        super(1);
        this.alpha = i4;
        this.purple = axVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        androidx.compose.runtime.ax axVar = this.purple;
        switch (this.alpha) {
            case 0:
                s0.an anVar = (s0.an) obj;
                anVar.charlie();
                float lavender = anVar.lavender(((b.ab) axVar.getValue()).alpha);
                c0.b bVar = anVar.alpha;
                float bravo = Z.e.bravo(bVar.purple.oscar()) - (lavender / 2);
                ao.ad.india(anVar, ((b.ab) axVar.getValue()).bravo, t6.H2.alpha(0.0f, bravo), t6.H2.alpha(Z.e.delta(bVar.purple.oscar()), bravo), lavender, 0.0f, 496);
                return Unit.INSTANCE;
            default:
                Configuration configuration = new Configuration((Configuration) obj);
                androidx.compose.runtime.aa aaVar = AndroidCompositionLocals_androidKt.alpha;
                axVar.setValue(configuration);
                return Unit.INSTANCE;
        }
    }
}
