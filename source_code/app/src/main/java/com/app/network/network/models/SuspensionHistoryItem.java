package com.app.network.network.models;

import P8.c;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006 "}, d2 = {"Lcom/app/network/network/models/SuspensionHistoryItem;", "Ljava/io/Serializable;", "createdAt", "", "categoryText", "categoryTextAr", Constants.KEY_TYPE, "durationString", Constants.KEY_ACTION, "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/lang/String;", "getCategoryText", "getCategoryTextAr", "getType", "getDurationString", "getAction", "component1", "component2", "component3", "component4", "component5", "component6", Constants.COPY_TYPE, "equals", "", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SuspensionHistoryItem implements Serializable {

    @c(Constants.KEY_ACTION)
    @Nullable
    private final String action;

    @c("categoryText")
    @Nullable
    private final String categoryText;

    @c("categoryTextAr")
    @Nullable
    private final String categoryTextAr;

    @c("createdAt")
    @Nullable
    private final String createdAt;

    @c("durationString")
    @Nullable
    private final String durationString;

    @c(Constants.KEY_TYPE)
    @Nullable
    private final String type;

    public SuspensionHistoryItem(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.createdAt = str;
        this.categoryText = str2;
        this.categoryTextAr = str3;
        this.type = str4;
        this.durationString = str5;
        this.action = str6;
    }

    public static /* synthetic */ SuspensionHistoryItem copy$default(SuspensionHistoryItem suspensionHistoryItem, String str, String str2, String str3, String str4, String str5, String str6, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = suspensionHistoryItem.createdAt;
        }
        if ((i4 & 2) != 0) {
            str2 = suspensionHistoryItem.categoryText;
        }
        if ((i4 & 4) != 0) {
            str3 = suspensionHistoryItem.categoryTextAr;
        }
        if ((i4 & 8) != 0) {
            str4 = suspensionHistoryItem.type;
        }
        if ((i4 & 16) != 0) {
            str5 = suspensionHistoryItem.durationString;
        }
        if ((i4 & 32) != 0) {
            str6 = suspensionHistoryItem.action;
        }
        String str7 = str5;
        String str8 = str6;
        return suspensionHistoryItem.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getCategoryTextAr() {
        return this.categoryTextAr;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getDurationString() {
        return this.durationString;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getAction() {
        return this.action;
    }

    @NotNull
    public final SuspensionHistoryItem copy(@Nullable String createdAt, @Nullable String categoryText, @Nullable String categoryTextAr, @Nullable String type, @Nullable String durationString, @Nullable String action) {
        return new SuspensionHistoryItem(createdAt, categoryText, categoryTextAr, type, durationString, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SuspensionHistoryItem)) {
            return false;
        }
        SuspensionHistoryItem suspensionHistoryItem = (SuspensionHistoryItem) other;
        return Intrinsics.areEqual(this.createdAt, suspensionHistoryItem.createdAt) && Intrinsics.areEqual(this.categoryText, suspensionHistoryItem.categoryText) && Intrinsics.areEqual(this.categoryTextAr, suspensionHistoryItem.categoryTextAr) && Intrinsics.areEqual(this.type, suspensionHistoryItem.type) && Intrinsics.areEqual(this.durationString, suspensionHistoryItem.durationString) && Intrinsics.areEqual(this.action, suspensionHistoryItem.action);
    }

    @Nullable
    public final String getAction() {
        return this.action;
    }

    @Nullable
    public final String getCategoryText() {
        return this.categoryText;
    }

    @Nullable
    public final String getCategoryTextAr() {
        return this.categoryTextAr;
    }

    @Nullable
    public final String getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getDurationString() {
        return this.durationString;
    }

    @Nullable
    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.createdAt;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.categoryText;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.categoryTextAr;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.type;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.durationString;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.action;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.createdAt;
        String str2 = this.categoryText;
        String str3 = this.categoryTextAr;
        String str4 = this.type;
        String str5 = this.durationString;
        String str6 = this.action;
        StringBuilder india = q.india("SuspensionHistoryItem(createdAt=", str, ", categoryText=", str2, ", categoryTextAr=");
        Q0.c.azure(india, str3, ", type=", str4, ", durationString=");
        return j.lima(india, str5, ", action=", str6, ")");
    }
}
