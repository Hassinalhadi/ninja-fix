package Gc;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import delivery.samurai.android.ui.support.ZenDeskChatActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import zendesk.support.UploadResponse;

/* loaded from: classes2.dex */
public final class x extends ZendeskCallback {
    public final /* synthetic */ ZenDeskChatActivity alpha;
    public final /* synthetic */ Function0 bravo;

    public x(ZenDeskChatActivity zenDeskChatActivity, Function0 function0) {
        this.alpha = zenDeskChatActivity;
        this.bravo = function0;
    }

    @Override // com.zendesk.service.ZendeskCallback
    public final void onError(ErrorResponse errorResponse) {
        String reason;
        if (errorResponse != null && (reason = errorResponse.getReason()) != null) {
            L9.d.pink(this.alpha, reason);
        }
    }

    @Override // com.zendesk.service.ZendeskCallback
    public final void onSuccess(Object obj) {
        String str;
        UploadResponse uploadResponse = (UploadResponse) obj;
        ArrayList arrayList = this.alpha.Q;
        if (uploadResponse != null) {
            str = uploadResponse.getToken();
        } else {
            str = null;
        }
        arrayList.add(str);
        this.bravo.invoke();
    }
}
