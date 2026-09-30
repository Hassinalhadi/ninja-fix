package com.checkout.components.interfaces.component;

import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.model.CardSchemeName;
import com.checkout.components.interfaces.model.CardTypeName;
import com.checkout.components.interfaces.model.Phone;
import com.clevertap.android.sdk.Constants;
import com.clevertap.android.sdk.db.Column;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001,BC\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013JL\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u000fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\u0011R\"\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010\u0013R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010(\u001a\u0004\b+\u0010\u0013¨\u0006-"}, d2 = {"Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "Lcom/checkout/components/interfaces/component/AcceptedCardSchemes;", "Lcom/checkout/components/interfaces/component/AcceptedCardTypes;", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;", Column.DATA, "", "showPayButton", "", "Lcom/checkout/components/interfaces/model/CardSchemeName;", "acceptedCardSchemes", "Lcom/checkout/components/interfaces/model/CardTypeName;", "acceptedCardTypes", "<init>", "(Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)V", "component1", "()Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/util/List;", "component4", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;Ljava/lang/Boolean;Ljava/util/List;Ljava/util/List;)Lcom/checkout/components/interfaces/component/RememberMeConfiguration;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;", "getData", "b", "Ljava/lang/Boolean;", "getShowPayButton", "c", "Ljava/util/List;", "getAcceptedCardSchemes", Constants.INAPP_DATA_TAG, "getAcceptedCardTypes", "Data", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class RememberMeConfiguration implements AcceptedCardSchemes, AcceptedCardTypes {
    public static final int $stable = 8;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Data data;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Boolean showPayButton;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardSchemes;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List acceptedCardTypes;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;", "", "", "email", "Lcom/checkout/components/interfaces/model/Phone;", "phone", "<init>", "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/Phone;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/checkout/components/interfaces/model/Phone;", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/checkout/components/interfaces/model/Phone;)Lcom/checkout/components/interfaces/component/RememberMeConfiguration$Data;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getEmail", "b", "Lcom/checkout/components/interfaces/model/Phone;", "getPhone", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Data {
        public static final int $stable = 0;

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String email;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Phone phone;

        public Data() {
            this(null, null, 3, null);
        }

        public static Data copy$default(Data data, String str, Phone phone, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                str = data.email;
            }
            if ((i4 & 2) != 0) {
                phone = data.phone;
            }
            data.getClass();
            return new Data(str, phone);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Phone getPhone() {
            return this.phone;
        }

        @NotNull
        public final Data copy(@Nullable String email, @Nullable Phone phone) {
            return new Data(email, phone);
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.areEqual(this.email, data.email) && Intrinsics.areEqual(this.phone, data.phone);
        }

        @Nullable
        public final String getEmail() {
            return this.email;
        }

        @Nullable
        public final Phone getPhone() {
            return this.phone;
        }

        public final int hashCode() {
            String str = this.email;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Phone phone = this.phone;
            return hashCode + (phone != null ? phone.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "Data(email=" + this.email + ", phone=" + this.phone + ")";
        }

        public Data(@Nullable String str, @Nullable Phone phone) {
            this.email = str;
            this.phone = phone;
        }

        public Data(String str, Phone phone, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            str = (i4 & 1) != 0 ? null : str;
            phone = (i4 & 2) != 0 ? null : phone;
            this.email = str;
            this.phone = phone;
        }
    }

    public RememberMeConfiguration() {
        this(null, null, null, null, 15, null);
    }

    public static RememberMeConfiguration copy$default(RememberMeConfiguration rememberMeConfiguration, Data data, Boolean bool, List list, List list2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            data = rememberMeConfiguration.data;
        }
        if ((i4 & 2) != 0) {
            bool = rememberMeConfiguration.showPayButton;
        }
        if ((i4 & 4) != 0) {
            list = rememberMeConfiguration.acceptedCardSchemes;
        }
        if ((i4 & 8) != 0) {
            list2 = rememberMeConfiguration.acceptedCardTypes;
        }
        rememberMeConfiguration.getClass();
        return new RememberMeConfiguration(data, bool, list, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Data getData() {
        return this.data;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getShowPayButton() {
        return this.showPayButton;
    }

    @Nullable
    public final List<CardSchemeName> component3() {
        return this.acceptedCardSchemes;
    }

    @Nullable
    public final List<CardTypeName> component4() {
        return this.acceptedCardTypes;
    }

    @NotNull
    public final RememberMeConfiguration copy(@Nullable Data data, @Nullable Boolean showPayButton, @Nullable List<? extends CardSchemeName> acceptedCardSchemes, @Nullable List<? extends CardTypeName> acceptedCardTypes) {
        return new RememberMeConfiguration(data, showPayButton, acceptedCardSchemes, acceptedCardTypes);
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RememberMeConfiguration)) {
            return false;
        }
        RememberMeConfiguration rememberMeConfiguration = (RememberMeConfiguration) other;
        return Intrinsics.areEqual(this.data, rememberMeConfiguration.data) && Intrinsics.areEqual(this.showPayButton, rememberMeConfiguration.showPayButton) && Intrinsics.areEqual(this.acceptedCardSchemes, rememberMeConfiguration.acceptedCardSchemes) && Intrinsics.areEqual(this.acceptedCardTypes, rememberMeConfiguration.acceptedCardTypes);
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardSchemes
    @Nullable
    public final List<CardSchemeName> getAcceptedCardSchemes() {
        return this.acceptedCardSchemes;
    }

    @Override // com.checkout.components.interfaces.component.AcceptedCardTypes
    @Nullable
    public final List<CardTypeName> getAcceptedCardTypes() {
        return this.acceptedCardTypes;
    }

    @Nullable
    public final Data getData() {
        return this.data;
    }

    @Nullable
    public final Boolean getShowPayButton() {
        return this.showPayButton;
    }

    public final int hashCode() {
        Data data = this.data;
        int hashCode = (data == null ? 0 : data.hashCode()) * 31;
        Boolean bool = this.showPayButton;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        List list = this.acceptedCardSchemes;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.acceptedCardTypes;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "RememberMeConfiguration(data=" + this.data + ", showPayButton=" + this.showPayButton + ", acceptedCardSchemes=" + this.acceptedCardSchemes + ", acceptedCardTypes=" + this.acceptedCardTypes + ")";
    }

    public RememberMeConfiguration(@Nullable Data data, @Nullable Boolean bool, @Nullable List<? extends CardSchemeName> list, @Nullable List<? extends CardTypeName> list2) {
        this.data = data;
        this.showPayButton = bool;
        this.acceptedCardSchemes = list;
        this.acceptedCardTypes = list2;
    }

    public /* synthetic */ RememberMeConfiguration(Data data, Boolean bool, List list, List list2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : data, (i4 & 2) != 0 ? Boolean.TRUE : bool, (i4 & 4) != 0 ? null : list, (i4 & 8) != 0 ? null : list2);
    }
}
