package com.app.network.network.models;

import Q0.c;
import av.q;
import com.clevertap.android.sdk.Constants;
import com.google.android.material.datepicker.j;
import com.google.mlkit.vision.barcode.common.Barcode;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import okhttp3.internal.http2.Http2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\bh\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B§\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u000b\u0010U\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010V\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010W\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010Y\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010Z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010[\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u0010\u0010]\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010^\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0002\u0010'J\u000b\u0010c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J®\u0002\u0010m\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010nJ\u0013\u0010o\u001a\u00020p2\b\u0010q\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010r\u001a\u00020\u0007HÖ\u0001J\t\u0010s\u001a\u00020\u0003HÖ\u0001R\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u001f\"\u0004\b#\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u001f\"\u0004\b%\u0010!R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u001f\"\u0004\b,\u0010!R\u001c\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\u001f\"\u0004\b.\u0010!R\u001c\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u001f\"\u0004\b0\u0010!R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b1\u0010'\"\u0004\b2\u0010)R\u001e\u0010\f\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b3\u0010'\"\u0004\b4\u0010)R\u001c\u0010\r\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u001f\"\u0004\b6\u0010!R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u001f\"\u0004\b8\u0010!R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010\u001f\"\u0004\b:\u0010!R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u001f\"\u0004\b<\u0010!R\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u0010\n\u0002\u0010*\u001a\u0004\b=\u0010'\"\u0004\b>\u0010)R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010\u001f\"\u0004\b@\u0010!R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u001f\"\u0004\bB\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u001f\"\u0004\bD\u0010!R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010\u001f\"\u0004\bF\u0010!R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u001f\"\u0004\bH\u0010!R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u001f\"\u0004\bJ\u0010!R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u0010\u001f\"\u0004\bL\u0010!R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bM\u0010\u001f\"\u0004\bN\u0010!R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u001f\"\u0004\bP\u0010!R\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bQ\u0010\u001f\"\u0004\bR\u0010!R\u0013\u0010S\u001a\u0004\u0018\u00010\u00038F¢\u0006\u0006\u001a\u0004\bT\u0010\u001f¨\u0006t"}, d2 = {"Lcom/app/network/network/models/SignUpRequest;", "", "idNumber", "", "dob", "preference", "preferredPlatformId", "", "vehiclePlateNumber", "vehicleSequenceNumber", "nationality", "countryId", "cityId", "mobileNumber", "fintechId", "ibanName", "ibanNumber", "bankId", "referralCode", "idCardSnap", "drivingLicenseSnap", "vehicleRegistrationSnap", "mobileCountryCode", "profileSnap", "urPayAccountIban", "urPayIdNumber", "firstName", "lastName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getIdNumber", "()Ljava/lang/String;", "setIdNumber", "(Ljava/lang/String;)V", "getDob", "setDob", "getPreference", "setPreference", "getPreferredPlatformId", "()Ljava/lang/Integer;", "setPreferredPlatformId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getVehiclePlateNumber", "setVehiclePlateNumber", "getVehicleSequenceNumber", "setVehicleSequenceNumber", "getNationality", "setNationality", "getCountryId", "setCountryId", "getCityId", "setCityId", "getMobileNumber", "setMobileNumber", "getFintechId", "setFintechId", "getIbanName", "setIbanName", "getIbanNumber", "setIbanNumber", "getBankId", "setBankId", "getReferralCode", "setReferralCode", "getIdCardSnap", "setIdCardSnap", "getDrivingLicenseSnap", "setDrivingLicenseSnap", "getVehicleRegistrationSnap", "setVehicleRegistrationSnap", "getMobileCountryCode", "setMobileCountryCode", "getProfileSnap", "setProfileSnap", "getUrPayAccountIban", "setUrPayAccountIban", "getUrPayIdNumber", "setUrPayIdNumber", "getFirstName", "setFirstName", "getLastName", "setLastName", "name", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/app/network/network/models/SignUpRequest;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SignUpRequest {

    @Nullable
    private Integer bankId;

    @Nullable
    private Integer cityId;

    @Nullable
    private Integer countryId;

    @Nullable
    private String dob;

    @Nullable
    private String drivingLicenseSnap;

    @Nullable
    private String fintechId;

    @Nullable
    private String firstName;

    @Nullable
    private String ibanName;

    @Nullable
    private String ibanNumber;

    @Nullable
    private String idCardSnap;

    @Nullable
    private String idNumber;

    @Nullable
    private String lastName;

    @Nullable
    private String mobileCountryCode;

    @Nullable
    private String mobileNumber;

    @Nullable
    private String nationality;

    @Nullable
    private String preference;

    @Nullable
    private Integer preferredPlatformId;

    @Nullable
    private String profileSnap;

    @Nullable
    private String referralCode;

    @Nullable
    private String urPayAccountIban;

    @Nullable
    private String urPayIdNumber;

    @Nullable
    private String vehiclePlateNumber;

    @Nullable
    private String vehicleRegistrationSnap;

    @Nullable
    private String vehicleSequenceNumber;

    public SignUpRequest() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public static /* synthetic */ SignUpRequest copy$default(SignUpRequest signUpRequest, String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9, String str10, Integer num4, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i4, Object obj) {
        String str21;
        String str22;
        String str23 = (i4 & 1) != 0 ? signUpRequest.idNumber : str;
        String str24 = (i4 & 2) != 0 ? signUpRequest.dob : str2;
        String str25 = (i4 & 4) != 0 ? signUpRequest.preference : str3;
        Integer num5 = (i4 & 8) != 0 ? signUpRequest.preferredPlatformId : num;
        String str26 = (i4 & 16) != 0 ? signUpRequest.vehiclePlateNumber : str4;
        String str27 = (i4 & 32) != 0 ? signUpRequest.vehicleSequenceNumber : str5;
        String str28 = (i4 & 64) != 0 ? signUpRequest.nationality : str6;
        Integer num6 = (i4 & 128) != 0 ? signUpRequest.countryId : num2;
        Integer num7 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? signUpRequest.cityId : num3;
        String str29 = (i4 & 512) != 0 ? signUpRequest.mobileNumber : str7;
        String str30 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? signUpRequest.fintechId : str8;
        String str31 = (i4 & 2048) != 0 ? signUpRequest.ibanName : str9;
        String str32 = (i4 & 4096) != 0 ? signUpRequest.ibanNumber : str10;
        Integer num8 = (i4 & 8192) != 0 ? signUpRequest.bankId : num4;
        String str33 = str23;
        String str34 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? signUpRequest.referralCode : str11;
        String str35 = (i4 & 32768) != 0 ? signUpRequest.idCardSnap : str12;
        String str36 = (i4 & 65536) != 0 ? signUpRequest.drivingLicenseSnap : str13;
        String str37 = (i4 & 131072) != 0 ? signUpRequest.vehicleRegistrationSnap : str14;
        String str38 = (i4 & 262144) != 0 ? signUpRequest.mobileCountryCode : str15;
        String str39 = (i4 & 524288) != 0 ? signUpRequest.profileSnap : str16;
        String str40 = (i4 & 1048576) != 0 ? signUpRequest.urPayAccountIban : str17;
        String str41 = (i4 & 2097152) != 0 ? signUpRequest.urPayIdNumber : str18;
        String str42 = (i4 & 4194304) != 0 ? signUpRequest.firstName : str19;
        if ((i4 & 8388608) != 0) {
            str22 = str42;
            str21 = signUpRequest.lastName;
        } else {
            str21 = str20;
            str22 = str42;
        }
        return signUpRequest.copy(str33, str24, str25, num5, str26, str27, str28, num6, num7, str29, str30, str31, str32, num8, str34, str35, str36, str37, str38, str39, str40, str41, str22, str21);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final String getFintechId() {
        return this.fintechId;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final String getIbanName() {
        return this.ibanName;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final String getIbanNumber() {
        return this.ibanNumber;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final Integer getBankId() {
        return this.bankId;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getIdCardSnap() {
        return this.idCardSnap;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getDrivingLicenseSnap() {
        return this.drivingLicenseSnap;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getVehicleRegistrationSnap() {
        return this.vehicleRegistrationSnap;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDob() {
        return this.dob;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getProfileSnap() {
        return this.profileSnap;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getUrPayAccountIban() {
        return this.urPayAccountIban;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final String getUrPayIdNumber() {
        return this.urPayIdNumber;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getPreference() {
        return this.preference;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Integer getPreferredPlatformId() {
        return this.preferredPlatformId;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getVehiclePlateNumber() {
        return this.vehiclePlateNumber;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getVehicleSequenceNumber() {
        return this.vehicleSequenceNumber;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final Integer getCountryId() {
        return this.countryId;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final Integer getCityId() {
        return this.cityId;
    }

    @NotNull
    public final SignUpRequest copy(@Nullable String idNumber, @Nullable String dob, @Nullable String preference, @Nullable Integer preferredPlatformId, @Nullable String vehiclePlateNumber, @Nullable String vehicleSequenceNumber, @Nullable String nationality, @Nullable Integer countryId, @Nullable Integer cityId, @Nullable String mobileNumber, @Nullable String fintechId, @Nullable String ibanName, @Nullable String ibanNumber, @Nullable Integer bankId, @Nullable String referralCode, @Nullable String idCardSnap, @Nullable String drivingLicenseSnap, @Nullable String vehicleRegistrationSnap, @Nullable String mobileCountryCode, @Nullable String profileSnap, @Nullable String urPayAccountIban, @Nullable String urPayIdNumber, @Nullable String firstName, @Nullable String lastName) {
        return new SignUpRequest(idNumber, dob, preference, preferredPlatformId, vehiclePlateNumber, vehicleSequenceNumber, nationality, countryId, cityId, mobileNumber, fintechId, ibanName, ibanNumber, bankId, referralCode, idCardSnap, drivingLicenseSnap, vehicleRegistrationSnap, mobileCountryCode, profileSnap, urPayAccountIban, urPayIdNumber, firstName, lastName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpRequest)) {
            return false;
        }
        SignUpRequest signUpRequest = (SignUpRequest) other;
        return Intrinsics.areEqual(this.idNumber, signUpRequest.idNumber) && Intrinsics.areEqual(this.dob, signUpRequest.dob) && Intrinsics.areEqual(this.preference, signUpRequest.preference) && Intrinsics.areEqual(this.preferredPlatformId, signUpRequest.preferredPlatformId) && Intrinsics.areEqual(this.vehiclePlateNumber, signUpRequest.vehiclePlateNumber) && Intrinsics.areEqual(this.vehicleSequenceNumber, signUpRequest.vehicleSequenceNumber) && Intrinsics.areEqual(this.nationality, signUpRequest.nationality) && Intrinsics.areEqual(this.countryId, signUpRequest.countryId) && Intrinsics.areEqual(this.cityId, signUpRequest.cityId) && Intrinsics.areEqual(this.mobileNumber, signUpRequest.mobileNumber) && Intrinsics.areEqual(this.fintechId, signUpRequest.fintechId) && Intrinsics.areEqual(this.ibanName, signUpRequest.ibanName) && Intrinsics.areEqual(this.ibanNumber, signUpRequest.ibanNumber) && Intrinsics.areEqual(this.bankId, signUpRequest.bankId) && Intrinsics.areEqual(this.referralCode, signUpRequest.referralCode) && Intrinsics.areEqual(this.idCardSnap, signUpRequest.idCardSnap) && Intrinsics.areEqual(this.drivingLicenseSnap, signUpRequest.drivingLicenseSnap) && Intrinsics.areEqual(this.vehicleRegistrationSnap, signUpRequest.vehicleRegistrationSnap) && Intrinsics.areEqual(this.mobileCountryCode, signUpRequest.mobileCountryCode) && Intrinsics.areEqual(this.profileSnap, signUpRequest.profileSnap) && Intrinsics.areEqual(this.urPayAccountIban, signUpRequest.urPayAccountIban) && Intrinsics.areEqual(this.urPayIdNumber, signUpRequest.urPayIdNumber) && Intrinsics.areEqual(this.firstName, signUpRequest.firstName) && Intrinsics.areEqual(this.lastName, signUpRequest.lastName);
    }

    @Nullable
    public final Integer getBankId() {
        return this.bankId;
    }

    @Nullable
    public final Integer getCityId() {
        return this.cityId;
    }

    @Nullable
    public final Integer getCountryId() {
        return this.countryId;
    }

    @Nullable
    public final String getDob() {
        return this.dob;
    }

    @Nullable
    public final String getDrivingLicenseSnap() {
        return this.drivingLicenseSnap;
    }

    @Nullable
    public final String getFintechId() {
        return this.fintechId;
    }

    @Nullable
    public final String getFirstName() {
        return this.firstName;
    }

    @Nullable
    public final String getIbanName() {
        return this.ibanName;
    }

    @Nullable
    public final String getIbanNumber() {
        return this.ibanNumber;
    }

    @Nullable
    public final String getIdCardSnap() {
        return this.idCardSnap;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getLastName() {
        return this.lastName;
    }

    @Nullable
    public final String getMobileCountryCode() {
        return this.mobileCountryCode;
    }

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @Nullable
    public final String getName() {
        String maroon = CollectionsKt.maroon(CollectionsKt.peach(this.firstName, this.lastName), " ", null, null, null, 62);
        if (!StringsKt.gray(maroon)) {
            return maroon;
        }
        return null;
    }

    @Nullable
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    public final String getPreference() {
        return this.preference;
    }

    @Nullable
    public final Integer getPreferredPlatformId() {
        return this.preferredPlatformId;
    }

    @Nullable
    public final String getProfileSnap() {
        return this.profileSnap;
    }

    @Nullable
    public final String getReferralCode() {
        return this.referralCode;
    }

    @Nullable
    public final String getUrPayAccountIban() {
        return this.urPayAccountIban;
    }

    @Nullable
    public final String getUrPayIdNumber() {
        return this.urPayIdNumber;
    }

    @Nullable
    public final String getVehiclePlateNumber() {
        return this.vehiclePlateNumber;
    }

    @Nullable
    public final String getVehicleRegistrationSnap() {
        return this.vehicleRegistrationSnap;
    }

    @Nullable
    public final String getVehicleSequenceNumber() {
        return this.vehicleSequenceNumber;
    }

    public int hashCode() {
        String str = this.idNumber;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.dob;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.preference;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.preferredPlatformId;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.vehiclePlateNumber;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.vehicleSequenceNumber;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nationality;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num2 = this.countryId;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.cityId;
        int hashCode9 = (hashCode8 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str7 = this.mobileNumber;
        int hashCode10 = (hashCode9 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.fintechId;
        int hashCode11 = (hashCode10 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.ibanName;
        int hashCode12 = (hashCode11 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ibanNumber;
        int hashCode13 = (hashCode12 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Integer num4 = this.bankId;
        int hashCode14 = (hashCode13 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str11 = this.referralCode;
        int hashCode15 = (hashCode14 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.idCardSnap;
        int hashCode16 = (hashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.drivingLicenseSnap;
        int hashCode17 = (hashCode16 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.vehicleRegistrationSnap;
        int hashCode18 = (hashCode17 + (str14 == null ? 0 : str14.hashCode())) * 31;
        String str15 = this.mobileCountryCode;
        int hashCode19 = (hashCode18 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.profileSnap;
        int hashCode20 = (hashCode19 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.urPayAccountIban;
        int hashCode21 = (hashCode20 + (str17 == null ? 0 : str17.hashCode())) * 31;
        String str18 = this.urPayIdNumber;
        int hashCode22 = (hashCode21 + (str18 == null ? 0 : str18.hashCode())) * 31;
        String str19 = this.firstName;
        int hashCode23 = (hashCode22 + (str19 == null ? 0 : str19.hashCode())) * 31;
        String str20 = this.lastName;
        return hashCode23 + (str20 != null ? str20.hashCode() : 0);
    }

    public final void setBankId(@Nullable Integer num) {
        this.bankId = num;
    }

    public final void setCityId(@Nullable Integer num) {
        this.cityId = num;
    }

    public final void setCountryId(@Nullable Integer num) {
        this.countryId = num;
    }

    public final void setDob(@Nullable String str) {
        this.dob = str;
    }

    public final void setDrivingLicenseSnap(@Nullable String str) {
        this.drivingLicenseSnap = str;
    }

    public final void setFintechId(@Nullable String str) {
        this.fintechId = str;
    }

    public final void setFirstName(@Nullable String str) {
        this.firstName = str;
    }

    public final void setIbanName(@Nullable String str) {
        this.ibanName = str;
    }

    public final void setIbanNumber(@Nullable String str) {
        this.ibanNumber = str;
    }

    public final void setIdCardSnap(@Nullable String str) {
        this.idCardSnap = str;
    }

    public final void setIdNumber(@Nullable String str) {
        this.idNumber = str;
    }

    public final void setLastName(@Nullable String str) {
        this.lastName = str;
    }

    public final void setMobileCountryCode(@Nullable String str) {
        this.mobileCountryCode = str;
    }

    public final void setMobileNumber(@Nullable String str) {
        this.mobileNumber = str;
    }

    public final void setNationality(@Nullable String str) {
        this.nationality = str;
    }

    public final void setPreference(@Nullable String str) {
        this.preference = str;
    }

    public final void setPreferredPlatformId(@Nullable Integer num) {
        this.preferredPlatformId = num;
    }

    public final void setProfileSnap(@Nullable String str) {
        this.profileSnap = str;
    }

    public final void setReferralCode(@Nullable String str) {
        this.referralCode = str;
    }

    public final void setUrPayAccountIban(@Nullable String str) {
        this.urPayAccountIban = str;
    }

    public final void setUrPayIdNumber(@Nullable String str) {
        this.urPayIdNumber = str;
    }

    public final void setVehiclePlateNumber(@Nullable String str) {
        this.vehiclePlateNumber = str;
    }

    public final void setVehicleRegistrationSnap(@Nullable String str) {
        this.vehicleRegistrationSnap = str;
    }

    public final void setVehicleSequenceNumber(@Nullable String str) {
        this.vehicleSequenceNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.idNumber;
        String str2 = this.dob;
        String str3 = this.preference;
        Integer num = this.preferredPlatformId;
        String str4 = this.vehiclePlateNumber;
        String str5 = this.vehicleSequenceNumber;
        String str6 = this.nationality;
        Integer num2 = this.countryId;
        Integer num3 = this.cityId;
        String str7 = this.mobileNumber;
        String str8 = this.fintechId;
        String str9 = this.ibanName;
        String str10 = this.ibanNumber;
        Integer num4 = this.bankId;
        String str11 = this.referralCode;
        String str12 = this.idCardSnap;
        String str13 = this.drivingLicenseSnap;
        String str14 = this.vehicleRegistrationSnap;
        String str15 = this.mobileCountryCode;
        String str16 = this.profileSnap;
        String str17 = this.urPayAccountIban;
        String str18 = this.urPayIdNumber;
        String str19 = this.firstName;
        String str20 = this.lastName;
        StringBuilder india = q.india("SignUpRequest(idNumber=", str, ", dob=", str2, ", preference=");
        india.append(str3);
        india.append(", preferredPlatformId=");
        india.append(num);
        india.append(", vehiclePlateNumber=");
        c.azure(india, str4, ", vehicleSequenceNumber=", str5, ", nationality=");
        india.append(str6);
        india.append(", countryId=");
        india.append(num2);
        india.append(", cityId=");
        india.append(num3);
        india.append(", mobileNumber=");
        india.append(str7);
        india.append(", fintechId=");
        c.azure(india, str8, ", ibanName=", str9, ", ibanNumber=");
        india.append(str10);
        india.append(", bankId=");
        india.append(num4);
        india.append(", referralCode=");
        c.azure(india, str11, ", idCardSnap=", str12, ", drivingLicenseSnap=");
        c.azure(india, str13, ", vehicleRegistrationSnap=", str14, ", mobileCountryCode=");
        c.azure(india, str15, ", profileSnap=", str16, ", urPayAccountIban=");
        c.azure(india, str17, ", urPayIdNumber=", str18, ", firstName=");
        return j.lima(india, str19, ", lastName=", str20, ")");
    }

    public SignUpRequest(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Integer num, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable Integer num2, @Nullable Integer num3, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Integer num4, @Nullable String str11, @Nullable String str12, @Nullable String str13, @Nullable String str14, @Nullable String str15, @Nullable String str16, @Nullable String str17, @Nullable String str18, @Nullable String str19, @Nullable String str20) {
        this.idNumber = str;
        this.dob = str2;
        this.preference = str3;
        this.preferredPlatformId = num;
        this.vehiclePlateNumber = str4;
        this.vehicleSequenceNumber = str5;
        this.nationality = str6;
        this.countryId = num2;
        this.cityId = num3;
        this.mobileNumber = str7;
        this.fintechId = str8;
        this.ibanName = str9;
        this.ibanNumber = str10;
        this.bankId = num4;
        this.referralCode = str11;
        this.idCardSnap = str12;
        this.drivingLicenseSnap = str13;
        this.vehicleRegistrationSnap = str14;
        this.mobileCountryCode = str15;
        this.profileSnap = str16;
        this.urPayAccountIban = str17;
        this.urPayIdNumber = str18;
        this.firstName = str19;
        this.lastName = str20;
    }

    public /* synthetic */ SignUpRequest(String str, String str2, String str3, Integer num, String str4, String str5, String str6, Integer num2, Integer num3, String str7, String str8, String str9, String str10, Integer num4, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : str2, (i4 & 4) != 0 ? null : str3, (i4 & 8) != 0 ? null : num, (i4 & 16) != 0 ? null : str4, (i4 & 32) != 0 ? null : str5, (i4 & 64) != 0 ? null : str6, (i4 & 128) != 0 ? null : num2, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : num3, (i4 & 512) != 0 ? null : str7, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : str8, (i4 & 2048) != 0 ? null : str9, (i4 & 4096) != 0 ? null : str10, (i4 & 8192) != 0 ? null : num4, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str11, (i4 & 32768) != 0 ? null : str12, (i4 & 65536) != 0 ? null : str13, (i4 & 131072) != 0 ? null : str14, (i4 & 262144) != 0 ? null : str15, (i4 & 524288) != 0 ? null : str16, (i4 & 1048576) != 0 ? null : str17, (i4 & 2097152) != 0 ? null : str18, (i4 & 4194304) != 0 ? null : str19, (i4 & 8388608) != 0 ? null : str20);
    }
}
