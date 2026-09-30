package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.zendesk.util.CollectionUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.EngineListRegistry;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationHelper;
import zendesk.support.Article;

/* loaded from: classes.dex */
public class ArticleConfiguration implements Configuration {
    static final int ARTICLE_ID = 1;
    static final int ARTICLE_MODEL = 2;
    static final int UNKNOWN = -1;
    private final ArticleViewModel article;
    private final long articleId;
    private final int configurationState;
    private final List<Configuration> configurations;
    private final boolean contactUsVisible;
    private final String engineRegistryId;

    /* loaded from: classes.dex */
    public static class Builder {
        private ArticleViewModel article;
        private long articleId;
        private int configurationState;
        private List<Configuration> configurations;
        private boolean contactUsVisible = true;
        private List<Engine> engines;

        public Builder(long j5) {
            List list = Collections.EMPTY_LIST;
            this.configurations = list;
            this.engines = list;
            this.articleId = j5;
            this.configurationState = 1;
        }

        private void setConfigurations(List<Configuration> list) {
            if (CollectionUtils.isNotEmpty(list)) {
                this.configurations = list;
                ArticleConfiguration articleConfiguration = (ArticleConfiguration) ConfigurationHelper.get().findConfigForType(list, ArticleConfiguration.class);
                if (articleConfiguration != null) {
                    this.contactUsVisible = articleConfiguration.isContactUsButtonVisible();
                    this.engines = EngineListRegistry.INSTANCE.retrieveEngineList(articleConfiguration.engineRegistryId);
                }
            }
        }

        public Configuration config() {
            return new ArticleConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines), 0);
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withContactUsButtonVisible(boolean z2) {
            this.contactUsVisible = z2;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Configuration config = config();
            Intent intent = new Intent(context, (Class<?>) ViewArticleActivity.class);
            ConfigurationHelper.get().addToIntent(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(Engine... engineArr) {
            return withEngines(Arrays.asList(engineArr));
        }

        public Builder(Article article) {
            List list = Collections.EMPTY_LIST;
            this.configurations = list;
            this.engines = list;
            this.article = new ArticleViewModel(article);
            this.configurationState = 2;
        }

        public Builder() {
            List list = Collections.EMPTY_LIST;
            this.configurations = list;
            this.engines = list;
            this.configurationState = -1;
        }
    }

    public /* synthetic */ ArticleConfiguration(Builder builder, String str, int i4) {
        this(builder, str);
    }

    public ArticleViewModel getArticle() {
        return this.article;
    }

    public long getArticleId() {
        return this.articleId;
    }

    public int getConfigurationState() {
        return this.configurationState;
    }

    @Override // zendesk.configurations.Configuration
    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return ConfigurationHelper.get().addSelfIfNotInList(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryId);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsVisible;
    }

    private ArticleConfiguration(Builder builder, String str) {
        this.configurationState = builder.configurationState;
        this.article = builder.article;
        this.articleId = builder.articleId;
        this.contactUsVisible = builder.contactUsVisible;
        this.configurations = builder.configurations;
        this.engineRegistryId = str;
    }
}
