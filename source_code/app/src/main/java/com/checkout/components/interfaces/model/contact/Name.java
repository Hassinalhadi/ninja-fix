package com.checkout.components.interfaces.model.contact;

import android.os.Parcel;
import android.os.Parcelable;
import av.q;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J$\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0016\u0010\tJ\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u0011R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u0011¨\u0006!"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Name;", "Landroid/os/Parcelable;", "", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/Name;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getFirstName", "b", "getLastName", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final /* data */ class Name implements Parcelable {
    public static final int $stable = 0;

    @NotNull
    public static final Parcelable.Creator<Name> CREATOR = new Creator();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String firstName;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String lastName;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Name> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            return new Name(parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final Name[] newArray(int i4) {
            return new Name[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final Name[] newArray(int i4) {
            return new Name[i4];
        }
    }

    public Name(@NotNull String firstName, @NotNull String lastName) {
        Intrinsics.echo(firstName, "firstName");
        Intrinsics.echo(lastName, "lastName");
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public static /* synthetic */ Name copy$default(Name name, String str, String str2, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = name.firstName;
        }
        if ((i4 & 2) != 0) {
            str2 = name.lastName;
        }
        return name.copy(str, str2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @NotNull
    public final Name copy(@NotNull String firstName, @NotNull String lastName) {
        Intrinsics.echo(firstName, "firstName");
        Intrinsics.echo(lastName, "lastName");
        return new Name(firstName, lastName);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Name)) {
            return false;
        }
        Name name = (Name) other;
        return Intrinsics.areEqual(this.firstName, name.firstName) && Intrinsics.areEqual(this.lastName, name.lastName);
    }

    @NotNull
    public final String getFirstName() {
        return this.firstName;
    }

    @NotNull
    public final String getLastName() {
        return this.lastName;
    }

    public final int hashCode() {
        return this.lastName.hashCode() + (this.firstName.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return q.golf("Name(firstName=", this.firstName, ", lastName=", this.lastName, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(this.firstName);
        dest.writeString(this.lastName);
    }
}
