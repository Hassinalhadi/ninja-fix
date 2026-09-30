package D5;

import androidx.appcompat.widget.P0;

/* loaded from: classes3.dex */
public final class l extends a {
    public final Integer alpha;
    public final String bravo;
    public final String charlie;
    public final String delta;
    public final String echo;
    public final String foxtrot;
    public final String golf;
    public final String hotel;
    public final String india;
    public final String juliet;
    public final String kilo;
    public final String lima;

    public l(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11) {
        this.alpha = num;
        this.bravo = str;
        this.charlie = str2;
        this.delta = str3;
        this.echo = str4;
        this.foxtrot = str5;
        this.golf = str6;
        this.hotel = str7;
        this.india = str8;
        this.juliet = str9;
        this.kilo = str10;
        this.lima = str11;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof a) {
            a aVar = (a) obj;
            Integer num = this.alpha;
            if (num != null ? num.equals(((l) aVar).alpha) : ((l) aVar).alpha == null) {
                String str = this.bravo;
                if (str != null ? str.equals(((l) aVar).bravo) : ((l) aVar).bravo == null) {
                    String str2 = this.charlie;
                    if (str2 != null ? str2.equals(((l) aVar).charlie) : ((l) aVar).charlie == null) {
                        String str3 = this.delta;
                        if (str3 != null ? str3.equals(((l) aVar).delta) : ((l) aVar).delta == null) {
                            String str4 = this.echo;
                            if (str4 != null ? str4.equals(((l) aVar).echo) : ((l) aVar).echo == null) {
                                String str5 = this.foxtrot;
                                if (str5 != null ? str5.equals(((l) aVar).foxtrot) : ((l) aVar).foxtrot == null) {
                                    String str6 = this.golf;
                                    if (str6 != null ? str6.equals(((l) aVar).golf) : ((l) aVar).golf == null) {
                                        String str7 = this.hotel;
                                        if (str7 != null ? str7.equals(((l) aVar).hotel) : ((l) aVar).hotel == null) {
                                            String str8 = this.india;
                                            if (str8 != null ? str8.equals(((l) aVar).india) : ((l) aVar).india == null) {
                                                String str9 = this.juliet;
                                                if (str9 != null ? str9.equals(((l) aVar).juliet) : ((l) aVar).juliet == null) {
                                                    String str10 = this.kilo;
                                                    if (str10 != null ? str10.equals(((l) aVar).kilo) : ((l) aVar).kilo == null) {
                                                        String str11 = this.lima;
                                                        if (str11 != null ? str11.equals(((l) aVar).lima) : ((l) aVar).lima == null) {
                                                            return true;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        int hashCode9;
        int hashCode10;
        int hashCode11;
        int i4 = 0;
        Integer num = this.alpha;
        if (num == null) {
            hashCode = 0;
        } else {
            hashCode = num.hashCode();
        }
        int i5 = (hashCode ^ 1000003) * 1000003;
        String str = this.bravo;
        if (str == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = str.hashCode();
        }
        int i10 = (i5 ^ hashCode2) * 1000003;
        String str2 = this.charlie;
        if (str2 == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = str2.hashCode();
        }
        int i11 = (i10 ^ hashCode3) * 1000003;
        String str3 = this.delta;
        if (str3 == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = str3.hashCode();
        }
        int i12 = (i11 ^ hashCode4) * 1000003;
        String str4 = this.echo;
        if (str4 == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = str4.hashCode();
        }
        int i13 = (i12 ^ hashCode5) * 1000003;
        String str5 = this.foxtrot;
        if (str5 == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = str5.hashCode();
        }
        int i14 = (i13 ^ hashCode6) * 1000003;
        String str6 = this.golf;
        if (str6 == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = str6.hashCode();
        }
        int i15 = (i14 ^ hashCode7) * 1000003;
        String str7 = this.hotel;
        if (str7 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = str7.hashCode();
        }
        int i16 = (i15 ^ hashCode8) * 1000003;
        String str8 = this.india;
        if (str8 == null) {
            hashCode9 = 0;
        } else {
            hashCode9 = str8.hashCode();
        }
        int i17 = (i16 ^ hashCode9) * 1000003;
        String str9 = this.juliet;
        if (str9 == null) {
            hashCode10 = 0;
        } else {
            hashCode10 = str9.hashCode();
        }
        int i18 = (i17 ^ hashCode10) * 1000003;
        String str10 = this.kilo;
        if (str10 == null) {
            hashCode11 = 0;
        } else {
            hashCode11 = str10.hashCode();
        }
        int i19 = (i18 ^ hashCode11) * 1000003;
        String str11 = this.lima;
        if (str11 != null) {
            i4 = str11.hashCode();
        }
        return i4 ^ i19;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AndroidClientInfo{sdkVersion=");
        sb2.append(this.alpha);
        sb2.append(", model=");
        sb2.append(this.bravo);
        sb2.append(", hardware=");
        sb2.append(this.charlie);
        sb2.append(", device=");
        sb2.append(this.delta);
        sb2.append(", product=");
        sb2.append(this.echo);
        sb2.append(", osBuild=");
        sb2.append(this.foxtrot);
        sb2.append(", manufacturer=");
        sb2.append(this.golf);
        sb2.append(", fingerprint=");
        sb2.append(this.hotel);
        sb2.append(", locale=");
        sb2.append(this.india);
        sb2.append(", country=");
        sb2.append(this.juliet);
        sb2.append(", mccMnc=");
        sb2.append(this.kilo);
        sb2.append(", applicationBuild=");
        return P0.gold(sb2, this.lima, "}");
    }
}
