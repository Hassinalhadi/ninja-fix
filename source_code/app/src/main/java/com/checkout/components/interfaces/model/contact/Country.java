package com.checkout.components.interfaces.model.contact;

import Lb.am;
import Qd.a;
import android.os.Parcel;
import android.os.Parcelable;
import com.SecurityGuardBrige.ArchersSmoothLoginers.FeatureAccessGuard;
import com.checkout.components.interfaces.annotations.CkoPublicApi;
import com.clevertap.android.sdk.inapp.store.preference.InAppStore;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.mlkit.common.MlKitException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import s6.AbstractC2708l7;

@Metadata(d1 = {"\u0000-\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0003\b\u0086\u0002\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\r\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0013\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0005R\u0017\u0010\u0016\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0015\u0010\u0005j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+j\u0002\b,j\u0002\b-j\u0002\b.j\u0002\b/j\u0002\b0j\u0002\b1j\u0002\b2j\u0002\b3j\u0002\b4j\u0002\b5j\u0002\b6j\u0002\b7j\u0002\b8j\u0002\b9j\u0002\b:j\u0002\b;j\u0002\b<j\u0002\b=j\u0002\b>j\u0002\b?j\u0002\b@j\u0002\bAj\u0002\bBj\u0002\bCj\u0002\bDj\u0002\bEj\u0002\bFj\u0002\bGj\u0002\bHj\u0002\bIj\u0002\bJj\u0002\bKj\u0002\bLj\u0002\bMj\u0002\bNj\u0002\bOj\u0002\bPj\u0002\bQj\u0002\bRj\u0002\bSj\u0002\bTj\u0002\bUj\u0002\bVj\u0002\bWj\u0002\bXj\u0002\bYj\u0002\bZj\u0002\b[j\u0002\b\\j\u0002\b]j\u0002\b^j\u0002\b_j\u0002\b`j\u0002\baj\u0002\bbj\u0002\bcj\u0002\bdj\u0002\bej\u0002\bfj\u0002\bgj\u0002\bhj\u0002\bij\u0002\bjj\u0002\bkj\u0002\blj\u0002\bmj\u0002\bnj\u0002\boj\u0002\bpj\u0002\bqj\u0002\brj\u0002\bsj\u0002\btj\u0002\buj\u0002\bvj\u0002\bwj\u0002\bxj\u0002\byj\u0002\bzj\u0002\b{j\u0002\b|j\u0002\b}j\u0002\b~j\u0002\b\u007fj\u0003\b\u0080\u0001j\u0003\b\u0081\u0001j\u0003\b\u0082\u0001j\u0003\b\u0083\u0001j\u0003\b\u0084\u0001j\u0003\b\u0085\u0001j\u0003\b\u0086\u0001j\u0003\b\u0087\u0001j\u0003\b\u0088\u0001j\u0003\b\u0089\u0001j\u0003\b\u008a\u0001j\u0003\b\u008b\u0001j\u0003\b\u008c\u0001j\u0003\b\u008d\u0001j\u0003\b\u008e\u0001j\u0003\b\u008f\u0001j\u0003\b\u0090\u0001j\u0003\b\u0091\u0001j\u0003\b\u0092\u0001j\u0003\b\u0093\u0001j\u0003\b\u0094\u0001j\u0003\b\u0095\u0001j\u0003\b\u0096\u0001j\u0003\b\u0097\u0001j\u0003\b\u0098\u0001j\u0003\b\u0099\u0001j\u0003\b\u009a\u0001j\u0003\b\u009b\u0001j\u0003\b\u009c\u0001j\u0003\b\u009d\u0001j\u0003\b\u009e\u0001j\u0003\b\u009f\u0001j\u0003\b \u0001j\u0003\b¡\u0001j\u0003\b¢\u0001j\u0003\b£\u0001j\u0003\b¤\u0001j\u0003\b¥\u0001j\u0003\b¦\u0001j\u0003\b§\u0001j\u0003\b¨\u0001j\u0003\b©\u0001j\u0003\bª\u0001j\u0003\b«\u0001j\u0003\b¬\u0001j\u0003\b\u00ad\u0001j\u0003\b®\u0001j\u0003\b¯\u0001j\u0003\b°\u0001j\u0003\b±\u0001j\u0003\b²\u0001j\u0003\b³\u0001j\u0003\b´\u0001j\u0003\bµ\u0001j\u0003\b¶\u0001j\u0003\b·\u0001j\u0003\b¸\u0001j\u0003\b¹\u0001j\u0003\bº\u0001j\u0003\b»\u0001j\u0003\b¼\u0001j\u0003\b½\u0001j\u0003\b¾\u0001j\u0003\b¿\u0001j\u0003\bÀ\u0001j\u0003\bÁ\u0001j\u0003\bÂ\u0001j\u0003\bÃ\u0001j\u0003\bÄ\u0001j\u0003\bÅ\u0001j\u0003\bÆ\u0001j\u0003\bÇ\u0001j\u0003\bÈ\u0001j\u0003\bÉ\u0001j\u0003\bÊ\u0001j\u0003\bË\u0001j\u0003\bÌ\u0001j\u0003\bÍ\u0001j\u0003\bÎ\u0001j\u0003\bÏ\u0001j\u0003\bÐ\u0001j\u0003\bÑ\u0001j\u0003\bÒ\u0001j\u0003\bÓ\u0001j\u0003\bÔ\u0001j\u0003\bÕ\u0001j\u0003\bÖ\u0001j\u0003\b×\u0001j\u0003\bØ\u0001j\u0003\bÙ\u0001j\u0003\bÚ\u0001j\u0003\bÛ\u0001j\u0003\bÜ\u0001j\u0003\bÝ\u0001j\u0003\bÞ\u0001j\u0003\bß\u0001j\u0003\bà\u0001j\u0003\bá\u0001j\u0003\bâ\u0001j\u0003\bã\u0001j\u0003\bä\u0001j\u0003\bå\u0001j\u0003\bæ\u0001j\u0003\bç\u0001j\u0003\bè\u0001j\u0003\bé\u0001j\u0003\bê\u0001j\u0003\bë\u0001j\u0003\bì\u0001j\u0003\bí\u0001j\u0003\bî\u0001j\u0003\bï\u0001j\u0003\bð\u0001j\u0003\bñ\u0001j\u0003\bò\u0001j\u0003\bó\u0001j\u0003\bô\u0001j\u0003\bõ\u0001j\u0003\bö\u0001j\u0003\b÷\u0001j\u0003\bø\u0001j\u0003\bù\u0001j\u0003\bú\u0001j\u0003\bû\u0001j\u0003\bü\u0001j\u0003\bý\u0001j\u0003\bþ\u0001j\u0003\bÿ\u0001j\u0003\b\u0080\u0002j\u0003\b\u0081\u0002j\u0003\b\u0082\u0002j\u0003\b\u0083\u0002j\u0003\b\u0084\u0002j\u0003\b\u0085\u0002j\u0003\b\u0086\u0002j\u0003\b\u0087\u0002j\u0003\b\u0088\u0002j\u0003\b\u0089\u0002j\u0003\b\u008a\u0002j\u0003\b\u008b\u0002j\u0003\b\u008c\u0002j\u0003\b\u008d\u0002j\u0003\b\u008e\u0002j\u0003\b\u008f\u0002j\u0003\b\u0090\u0002j\u0003\b\u0091\u0002j\u0003\b\u0092\u0002¨\u0006\u0093\u0002"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Country;", "Landroid/os/Parcelable;", "", "", "displayName", "()Ljava/lang/String;", "emoji", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "a", "Ljava/lang/String;", "getIso3166Alpha2", "iso3166Alpha2", "b", "getDialingCode", "dialingCode", "Companion", "AFGHANISTAN", "ALAND_ISLANDS", "ALBANIA", "ALGERIA", "AMERICAN_SAMOA", "ANDORRA", "ANGOLA", "ANGUILLA", "ANTARCTICA", "ANTIGUA_AND_BARBUDA", "ARGENTINA", "ARMENIA", "ARUBA", "ASCENSION_ISLAND", "AUSTRALIA", "AUSTRIA", "AZERBAIJAN", "BAHAMAS", "BAHRAIN", "BANGLADESH", "BARBADOS", "BELARUS", "BELGIUM", "BELIZE", "BENIN", "BERMUDA", "BHUTAN", "BOLIVIA", "BONAIRE", "BOSNIA_AND_HERZEGOVINA", "BOTSWANA", "BOUVET_ISLAND", "BRAZIL", "BRITISH_INDIAN_OCEAN_TERRITORY", "BRUNEI_DARUSSALAM", "BULGARIA", "BURKINA_FASO", "BURUNDI", "CAMBODIA", "CAMEROON", "CANADA", "CAPE_VERDE", "CAYMAN_ISLANDS", "CENTRAL_AFRICAN_REPUBLIC", "CHAD", "CHILE", "CHINA", "CHRISTMAS_ISLAND", "COCOS_ISLANDS", "COLOMBIA", "COMOROS", "CONGO_BRAZZAVILLE", "COOK_ISLANDS", "COSTA_RICA", "CROATIA", "CUBA", "CURACAO", "CYPRUS", "CZECH_REPUBLIC", "CONGO_KINSHASA", "DENMARK", "DJIBOUTI", "DOMINICA", "DOMINICAN_REPUBLIC", "ECUADOR", "EGYPT", "EL_SALVADOR", "EQUATORIAL_GUINEA", "ERITREA", "ESTONIA", "SWAZILAND", "ETHIOPIA", "FALKLAND_ISLANDS", "FAROE_ISLANDS", "FIJI", "FINLAND", "FRANCE", "FRENCH_GUIANA", "FRENCH_POLYNESIA", "FRENCH_SOUTHERN_ANTARCTIC_LANDS", "GABON", "GAMBIA", "GEORGIA", "GERMANY", "GHANA", "GIBRALTAR", "GREECE", "GREENLAND", "GRENADA", "GUADELOUPE", "GUAM", "GUATEMALA", "GUERNSEY", "GUINEA", "GUINEA_BISSAU", "GUYANA", "HAITI", "HEARD_ISLANDS_MCDONALD_ISLANDS", "HONDURAS", "HONG_KONG", "HUNGARY", "ICELAND", "INDIA", "INDONESIA", "IRAN", "IRAQ", "IRELAND", "ISLE_OF_MAN", "ISRAEL", "ITALY", "COTE_D_IVOIRE", "JAMAICA", "JAPAN", "JERSEY", "JORDAN", "KAZAKHSTAN", "KENYA", "KIRIBATI", "KOREA_NORTH", "KOREA_SOUTH", "KUWAIT", "KYRGYZSTAN", "LAO_PDR", "LATVIA", "LEBANON", "LESOTHO", "LIBERIA", "LIBYA", "LIECHTENSTEIN", "LITHUANIA", "LUXEMBOURG", "MACAO", "MADAGASCAR", "MALAWI", "MALAYSIA", "MALDIVES", "MALI", "MALTA", "MARSHALL_ISLANDS", "MARTINIQUE", "MAURITANIA", "MAURITIUS", "MAYOTTE", "MEXICO", "MICRONESIA", "MOLDOVA", "MONACO", "MONGOLIA", "MONTENEGRO", "MONTSERRAT", "MOROCCO", "MOZAMBIQUE", "MYANMAR", "NAMIBIA", "NAURU", "NEPAL", "NETHERLANDS", "NETHERLANDS_ANTILLES", "NEW_CALEDONIA", "NEW_ZEALAND", "NICARAGUA", "NIGER", "NIGERIA", "NIUE", "NORFOLK_ISLAND", "MACEDONIA", "NORTHERN_MARIANA_ISLANDS", "NORWAY", "OMAN", "PAKISTAN", "PALAU", "PANAMA", "PAPUA_NEW_GUINEA", "PARAGUAY", "PERU", "PHILIPPINES", "PITCAIRN", "POLAND", "PORTUGAL", "PUERTO_RICO", "QATAR", "REUNION", "RO", "ROMANIA", "RWANDA", "SAINT_BARTHELEMY", "SAINT_HELENA", "SAINT_KITTS_AND_NEVIS", "SAINT_LUCIA", "SAINT_MARTIN", "SAINT_PIERRE_AND_MIQUELON", "SAINT_VINCENT_AND_GRENADINES", "SAMOA", "SAN_MARINO", "SAO_TOME_AND_PRINCIPE", "SAUDI_ARABIA", "SENEGAL", "SERBIA", "SEYCHELLES", "SIERRA_LEONE", "SINGAPORE", "SINT_MAARTEN", "SLOVAKIA", "SLOVENIA", "SOLOMON_ISLANDS", "SOMALIA", "SOUTH_AFRICA", "SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS", "SOUTH_SUDAN", "SPAIN", "SRI_LANKA", "SUDAN", "SURINAME", "SVALBARD_AND_JAN_MAYEN_ISLANDS", "SWEDEN", "SWITZERLAND", "SYRIA", "TAIWAN", "TAJIKISTAN", "TANZANIA", "THAILAND", "TIMOR_LESTE", "TOGO", "TOKELAU", "TONGA", "TRINIDAD_AND_TOBAGO", "TRISTAN_DA_CUNHA", "TUNISIA", "TURKEY", "TURKMENISTAN", "TURKS_AND_CAICOS_ISLANDS", "TUVALU", "UGANDA", "UKRAINE", "UNITED_ARAB_EMIRATES", "UNITED_KINGDOM", "UNITED_STATES_OF_AMERICA", "US_MINOR_OUTLYING_ISLANDS", "URUGUAY", "UZBEKISTAN", "VANUATU", "VATICAN_CITY", "VENEZUELA", "VIETNAM", "BRITISH_VIRGIN_ISLANDS", "VIRGIN_ISLANDS", "WALLIS_AND_FUTUNA_ISLANDS", "WESTERN_SAHARA", "YEMEN", "ZAMBIA", "ZIMBABWE", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@CkoPublicApi
/* loaded from: classes3.dex */
public final class Country extends Enum<Country> implements Parcelable {

    @NotNull
    public static final Parcelable.Creator<Country> CREATOR;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    /* renamed from: c */
    private static final /* synthetic */ Country[] f5487c;

    /* renamed from: d */
    private static final /* synthetic */ a f5488d;

    /* renamed from: a, reason: from kotlin metadata */
    private final String iso3166Alpha2;

    /* renamed from: b, reason: from kotlin metadata */
    private final String dialingCode;
    public static final Country AFGHANISTAN = new Country("AFGHANISTAN", 0, "AF", "93");
    public static final Country ALAND_ISLANDS = new Country("ALAND_ISLANDS", 1, "AX", "358");
    public static final Country ALBANIA = new Country("ALBANIA", 2, "AL", "355");
    public static final Country ALGERIA = new Country("ALGERIA", 3, "DZ", "213");
    public static final Country AMERICAN_SAMOA = new Country("AMERICAN_SAMOA", 4, "AS", "1684");
    public static final Country ANDORRA = new Country("ANDORRA", 5, "AD", "376");
    public static final Country ANGOLA = new Country("ANGOLA", 6, "AO", "244");
    public static final Country ANGUILLA = new Country("ANGUILLA", 7, "AI", "1264");
    public static final Country ANTARCTICA = new Country("ANTARCTICA", 8, "AQ", "672");
    public static final Country ANTIGUA_AND_BARBUDA = new Country("ANTIGUA_AND_BARBUDA", 9, "AG", "1268");
    public static final Country ARGENTINA = new Country("ARGENTINA", 10, "AR", "54");
    public static final Country ARMENIA = new Country("ARMENIA", 11, "AM", "374");
    public static final Country ARUBA = new Country("ARUBA", 12, "AW", "297");
    public static final Country ASCENSION_ISLAND = new Country("ASCENSION_ISLAND", 13, "AC", "247");
    public static final Country AUSTRALIA = new Country("AUSTRALIA", 14, "AU", "61");
    public static final Country AUSTRIA = new Country("AUSTRIA", 15, "AT", "43");
    public static final Country AZERBAIJAN = new Country("AZERBAIJAN", 16, "AZ", "994");
    public static final Country BAHAMAS = new Country("BAHAMAS", 17, "BS", "1242");
    public static final Country BAHRAIN = new Country("BAHRAIN", 18, "BH", "973");
    public static final Country BANGLADESH = new Country("BANGLADESH", 19, "BD", "880");
    public static final Country BARBADOS = new Country("BARBADOS", 20, "BB", "1246");
    public static final Country BELARUS = new Country("BELARUS", 21, "BY", "375");
    public static final Country BELGIUM = new Country("BELGIUM", 22, "BE", "32");
    public static final Country BELIZE = new Country("BELIZE", 23, "BZ", "501");
    public static final Country BENIN = new Country("BENIN", 24, "BJ", "229");
    public static final Country BERMUDA = new Country("BERMUDA", 25, "BM", "1441");
    public static final Country BHUTAN = new Country("BHUTAN", 26, "BT", "975");
    public static final Country BOLIVIA = new Country("BOLIVIA", 27, "BO", "591");
    public static final Country BONAIRE = new Country("BONAIRE", 28, "BQ", "5997");
    public static final Country BOSNIA_AND_HERZEGOVINA = new Country("BOSNIA_AND_HERZEGOVINA", 29, "BA", "387");
    public static final Country BOTSWANA = new Country("BOTSWANA", 30, "BW", "267");
    public static final Country BOUVET_ISLAND = new Country("BOUVET_ISLAND", 31, "BV", "47");
    public static final Country BRAZIL = new Country("BRAZIL", 32, "BR", "55");
    public static final Country BRITISH_INDIAN_OCEAN_TERRITORY = new Country("BRITISH_INDIAN_OCEAN_TERRITORY", 33, "IO", "246");
    public static final Country BRUNEI_DARUSSALAM = new Country("BRUNEI_DARUSSALAM", 34, "BN", "673");
    public static final Country BULGARIA = new Country("BULGARIA", 35, "BG", "359");
    public static final Country BURKINA_FASO = new Country("BURKINA_FASO", 36, "BF", "226");
    public static final Country BURUNDI = new Country("BURUNDI", 37, "BI", "257");
    public static final Country CAMBODIA = new Country("CAMBODIA", 38, "KH", "855");
    public static final Country CAMEROON = new Country("CAMEROON", 39, "CM", "237");
    public static final Country CANADA = new Country("CANADA", 40, "CA", "1");
    public static final Country CAPE_VERDE = new Country("CAPE_VERDE", 41, "CV", "238");
    public static final Country CAYMAN_ISLANDS = new Country("CAYMAN_ISLANDS", 42, "KY", "1345");
    public static final Country CENTRAL_AFRICAN_REPUBLIC = new Country("CENTRAL_AFRICAN_REPUBLIC", 43, "CF", "236");
    public static final Country CHAD = new Country("CHAD", 44, "TD", "235");
    public static final Country CHILE = new Country("CHILE", 45, "CL", "56");
    public static final Country CHINA = new Country("CHINA", 46, "CN", "86");
    public static final Country CHRISTMAS_ISLAND = new Country("CHRISTMAS_ISLAND", 47, "CX", "61");
    public static final Country COCOS_ISLANDS = new Country("COCOS_ISLANDS", 48, "CC", "61");
    public static final Country COLOMBIA = new Country("COLOMBIA", 49, "CO", "57");
    public static final Country COMOROS = new Country("COMOROS", 50, "KM", "269");
    public static final Country CONGO_BRAZZAVILLE = new Country("CONGO_BRAZZAVILLE", 51, "CG", "242");
    public static final Country COOK_ISLANDS = new Country("COOK_ISLANDS", 52, "CK", "682");
    public static final Country COSTA_RICA = new Country("COSTA_RICA", 53, "CR", "506");
    public static final Country CROATIA = new Country("CROATIA", 54, "HR", "385");
    public static final Country CUBA = new Country("CUBA", 55, "CU", "53");
    public static final Country CURACAO = new Country("CURACAO", 56, "CW", "5999");
    public static final Country CYPRUS = new Country("CYPRUS", 57, "CY", "357");
    public static final Country CZECH_REPUBLIC = new Country("CZECH_REPUBLIC", 58, "CZ", "420");
    public static final Country CONGO_KINSHASA = new Country("CONGO_KINSHASA", 59, "CD", "243");
    public static final Country DENMARK = new Country("DENMARK", 60, "DK", "45");
    public static final Country DJIBOUTI = new Country("DJIBOUTI", 61, "DJ", "253");
    public static final Country DOMINICA = new Country("DOMINICA", 62, "DM", "1767");
    public static final Country DOMINICAN_REPUBLIC = new Country("DOMINICAN_REPUBLIC", 63, "DO", "1849");
    public static final Country ECUADOR = new Country("ECUADOR", 64, "EC", "593");
    public static final Country EGYPT = new Country("EGYPT", 65, "EG", "20");
    public static final Country EL_SALVADOR = new Country("EL_SALVADOR", 66, "SV", "503");
    public static final Country EQUATORIAL_GUINEA = new Country("EQUATORIAL_GUINEA", 67, "GQ", "240");
    public static final Country ERITREA = new Country("ERITREA", 68, "ER", "291");
    public static final Country ESTONIA = new Country("ESTONIA", 69, "EE", "372");
    public static final Country SWAZILAND = new Country("SWAZILAND", 70, "SZ", "268");
    public static final Country ETHIOPIA = new Country("ETHIOPIA", 71, "ET", "251");
    public static final Country FALKLAND_ISLANDS = new Country("FALKLAND_ISLANDS", 72, "FK", "500");
    public static final Country FAROE_ISLANDS = new Country("FAROE_ISLANDS", 73, "FO", "298");
    public static final Country FIJI = new Country("FIJI", 74, "FJ", "679");
    public static final Country FINLAND = new Country("FINLAND", 75, "FI", "358");
    public static final Country FRANCE = new Country("FRANCE", 76, "FR", "33");
    public static final Country FRENCH_GUIANA = new Country("FRENCH_GUIANA", 77, "GF", "594");
    public static final Country FRENCH_POLYNESIA = new Country("FRENCH_POLYNESIA", 78, "PF", "689");
    public static final Country FRENCH_SOUTHERN_ANTARCTIC_LANDS = new Country("FRENCH_SOUTHERN_ANTARCTIC_LANDS", 79, "TF", "590");
    public static final Country GABON = new Country("GABON", 80, "GA", "241");
    public static final Country GAMBIA = new Country("GAMBIA", 81, "GM", "220");
    public static final Country GEORGIA = new Country("GEORGIA", 82, "GE", "995");
    public static final Country GERMANY = new Country("GERMANY", 83, "DE", "49");
    public static final Country GHANA = new Country("GHANA", 84, "GH", "233");
    public static final Country GIBRALTAR = new Country("GIBRALTAR", 85, "GI", "350");
    public static final Country GREECE = new Country("GREECE", 86, "GR", "30");
    public static final Country GREENLAND = new Country("GREENLAND", 87, "GL", "299");
    public static final Country GRENADA = new Country("GRENADA", 88, "GD", "1473");
    public static final Country GUADELOUPE = new Country("GUADELOUPE", 89, "GP", "590");
    public static final Country GUAM = new Country("GUAM", 90, "GU", "1671");
    public static final Country GUATEMALA = new Country("GUATEMALA", 91, "GT", "502");
    public static final Country GUERNSEY = new Country("GUERNSEY", 92, "GG", "44");
    public static final Country GUINEA = new Country("GUINEA", 93, "GN", "224");
    public static final Country GUINEA_BISSAU = new Country("GUINEA_BISSAU", 94, "GW", "245");
    public static final Country GUYANA = new Country("GUYANA", 95, "GY", "592");
    public static final Country HAITI = new Country("HAITI", 96, "HT", "509");
    public static final Country HEARD_ISLANDS_MCDONALD_ISLANDS = new Country("HEARD_ISLANDS_MCDONALD_ISLANDS", 97, "HM", "");
    public static final Country HONDURAS = new Country("HONDURAS", 98, "HN", "504");
    public static final Country HONG_KONG = new Country("HONG_KONG", 99, "HK", "852");
    public static final Country HUNGARY = new Country("HUNGARY", 100, "HU", "36");
    public static final Country ICELAND = new Country("ICELAND", 101, "IS", "354");
    public static final Country INDIA = new Country("INDIA", 102, "IN", "91");
    public static final Country INDONESIA = new Country("INDONESIA", 103, "ID", "62");
    public static final Country IRAN = new Country("IRAN", 104, "IR", "98");
    public static final Country IRAQ = new Country("IRAQ", 105, "IQ", "964");
    public static final Country IRELAND = new Country("IRELAND", 106, "IE", "353");
    public static final Country ISLE_OF_MAN = new Country("ISLE_OF_MAN", 107, "IM", "44");
    public static final Country ISRAEL = new Country("ISRAEL", 108, "IL", "972");
    public static final Country ITALY = new Country("ITALY", 109, "IT", "39");
    public static final Country COTE_D_IVOIRE = new Country("COTE_D_IVOIRE", 110, "CI", "225");
    public static final Country JAMAICA = new Country("JAMAICA", 111, "JM", "1876");
    public static final Country JAPAN = new Country("JAPAN", 112, "JP", "81");
    public static final Country JERSEY = new Country("JERSEY", 113, "JE", "44");
    public static final Country JORDAN = new Country("JORDAN", 114, "JO", "962");
    public static final Country KAZAKHSTAN = new Country("KAZAKHSTAN", 115, "KZ", "77");
    public static final Country KENYA = new Country("KENYA", 116, "KE", "254");
    public static final Country KIRIBATI = new Country("KIRIBATI", 117, "KI", "686");
    public static final Country KOREA_NORTH = new Country("KOREA_NORTH", 118, "KP", "850");
    public static final Country KOREA_SOUTH = new Country("KOREA_SOUTH", 119, "KR", "82");
    public static final Country KUWAIT = new Country("KUWAIT", 120, "KW", "965");
    public static final Country KYRGYZSTAN = new Country("KYRGYZSTAN", 121, "KG", "996");
    public static final Country LAO_PDR = new Country("LAO_PDR", 122, "LA", "856");
    public static final Country LATVIA = new Country("LATVIA", 123, "LV", "371");
    public static final Country LEBANON = new Country("LEBANON", 124, "LB", "961");
    public static final Country LESOTHO = new Country("LESOTHO", 125, "LS", "266");
    public static final Country LIBERIA = new Country("LIBERIA", 126, "LR", "231");
    public static final Country LIBYA = new Country("LIBYA", 127, "LY", "218");
    public static final Country LIECHTENSTEIN = new Country("LIECHTENSTEIN", 128, "LI", "423");
    public static final Country LITHUANIA = new Country("LITHUANIA", 129, "LT", "370");
    public static final Country LUXEMBOURG = new Country("LUXEMBOURG", 130, "LU", "352");
    public static final Country MACAO = new Country("MACAO", 131, "MO", "853");
    public static final Country MADAGASCAR = new Country("MADAGASCAR", 132, "MG", "261");
    public static final Country MALAWI = new Country("MALAWI", 133, "MW", "265");
    public static final Country MALAYSIA = new Country("MALAYSIA", 134, "MY", "60");
    public static final Country MALDIVES = new Country("MALDIVES", 135, "MV", "960");
    public static final Country MALI = new Country("MALI", 136, "ML", "223");
    public static final Country MALTA = new Country("MALTA", 137, "MT", "356");
    public static final Country MARSHALL_ISLANDS = new Country("MARSHALL_ISLANDS", 138, "MH", "692");
    public static final Country MARTINIQUE = new Country("MARTINIQUE", 139, "MQ", "596");
    public static final Country MAURITANIA = new Country("MAURITANIA", 140, "MR", "222");
    public static final Country MAURITIUS = new Country("MAURITIUS", ModuleDescriptor.MODULE_VERSION, "MU", "230");
    public static final Country MAYOTTE = new Country("MAYOTTE", 142, "YT", "262");
    public static final Country MEXICO = new Country("MEXICO", 143, "MX", "52");
    public static final Country MICRONESIA = new Country("MICRONESIA", 144, "FM", "691");
    public static final Country MOLDOVA = new Country("MOLDOVA", 145, "MD", "373");
    public static final Country MONACO = new Country("MONACO", 146, "MC", "377");
    public static final Country MONGOLIA = new Country("MONGOLIA", 147, "MN", "976");
    public static final Country MONTENEGRO = new Country("MONTENEGRO", 148, "ME", "382");
    public static final Country MONTSERRAT = new Country("MONTSERRAT", 149, "MS", "1664");
    public static final Country MOROCCO = new Country("MOROCCO", 150, "MA", "212");
    public static final Country MOZAMBIQUE = new Country("MOZAMBIQUE", 151, "MZ", "258");
    public static final Country MYANMAR = new Country("MYANMAR", 152, "MM", "95");
    public static final Country NAMIBIA = new Country("NAMIBIA", 153, "NA", "264");
    public static final Country NAURU = new Country("NAURU", 154, "NR", "674");
    public static final Country NEPAL = new Country("NEPAL", 155, "NP", "977");
    public static final Country NETHERLANDS = new Country("NETHERLANDS", 156, "NL", "31");
    public static final Country NETHERLANDS_ANTILLES = new Country("NETHERLANDS_ANTILLES", 157, "AN", "599");
    public static final Country NEW_CALEDONIA = new Country("NEW_CALEDONIA", 158, "NC", "687");
    public static final Country NEW_ZEALAND = new Country("NEW_ZEALAND", 159, "NZ", "64");
    public static final Country NICARAGUA = new Country("NICARAGUA", 160, "NI", "505");
    public static final Country NIGER = new Country("NIGER", 161, "NE", "227");
    public static final Country NIGERIA = new Country("NIGERIA", 162, "NG", "234");
    public static final Country NIUE = new Country("NIUE", 163, "NU", "683");
    public static final Country NORFOLK_ISLAND = new Country("NORFOLK_ISLAND", 164, "NF", "672");
    public static final Country MACEDONIA = new Country("MACEDONIA", 165, "MK", "389");
    public static final Country NORTHERN_MARIANA_ISLANDS = new Country("NORTHERN_MARIANA_ISLANDS", 166, "MP", "1670");
    public static final Country NORWAY = new Country("NORWAY", FeatureAccessGuard.FEATURE_PANEL, "NO", "47");
    public static final Country OMAN = new Country("OMAN", 168, "OM", "968");
    public static final Country PAKISTAN = new Country("PAKISTAN", 169, "PK", "92");
    public static final Country PALAU = new Country("PALAU", 170, "PW", "680");
    public static final Country PANAMA = new Country("PANAMA", 171, "PA", "507");
    public static final Country PAPUA_NEW_GUINEA = new Country("PAPUA_NEW_GUINEA", 172, "PG", "675");
    public static final Country PARAGUAY = new Country("PARAGUAY", 173, "PY", "595");
    public static final Country PERU = new Country("PERU", 174, "PE", "51");
    public static final Country PHILIPPINES = new Country("PHILIPPINES", 175, "PH", "63");
    public static final Country PITCAIRN = new Country("PITCAIRN", 176, "PN", "872");
    public static final Country POLAND = new Country("POLAND", 177, "PL", "48");
    public static final Country PORTUGAL = new Country("PORTUGAL", 178, "PT", "351");
    public static final Country PUERTO_RICO = new Country("PUERTO_RICO", 179, "PR", "1939");
    public static final Country QATAR = new Country("QATAR", 180, "QA", "974");
    public static final Country REUNION = new Country("REUNION", 181, "RE", "262");
    public static final Country RO = new Country("RO", 182, "RO", "40");
    public static final Country ROMANIA = new Country("ROMANIA", 183, "RU", "7");
    public static final Country RWANDA = new Country("RWANDA", 184, "RW", "250");
    public static final Country SAINT_BARTHELEMY = new Country("SAINT_BARTHELEMY", 185, "BL", "590");
    public static final Country SAINT_HELENA = new Country("SAINT_HELENA", 186, "SH", "290");
    public static final Country SAINT_KITTS_AND_NEVIS = new Country("SAINT_KITTS_AND_NEVIS", 187, "KN", "1869");
    public static final Country SAINT_LUCIA = new Country("SAINT_LUCIA", 188, "LC", "1758");
    public static final Country SAINT_MARTIN = new Country("SAINT_MARTIN", 189, "MF", "590");
    public static final Country SAINT_PIERRE_AND_MIQUELON = new Country("SAINT_PIERRE_AND_MIQUELON", 190, "PM", "508");
    public static final Country SAINT_VINCENT_AND_GRENADINES = new Country("SAINT_VINCENT_AND_GRENADINES", 191, "VC", "1784");
    public static final Country SAMOA = new Country("SAMOA", 192, "WS", "685");
    public static final Country SAN_MARINO = new Country("SAN_MARINO", 193, "SM", "378");
    public static final Country SAO_TOME_AND_PRINCIPE = new Country("SAO_TOME_AND_PRINCIPE", 194, "ST", "239");
    public static final Country SAUDI_ARABIA = new Country("SAUDI_ARABIA", 195, "SA", "966");
    public static final Country SENEGAL = new Country("SENEGAL", 196, "SN", "221");
    public static final Country SERBIA = new Country("SERBIA", 197, "RS", "381");
    public static final Country SEYCHELLES = new Country("SEYCHELLES", 198, "SC", "248");
    public static final Country SIERRA_LEONE = new Country("SIERRA_LEONE", 199, "SL", "232");
    public static final Country SINGAPORE = new Country("SINGAPORE", 200, "SG", "65");
    public static final Country SINT_MAARTEN = new Country("SINT_MAARTEN", 201, "SX", "1721");
    public static final Country SLOVAKIA = new Country("SLOVAKIA", 202, "SK", "421");
    public static final Country SLOVENIA = new Country("SLOVENIA", 203, "SI", "386");
    public static final Country SOLOMON_ISLANDS = new Country("SOLOMON_ISLANDS", 204, "SB", "677");
    public static final Country SOMALIA = new Country("SOMALIA", 205, "SO", "252");
    public static final Country SOUTH_AFRICA = new Country("SOUTH_AFRICA", 206, "ZA", "27");
    public static final Country SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS = new Country("SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS", MlKitException.CODE_SCANNER_GOOGLE_PLAY_SERVICES_VERSION_TOO_OLD, "GS", "500");
    public static final Country SOUTH_SUDAN = new Country("SOUTH_SUDAN", 208, InAppStore.SERVER_SIDE_MODE, "211");
    public static final Country SPAIN = new Country("SPAIN", 209, "ES", "34");
    public static final Country SRI_LANKA = new Country("SRI_LANKA", 210, "LK", "94");
    public static final Country SUDAN = new Country("SUDAN", 211, "SD", "249");
    public static final Country SURINAME = new Country("SURINAME", 212, "SR", "597");
    public static final Country SVALBARD_AND_JAN_MAYEN_ISLANDS = new Country("SVALBARD_AND_JAN_MAYEN_ISLANDS", 213, "SJ", "47");
    public static final Country SWEDEN = new Country("SWEDEN", 214, "SE", "46");
    public static final Country SWITZERLAND = new Country("SWITZERLAND", 215, "CH", "41");
    public static final Country SYRIA = new Country("SYRIA", 216, "SY", "963");
    public static final Country TAIWAN = new Country("TAIWAN", 217, "TW", "886");
    public static final Country TAJIKISTAN = new Country("TAJIKISTAN", 218, "TJ", "992");
    public static final Country TANZANIA = new Country("TANZANIA", 219, "TZ", "255");
    public static final Country THAILAND = new Country("THAILAND", 220, "TH", "66");
    public static final Country TIMOR_LESTE = new Country("TIMOR_LESTE", 221, "TL", "670");
    public static final Country TOGO = new Country("TOGO", 222, "TG", "228");
    public static final Country TOKELAU = new Country("TOKELAU", 223, "TK", "690");
    public static final Country TONGA = new Country("TONGA", 224, "TO", "676");
    public static final Country TRINIDAD_AND_TOBAGO = new Country("TRINIDAD_AND_TOBAGO", 225, "TT", "1868");
    public static final Country TRISTAN_DA_CUNHA = new Country("TRISTAN_DA_CUNHA", 226, "TA", "2908");
    public static final Country TUNISIA = new Country("TUNISIA", 227, "TN", "216");
    public static final Country TURKEY = new Country("TURKEY", 228, "TR", "90");
    public static final Country TURKMENISTAN = new Country("TURKMENISTAN", 229, "TM", "993");
    public static final Country TURKS_AND_CAICOS_ISLANDS = new Country("TURKS_AND_CAICOS_ISLANDS", 230, "TC", "1649");
    public static final Country TUVALU = new Country("TUVALU", 231, "TV", "688");
    public static final Country UGANDA = new Country("UGANDA", 232, "UG", "256");
    public static final Country UKRAINE = new Country("UKRAINE", 233, "UA", "380");
    public static final Country UNITED_ARAB_EMIRATES = new Country("UNITED_ARAB_EMIRATES", 234, "AE", "971");
    public static final Country UNITED_KINGDOM = new Country("UNITED_KINGDOM", 235, "GB", "44");
    public static final Country UNITED_STATES_OF_AMERICA = new Country("UNITED_STATES_OF_AMERICA", 236, "US", "1");
    public static final Country US_MINOR_OUTLYING_ISLANDS = new Country("US_MINOR_OUTLYING_ISLANDS", 237, "UM", "246");
    public static final Country URUGUAY = new Country("URUGUAY", 238, "UY", "598");
    public static final Country UZBEKISTAN = new Country("UZBEKISTAN", 239, "UZ", "998");
    public static final Country VANUATU = new Country("VANUATU", 240, "VU", "678");
    public static final Country VATICAN_CITY = new Country("VATICAN_CITY", 241, "VA", "379");
    public static final Country VENEZUELA = new Country("VENEZUELA", 242, "VE", "58");
    public static final Country VIETNAM = new Country("VIETNAM", 243, "VN", "84");
    public static final Country BRITISH_VIRGIN_ISLANDS = new Country("BRITISH_VIRGIN_ISLANDS", 244, "VG", "1284");
    public static final Country VIRGIN_ISLANDS = new Country("VIRGIN_ISLANDS", 245, "VI", "1340");
    public static final Country WALLIS_AND_FUTUNA_ISLANDS = new Country("WALLIS_AND_FUTUNA_ISLANDS", 246, "WF", "681");
    public static final Country WESTERN_SAHARA = new Country("WESTERN_SAHARA", 247, "EH", "2125288");
    public static final Country YEMEN = new Country("YEMEN", 248, "YE", "967");
    public static final Country ZAMBIA = new Country("ZAMBIA", 249, "ZM", "260");
    public static final Country ZIMBABWE = new Country("ZIMBABWE", 250, "ZW", "263");

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\n\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\bH\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/checkout/components/interfaces/model/contact/Country$Companion;", "", "", "iso3166Alpha2", "Lcom/checkout/components/interfaces/model/contact/Country;", "fromIso3166Alpha2", "(Ljava/lang/String;)Lcom/checkout/components/interfaces/model/contact/Country;", "value", "", "countries", "fromDialingCode", "(Ljava/lang/String;Ljava/util/List;)Lcom/checkout/components/interfaces/model/contact/Country;", "interfaces_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Companion {
        public Companion(DefaultConstructorMarker defaultConstructorMarker) {
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Country fromDialingCode$default(Companion companion, String str, List list, int i4, Object obj) {
            if ((i4 & 2) != 0) {
                list = Country.getEntries();
            }
            return companion.fromDialingCode(str, list);
        }

        @Nullable
        public final Country fromDialingCode(@NotNull String value, @NotNull List<? extends Country> countries) {
            Intrinsics.echo(value, "value");
            Intrinsics.echo(countries, "countries");
            String lime = StringsKt.lime(StringsKt.b(value).toString(), "+");
            Object obj = null;
            if (lime.length() <= 0) {
                lime = null;
            }
            if (lime == null) {
                return null;
            }
            Iterator<T> it = countries.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                if (Intrinsics.areEqual(((Country) next).getDialingCode(), lime)) {
                    obj = next;
                    break;
                }
            }
            return (Country) obj;
        }

        @Nullable
        public final Country fromIso3166Alpha2(@NotNull String iso3166Alpha2) {
            Object obj;
            Intrinsics.echo(iso3166Alpha2, "iso3166Alpha2");
            Iterator<E> it = Country.getEntries().iterator();
            while (true) {
                if (it.hasNext()) {
                    obj = it.next();
                    if (r.hotel(((Country) obj).getIso3166Alpha2(), iso3166Alpha2, true)) {
                        break;
                    }
                } else {
                    obj = null;
                    break;
                }
            }
            return (Country) obj;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes3.dex */
    public static final class Creator implements Parcelable.Creator<Country> {
        @Override // android.os.Parcelable.Creator
        public final Country createFromParcel(Parcel parcel) {
            Intrinsics.echo(parcel, "parcel");
            String readString = parcel.readString();
            Companion companion = Country.INSTANCE;
            return (Country) Enum.valueOf(Country.class, readString);
        }

        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i4) {
            return new Country[i4];
        }

        @Override // android.os.Parcelable.Creator
        public final Country[] newArray(int i4) {
            return new Country[i4];
        }
    }

    static {
        Country[] a6 = a();
        f5487c = a6;
        f5488d = AbstractC2708l7.bravo(a6);
        INSTANCE = new Companion(null);
        CREATOR = new Parcelable.Creator<Country>() { // from class: com.checkout.components.interfaces.model.contact.Country.Creator
            @Override // android.os.Parcelable.Creator
            public final Country createFromParcel(Parcel parcel) {
                Intrinsics.echo(parcel, "parcel");
                String readString = parcel.readString();
                Companion companion = Country.INSTANCE;
                return (Country) Enum.valueOf(Country.class, readString);
            }

            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i4) {
                return new Country[i4];
            }

            @Override // android.os.Parcelable.Creator
            public final Country[] newArray(int i4) {
                return new Country[i4];
            }
        };
    }

    private Country(String str, int i4, String str2, String str3) {
        super(str, i4);
        this.iso3166Alpha2 = str2;
        this.dialingCode = str3;
    }

    private static final /* synthetic */ Country[] a() {
        return new Country[]{AFGHANISTAN, ALAND_ISLANDS, ALBANIA, ALGERIA, AMERICAN_SAMOA, ANDORRA, ANGOLA, ANGUILLA, ANTARCTICA, ANTIGUA_AND_BARBUDA, ARGENTINA, ARMENIA, ARUBA, ASCENSION_ISLAND, AUSTRALIA, AUSTRIA, AZERBAIJAN, BAHAMAS, BAHRAIN, BANGLADESH, BARBADOS, BELARUS, BELGIUM, BELIZE, BENIN, BERMUDA, BHUTAN, BOLIVIA, BONAIRE, BOSNIA_AND_HERZEGOVINA, BOTSWANA, BOUVET_ISLAND, BRAZIL, BRITISH_INDIAN_OCEAN_TERRITORY, BRUNEI_DARUSSALAM, BULGARIA, BURKINA_FASO, BURUNDI, CAMBODIA, CAMEROON, CANADA, CAPE_VERDE, CAYMAN_ISLANDS, CENTRAL_AFRICAN_REPUBLIC, CHAD, CHILE, CHINA, CHRISTMAS_ISLAND, COCOS_ISLANDS, COLOMBIA, COMOROS, CONGO_BRAZZAVILLE, COOK_ISLANDS, COSTA_RICA, CROATIA, CUBA, CURACAO, CYPRUS, CZECH_REPUBLIC, CONGO_KINSHASA, DENMARK, DJIBOUTI, DOMINICA, DOMINICAN_REPUBLIC, ECUADOR, EGYPT, EL_SALVADOR, EQUATORIAL_GUINEA, ERITREA, ESTONIA, SWAZILAND, ETHIOPIA, FALKLAND_ISLANDS, FAROE_ISLANDS, FIJI, FINLAND, FRANCE, FRENCH_GUIANA, FRENCH_POLYNESIA, FRENCH_SOUTHERN_ANTARCTIC_LANDS, GABON, GAMBIA, GEORGIA, GERMANY, GHANA, GIBRALTAR, GREECE, GREENLAND, GRENADA, GUADELOUPE, GUAM, GUATEMALA, GUERNSEY, GUINEA, GUINEA_BISSAU, GUYANA, HAITI, HEARD_ISLANDS_MCDONALD_ISLANDS, HONDURAS, HONG_KONG, HUNGARY, ICELAND, INDIA, INDONESIA, IRAN, IRAQ, IRELAND, ISLE_OF_MAN, ISRAEL, ITALY, COTE_D_IVOIRE, JAMAICA, JAPAN, JERSEY, JORDAN, KAZAKHSTAN, KENYA, KIRIBATI, KOREA_NORTH, KOREA_SOUTH, KUWAIT, KYRGYZSTAN, LAO_PDR, LATVIA, LEBANON, LESOTHO, LIBERIA, LIBYA, LIECHTENSTEIN, LITHUANIA, LUXEMBOURG, MACAO, MADAGASCAR, MALAWI, MALAYSIA, MALDIVES, MALI, MALTA, MARSHALL_ISLANDS, MARTINIQUE, MAURITANIA, MAURITIUS, MAYOTTE, MEXICO, MICRONESIA, MOLDOVA, MONACO, MONGOLIA, MONTENEGRO, MONTSERRAT, MOROCCO, MOZAMBIQUE, MYANMAR, NAMIBIA, NAURU, NEPAL, NETHERLANDS, NETHERLANDS_ANTILLES, NEW_CALEDONIA, NEW_ZEALAND, NICARAGUA, NIGER, NIGERIA, NIUE, NORFOLK_ISLAND, MACEDONIA, NORTHERN_MARIANA_ISLANDS, NORWAY, OMAN, PAKISTAN, PALAU, PANAMA, PAPUA_NEW_GUINEA, PARAGUAY, PERU, PHILIPPINES, PITCAIRN, POLAND, PORTUGAL, PUERTO_RICO, QATAR, REUNION, RO, ROMANIA, RWANDA, SAINT_BARTHELEMY, SAINT_HELENA, SAINT_KITTS_AND_NEVIS, SAINT_LUCIA, SAINT_MARTIN, SAINT_PIERRE_AND_MIQUELON, SAINT_VINCENT_AND_GRENADINES, SAMOA, SAN_MARINO, SAO_TOME_AND_PRINCIPE, SAUDI_ARABIA, SENEGAL, SERBIA, SEYCHELLES, SIERRA_LEONE, SINGAPORE, SINT_MAARTEN, SLOVAKIA, SLOVENIA, SOLOMON_ISLANDS, SOMALIA, SOUTH_AFRICA, SOUTH_GEORGIA_AND_THE_SOUTH_SANDWICH_ISLANDS, SOUTH_SUDAN, SPAIN, SRI_LANKA, SUDAN, SURINAME, SVALBARD_AND_JAN_MAYEN_ISLANDS, SWEDEN, SWITZERLAND, SYRIA, TAIWAN, TAJIKISTAN, TANZANIA, THAILAND, TIMOR_LESTE, TOGO, TOKELAU, TONGA, TRINIDAD_AND_TOBAGO, TRISTAN_DA_CUNHA, TUNISIA, TURKEY, TURKMENISTAN, TURKS_AND_CAICOS_ISLANDS, TUVALU, UGANDA, UKRAINE, UNITED_ARAB_EMIRATES, UNITED_KINGDOM, UNITED_STATES_OF_AMERICA, US_MINOR_OUTLYING_ISLANDS, URUGUAY, UZBEKISTAN, VANUATU, VATICAN_CITY, VENEZUELA, VIETNAM, BRITISH_VIRGIN_ISLANDS, VIRGIN_ISLANDS, WALLIS_AND_FUTUNA_ISLANDS, WESTERN_SAHARA, YEMEN, ZAMBIA, ZIMBABWE};
    }

    public static /* synthetic */ CharSequence charlie(char[] cArr) {
        return a(cArr);
    }

    @NotNull
    public static a getEntries() {
        return f5488d;
    }

    public static Country valueOf(String str) {
        return (Country) Enum.valueOf(Country.class, str);
    }

    public static Country[] values() {
        return (Country[]) f5487c.clone();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @NotNull
    public final String displayName() {
        String displayCountry = new Locale(Locale.getDefault().getLanguage(), this.iso3166Alpha2).getDisplayCountry();
        Intrinsics.delta(displayCountry, "getDisplayCountry(...)");
        return displayCountry;
    }

    @NotNull
    public final String emoji() {
        int collectionSizeOrDefault;
        String str = this.iso3166Alpha2;
        ArrayList arrayList = new ArrayList(str.length());
        int i4 = 0;
        for (int i5 = 0; i5 < str.length(); i5++) {
            arrayList.add(Integer.valueOf(Character.codePointAt(String.valueOf(str.charAt(i5)), 0) - (-127397)));
        }
        collectionSizeOrDefault = CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10);
        ArrayList arrayList2 = new ArrayList(collectionSizeOrDefault);
        int size = arrayList.size();
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            arrayList2.add(Character.toChars(((Number) obj).intValue()));
        }
        return CollectionsKt.maroon(arrayList2, "", null, null, new am(11), 30);
    }

    @NotNull
    public final String getDialingCode() {
        return this.dialingCode;
    }

    @NotNull
    public final String getIso3166Alpha2() {
        return this.iso3166Alpha2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@NotNull Parcel dest, int flags) {
        Intrinsics.echo(dest, "dest");
        dest.writeString(name());
    }

    public static final CharSequence a(char[] cArr) {
        Intrinsics.checkNotNull(cArr);
        return new String(cArr);
    }
}
