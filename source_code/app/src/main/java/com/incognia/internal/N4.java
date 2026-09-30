package com.incognia.internal;

import E0.a;
import android.content.Context;
import android.nfc.AvailableNfcAntenna;
import android.nfc.NfcAdapter;
import android.nfc.NfcAntennaInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes2.dex */
public final class N4 {

    /* renamed from: b, reason: collision with root package name */
    public final NfcAdapter f9181b;

    public N4(Context context) {
        this.f9181b = NfcAdapter.getDefaultAdapter(context);
    }

    public final Boolean W() {
        boolean z2;
        try {
            NfcAdapter nfcAdapter = this.f9181b;
            if (nfcAdapter != null) {
                z2 = nfcAdapter.isEnabled();
            } else {
                z2 = false;
            }
            return Boolean.valueOf(z2);
        } catch (Throwable unused) {
            return null;
        }
    }

    public final VXt b() {
        NfcAntennaInfo nfcAntennaInfo;
        List availableNfcAntennas;
        int collectionSizeOrDefault;
        int deviceHeight;
        int deviceWidth;
        boolean isDeviceFoldable;
        int locationX;
        int locationY;
        if (CnH.b(CnH.f8484b, 34, 0, 2)) {
            NfcAdapter nfcAdapter = this.f9181b;
            if (nfcAdapter != null) {
                nfcAntennaInfo = nfcAdapter.getNfcAntennaInfo();
            } else {
                nfcAntennaInfo = null;
            }
            if (nfcAntennaInfo != null) {
                availableNfcAntennas = nfcAntennaInfo.getAvailableNfcAntennas();
                collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(availableNfcAntennas, 10);
                ArrayList arrayList = new ArrayList(collectionSizeOrDefault);
                Iterator it = availableNfcAntennas.iterator();
                while (it.hasNext()) {
                    AvailableNfcAntenna kilo = a.kilo(it.next());
                    locationX = kilo.getLocationX();
                    locationY = kilo.getLocationY();
                    arrayList.add(new fZ(locationX, locationY));
                }
                deviceHeight = nfcAntennaInfo.getDeviceHeight();
                deviceWidth = nfcAntennaInfo.getDeviceWidth();
                isDeviceFoldable = nfcAntennaInfo.isDeviceFoldable();
                return new VXt(arrayList, deviceHeight, deviceWidth, isDeviceFoldable);
            }
        }
        return null;
    }
}
