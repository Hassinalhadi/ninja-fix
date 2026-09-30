package B2;

import android.os.Build;
import android.os.Trace;
import androidx.work.impl.WorkerStoppedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import t6.P2;
import w2.AbstractC3235a;

/* loaded from: classes3.dex */
public final class am extends Lambda implements Function1 {
    public final /* synthetic */ A2.y alpha;
    public final /* synthetic */ boolean purple;
    public final /* synthetic */ String red;
    public final /* synthetic */ ao silver;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am(A2.y yVar, boolean z2, String str, ao aoVar) {
        super(1);
        this.alpha = yVar;
        this.purple = z2;
        this.red = str;
        this.silver = aoVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        Throwable th = (Throwable) obj;
        if (th instanceof WorkerStoppedException) {
            this.alpha.stop(((WorkerStoppedException) th).getReason());
        }
        if (this.purple && (str = this.red) != null) {
            ao aoVar = this.silver;
            A2.a aVar = aoVar.foxtrot;
            int hashCode = aoVar.alpha.hashCode();
            aVar.mike.getClass();
            if (Build.VERSION.SDK_INT >= 29) {
                AbstractC3235a.bravo(hashCode, P2.foxtrot(str));
            } else {
                String foxtrot = P2.foxtrot(str);
                try {
                    if (P2.delta == null) {
                        P2.delta = Trace.class.getMethod("asyncTraceEnd", Long.TYPE, String.class, Integer.TYPE);
                    }
                    P2.delta.invoke(null, Long.valueOf(P2.alpha), foxtrot, Integer.valueOf(hashCode));
                } catch (Exception e) {
                    P2.charlie("asyncTraceEnd", e);
                }
            }
        }
        return Unit.INSTANCE;
    }
}
