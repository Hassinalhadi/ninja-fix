package com.google.mlkit.vision.barcode.internal;

import B0.a;
import android.annotation.SuppressLint;
import android.util.SparseArray;
import androidx.appcompat.widget.i1;
import com.google.mlkit.common.sdkinternal.i;
import com.google.mlkit.vision.barcode.BarcodeScannerOptions;
import com.google.mlkit.vision.barcode.common.Barcode;
import g.C1718a;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import s6.A5;
import s6.EnumC2822y5;
import s6.EnumC2831z5;
import s6.H7;
import s6.I7;
import s6.J5;
import s6.K5;
import s6.L7;
import s6.N5;
import s6.O7;
import s6.P7;
import s6.aa;
import s6.ac;

/* loaded from: classes2.dex */
public final class zzb {
    static final AtomicReference zza;
    private static final SparseArray zzb;
    private static final SparseArray zzc;

    @SuppressLint({"UseSparseArrays"})
    private static final Map zzd;

    static {
        SparseArray sparseArray = new SparseArray();
        zzb = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        zzc = sparseArray2;
        zza = new AtomicReference();
        sparseArray.put(-1, J5.FORMAT_UNKNOWN);
        sparseArray.put(1, J5.FORMAT_CODE_128);
        sparseArray.put(2, J5.FORMAT_CODE_39);
        sparseArray.put(4, J5.FORMAT_CODE_93);
        sparseArray.put(8, J5.FORMAT_CODABAR);
        sparseArray.put(16, J5.FORMAT_DATA_MATRIX);
        sparseArray.put(32, J5.FORMAT_EAN_13);
        sparseArray.put(64, J5.FORMAT_EAN_8);
        sparseArray.put(128, J5.FORMAT_ITF);
        sparseArray.put(Barcode.FORMAT_QR_CODE, J5.FORMAT_QR_CODE);
        sparseArray.put(512, J5.FORMAT_UPC_A);
        sparseArray.put(Barcode.FORMAT_UPC_E, J5.FORMAT_UPC_E);
        sparseArray.put(2048, J5.FORMAT_PDF417);
        sparseArray.put(4096, J5.FORMAT_AZTEC);
        sparseArray2.put(0, K5.TYPE_UNKNOWN);
        sparseArray2.put(1, K5.TYPE_CONTACT_INFO);
        sparseArray2.put(2, K5.TYPE_EMAIL);
        sparseArray2.put(3, K5.TYPE_ISBN);
        sparseArray2.put(4, K5.TYPE_PHONE);
        sparseArray2.put(5, K5.TYPE_PRODUCT);
        sparseArray2.put(6, K5.TYPE_SMS);
        sparseArray2.put(7, K5.TYPE_TEXT);
        sparseArray2.put(8, K5.TYPE_URL);
        sparseArray2.put(9, K5.TYPE_WIFI);
        sparseArray2.put(10, K5.TYPE_GEO);
        sparseArray2.put(11, K5.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, K5.TYPE_DRIVER_LICENSE);
        HashMap hashMap = new HashMap();
        zzd = hashMap;
        hashMap.put(1, H7.CODE_128);
        hashMap.put(2, H7.CODE_39);
        hashMap.put(4, H7.CODE_93);
        hashMap.put(8, H7.CODABAR);
        hashMap.put(16, H7.DATA_MATRIX);
        hashMap.put(32, H7.EAN_13);
        hashMap.put(64, H7.EAN_8);
        hashMap.put(128, H7.ITF);
        hashMap.put(Integer.valueOf(Barcode.FORMAT_QR_CODE), H7.QR_CODE);
        hashMap.put(512, H7.UPC_A);
        hashMap.put(Integer.valueOf(Barcode.FORMAT_UPC_E), H7.UPC_E);
        hashMap.put(2048, H7.PDF417);
        hashMap.put(4096, H7.AZTEC);
    }

    public static J5 zza(@Barcode.BarcodeFormat int i4) {
        J5 j5 = (J5) zzb.get(i4);
        if (j5 == null) {
            return J5.FORMAT_UNKNOWN;
        }
        return j5;
    }

    public static K5 zzb(@Barcode.BarcodeValueType int i4) {
        K5 k52 = (K5) zzc.get(i4);
        if (k52 == null) {
            return K5.TYPE_UNKNOWN;
        }
        return k52;
    }

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, s1.i] */
    public static I7 zzc(BarcodeScannerOptions barcodeScannerOptions) {
        int zza2 = barcodeScannerOptions.zza();
        ac acVar = new ac();
        if (zza2 == 0) {
            Collection values = zzd.values();
            if (values instanceof Collection) {
                Collection collection = values;
                acVar.bravo(collection.size() + acVar.bravo);
                if (collection instanceof aa) {
                    acVar.bravo = ((aa) collection).alpha(acVar.bravo, acVar.alpha);
                }
            }
            Iterator it = values.iterator();
            while (it.hasNext()) {
                acVar.alpha(it.next());
            }
        } else {
            for (Map.Entry entry : zzd.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & zza2) != 0) {
                    acVar.alpha((H7) entry.getValue());
                }
            }
        }
        ?? obj = new Object();
        obj.alpha = acVar.charlie();
        return new I7(obj);
    }

    public static String zzd() {
        if (true != zzf()) {
            return "play-services-mlkit-barcode-scanning";
        }
        return "barcode-scanning";
    }

    public static void zze(P7 p72, final EnumC2831z5 enumC2831z5) {
        p72.bravo(new O7() { // from class: com.google.mlkit.vision.barcode.internal.zza
            /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, androidx.appcompat.widget.i1] */
            @Override // s6.O7
            public final L7 zza() {
                EnumC2822y5 enumC2822y5;
                ?? obj = new Object();
                if (zzb.zzf()) {
                    enumC2822y5 = EnumC2822y5.TYPE_THICK;
                } else {
                    enumC2822y5 = EnumC2822y5.TYPE_THIN;
                }
                EnumC2831z5 enumC2831z52 = EnumC2831z5.this;
                obj.charlie = enumC2822y5;
                C1718a c1718a = new C1718a(24);
                c1718a.purple = enumC2831z52;
                obj.echo = new N5(c1718a);
                return new a((i1) obj, 0);
            }
        }, A5.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean zzf() {
        AtomicReference atomicReference = zza;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zzd2 = zzo.zzd(i.charlie().bravo());
        atomicReference.set(Boolean.valueOf(zzd2));
        return zzd2;
    }
}
