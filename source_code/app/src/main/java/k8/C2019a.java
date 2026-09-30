package k8;

import androidx.appcompat.widget.P0;
import av.q;
import com.google.maps.android.BuildConfig;

/* renamed from: k8.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2019a {
    public final String alpha;
    public final int bravo;
    public final String charlie;
    public final String delta;
    public final long echo;
    public final long foxtrot;
    public final String golf;

    public C2019a(String str, int i4, String str2, String str3, long j5, long j6, String str4) {
        this.alpha = str;
        this.bravo = i4;
        this.charlie = str2;
        this.delta = str3;
        this.echo = j5;
        this.foxtrot = j6;
        this.golf = str4;
    }

    public final He.b alpha() {
        He.b bVar = new He.b();
        bVar.bravo = this.alpha;
        bVar.charlie = this.bravo;
        bVar.delta = this.charlie;
        bVar.echo = this.delta;
        bVar.foxtrot = Long.valueOf(this.echo);
        bVar.golf = Long.valueOf(this.foxtrot);
        bVar.hotel = this.golf;
        return bVar;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof C2019a) {
                C2019a c2019a = (C2019a) obj;
                String str = this.alpha;
                if (str == null) {
                    if (c2019a.alpha != null) {
                        return false;
                    }
                } else if (!str.equals(c2019a.alpha)) {
                    return false;
                }
                if (q.bravo(this.bravo, c2019a.bravo)) {
                    String str2 = c2019a.charlie;
                    String str3 = this.charlie;
                    if (str3 == null) {
                        if (str2 != null) {
                            return false;
                        }
                    } else if (!str3.equals(str2)) {
                        return false;
                    }
                    String str4 = c2019a.delta;
                    String str5 = this.delta;
                    if (str5 == null) {
                        if (str4 != null) {
                            return false;
                        }
                    } else if (!str5.equals(str4)) {
                        return false;
                    }
                    if (this.echo == c2019a.echo && this.foxtrot == c2019a.foxtrot) {
                        String str6 = c2019a.golf;
                        String str7 = this.golf;
                        if (str7 == null) {
                            if (str6 == null) {
                                return true;
                            }
                            return false;
                        }
                        if (str7.equals(str6)) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int i4 = 0;
        String str = this.alpha;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int mike = (((hashCode ^ 1000003) * 1000003) ^ q.mike(this.bravo)) * 1000003;
        String str2 = this.charlie;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i5 = (mike ^ hashCode2) * 1000003;
        String str3 = this.delta;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int i10 = (i5 ^ hashCode3) * 1000003;
        long j5 = this.echo;
        int i11 = (i10 ^ ((int) (j5 ^ (j5 >>> 32)))) * 1000003;
        long j6 = this.foxtrot;
        int i12 = (i11 ^ ((int) (j6 ^ (j6 >>> 32)))) * 1000003;
        String str4 = this.golf;
        if (str4 != null) {
            i4 = str4.hashCode();
        }
        return i4 ^ i12;
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("PersistedInstallationEntry{firebaseInstallationId=");
        sb2.append(this.alpha);
        sb2.append(", registrationStatus=");
        int i4 = this.bravo;
        if (i4 != 1) {
            if (i4 != 2) {
                if (i4 != 3) {
                    if (i4 != 4) {
                        if (i4 != 5) {
                            str = BuildConfig.TRAVIS;
                        } else {
                            str = "REGISTER_ERROR";
                        }
                    } else {
                        str = "REGISTERED";
                    }
                } else {
                    str = "UNREGISTERED";
                }
            } else {
                str = "NOT_GENERATED";
            }
        } else {
            str = "ATTEMPT_MIGRATION";
        }
        sb2.append(str);
        sb2.append(", authToken=");
        sb2.append(this.charlie);
        sb2.append(", refreshToken=");
        sb2.append(this.delta);
        sb2.append(", expiresInSecs=");
        sb2.append(this.echo);
        sb2.append(", tokenCreationEpochInSecs=");
        sb2.append(this.foxtrot);
        sb2.append(", fisError=");
        return P0.gold(sb2, this.golf, "}");
    }
}
