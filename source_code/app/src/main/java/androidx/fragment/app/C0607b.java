package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import java.util.ArrayList;

/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0607b implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    /* JADX WARN: Type inference failed for: r0v3, types: [androidx.fragment.app.FragmentManager$LaunchedFragmentInfo, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v4, types: [androidx.fragment.app.FragmentManagerState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [android.view.View$BaseSavedState, androidx.fragment.app.FragmentTabHost$SavedState, java.lang.Object] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.alpha) {
            case 0:
                return new BackStackRecordState(parcel);
            case 1:
                return new BackStackState(parcel);
            case 2:
                ?? obj = new Object();
                obj.alpha = parcel.readString();
                obj.purple = parcel.readInt();
                return obj;
            case 3:
                ?? obj2 = new Object();
                obj2.teal = null;
                obj2.white = new ArrayList();
                obj2.yellow = new ArrayList();
                obj2.alpha = parcel.createStringArrayList();
                obj2.purple = parcel.createStringArrayList();
                obj2.red = (BackStackRecordState[]) parcel.createTypedArray(BackStackRecordState.CREATOR);
                obj2.silver = parcel.readInt();
                obj2.teal = parcel.readString();
                obj2.white = parcel.createStringArrayList();
                obj2.yellow = parcel.createTypedArrayList(BackStackState.CREATOR);
                obj2.f3112a = parcel.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
                return obj2;
            case 4:
                return new FragmentState(parcel);
            default:
                ?? baseSavedState = new View.BaseSavedState(parcel);
                baseSavedState.alpha = parcel.readString();
                return baseSavedState;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new BackStackRecordState[i4];
            case 1:
                return new BackStackState[i4];
            case 2:
                return new FragmentManager$LaunchedFragmentInfo[i4];
            case 3:
                return new FragmentManagerState[i4];
            case 4:
                return new FragmentState[i4];
            default:
                return new FragmentTabHost$SavedState[i4];
        }
    }
}
