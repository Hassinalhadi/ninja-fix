package Vc;

import com.app.network.network.models.Transaction;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.MatchResult;

/* loaded from: classes2.dex */
public final /* synthetic */ class m implements Function1 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ List purple;

    public /* synthetic */ m(int i4, List list) {
        this.alpha = i4;
        this.purple = list;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.alpha) {
            case 0:
                Transaction it = (Transaction) obj;
                Intrinsics.echo(it, "it");
                String id2 = it.getId();
                if (id2 == null) {
                    return Integer.valueOf(this.purple.indexOf(it));
                }
                return id2;
            default:
                MatchResult matchResult = (MatchResult) obj;
                Intrinsics.echo(matchResult, "matchResult");
                return (CharSequence) this.purple.get(Integer.parseInt(matchResult.getGroupValues().get(1)) - 1);
        }
    }
}
