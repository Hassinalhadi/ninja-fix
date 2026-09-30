package s5;

import com.clevertap.android.sdk.inapp.InAppActionHandler;
import com.clevertap.android.sdk.inapp.customtemplates.CustomTemplateContext;
import com.clevertap.android.sdk.inapp.customtemplates.FunctionPresenter;
import com.clevertap.android.sdk.inapp.customtemplates.system.OpenUrlTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.system.PlayStoreAppRatingTemplate;
import com.clevertap.android.sdk.inapp.customtemplates.system.PushPermissionTemplate;

/* renamed from: s5.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2599a implements FunctionPresenter {
    public final /* synthetic */ int alpha;
    public final /* synthetic */ InAppActionHandler bravo;

    public /* synthetic */ C2599a(InAppActionHandler inAppActionHandler, int i4) {
        this.alpha = i4;
        this.bravo = inAppActionHandler;
    }

    @Override // com.clevertap.android.sdk.inapp.customtemplates.CustomTemplatePresenter
    public final void onPresent(CustomTemplateContext.FunctionContext functionContext) {
        switch (this.alpha) {
            case 0:
                OpenUrlTemplate.createTemplate$lambda$1$lambda$0(this.bravo, functionContext);
                return;
            case 1:
                PlayStoreAppRatingTemplate.createTemplate$lambda$3$lambda$2(this.bravo, functionContext);
                return;
            default:
                PushPermissionTemplate.createTemplate$lambda$1$lambda$0(this.bravo, functionContext);
                return;
        }
    }
}
