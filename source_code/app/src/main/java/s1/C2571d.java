package s1;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import androidx.appcompat.widget.P0;
import s6.T7;

/* renamed from: s1.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2571d implements InterfaceC2570c, InterfaceC2572e {
    public final /* synthetic */ int alpha = 0;
    public ClipData purple;
    public int red;
    public int silver;
    public Uri teal;
    public Bundle white;

    public /* synthetic */ C2571d() {
    }

    @Override // s1.InterfaceC2572e
    public ClipData bravo() {
        return this.purple;
    }

    @Override // s1.InterfaceC2570c
    /* renamed from: build */
    public C2573f mo202build() {
        return new C2573f(new C2571d(this));
    }

    @Override // s1.InterfaceC2570c
    public void charlie(Bundle bundle) {
        this.white = bundle;
    }

    @Override // s1.InterfaceC2572e
    public int echo() {
        return this.red;
    }

    @Override // s1.InterfaceC2570c
    public void golf(Uri uri) {
        this.teal = uri;
    }

    @Override // s1.InterfaceC2570c
    public void mike(int i4) {
        this.silver = i4;
    }

    @Override // s1.InterfaceC2572e
    public int november() {
        return this.silver;
    }

    @Override // s1.InterfaceC2572e
    public ContentInfo oscar() {
        return null;
    }

    public String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.alpha) {
            case 1:
                StringBuilder sb2 = new StringBuilder("ContentInfoCompat{clip=");
                sb2.append(this.purple.getDescription());
                sb2.append(", source=");
                int i4 = this.red;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    if (i4 != 5) {
                                        str = String.valueOf(i4);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb2.append(str);
                sb2.append(", flags=");
                int i5 = this.silver;
                if ((i5 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i5);
                }
                sb2.append(valueOf);
                String str3 = "";
                Uri uri = this.teal;
                if (uri == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb2.append(str2);
                if (this.white != null) {
                    str3 = ", hasExtras";
                }
                return P0.gold(sb2, str3, "}");
            default:
                return super.toString();
        }
    }

    public C2571d(C2571d c2571d) {
        ClipData clipData = c2571d.purple;
        clipData.getClass();
        this.purple = clipData;
        int i4 = c2571d.red;
        T7.delta(i4, 0, 5, "source");
        this.red = i4;
        int i5 = c2571d.silver;
        if ((i5 & 1) == i5) {
            this.silver = i5;
            this.teal = c2571d.teal;
            this.white = c2571d.white;
        } else {
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i5) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        }
    }
}
