package zendesk.classic.messaging;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import zendesk.configurations.Configuration;
import zendesk.configurations.ConfigurationHelper;

/* loaded from: classes.dex */
public class MessagingConfiguration implements Configuration {
    private static final String DEFAULT_AGENT_ID = "ANSWER_BOT";
    private AgentDetails botAgentDetails;
    private final int botAvatarDrawable;
    private final String botLabelString;
    private final int botLabelStringRes;
    private final List<Configuration> configurations;
    private final String engineRegistryKey;
    private final boolean multilineResponseOptionsEnabled;
    private final String toolbarTitle;
    private final int toolbarTitleRes;

    /* loaded from: classes.dex */
    public static class Builder {
        private String botLabelString;
        private String toolbarTitle;
        private List<Configuration> configurations = new ArrayList();
        private List<Engine> engines = new ArrayList();
        private int toolbarTitleRes = R.string.zui_toolbar_title;
        private int botLabelStringRes = R.string.zui_default_bot_name;
        private boolean multilineResponseOptionsEnabled = false;
        private int botAvatarDrawable = R.drawable.zui_avatar_bot_default;

        public Configuration config(Context context) {
            return new MessagingConfiguration(this, EngineListRegistry.INSTANCE.register(this.engines), 0);
        }

        public Intent intent(Context context, Configuration... configurationArr) {
            return intent(context, Arrays.asList(configurationArr));
        }

        public void show(Context context, Configuration... configurationArr) {
            context.startActivity(intent(context, configurationArr));
        }

        public Builder withBotAvatarDrawable(int i4) {
            this.botAvatarDrawable = i4;
            return this;
        }

        public Builder withBotLabelString(String str) {
            this.botLabelString = str;
            return this;
        }

        public Builder withBotLabelStringRes(int i4) {
            this.botLabelStringRes = i4;
            return this;
        }

        public Builder withEngines(List<Engine> list) {
            this.engines = list;
            return this;
        }

        public Builder withMultilineResponseOptionsEnabled(boolean z2) {
            this.multilineResponseOptionsEnabled = z2;
            return this;
        }

        public Builder withToolbarTitle(String str) {
            this.toolbarTitle = str;
            return this;
        }

        public Builder withToolbarTitleRes(int i4) {
            this.toolbarTitleRes = i4;
            return this;
        }

        @SuppressLint({"RestrictedApi"})
        public Intent intent(Context context, List<Configuration> list) {
            this.configurations = list;
            Configuration config = config(context);
            Intent intent = new Intent(context, (Class<?>) MessagingActivity.class);
            ConfigurationHelper.get().addToIntent(intent, config);
            return intent;
        }

        public void show(Context context, List<Configuration> list) {
            context.startActivity(intent(context, list));
        }

        public Builder withEngines(Engine... engineArr) {
            this.engines = Arrays.asList(engineArr);
            return this;
        }
    }

    public /* synthetic */ MessagingConfiguration(Builder builder, String str, int i4) {
        this(builder, str);
    }

    private String getBotLabelString(Resources resources) {
        if (StringUtils.hasLength(this.botLabelString)) {
            return this.botLabelString;
        }
        return resources.getString(this.botLabelStringRes);
    }

    public AgentDetails getBotAgentDetails(Resources resources) {
        if (this.botAgentDetails == null) {
            this.botAgentDetails = new AgentDetails(getBotLabelString(resources), DEFAULT_AGENT_ID, true, Integer.valueOf(this.botAvatarDrawable));
        }
        return this.botAgentDetails;
    }

    public int getBotAvatarDrawable() {
        return this.botAvatarDrawable;
    }

    @Override // zendesk.configurations.Configuration
    public List<Configuration> getConfigurations() {
        return ConfigurationHelper.get().addSelfIfNotInList(this.configurations, this);
    }

    public List<Engine> getEngines() {
        return EngineListRegistry.INSTANCE.retrieveEngineList(this.engineRegistryKey);
    }

    public String getToolbarTitle(Resources resources) {
        if (StringUtils.hasLength(this.toolbarTitle)) {
            return this.toolbarTitle;
        }
        return resources.getString(this.toolbarTitleRes);
    }

    public boolean isMultilineResponseOptionsEnabled() {
        return this.multilineResponseOptionsEnabled;
    }

    private MessagingConfiguration(Builder builder, String str) {
        this.configurations = builder.configurations;
        this.engineRegistryKey = str;
        this.toolbarTitle = builder.toolbarTitle;
        this.toolbarTitleRes = builder.toolbarTitleRes;
        this.botLabelString = builder.botLabelString;
        this.botLabelStringRes = builder.botLabelStringRes;
        this.botAvatarDrawable = builder.botAvatarDrawable;
        this.multilineResponseOptionsEnabled = builder.multilineResponseOptionsEnabled;
    }
}
