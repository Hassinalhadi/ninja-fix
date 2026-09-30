package com.airbnb.lottie.animation;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import com.airbnb.lottie.utils.MiscUtils;

/* loaded from: classes3.dex */
public class LPaint extends Paint {
    public LPaint() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i4) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((MiscUtils.clamp(i4, 0, 255) << 24) | (getColor() & 16777215));
        } else {
            super.setAlpha(MiscUtils.clamp(i4, 0, 255));
        }
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public LPaint(int i4) {
        super(i4);
    }

    public LPaint(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public LPaint(int i4, PorterDuff.Mode mode) {
        super(i4);
        setXfermode(new PorterDuffXfermode(mode));
    }
}
