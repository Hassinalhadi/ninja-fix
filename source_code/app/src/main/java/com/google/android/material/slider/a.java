package com.google.android.material.slider;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import android.view.View;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class a implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ a(int i4) {
        this.alpha = i4;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.view.View$BaseSavedState, com.google.android.material.slider.BaseSlider$SliderState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(final Parcel parcel) {
        switch (this.alpha) {
            case 0:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.alpha = parcel.readFloat();
                baseSavedState.purple = parcel.readFloat();
                ArrayList arrayList = new ArrayList();
                baseSavedState.red = arrayList;
                parcel.readList(arrayList, Float.class.getClassLoader());
                baseSavedState.silver = parcel.readFloat();
                baseSavedState.teal = parcel.createBooleanArray()[0];
                return baseSavedState;
            default:
                return new AbsSavedState(parcel) { // from class: com.google.android.material.slider.RangeSlider$RangeSliderState
                    public static final Parcelable.Creator<RangeSlider$RangeSliderState> CREATOR = new a(1);
                    public final float alpha;
                    public final int purple;

                    {
                        super(parcel.readParcelable(RangeSlider$RangeSliderState.class.getClassLoader()));
                        this.alpha = parcel.readFloat();
                        this.purple = parcel.readInt();
                    }

                    @Override // android.view.AbsSavedState, android.os.Parcelable
                    public final void writeToParcel(Parcel parcel2, int i4) {
                        super.writeToParcel(parcel2, i4);
                        parcel2.writeFloat(this.alpha);
                        parcel2.writeInt(this.purple);
                    }
                };
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new BaseSlider$SliderState[i4];
            default:
                return new RangeSlider$RangeSliderState[i4];
        }
    }
}
