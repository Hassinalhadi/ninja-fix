package com.google.mlkit.vision.barcode.internal;

import android.graphics.Point;
import android.graphics.Rect;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxp;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxq;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxr;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxs;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxt;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxu;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxv;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxw;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxx;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxy;
import com.google.android.gms.internal.mlkit_vision_barcode.zzxz;
import com.google.android.gms.internal.mlkit_vision_barcode.zzya;
import com.google.android.gms.internal.mlkit_vision_barcode.zzyb;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzn implements BarcodeSource {
    private final zzyb zza;

    public zzn(zzyb zzybVar) {
        this.zza = zzybVar;
    }

    private static Barcode.CalendarDateTime zza(zzxq zzxqVar) {
        if (zzxqVar == null) {
            return null;
        }
        return new Barcode.CalendarDateTime(zzxqVar.alpha, zzxqVar.purple, zzxqVar.red, zzxqVar.silver, zzxqVar.teal, zzxqVar.white, zzxqVar.yellow, zzxqVar.f6766a);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Rect getBoundingBox() {
        Point[] pointArr = this.zza.teal;
        if (pointArr != null) {
            int i4 = RecyclerView.UNDEFINED_DURATION;
            int i5 = Integer.MAX_VALUE;
            int i10 = Integer.MAX_VALUE;
            int i11 = Integer.MIN_VALUE;
            for (Point point : pointArr) {
                i5 = Math.min(i5, point.x);
                i4 = Math.max(i4, point.x);
                i10 = Math.min(i10, point.y);
                i11 = Math.max(i11, point.y);
            }
            return new Rect(i5, i10, i4, i11);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.CalendarEvent getCalendarEvent() {
        zzxr zzxrVar = this.zza.f6777f;
        if (zzxrVar != null) {
            return new Barcode.CalendarEvent(zzxrVar.alpha, zzxrVar.purple, zzxrVar.red, zzxrVar.silver, zzxrVar.teal, zza(zzxrVar.white), zza(zzxrVar.yellow));
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.ContactInfo getContactInfo() {
        Barcode.PersonName personName;
        List arrayList;
        zzxs zzxsVar = this.zza.f6778g;
        if (zzxsVar == null) {
            return null;
        }
        zzxw zzxwVar = zzxsVar.alpha;
        if (zzxwVar == null) {
            personName = null;
        } else {
            personName = new Barcode.PersonName(zzxwVar.alpha, zzxwVar.purple, zzxwVar.red, zzxwVar.silver, zzxwVar.teal, zzxwVar.white, zzxwVar.yellow);
        }
        ArrayList arrayList2 = new ArrayList();
        zzxx[] zzxxVarArr = zzxsVar.silver;
        if (zzxxVarArr != null) {
            for (zzxx zzxxVar : zzxxVarArr) {
                if (zzxxVar != null) {
                    arrayList2.add(new Barcode.Phone(zzxxVar.purple, zzxxVar.alpha));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList();
        zzxu[] zzxuVarArr = zzxsVar.teal;
        if (zzxuVarArr != null) {
            for (zzxu zzxuVar : zzxuVarArr) {
                if (zzxuVar != null) {
                    arrayList3.add(new Barcode.Email(zzxuVar.alpha, zzxuVar.purple, zzxuVar.red, zzxuVar.silver));
                }
            }
        }
        String[] strArr = zzxsVar.white;
        if (strArr != null) {
            arrayList = Arrays.asList(strArr);
        } else {
            arrayList = new ArrayList();
        }
        List list = arrayList;
        ArrayList arrayList4 = new ArrayList();
        zzxp[] zzxpVarArr = zzxsVar.yellow;
        if (zzxpVarArr != null) {
            for (zzxp zzxpVar : zzxpVarArr) {
                if (zzxpVar != null) {
                    arrayList4.add(new Barcode.Address(zzxpVar.alpha, zzxpVar.purple));
                }
            }
        }
        return new Barcode.ContactInfo(personName, zzxsVar.purple, zzxsVar.red, arrayList2, arrayList3, list, arrayList4);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Point[] getCornerPoints() {
        return this.zza.teal;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getDisplayValue() {
        return this.zza.purple;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.DriverLicense getDriverLicense() {
        zzxt zzxtVar = this.zza.f6779h;
        if (zzxtVar != null) {
            return new Barcode.DriverLicense(zzxtVar.alpha, zzxtVar.purple, zzxtVar.red, zzxtVar.silver, zzxtVar.teal, zzxtVar.white, zzxtVar.yellow, zzxtVar.f6767a, zzxtVar.f6768b, zzxtVar.f6769c, zzxtVar.f6770d, zzxtVar.e, zzxtVar.f6771f, zzxtVar.f6772g);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Email getEmail() {
        zzxu zzxuVar = this.zza.yellow;
        if (zzxuVar == null) {
            return null;
        }
        return new Barcode.Email(zzxuVar.alpha, zzxuVar.purple, zzxuVar.red, zzxuVar.silver);
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getFormat() {
        return this.zza.alpha;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.GeoPoint getGeoPoint() {
        zzxv zzxvVar = this.zza.e;
        if (zzxvVar != null) {
            return new Barcode.GeoPoint(zzxvVar.alpha, zzxvVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Phone getPhone() {
        zzxx zzxxVar = this.zza.f6773a;
        if (zzxxVar != null) {
            return new Barcode.Phone(zzxxVar.purple, zzxxVar.alpha);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final byte[] getRawBytes() {
        return this.zza.silver;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final String getRawValue() {
        return this.zza.red;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.Sms getSms() {
        zzxy zzxyVar = this.zza.f6774b;
        if (zzxyVar != null) {
            return new Barcode.Sms(zzxyVar.alpha, zzxyVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.UrlBookmark getUrl() {
        zzxz zzxzVar = this.zza.f6776d;
        if (zzxzVar != null) {
            return new Barcode.UrlBookmark(zzxzVar.alpha, zzxzVar.purple);
        }
        return null;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final int getValueType() {
        return this.zza.white;
    }

    @Override // com.google.mlkit.vision.barcode.common.internal.BarcodeSource
    public final Barcode.WiFi getWifi() {
        zzya zzyaVar = this.zza.f6775c;
        if (zzyaVar != null) {
            return new Barcode.WiFi(zzyaVar.alpha, zzyaVar.purple, zzyaVar.red);
        }
        return null;
    }
}
