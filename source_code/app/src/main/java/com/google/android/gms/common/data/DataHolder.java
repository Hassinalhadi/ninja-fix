package com.google.android.gms.common.data;

import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;
import t6.AbstractC3043q;
import z1.e;

@KeepName
/* loaded from: classes2.dex */
public final class DataHolder extends AbstractSafeParcelable implements Closeable, AutoCloseable {
    public static final Parcelable.Creator<DataHolder> CREATOR = new e(23);

    /* renamed from: a, reason: collision with root package name */
    public boolean f6638a = false;
    public final int alpha;
    public final String[] purple;
    public Bundle red;
    public final CursorWindow[] silver;
    public final int teal;
    public final Bundle white;
    public int[] yellow;

    static {
        new ArrayList();
        new HashMap();
    }

    public DataHolder(int i4, String[] strArr, CursorWindow[] cursorWindowArr, int i5, Bundle bundle) {
        this.alpha = i4;
        this.purple = strArr;
        this.silver = cursorWindowArr;
        this.teal = i5;
        this.white = bundle;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this) {
            try {
                if (!this.f6638a) {
                    this.f6638a = true;
                    int i4 = 0;
                    while (true) {
                        CursorWindow[] cursorWindowArr = this.silver;
                        if (i4 >= cursorWindowArr.length) {
                            break;
                        }
                        cursorWindowArr[i4].close();
                        i4++;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void finalize() {
        boolean z2;
        try {
            if (this.silver.length > 0) {
                synchronized (this) {
                    z2 = this.f6638a;
                }
                if (!z2) {
                    close();
                    Log.e("DataBuffer", "Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: " + toString() + ")");
                }
            }
        } finally {
            super.finalize();
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.mike(parcel, 1, this.purple);
        AbstractC3043q.oscar(parcel, 2, this.silver, i4);
        AbstractC3043q.sierra(parcel, 3, 4);
        parcel.writeInt(this.teal);
        AbstractC3043q.bravo(parcel, 4, this.white);
        AbstractC3043q.sierra(parcel, 1000, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.romeo(parcel, quebec);
        if ((i4 & 1) != 0) {
            close();
        }
    }
}
