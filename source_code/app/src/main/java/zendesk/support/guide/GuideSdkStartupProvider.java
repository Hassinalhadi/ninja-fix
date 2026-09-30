package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import zendesk.core.ActionHandlerRegistry;
import zendesk.core.SdkStartUpProvider;
import zendesk.core.Zendesk;

@SuppressLint({"RestrictedApi"})
/* loaded from: classes.dex */
public class GuideSdkStartupProvider extends SdkStartUpProvider {
    ViewArticleActionHandler articleActionHandler;

    @Override // zendesk.core.SdkStartUpProvider
    public void onStartUp(Context context) {
        ActionHandlerRegistry actionHandlerRegistry = Zendesk.INSTANCE.actionHandlerRegistry();
        ViewArticleActionHandler viewArticleActionHandler = this.articleActionHandler;
        if (viewArticleActionHandler != null) {
            actionHandlerRegistry.remove(viewArticleActionHandler);
        }
        ViewArticleActionHandler viewArticleActionHandler2 = new ViewArticleActionHandler();
        this.articleActionHandler = viewArticleActionHandler2;
        actionHandlerRegistry.add(viewArticleActionHandler2);
    }
}
