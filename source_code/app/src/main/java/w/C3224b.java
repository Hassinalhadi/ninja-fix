package w;

import a0.C0347ag;
import androidx.compose.runtime.t0;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import q0.z;

/* renamed from: w.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C3224b extends kotlin.jvm.internal.i implements Function1 {
    public final /* synthetic */ q alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3224b(q qVar) {
        super(1, kotlin.jvm.internal.j.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.alpha = qVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float[] fArr = ((C0347ag) obj).alpha;
        z zVar = (z) ((t0) this.alpha.silver).getValue();
        if (zVar != null) {
            if (!zVar.india()) {
                zVar = null;
            }
            if (zVar != null) {
                zVar.juliet(fArr);
            }
        }
        return Unit.INSTANCE;
    }
}
