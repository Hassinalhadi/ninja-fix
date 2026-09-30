package com.google.android.gms.internal.identity;

import Y5.b;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.clevertap.android.sdk.Constants;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.r;
import org.jetbrains.annotations.NotNull;
import p6.t;
import p6.v;
import p6.w;
import t6.AbstractC3043q;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\t\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001YBS\b\u0017\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\u0010\b\u0003\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\n\b\u0003\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\rBc\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\f\u0010\u0012J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b\u001d\u0010\u001cJC\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJ+\u0010!\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b!\u0010\"J\u0017\u0010#\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b#\u0010$J\u0017\u0010%\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b%\u0010$J+\u0010&\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u00132\u0012\u0010\u0019\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0018\"\u00020\u0004H\u0007¢\u0006\u0004\b&\u0010\"J\u0017\u0010'\u001a\u00020 2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b'\u0010$J\u000f\u0010(\u001a\u00020\u0000H\u0007¢\u0006\u0004\b(\u0010)J\u0011\u0010*\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b*\u0010)J-\u0010-\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010+\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020\tH\u0007¢\u0006\u0004\b0\u00101J\u001f\u00100\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b0\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u00108\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b8\u00109R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010:\u001a\u0004\b;\u0010<R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8GX\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010=\u001a\u0004\b>\u0010?R\u001d\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00020@8G¢\u0006\u0006\u001a\u0004\bA\u0010BR\u001d\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100@8G¢\u0006\u0006\u001a\u0004\bC\u0010BR\u0016\u0010\u000b\u001a\u0004\u0018\u00010\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001e\u0010E\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0@8Ç\u0002¢\u0006\u0006\u001a\u0004\bE\u0010BR\u0011\u0010F\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0011\u0010H\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bH\u0010GR\u0011\u0010I\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bI\u0010GR\u0011\u0010J\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bJ\u0010GR\u0011\u0010K\u001a\u00020\u001a8G¢\u0006\u0006\u001a\u0004\bK\u0010GR\u001e\u0010L\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u001a0@8Ç\u0002¢\u0006\u0006\u001a\u0004\bL\u0010BR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010:\u001a\u0004\bM\u0010<R\u001a\u0010\u0005\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010:\u001a\u0004\bN\u0010<R\u0017\u0010\u000e\u001a\u00020\u00028G¢\u0006\f\n\u0004\b\u000e\u0010O\u001a\u0004\bP\u0010QR\u0011\u0010S\u001a\u00020\u00008G¢\u0006\u0006\u001a\u0004\bR\u0010)R\u001a\u0010\u0003\u001a\u00020\u00028GX\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010O\u001a\u0004\bT\u0010QR\u0011\u0010X\u001a\u00020U8G¢\u0006\u0006\u001a\u0004\bV\u0010W¨\u0006Z"}, d2 = {"Lcom/google/android/gms/libs/identity/ClientIdentity;", "Lcom/google/android/gms/common/internal/safeparcel/AbstractSafeParcelable;", "", "uid", "", "packageName", "attributionTag", "listenerId", "", "Lcom/google/android/gms/common/Feature;", "clientFeatures", "impersonator", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "pid", "clientSdkVersion", "Lcom/google/android/gms/libs/identity/ClientType;", "clientType", "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Lcom/google/android/gms/libs/identity/ClientType;Lcom/google/android/gms/libs/identity/ClientIdentity;)V", "Landroid/content/Context;", "context", "Lcom/google/android/gms/libs/identity/Impersonator;", "asImpersonator", "(Landroid/content/Context;)Lcom/google/android/gms/libs/identity/Impersonator;", "", "permissions", "", "checkAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)Z", "checkPermissions", Constants.COPY_TYPE, "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/google/android/gms/libs/identity/Impersonator;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "", "enforceAnyPermissions", "(Landroid/content/Context;[Ljava/lang/String;)V", "enforceFirstParty", "(Landroid/content/Context;)V", "enforcePackageName", "enforcePermissions", "enforceZeroParty", "forAggregation", "()Lcom/google/android/gms/libs/identity/ClientIdentity;", "getImpersonator", "impersonatee", "impersonateeListenerId", "impersonate", "(Landroid/content/Context;Lcom/google/android/gms/libs/identity/ClientIdentity;Ljava/lang/String;)Lcom/google/android/gms/libs/identity/ClientIdentity;", "feature", "supportsFeature", "(Lcom/google/android/gms/common/Feature;)Z", "name", "", "version", "(Ljava/lang/String;J)Z", "_clientSdkVersion", "Ljava/lang/Integer;", "_clientType", "Lcom/google/android/gms/libs/identity/ClientType;", "Ljava/lang/String;", "getAttributionTag", "()Ljava/lang/String;", "Ljava/util/List;", "getClientFeatures", "()Ljava/util/List;", "Lkotlin/Function1;", "getClientSdkVersion", "()Lkotlin/jvm/functions/Function1;", "getClientType", "Lcom/google/android/gms/libs/identity/ClientIdentity;", "isFirstParty", "isImpersonatedIdentity", "()Z", "isMyProcess", "isMyUid", "isMyUser", "isSystemServer", "isZeroParty", "getListenerId", "getPackageName", "I", "getPid", "()I", "getRealIdentity", "realIdentity", "getUid", "Landroid/os/UserHandle;", "getUserHandle", "()Landroid/os/UserHandle;", "userHandle", "Companion", "java.com.google.android.gms.libs.identity_identity"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.google.android.gms.internal.location.zze, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class ClientIdentity extends AbstractSafeParcelable {

    @NotNull
    public static final Parcelable.Creator<ClientIdentity> CREATOR = new b(25);
    public final int alpha;
    public final String purple;
    public final String red;
    public final String silver;
    public final v teal;
    public final ClientIdentity white;

    static {
        Process.myUid();
        Process.myPid();
    }

    public ClientIdentity(int i4, String packageName, String str, String str2, ArrayList arrayList, ClientIdentity clientIdentity) {
        Intrinsics.echo(packageName, "packageName");
        if (clientIdentity != null && clientIdentity.white != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        this.alpha = i4;
        this.purple = packageName;
        this.red = str;
        if (str2 == null) {
            if (clientIdentity != null) {
                str2 = clientIdentity.silver;
            } else {
                str2 = null;
            }
        }
        this.silver = str2;
        List list = arrayList;
        if (arrayList == null) {
            List list2 = clientIdentity != null ? clientIdentity.teal : null;
            list = list2;
            if (list2 == null) {
                t tVar = v.purple;
                List list3 = w.teal;
                Intrinsics.delta(list3, "of(...)");
                list = list3;
            }
        }
        v lima = v.lima(list);
        Intrinsics.delta(lima, "copyOf(...)");
        this.teal = lima;
        this.white = clientIdentity;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ClientIdentity) {
            ClientIdentity clientIdentity = (ClientIdentity) obj;
            if (this.alpha == clientIdentity.alpha && Intrinsics.areEqual(this.purple, clientIdentity.purple) && Intrinsics.areEqual(this.red, clientIdentity.red) && Intrinsics.areEqual(this.silver, clientIdentity.silver) && Intrinsics.areEqual(this.white, clientIdentity.white) && Intrinsics.areEqual(this.teal, clientIdentity.teal)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.alpha), this.purple, this.red, this.silver, this.white});
    }

    public final String toString() {
        int i4;
        String str = this.purple;
        int length = str.length() + 18;
        String str2 = this.red;
        if (str2 != null) {
            i4 = str2.length();
        } else {
            i4 = 0;
        }
        StringBuilder sb2 = new StringBuilder(length + i4);
        sb2.append(this.alpha);
        sb2.append("/");
        sb2.append(str);
        if (str2 != null) {
            sb2.append(Constants.AES_PREFIX);
            if (r.quebec(str2, str, false)) {
                sb2.append((CharSequence) str2, str.length(), str2.length());
            } else {
                sb2.append(str2);
            }
            sb2.append(Constants.AES_SUFFIX);
        }
        String str3 = this.silver;
        if (str3 != null) {
            sb2.append("/");
            sb2.append(Integer.toHexString(str3.hashCode()));
        }
        String sb3 = sb2.toString();
        Intrinsics.delta(sb3, "toString(...)");
        return sb3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int i4) {
        Intrinsics.echo(dest, "dest");
        int quebec = AbstractC3043q.quebec(dest, 20293);
        AbstractC3043q.sierra(dest, 1, 4);
        dest.writeInt(this.alpha);
        AbstractC3043q.lima(dest, 3, this.purple);
        AbstractC3043q.lima(dest, 4, this.red);
        AbstractC3043q.lima(dest, 6, this.silver);
        AbstractC3043q.kilo(dest, 7, this.white, i4);
        AbstractC3043q.papa(dest, 8, this.teal);
        AbstractC3043q.romeo(dest, quebec);
    }
}
