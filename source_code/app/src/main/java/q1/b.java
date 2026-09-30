package q1;

import Pf.j;
import android.text.SpannableStringBuilder;

/* loaded from: classes3.dex */
public final class b {
    public static final String bravo;
    public static final String charlie;
    public static final b delta;
    public static final b echo;
    public final boolean alpha;

    static {
        j jVar = g.charlie;
        bravo = Character.toString((char) 8206);
        charlie = Character.toString((char) 8207);
        delta = new b(false);
        echo = new b(true);
    }

    public b(boolean z2) {
        j jVar = g.alpha;
        this.alpha = z2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0085, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x006e, code lost:
    
        if (r1 != 0) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0071, code lost:
    
        if (r2 == 0) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0073, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0076, code lost:
    
        if (r0.charlie <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x007c, code lost:
    
        switch(r0.alpha()) {
            case 14: goto L66;
            case 15: goto L66;
            case 16: goto L65;
            case 17: goto L65;
            case 18: goto L64;
            default: goto L70;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0080, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0083, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0089, code lost:
    
        if (r1 != r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x008c, code lost:
    
        return 0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int alpha(CharSequence charSequence) {
        byte directionality;
        C2405a c2405a = new C2405a(charSequence);
        c2405a.charlie = 0;
        int i4 = 0;
        int i5 = 0;
        int i10 = 0;
        while (true) {
            int i11 = c2405a.charlie;
            if (i11 < c2405a.bravo && i4 == 0) {
                CharSequence charSequence2 = c2405a.alpha;
                char charAt = charSequence2.charAt(i11);
                c2405a.delta = charAt;
                if (Character.isHighSurrogate(charAt)) {
                    int codePointAt = Character.codePointAt(charSequence2, c2405a.charlie);
                    c2405a.charlie = Character.charCount(codePointAt) + c2405a.charlie;
                    directionality = Character.getDirectionality(codePointAt);
                } else {
                    c2405a.charlie++;
                    char c3 = c2405a.delta;
                    if (c3 < 1792) {
                        directionality = C2405a.echo[c3];
                    } else {
                        directionality = Character.getDirectionality(c3);
                    }
                }
                if (directionality != 0) {
                    if (directionality != 1 && directionality != 2) {
                        if (directionality != 9) {
                            switch (directionality) {
                                case 14:
                                case 15:
                                    i10++;
                                    i5 = -1;
                                    continue;
                                case 16:
                                case 17:
                                    i10++;
                                    i5 = 1;
                                    continue;
                                case 18:
                                    i10--;
                                    i5 = 0;
                                    continue;
                            }
                        }
                    } else if (i10 == 0) {
                    }
                } else if (i10 == 0) {
                }
                i4 = i10;
            }
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0034, code lost:
    
        return 1;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:33:0x0020. Please report as an issue. */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int bravo(CharSequence charSequence) {
        C2405a c2405a = new C2405a(charSequence);
        c2405a.charlie = c2405a.bravo;
        int i4 = 0;
        while (true) {
            int i5 = i4;
            while (c2405a.charlie > 0) {
                byte alpha = c2405a.alpha();
                if (alpha != 0) {
                    if (alpha != 1 && alpha != 2) {
                        if (alpha != 9) {
                            switch (alpha) {
                                case 14:
                                case 15:
                                    if (i5 == i4) {
                                        return -1;
                                    }
                                    i4--;
                                    break;
                                case 16:
                                case 17:
                                    if (i5 == i4) {
                                        break;
                                    }
                                    i4--;
                                    break;
                                case 18:
                                    i4++;
                                    break;
                                default:
                                    if (i5 != 0) {
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                            }
                        } else {
                            continue;
                        }
                    } else if (i4 != 0) {
                        if (i5 == 0) {
                            break;
                        }
                    }
                } else {
                    if (i4 == 0) {
                        return -1;
                    }
                    if (i5 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final SpannableStringBuilder charlie(CharSequence charSequence) {
        j jVar;
        String str;
        j jVar2;
        char c3;
        j jVar3 = g.charlie;
        if (charSequence == null) {
            return null;
        }
        boolean golf = jVar3.golf(charSequence, charSequence.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (golf) {
            jVar = g.bravo;
        } else {
            jVar = g.alpha;
        }
        boolean golf2 = jVar.golf(charSequence, charSequence.length());
        String str2 = "";
        String str3 = charlie;
        String str4 = bravo;
        boolean z2 = this.alpha;
        if (!z2 && (golf2 || alpha(charSequence) == 1)) {
            str = str4;
        } else if (!z2 || (golf2 && alpha(charSequence) != -1)) {
            str = "";
        } else {
            str = str3;
        }
        spannableStringBuilder.append((CharSequence) str);
        if (golf != z2) {
            if (golf) {
                c3 = 8235;
            } else {
                c3 = 8234;
            }
            spannableStringBuilder.append(c3);
            spannableStringBuilder.append(charSequence);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append(charSequence);
        }
        if (golf) {
            jVar2 = g.bravo;
        } else {
            jVar2 = g.alpha;
        }
        boolean golf3 = jVar2.golf(charSequence, charSequence.length());
        if (!z2 && (golf3 || bravo(charSequence) == 1)) {
            str2 = str4;
        } else if (z2 && (!golf3 || bravo(charSequence) == -1)) {
            str2 = str3;
        }
        spannableStringBuilder.append((CharSequence) str2);
        return spannableStringBuilder;
    }
}
