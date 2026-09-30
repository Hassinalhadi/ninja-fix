package x;

import android.net.Uri;
import androidx.compose.runtime.D0;
import androidx.fragment.app.an;
import bz.C0790o;
import com.checkout.components.core.common.components.DynamicComponentFactoriesProvider;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import s0.AbstractC2555o;
import s0.AbstractC2557q;
import x9.AbstractC3307a;
import x9.AbstractC3309c;
import y.al;
import zendesk.classic.messaging.MessagingActivity;

/* loaded from: classes3.dex */
public final /* synthetic */ class j implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ Object purple;

    public /* synthetic */ j(int i4, Object obj) {
        this.alpha = i4;
        this.purple = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Map a6;
        Uri lambda$onCreate$0;
        Object obj = this.purple;
        switch (this.alpha) {
            case 0:
                l lVar = (l) obj;
                lVar.e = null;
                AbstractC2555o.golf(lVar).coral();
                AbstractC2555o.golf(lVar).blue();
                AbstractC2557q.india(lVar);
                return Boolean.TRUE;
            case 1:
                an activity = ((AbstractC3307a) obj).getActivity();
                Intrinsics.charlie(activity, "null cannot be cast to non-null type com.app.base.BaseActivity");
                return (d3.k) activity;
            case 2:
                an activity2 = ((AbstractC3309c) obj).getActivity();
                Intrinsics.charlie(activity2, "null cannot be cast to non-null type com.app.base.BaseActivity");
                return (d3.k) activity2;
            case 3:
                C0790o c0790o = al.alpha;
                return new Z.b(((Z.b) ((D0) obj).getValue()).alpha);
            case 4:
                a6 = DynamicComponentFactoriesProvider.a((DynamicComponentFactoriesProvider) obj);
                return a6;
            default:
                lambda$onCreate$0 = ((MessagingActivity) obj).lambda$onCreate$0();
                return lambda$onCreate$0;
        }
    }
}
