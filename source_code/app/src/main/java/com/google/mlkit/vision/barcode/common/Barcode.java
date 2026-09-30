package com.google.mlkit.vision.barcode.common;

import V5.x;
import android.graphics.Matrix;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import com.google.mlkit.vision.barcode.common.internal.BarcodeSource;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public class Barcode {
    public static final int FORMAT_ALL_FORMATS = 0;
    public static final int FORMAT_AZTEC = 4096;
    public static final int FORMAT_CODABAR = 8;
    public static final int FORMAT_CODE_128 = 1;
    public static final int FORMAT_CODE_39 = 2;
    public static final int FORMAT_CODE_93 = 4;
    public static final int FORMAT_DATA_MATRIX = 16;
    public static final int FORMAT_EAN_13 = 32;
    public static final int FORMAT_EAN_8 = 64;
    public static final int FORMAT_ITF = 128;
    public static final int FORMAT_PDF417 = 2048;
    public static final int FORMAT_QR_CODE = 256;
    public static final int FORMAT_UNKNOWN = -1;
    public static final int FORMAT_UPC_A = 512;
    public static final int FORMAT_UPC_E = 1024;
    public static final int TYPE_CALENDAR_EVENT = 11;
    public static final int TYPE_CONTACT_INFO = 1;
    public static final int TYPE_DRIVER_LICENSE = 12;
    public static final int TYPE_EMAIL = 2;
    public static final int TYPE_GEO = 10;
    public static final int TYPE_ISBN = 3;
    public static final int TYPE_PHONE = 4;
    public static final int TYPE_PRODUCT = 5;
    public static final int TYPE_SMS = 6;
    public static final int TYPE_TEXT = 7;
    public static final int TYPE_UNKNOWN = 0;
    public static final int TYPE_URL = 8;
    public static final int TYPE_WIFI = 9;
    private final BarcodeSource zza;
    private final Rect zzb;
    private final Point[] zzc;

    /* loaded from: classes2.dex */
    public static class Address {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final int zza;
        private final String[] zzb;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface AddressType {
        }

        public Address(int i4, String[] strArr) {
            this.zza = i4;
            this.zzb = strArr;
        }

        public String[] getAddressLines() {
            return this.zzb;
        }

        @AddressType
        public int getType() {
            return this.zza;
        }
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface BarcodeFormat {
    }

    @Retention(RetentionPolicy.CLASS)
    /* loaded from: classes2.dex */
    public @interface BarcodeValueType {
    }

    /* loaded from: classes2.dex */
    public static class CalendarDateTime {
        private final int zza;
        private final int zzb;
        private final int zzc;
        private final int zzd;
        private final int zze;
        private final int zzf;
        private final boolean zzg;
        private final String zzh;

        public CalendarDateTime(int i4, int i5, int i10, int i11, int i12, int i13, boolean z2, String str) {
            this.zza = i4;
            this.zzb = i5;
            this.zzc = i10;
            this.zzd = i11;
            this.zze = i12;
            this.zzf = i13;
            this.zzg = z2;
            this.zzh = str;
        }

        public int getDay() {
            return this.zzc;
        }

        public int getHours() {
            return this.zzd;
        }

        public int getMinutes() {
            return this.zze;
        }

        public int getMonth() {
            return this.zzb;
        }

        public String getRawValue() {
            return this.zzh;
        }

        public int getSeconds() {
            return this.zzf;
        }

        public int getYear() {
            return this.zza;
        }

        public boolean isUtc() {
            return this.zzg;
        }
    }

    /* loaded from: classes2.dex */
    public static class CalendarEvent {
        private final String zza;
        private final String zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final CalendarDateTime zzf;
        private final CalendarDateTime zzg;

        public CalendarEvent(String str, String str2, String str3, String str4, String str5, CalendarDateTime calendarDateTime, CalendarDateTime calendarDateTime2) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = calendarDateTime;
            this.zzg = calendarDateTime2;
        }

        public String getDescription() {
            return this.zzb;
        }

        public CalendarDateTime getEnd() {
            return this.zzg;
        }

        public String getLocation() {
            return this.zzc;
        }

        public String getOrganizer() {
            return this.zzd;
        }

        public CalendarDateTime getStart() {
            return this.zzf;
        }

        public String getStatus() {
            return this.zze;
        }

        public String getSummary() {
            return this.zza;
        }
    }

    /* loaded from: classes2.dex */
    public static class ContactInfo {
        private final PersonName zza;
        private final String zzb;
        private final String zzc;
        private final List zzd;
        private final List zze;
        private final List zzf;
        private final List zzg;

        public ContactInfo(PersonName personName, String str, String str2, List<Phone> list, List<Email> list2, List<String> list3, List<Address> list4) {
            this.zza = personName;
            this.zzb = str;
            this.zzc = str2;
            this.zzd = list;
            this.zze = list2;
            this.zzf = list3;
            this.zzg = list4;
        }

        public List<Address> getAddresses() {
            return this.zzg;
        }

        public List<Email> getEmails() {
            return this.zze;
        }

        public PersonName getName() {
            return this.zza;
        }

        public String getOrganization() {
            return this.zzb;
        }

        public List<Phone> getPhones() {
            return this.zzd;
        }

        public String getTitle() {
            return this.zzc;
        }

        public List<String> getUrls() {
            return this.zzf;
        }
    }

    /* loaded from: classes2.dex */
    public static class DriverLicense {
        private final String zza;
        private final String zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final String zzf;
        private final String zzg;
        private final String zzh;
        private final String zzi;
        private final String zzj;
        private final String zzk;
        private final String zzl;
        private final String zzm;
        private final String zzn;

        public DriverLicense(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = str6;
            this.zzg = str7;
            this.zzh = str8;
            this.zzi = str9;
            this.zzj = str10;
            this.zzk = str11;
            this.zzl = str12;
            this.zzm = str13;
            this.zzn = str14;
        }

        public String getAddressCity() {
            return this.zzg;
        }

        public String getAddressState() {
            return this.zzh;
        }

        public String getAddressStreet() {
            return this.zzf;
        }

        public String getAddressZip() {
            return this.zzi;
        }

        public String getBirthDate() {
            return this.zzm;
        }

        public String getDocumentType() {
            return this.zza;
        }

        public String getExpiryDate() {
            return this.zzl;
        }

        public String getFirstName() {
            return this.zzb;
        }

        public String getGender() {
            return this.zze;
        }

        public String getIssueDate() {
            return this.zzk;
        }

        public String getIssuingCountry() {
            return this.zzn;
        }

        public String getLastName() {
            return this.zzd;
        }

        public String getLicenseNumber() {
            return this.zzj;
        }

        public String getMiddleName() {
            return this.zzc;
        }
    }

    /* loaded from: classes2.dex */
    public static class Email {
        public static final int TYPE_HOME = 2;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final int zza;
        private final String zzb;
        private final String zzc;
        private final String zzd;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface FormatType {
        }

        public Email(int i4, String str, String str2, String str3) {
            this.zza = i4;
            this.zzb = str;
            this.zzc = str2;
            this.zzd = str3;
        }

        public String getAddress() {
            return this.zzb;
        }

        public String getBody() {
            return this.zzd;
        }

        public String getSubject() {
            return this.zzc;
        }

        @FormatType
        public int getType() {
            return this.zza;
        }
    }

    /* loaded from: classes2.dex */
    public static class GeoPoint {
        private final double zza;
        private final double zzb;

        public GeoPoint(double d4, double d9) {
            this.zza = d4;
            this.zzb = d9;
        }

        public double getLat() {
            return this.zza;
        }

        public double getLng() {
            return this.zzb;
        }
    }

    /* loaded from: classes2.dex */
    public static class PersonName {
        private final String zza;
        private final String zzb;
        private final String zzc;
        private final String zzd;
        private final String zze;
        private final String zzf;
        private final String zzg;

        public PersonName(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = str3;
            this.zzd = str4;
            this.zze = str5;
            this.zzf = str6;
            this.zzg = str7;
        }

        public String getFirst() {
            return this.zzd;
        }

        public String getFormattedName() {
            return this.zza;
        }

        public String getLast() {
            return this.zzf;
        }

        public String getMiddle() {
            return this.zze;
        }

        public String getPrefix() {
            return this.zzc;
        }

        public String getPronunciation() {
            return this.zzb;
        }

        public String getSuffix() {
            return this.zzg;
        }
    }

    /* loaded from: classes2.dex */
    public static class Phone {
        public static final int TYPE_FAX = 3;
        public static final int TYPE_HOME = 2;
        public static final int TYPE_MOBILE = 4;
        public static final int TYPE_UNKNOWN = 0;
        public static final int TYPE_WORK = 1;
        private final String zza;
        private final int zzb;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface FormatType {
        }

        public Phone(String str, int i4) {
            this.zza = str;
            this.zzb = i4;
        }

        public String getNumber() {
            return this.zza;
        }

        @FormatType
        public int getType() {
            return this.zzb;
        }
    }

    /* loaded from: classes2.dex */
    public static class Sms {
        private final String zza;
        private final String zzb;

        public Sms(String str, String str2) {
            this.zza = str;
            this.zzb = str2;
        }

        public String getMessage() {
            return this.zza;
        }

        public String getPhoneNumber() {
            return this.zzb;
        }
    }

    /* loaded from: classes2.dex */
    public static class UrlBookmark {
        private final String zza;
        private final String zzb;

        public UrlBookmark(String str, String str2) {
            this.zza = str;
            this.zzb = str2;
        }

        public String getTitle() {
            return this.zza;
        }

        public String getUrl() {
            return this.zzb;
        }
    }

    /* loaded from: classes2.dex */
    public static class WiFi {
        public static final int TYPE_OPEN = 1;
        public static final int TYPE_WEP = 3;
        public static final int TYPE_WPA = 2;
        private final String zza;
        private final String zzb;
        private final int zzc;

        @Retention(RetentionPolicy.CLASS)
        /* loaded from: classes2.dex */
        public @interface EncryptionType {
        }

        public WiFi(String str, String str2, int i4) {
            this.zza = str;
            this.zzb = str2;
            this.zzc = i4;
        }

        @EncryptionType
        public int getEncryptionType() {
            return this.zzc;
        }

        public String getPassword() {
            return this.zzb;
        }

        public String getSsid() {
            return this.zza;
        }
    }

    public Barcode(BarcodeSource barcodeSource) {
        this(barcodeSource, null);
    }

    public Rect getBoundingBox() {
        return this.zzb;
    }

    public CalendarEvent getCalendarEvent() {
        return this.zza.getCalendarEvent();
    }

    public ContactInfo getContactInfo() {
        return this.zza.getContactInfo();
    }

    public Point[] getCornerPoints() {
        return this.zzc;
    }

    public String getDisplayValue() {
        return this.zza.getDisplayValue();
    }

    public DriverLicense getDriverLicense() {
        return this.zza.getDriverLicense();
    }

    public Email getEmail() {
        return this.zza.getEmail();
    }

    @BarcodeFormat
    public int getFormat() {
        int format = this.zza.getFormat();
        if (format > 4096 || format == 0) {
            return -1;
        }
        return format;
    }

    public GeoPoint getGeoPoint() {
        return this.zza.getGeoPoint();
    }

    public Phone getPhone() {
        return this.zza.getPhone();
    }

    public byte[] getRawBytes() {
        byte[] rawBytes = this.zza.getRawBytes();
        if (rawBytes != null) {
            return Arrays.copyOf(rawBytes, rawBytes.length);
        }
        return null;
    }

    public String getRawValue() {
        return this.zza.getRawValue();
    }

    public Sms getSms() {
        return this.zza.getSms();
    }

    public UrlBookmark getUrl() {
        return this.zza.getUrl();
    }

    @BarcodeValueType
    public int getValueType() {
        return this.zza.getValueType();
    }

    public WiFi getWifi() {
        return this.zza.getWifi();
    }

    public Barcode(BarcodeSource barcodeSource, Matrix matrix) {
        x.hotel(barcodeSource);
        this.zza = barcodeSource;
        Rect boundingBox = barcodeSource.getBoundingBox();
        if (boundingBox != null && matrix != null) {
            RectF rectF = new RectF(boundingBox);
            matrix.mapRect(rectF);
            boundingBox.set((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
        }
        this.zzb = boundingBox;
        Point[] cornerPoints = barcodeSource.getCornerPoints();
        if (cornerPoints != null && matrix != null) {
            int length = cornerPoints.length;
            float[] fArr = new float[length + length];
            for (int i4 = 0; i4 < cornerPoints.length; i4++) {
                Point point = cornerPoints[i4];
                int i5 = i4 + i4;
                fArr[i5] = point.x;
                fArr[i5 + 1] = point.y;
            }
            matrix.mapPoints(fArr);
            for (int i10 = 0; i10 < cornerPoints.length; i10++) {
                int i11 = i10 + i10;
                cornerPoints[i10].set((int) fArr[i11], (int) fArr[i11 + 1]);
            }
        }
        this.zzc = cornerPoints;
    }
}
