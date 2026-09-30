package zendesk.support.requestlist;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationUtil;

/* loaded from: classes.dex */
public class RequestListConfiguration implements Configuration {
    private final List<Configuration> configurations;
    private final boolean contactUsButtonVisible;

    /* loaded from: classes.dex */
    public static class Builder {
        private List<Configuration> configurations = new ArrayList();
        private boolean contactUsButtonVisible = true;

        private void setConfigurations(List<Configuration> list) {
            this.configurations = list;
        }

        public Configuration config() {
            return new RequestListConfiguration(this, 0);
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withContactUsButtonVisible(boolean z2) {
            this.contactUsButtonVisible = z2;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            setConfigurations(list);
            Configuration config = config();
            Intent intent = new Intent(context, (Class<?>) RequestListActivity.class);
            ConfigurationUtil.addToIntent(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }
    }

    public /* synthetic */ RequestListConfiguration(Builder builder, int i4) {
        this(builder);
    }

    @Override // zendesk.configurations.Configuration
    @SuppressLint({"RestrictedApi"})
    public List<Configuration> getConfigurations() {
        return ConfigurationUtil.addSelfIfNotInList(this.configurations, this);
    }

    public boolean isContactUsButtonVisible() {
        return this.contactUsButtonVisible;
    }

    private RequestListConfiguration(Builder builder) {
        this.contactUsButtonVisible = builder.contactUsButtonVisible;
        this.configurations = builder.configurations;
    }
}
