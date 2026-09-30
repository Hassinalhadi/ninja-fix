package com.app.network.network.models;

import com.clevertap.android.sdk.Constants;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\b\u0010+\u001a\u0004\u0018\u00010\u0005J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010.\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010/\u001a\u00020'2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u000203HÖ\u0001J\t\u00104\u001a\u00020\u0005HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\r\"\u0004\b\u001b\u0010\u000fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\r\"\u0004\b\u001e\u0010\u000fR\"\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050 X\u0086\u000e¢\u0006\u0010\n\u0002\u0010%\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001a\u0010&\u001a\u00020'X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010(\"\u0004\b)\u0010*¨\u00065"}, d2 = {"Lcom/app/network/network/models/Country;", "Lcom/app/network/network/models/Language;", "createdAt", "Ljava/util/Date;", "demonym", "", "<init>", "(Ljava/util/Date;Ljava/lang/String;)V", "getCreatedAt", "()Ljava/util/Date;", "setCreatedAt", "(Ljava/util/Date;)V", "getDemonym", "()Ljava/lang/String;", "setDemonym", "(Ljava/lang/String;)V", "emoji", "getEmoji", "setEmoji", "currency", "Lcom/app/network/network/models/Currency;", "getCurrency", "()Lcom/app/network/network/models/Currency;", "setCurrency", "(Lcom/app/network/network/models/Currency;)V", "shortName", "getShortName", "setShortName", "mobileCountryCode", "getMobileCountryCode", "setMobileCountryCode", "altSpellings", "", "getAltSpellings", "()[Ljava/lang/String;", "setAltSpellings", "([Ljava/lang/String;)V", "[Ljava/lang/String;", "isSelected", "", "()Z", "setSelected", "(Z)V", "getValidDemonym", "component1", "component2", Constants.COPY_TYPE, "equals", "other", "", "hashCode", "", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Country extends Language {

    @NotNull
    private String[] altSpellings;

    @Nullable
    private Date createdAt;

    @Nullable
    private Currency currency;

    @Nullable
    private String demonym;

    @Nullable
    private String emoji;
    private boolean isSelected;

    @Nullable
    private String mobileCountryCode;

    @Nullable
    private String shortName;

    /* JADX WARN: Multi-variable type inference failed */
    public Country() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ Country copy$default(Country country, Date date, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            date = country.createdAt;
        }
        if ((i4 & 2) != 0) {
            str = country.demonym;
        }
        return country.copy(date, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDemonym() {
        return this.demonym;
    }

    @NotNull
    public final Country copy(@Nullable Date createdAt, @Nullable String demonym) {
        return new Country(createdAt, demonym);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Country)) {
            return false;
        }
        Country country = (Country) other;
        return Intrinsics.areEqual(this.createdAt, country.createdAt) && Intrinsics.areEqual(this.demonym, country.demonym);
    }

    @NotNull
    public final String[] getAltSpellings() {
        return this.altSpellings;
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
    public final String getDemonym() {
        return this.demonym;
    }

    @Nullable
    public final String getEmoji() {
        return this.emoji;
    }

    @Nullable
    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    @Nullable
    public final String getShortName() {
        return this.shortName;
    }

    @Nullable
    public final String getValidDemonym() {
        if (this.demonym != null && (!StringsKt.gray(r0))) {
            return this.demonym;
        }
        return getName();
    }

    public int hashCode() {
        Date date = this.createdAt;
        int hashCode = (date == null ? 0 : date.hashCode()) * 31;
        String str = this.demonym;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isSelected, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    public final void setAltSpellings(@NotNull String[] strArr) {
        Intrinsics.echo(strArr, "<set-?>");
        this.altSpellings = strArr;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setCurrency(@Nullable Currency currency) {
        this.currency = currency;
    }

    public final void setDemonym(@Nullable String str) {
        this.demonym = str;
    }

    public final void setEmoji(@Nullable String str) {
        this.emoji = str;
    }

    public final void setMobileCountryCode(@Nullable String str) {
        this.mobileCountryCode = str;
    }

    public final void setSelected(boolean z2) {
        this.isSelected = z2;
    }

    public final void setShortName(@Nullable String str) {
        this.shortName = str;
    }

    @NotNull
    public String toString() {
        return "Country(createdAt=" + this.createdAt + ", demonym=" + this.demonym + ")";
    }

    public Country(@Nullable Date date, @Nullable String str) {
        super(null, 1, null);
        this.createdAt = date;
        this.demonym = str;
        this.altSpellings = new String[0];
    }

    public /* synthetic */ Country(Date date, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : date, (i4 & 2) != 0 ? null : str);
    }
}
