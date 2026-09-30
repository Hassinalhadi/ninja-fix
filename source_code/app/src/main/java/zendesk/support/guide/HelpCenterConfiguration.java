package zendesk.support.guide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import com.zendesk.logger.Logger;
import com.zendesk.util.CollectionUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import zendesk.classic.messaging.Engine;
import zendesk.classic.messaging.EngineListRegistry;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationHelper;

/* loaded from: classes.dex */
public class HelpCenterConfiguration implements Configuration {
    private final List<Long> categoryIds;
    private final boolean collapseCategories;
    private List<Configuration> configurations;
    private final boolean contactUsButtonVisibility;
    private final String engineRegistryId;
    private final String[] labelNames;
    private final List<Long> sectionIds;
    private final boolean showConversationsMenuButton;

    /* loaded from: classes.dex */
    public static class Builder {
        private List<Long> categoryIds;
        private boolean collapseCategories;
        private List<Configuration> configurations;
        private boolean contactUsButtonVisible;
        private List<Engine> engines;
        private String[] labelNames;
        private List<Long> sectionIds;
        private boolean showConversationsMenuButton;

        public Builder() {
            List list = Collections.EMPTY_LIST;
            this.categoryIds = list;
            this.sectionIds = list;
            this.labelNames = new String[0];
            this.engines = list;
            this.contactUsButtonVisible = true;
            this.collapseCategories = false;
            this.showConversationsMenuButton = true;
            this.configurations = new ArrayList();
        }

        private void setConfigurations(List<Configuration> list) {
            this.configurations = list;
            HelpCenterConfiguration helpCenterConfiguration = (HelpCenterConfiguration) ConfigurationHelper.get().findConfigForType(list, HelpCenterConfiguration.class);
            if (helpCenterConfiguration != null) {
                this.contactUsButtonVisible = helpCenterConfiguration.contactUsButtonVisibility;
                this.categoryIds = helpCenterConfiguration.categoryIds;
                this.sectionIds = helpCenterConfiguration.sectionIds;
                this.collapseCategories = helpCenterConfiguration.collapseCategories;
                this.labelNames = helpCenterConfiguration.labelNames;
                this.engines = EngineListRegistry.INSTANCE.retrieveEngineList(helpCenterConfiguration.engineRegistryId);
                this.showConversationsMenuButton = helpCenterConfiguration.showConversationsMenuButton;
            }
        }

        public Configuration config() {
            return new HelpCenterConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines), 0);
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withArticlesForCategoryIds(Long... lArr) {
            return withArticlesForCategoryIds(Arrays.asList(lArr));
        }

        public Builder withArticlesForSectionIds(Long... lArr) {
            return withArticlesForSectionIds(Arrays.asList(lArr));
        }

        public Builder withCategoriesCollapsed(boolean z2) {
            this.collapseCategories = z2;
            return this;
        }

        public Builder withContactUsButtonVisible(boolean z2) {
            this.contactUsButtonVisible = z2;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Builder withLabelNames(String... strArr) {
            if (CollectionUtils.isNotEmpty(strArr)) {
                this.labelNames = strArr;
            }
            return this;
        }

        public Builder withShowConversationsMenuButton(boolean z2) {
            this.showConversationsMenuButton = z2;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Intent intent = new Intent(context, (Class<?>) HelpCenterActivity.class);
            ConfigurationHelper.get().addToIntent(intent, config());
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withArticlesForCategoryIds(List<Long> list) {
            if (this.sectionIds.size() > 0) {
                Logger.w("HelpCenterActivity", "Builder: sections have already been specified. Removing section IDs to set category IDs.", new Object[0]);
                this.sectionIds = Collections.EMPTY_LIST;
            }
            this.categoryIds = CollectionUtils.copyOf(list);
            return this;
        }

        public Builder withArticlesForSectionIds(List<Long> list) {
            if (this.categoryIds.size() > 0) {
                Logger.w("HelpCenterActivity", "Builder: categories have already been specified. Removing category IDs to set section IDs.", new Object[0]);
                this.categoryIds = Collections.EMPTY_LIST;
            }
            this.sectionIds = CollectionUtils.copyOf(list);
            return this;
        }

        public Builder withEngines(Engine... engineArr) {
            return withEngines(Arrays.asList(engineArr));
        }

        public Builder withLabelNames(List<String> list) {
            return withLabelNames((String[]) list.toArray(new String[0]));
        }
    }

    public /* synthetic */ HelpCenterConfiguration(Builder builder, String str, int i4) {
        this(builder, str);
    }

    public List<Long> getCategoryIds() {
        return this.categoryIds;
    }

    @Override // zendesk.configurations.Configuration
    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return ConfigurationHelper.get().addSelfIfNotInList(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryId);
    }

    public String[] getLabelNames() {
        return this.labelNames;
    }

    public List<Long> getSectionIds() {
        return this.sectionIds;
    }

    public boolean isCollapseCategories() {
        return this.collapseCategories;
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisibility;
    }

    public boolean isShowConversationsMenuButton() {
        return this.showConversationsMenuButton;
    }

    private HelpCenterConfiguration(Builder builder, String str) {
        this.categoryIds = builder.categoryIds;
        this.sectionIds = builder.sectionIds;
        this.labelNames = builder.labelNames;
        this.contactUsButtonVisibility = builder.contactUsButtonVisible;
        this.collapseCategories = builder.collapseCategories;
        this.showConversationsMenuButton = builder.showConversationsMenuButton;
        this.configurations = builder.configurations;
        this.engineRegistryId = str;
    }
}
