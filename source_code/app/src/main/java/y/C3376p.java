package y;

import android.content.Context;
import android.view.textclassifier.TextClassificationContext;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;

/* renamed from: y.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3376p extends Pd.i implements Xd.l {
    public final /* synthetic */ C3379s alpha;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3376p(C3379s c3379s, Nd.c cVar) {
        super(2, cVar);
        this.alpha = c3379s;
    }

    @Override // Pd.a
    public final Nd.c create(Object obj, Nd.c cVar) {
        return new C3376p(this.alpha, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((C3376p) create((vf.ab) obj, (Nd.c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        String str;
        TextClassificationContext build;
        TextClassifier createTextClassificationSession;
        Od.a aVar = Od.a.alpha;
        ResultKt.alpha(obj);
        C3379s c3379s = this.alpha;
        Class mike = vg.al.mike();
        Context context = c3379s.bravo;
        TextClassificationManager juliet = vg.al.juliet(context.getSystemService(mike));
        int i4 = ap.$EnumSwitchMapping$0[c3379s.charlie.ordinal()];
        if (i4 != 1) {
            if (i4 == 2) {
                str = "textview";
            } else {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            str = "edittext";
        }
        q1.c.black();
        build = q1.c.kilo(context.getPackageName(), str).build();
        createTextClassificationSession = juliet.createTextClassificationSession(build);
        c3379s.foxtrot = createTextClassificationSession;
        return createTextClassificationSession;
    }
}
