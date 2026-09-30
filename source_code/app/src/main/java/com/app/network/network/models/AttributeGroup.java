package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.variables.CTVariableUtils;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\"\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u0007\"\u0004\b\u001f\u0010\tR\u001c\u0010 \u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001c\u0010#\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0007\"\u0004\b%\u0010\tR\u001c\u0010&\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010\u0007\"\u0004\b(\u0010\tR\u001c\u0010)\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u0007\"\u0004\b+\u0010\tR\u001c\u0010,\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010\tR\u001a\u0010/\u001a\u000200X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/app/network/network/models/AttributeGroup;", "", "<init>", "()V", CTVariableUtils.DICTIONARY, "", "getGroup", "()Ljava/lang/String;", "setGroup", "(Ljava/lang/String;)V", "actionType", "getActionType", "setActionType", "actionText", "getActionText", "setActionText", "actionDescription", "getActionDescription", "setActionDescription", "attributes", "", "Lcom/app/network/network/models/Attribute;", "getAttributes", "()Ljava/util/List;", "setAttributes", "(Ljava/util/List;)V", Constants.KEY_TITLE, "getTitle", "setTitle", "sectionLabel", "getSectionLabel", "setSectionLabel", "warningText", "getWarningText", "setWarningText", "successMessage", "getSuccessMessage", "setSuccessMessage", "otpTitle", "getOtpTitle", "setOtpTitle", "otpSubtitle", "getOtpSubtitle", "setOtpSubtitle", "otpDescription", "getOtpDescription", "setOtpDescription", "requiresOtpVerification", "", "getRequiresOtpVerification", "()Z", "setRequiresOtpVerification", "(Z)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AttributeGroup {

    @Nullable
    private String actionDescription;

    @Nullable
    private String actionText;

    @Nullable
    private String actionType;

    @Nullable
    private List<Attribute> attributes;

    @Nullable
    private String group;

    @Nullable
    private String otpDescription;

    @Nullable
    private String otpSubtitle;

    @Nullable
    private String otpTitle;
    private boolean requiresOtpVerification;

    @Nullable
    private String sectionLabel;

    @Nullable
    private String successMessage;

    @Nullable
    private String title;

    @Nullable
    private String warningText;

    @Nullable
    public final String getActionDescription() {
        return this.actionDescription;
    }

    @Nullable
    public final String getActionText() {
        return this.actionText;
    }

    @Nullable
    public final String getActionType() {
        return this.actionType;
    }

    @Nullable
    public final List<Attribute> getAttributes() {
        return this.attributes;
    }

    @Nullable
    public final String getGroup() {
        return this.group;
    }

    @Nullable
    public final String getOtpDescription() {
        return this.otpDescription;
    }

    @Nullable
    public final String getOtpSubtitle() {
        return this.otpSubtitle;
    }

    @Nullable
    public final String getOtpTitle() {
        return this.otpTitle;
    }

    public final boolean getRequiresOtpVerification() {
        return this.requiresOtpVerification;
    }

    @Nullable
    public final String getSectionLabel() {
        return this.sectionLabel;
    }

    @Nullable
    public final String getSuccessMessage() {
        return this.successMessage;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final String getWarningText() {
        return this.warningText;
    }

    public final void setActionDescription(@Nullable String str) {
        this.actionDescription = str;
    }

    public final void setActionText(@Nullable String str) {
        this.actionText = str;
    }

    public final void setActionType(@Nullable String str) {
        this.actionType = str;
    }

    public final void setAttributes(@Nullable List<Attribute> list) {
        this.attributes = list;
    }

    public final void setGroup(@Nullable String str) {
        this.group = str;
    }

    public final void setOtpDescription(@Nullable String str) {
        this.otpDescription = str;
    }

    public final void setOtpSubtitle(@Nullable String str) {
        this.otpSubtitle = str;
    }

    public final void setOtpTitle(@Nullable String str) {
        this.otpTitle = str;
    }

    public final void setRequiresOtpVerification(boolean z2) {
        this.requiresOtpVerification = z2;
    }

    public final void setSectionLabel(@Nullable String str) {
        this.sectionLabel = str;
    }

    public final void setSuccessMessage(@Nullable String str) {
        this.successMessage = str;
    }

    public final void setTitle(@Nullable String str) {
        this.title = str;
    }

    public final void setWarningText(@Nullable String str) {
        this.warningText = str;
    }
}
