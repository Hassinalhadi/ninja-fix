package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0010\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010#\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006$"}, d2 = {"Lcom/app/network/network/models/Wallet;", "", "<init>", "()V", "currency", "Lcom/app/network/network/models/Currency;", "getCurrency", "()Lcom/app/network/network/models/Currency;", "setCurrency", "(Lcom/app/network/network/models/Currency;)V", "balance", "", "getBalance", "()Ljava/lang/Float;", "setBalance", "(Ljava/lang/Float;)V", "Ljava/lang/Float;", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "name", "", "getName", "()Ljava/lang/String;", "setName", "(Ljava/lang/String;)V", Constants.KEY_ID, "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Wallet {

    @Nullable
    private Float balance;

    @Nullable
    private Date createdAt;

    @Nullable
    private Currency currency;

    @Nullable
    private Integer id;

    @Nullable
    private String name;

    @Nullable
    public final Float getBalance() {
        return this.balance;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Currency getCurrency() {
        return this.currency;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public final void setBalance(@Nullable Float f5) {
        this.balance = f5;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setCurrency(@Nullable Currency currency) {
        this.currency = currency;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }
}
