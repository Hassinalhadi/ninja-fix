package com.google.android.gms.auth.api.signin;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.b;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import t6.AbstractC3043q;
import z6.k;

@Deprecated
/* loaded from: classes2.dex */
public class GoogleSignInOptions extends AbstractSafeParcelable implements b, ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInOptions> CREATOR;

    /* renamed from: a, reason: collision with root package name */
    public final String f6635a;
    public final int alpha;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6636b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6637c;
    public final ArrayList purple;
    public final Account red;
    public final boolean silver;
    public final boolean teal;
    public final boolean white;
    public final String yellow;

    static {
        Scope scope = new Scope(1, Constants.PROFILE);
        new Scope(1, "email");
        Scope scope2 = new Scope(1, "openid");
        Scope scope3 = new Scope(1, "https://www.googleapis.com/auth/games_lite");
        Scope scope4 = new Scope(1, "https://www.googleapis.com/auth/games");
        HashSet hashSet = new HashSet();
        HashMap hashMap = new HashMap();
        hashSet.add(scope2);
        hashSet.add(scope);
        if (hashSet.contains(scope4) && hashSet.contains(scope3)) {
            hashSet.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet), null, false, false, false, null, null, hashMap, null);
        HashSet hashSet2 = new HashSet();
        HashMap hashMap2 = new HashMap();
        hashSet2.add(scope3);
        hashSet2.addAll(Arrays.asList(new Scope[0]));
        if (hashSet2.contains(scope4) && hashSet2.contains(scope3)) {
            hashSet2.remove(scope3);
        }
        new GoogleSignInOptions(3, new ArrayList(hashSet2), null, false, false, false, null, null, hashMap2, null);
        CREATOR = new k(21);
    }

    public GoogleSignInOptions(int i4, ArrayList arrayList, Account account, boolean z2, boolean z10, boolean z11, String str, String str2, HashMap hashMap, String str3) {
        this.alpha = i4;
        this.purple = arrayList;
        this.red = account;
        this.silver = z2;
        this.teal = z10;
        this.white = z11;
        this.yellow = str;
        this.f6635a = str2;
        this.f6636b = new ArrayList(hashMap.values());
        this.f6637c = str3;
    }

    public final boolean equals(Object obj) {
        String str = this.yellow;
        ArrayList arrayList = this.purple;
        if (obj != null) {
            try {
                GoogleSignInOptions googleSignInOptions = (GoogleSignInOptions) obj;
                ArrayList arrayList2 = googleSignInOptions.purple;
                String str2 = googleSignInOptions.yellow;
                Account account = googleSignInOptions.red;
                if (this.f6636b.isEmpty() && googleSignInOptions.f6636b.isEmpty() && arrayList.size() == new ArrayList(arrayList2).size() && arrayList.containsAll(new ArrayList(arrayList2))) {
                    Account account2 = this.red;
                    if (account2 == null) {
                        if (account != null) {
                            return false;
                        }
                    } else if (!account2.equals(account)) {
                        return false;
                    }
                    if (TextUtils.isEmpty(str)) {
                        if (!TextUtils.isEmpty(str2)) {
                            return false;
                        }
                    } else if (!str.equals(str2)) {
                        return false;
                    }
                    if (this.white == googleSignInOptions.white && this.silver == googleSignInOptions.silver && this.teal == googleSignInOptions.teal) {
                        if (TextUtils.equals(this.f6637c, googleSignInOptions.f6637c)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            } catch (ClassCastException unused) {
                return false;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.purple;
        int size = arrayList2.size();
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            arrayList.add(((Scope) arrayList2.get(i5)).purple);
        }
        Collections.sort(arrayList);
        int hashCode3 = arrayList.hashCode() + (1 * 31);
        Account account = this.red;
        int i10 = hashCode3 * 31;
        if (account == null) {
            hashCode = 0;
        } else {
            hashCode = account.hashCode();
        }
        int i11 = i10 + hashCode;
        String str = this.yellow;
        int i12 = i11 * 31;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i13 = ((((((i12 + hashCode2) * 31) + (this.white ? 1 : 0)) * 31) + (this.silver ? 1 : 0)) * 31) + (this.teal ? 1 : 0);
        String str2 = this.f6637c;
        int i14 = i13 * 31;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return i14 + i4;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        int quebec = AbstractC3043q.quebec(parcel, 20293);
        AbstractC3043q.sierra(parcel, 1, 4);
        parcel.writeInt(this.alpha);
        AbstractC3043q.papa(parcel, 2, new ArrayList(this.purple));
        AbstractC3043q.kilo(parcel, 3, this.red, i4);
        AbstractC3043q.sierra(parcel, 4, 4);
        parcel.writeInt(this.silver ? 1 : 0);
        AbstractC3043q.sierra(parcel, 5, 4);
        parcel.writeInt(this.teal ? 1 : 0);
        AbstractC3043q.sierra(parcel, 6, 4);
        parcel.writeInt(this.white ? 1 : 0);
        AbstractC3043q.lima(parcel, 7, this.yellow);
        AbstractC3043q.lima(parcel, 8, this.f6635a);
        AbstractC3043q.papa(parcel, 9, this.f6636b);
        AbstractC3043q.lima(parcel, 10, this.f6637c);
        AbstractC3043q.romeo(parcel, quebec);
    }
}
