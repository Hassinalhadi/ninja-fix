package zendesk.support.guide;

import dagger.internal.b;
import s6.AbstractC2763s0;
import zendesk.core.ActionHandler;

/* loaded from: classes.dex */
public final class GuideSdkModule_ViewArticleActionHandlerFactory implements b {

    /* loaded from: classes.dex */
    public static final class InstanceHolder {
        private static final GuideSdkModule_ViewArticleActionHandlerFactory INSTANCE = new GuideSdkModule_ViewArticleActionHandlerFactory();

        private InstanceHolder() {
        }
    }

    public static GuideSdkModule_ViewArticleActionHandlerFactory create() {
        return InstanceHolder.INSTANCE;
    }

    public static ActionHandler viewArticleActionHandler() {
        ActionHandler viewArticleActionHandler = GuideSdkModule.viewArticleActionHandler();
        AbstractC2763s0.delta(viewArticleActionHandler);
        return viewArticleActionHandler;
    }

    @Override // Kd.a
    public ActionHandler get() {
        return viewArticleActionHandler();
    }
}
