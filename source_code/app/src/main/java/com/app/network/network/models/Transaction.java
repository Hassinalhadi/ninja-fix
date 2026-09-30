package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0019\u0010\u0010R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u001b\u0010\u0007\"\u0004\b\u001c\u0010\tR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u001f\u0010\u0010R\u001c\u0010 \u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u000e\"\u0004\b\"\u0010\u0010R\u001c\u0010#\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000e\"\u0004\b%\u0010\u0010R\u001e\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u0010\n\u0002\u0010,\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001c\u0010-\u001a\u0004\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u000e\"\u0004\b/\u0010\u0010¨\u00060"}, d2 = {"Lcom/app/network/network/models/Transaction;", "", "<init>", "()V", "balance", "", "getBalance", "()Ljava/lang/Float;", "setBalance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "transactionType", "", "getTransactionType", "()Ljava/lang/String;", "setTransactionType", "(Ljava/lang/String;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "transactionTypeTitle", "getTransactionTypeTitle", "setTransactionTypeTitle", "amount", "getAmount", "setAmount", "note", "getNote", "setNote", Constants.KEY_ID, "getId", "setId", "transactionNote", "getTransactionNote", "setTransactionNote", "platformId", "", "getPlatformId", "()Ljava/lang/Integer;", "setPlatformId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "platformName", "getPlatformName", "setPlatformName", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Transaction {

    @Nullable
    private Float amount;

    @Nullable
    private Float balance;

    @Nullable
    private Date createdAt;

    @Nullable
    private String id;

    @Nullable
    private String note;

    @Nullable
    private Integer platformId;

    @Nullable
    private String platformName;

    @Nullable
    private String transactionNote;

    @Nullable
    private String transactionType;

    @Nullable
    private String transactionTypeTitle;

    @Nullable
    public final Float getAmount() {
        return this.amount;
    }

    @Nullable
    public final Float getBalance() {
        return this.balance;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    @Nullable
    public final Integer getPlatformId() {
        return this.platformId;
    }

    @Nullable
    public final String getPlatformName() {
        return this.platformName;
    }

    @Nullable
    public final String getTransactionNote() {
        return this.transactionNote;
    }

    @Nullable
    public final String getTransactionType() {
        return this.transactionType;
    }

    @Nullable
    public final String getTransactionTypeTitle() {
        return this.transactionTypeTitle;
    }

    public final void setAmount(@Nullable Float f5) {
        this.amount = f5;
    }

    public final void setBalance(@Nullable Float f5) {
        this.balance = f5;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setId(@Nullable String str) {
        this.id = str;
    }

    public final void setNote(@Nullable String str) {
        this.note = str;
    }

    public final void setPlatformId(@Nullable Integer num) {
        this.platformId = num;
    }

    public final void setPlatformName(@Nullable String str) {
        this.platformName = str;
    }

    public final void setTransactionNote(@Nullable String str) {
        this.transactionNote = str;
    }

    public final void setTransactionType(@Nullable String str) {
        this.transactionType = str;
    }

    public final void setTransactionTypeTitle(@Nullable String str) {
        this.transactionTypeTitle = str;
    }
}
