package N8;

import androidx.recyclerview.widget.RecyclerView;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class j {
    public final o alpha;
    public final o bravo;

    public j(o localOverrideSettings, o remoteSettings) {
        Intrinsics.echo(localOverrideSettings, "localOverrideSettings");
        Intrinsics.echo(remoteSettings, "remoteSettings");
        this.alpha = localOverrideSettings;
        this.bravo = remoteSettings;
    }

    public final double alpha() {
        Double delta = this.alpha.delta();
        if (delta != null) {
            double doubleValue = delta.doubleValue();
            if (0.0d <= doubleValue && doubleValue <= 1.0d) {
                return doubleValue;
            }
        }
        Double delta2 = this.bravo.delta();
        if (delta2 != null) {
            double doubleValue2 = delta2.doubleValue();
            if (0.0d <= doubleValue2 && doubleValue2 <= 1.0d) {
                return doubleValue2;
            }
        }
        return 1.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0054, code lost:
    
        if (r6.alpha(r0) != r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object bravo(Pd.c cVar) {
        i iVar;
        int i4;
        j jVar;
        if (cVar instanceof i) {
            iVar = (i) cVar;
            int i5 = iVar.silver;
            if ((i5 & RecyclerView.UNDEFINED_DURATION) != 0) {
                iVar.silver = i5 - RecyclerView.UNDEFINED_DURATION;
                Object obj = iVar.purple;
                Od.a aVar = Od.a.alpha;
                i4 = iVar.silver;
                if (i4 == 0) {
                    if (i4 != 1) {
                        if (i4 == 2) {
                            ResultKt.alpha(obj);
                            return Unit.INSTANCE;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    jVar = iVar.alpha;
                    ResultKt.alpha(obj);
                } else {
                    ResultKt.alpha(obj);
                    iVar.alpha = this;
                    iVar.silver = 1;
                    if (this.alpha.alpha(iVar) != aVar) {
                        jVar = this;
                    }
                    return aVar;
                }
                o oVar = jVar.bravo;
                iVar.alpha = null;
                iVar.silver = 2;
            }
        }
        iVar = new i(this, cVar);
        Object obj2 = iVar.purple;
        Od.a aVar2 = Od.a.alpha;
        i4 = iVar.silver;
        if (i4 == 0) {
        }
        o oVar2 = jVar.bravo;
        iVar.alpha = null;
        iVar.silver = 2;
    }
}
