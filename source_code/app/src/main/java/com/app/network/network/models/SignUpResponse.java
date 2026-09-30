package com.app.network.network.models;

import Q0.c;
import com.clevertap.android.sdk.Constants;
import com.google.mlkit.vision.barcode.common.Barcode;
import java.util.Date;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b`\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B³\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b#\u0010$J\u000b\u0010g\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010i\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010j\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010k\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010l\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010m\u001a\u0004\u0018\u00010\rHÆ\u0003J\u000b\u0010n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010o\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010p\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010q\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010r\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010s\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010u\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010v\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010w\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010y\u001a\u0004\u0018\u00010\u0012HÆ\u0003J\u000b\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010|\u001a\u0004\u0018\u00010\u001eHÆ\u0003J\u000b\u0010}\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010~\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u007f\u001a\u0004\u0018\u00010\"HÆ\u0003¢\u0006\u0002\u0010cJ¼\u0002\u0010\u0080\u0001\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\"HÆ\u0001¢\u0006\u0003\u0010\u0081\u0001J\u0016\u0010\u0082\u0001\u001a\u00030\u0083\u00012\t\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\n\u0010\u0085\u0001\u001a\u00020\"HÖ\u0001J\n\u0010\u0086\u0001\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u001c\u0010\b\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010,\"\u0004\b0\u0010.R\u001c\u0010\t\u001a\u0004\u0018\u00010\nX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010&\"\u0004\b6\u00107R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010&\"\u0004\b=\u00107R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010&\"\u0004\b?\u00107R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b@\u0010&\"\u0004\bA\u00107R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010ER\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bF\u0010,\"\u0004\bG\u0010.R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bH\u0010,\"\u0004\bI\u0010.R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010&\"\u0004\bK\u00107R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bL\u0010&\"\u0004\bM\u00107R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010&\"\u0004\bO\u00107R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bP\u0010&\"\u0004\bQ\u00107R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bR\u0010&\"\u0004\bS\u00107R\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bT\u0010C\"\u0004\bU\u0010ER\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010&\"\u0004\bW\u00107R\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bX\u0010&\"\u0004\bY\u00107R\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001c\u0010\u001f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b^\u0010&\"\u0004\b_\u00107R\u001c\u0010 \u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010&\"\u0004\ba\u00107R\u001e\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e¢\u0006\u0010\n\u0002\u0010f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010e¨\u0006\u0087\u0001"}, d2 = {"Lcom/app/network/network/models/SignUpResponse;", "", "reason", "", "country", "Lcom/app/network/network/models/Country;", "idFile", "Lcom/app/network/network/models/Image;", "drivingLicenseFile", "city", "Lcom/app/network/network/models/City;", "status", "bank", "Lcom/app/network/network/models/Bank;", "idNumber", "iban", "mobileNumber", "dob", "Ljava/util/Date;", "registrationFile", "profilePicFile", "nationality", "fintechAccountId", "urPayAccountIban", "urPayIdNumber", "ibanName", "createdAt", "name", "preferredVertical", "preferredPlatform", "Lcom/app/network/network/models/PlatformListResponse;", "vehiclePlateNumber", "vehicleSequenceNumber", Constants.KEY_ID, "", "<init>", "(Ljava/lang/String;Lcom/app/network/network/models/Country;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/City;Ljava/lang/String;Lcom/app/network/network/models/Bank;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/app/network/network/models/PlatformListResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getReason", "()Ljava/lang/String;", "getCountry", "()Lcom/app/network/network/models/Country;", "setCountry", "(Lcom/app/network/network/models/Country;)V", "getIdFile", "()Lcom/app/network/network/models/Image;", "setIdFile", "(Lcom/app/network/network/models/Image;)V", "getDrivingLicenseFile", "setDrivingLicenseFile", "getCity", "()Lcom/app/network/network/models/City;", "setCity", "(Lcom/app/network/network/models/City;)V", "getStatus", "setStatus", "(Ljava/lang/String;)V", "getBank", "()Lcom/app/network/network/models/Bank;", "setBank", "(Lcom/app/network/network/models/Bank;)V", "getIdNumber", "setIdNumber", "getIban", "setIban", "getMobileNumber", "setMobileNumber", "getDob", "()Ljava/util/Date;", "setDob", "(Ljava/util/Date;)V", "getRegistrationFile", "setRegistrationFile", "getProfilePicFile", "setProfilePicFile", "getNationality", "setNationality", "getFintechAccountId", "setFintechAccountId", "getUrPayAccountIban", "setUrPayAccountIban", "getUrPayIdNumber", "setUrPayIdNumber", "getIbanName", "setIbanName", "getCreatedAt", "setCreatedAt", "getName", "setName", "getPreferredVertical", "setPreferredVertical", "getPreferredPlatform", "()Lcom/app/network/network/models/PlatformListResponse;", "setPreferredPlatform", "(Lcom/app/network/network/models/PlatformListResponse;)V", "getVehiclePlateNumber", "setVehiclePlateNumber", "getVehicleSequenceNumber", "setVehicleSequenceNumber", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", Constants.COPY_TYPE, "(Ljava/lang/String;Lcom/app/network/network/models/Country;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/City;Ljava/lang/String;Lcom/app/network/network/models/Bank;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Lcom/app/network/network/models/Image;Lcom/app/network/network/models/Image;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Date;Ljava/lang/String;Ljava/lang/String;Lcom/app/network/network/models/PlatformListResponse;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/app/network/network/models/SignUpResponse;", "equals", "", "other", "hashCode", "toString", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SignUpResponse {

    @Nullable
    private Bank bank;

    @Nullable
    private City city;

    @Nullable
    private Country country;

    @Nullable
    private Date createdAt;

    @Nullable
    private Date dob;

    @Nullable
    private Image drivingLicenseFile;

    @Nullable
    private String fintechAccountId;

    @Nullable
    private String iban;

    @Nullable
    private String ibanName;

    @Nullable
    private Integer id;

    @Nullable
    private Image idFile;

    @Nullable
    private String idNumber;

    @Nullable
    private String mobileNumber;

    @Nullable
    private String name;

    @Nullable
    private String nationality;

    @Nullable
    private PlatformListResponse preferredPlatform;

    @Nullable
    private String preferredVertical;

    @Nullable
    private Image profilePicFile;

    @Nullable
    private final String reason;

    @Nullable
    private Image registrationFile;

    @Nullable
    private String status;

    @Nullable
    private String urPayAccountIban;

    @Nullable
    private String urPayIdNumber;

    @Nullable
    private String vehiclePlateNumber;

    @Nullable
    private String vehicleSequenceNumber;

    public SignUpResponse() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 33554431, null);
    }

    public static /* synthetic */ SignUpResponse copy$default(SignUpResponse signUpResponse, String str, Country country, Image image, Image image2, City city, String str2, Bank bank, String str3, String str4, String str5, Date date, Image image3, Image image4, String str6, String str7, String str8, String str9, String str10, Date date2, String str11, String str12, PlatformListResponse platformListResponse, String str13, String str14, Integer num, int i4, Object obj) {
        Integer num2;
        String str15;
        String str16 = (i4 & 1) != 0 ? signUpResponse.reason : str;
        Country country2 = (i4 & 2) != 0 ? signUpResponse.country : country;
        Image image5 = (i4 & 4) != 0 ? signUpResponse.idFile : image;
        Image image6 = (i4 & 8) != 0 ? signUpResponse.drivingLicenseFile : image2;
        City city2 = (i4 & 16) != 0 ? signUpResponse.city : city;
        String str17 = (i4 & 32) != 0 ? signUpResponse.status : str2;
        Bank bank2 = (i4 & 64) != 0 ? signUpResponse.bank : bank;
        String str18 = (i4 & 128) != 0 ? signUpResponse.idNumber : str3;
        String str19 = (i4 & Barcode.FORMAT_QR_CODE) != 0 ? signUpResponse.iban : str4;
        String str20 = (i4 & 512) != 0 ? signUpResponse.mobileNumber : str5;
        Date date3 = (i4 & Barcode.FORMAT_UPC_E) != 0 ? signUpResponse.dob : date;
        Image image7 = (i4 & 2048) != 0 ? signUpResponse.registrationFile : image3;
        Image image8 = (i4 & 4096) != 0 ? signUpResponse.profilePicFile : image4;
        String str21 = (i4 & 8192) != 0 ? signUpResponse.nationality : str6;
        String str22 = str16;
        String str23 = (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? signUpResponse.fintechAccountId : str7;
        String str24 = (i4 & 32768) != 0 ? signUpResponse.urPayAccountIban : str8;
        String str25 = (i4 & 65536) != 0 ? signUpResponse.urPayIdNumber : str9;
        String str26 = (i4 & 131072) != 0 ? signUpResponse.ibanName : str10;
        Date date4 = (i4 & 262144) != 0 ? signUpResponse.createdAt : date2;
        String str27 = (i4 & 524288) != 0 ? signUpResponse.name : str11;
        String str28 = (i4 & 1048576) != 0 ? signUpResponse.preferredVertical : str12;
        PlatformListResponse platformListResponse2 = (i4 & 2097152) != 0 ? signUpResponse.preferredPlatform : platformListResponse;
        String str29 = (i4 & 4194304) != 0 ? signUpResponse.vehiclePlateNumber : str13;
        String str30 = (i4 & 8388608) != 0 ? signUpResponse.vehicleSequenceNumber : str14;
        if ((i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            str15 = str30;
            num2 = signUpResponse.id;
        } else {
            num2 = num;
            str15 = str30;
        }
        return signUpResponse.copy(str22, country2, image5, image6, city2, str17, bank2, str18, str19, str20, date3, image7, image8, str21, str23, str24, str25, str26, date4, str27, str28, platformListResponse2, str29, str15, num2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    /* renamed from: component10, reason: from getter */
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @Nullable
    /* renamed from: component11, reason: from getter */
    public final Date getDob() {
        return this.dob;
    }

    @Nullable
    /* renamed from: component12, reason: from getter */
    public final Image getRegistrationFile() {
        return this.registrationFile;
    }

    @Nullable
    /* renamed from: component13, reason: from getter */
    public final Image getProfilePicFile() {
        return this.profilePicFile;
    }

    @Nullable
    /* renamed from: component14, reason: from getter */
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    /* renamed from: component15, reason: from getter */
    public final String getFintechAccountId() {
        return this.fintechAccountId;
    }

    @Nullable
    /* renamed from: component16, reason: from getter */
    public final String getUrPayAccountIban() {
        return this.urPayAccountIban;
    }

    @Nullable
    /* renamed from: component17, reason: from getter */
    public final String getUrPayIdNumber() {
        return this.urPayIdNumber;
    }

    @Nullable
    /* renamed from: component18, reason: from getter */
    public final String getIbanName() {
        return this.ibanName;
    }

    @Nullable
    /* renamed from: component19, reason: from getter */
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    /* renamed from: component20, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component21, reason: from getter */
    public final String getPreferredVertical() {
        return this.preferredVertical;
    }

    @Nullable
    /* renamed from: component22, reason: from getter */
    public final PlatformListResponse getPreferredPlatform() {
        return this.preferredPlatform;
    }

    @Nullable
    /* renamed from: component23, reason: from getter */
    public final String getVehiclePlateNumber() {
        return this.vehiclePlateNumber;
    }

    @Nullable
    /* renamed from: component24, reason: from getter */
    public final String getVehicleSequenceNumber() {
        return this.vehicleSequenceNumber;
    }

    @Nullable
    /* renamed from: component25, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Image getIdFile() {
        return this.idFile;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Image getDrivingLicenseFile() {
        return this.drivingLicenseFile;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final City getCity() {
        return this.city;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getStatus() {
        return this.status;
    }

    @Nullable
    /* renamed from: component7, reason: from getter */
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    /* renamed from: component8, reason: from getter */
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    /* renamed from: component9, reason: from getter */
    public final String getIban() {
        return this.iban;
    }

    @NotNull
    public final SignUpResponse copy(@Nullable String reason, @Nullable Country country, @Nullable Image idFile, @Nullable Image drivingLicenseFile, @Nullable City city, @Nullable String status, @Nullable Bank bank, @Nullable String idNumber, @Nullable String iban, @Nullable String mobileNumber, @Nullable Date dob, @Nullable Image registrationFile, @Nullable Image profilePicFile, @Nullable String nationality, @Nullable String fintechAccountId, @Nullable String urPayAccountIban, @Nullable String urPayIdNumber, @Nullable String ibanName, @Nullable Date createdAt, @Nullable String name, @Nullable String preferredVertical, @Nullable PlatformListResponse preferredPlatform, @Nullable String vehiclePlateNumber, @Nullable String vehicleSequenceNumber, @Nullable Integer id2) {
        return new SignUpResponse(reason, country, idFile, drivingLicenseFile, city, status, bank, idNumber, iban, mobileNumber, dob, registrationFile, profilePicFile, nationality, fintechAccountId, urPayAccountIban, urPayIdNumber, ibanName, createdAt, name, preferredVertical, preferredPlatform, vehiclePlateNumber, vehicleSequenceNumber, id2);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SignUpResponse)) {
            return false;
        }
        SignUpResponse signUpResponse = (SignUpResponse) other;
        return Intrinsics.areEqual(this.reason, signUpResponse.reason) && Intrinsics.areEqual(this.country, signUpResponse.country) && Intrinsics.areEqual(this.idFile, signUpResponse.idFile) && Intrinsics.areEqual(this.drivingLicenseFile, signUpResponse.drivingLicenseFile) && Intrinsics.areEqual(this.city, signUpResponse.city) && Intrinsics.areEqual(this.status, signUpResponse.status) && Intrinsics.areEqual(this.bank, signUpResponse.bank) && Intrinsics.areEqual(this.idNumber, signUpResponse.idNumber) && Intrinsics.areEqual(this.iban, signUpResponse.iban) && Intrinsics.areEqual(this.mobileNumber, signUpResponse.mobileNumber) && Intrinsics.areEqual(this.dob, signUpResponse.dob) && Intrinsics.areEqual(this.registrationFile, signUpResponse.registrationFile) && Intrinsics.areEqual(this.profilePicFile, signUpResponse.profilePicFile) && Intrinsics.areEqual(this.nationality, signUpResponse.nationality) && Intrinsics.areEqual(this.fintechAccountId, signUpResponse.fintechAccountId) && Intrinsics.areEqual(this.urPayAccountIban, signUpResponse.urPayAccountIban) && Intrinsics.areEqual(this.urPayIdNumber, signUpResponse.urPayIdNumber) && Intrinsics.areEqual(this.ibanName, signUpResponse.ibanName) && Intrinsics.areEqual(this.createdAt, signUpResponse.createdAt) && Intrinsics.areEqual(this.name, signUpResponse.name) && Intrinsics.areEqual(this.preferredVertical, signUpResponse.preferredVertical) && Intrinsics.areEqual(this.preferredPlatform, signUpResponse.preferredPlatform) && Intrinsics.areEqual(this.vehiclePlateNumber, signUpResponse.vehiclePlateNumber) && Intrinsics.areEqual(this.vehicleSequenceNumber, signUpResponse.vehicleSequenceNumber) && Intrinsics.areEqual(this.id, signUpResponse.id);
    }

    @Nullable
    public final Bank getBank() {
        return this.bank;
    }

    @Nullable
    public final City getCity() {
        return this.city;
    }

    @Nullable
    public final Country getCountry() {
        return this.country;
    }

    @Nullable
    public final Date getCreatedAt() {
        return this.createdAt;
    }

    @Nullable
    public final Date getDob() {
        return this.dob;
    }

    @Nullable
    public final Image getDrivingLicenseFile() {
        return this.drivingLicenseFile;
    }

    @Nullable
    public final String getFintechAccountId() {
        return this.fintechAccountId;
    }

    @Nullable
    public final String getIban() {
        return this.iban;
    }

    @Nullable
    public final String getIbanName() {
        return this.ibanName;
    }

    @Nullable
    public final Integer getId() {
        return this.id;
    }

    @Nullable
    public final Image getIdFile() {
        return this.idFile;
    }

    @Nullable
    public final String getIdNumber() {
        return this.idNumber;
    }

    @Nullable
    public final String getMobileNumber() {
        return this.mobileNumber;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final String getNationality() {
        return this.nationality;
    }

    @Nullable
    public final PlatformListResponse getPreferredPlatform() {
        return this.preferredPlatform;
    }

    @Nullable
    public final String getPreferredVertical() {
        return this.preferredVertical;
    }

    @Nullable
    public final Image getProfilePicFile() {
        return this.profilePicFile;
    }

    @Nullable
    public final String getReason() {
        return this.reason;
    }

    @Nullable
    public final Image getRegistrationFile() {
        return this.registrationFile;
    }

    @Nullable
    public final String getStatus() {
        return this.status;
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
    public final String getVehicleSequenceNumber() {
        return this.vehicleSequenceNumber;
    }

    public int hashCode() {
        String str = this.reason;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Country country = this.country;
        int hashCode2 = (hashCode + (country == null ? 0 : country.hashCode())) * 31;
        Image image = this.idFile;
        int hashCode3 = (hashCode2 + (image == null ? 0 : image.hashCode())) * 31;
        Image image2 = this.drivingLicenseFile;
        int hashCode4 = (hashCode3 + (image2 == null ? 0 : image2.hashCode())) * 31;
        City city = this.city;
        int hashCode5 = (hashCode4 + (city == null ? 0 : city.hashCode())) * 31;
        String str2 = this.status;
        int hashCode6 = (hashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Bank bank = this.bank;
        int hashCode7 = (hashCode6 + (bank == null ? 0 : bank.hashCode())) * 31;
        String str3 = this.idNumber;
        int hashCode8 = (hashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iban;
        int hashCode9 = (hashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.mobileNumber;
        int hashCode10 = (hashCode9 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Date date = this.dob;
        int hashCode11 = (hashCode10 + (date == null ? 0 : date.hashCode())) * 31;
        Image image3 = this.registrationFile;
        int hashCode12 = (hashCode11 + (image3 == null ? 0 : image3.hashCode())) * 31;
        Image image4 = this.profilePicFile;
        int hashCode13 = (hashCode12 + (image4 == null ? 0 : image4.hashCode())) * 31;
        String str6 = this.nationality;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.fintechAccountId;
        int hashCode15 = (hashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.urPayAccountIban;
        int hashCode16 = (hashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.urPayIdNumber;
        int hashCode17 = (hashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.ibanName;
        int hashCode18 = (hashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Date date2 = this.createdAt;
        int hashCode19 = (hashCode18 + (date2 == null ? 0 : date2.hashCode())) * 31;
        String str11 = this.name;
        int hashCode20 = (hashCode19 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.preferredVertical;
        int hashCode21 = (hashCode20 + (str12 == null ? 0 : str12.hashCode())) * 31;
        PlatformListResponse platformListResponse = this.preferredPlatform;
        int hashCode22 = (hashCode21 + (platformListResponse == null ? 0 : platformListResponse.hashCode())) * 31;
        String str13 = this.vehiclePlateNumber;
        int hashCode23 = (hashCode22 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.vehicleSequenceNumber;
        int hashCode24 = (hashCode23 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Integer num = this.id;
        return hashCode24 + (num != null ? num.hashCode() : 0);
    }

    public final void setBank(@Nullable Bank bank) {
        this.bank = bank;
    }

    public final void setCity(@Nullable City city) {
        this.city = city;
    }

    public final void setCountry(@Nullable Country country) {
        this.country = country;
    }

    public final void setCreatedAt(@Nullable Date date) {
        this.createdAt = date;
    }

    public final void setDob(@Nullable Date date) {
        this.dob = date;
    }

    public final void setDrivingLicenseFile(@Nullable Image image) {
        this.drivingLicenseFile = image;
    }

    public final void setFintechAccountId(@Nullable String str) {
        this.fintechAccountId = str;
    }

    public final void setIban(@Nullable String str) {
        this.iban = str;
    }

    public final void setIbanName(@Nullable String str) {
        this.ibanName = str;
    }

    public final void setId(@Nullable Integer num) {
        this.id = num;
    }

    public final void setIdFile(@Nullable Image image) {
        this.idFile = image;
    }

    public final void setIdNumber(@Nullable String str) {
        this.idNumber = str;
    }

    public final void setMobileNumber(@Nullable String str) {
        this.mobileNumber = str;
    }

    public final void setName(@Nullable String str) {
        this.name = str;
    }

    public final void setNationality(@Nullable String str) {
        this.nationality = str;
    }

    public final void setPreferredPlatform(@Nullable PlatformListResponse platformListResponse) {
        this.preferredPlatform = platformListResponse;
    }

    public final void setPreferredVertical(@Nullable String str) {
        this.preferredVertical = str;
    }

    public final void setProfilePicFile(@Nullable Image image) {
        this.profilePicFile = image;
    }

    public final void setRegistrationFile(@Nullable Image image) {
        this.registrationFile = image;
    }

    public final void setStatus(@Nullable String str) {
        this.status = str;
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

    public final void setVehicleSequenceNumber(@Nullable String str) {
        this.vehicleSequenceNumber = str;
    }

    @NotNull
    public String toString() {
        String str = this.reason;
        Country country = this.country;
        Image image = this.idFile;
        Image image2 = this.drivingLicenseFile;
        City city = this.city;
        String str2 = this.status;
        Bank bank = this.bank;
        String str3 = this.idNumber;
        String str4 = this.iban;
        String str5 = this.mobileNumber;
        Date date = this.dob;
        Image image3 = this.registrationFile;
        Image image4 = this.profilePicFile;
        String str6 = this.nationality;
        String str7 = this.fintechAccountId;
        String str8 = this.urPayAccountIban;
        String str9 = this.urPayIdNumber;
        String str10 = this.ibanName;
        Date date2 = this.createdAt;
        String str11 = this.name;
        String str12 = this.preferredVertical;
        PlatformListResponse platformListResponse = this.preferredPlatform;
        String str13 = this.vehiclePlateNumber;
        String str14 = this.vehicleSequenceNumber;
        Integer num = this.id;
        StringBuilder sb2 = new StringBuilder("SignUpResponse(reason=");
        sb2.append(str);
        sb2.append(", country=");
        sb2.append(country);
        sb2.append(", idFile=");
        sb2.append(image);
        sb2.append(", drivingLicenseFile=");
        sb2.append(image2);
        sb2.append(", city=");
        sb2.append(city);
        sb2.append(", status=");
        sb2.append(str2);
        sb2.append(", bank=");
        sb2.append(bank);
        sb2.append(", idNumber=");
        sb2.append(str3);
        sb2.append(", iban=");
        c.azure(sb2, str4, ", mobileNumber=", str5, ", dob=");
        sb2.append(date);
        sb2.append(", registrationFile=");
        sb2.append(image3);
        sb2.append(", profilePicFile=");
        sb2.append(image4);
        sb2.append(", nationality=");
        sb2.append(str6);
        sb2.append(", fintechAccountId=");
        c.azure(sb2, str7, ", urPayAccountIban=", str8, ", urPayIdNumber=");
        c.azure(sb2, str9, ", ibanName=", str10, ", createdAt=");
        sb2.append(date2);
        sb2.append(", name=");
        sb2.append(str11);
        sb2.append(", preferredVertical=");
        sb2.append(str12);
        sb2.append(", preferredPlatform=");
        sb2.append(platformListResponse);
        sb2.append(", vehiclePlateNumber=");
        c.azure(sb2, str13, ", vehicleSequenceNumber=", str14, ", id=");
        sb2.append(num);
        sb2.append(")");
        return sb2.toString();
    }

    public SignUpResponse(@Nullable String str, @Nullable Country country, @Nullable Image image, @Nullable Image image2, @Nullable City city, @Nullable String str2, @Nullable Bank bank, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable Date date, @Nullable Image image3, @Nullable Image image4, @Nullable String str6, @Nullable String str7, @Nullable String str8, @Nullable String str9, @Nullable String str10, @Nullable Date date2, @Nullable String str11, @Nullable String str12, @Nullable PlatformListResponse platformListResponse, @Nullable String str13, @Nullable String str14, @Nullable Integer num) {
        this.reason = str;
        this.country = country;
        this.idFile = image;
        this.drivingLicenseFile = image2;
        this.city = city;
        this.status = str2;
        this.bank = bank;
        this.idNumber = str3;
        this.iban = str4;
        this.mobileNumber = str5;
        this.dob = date;
        this.registrationFile = image3;
        this.profilePicFile = image4;
        this.nationality = str6;
        this.fintechAccountId = str7;
        this.urPayAccountIban = str8;
        this.urPayIdNumber = str9;
        this.ibanName = str10;
        this.createdAt = date2;
        this.name = str11;
        this.preferredVertical = str12;
        this.preferredPlatform = platformListResponse;
        this.vehiclePlateNumber = str13;
        this.vehicleSequenceNumber = str14;
        this.id = num;
    }

    public /* synthetic */ SignUpResponse(String str, Country country, Image image, Image image2, City city, String str2, Bank bank, String str3, String str4, String str5, Date date, Image image3, Image image4, String str6, String str7, String str8, String str9, String str10, Date date2, String str11, String str12, PlatformListResponse platformListResponse, String str13, String str14, Integer num, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this((i4 & 1) != 0 ? null : str, (i4 & 2) != 0 ? null : country, (i4 & 4) != 0 ? null : image, (i4 & 8) != 0 ? null : image2, (i4 & 16) != 0 ? null : city, (i4 & 32) != 0 ? null : str2, (i4 & 64) != 0 ? null : bank, (i4 & 128) != 0 ? null : str3, (i4 & Barcode.FORMAT_QR_CODE) != 0 ? null : str4, (i4 & 512) != 0 ? null : str5, (i4 & Barcode.FORMAT_UPC_E) != 0 ? null : date, (i4 & 2048) != 0 ? null : image3, (i4 & 4096) != 0 ? null : image4, (i4 & 8192) != 0 ? null : str6, (i4 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : str7, (i4 & 32768) != 0 ? null : str8, (i4 & 65536) != 0 ? null : str9, (i4 & 131072) != 0 ? null : str10, (i4 & 262144) != 0 ? null : date2, (i4 & 524288) != 0 ? null : str11, (i4 & 1048576) != 0 ? null : str12, (i4 & 2097152) != 0 ? null : platformListResponse, (i4 & 4194304) != 0 ? null : str13, (i4 & 8388608) != 0 ? null : str14, (i4 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : num);
    }
}
