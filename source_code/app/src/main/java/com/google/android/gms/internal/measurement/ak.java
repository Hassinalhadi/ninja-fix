package com.google.android.gms.internal.measurement;

import android.os.Bundle;
import android.os.Parcel;
import h6.InterfaceC1812b;

/* loaded from: classes2.dex */
public final class ak extends AbstractC1394y implements am {
    @Override // com.google.android.gms.internal.measurement.am
    public final void beginAdUnitExposure(String str, long j5) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeLong(j5);
        lavender(ivory, 23);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        aa.charlie(ivory, bundle);
        lavender(ivory, 9);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void endAdUnitExposure(String str, long j5) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeLong(j5);
        lavender(ivory, 24);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void generateEventId(ao aoVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aoVar);
        lavender(ivory, 22);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getCachedAppInstanceId(ao aoVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aoVar);
        lavender(ivory, 19);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getConditionalUserProperties(String str, String str2, ao aoVar) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        aa.delta(ivory, aoVar);
        lavender(ivory, 10);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getCurrentScreenClass(ao aoVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aoVar);
        lavender(ivory, 17);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getCurrentScreenName(ao aoVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aoVar);
        lavender(ivory, 16);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getGmpAppId(ao aoVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aoVar);
        lavender(ivory, 21);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getMaxUserProperties(String str, ao aoVar) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        aa.delta(ivory, aoVar);
        lavender(ivory, 6);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void getUserProperties(String str, String str2, boolean z2, ao aoVar) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        ClassLoader classLoader = aa.alpha;
        ivory.writeInt(z2 ? 1 : 0);
        aa.delta(ivory, aoVar);
        lavender(ivory, 5);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void initialize(InterfaceC1812b interfaceC1812b, zzdh zzdhVar, long j5) {
        Parcel ivory = ivory();
        aa.delta(ivory, interfaceC1812b);
        aa.charlie(ivory, zzdhVar);
        ivory.writeLong(j5);
        lavender(ivory, 1);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void logEvent(String str, String str2, Bundle bundle, boolean z2, boolean z10, long j5) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        aa.charlie(ivory, bundle);
        ivory.writeInt(z2 ? 1 : 0);
        ivory.writeInt(1);
        ivory.writeLong(j5);
        lavender(ivory, 2);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void logHealthData(int i4, String str, InterfaceC1812b interfaceC1812b, InterfaceC1812b interfaceC1812b2, InterfaceC1812b interfaceC1812b3) {
        Parcel ivory = ivory();
        ivory.writeInt(5);
        ivory.writeString("Error with data collection. Data lost.");
        aa.delta(ivory, interfaceC1812b);
        aa.delta(ivory, interfaceC1812b2);
        aa.delta(ivory, interfaceC1812b3);
        lavender(ivory, 33);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityCreatedByScionActivityInfo(zzdj zzdjVar, Bundle bundle, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        aa.charlie(ivory, bundle);
        ivory.writeLong(j5);
        lavender(ivory, 53);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityDestroyedByScionActivityInfo(zzdj zzdjVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeLong(j5);
        lavender(ivory, 54);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityPausedByScionActivityInfo(zzdj zzdjVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeLong(j5);
        lavender(ivory, 55);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityResumedByScionActivityInfo(zzdj zzdjVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeLong(j5);
        lavender(ivory, 56);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivitySaveInstanceStateByScionActivityInfo(zzdj zzdjVar, ao aoVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        aa.delta(ivory, aoVar);
        ivory.writeLong(j5);
        lavender(ivory, 57);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityStartedByScionActivityInfo(zzdj zzdjVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeLong(j5);
        lavender(ivory, 51);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void onActivityStoppedByScionActivityInfo(zzdj zzdjVar, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeLong(j5);
        lavender(ivory, 52);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void registerOnMeasurementEventListener(as asVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, asVar);
        lavender(ivory, 35);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void retrieveAndUploadBatches(aq aqVar) {
        Parcel ivory = ivory();
        aa.delta(ivory, aqVar);
        lavender(ivory, 58);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void setConditionalUserProperty(Bundle bundle, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, bundle);
        ivory.writeLong(j5);
        lavender(ivory, 8);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void setCurrentScreenByScionActivityInfo(zzdj zzdjVar, String str, String str2, long j5) {
        Parcel ivory = ivory();
        aa.charlie(ivory, zzdjVar);
        ivory.writeString(str);
        ivory.writeString(str2);
        ivory.writeLong(j5);
        lavender(ivory, 50);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void setDataCollectionEnabled(boolean z2) {
        throw null;
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void setUserId(String str, long j5) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeLong(j5);
        lavender(ivory, 7);
    }

    @Override // com.google.android.gms.internal.measurement.am
    public final void setUserProperty(String str, String str2, InterfaceC1812b interfaceC1812b, boolean z2, long j5) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        aa.delta(ivory, interfaceC1812b);
        ivory.writeInt(z2 ? 1 : 0);
        ivory.writeLong(j5);
        lavender(ivory, 4);
    }
}
