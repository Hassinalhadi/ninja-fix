package com.google.android.flexbox;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.ViewGroup;
import androidx.recyclerview.widget.M;
import com.google.android.flexbox.FlexboxLayoutManager;

/* loaded from: classes3.dex */
public final class e implements Parcelable.Creator {
    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.ViewGroup$MarginLayoutParams, com.google.android.flexbox.FlexboxLayoutManager$LayoutParams, androidx.recyclerview.widget.M, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z2;
        ?? m4 = new M(-2, -2);
        m4.teal = 0.0f;
        m4.white = 1.0f;
        m4.yellow = -1;
        m4.f6625a = -1.0f;
        m4.f6628d = 16777215;
        m4.e = 16777215;
        m4.teal = parcel.readFloat();
        m4.white = parcel.readFloat();
        m4.yellow = parcel.readInt();
        m4.f6625a = parcel.readFloat();
        m4.f6626b = parcel.readInt();
        m4.f6627c = parcel.readInt();
        m4.f6628d = parcel.readInt();
        m4.e = parcel.readInt();
        if (parcel.readByte() != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        m4.f6629f = z2;
        ((ViewGroup.MarginLayoutParams) m4).bottomMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) m4).leftMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) m4).rightMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) m4).topMargin = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) m4).height = parcel.readInt();
        ((ViewGroup.MarginLayoutParams) m4).width = parcel.readInt();
        return m4;
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        return new FlexboxLayoutManager.LayoutParams[i4];
    }
}
