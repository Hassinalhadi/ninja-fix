package C1;

import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* loaded from: classes3.dex */
public final class m extends Lambda implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ ap purple;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m(ap apVar, int i4) {
        super(0);
        this.alpha = i4;
        this.purple = apVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.alpha) {
            case 0:
                return ((E1.i) this.purple.juliet.getValue()).charlie;
            default:
                E1.f fVar = this.purple.alpha;
                String romeo = ((Tf.ah) fVar.delta.getValue()).alpha.romeo();
                synchronized (E1.f.foxtrot) {
                    LinkedHashSet linkedHashSet = E1.f.echo;
                    if (!linkedHashSet.contains(romeo)) {
                        linkedHashSet.add(romeo);
                    } else {
                        throw new IllegalStateException(("There are multiple DataStores active for the same file: " + romeo + ". You should either maintain your DataStore as a singleton or confirm that there is no two DataStore's active on the same file (by confirming that the scope is cancelled).").toString());
                    }
                }
                return new E1.i(fVar.alpha, (Tf.ah) fVar.delta.getValue(), (A) fVar.bravo.invoke((Tf.ah) fVar.delta.getValue(), fVar.alpha), new E1.e(fVar, 1));
        }
    }
}
