package com.bumptech.glide.load.resource.bitmap;

import android.os.Build;
import android.util.Log;
import com.zendesk.service.HttpConstants;
import java.io.File;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class u {
    public static final boolean echo;
    public static final boolean foxtrot;
    public static final File golf;
    public static volatile u hotel;
    public int bravo;
    public boolean charlie = true;
    public final AtomicBoolean delta = new AtomicBoolean(false);
    public final int alpha = 20000;

    static {
        boolean z2;
        int i4 = Build.VERSION.SDK_INT;
        boolean z10 = false;
        if (i4 < 29) {
            z2 = true;
        } else {
            z2 = false;
        }
        echo = z2;
        if (i4 >= 28) {
            z10 = true;
        }
        foxtrot = z10;
        golf = new File("/proc/self/fd");
    }

    public static u alpha() {
        if (hotel == null) {
            synchronized (u.class) {
                try {
                    if (hotel == null) {
                        hotel = new u();
                    }
                } finally {
                }
            }
        }
        return hotel;
    }

    public final int bravo() {
        if (Build.VERSION.SDK_INT == 28) {
            Iterator it = Arrays.asList("GM1900", "GM1901", "GM1903", "GM1911", "GM1915", "ONEPLUS A3000", "ONEPLUS A3010", "ONEPLUS A5010", "ONEPLUS A5000", "ONEPLUS A3003", "ONEPLUS A6000", "ONEPLUS A6003", "ONEPLUS A6010", "ONEPLUS A6013").iterator();
            while (it.hasNext()) {
                if (Build.MODEL.startsWith((String) it.next())) {
                    return HttpConstants.HTTP_INTERNAL_ERROR;
                }
            }
        }
        return this.alpha;
    }

    public final boolean charlie(int i4, int i5, boolean z2, boolean z10) {
        boolean z11;
        boolean z12;
        if (!z2) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by caller");
                return false;
            }
        } else if (!foxtrot) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by sdk");
                return false;
            }
        } else if (echo && !this.delta.get()) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed by app state");
                return false;
            }
        } else if (z10) {
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because exif orientation is required");
                return false;
            }
        } else if (i4 >= 0 && i5 >= 0) {
            synchronized (this) {
                try {
                    int i10 = this.bravo + 1;
                    this.bravo = i10;
                    if (i10 >= 50) {
                        this.bravo = 0;
                        int length = golf.list().length;
                        long bravo = bravo();
                        if (length < bravo) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        this.charlie = z12;
                        if (!z12 && Log.isLoggable("Downsampler", 5)) {
                            Log.w("Downsampler", "Excluding HARDWARE bitmap config because we're over the file descriptor limit, file descriptors " + length + ", limit " + bravo);
                        }
                    }
                    z11 = this.charlie;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (z11) {
                return true;
            }
            if (Log.isLoggable("HardwareConfig", 2)) {
                Log.v("HardwareConfig", "Hardware config disallowed because there are insufficient FDs");
                return false;
            }
        } else if (Log.isLoggable("HardwareConfig", 2)) {
            Log.v("HardwareConfig", "Hardware config disallowed because of invalid dimensions");
        }
        return false;
    }
}
