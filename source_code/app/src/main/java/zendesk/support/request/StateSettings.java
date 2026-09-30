package zendesk.support.request;

import androidx.appcompat.widget.P0;
import java.io.Serializable;
import zendesk.support.SupportSdkSettings;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class StateSettings implements Serializable {
    private final boolean attachmentsEnabled;
    private final boolean conversationsEnabled;
    private final boolean hasIdentityEmailAddress;
    private final boolean hasIdentityName;
    private final long maxAttachmentSize;
    private final boolean neverRequestEmail;
    private final String referrerUrl;
    private final boolean settingsLoaded;
    private final boolean showZendeskLogo;
    private final String systemMessage;

    public StateSettings(boolean z2, boolean z10, long j5, boolean z11, boolean z12, boolean z13, boolean z14, String str, String str2) {
        this.settingsLoaded = true;
        this.conversationsEnabled = z2;
        this.attachmentsEnabled = z10;
        this.maxAttachmentSize = j5;
        this.neverRequestEmail = z11;
        this.hasIdentityEmailAddress = z12;
        this.hasIdentityName = z13;
        this.showZendeskLogo = z14;
        this.referrerUrl = str;
        this.systemMessage = str2;
    }

    public static StateSettings fromSupportSettings(SupportSdkSettings supportSdkSettings, boolean z2, boolean z10) {
        return new StateSettings(supportSdkSettings.isConversationsEnabled(), supportSdkSettings.isAttachmentsEnabled(), supportSdkSettings.getMaxAttachmentSize(), supportSdkSettings.isNeverAskForEmailEnabled(), z2, z10, supportSdkSettings.isShowReferrerLogoEnabled(), supportSdkSettings.getReferrerUrl(), supportSdkSettings.getRequestSystemMessage());
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public String getReferrerUrl() {
        return this.referrerUrl;
    }

    public String getSystemMessage() {
        return this.systemMessage;
    }

    public boolean hasIdentityEmailAddress() {
        return this.hasIdentityEmailAddress;
    }

    public boolean hasIdentityName() {
        return this.hasIdentityName;
    }

    public boolean hasSettings() {
        return this.settingsLoaded;
    }

    public boolean isAttachmentsEnabled() {
        return this.attachmentsEnabled;
    }

    public boolean isConversationsEnabled() {
        return this.conversationsEnabled;
    }

    public boolean isNeverRequestEmailOn() {
        return this.neverRequestEmail;
    }

    public boolean isShowZendeskLogo() {
        return this.showZendeskLogo;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("Settings{settingsLoaded=");
        sb2.append(this.settingsLoaded);
        sb2.append(", conversationsEnabled=");
        sb2.append(this.conversationsEnabled);
        sb2.append(", attachmentsEnabled=");
        sb2.append(this.attachmentsEnabled);
        sb2.append(", maxAttachmentSize=");
        sb2.append(this.maxAttachmentSize);
        sb2.append(", neverRequestEmail=");
        sb2.append(this.neverRequestEmail);
        sb2.append(", hasIdentityEmailAddress=");
        sb2.append(this.hasIdentityEmailAddress);
        sb2.append(", hasIdentityName=");
        sb2.append(this.hasIdentityName);
        sb2.append(", referrerUrl=");
        sb2.append(this.referrerUrl);
        sb2.append(", systemMessage=");
        return P0.fuchsia(sb2, this.systemMessage, '}');
    }

    public StateSettings() {
        this.settingsLoaded = false;
        this.conversationsEnabled = false;
        this.attachmentsEnabled = false;
        this.maxAttachmentSize = -1L;
        this.neverRequestEmail = true;
        this.hasIdentityEmailAddress = false;
        this.hasIdentityName = false;
        this.showZendeskLogo = true;
        this.referrerUrl = "";
        this.systemMessage = "";
    }
}
