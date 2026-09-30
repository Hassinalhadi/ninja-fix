package K1;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.view.inputmethod.EditorInfo;
import com.airbnb.lottie.compose.LottieConstants;
import id.C1915c;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import s6.T7;

/* loaded from: classes3.dex */
public final class k {
    public static final Object juliet = new Object();
    public static volatile k kilo;
    public final ReentrantReadWriteLock alpha;
    public final bv.f bravo;
    public volatile int charlie;
    public final Handler delta;
    public final f echo;
    public final j foxtrot;
    public final W8.a golf;
    public final int hotel;
    public final d india;

    public k(u uVar) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.alpha = reentrantReadWriteLock;
        this.charlie = 3;
        j jVar = (j) uVar.bravo;
        this.foxtrot = jVar;
        int i4 = uVar.alpha;
        this.hotel = i4;
        this.india = (d) uVar.charlie;
        this.delta = new Handler(Looper.getMainLooper());
        this.bravo = new bv.f(0);
        this.golf = new W8.a(5);
        f fVar = new f(this);
        this.echo = fVar;
        reentrantReadWriteLock.writeLock().lock();
        if (i4 == 0) {
            try {
                this.charlie = 0;
            } catch (Throwable th) {
                this.alpha.writeLock().unlock();
                throw th;
            }
        }
        reentrantReadWriteLock.writeLock().unlock();
        if (charlie() == 0) {
            try {
                jVar.charlie(new e(fVar));
            } catch (Throwable th2) {
                foxtrot(th2);
            }
        }
    }

    public static k alpha() {
        k kVar;
        boolean z2;
        synchronized (juliet) {
            kVar = kilo;
            if (kVar != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            T7.golf("EmojiCompat is not initialized.\n\nYou must initialize EmojiCompat prior to referencing the EmojiCompat instance.\n\nThe most likely cause of this error is disabling the EmojiCompatInitializer\neither explicitly in AndroidManifest.xml, or by including\nandroidx.emoji2:emoji2-bundled.\n\nAutomatic initialization is typically performed by EmojiCompatInitializer. If\nyou are not expecting to initialize EmojiCompat manually in your application,\nplease check to ensure it has not been removed from your APK's manifest. You can\ndo this in Android Studio using Build > Analyze APK.\n\nIn the APK Analyzer, ensure that the startup entry for\nEmojiCompatInitializer and InitializationProvider is present in\n AndroidManifest.xml. If it is missing or contains tools:node=\"remove\", and you\nintend to use automatic configuration, verify:\n\n  1. Your application does not include emoji2-bundled\n  2. All modules do not contain an exclusion manifest rule for\n     EmojiCompatInitializer or InitializationProvider. For more information\n     about manifest exclusions see the documentation for the androidx startup\n     library.\n\nIf you intend to use emoji2-bundled, please call EmojiCompat.init. You can\nlearn more in the documentation for BundledEmojiCompatConfig.\n\nIf you intended to perform manual configuration, it is recommended that you call\nEmojiCompat.init immediately on application startup.\n\nIf you still cannot resolve this issue, please open a bug with your specific\nconfiguration to help improve error message.", z2);
        }
        return kVar;
    }

    public static boolean delta() {
        if (kilo != null) {
            return true;
        }
        return false;
    }

    public final int bravo(CharSequence charSequence, int i4) {
        boolean z2 = true;
        if (charlie() != 1) {
            z2 = false;
        }
        T7.golf("Not initialized yet", z2);
        T7.foxtrot(charSequence, "charSequence cannot be null");
        C1915c c1915c = (C1915c) this.echo.alpha;
        c1915c.getClass();
        if (i4 >= 0 && i4 < charSequence.length()) {
            if (charSequence instanceof Spanned) {
                Spanned spanned = (Spanned) charSequence;
                z[] zVarArr = (z[]) spanned.getSpans(i4, i4 + 1, z.class);
                if (zVarArr.length > 0) {
                    return spanned.getSpanStart(zVarArr[0]);
                }
            }
            return ((q) c1915c.whiskey(charSequence, Math.max(0, i4 - 16), Math.min(charSequence.length(), i4 + 16), LottieConstants.IterateForever, true, new q(i4))).purple;
        }
        return -1;
    }

    public final int charlie() {
        this.alpha.readLock().lock();
        try {
            return this.charlie;
        } finally {
            this.alpha.readLock().unlock();
        }
    }

    public final void echo() {
        boolean z2;
        if (this.hotel == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("Set metadataLoadStrategy to LOAD_STRATEGY_MANUAL to execute manual loading", z2);
        if (charlie() != 1) {
            this.alpha.writeLock().lock();
            try {
                if (this.charlie == 0) {
                    return;
                }
                this.charlie = 0;
                this.alpha.writeLock().unlock();
                f fVar = this.echo;
                k kVar = (k) fVar.charlie;
                try {
                    kVar.foxtrot.charlie(new e(fVar));
                } catch (Throwable th) {
                    kVar.foxtrot(th);
                }
            } finally {
                this.alpha.writeLock().unlock();
            }
        }
    }

    public final void foxtrot(Throwable th) {
        ArrayList arrayList = new ArrayList();
        this.alpha.writeLock().lock();
        try {
            this.charlie = 2;
            arrayList.addAll(this.bravo);
            this.bravo.clear();
            this.alpha.writeLock().unlock();
            this.delta.post(new i(arrayList, this.charlie, th));
        } catch (Throwable th2) {
            this.alpha.writeLock().unlock();
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00ab A[Catch: all -> 0x008e, TryCatch #2 {all -> 0x008e, blocks: (B:79:0x0066, B:82:0x006b, B:84:0x006f, B:86:0x007c, B:32:0x009b, B:34:0x00a5, B:36:0x00a8, B:38:0x00ab, B:40:0x00bb, B:41:0x00be), top: B:78:0x0066 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:50:? A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, K1.ab] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final CharSequence golf(int i4, int i5, int i10, CharSequence charSequence) {
        boolean z2;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        CharSequence charSequence2;
        Throwable th;
        int i11;
        int i12;
        z[] zVarArr;
        if (charlie() == 1) {
            z2 = true;
        } else {
            z2 = false;
        }
        T7.golf("Not initialized yet", z2);
        if (i4 >= 0) {
            if (i5 >= 0) {
                if (i4 <= i5) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T7.bravo("start should be <= than end", z10);
                ab abVar = null;
                abVar = null;
                if (charSequence == null) {
                    return null;
                }
                if (i4 <= charSequence.length()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                T7.bravo("start should be < than charSequence length", z11);
                if (i5 <= charSequence.length()) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                T7.bravo("end should be < than charSequence length", z12);
                if (charSequence.length() == 0 || i4 == i5) {
                    return charSequence;
                }
                if (i10 != 1) {
                    z13 = false;
                } else {
                    z13 = true;
                }
                C1915c c1915c = (C1915c) this.echo.alpha;
                c1915c.getClass();
                boolean z14 = charSequence instanceof x;
                if (z14) {
                    ((x) charSequence).alpha();
                }
                try {
                    if (!z14) {
                        try {
                            if (!(charSequence instanceof Spannable)) {
                                if ((charSequence instanceof Spanned) && ((Spanned) charSequence).nextSpanTransition(i4 - 1, i5 + 1, z.class) <= i5) {
                                    ?? obj = new Object();
                                    obj.alpha = false;
                                    obj.purple = new SpannableString(charSequence);
                                    abVar = obj;
                                }
                                if (abVar != null && (zVarArr = (z[]) abVar.purple.getSpans(i4, i5, z.class)) != null && zVarArr.length > 0) {
                                    for (z zVar : zVarArr) {
                                        int spanStart = abVar.purple.getSpanStart(zVar);
                                        int spanEnd = abVar.purple.getSpanEnd(zVar);
                                        if (spanStart != i5) {
                                            abVar.removeSpan(zVar);
                                        }
                                        i4 = Math.min(spanStart, i4);
                                        i5 = Math.max(spanEnd, i5);
                                    }
                                }
                                i11 = i4;
                                i12 = i5;
                                if (i11 != i12 || i11 >= charSequence.length()) {
                                    charSequence2 = charSequence;
                                    if (!z14) {
                                        return charSequence2;
                                    }
                                } else {
                                    charSequence2 = charSequence;
                                    try {
                                        ab abVar2 = (ab) c1915c.whiskey(charSequence2, i11, i12, LottieConstants.IterateForever, z13, new J2.e(10, abVar, (W8.a) c1915c.purple));
                                        if (abVar2 != null) {
                                            Spannable spannable = abVar2.purple;
                                            if (z14) {
                                                ((x) charSequence2).bravo();
                                            }
                                            return spannable;
                                        }
                                        if (!z14) {
                                            return charSequence2;
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        th = th;
                                        if (z14) {
                                            ((x) charSequence2).bravo();
                                            throw th;
                                        }
                                        throw th;
                                    }
                                }
                                ((x) charSequence2).bravo();
                                return charSequence2;
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            charSequence2 = charSequence;
                            if (z14) {
                            }
                        }
                    }
                    abVar = new ab((Spannable) charSequence);
                    if (abVar != null) {
                        while (r1 < r3) {
                        }
                    }
                    i11 = i4;
                    i12 = i5;
                    if (i11 != i12) {
                    }
                    charSequence2 = charSequence;
                    if (!z14) {
                    }
                    ((x) charSequence2).bravo();
                    return charSequence2;
                } catch (Throwable th4) {
                    th = th4;
                    charSequence2 = charSequence;
                    th = th;
                    if (z14) {
                    }
                }
            } else {
                throw new IllegalArgumentException("end cannot be negative");
            }
        } else {
            throw new IllegalArgumentException("start cannot be negative");
        }
    }

    public final void hotel(h hVar) {
        T7.foxtrot(hVar, "initCallback cannot be null");
        this.alpha.writeLock().lock();
        try {
            if (this.charlie != 1 && this.charlie != 2) {
                this.bravo.add(hVar);
                this.alpha.writeLock().unlock();
            }
            this.delta.post(new i(Arrays.asList(hVar), this.charlie, (Throwable) null));
            this.alpha.writeLock().unlock();
        } catch (Throwable th) {
            this.alpha.writeLock().unlock();
            throw th;
        }
    }

    public final void india(EditorInfo editorInfo) {
        int i4;
        if (charlie() != 1 || editorInfo == null) {
            return;
        }
        if (editorInfo.extras == null) {
            editorInfo.extras = new Bundle();
        }
        f fVar = this.echo;
        fVar.getClass();
        Bundle bundle = editorInfo.extras;
        androidx.emoji2.text.flatbuffer.b bVar = (androidx.emoji2.text.flatbuffer.b) ((com.google.firebase.messaging.o) fVar.bravo).alpha;
        int alpha = bVar.alpha(4);
        if (alpha != 0) {
            i4 = ((ByteBuffer) bVar.silver).getInt(alpha + bVar.alpha);
        } else {
            i4 = 0;
        }
        bundle.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i4);
        Bundle bundle2 = editorInfo.extras;
        ((k) fVar.charlie).getClass();
        bundle2.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
    }
}
