package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
class BaseSlider$SliderState extends View.BaseSavedState {
    public static final Parcelable.Creator<BaseSlider$SliderState> CREATOR = new a(0);
    public float alpha;
    public float purple;
    public ArrayList red;
    public float silver;
    public boolean teal;

    @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        super.writeToParcel(parcel, i4);
        parcel.writeFloat(this.alpha);
        parcel.writeFloat(this.purple);
        parcel.writeList(this.red);
        parcel.writeFloat(this.silver);
        parcel.writeBooleanArray(new boolean[]{this.teal});
    }
}
