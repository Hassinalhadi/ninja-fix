package com.google.android.gms.auth.api.signin;

import V5.x;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONObject;
import t6.AbstractC3043q;
import z1.e;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInAccount extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new e(21);

    /* renamed from: a, reason: collision with root package name */
    public final long f6630a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final String f6631b;

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f6632c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6633d;
    public final String e;

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f6634f = new HashSet();
    public final String purple;
    public final String red;
    public final String silver;
    public final String teal;
    public final Uri white;
    public String yellow;

    public GoogleSignInAccount(int i4, String str, String str2, String str3, String str4, Uri uri, String str5, long j5, String str6, ArrayList arrayList, String str7, String str8) {
        this.alpha = i4;
        this.purple = str;
        this.red = str2;
        this.silver = str3;
        this.teal = str4;
        this.white = uri;
        this.yellow = str5;
        this.f6630a = j5;
        this.f6631b = str6;
        this.f6632c = arrayList;
        this.f6633d = str7;
        this.e = str8;
    }

    public static GoogleSignInAccount o(String str) {
        Uri uri;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        if (!TextUtils.isEmpty(optString)) {
            uri = Uri.parse(optString);
        } else {
            uri = null;
        }
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i4 = 0; i4 < length; i4++) {
            hashSet.add(new Scope(1, jSONArray.getString(i4)));
        }
        String optString2 = jSONObject.optString(Constants.KEY_ID);
        if (jSONObject.has("tokenId")) {
            str2 = jSONObject.optString("tokenId");
        } else {
            str2 = null;
        }
        if (jSONObject.has("email")) {
            str3 = jSONObject.optString("email");
        } else {
            str3 = null;
        }
        if (jSONObject.has("displayName")) {
            str4 = jSONObject.optString("displayName");
        } else {
            str4 = null;
        }
        if (jSONObject.has("givenName")) {
            str5 = jSONObject.optString("givenName");
        } else {
            str5 = null;
        }
        if (jSONObject.has("familyName")) {
            str6 = jSONObject.optString("familyName");
        } else {
            str6 = null;
        }
        String string = jSONObject.getString("obfuscatedIdentifier");
        x.echo(string);
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, optString2, str2, str3, str4, uri, null, parseLong, string, new ArrayList(hashSet), str5, str6);
        if (jSONObject.has("serverAuthCode")) {
            str7 = jSONObject.optString("serverAuthCode");
        }
        googleSignInAccount.yellow = str7;
        return googleSignInAccount;
    }

    public final boolean equals(Object obj) {
        if (obj != null) {
            if (obj != this) {
                if (obj instanceof GoogleSignInAccount) {
                    GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
                    if (googleSignInAccount.f6631b.equals(this.f6631b)) {
                        HashSet hashSet = new HashSet(googleSignInAccount.f6632c);
                        hashSet.addAll(googleSignInAccount.f6634f);
                        HashSet hashSet2 = new HashSet(this.f6632c);
                        hashSet2.addAll(this.f6634f);
                        if (hashSet.equals(hashSet2)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.f6631b.hashCode() + 527;
        HashSet hashSet = new HashSet(this.f6632c);
        hashSet.addAll(this.f6634f);
        return (hashCode * 31) + hashSet.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.lima(parcel, 2, this.purple);
        AbstractC3043q.lima(parcel, 3, this.red);
        AbstractC3043q.lima(parcel, 4, this.silver);
        AbstractC3043q.lima(parcel, 5, this.teal);
        AbstractC3043q.kilo(parcel, 6, this.white, i4);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.sierra(parcel, 8, 8);
        parcel.writeLong(this.f6630a);
        AbstractC3043q.lima(parcel, 9, this.f6631b);
        AbstractC3043q.papa(parcel, 10, this.f6632c);
        AbstractC3043q.lima(parcel, 11, this.f6633d);
        AbstractC3043q.lima(parcel, 12, this.e);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
