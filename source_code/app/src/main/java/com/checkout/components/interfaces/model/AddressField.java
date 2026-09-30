package com.checkout.components.interfaces.model;

import Qd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.checkout.components.interfaces.utils.TestTags;
import com.clevertap.android.sdk.Constants;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \u00132\u00020\u0001:\u000b\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d\u0013R\u001a\u0010\u0005\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0017\u0010\f\u001a\u00020\u00078G¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0012\u001a\u00020\r8G¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0082\u0001\n\u001e\u001f !\"#$%&'¨\u0006("}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField;", "Landroid/os/Parcelable;", "", "a", "Z", "isOptional", "()Z", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "b", "Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "getName", "()Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "name", "", "c", "Ljava/lang/String;", "getIdentifier", "()Ljava/lang/String;", "identifier", "Companion", "Country", "AddressLine1", "AddressLine2", "City", "Zip", "State", "Email", "FirstName", "LastName", "Phone", "Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "Lcom/checkout/components/interfaces/model/AddressField$City;", "Lcom/checkout/components/interfaces/model/AddressField$Country;", "Lcom/checkout/components/interfaces/model/AddressField$Email;", "Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "Lcom/checkout/components/interfaces/model/AddressField$LastName;", "Lcom/checkout/components/interfaces/model/AddressField$Phone;", "Lcom/checkout/components/interfaces/model/AddressField$State;", "Lcom/checkout/components/interfaces/model/AddressField$Zip;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class AddressField implements Parcelable {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: d */
    private static final List f5352d;
    private static final List e;

    /* renamed from: a, reason: from kotlin metadata */
    private final boolean isOptional;

    /* renamed from: b, reason: from kotlin metadata */
    private final Companion.Name name;

    /* renamed from: c, reason: from kotlin metadata */
    private final String identifier;

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$AddressLine1;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AddressLine1 extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<AddressLine1> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<AddressLine1> {
            @Override // android.os.Parcelable.Creator
            public final AddressLine1 createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new AddressLine1(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine1[] newArray(int i4) {
                return new AddressLine1[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine1[] newArray(int i4) {
                return new AddressLine1[i4];
            }
        }

        public AddressLine1() {
            this(false, 1, null);
        }

        public static AddressLine1 copy$default(AddressLine1 addressLine1, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = addressLine1.isOptional;
            }
            addressLine1.getClass();
            return new AddressLine1(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final AddressLine1 copy(boolean z2) {
            return new AddressLine1(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddressLine1) && this.isOptional == ((AddressLine1) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "AddressLine1(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ AddressLine1(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2);
        }

        public AddressLine1(boolean z2) {
            super(z2, Companion.Name.AddressLine1, TestTags.ADDRESS_LINE_1, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$AddressLine2;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class AddressLine2 extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<AddressLine2> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<AddressLine2> {
            @Override // android.os.Parcelable.Creator
            public final AddressLine2 createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new AddressLine2(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine2[] newArray(int i4) {
                return new AddressLine2[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final AddressLine2[] newArray(int i4) {
                return new AddressLine2[i4];
            }
        }

        public AddressLine2() {
            this(false, 1, null);
        }

        public static AddressLine2 copy$default(AddressLine2 addressLine2, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = addressLine2.isOptional;
            }
            addressLine2.getClass();
            return new AddressLine2(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final AddressLine2 copy(boolean z2) {
            return new AddressLine2(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddressLine2) && this.isOptional == ((AddressLine2) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "AddressLine2(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ AddressLine2(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? true : z2);
        }

        public AddressLine2(boolean z2) {
            super(z2, Companion.Name.AddressLine2, TestTags.ADDRESS_LINE_2, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$City;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$City;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class City extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<City> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<City> {
            @Override // android.os.Parcelable.Creator
            public final City createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new City(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final City[] newArray(int i4) {
                return new City[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final City[] newArray(int i4) {
                return new City[i4];
            }
        }

        public City() {
            this(false, 1, null);
        }

        public static City copy$default(City city, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = city.isOptional;
            }
            city.getClass();
            return new City(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final City copy(boolean z2) {
            return new City(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof City) && this.isOptional == ((City) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "City(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public City(boolean z2) {
            super(z2, Companion.Name.City, TestTags.ADDRESS_CITY, null);
            this.isOptional = z2;
        }

        public /* synthetic */ City(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\nR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0005\u001a\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Companion;", "", "", "Lcom/checkout/components/interfaces/model/AddressField;", "billing", "Ljava/util/List;", "getBilling", "()Ljava/util/List;", "shipping", "getShipping", Constants.KEY_ENCRYPTION_NAME, "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001j\u0002\b\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Companion$Name;", "", "Country", "AddressLine1", "AddressLine2", "City", "Zip", "State", "Email", "FirstName", "LastName", "Phone", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Name extends Enum<Name> {
            public static final Name AddressLine1;
            public static final Name AddressLine2;
            public static final Name City;
            public static final Name Country;
            public static final Name Email;
            public static final Name FirstName;
            public static final Name LastName;
            public static final Name Phone;
            public static final Name State;
            public static final Name Zip;

            /* renamed from: a */
            private static final /* synthetic */ Name[] f5359a;

            /* renamed from: b */
            private static final /* synthetic */ a f5360b;

            static {
                Name name = new Name("Country", 0);
                Country = name;
                Name name2 = new Name("AddressLine1", 1);
                AddressLine1 = name2;
                Name name3 = new Name("AddressLine2", 2);
                AddressLine2 = name3;
                Name name4 = new Name("City", 3);
                City = name4;
                Name name5 = new Name("Zip", 4);
                Zip = name5;
                Name name6 = new Name("State", 5);
                State = name6;
                Name name7 = new Name("Email", 6);
                Email = name7;
                Name name8 = new Name("FirstName", 7);
                FirstName = name8;
                Name name9 = new Name("LastName", 8);
                LastName = name9;
                Name name10 = new Name("Phone", 9);
                Phone = name10;
                Name[] nameArr = {name, name2, name3, name4, name5, name6, name7, name8, name9, name10};
                f5359a = nameArr;
                f5360b = AbstractC2708l7.bravo(nameArr);
            }

            private Name(String str, int i4) {
                super(str, i4);
            }

            @NotNull
            public static a getEntries() {
                return f5360b;
            }

            public static Name valueOf(String str) {
                return (Name) Enum.valueOf(Name.class, str);
            }

            public static Name[] values() {
                return (Name[]) f5359a.clone();
            }
        }

        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        @NotNull
        public final List<AddressField> getBilling() {
            return AddressField.f5352d;
        }

        @NotNull
        public final List<AddressField> getShipping() {
            return AddressField.e;
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Country;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Country extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Country INSTANCE = new Country();

        @NotNull
        public static final Parcelable.Creator<Country> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Country> {
            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Country.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i4) {
                return new Country[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Country.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i4) {
                return new Country[i4];
            }
        }

        private Country() {
            super(false, Companion.Name.Country, TestTags.COUNTRY, null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Country);
        }

        public final int hashCode() {
            return 767723882;
        }

        @NotNull
        public final String toString() {
            return "Country";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Email;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$Email;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Email extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Email> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Email> {
            @Override // android.os.Parcelable.Creator
            public final Email createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new Email(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i4) {
                return new Email[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Email[] newArray(int i4) {
                return new Email[i4];
            }
        }

        public Email() {
            this(false, 1, null);
        }

        public static Email copy$default(Email email, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = email.isOptional;
            }
            email.getClass();
            return new Email(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final Email copy(boolean z2) {
            return new Email(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Email) && this.isOptional == ((Email) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "Email(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ Email(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? true : z2);
        }

        public Email(boolean z2) {
            super(z2, Companion.Name.Email, TestTags.ADDRESS_EMAIL, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$FirstName;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class FirstName extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<FirstName> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<FirstName> {
            @Override // android.os.Parcelable.Creator
            public final FirstName createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new FirstName(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final FirstName[] newArray(int i4) {
                return new FirstName[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final FirstName[] newArray(int i4) {
                return new FirstName[i4];
            }
        }

        public FirstName() {
            this(false, 1, null);
        }

        public static FirstName copy$default(FirstName firstName, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = firstName.isOptional;
            }
            firstName.getClass();
            return new FirstName(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final FirstName copy(boolean z2) {
            return new FirstName(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof FirstName) && this.isOptional == ((FirstName) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "FirstName(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ FirstName(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2);
        }

        public FirstName(boolean z2) {
            super(z2, Companion.Name.FirstName, TestTags.FIRST_NAME, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$LastName;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$LastName;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class LastName extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<LastName> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<LastName> {
            @Override // android.os.Parcelable.Creator
            public final LastName createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new LastName(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final LastName[] newArray(int i4) {
                return new LastName[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final LastName[] newArray(int i4) {
                return new LastName[i4];
            }
        }

        public LastName() {
            this(false, 1, null);
        }

        public static LastName copy$default(LastName lastName, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = lastName.isOptional;
            }
            lastName.getClass();
            return new LastName(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final LastName copy(boolean z2) {
            return new LastName(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LastName) && this.isOptional == ((LastName) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "LastName(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ LastName(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2);
        }

        public LastName(boolean z2) {
            super(z2, Companion.Name.LastName, TestTags.LAST_NAME, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Phone;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$Phone;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Phone extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Phone> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Phone> {
            @Override // android.os.Parcelable.Creator
            public final Phone createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new Phone(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i4) {
                return new Phone[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Phone[] newArray(int i4) {
                return new Phone[i4];
            }
        }

        public Phone() {
            this(false, 1, null);
        }

        public static Phone copy$default(Phone phone, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = phone.isOptional;
            }
            phone.getClass();
            return new Phone(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final Phone copy(boolean z2) {
            return new Phone(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Phone) && this.isOptional == ((Phone) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "Phone(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ Phone(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? true : z2);
        }

        public Phone(boolean z2) {
            super(z2, Companion.Name.Phone, TestTags.PHONE_NUMBER, null);
            this.isOptional = z2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0016\u0010\bJ\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0003\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$State;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "<init>", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", Constants.COPY_TYPE, "(Z)Lcom/checkout/components/interfaces/model/AddressField$State;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class State extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<State> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<State> {
            @Override // android.os.Parcelable.Creator
            public final State createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new State(parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i4) {
                return new State[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final State[] newArray(int i4) {
                return new State[i4];
            }
        }

        public State() {
            this(false, 1, null);
        }

        public static State copy$default(State state, boolean z2, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = state.isOptional;
            }
            state.getClass();
            return new State(z2);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final State copy(boolean z2) {
            return new State(z2);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof State) && this.isOptional == ((State) other).isOptional;
        }

        public final int hashCode() {
            return this.isOptional ? 1231 : 1237;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "State(isOptional=" + this.isOptional + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
        }

        public /* synthetic */ State(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? true : z2);
        }

        public State(boolean z2) {
            super(z2, Companion.Name.State, TestTags.COUNTY_PROVINCE, null);
            this.isOptional = z2;
        }
    }

    static {
        Country country = Country.INSTANCE;
        f5352d = CollectionsKt.listOf(country, new AddressLine1(false, 1, null), new AddressLine2(false, 1, null), new City(false, 1, null), new State(false, 1, null), new Zip(false, 1, null));
        e = CollectionsKt.listOf(new FirstName(false, 1, null), new LastName(false, 1, null), new Phone(false, 1, null), new Email(false, 1, null), country, new AddressLine1(false, 1, null), new AddressLine2(false, 1, null), new City(false, 1, null), new State(false, 1, null), new Zip(false, 1, null));
    }

    public AddressField(boolean z2, Companion.Name name, String str, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this.isOptional = (i4 & 1) != 0 ? false : z2;
        this.name = name;
        this.identifier = str;
    }

    public static final /* synthetic */ List access$getBilling$cp() {
        return f5352d;
    }

    @NotNull
    public final String getIdentifier() {
        return this.identifier;
    }

    @NotNull
    public final Companion.Name getName() {
        return this.name;
    }

    /* renamed from: isOptional, reason: from getter */
    public boolean getIsOptional() {
        return this.isOptional;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006B\u0013\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J$\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0019\u0010\nJ\u001a\u0010\u001c\u001a\u00020\u00022\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u0003\u0010\u0012R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b\u0004\u0010\u0012¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/AddressField$Zip;", "Lcom/checkout/components/interfaces/model/AddressField;", "", "isOptional", "isNumberOnly", "<init>", "(ZZ)V", "(Z)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Z", "component2", Constants.COPY_TYPE, "(ZZ)Lcom/checkout/components/interfaces/model/AddressField$Zip;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "f", "Z", "g", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Zip extends AddressField {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Zip> CREATOR = new Creator();

        /* renamed from: f, reason: from kotlin metadata */
        private final boolean isOptional;

        /* renamed from: g, reason: from kotlin metadata */
        private final boolean isNumberOnly;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Zip> {
            @Override // android.os.Parcelable.Creator
            public final Zip createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new Zip(parcel.readInt() != 0, parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Zip[] newArray(int i4) {
                return new Zip[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Zip[] newArray(int i4) {
                return new Zip[i4];
            }
        }

        public Zip(boolean z2, boolean z10) {
            super(z2, Companion.Name.Zip, TestTags.ZIP_CODE, null);
            this.isOptional = z2;
            this.isNumberOnly = z10;
        }

        public static Zip copy$default(Zip zip, boolean z2, boolean z10, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                z2 = zip.isOptional;
            }
            if ((i4 & 2) != 0) {
                z10 = zip.isNumberOnly;
            }
            zip.getClass();
            return new Zip(z2, z10);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsNumberOnly() {
            return this.isNumberOnly;
        }

        @NotNull
        public final Zip copy(boolean z2, boolean z10) {
            return new Zip(z2, z10);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Zip)) {
                return false;
            }
            Zip zip = (Zip) other;
            return this.isOptional == zip.isOptional && this.isNumberOnly == zip.isNumberOnly;
        }

        public final int hashCode() {
            int i4;
            int i5 = 1237;
            if (this.isOptional) {
                i4 = 1231;
            } else {
                i4 = 1237;
            }
            int i10 = i4 * 31;
            if (this.isNumberOnly) {
                i5 = 1231;
            }
            return i5 + i10;
        }

        public final boolean isNumberOnly() {
            return this.isNumberOnly;
        }

        @Override // com.checkout.components.interfaces.model.AddressField
        /* renamed from: isOptional */
        public final boolean getIsOptional() {
            return this.isOptional;
        }

        @NotNull
        public final String toString() {
            return "Zip(isOptional=" + this.isOptional + ", isNumberOnly=" + this.isNumberOnly + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(this.isOptional ? 1 : 0);
            dest.writeInt(this.isNumberOnly ? 1 : 0);
        }

        public Zip(boolean z2) {
            this(z2, false);
        }

        public Zip(boolean z2, int i4, DefaultConstructorMarker defaultConstructorMarker) {
            this((i4 & 1) != 0 ? false : z2, false);
        }
    }

    public AddressField(boolean z2, Companion.Name name, String str, DefaultConstructorMarker defaultConstructorMarker) {
        this.isOptional = z2;
        this.name = name;
        this.identifier = str;
    }
}
