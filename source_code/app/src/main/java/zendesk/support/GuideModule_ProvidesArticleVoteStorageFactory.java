package zendesk.support;

import dagger.internal.b;
import s6.AbstractC2763s0;

/* loaded from: classes.dex */
public final class GuideModule_ProvidesArticleVoteStorageFactory implements b {
    private final GuideModule module;

    public GuideModule_ProvidesArticleVoteStorageFactory(GuideModule guideModule) {
        this.module = guideModule;
    }

    public static GuideModule_ProvidesArticleVoteStorageFactory create(GuideModule guideModule) {
        return new GuideModule_ProvidesArticleVoteStorageFactory(guideModule);
    }

    public static ArticleVoteStorage providesArticleVoteStorage(GuideModule guideModule) {
        ArticleVoteStorage providesArticleVoteStorage = guideModule.providesArticleVoteStorage();
        AbstractC2763s0.delta(providesArticleVoteStorage);
        return providesArticleVoteStorage;
    }

    @Override // Kd.a
    public ArticleVoteStorage get() {
        return providesArticleVoteStorage(this.module);
    }
}
