package zendesk.support.guide;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public interface GuideSdkComponent {
    void inject(GuideSdkDependencyProvider guideSdkDependencyProvider);

    void inject(HelpCenterActivity helpCenterActivity);

    void inject(HelpCenterFragment helpCenterFragment);

    void inject(ViewArticleActivity viewArticleActivity);
}
