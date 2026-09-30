package Yc;

import Nd.c;
import Pd.i;
import Xd.l;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC0627w;
import androidx.fragment.app.L;
import d3.k;
import kotlin.ResultKt;
import kotlin.Unit;
import vf.ab;
import vf.ad;

/* loaded from: classes2.dex */
public final class b extends i implements l {
    public int alpha;
    public final /* synthetic */ k purple;
    public final /* synthetic */ L red;
    public final /* synthetic */ String silver;
    public final /* synthetic */ DialogInterfaceOnCancelListenerC0627w teal;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(k kVar, L l10, String str, DialogInterfaceOnCancelListenerC0627w dialogInterfaceOnCancelListenerC0627w, c cVar) {
        super(2, cVar);
        this.purple = kVar;
        this.red = l10;
        this.silver = str;
        this.teal = dialogInterfaceOnCancelListenerC0627w;
    }

    @Override // Pd.a
    public final c create(Object obj, c cVar) {
        return new b(this.purple, this.red, this.silver, this.teal, cVar);
    }

    @Override // Xd.l
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((ab) obj, (c) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // Pd.a
    public final Object invokeSuspend(Object obj) {
        Od.a aVar = Od.a.alpha;
        int i4 = this.alpha;
        if (i4 != 0 && i4 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.alpha(obj);
        while (this.purple.getLifecycle().bravo().compareTo(androidx.lifecycle.ab.teal) < 0) {
            this.alpha = 1;
            if (ad.november(16L, this) == aVar) {
                return aVar;
            }
        }
        L l10 = this.red;
        if (!l10.jade()) {
            String str = this.silver;
            if (l10.blue(str) == null) {
                this.teal.romeo(l10, str);
            }
        }
        return Unit.INSTANCE;
    }
}
