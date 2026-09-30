package com.incognia.internal;

import android.bluetooth.BluetoothClass;
import android.bluetooth.BluetoothDevice;
import android.os.ParcelUuid;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class t1 {
    public static Ve b(BluetoothDevice bluetoothDevice) {
        String str;
        ArrayList arrayList;
        Integer num;
        Integer num2;
        int addressType;
        String alias;
        BluetoothClass bluetoothClass = bluetoothDevice.getBluetoothClass();
        Integer num3 = null;
        if (CnH.b(CnH.f8484b, 30, 0, 2)) {
            alias = bluetoothDevice.getAlias();
            str = alias;
        } else {
            str = null;
        }
        ParcelUuid[] uuids = bluetoothDevice.getUuids();
        if (uuids != null) {
            ArrayList arrayList2 = new ArrayList(uuids.length);
            for (ParcelUuid parcelUuid : uuids) {
                arrayList2.add(parcelUuid.getUuid().toString());
            }
            arrayList = arrayList2;
        } else {
            arrayList = null;
        }
        if (CnH.b(CnH.f8484b, 35, 0, 2)) {
            addressType = bluetoothDevice.getAddressType();
            num = Integer.valueOf(addressType);
        } else {
            num = null;
        }
        String name = bluetoothDevice.getName();
        String address = bluetoothDevice.getAddress();
        int bondState = bluetoothDevice.getBondState();
        int type = bluetoothDevice.getType();
        if (bluetoothClass != null) {
            num2 = Integer.valueOf(bluetoothClass.getMajorDeviceClass());
        } else {
            num2 = null;
        }
        if (bluetoothClass != null) {
            num3 = Integer.valueOf(bluetoothClass.getDeviceClass());
        }
        return new Ve(name, address, str, bondState, type, num2, num3, arrayList, num);
    }
}
