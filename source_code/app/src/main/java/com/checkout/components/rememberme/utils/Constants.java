package com.checkout.components.rememberme.utils;

import com.checkout.components.interfaces.model.contact.Country;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\bÁ\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000bR\u0014\u0010\u0013\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0013\u0010\u000bR\u0014\u0010\u0014\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u000bR\u0014\u0010\u0015\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0014\u0010\u0016\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0014\u0010\u0017\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0014\u0010\u0018\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0014\u0010\u0019\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u000eR\u0014\u0010\u001a\u001a\u00020\f8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001a\u0010\u000e¨\u0006\u001b"}, d2 = {"Lcom/checkout/components/rememberme/utils/Constants;", "", "", "Lcom/checkout/components/interfaces/model/contact/Country;", "a", "Ljava/util/List;", "getSUPPORTED_COUNTRIES", "()Ljava/util/List;", "SUPPORTED_COUNTRIES", "", "EMAIL_INPUT_DEBOUNCE_TIME_MILLIS", "J", "", "CONSUMER_PATH", "Ljava/lang/String;", "CONSUMER_API_BASE_URL_SBOX", "CONSUMER_API_BASE_URL_PROD", "CONSUMER_HEADER_TOKEN_REFERENCE", "CONNECT_TIMEOUT", "READ_TIMEOUT", "WRITE_TIMEOUT", "CHECKOUT_HOMEPAGE_URL", "TERMS_OF_SERVICE_URL", "PRIVACY_POLICY_URL", Constants.ADD_CARD_ITEM_ID, "CARD", "CVV_TYPE", "rememberme_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class Constants {

    @NotNull
    public static final String ADD_CARD_ITEM_ID = "ADD_CARD_ITEM_ID";

    @NotNull
    public static final String CARD = "card";

    @NotNull
    public static final String CHECKOUT_HOMEPAGE_URL = "https://checkout.com/";
    public static final long CONNECT_TIMEOUT = 30;

    @NotNull
    public static final String CONSUMER_API_BASE_URL_PROD = "https://devices.api.checkout.com";

    @NotNull
    public static final String CONSUMER_API_BASE_URL_SBOX = "https://devices.api.sandbox.checkout.com";

    @NotNull
    public static final String CONSUMER_HEADER_TOKEN_REFERENCE = "X-Tokenizationreference";

    @NotNull
    public static final String CONSUMER_PATH = "consumers";

    @NotNull
    public static final String CVV_TYPE = "cvv";
    public static final long EMAIL_INPUT_DEBOUNCE_TIME_MILLIS = 300;

    @NotNull
    public static final String PRIVACY_POLICY_URL = "https://www.checkout.com/for-consumers/legal?tab=privacy-policy";
    public static final long READ_TIMEOUT = 30;

    @NotNull
    public static final String TERMS_OF_SERVICE_URL = "https://www.checkout.com/for-consumers/legal?tab=terms-of-service";
    public static final long WRITE_TIMEOUT = 50;

    @NotNull
    public static final Constants INSTANCE = new Constants();

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private static final List SUPPORTED_COUNTRIES = CollectionsKt.listOf(Country.ALBANIA, Country.ALGERIA, Country.AMERICAN_SAMOA, Country.ANDORRA, Country.ANGOLA, Country.ANGUILLA, Country.ANTIGUA_AND_BARBUDA, Country.ARGENTINA, Country.ARUBA, Country.AUSTRIA, Country.AZERBAIJAN, Country.BAHRAIN, Country.BARBADOS, Country.BELIZE, Country.BERMUDA, Country.BHUTAN, Country.BOLIVIA, Country.BOSNIA_AND_HERZEGOVINA, Country.BOTSWANA, Country.BRUNEI_DARUSSALAM, Country.BULGARIA, Country.BURKINA_FASO, Country.CAPE_VERDE, Country.CENTRAL_AFRICAN_REPUBLIC, Country.COMOROS, Country.COOK_ISLANDS, Country.CROATIA, Country.CYPRUS, Country.CZECH_REPUBLIC, Country.DENMARK, Country.DJIBOUTI, Country.DOMINICA, Country.EGYPT, Country.EQUATORIAL_GUINEA, Country.ESTONIA, Country.FALKLAND_ISLANDS, Country.FAROE_ISLANDS, Country.FIJI, Country.FINLAND, Country.FRANCE, Country.FRENCH_POLYNESIA, Country.GABON, Country.GAMBIA, Country.GEORGIA, Country.GERMANY, Country.GIBRALTAR, Country.GREECE, Country.GREENLAND, Country.GRENADA, Country.GUADELOUPE, Country.GUATEMALA, Country.GUERNSEY, Country.GUYANA, Country.HAITI, Country.HONDURAS, Country.ICELAND, Country.INDIA, Country.INDONESIA, Country.IRELAND, Country.ISLE_OF_MAN, Country.ISRAEL, Country.ITALY, Country.JAMAICA, Country.JERSEY, Country.KYRGYZSTAN, Country.LAO_PDR, Country.LATVIA, Country.LEBANON, Country.LESOTHO, Country.LIECHTENSTEIN, Country.LITHUANIA, Country.LUXEMBOURG, Country.MACAO, Country.MADAGASCAR, Country.MALAWI, Country.MALDIVES, Country.MALI, Country.MALTA, Country.MARTINIQUE, Country.MAURITANIA, Country.MAURITIUS, Country.MEXICO, Country.MOLDOVA, Country.MONACO, Country.MONGOLIA, Country.MONTENEGRO, Country.MONTSERRAT, Country.MOZAMBIQUE, Country.NAMIBIA, Country.NETHERLANDS, Country.NEW_CALEDONIA, Country.NIGER, Country.MACEDONIA, Country.NORWAY, Country.OMAN, Country.PAKISTAN, Country.PAPUA_NEW_GUINEA, Country.POLAND, Country.PORTUGAL, Country.QATAR, Country.REUNION, Country.SAINT_KITTS_AND_NEVIS, Country.SAINT_LUCIA, Country.SAINT_VINCENT_AND_GRENADINES, Country.SAMOA, Country.SAN_MARINO, Country.SAO_TOME_AND_PRINCIPE, Country.SAUDI_ARABIA, Country.SENEGAL, Country.SEYCHELLES, Country.SIERRA_LEONE, Country.SLOVAKIA, Country.SLOVENIA, Country.SOLOMON_ISLANDS, Country.SPAIN, Country.SURINAME, Country.SWEDEN, Country.SWITZERLAND, Country.TAJIKISTAN, Country.THAILAND, Country.TIMOR_LESTE, Country.TOGO, Country.TONGA, Country.TRINIDAD_AND_TOBAGO, Country.TURKEY, Country.TURKMENISTAN, Country.TURKS_AND_CAICOS_ISLANDS, Country.UKRAINE, Country.UNITED_ARAB_EMIRATES, Country.UNITED_KINGDOM, Country.UNITED_STATES_OF_AMERICA, Country.UZBEKISTAN, Country.VANUATU, Country.BRITISH_VIRGIN_ISLANDS);
    public static final int $stable = 8;

    private Constants() {
    }

    @NotNull
    public final List<Country> getSUPPORTED_COUNTRIES() {
        return SUPPORTED_COUNTRIES;
    }
}
