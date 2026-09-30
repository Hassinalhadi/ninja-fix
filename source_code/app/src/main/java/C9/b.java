package C9;

import android.content.Intent;
import com.clevertap.android.sdk.Constants;
import d3.k;
import delivery.samurai.android.ui.envelop.EnvelopsListingActivity;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* loaded from: classes2.dex */
public final /* synthetic */ class b implements Function0 {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ c purple;
    public final /* synthetic */ String red;

    public /* synthetic */ b(c cVar, String str, int i4) {
        this.alpha = i4;
        this.purple = cVar;
        this.red = str;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        Intent intent = null;
        String str = this.red;
        c cVar = this.purple;
        switch (this.alpha) {
            case 0:
                k kVar = cVar.alpha;
                if (str != null) {
                    int i4 = EnvelopsListingActivity.f12251M;
                    intent = W8.a.golf(kVar, str);
                }
                kVar.startActivity(intent);
                return Unit.INSTANCE;
            default:
                k kVar2 = cVar.alpha;
                if (str != null) {
                    int i5 = ZenDeskChatActivity.f12498T;
                    intent = new Intent(kVar2, (Class<?>) ZenDeskChatActivity.class);
                    intent.putExtra(Constants.KEY_ID, str);
                }
                kVar2.startActivity(intent);
                return Unit.INSTANCE;
        }
    }
}
