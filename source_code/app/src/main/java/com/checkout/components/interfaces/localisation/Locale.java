package com.checkout.components.interfaces.localisation;

import android.os.Parcel;
import android.os.Parcelable;
import ao.ad;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.Constants;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u0018\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./01¨\u00062"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale;", "Landroid/os/Parcelable;", "Ar", "Zh", "ZhHk", "ZhTw", "Da", "Nl", "En", "Fil", "Fi", "Fr", "De", "El", "Hi", "Id", "It", "Ja", "Ms", "Nb", "Pt", "Es", "Sv", "Th", "Vi", "Customised", "Lcom/checkout/components/interfaces/localisation/Locale$Ar;", "Lcom/checkout/components/interfaces/localisation/Locale$Customised;", "Lcom/checkout/components/interfaces/localisation/Locale$Da;", "Lcom/checkout/components/interfaces/localisation/Locale$De;", "Lcom/checkout/components/interfaces/localisation/Locale$El;", "Lcom/checkout/components/interfaces/localisation/Locale$En;", "Lcom/checkout/components/interfaces/localisation/Locale$Es;", "Lcom/checkout/components/interfaces/localisation/Locale$Fi;", "Lcom/checkout/components/interfaces/localisation/Locale$Fil;", "Lcom/checkout/components/interfaces/localisation/Locale$Fr;", "Lcom/checkout/components/interfaces/localisation/Locale$Hi;", "Lcom/checkout/components/interfaces/localisation/Locale$Id;", "Lcom/checkout/components/interfaces/localisation/Locale$It;", "Lcom/checkout/components/interfaces/localisation/Locale$Ja;", "Lcom/checkout/components/interfaces/localisation/Locale$Ms;", "Lcom/checkout/components/interfaces/localisation/Locale$Nb;", "Lcom/checkout/components/interfaces/localisation/Locale$Nl;", "Lcom/checkout/components/interfaces/localisation/Locale$Pt;", "Lcom/checkout/components/interfaces/localisation/Locale$Sv;", "Lcom/checkout/components/interfaces/localisation/Locale$Th;", "Lcom/checkout/components/interfaces/localisation/Locale$Vi;", "Lcom/checkout/components/interfaces/localisation/Locale$Zh;", "Lcom/checkout/components/interfaces/localisation/Locale$ZhHk;", "Lcom/checkout/components/interfaces/localisation/Locale$ZhTw;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public abstract class Locale implements Parcelable {
    public static final int $stable = 0;

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Ar;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Ar extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Ar INSTANCE = new Ar();

        @NotNull
        public static final Parcelable.Creator<Ar> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Ar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ar createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ar.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ar[] newArray(int i4) {
                return new Ar[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Ar createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ar.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Ar[] newArray(int i4) {
                return new Ar[i4];
            }
        }

        private Ar() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Ar);
        }

        public final int hashCode() {
            return 1679755854;
        }

        @NotNull
        public final String toString() {
            return "Ar";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0010J\u0010\u0010\u0014\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0014\u0010\bJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Customised;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "locale", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", Constants.COPY_TYPE, "(Ljava/lang/String;)Lcom/checkout/components/interfaces/localisation/Locale$Customised;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getLocale", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Customised extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Parcelable.Creator<Customised> CREATOR = new Creator();

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String locale;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Customised> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Customised createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                return new Customised(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Customised[] newArray(int i4) {
                return new Customised[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Customised[] newArray(int i4) {
                return new Customised[i4];
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Customised(@NotNull String locale) {
            super(null);
            Intrinsics.echo(locale, "locale");
            this.locale = locale;
        }

        public static Customised copy$default(Customised customised, String locale, int i4, Object obj) {
            if ((i4 & 1) != 0) {
                locale = customised.locale;
            }
            customised.getClass();
            Intrinsics.echo(locale, "locale");
            return new Customised(locale);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLocale() {
            return this.locale;
        }

        @NotNull
        public final Customised copy(@NotNull String locale) {
            Intrinsics.echo(locale, "locale");
            return new Customised(locale);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Customised) && Intrinsics.areEqual(this.locale, ((Customised) other).locale);
        }

        @NotNull
        public final String getLocale() {
            return this.locale;
        }

        public final int hashCode() {
            return this.locale.hashCode();
        }

        @NotNull
        public final String toString() {
            return ad.gray("Customised(locale=", this.locale, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeString(this.locale);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Da;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Da extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Da INSTANCE = new Da();

        @NotNull
        public static final Parcelable.Creator<Da> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Da> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Da createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Da.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Da[] newArray(int i4) {
                return new Da[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Da createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Da.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Da[] newArray(int i4) {
                return new Da[i4];
            }
        }

        private Da() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Da);
        }

        public final int hashCode() {
            return 1679755930;
        }

        @NotNull
        public final String toString() {
            return "Da";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$De;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class De extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final De INSTANCE = new De();

        @NotNull
        public static final Parcelable.Creator<De> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<De> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final De createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return De.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final De[] newArray(int i4) {
                return new De[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final De createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return De.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final De[] newArray(int i4) {
                return new De[i4];
            }
        }

        private De() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof De);
        }

        public final int hashCode() {
            return 1679755934;
        }

        @NotNull
        public final String toString() {
            return "De";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$El;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class El extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final El INSTANCE = new El();

        @NotNull
        public static final Parcelable.Creator<El> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<El> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final El createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return El.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final El[] newArray(int i4) {
                return new El[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final El createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return El.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final El[] newArray(int i4) {
                return new El[i4];
            }
        }

        private El() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof El);
        }

        public final int hashCode() {
            return 1679755972;
        }

        @NotNull
        public final String toString() {
            return "El";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$En;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class En extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final En INSTANCE = new En();

        @NotNull
        public static final Parcelable.Creator<En> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<En> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final En createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return En.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final En[] newArray(int i4) {
                return new En[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final En createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return En.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final En[] newArray(int i4) {
                return new En[i4];
            }
        }

        private En() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof En);
        }

        public final int hashCode() {
            return 1679755974;
        }

        @NotNull
        public final String toString() {
            return "En";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Es;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Es extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Es INSTANCE = new Es();

        @NotNull
        public static final Parcelable.Creator<Es> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Es> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Es createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Es.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Es[] newArray(int i4) {
                return new Es[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Es createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Es.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Es[] newArray(int i4) {
                return new Es[i4];
            }
        }

        private Es() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Es);
        }

        public final int hashCode() {
            return 1679755979;
        }

        @NotNull
        public final String toString() {
            return "Es";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Fi;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Fi extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Fi INSTANCE = new Fi();

        @NotNull
        public static final Parcelable.Creator<Fi> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Fi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fi.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fi[] newArray(int i4) {
                return new Fi[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Fi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fi.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Fi[] newArray(int i4) {
                return new Fi[i4];
            }
        }

        private Fi() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Fi);
        }

        public final int hashCode() {
            return 1679756000;
        }

        @NotNull
        public final String toString() {
            return "Fi";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Fil;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Fil extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Fil INSTANCE = new Fil();

        @NotNull
        public static final Parcelable.Creator<Fil> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Fil> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fil createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fil.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fil[] newArray(int i4) {
                return new Fil[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Fil createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fil.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Fil[] newArray(int i4) {
                return new Fil[i4];
            }
        }

        private Fil() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Fil);
        }

        public final int hashCode() {
            return 532828556;
        }

        @NotNull
        public final String toString() {
            return "Fil";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Fr;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Fr extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Fr INSTANCE = new Fr();

        @NotNull
        public static final Parcelable.Creator<Fr> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Fr> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fr createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fr.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Fr[] newArray(int i4) {
                return new Fr[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Fr createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Fr.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Fr[] newArray(int i4) {
                return new Fr[i4];
            }
        }

        private Fr() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Fr);
        }

        public final int hashCode() {
            return 1679756009;
        }

        @NotNull
        public final String toString() {
            return "Fr";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Hi;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Hi extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Hi INSTANCE = new Hi();

        @NotNull
        public static final Parcelable.Creator<Hi> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Hi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Hi.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Hi[] newArray(int i4) {
                return new Hi[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Hi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Hi.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Hi[] newArray(int i4) {
                return new Hi[i4];
            }
        }

        private Hi() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Hi);
        }

        public final int hashCode() {
            return 1679756062;
        }

        @NotNull
        public final String toString() {
            return "Hi";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Id;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Id extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Id INSTANCE = new Id();

        @NotNull
        public static final Parcelable.Creator<Id> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Id> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Id createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Id.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Id[] newArray(int i4) {
                return new Id[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Id createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Id.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Id[] newArray(int i4) {
                return new Id[i4];
            }
        }

        private Id() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Id);
        }

        public final int hashCode() {
            return 1679756088;
        }

        @NotNull
        public final String toString() {
            return "Id";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$It;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class It extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final It INSTANCE = new It();

        @NotNull
        public static final Parcelable.Creator<It> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<It> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final It createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return It.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final It[] newArray(int i4) {
                return new It[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final It createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return It.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final It[] newArray(int i4) {
                return new It[i4];
            }
        }

        private It() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof It);
        }

        public final int hashCode() {
            return 1679756104;
        }

        @NotNull
        public final String toString() {
            return "It";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Ja;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Ja extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Ja INSTANCE = new Ja();

        @NotNull
        public static final Parcelable.Creator<Ja> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Ja> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ja createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ja.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ja[] newArray(int i4) {
                return new Ja[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Ja createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ja.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Ja[] newArray(int i4) {
                return new Ja[i4];
            }
        }

        private Ja() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Ja);
        }

        public final int hashCode() {
            return 1679756116;
        }

        @NotNull
        public final String toString() {
            return "Ja";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Ms;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Ms extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Ms INSTANCE = new Ms();

        @NotNull
        public static final Parcelable.Creator<Ms> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Ms> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ms createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ms.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Ms[] newArray(int i4) {
                return new Ms[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Ms createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Ms.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Ms[] newArray(int i4) {
                return new Ms[i4];
            }
        }

        private Ms() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Ms);
        }

        public final int hashCode() {
            return 1679756227;
        }

        @NotNull
        public final String toString() {
            return "Ms";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Nb;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Nb extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Nb INSTANCE = new Nb();

        @NotNull
        public static final Parcelable.Creator<Nb> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Nb> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Nb createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Nb.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Nb[] newArray(int i4) {
                return new Nb[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Nb createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Nb.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Nb[] newArray(int i4) {
                return new Nb[i4];
            }
        }

        private Nb() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Nb);
        }

        public final int hashCode() {
            return 1679756241;
        }

        @NotNull
        public final String toString() {
            return "Nb";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Nl;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Nl extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Nl INSTANCE = new Nl();

        @NotNull
        public static final Parcelable.Creator<Nl> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Nl> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Nl createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Nl.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Nl[] newArray(int i4) {
                return new Nl[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Nl createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Nl.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Nl[] newArray(int i4) {
                return new Nl[i4];
            }
        }

        private Nl() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Nl);
        }

        public final int hashCode() {
            return 1679756251;
        }

        @NotNull
        public final String toString() {
            return "Nl";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Pt;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Pt extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Pt INSTANCE = new Pt();

        @NotNull
        public static final Parcelable.Creator<Pt> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Pt> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pt createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Pt.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Pt[] newArray(int i4) {
                return new Pt[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Pt createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Pt.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Pt[] newArray(int i4) {
                return new Pt[i4];
            }
        }

        private Pt() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Pt);
        }

        public final int hashCode() {
            return 1679756321;
        }

        @NotNull
        public final String toString() {
            return "Pt";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Sv;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Sv extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Sv INSTANCE = new Sv();

        @NotNull
        public static final Parcelable.Creator<Sv> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Sv> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sv createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Sv.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Sv[] newArray(int i4) {
                return new Sv[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Sv createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Sv.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Sv[] newArray(int i4) {
                return new Sv[i4];
            }
        }

        private Sv() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Sv);
        }

        public final int hashCode() {
            return 1679756416;
        }

        @NotNull
        public final String toString() {
            return "Sv";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Th;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Th extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Th INSTANCE = new Th();

        @NotNull
        public static final Parcelable.Creator<Th> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Th> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Th createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Th.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Th[] newArray(int i4) {
                return new Th[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Th createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Th.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Th[] newArray(int i4) {
                return new Th[i4];
            }
        }

        private Th() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Th);
        }

        public final int hashCode() {
            return 1679756433;
        }

        @NotNull
        public final String toString() {
            return "Th";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Vi;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Vi extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Vi INSTANCE = new Vi();

        @NotNull
        public static final Parcelable.Creator<Vi> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Vi> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Vi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Vi.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Vi[] newArray(int i4) {
                return new Vi[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Vi createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Vi.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Vi[] newArray(int i4) {
                return new Vi[i4];
            }
        }

        private Vi() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Vi);
        }

        public final int hashCode() {
            return 1679756496;
        }

        @NotNull
        public final String toString() {
            return "Vi";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$Zh;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class Zh extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final Zh INSTANCE = new Zh();

        @NotNull
        public static final Parcelable.Creator<Zh> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<Zh> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zh createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Zh.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Zh[] newArray(int i4) {
                return new Zh[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Zh createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return Zh.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final Zh[] newArray(int i4) {
                return new Zh[i4];
            }
        }

        private Zh() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof Zh);
        }

        public final int hashCode() {
            return 1679756619;
        }

        @NotNull
        public final String toString() {
            return "Zh";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$ZhHk;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ZhHk extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final ZhHk INSTANCE = new ZhHk();

        @NotNull
        public static final Parcelable.Creator<ZhHk> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ZhHk> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ZhHk createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return ZhHk.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ZhHk[] newArray(int i4) {
                return new ZhHk[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final ZhHk createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return ZhHk.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ZhHk[] newArray(int i4) {
                return new ZhHk[i4];
            }
        }

        private ZhHk() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ZhHk);
        }

        public final int hashCode() {
            return -661590098;
        }

        @NotNull
        public final String toString() {
            return "ZhHk";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/checkout/components/interfaces/localisation/Locale$ZhTw;", "Lcom/checkout/components/interfaces/localisation/Locale;", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final /* data */ class ZhTw extends Locale {
        public static final int $stable = 0;

        @NotNull
        public static final ZhTw INSTANCE = new ZhTw();

        @NotNull
        public static final Parcelable.Creator<ZhTw> CREATOR = new Creator();

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        /* loaded from: classes3.dex */
        public static final class Creator implements Parcelable.Creator<ZhTw> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ZhTw createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return ZhTw.INSTANCE;
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final ZhTw[] newArray(int i4) {
                return new ZhTw[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final ZhTw createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                parcel.readInt();
                return ZhTw.INSTANCE;
            }

            @Override // android.os.Parcelable.Creator
            public final ZhTw[] newArray(int i4) {
                return new ZhTw[i4];
            }
        }

        private ZhTw() {
            super(null);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Nullable Object other) {
            return this == other || (other instanceof ZhTw);
        }

        public final int hashCode() {
            return -661589714;
        }

        @NotNull
        public final String toString() {
            return "ZhTw";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NotNull Parcel dest, int flags) {
            Intrinsics.echo(dest, "dest");
            dest.writeInt(1);
        }
    }

    public Locale(DefaultConstructorMarker defaultConstructorMarker) {
    }
}
