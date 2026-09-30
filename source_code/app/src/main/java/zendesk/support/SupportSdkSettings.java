package zendesk.support;

import com.zendesk.util.CollectionUtils;
import com.zendesk.util.StringUtils;
import java.util.ArrayList;
import java.util.List;
import zendesk.core.AuthenticationType;

/* loaded from: classes.dex */
public class SupportSdkSettings {
    private final AuthenticationType authenticationType;
    private final HelpCenterSettings helpCenterSettings;
    private final SupportSettings mobileSettings;

    public SupportSdkSettings(SupportSettings supportSettings, HelpCenterSettings helpCenterSettings, AuthenticationType authenticationType) {
        this.mobileSettings = supportSettings;
        this.helpCenterSettings = helpCenterSettings;
        this.authenticationType = authenticationType;
    }

    private AttachmentSettings getAttachmentSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getAttachments() != null) {
            return this.mobileSettings.getAttachments();
        }
        return null;
    }

    private ConversationsSettings getConversationsSettings() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getConversations() != null) {
            return this.mobileSettings.getConversations();
        }
        return null;
    }

    public AuthenticationType getAuthenticationType() {
        return this.authenticationType;
    }

    public List<String> getContactZendeskTags() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getContactUs() != null && CollectionUtils.isNotEmpty(this.mobileSettings.getContactUs().getTags())) {
            return this.mobileSettings.getContactUs().getTags();
        }
        return new ArrayList();
    }

    public String getHelpCenterLocale() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        if (helpCenterSettings != null && helpCenterSettings.getLocale() != null) {
            return this.helpCenterSettings.getLocale();
        }
        return "";
    }

    public long getMaxAttachmentSize() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null) {
            return attachmentSettings.getMaxAttachmentSize();
        }
        return 0L;
    }

    public String getReferrerUrl() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && StringUtils.hasLength(supportSettings.getReferrerUrl())) {
            return this.mobileSettings.getReferrerUrl();
        }
        return "https://www.zendesk.com/embeddables";
    }

    public String getRequestSystemMessage() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && StringUtils.hasLength(supportSettings.getSystemMessage())) {
            return this.mobileSettings.getSystemMessage();
        }
        return "";
    }

    public boolean hasHelpCenterSettings() {
        if (this.helpCenterSettings != null) {
            return true;
        }
        return false;
    }

    public boolean isAttachmentsEnabled() {
        AttachmentSettings attachmentSettings = getAttachmentSettings();
        if (attachmentSettings != null && attachmentSettings.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isConversationsEnabled() {
        ConversationsSettings conversationsSettings = getConversationsSettings();
        if (conversationsSettings != null && conversationsSettings.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isHelpCenterArticleVotingEnabled() {
        if (hasHelpCenterSettings() && this.helpCenterSettings.isArticleVotingEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isHelpCenterEnabled() {
        HelpCenterSettings helpCenterSettings = this.helpCenterSettings;
        if (helpCenterSettings != null && helpCenterSettings.isEnabled()) {
            return true;
        }
        return false;
    }

    public boolean isNeverAskForEmailEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && !supportSettings.isNeverRequestEmailOn()) {
            return false;
        }
        return true;
    }

    public boolean isShowClosedRequests() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && !supportSettings.isShowClosedRequests()) {
            return false;
        }
        return true;
    }

    public boolean isShowReferrerLogoEnabled() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.isShowReferrerLogo()) {
            return true;
        }
        return false;
    }

    public boolean isTicketFormSupportAvailable() {
        SupportSettings supportSettings = this.mobileSettings;
        if (supportSettings != null && supportSettings.getTicketForms() != null && this.mobileSettings.getTicketForms().isAvailable()) {
            return true;
        }
        return false;
    }
}
