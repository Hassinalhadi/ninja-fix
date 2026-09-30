package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.internal.measurement.AbstractC1394y;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes2.dex */
public final class ad extends AbstractC1394y implements ae {
    public ad(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.internal.IMeasurementService", 0);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final String amber(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        Parcel jade = jade(ivory, 11);
        String readString = jade.readString();
        jade.recycle();
        return readString;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void beige(zzr zzrVar, zzpc zzpcVar, ai aiVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzpcVar);
        com.google.android.gms.internal.measurement.aa.delta(ivory, aiVar);
        lavender(ivory, 29);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void black(String str, String str2, String str3, long j5) {
        Parcel ivory = ivory();
        ivory.writeLong(j5);
        ivory.writeString(str);
        ivory.writeString(str2);
        ivory.writeString(str3);
        lavender(ivory, 10);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final byte[] blue(zzbh zzbhVar, String str) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzbhVar);
        ivory.writeString(str);
        Parcel jade = jade(ivory, 9);
        byte[] createByteArray = jade.createByteArray();
        jade.recycle();
        return createByteArray;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void bronze(zzai zzaiVar, zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzaiVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 12);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void coral(zzqb zzqbVar, zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzqbVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 2);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void crimson(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 25);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List echo(String str, String str2, boolean z2, String str3) {
        Parcel ivory = ivory();
        ivory.writeString(null);
        ivory.writeString(str2);
        ivory.writeString(str3);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.aa.alpha;
        ivory.writeInt(z2 ? 1 : 0);
        Parcel jade = jade(ivory, 15);
        ArrayList createTypedArrayList = jade.createTypedArrayList(zzqb.CREATOR);
        jade.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void foxtrot(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 18);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void fuchsia(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 27);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void gold(zzr zzrVar, zzag zzagVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzagVar);
        lavender(ivory, 30);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void golf(zzbh zzbhVar, zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzbhVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 1);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final zzap gray(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        Parcel jade = jade(ivory, 21);
        zzap zzapVar = (zzap) com.google.android.gms.internal.measurement.aa.alpha(jade, zzap.CREATOR);
        jade.recycle();
        return zzapVar;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void green(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 20);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List hotel(String str, String str2, boolean z2, zzr zzrVar) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        ClassLoader classLoader = com.google.android.gms.internal.measurement.aa.alpha;
        ivory.writeInt(z2 ? 1 : 0);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        Parcel jade = jade(ivory, 14);
        ArrayList createTypedArrayList = jade.createTypedArrayList(zzqb.CREATOR);
        jade.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List indigo(String str, String str2, zzr zzrVar) {
        Parcel ivory = ivory();
        ivory.writeString(str);
        ivory.writeString(str2);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        Parcel jade = jade(ivory, 16);
        ArrayList createTypedArrayList = jade.createTypedArrayList(zzai.CREATOR);
        jade.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void juliet(Bundle bundle, zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, bundle);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 19);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final List papa(String str, String str2, String str3) {
        Parcel ivory = ivory();
        ivory.writeString(null);
        ivory.writeString(str2);
        ivory.writeString(str3);
        Parcel jade = jade(ivory, 17);
        ArrayList createTypedArrayList = jade.createTypedArrayList(zzai.CREATOR);
        jade.recycle();
        return createTypedArrayList;
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void quebec(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 26);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void uniform(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 6);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void whiskey(zzr zzrVar, Bundle bundle, ag agVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        com.google.android.gms.internal.measurement.aa.charlie(ivory, bundle);
        com.google.android.gms.internal.measurement.aa.delta(ivory, agVar);
        lavender(ivory, 31);
    }

    @Override // com.google.android.gms.measurement.internal.ae
    public final void yankee(zzr zzrVar) {
        Parcel ivory = ivory();
        com.google.android.gms.internal.measurement.aa.charlie(ivory, zzrVar);
        lavender(ivory, 4);
    }
}
