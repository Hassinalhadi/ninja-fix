package androidx.media;

import ao.ad;
import java.util.Arrays;

/* loaded from: classes3.dex */
class AudioAttributesImplBase implements AudioAttributesImpl {
    public int alpha = 0;
    public int bravo = 0;
    public int charlie = 0;
    public int delta = -1;

    public final boolean equals(Object obj) {
        int i4;
        if (!(obj instanceof AudioAttributesImplBase)) {
            return false;
        }
        AudioAttributesImplBase audioAttributesImplBase = (AudioAttributesImplBase) obj;
        if (this.bravo == audioAttributesImplBase.bravo) {
            int i5 = this.charlie;
            int i10 = audioAttributesImplBase.charlie;
            int i11 = audioAttributesImplBase.delta;
            if (i11 != -1) {
                i4 = i11;
            } else {
                int i12 = audioAttributesImplBase.alpha;
                int i13 = AudioAttributesCompat.bravo;
                if ((i10 & 1) == 1) {
                    i4 = 7;
                } else if ((i10 & 4) == 4) {
                    i4 = 6;
                } else {
                    switch (i12) {
                        case 2:
                            i4 = 0;
                            break;
                        case 3:
                            i4 = 8;
                            break;
                        case 4:
                            i4 = 4;
                            break;
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                            i4 = 5;
                            break;
                        case 6:
                            i4 = 2;
                            break;
                        case 11:
                            i4 = 10;
                            break;
                        case 12:
                        default:
                            i4 = 3;
                            break;
                        case 13:
                            i4 = 1;
                            break;
                    }
                }
            }
            if (i4 == 6) {
                i10 |= 4;
            } else if (i4 == 7) {
                i10 |= 1;
            }
            if (i5 == (i10 & 273) && this.alpha == audioAttributesImplBase.alpha && this.delta == i11) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.bravo), Integer.valueOf(this.charlie), Integer.valueOf(this.alpha), Integer.valueOf(this.delta)});
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("AudioAttributesCompat:");
        if (this.delta != -1) {
            sb2.append(" stream=");
            sb2.append(this.delta);
            sb2.append(" derived");
        }
        sb2.append(" usage=");
        int i4 = this.alpha;
        int i5 = AudioAttributesCompat.bravo;
        switch (i4) {
            case 0:
                str = "USAGE_UNKNOWN";
                break;
            case 1:
                str = "USAGE_MEDIA";
                break;
            case 2:
                str = "USAGE_VOICE_COMMUNICATION";
                break;
            case 3:
                str = "USAGE_VOICE_COMMUNICATION_SIGNALLING";
                break;
            case 4:
                str = "USAGE_ALARM";
                break;
            case 5:
                str = "USAGE_NOTIFICATION";
                break;
            case 6:
                str = "USAGE_NOTIFICATION_RINGTONE";
                break;
            case 7:
                str = "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
                break;
            case 8:
                str = "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
                break;
            case 9:
                str = "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
                break;
            case 10:
                str = "USAGE_NOTIFICATION_EVENT";
                break;
            case 11:
                str = "USAGE_ASSISTANCE_ACCESSIBILITY";
                break;
            case 12:
                str = "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
                break;
            case 13:
                str = "USAGE_ASSISTANCE_SONIFICATION";
                break;
            case 14:
                str = "USAGE_GAME";
                break;
            case 15:
            default:
                str = ad.zulu(i4, "unknown usage ");
                break;
            case 16:
                str = "USAGE_ASSISTANT";
                break;
        }
        sb2.append(str);
        sb2.append(" content=");
        sb2.append(this.bravo);
        sb2.append(" flags=0x");
        sb2.append(Integer.toHexString(this.charlie).toUpperCase());
        return sb2.toString();
    }
}
