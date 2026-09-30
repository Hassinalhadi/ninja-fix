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
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\t\b\u0087\u0081\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011¨\u0006\u0012"}, d2 = {"Lcom/checkout/components/interfaces/uicustomisation/font/FontName;", "Landroid/os/Parcelable;", "", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "Heading", "Subheading", "Footnote", "Button", "Input", "Label", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class FontName implements Parcelable {
    public static final FontName Button;

    @NotNull
    public static final Parcelable.Creator<FontName> CREATOR;
    public static final FontName Footnote;
    public static final FontName Heading;
    public static final FontName Input;
    public static final FontName Label;
    public static final FontName Subheading;

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ FontName[] f5615a;

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ a f5616b;

    static {
        FontName fontName = new FontName("Heading", 0);
        Heading = fontName;
        FontName fontName2 = new FontName("Subheading", 1);
        Subheading = fontName2;
        FontName fontName3 = new FontName("Footnote", 2);
        Footnote = fontName3;
        FontName fontName4 = new FontName("Button", 3);
        Button = fontName4;
        FontName fontName5 = new FontName("Input", 4);
        Input = fontName5;
        FontName fontName6 = new FontName("Label", 5);
        Label = fontName6;
        FontName[] fontNameArr = {fontName, fontName2, fontName3, fontName4, fontName5, fontName6};
        f5615a = fontNameArr;
        f5616b = AbstractC2708l7.bravo(fontNameArr);
        CREATOR = new Parcelable.Creator<FontName>() { // from class: com.checkout.components.interfaces.uicustomisation.font.FontName.Creator
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                String readString = parcel.readString();
                Parcelable.Creator<FontName> creator = FontName.CREATOR;
                return (FontName) Enum.valueOf(FontName.class, readString);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i4) {
                return new FontName[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final FontName[] newArray(int i4) {
                return new FontName[i4];
            }
        };
    }

    private FontName(String str, int i4) {
    }

    @NotNull
    public static a getEntries() {
        return f5616b;
    }

    public static FontName valueOf(String str) {
        return (FontName) Enum.valueOf(FontName.class, str);
    }

    public static FontName[] values() {
        return (FontName[]) f5615a.clone();
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
