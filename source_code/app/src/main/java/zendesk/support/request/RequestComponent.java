package zendesk.support.request;

import zendesk.support.ActivityScope;

@ActivityScope
/* loaded from: classes.dex */
public interface RequestComponent {
    void inject(RequestActivity requestActivity);

    void inject(RequestViewConversationsDisabled requestViewConversationsDisabled);

    void inject(RequestViewConversationsEnabled requestViewConversationsEnabled);
}
