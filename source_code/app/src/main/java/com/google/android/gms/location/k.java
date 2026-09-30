package com.google.android.gms.location;

import android.os.Parcelable;

/* loaded from: classes2.dex */
public final class k implements Parcelable.Creator {
    public final /* synthetic */ int alpha;

    public /* synthetic */ k(int i4) {
        this.alpha = i4;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 636
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r42) {
        /*
            Method dump skipped, instructions count: 1962
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.location.k.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i4) {
        switch (this.alpha) {
            case 0:
                return new LocationResult[i4];
            case 1:
                return new LastLocationRequest[i4];
            case 2:
                return new LocationAvailability[i4];
            case 3:
                return new zzad[i4];
            case 4:
                return new LocationRequest[i4];
            case 5:
                return new LocationSettingsRequest[i4];
            case 6:
                return new LocationSettingsResult[i4];
            case 7:
                return new LocationSettingsStates[i4];
            case 8:
                return new zzal[i4];
            case 9:
                return new SleepClassifyEvent[i4];
            case 10:
                return new SleepSegmentEvent[i4];
            case 11:
                return new SleepSegmentRequest[i4];
            case 12:
                return new zzas[i4];
            case 13:
                return new zzb[i4];
            case 14:
                return new ActivityRecognitionResult[i4];
            case 15:
                return new ActivityTransition[i4];
            case 16:
                return new ActivityTransitionEvent[i4];
            case 17:
                return new ActivityTransitionRequest[i4];
            case 18:
                return new ActivityTransitionResult[i4];
            case 19:
                return new CurrentLocationRequest[i4];
            case 20:
                return new DetectedActivity[i4];
            case 21:
                return new DeviceOrientation[i4];
            case 22:
                return new DeviceOrientationRequest[i4];
            default:
                return new GeofencingRequest[i4];
        }
    }
}
