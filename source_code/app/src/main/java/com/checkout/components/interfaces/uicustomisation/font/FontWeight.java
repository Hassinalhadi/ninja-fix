package com.checkout.components.interfaces.uicustomisation.font;

import Qd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import s6.AbstractC2708l7;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontWeight;", "Landroid/os/Parcelable;", "", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Light", "Normal", "Medium", "SemiBold", "Bold", "ExtraBold", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class FontWeight implements Parcelable {
    public static final FontWeight Bold;

    @NotNull
    public static final Parcelable.Creator<FontWeight> CREATOR;
    public static final FontWeight ExtraBold;
    public static final FontWeight Light;
    public static final FontWeight Medium;
    public static final FontWeight Normal;
    public static final FontWeight SemiBold;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ FontWeight[] f5619a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f5620b;

    static {
        FontWeight fontWeight = new FontWeight("Light", 0);
        Light = fontWeight;
        FontWeight fontWeight2 = new FontWeight("Normal", 1);
        Normal = fontWeight2;
        FontWeight fontWeight3 = new FontWeight("Medium", 2);
        Medium = fontWeight3;
        FontWeight fontWeight4 = new FontWeight("SemiBold", 3);
        SemiBold = fontWeight4;
        FontWeight fontWeight5 = new FontWeight("Bold", 4);
        Bold = fontWeight5;
        FontWeight fontWeight6 = new FontWeight("ExtraBold", 5);
        ExtraBold = fontWeight6;
        FontWeight[] fontWeightArr = {fontWeight, fontWeight2, fontWeight3, fontWeight4, fontWeight5, fontWeight6};
        f5619a = fontWeightArr;
        f5620b = AbstractC2708l7.bravo(fontWeightArr);
        CREATOR = new Parcelable.Creator<FontWeight>() { // from class: com.checkout.components.interfaces.uicustomisation.font.FontWeight.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeight createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                String readString = parcel.readString();
                Parcelable.Creator<FontWeight> creator = FontWeight.CREATOR;
                return (FontWeight) Enum.valueOf(FontWeight.class, readString);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontWeight[] newArray(int i4) {
                return new FontWeight[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final FontWeight[] newArray(int i4) {
                return new FontWeight[i4];
            }
        };
    }

    private FontWeight(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return f5620b;
    }

    public static FontWeight valueOf(String str) {
        return (FontWeight) Enum.valueOf(FontWeight.class, str);
    }

    public static FontWeight[] values() {
        return (FontWeight[]) f5619a.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(name());
    }
}
