package com.app.network.network.models.points;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u0010\n\u0002\u0010\n\u001a\u0004\b\f\u0010\u0007\"\u0004\b\r\u0010\tR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001a\"\u0004\b\u001f\u0010\u001cR\u001c\u0010 \u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u001a\"\u0004\b\"\u0010\u001cR\u001c\u0010#\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001a\"\u0004\b%\u0010\u001cR\u001c\u0010&\u001a\u0004\u0018\u00010'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001e\u0010,\u001a\u0004\u0018\u00010-X\u0086\u000e¢\u0006\u0010\n\u0002\u00102\u001a\u0004\b.\u0010/\"\u0004\b0\u00101¨\u00063"}, d2 = {"Lcom/app/network/network/models/points/PointsTransactionResponse;", "", "<init>", "()V", "balance", "", "getBalance", "()Ljava/lang/Float;", "setBalance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "amount", "getAmount", "setAmount", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "expiresAt", "getExpiresAt", "setExpiresAt", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", "note", "getNote", "setNote", "localizedNote", "getLocalizedNote", "setLocalizedNote", "transactionTypeTitle", "getTransactionTypeTitle", "setTransactionTypeTitle", "transactionType", "Lcom/app/network/network/models/points/PointsTransactionType;", "getTransactionType", "()Lcom/app/network/network/models/points/PointsTransactionType;", "setTransactionType", "(Lcom/app/network/network/models/points/PointsTransactionType;)V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PointsTransactionResponse {

    @Nullable
    private Float amount;

    @Nullable
    private Float balance;

    @Nullable
    private Date createdAt;

    @Nullable
    private Date expiresAt;

    @Nullable
    private Integer id;

    @Nullable
    private String localizedNote;

    @Nullable
    private String name;

    @Nullable
    private String note;

    @Nullable
    private PointsTransactionType transactionType;

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
    public final Date getExpiresAt() {
        return this.expiresAt;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getLocalizedNote() {
        return this.localizedNote;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNote() {
        return this.note;
    }

    @Nullable
    public final PointsTransactionType getTransactionType() {
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

    public final void setExpiresAt(@Nullable Date date) {
        this.expiresAt = date;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setLocalizedNote(@Nullable String str) {
        this.localizedNote = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNote(@Nullable String str) {
        this.note = str;
    }

    public final void setTransactionType(@Nullable PointsTransactionType pointsTransactionType) {
        this.transactionType = pointsTransactionType;
    }

    public final void setTransactionTypeTitle(@Nullable String str) {
        this.transactionTypeTitle = str;
    }
}
