package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_barcode.zzr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzu;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzp implements BarcodeSource {
    private final zzu zza;

    public zzp(zzu zzuVar) {
        this.zza = zzuVar;
    }

    private static Barcode.CalendarDateTime zza(com.google.android.gms.internal.mlkit_vision_barcode.zzj zzjVar) {
        if (zzjVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzjVar.alpha, zzjVar.purple, zzjVar.red, zzjVar.silver, zzjVar.teal, zzjVar.white, zzjVar.yellow, zzjVar.f6750a);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        zzu zzuVar = this.zza;
        if (zzuVar.teal != null) {
            int i4 = 0;
            int i5 = RecyclerView.UNDEFINED_DURATION;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MAX_VALUE;
            int i12 = Integer.MIN_VALUE;
            while (true) {
                Point[] pointArr = zzuVar.teal;
                if (i4 < pointArr.length) {
                    Point point = pointArr[i4];
                    i10 = Math.min(i10, point.x);
                    i5 = Math.max(i5, point.x);
                    i11 = Math.min(i11, point.y);
                    i12 = Math.max(i12, point.y);
                    i4++;
                } else {
                    return new Rect(i10, i11, i5, i12);
                }
            }
        } else {
            return null;
        }
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.CalendarEvent getCalendarEvent() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzk zzkVar = this.zza.e;
        if (zzkVar == null) {
            return null;
        }
        return new Barcode.CalendarEvent(zzkVar.alpha, zzkVar.purple, zzkVar.red, zzkVar.silver, zzkVar.teal, zza(zzkVar.white), zza(zzkVar.yellow));
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.ContactInfo getContactInfo() {
        Barcode.PersonName personName;
        List arrayList;
        com.google.android.gms.internal.mlkit_vision_barcode.zzl zzlVar = this.zza.f6761f;
        if (zzlVar == null) {
            return null;
        }
        com.google.android.gms.internal.mlkit_vision_barcode.zzp zzpVar = zzlVar.alpha;
        if (zzpVar == null) {
            personName = null;
        } else {
            personName = new Barcode.PersonName(zzpVar.alpha, zzpVar.purple, zzpVar.red, zzpVar.silver, zzpVar.teal, zzpVar.white, zzpVar.yellow);
        }
        ArrayList arrayList2 = new ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzq[] zzqVarArr = zzlVar.silver;
        if (zzqVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar : zzqVarArr) {
                if (zzqVar != null) {
                    arrayList2.add(new Barcode.Phone(zzqVar.purple, zzqVar.alpha));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzn[] zznVarArr = zzlVar.teal;
        if (zznVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar : zznVarArr) {
                if (zznVar != null) {
                    arrayList3.add(new Barcode.Email(zznVar.alpha, zznVar.purple, zznVar.red, zznVar.silver));
                }
            }
        }
        String[] strArr = zzlVar.white;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        ArrayList arrayList4 = new ArrayList();
        com.google.android.gms.internal.mlkit_vision_barcode.zzi[] zziVarArr = zzlVar.yellow;
        if (zziVarArr != null) {
            for (com.google.android.gms.internal.mlkit_vision_barcode.zzi zziVar : zziVarArr) {
                if (zziVar != null) {
                    arrayList4.add(new Barcode.Address(zziVar.alpha, zziVar.purple));
                }
            }
        }
        return new Barcode.ContactInfo(personName, zzlVar.purple, zzlVar.red, arrayList2, arrayList3, list, arrayList4);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.zza.teal;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getDisplayValue() {
        return this.zza.red;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.DriverLicense getDriverLicense() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzm zzmVar = this.zza.f6762g;
        if (zzmVar == null) {
            return null;
        }
        return new Barcode.DriverLicense(zzmVar.alpha, zzmVar.purple, zzmVar.red, zzmVar.silver, zzmVar.teal, zzmVar.white, zzmVar.yellow, zzmVar.f6751a, zzmVar.f6752b, zzmVar.f6753c, zzmVar.f6754d, zzmVar.e, zzmVar.f6755f, zzmVar.f6756g);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Email getEmail() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzn zznVar = this.zza.white;
        if (zznVar != null) {
            return new Barcode.Email(zznVar.alpha, zznVar.purple, zznVar.red, zznVar.silver);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.alpha;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.GeoPoint getGeoPoint() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzo zzoVar = this.zza.f6760d;
        if (zzoVar != null) {
            return new Barcode.GeoPoint(zzoVar.alpha, zzoVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Phone getPhone() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar = this.zza.yellow;
        if (zzqVar != null) {
            return new Barcode.Phone(zzqVar.purple, zzqVar.alpha);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.f6763h;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getRawValue() {
        return this.zza.purple;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Sms getSms() {
        zzr zzrVar = this.zza.f6757a;
        if (zzrVar != null) {
            return new Barcode.Sms(zzrVar.alpha, zzrVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.UrlBookmark getUrl() {
        zzs zzsVar = this.zza.f6759c;
        if (zzsVar != null) {
            return new Barcode.UrlBookmark(zzsVar.alpha, zzsVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.silver;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.WiFi getWifi() {
        zzt zztVar = this.zza.f6758b;
        if (zztVar != null) {
            return new Barcode.WiFi(zztVar.alpha, zztVar.purple, zztVar.red);
        }
        return null;
    }
}
