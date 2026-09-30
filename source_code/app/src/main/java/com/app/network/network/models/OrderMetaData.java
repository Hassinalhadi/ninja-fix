package com.app.network.network.models;

import com.clevertap.android.sdk.db.Column;
import java.io.Serializable;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001c\u0010\r\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/app/network/network/models/OrderMetaData;", "Ljava/io/Serializable;", "<init>", "()V", "taskId", "", "getTaskId", "()Ljava/lang/String;", "setTaskId", "(Ljava/lang/String;)V", Column.DATA, "getData", "setData", "label", "getLabel", "setLabel", "languageCode", "getLanguageCode", "setLanguageCode", "metaHtml", "getMetaHtml", "setMetaHtml", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class OrderMetaData implements Serializable {

    @Nullable
    private String data;

    @Nullable
    private String label;

    @Nullable
    private String languageCode;

    @Nullable
    private String metaHtml;

    @Nullable
    private String taskId;

    @Nullable
    public final String getData() {
        return this.data;
    }

    @Nullable
    public final String getLabel() {
        return this.label;
    }

    @Nullable
    public final String getLanguageCode() {
        return this.languageCode;
    }

    @Nullable
    public final String getMetaHtml() {
        return this.metaHtml;
    }

    @Nullable
    public final String getTaskId() {
        return this.taskId;
    }

    public final void setData(@Nullable String str) {
        this.data = str;
    }

    public final void setLabel(@Nullable String str) {
        this.label = str;
    }

    public final void setLanguageCode(@Nullable String str) {
        this.languageCode = str;
    }

    public final void setMetaHtml(@Nullable String str) {
        this.metaHtml = str;
    }

    public final void setTaskId(@Nullable String str) {
        this.taskId = str;
    }
}
