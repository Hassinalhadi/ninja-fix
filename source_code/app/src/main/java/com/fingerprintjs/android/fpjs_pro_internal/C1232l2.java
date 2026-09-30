package com.fingerprintjs.android.fpjs_pro_internal;

import android.os.Build;
import com.clevertap.android.sdk.db.Column;
import com.clevertap.android.sdk.network.api.CtApi;
import com.fingerprintjs.android.fpjs_pro.Error;
import com.fingerprintjs.android.fpjs_pro.FingerprintJSProResponse;
import com.fingerprintjs.android.fpjs_pro_internal.getRightG17489;
import com.zendesk.service.HttpConstants;
import java.util.LinkedList;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import pe.AbstractC2327c;

@Metadata(d1 = {"\u0000\u0004\n\u0002\u0018\u0002\b\u0001\u0018\u0000"}, d2 = {"Lcom/fingerprintjs/android/fpjs_pro_internal/l2;"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.fingerprintjs.android.fpjs_pro_internal.l2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1232l2 extends bx {
    public static int hotel = 0;
    public static int india = 1;
    public final boolean delta;
    public final S0 echo;
    public final FingerprintJSProResponse foxtrot;
    public final Error golf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1232l2(byte[] bArr, boolean z2, S0 s02, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        super(bArr);
        String str;
        String str2;
        S0 obj = (i4 & 4) != 0 ? new Object() : s02;
        this.delta = z2;
        this.echo = obj;
        if (bArr != null) {
            str = new String(bArr, kotlin.text.a.alpha);
        } else {
            str = "{}";
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            str2 = jSONObject.optString(AbstractC1237n.bravo(yY18494.component9(), yY18494.component9(), -1118098740, yY18494.component9(), 1118098745, yY18494.component9()));
            try {
                if (jSONObject.has(AbstractC1237n.alpha())) {
                    this.golf = delta(str2, jSONObject);
                } else {
                    this.foxtrot = (FingerprintJSProResponse) bravo(new Object[]{this, str2, jSONObject}, getRightG17489.e.component9(), getRightG17489.e.component9(), -1825069459, 1825069459, getRightG17489.e.component9(), getRightG17489.e.component9());
                }
            } catch (Exception unused) {
                this.foxtrot = null;
                this.golf = new Error(str2, "Response cannot be parsed");
            }
        } catch (Exception unused2) {
            str2 = "";
        }
    }

    public static Object bravo(Object[] objArr, int i4, int i5, int i10, int i11, int i12, int i13) {
        String str;
        String str2;
        String str3;
        String str4;
        boolean z2;
        com.fingerprintjs.android.fpjs_pro.z zVar;
        com.fingerprintjs.android.fpjs_pro.p pVar;
        String str5;
        String str6;
        int i14;
        double d4;
        String str7;
        String str8;
        String str9;
        String str10;
        JSONObject jSONObject;
        String str11;
        JSONObject jSONObject2;
        String str12;
        String str13;
        String str14;
        JSONObject jSONObject3;
        String str15;
        String str16;
        JSONArray jSONArray;
        int i15 = ~i11;
        int i16 = ~(i15 | i10);
        int i17 = (~(i15 | i13)) | i16;
        int i18 = ~i10;
        int i19 = ~(i18 | i11);
        int i20 = i16 | i19 | (~(i18 | i13));
        int i21 = (~((~i13) | i18)) | i16 | i19;
        int i22 = ((-410517504) * i5) + (217841664 * i4) + ((-88866816) * i12) + (865627525 * i21) + ((-1731255050) * i20) + ((-1698084721) * i17) + (776760710 * i10) + ((-1820121865) * i11) + 1478230016;
        int papa = AbstractC2327c.papa(i5, 1794320298, ((-369695973) * i4) + i11 + i10 + i12);
        int i23 = i21 * 699;
        int i24 = (-1328892763) * i4;
        int i25 = i5 * (-1296121642);
        int quebec = AbstractC2327c.quebec(papa, -1691287552, i25 + i24 + (1872134975 * i12) + i23 + (i20 * (-1398)) + (i17 * 2097) + (i10 * 1872135674) + ((i11 * 1872133577) - 2052485254), -1729036288, ((-175177728) * papa) + i22);
        if (quebec != 1) {
            double d9 = 0.0d;
            if (quebec != 2) {
                C1232l2 c1232l2 = (C1232l2) objArr[0];
                String str17 = (String) objArr[1];
                JSONObject jSONObject4 = (JSONObject) objArr[2];
                String juliet = I0.juliet("sealedResult", jSONObject4);
                JSONObject jSONObject5 = jSONObject4.getJSONObject("products").getJSONObject("identification").getJSONObject(Column.DATA).getJSONObject("result");
                String string = jSONObject5.getString("visitorId");
                Intrinsics.checkNotNull(jSONObject5);
                com.fingerprintjs.android.fpjs_pro.d dVar = (com.fingerprintjs.android.fpjs_pro.d) bravo(new Object[]{jSONObject5}, getRightG17489.e.component9(), getRightG17489.e.component9(), 2065456166, -2065456164, getRightG17489.e.component9(), getRightG17489.e.component9());
                JSONObject optJSONObject = jSONObject5.optJSONObject("firstSeenAt");
                if (optJSONObject != null) {
                    str = optJSONObject.optString("global");
                } else {
                    str = null;
                }
                String str18 = "n\\a";
                if (str == null) {
                    str = "n\\a";
                }
                if (optJSONObject != null) {
                    str2 = optJSONObject.optString("subscription");
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "n\\a";
                }
                com.fingerprintjs.android.fpjs_pro.z zVar2 = new com.fingerprintjs.android.fpjs_pro.z(str, str2);
                JSONObject optJSONObject2 = jSONObject5.optJSONObject("lastSeenAt");
                if (optJSONObject2 != null) {
                    str3 = optJSONObject2.optString("global");
                } else {
                    str3 = null;
                }
                if (str3 == null) {
                    str3 = "n\\a";
                }
                if (optJSONObject2 != null) {
                    str4 = optJSONObject2.optString("subscription");
                } else {
                    str4 = null;
                }
                if (str4 == null) {
                    str4 = "n\\a";
                }
                com.fingerprintjs.android.fpjs_pro.z zVar3 = new com.fingerprintjs.android.fpjs_pro.z(str3, str4);
                boolean optBoolean = jSONObject5.optBoolean("visitorFound", false);
                if (c1232l2.delta) {
                    String optString = jSONObject5.optString("ip", "n\\a");
                    JSONObject optJSONObject3 = jSONObject5.optJSONObject("ipLocation");
                    if (optJSONObject3 != null) {
                        i14 = optJSONObject3.optInt("accuracyRadius", 0);
                    } else {
                        i14 = 0;
                    }
                    if (optJSONObject3 != null) {
                        d4 = optJSONObject3.optDouble("latitude", 0.0d);
                    } else {
                        d4 = 0.0d;
                    }
                    if (optJSONObject3 != null) {
                        d9 = optJSONObject3.optDouble("longitude", 0.0d);
                    }
                    double d10 = d9;
                    if (optJSONObject3 != null) {
                        str7 = optJSONObject3.optString("postalCode", "n\\a");
                    } else {
                        str7 = null;
                    }
                    if (str7 == null) {
                        str8 = "n\\a";
                    } else {
                        str8 = str7;
                    }
                    if (optJSONObject3 != null) {
                        str9 = optJSONObject3.optString("timezone", "n\\a");
                    } else {
                        str9 = null;
                    }
                    if (str9 == null) {
                        str10 = "n\\a";
                    } else {
                        str10 = str9;
                    }
                    if (optJSONObject3 != null) {
                        jSONObject = optJSONObject3.optJSONObject("city");
                    } else {
                        jSONObject = null;
                    }
                    if (jSONObject != null) {
                        str11 = jSONObject.optString("name", "n\\a");
                    } else {
                        str11 = null;
                    }
                    if (str11 == null) {
                        str11 = "n\\a";
                    }
                    com.fingerprintjs.android.fpjs_pro.l lVar = new com.fingerprintjs.android.fpjs_pro.l(str11);
                    if (optJSONObject3 != null) {
                        jSONObject2 = optJSONObject3.optJSONObject("country");
                    } else {
                        jSONObject2 = null;
                    }
                    if (jSONObject2 != null) {
                        str12 = jSONObject2.optString("code", "n\\a");
                    } else {
                        str12 = null;
                    }
                    if (str12 == null) {
                        str13 = "n\\a";
                    } else {
                        str13 = str12;
                    }
                    if (jSONObject2 != null) {
                        str14 = jSONObject2.optString("name", "n\\a");
                    } else {
                        str14 = null;
                    }
                    if (str14 == null) {
                        str14 = "n\\a";
                    }
                    com.fingerprintjs.android.fpjs_pro.n nVar = new com.fingerprintjs.android.fpjs_pro.n(str13, str14);
                    if (optJSONObject3 != null) {
                        jSONObject3 = optJSONObject3.optJSONObject("continent");
                    } else {
                        jSONObject3 = null;
                    }
                    if (jSONObject3 != null) {
                        str15 = jSONObject3.optString("code", "n\\a");
                    } else {
                        str15 = null;
                    }
                    if (str15 == null) {
                        str15 = "n\\a";
                    }
                    if (jSONObject3 != null) {
                        str16 = jSONObject3.optString("name", "n\\a");
                    } else {
                        str16 = null;
                    }
                    if (str16 == null) {
                        str16 = "n\\a";
                    }
                    com.fingerprintjs.android.fpjs_pro.m mVar = new com.fingerprintjs.android.fpjs_pro.m(str15, str16);
                    if (optJSONObject3 != null) {
                        jSONArray = optJSONObject3.optJSONArray("subdivisions");
                    } else {
                        jSONArray = null;
                    }
                    if (jSONArray == null) {
                        jSONArray = new JSONArray(new JSONObject[0]);
                    }
                    LinkedList linkedList = new LinkedList();
                    int length = jSONArray.length();
                    int i26 = 0;
                    while (i26 < length) {
                        com.fingerprintjs.android.fpjs_pro.z zVar4 = zVar2;
                        JSONObject optJSONObject4 = jSONArray.optJSONObject(i26);
                        Intrinsics.checkNotNull(optJSONObject4);
                        com.fingerprintjs.android.fpjs_pro.m mVar2 = mVar;
                        String optString2 = optJSONObject4.optString("isoCode", "n\\a");
                        JSONObject optJSONObject5 = jSONArray.optJSONObject(i26);
                        Intrinsics.checkNotNull(optJSONObject5);
                        linkedList.add(new com.fingerprintjs.android.fpjs_pro.o(optString2, optJSONObject5.optString("name", "n\\a")));
                        i26++;
                        optBoolean = optBoolean;
                        zVar2 = zVar4;
                        mVar = mVar2;
                    }
                    z2 = optBoolean;
                    zVar = zVar2;
                    com.fingerprintjs.android.fpjs_pro.p pVar2 = new com.fingerprintjs.android.fpjs_pro.p(i14, d4, d10, str8, str10, lVar, nVar, mVar, linkedList);
                    String optString3 = jSONObject5.optString(CtApi.QUERY_PARAM_OS_KEY, CtApi.DEFAULT_QUERY_PARAM_OS);
                    String str19 = Build.VERSION.CODENAME;
                    if (str19 == null) {
                        str19 = "";
                    }
                    str6 = jSONObject5.optString("osVersion", str19);
                    str5 = optString3;
                    pVar = pVar2;
                    str18 = optString;
                } else {
                    z2 = optBoolean;
                    zVar = zVar2;
                    pVar = null;
                    str5 = "n\\a";
                    str6 = str5;
                }
                Intrinsics.checkNotNull(string);
                return new FingerprintJSProResponse(str17, string, dVar, z2, str18, pVar, str5, str6, zVar, zVar3, juliet, jSONObject5.toString());
            }
            JSONObject optJSONObject6 = ((JSONObject) objArr[0]).optJSONObject("confidence");
            if (optJSONObject6 != null) {
                d9 = optJSONObject6.optDouble("score", 0.0d);
            }
            return new com.fingerprintjs.android.fpjs_pro.d(d9);
        }
        C1232l2 c1232l22 = (C1232l2) objArr[0];
        int i27 = (india + 125) % 128;
        hotel = i27;
        FingerprintJSProResponse fingerprintJSProResponse = c1232l22.foxtrot;
        int i28 = (i27 ^ 77) + ((i27 & 77) << 1);
        india = i28 % 128;
        if (i28 % 2 != 0) {
            return fingerprintJSProResponse;
        }
        throw null;
    }

    public final Error charlie() {
        int i4 = hotel;
        int i5 = i4 + 37;
        india = i5 % 128;
        if (i5 % 2 == 0) {
            int i10 = 44 / 0;
        }
        india = ((i4 & 45) + (i4 | 45)) % 128;
        return this.golf;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public final Error delta(String str, JSONObject jSONObject) {
        Error error;
        Error error2;
        hotel = (india + 45) % 128;
        JSONObject jSONObject2 = jSONObject.getJSONObject(AbstractC1237n.alpha());
        AbstractC1237n.quebec = (AbstractC1237n.papa + 121) % 128;
        int component9 = yY18494.component9();
        int i4 = ~(((-750860785) & component9) | ((-750860785) ^ component9));
        int i5 = -(-(((138412304 & i4) | (138412304 ^ i4)) * (-814)));
        int i10 = (251181221 ^ i5) + ((i5 & 251181221) << 1);
        int i11 = ~component9;
        int i12 = ~((i11 & (-409780500)) | ((-409780500) ^ i11));
        int i13 = (i12 & (-1022228980)) | (i12 ^ (-1022228980));
        int i14 = (i10 - (~(-(-(((i4 & i13) | (i13 ^ i4)) * HttpConstants.HTTP_PROXY_AUTH))))) - 1;
        int i15 = ~((750860784 & component9) | (750860784 ^ component9));
        int i16 = ((~((component9 & 409780499) | (409780499 ^ component9))) | (i15 & (-1022228980)) | ((-1022228980) ^ i15)) * HttpConstants.HTTP_PROXY_AUTH;
        int i17 = (i14 & i16) + (i16 | i14);
        int component92 = yY18494.component9();
        int i18 = ~component92;
        int i19 = (i18 & 811780299) | (811780299 ^ i18);
        int i20 = -(-((~((i19 & (-987191033)) | (i19 ^ (-987191033)))) * 130));
        int i21 = ((-470412523) & i20) + (i20 | (-470412523));
        int i22 = ((i21 | 1083537216) << 1) - (1083537216 ^ i21);
        int i23 = ~((component92 & (-177542705)) | ((-177542705) ^ component92));
        int i24 = ((i23 & 2131971) | (2131971 ^ i23)) * 130;
        if (i17 > ((i22 | i24) << 1) - (i24 ^ i22)) {
            String optString = jSONObject2.optString(AbstractC1237n.november);
            JSONObject jSONObject3 = jSONObject.getJSONObject(AbstractC1237n.alpha());
            int i25 = AbstractC1237n.papa + 99;
            AbstractC1237n.quebec = i25 % 128;
            int i26 = i25 % 2;
            String str2 = AbstractC1237n.oscar;
            if (i26 == 0) {
                int i27 = 84 / 0;
            }
            String juliet = I0.juliet(str2, jSONObject3);
            Intrinsics.checkNotNull(optString);
            ((V2) this.echo).getClass();
            switch (optString.hashCode()) {
                case -1990169961:
                    if (optString.equals("TooManyRequests")) {
                        if (juliet == null) {
                            juliet = "Too many requests, rate limit exceeded";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -1303088388:
                    if (optString.equals("SubscriptionNotActive")) {
                        if (juliet == null) {
                            juliet = "Subscription is not active";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -1156046805:
                    if (optString.equals("ProxyIntegrationSecretEnvironmentMismatch")) {
                        if (juliet == null) {
                            juliet = "Proxy integration secret environment mismatch";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -1101868394:
                    if (optString.equals("InstallationMethodRestricted")) {
                        if (juliet == null) {
                            juliet = "The installation method of the agent is not allowed for the customer";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -681021288:
                    if (optString.equals("TokenRequired")) {
                        if (juliet == null) {
                            juliet = "API key required";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -93106615:
                    if (optString.equals("InvalidProxyIntegrationHeaders")) {
                        if (juliet == null) {
                            juliet = "Invalid proxy integration headers";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case -20338522:
                    if (optString.equals("RequestCannotBeParsed")) {
                        if (juliet == null) {
                            juliet = "Request cannot be parsed";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 122916850:
                    if (optString.equals("RequestTimeout")) {
                        if (juliet == null) {
                            juliet = "Server-side timeout";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 362177024:
                    if (optString.equals("NotAvailableForCrawlBots")) {
                        if (juliet == null) {
                            juliet = "Not available for crawl bots";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 624688872:
                    if (optString.equals("HeaderRestricted")) {
                        if (juliet == null) {
                            juliet = "Not available with restricted header";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 690582241:
                    if (optString.equals("WrongRegion")) {
                        error = new Error(str, "Wrong region");
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1162785692:
                    if (optString.equals("OriginNotAvailable")) {
                        if (juliet == null) {
                            juliet = "Not available for this origin";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1265438056:
                    if (optString.equals("TokenNotFound")) {
                        if (juliet == null) {
                            juliet = "API key not found";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1281821581:
                    if (optString.equals("InvalidProxyIntegrationSecret")) {
                        if (juliet == null) {
                            juliet = "Invalid proxy integration secret";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1560111262:
                    if (optString.equals("NotAvailableWithoutUA")) {
                        if (juliet == null) {
                            juliet = "Not available when User-Agent is unspecified";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1574918403:
                    if (optString.equals("UnsupportedVersion")) {
                        if (juliet == null) {
                            juliet = "Android agent version not supported";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1586242120:
                    if (optString.equals("PackageNotAuthorized")) {
                        if (juliet == null) {
                            juliet = "Not available for this package";
                        }
                        error2 = new Error(str, juliet);
                        error = error2;
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 1729519372:
                    if (optString.equals("TokenExpired")) {
                        error = new Error(str, "API key expired");
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                case 2096857181:
                    if (optString.equals("Failed")) {
                        error = new Error(str, "Request failed");
                        break;
                    }
                    error = new Error(str, "Unknown error.");
                    break;
                default:
                    error = new Error(str, "Unknown error.");
                    break;
            }
            int i28 = india;
            int i29 = (i28 & 91) + (i28 | 91);
            hotel = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = 36 / 0;
            }
            return error;
        }
        throw null;
    }
}
