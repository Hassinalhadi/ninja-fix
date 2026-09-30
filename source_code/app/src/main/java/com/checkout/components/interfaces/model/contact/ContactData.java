package com.checkout.components.interfaces.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\r\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u001d\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ>\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010\u001cJ\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/ContactData;", "Landroid/os/Parcelable;", "Lcom/checkout/components/interfaces/model/contact/Address;", "address", "Lcom/checkout/components/interfaces/model/contact/Phone;", "phone", "Lcom/checkout/components/interfaces/model/contact/Name;", "name", "", "email", "<init>", "(Lcom/checkout/components/interfaces/model/contact/Address;Lcom/checkout/components/interfaces/model/contact/Phone;Lcom/checkout/components/interfaces/model/contact/Name;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Lcom/checkout/components/interfaces/model/contact/Address;", "component2", "()Lcom/checkout/components/interfaces/model/contact/Phone;", "component3", "()Lcom/checkout/components/interfaces/model/contact/Name;", "component4", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Lcom/checkout/components/interfaces/model/contact/Address;Lcom/checkout/components/interfaces/model/contact/Phone;Lcom/checkout/components/interfaces/model/contact/Name;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/ContactData;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcom/checkout/components/interfaces/model/contact/Address;", "getAddress", "b", "Lcom/checkout/components/interfaces/model/contact/Phone;", "getPhone", "c", "Lcom/checkout/components/interfaces/model/contact/Name;", "getName", Constants.INAPP_DATA_TAG, "Ljava/lang/String;", "getEmail", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class ContactData implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<ContactData> CREATOR = new Creator();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Address address;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Phone phone;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Name name;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String email;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<ContactData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactData createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new ContactData(Address.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Phone.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Name.CREATOR.createFromParcel(parcel) : null, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ContactData[] newArray(int i4) {
            return new ContactData[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final ContactData[] newArray(int i4) {
            return new ContactData[i4];
        }
    }

    public ContactData(@NotNull Address address, @Nullable Phone phone, @Nullable Name name, @Nullable String str) {
        Intrinsics.echo(address, "address");
        this.address = address;
        this.phone = phone;
        this.name = name;
        this.email = str;
    }

    public static ContactData copy$default(ContactData contactData, Address address, Phone phone, Name name, String str, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            address = contactData.address;
        }
        if ((i4 & 2) != 0) {
            phone = contactData.phone;
        }
        if ((i4 & 4) != 0) {
            name = contactData.name;
        }
        if ((i4 & 8) != 0) {
            str = contactData.email;
        }
        contactData.getClass();
        Intrinsics.echo(address, "address");
        return new ContactData(address, phone, name, str);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Address getAddress() {
        return this.address;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Phone getPhone() {
        return this.phone;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Name getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getEmail() {
        return this.email;
    }

    @NotNull
    public final ContactData copy(@NotNull Address address, @Nullable Phone phone, @Nullable Name name, @Nullable String email) {
        Intrinsics.echo(address, "address");
        return new ContactData(address, phone, name, email);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactData)) {
            return false;
        }
        ContactData contactData = (ContactData) other;
        return Intrinsics.areEqual(this.address, contactData.address) && Intrinsics.areEqual(this.phone, contactData.phone) && Intrinsics.areEqual(this.name, contactData.name) && Intrinsics.areEqual(this.email, contactData.email);
    }

    @NotNull
    public final Address getAddress() {
        return this.address;
    }

    @Nullable
    public final String getEmail() {
        return this.email;
    }

    @Nullable
    public final Name getName() {
        return this.name;
    }

    @Nullable
    public final Phone getPhone() {
        return this.phone;
    }

    public final int hashCode() {
        int hashCode = this.address.hashCode() * 31;
        Phone phone = this.phone;
        int hashCode2 = (hashCode + (phone == null ? 0 : phone.hashCode())) * 31;
        Name name = this.name;
        int hashCode3 = (hashCode2 + (name == null ? 0 : name.hashCode())) * 31;
        String str = this.email;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "ContactData(address=" + this.address + ", phone=" + this.phone + ", name=" + this.name + ", email=" + this.email + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        this.address.writeToParcel(dest, flags);
        Phone phone = this.phone;
        if (phone == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            phone.writeToParcel(dest, flags);
        }
        Name name = this.name;
        if (name == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            name.writeToParcel(dest, flags);
        }
        dest.writeString(this.email);
    }
}
