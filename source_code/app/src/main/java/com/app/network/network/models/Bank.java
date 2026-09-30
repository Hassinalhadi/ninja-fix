package com.app.network.network.models;

import java.util.Date;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0019\"\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, d2 = {"Lcom/app/network/network/models/Bank;", "Lcom/app/network/network/models/Language;", "<init>", "()V", "country", "Lcom/app/network/network/models/Country;", "getCountry", "()Lcom/app/network/network/models/Country;", "setCountry", "(Lcom/app/network/network/models/Country;)V", "createdAt", "Ljava/util/Date;", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "image", "Lcom/app/network/network/models/Image;", "getImage", "()Lcom/app/network/network/models/Image;", "setImage", "(Lcom/app/network/network/models/Image;)V", "code", "", "getCode", "()Ljava/lang/String;", "setCode", "(Ljava/lang/String;)V", "swiftCode", "getSwiftCode", "setSwiftCode", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Bank extends Language {

    @Nullable
    private String code;

    @Nullable
    private Country country;

    @Nullable
    private Date createdAt;

    @Nullable
    private Image image;

    @Nullable
    private String swiftCode;

    public Bank() {
        super(null, 1, null);
    }

    @Nullable
    public final String getCode() {
        return this.code;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Image getImage() {
        return this.image;
    }

    @Nullable
    public final String getSwiftCode() {
        return this.swiftCode;
    }

    public final void setCode(@Nullable String str) {
        this.code = str;
    }

    public final void setCountry(@Nullable Country country) {
        this.country = country;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setImage(@Nullable Image image) {
        this.image = image;
    }

    public final void setSwiftCode(@Nullable String str) {
        this.swiftCode = str;
    }
}
