package L9;

import com.zendesk.service.ErrorResponse;
import com.zendesk.service.ZendeskCallback;
import kotlin.jvm.internal.Intrinsics;
import z3.C3462a;

/* loaded from: classes2.dex */
public final class b extends ZendeskCallback {
    public final /* synthetic */ int alpha;

    @Override // com.zendesk.service.ZendeskCallback
    public final void onError(ErrorResponse errorResponse) {
        switch (this.alpha) {
            case 0:
                Intrinsics.echo(errorResponse, "errorResponse");
                C3462a.alpha("ZENDESK", 12, errorResponse.getResponseBody(), null);
                return;
            default:
                Intrinsics.echo(errorResponse, "errorResponse");
                C3462a.alpha("ZENDESK", 12, errorResponse.getResponseBody(), null);
                return;
        }
    }

    @Override // com.zendesk.service.ZendeskCallback
    public final void onSuccess(Object obj) {
        switch (this.alpha) {
            case 0:
                C3462a.alpha("ZENDESK", 12, (String) obj, null);
                return;
            default:
                C3462a.alpha("ZENDESK", 12, String.valueOf((Void) obj), null);
                return;
        }
    }
}
