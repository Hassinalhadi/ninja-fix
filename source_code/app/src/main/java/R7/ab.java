package R7;

/* loaded from: classes2.dex */
public final class ab extends o0 {
    public final String bravo;
    public final String charlie;
    public final int delta;
    public final String echo;
    public final String foxtrot;
    public final String golf;
    public final String hotel;
    public final String india;
    public final String juliet;
    public final aj kilo;
    public final ag lima;
    public final ad mike;

    public ab(String str, String str2, int i4, String str3, String str4, String str5, String str6, String str7, String str8, aj ajVar, ag agVar, ad adVar) {
        this.bravo = str;
        this.charlie = str2;
        this.delta = i4;
        this.echo = str3;
        this.foxtrot = str4;
        this.golf = str5;
        this.hotel = str6;
        this.india = str7;
        this.juliet = str8;
        this.kilo = ajVar;
        this.lima = agVar;
        this.mike = adVar;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [R7.aa, java.lang.Object] */
    public final aa alpha() {
        ?? obj = new Object();
        obj.alpha = this.bravo;
        obj.bravo = this.charlie;
        obj.charlie = this.delta;
        obj.delta = this.echo;
        obj.echo = this.foxtrot;
        obj.foxtrot = this.golf;
        obj.golf = this.hotel;
        obj.hotel = this.india;
        obj.india = this.juliet;
        obj.juliet = this.kilo;
        obj.kilo = this.lima;
        obj.lima = this.mike;
        obj.mike = (byte) 1;
        return obj;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof o0) {
                ab abVar = (ab) ((o0) obj);
                if (this.bravo.equals(abVar.bravo)) {
                    if (this.charlie.equals(abVar.charlie) && this.delta == abVar.delta && this.echo.equals(abVar.echo)) {
                        String str = abVar.foxtrot;
                        String str2 = this.foxtrot;
                        if (str2 == null) {
                            if (str != null) {
                                return false;
                            }
                        } else if (!str2.equals(str)) {
                            return false;
                        }
                        String str3 = abVar.golf;
                        String str4 = this.golf;
                        if (str4 == null) {
                            if (str3 != null) {
                                return false;
                            }
                        } else if (!str4.equals(str3)) {
                            return false;
                        }
                        String str5 = abVar.hotel;
                        String str6 = this.hotel;
                        if (str6 == null) {
                            if (str5 != null) {
                                return false;
                            }
                        } else if (!str6.equals(str5)) {
                            return false;
                        }
                        if (this.india.equals(abVar.india) && this.juliet.equals(abVar.juliet)) {
                            aj ajVar = abVar.kilo;
                            aj ajVar2 = this.kilo;
                            if (ajVar2 == null) {
                                if (ajVar != null) {
                                    return false;
                                }
                            } else if (!ajVar2.equals(ajVar)) {
                                return false;
                            }
                            ag agVar = abVar.lima;
                            ag agVar2 = this.lima;
                            if (agVar2 == null) {
                                if (agVar != null) {
                                    return false;
                                }
                            } else if (!agVar2.equals(agVar)) {
                                return false;
                            }
                            ad adVar = abVar.mike;
                            ad adVar2 = this.mike;
                            if (adVar2 == null) {
                                if (adVar == null) {
                                    return true;
                                }
                                return false;
                            }
                            if (adVar2.equals(adVar)) {
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
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6 = (((((((this.bravo.hashCode() ^ 1000003) * 1000003) ^ this.charlie.hashCode()) * 1000003) ^ this.delta) * 1000003) ^ this.echo.hashCode()) * 1000003;
        int i4 = 0;
        String str = this.foxtrot;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int i5 = (hashCode6 ^ hashCode) * 1000003;
        String str2 = this.golf;
        if (str2 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str2.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        String str3 = this.hotel;
        if (str3 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str3.hashCode();
        }
        int hashCode7 = (((((i10 ^ hashCode3) * 1000003) ^ this.india.hashCode()) * 1000003) ^ this.juliet.hashCode()) * 1000003;
        aj ajVar = this.kilo;
        if (ajVar == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = ajVar.hashCode();
        }
        int i11 = (hashCode7 ^ hashCode4) * 1000003;
        ag agVar = this.lima;
        if (agVar == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = agVar.hashCode();
        }
        int i12 = (i11 ^ hashCode5) * 1000003;
        ad adVar = this.mike;
        if (adVar != null) {
            i4 = adVar.hashCode();
        }
        return i12 ^ i4;
    }

    public final String toString() {
        return "CrashlyticsReport{sdkVersion=" + this.bravo + ", gmpAppId=" + this.charlie + ", platform=" + this.delta + ", installationUuid=" + this.echo + ", firebaseInstallationId=" + this.foxtrot + ", firebaseAuthenticationToken=" + this.golf + ", appQualitySessionId=" + this.hotel + ", buildVersion=" + this.india + ", displayVersion=" + this.juliet + ", session=" + this.kilo + ", ndkPayload=" + this.lima + ", appExitInfo=" + this.mike + "}";
    }
}
