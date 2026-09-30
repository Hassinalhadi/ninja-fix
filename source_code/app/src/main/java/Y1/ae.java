package Y1;

import android.os.Bundle;
import androidx.compose.foundation.lazy.layout.B;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import s0.i0;
import s0.j0;

/* loaded from: classes3.dex */
public final /* synthetic */ class ae implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Ref.ObjectRef purple;

    public /* synthetic */ ae(Ref.ObjectRef objectRef, int i4) {
        this.alpha = i4;
        this.purple = objectRef;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        boolean z2 = false;
        Ref.ObjectRef objectRef = this.purple;
        switch (this.alpha) {
            case 0:
                String key = (String) obj;
                Intrinsics.echo(key, "key");
                Object obj2 = objectRef.alpha;
                if (obj2 == null || !((Bundle) obj2).containsKey(key)) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            default:
                j0 j0Var = (j0) obj;
                Intrinsics.charlie(j0Var, "null cannot be cast to non-null type androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode");
                androidx.compose.foundation.lazy.layout.ai aiVar = ((B) j0Var).alpha;
                List list = (List) objectRef.alpha;
                if (list != null) {
                    list.add(aiVar);
                } else {
                    list = CollectionsKt.white(aiVar);
                }
                objectRef.alpha = list;
                return i0.purple;
        }
    }
}
